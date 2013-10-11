package controllers

import play.api._
import play.api.mvc._
import securesocial.core.SecureSocial
import securesocial.core.Identity
import securesocial.core.Identity

object Application extends Controller  with SecureSocial{
  
  def index = SecuredAction { implicit  request =>
    Ok(views.html.index(request.user))
  }
}