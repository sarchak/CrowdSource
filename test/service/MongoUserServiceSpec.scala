package service

import play.api.test.FakeApplication
import securesocial.core.providers.Token
import org.joda.time.DateTime
import play.api.libs.json.{Json, JsObject}
import scala.concurrent.{ExecutionContext, Await}
import scala.concurrent.duration._

import org.specs2.mutable._
import play.api.test.Helpers._
import scala.concurrent.duration.DurationInt
import play.api.test.FakeApplication
import play.api.libs.json.JsObject
import securesocial.core.providers.Token

class MongoUserServiceSpec extends Specification {
  import ExecutionContext.Implicits.global

  "UserService" should {
    "save tokens" in fakeApp { service =>
      service.save(testToken)

      val list = Await.result(service.tokens.find(Json.obj()).cursor[JsObject].toList, timeout)

      list.size must equalTo (1)
      list.head.toString must contain("""{"uuid":"1","email":"foo@bar.com","creation_time":{"$date":1},"expiration_time":{"$date":2},"isSignUp":false,"_id":{"$oid":""")
    }
    
    "delete token on request" in fakeApp { service =>
      service.save(testToken)
      service.save(testToken.copy(uuid = "2"))

      service.deleteToken("1")

      val list = Await.result(service.tokens.find(Json.obj()).cursor[JsObject].toList, timeout)

      list.size must equalTo (1)
      list.head.toString must contain(""""uuid":"2"""")
    }

    "delete expired tokens" in fakeApp { service =>
      service.save(testToken)
      service.save(testToken.copy(uuid="2", expirationTime = DateTime.now.plusMinutes(1)))

      service.deleteExpiredTokens()

      val list = Await.result(service.tokens.find(Json.obj()).cursor[JsObject].toList, timeout)

      list.size must equalTo (1)
      list.head.toString must contain(""""uuid":"2"""")
    }
  }

  def fakeApp[T](block: MongoUserService => T):T = running(FakeApplication(additionalConfiguration = Map("mongodb.db" -> "test"))){
    val service = new MongoUserService(play.api.Play.current)
    Await.ready(service.collection.drop(), timeout)
    Await.ready(service.tokens.drop(), timeout)

    block(service)
  }

  val timeout = DurationInt(10).seconds

  val testToken = Token(uuid ="1", email ="foo@bar.com", creationTime = new DateTime(1), expirationTime = new DateTime(2), isSignUp = false)

  def listDbTokens(service: MongoUserService) = {
    val futureList = service.tokens.find(Json.obj()).cursor[JsObject].toList

    Await.result(futureList, timeout)
  }
}

