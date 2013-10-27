package models

import anorm.{Pk, NotAssigned}

/**
 * Created with IntelliJ IDEA.
 * User: shrikar
 * Date: 10/11/13
 * Time: 8:51 PM
 * To change this template use File | Settings | File Templates.
 */
case class CrowdProject(id: Pk[Long] = NotAssigned,name:String, text:String, cost: Int)
