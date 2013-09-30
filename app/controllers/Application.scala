package controllers

import play.api._
import play.api.mvc._
import securesocial.core.SecureSocial

object Application extends Controller  with SecureSocial{
  
  def index = SecuredAction { implicit  request =>
    Ok(views.html.index("Your new application is ready."))
  }
  
}