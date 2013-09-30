package service

import securesocial.core._
import play.api.{Logger,Application}
import securesocial.core.providers.Token
import play.api.libs.json._
import play.api.libs.json.Reads._
import play.api.libs.json.Writes._
import securesocial.core.IdentityId
import securesocial.core.providers.Token
import play.modules.reactivemongo.MongoController
import play.api.mvc.Controller
import play.modules.reactivemongo.json.collection.JSONCollection
import scala.concurrent.Await
import scala.concurrent.duration._

/**
 * Created with IntelliJ IDEA.
 * User: shrikar
 * Date: 9/29/13
 * Time: 2:22 PM
 * To change this template use File | Settings | File Templates.
 */
class MongoUserService(application: Application) extends UserServicePlugin(application) with Controller with MongoController{
  private var users = Map[String, Identity]()
  private var tokens = Map[String, Token]()
  def collection: JSONCollection = db.collection[JSONCollection]("users")

  val outPutUser = (__ \ "id").json.prune

  def retIdentity(json : JsObject) : Identity = {
    val userid = (json \ "userid").as[String]

    val provider = (json \ "provider").as[String]
    val firstname = (json \ "firstname").as[String]
    val lastname = (json \ "lastname").as[String]
    val email = (json \ "email").as[String]
    val avatar = (json \ "avatar").as[String]
    val hash = (json \ "password" \ "hasher").as[String]
    val password = ( json \ "password" \ "password").as[String]
    println("password : "+ password)
    val salt = (json \ "password" \ "salt").asOpt[String]
    println("salt : "+ salt)
    val authmethod = ( json \ "authmethod").as[String]

    val identity : IdentityId = new IdentityId("shrikar84@gmail.com","userpass")
    val authMethod : AuthenticationMethod = new AuthenticationMethod(authmethod)
    val pwdInfo: PasswordInfo = new PasswordInfo(hash,password)
    val user : SocialUser = new SocialUser(identity,firstname,lastname,firstname,Some(email),Some(avatar),authMethod,None,None,Some(pwdInfo))
    user
  }

  def findByEmailAndProvider(email: String, providerId: String): Option[Identity] = {
    println("#### wtf  " + email + " " + providerId)
    val cursor  = collection.find(Json.obj("userid"->email,"provider"->providerId)).cursor[JsObject]
    val x = cursor.headOption.map{
      case Some(user) => user
      case None => false
    }
    val jobj = Await.result(x, 5 seconds).asInstanceOf[JsObject]
    Some(retIdentity(jobj))
    //users.values.find( u => u.email.map( e => e == email && u.identityId.providerId == providerId).getOrElse(false))
  }

  def save(user: Identity): Identity = {
    users = users + (user.identityId.userId + user.identityId.providerId -> user)
//    println("User id " + user.identityId.userId)
//    println("Provider " + user.identityId.providerId)
//    println("FirstNAme " + user.firstName)
    val email = user.email match {
      case Some(email) => email
      case _ => "N/A"
    }
//    println("email :" + email)
//    println("Avatar : " + user.avatarUrl)
    val avatar = user.avatarUrl match{
      case Some(url) => url
      case _ => "N/A"
    }
//    println("Authentication method :" + user.authMethod.method)
//    println("Password :" + user.passwordInfo.get.hasher + " " + user.passwordInfo.get.password + " " + user.passwordInfo.get.salt)
    val savejson = Json.obj(
      "userid" -> user.identityId.userId,
      "provider" -> user.identityId.providerId,
      "firstname" -> user.firstName,
      "lastname" -> user.lastName,
      "email" -> email,
      "avatar" -> avatar,
      "authmethod" -> user.authMethod.method,
      "password" -> Json.obj("hasher" -> user.passwordInfo.get.hasher, "password" -> user.passwordInfo.get.password, "salt" -> user.passwordInfo.get.salt)
    )
    println(Json.toJson(savejson))
    collection.insert(savejson)
    user
  }

  def find(id: IdentityId): Option[Identity] = {
    println("wtf finding user " + id.toString)
    val cursor  = collection.find(Json.obj("userid"->id.userId,"provider"->id.providerId)).cursor[JsObject]
    val x = cursor.headOption.map{
      case Some(user) => user
      case None => false
    }
    val jobj = Await.result(x, 5 seconds).asInstanceOf[JsObject]
    println(jobj)
    Some(retIdentity(jobj))
  }

  def save(token: Token) {
    tokens += (token.uuid -> token)
    println("Holy crap saving token  : " + token)
  }

  def findToken(token: String): Option[Token] = {
     println("Holy crap finding token : " + token)
      tokens.get(token)
  }

  def deleteToken(uuid: String) {}

  def deleteExpiredTokens() {}
}
