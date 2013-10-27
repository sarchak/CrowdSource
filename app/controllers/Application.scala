package controllers

import _root_.models.CrowdProject
import play.api._
import play.api.mvc._
import securesocial.core.SecureSocial
import securesocial.core.Identity
import securesocial.core.Identity

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._

import anorm._

import views._
import models._

object Application extends Controller  with SecureSocial{
  val crowdProject = Form(
    mapping(
      "id" -> ignored(NotAssigned:Pk[Long]),
      "name" -> nonEmptyText,
      "text" -> nonEmptyText,
      "cost" -> number(min=1)
    )(CrowdProject.apply)(CrowdProject.unapply)
  )
  def index = SecuredAction { implicit  request =>
    Ok(views.html.index(request.user))
  }

}