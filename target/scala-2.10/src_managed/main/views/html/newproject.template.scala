
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object newproject extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[securesocial.core.Identity,RequestHeader,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(user: securesocial.core.Identity)(implicit request: RequestHeader):play.api.templates.Html = {
        _display_ {import helper._

import securesocial.core.Registry

import securesocial.core.AuthenticationMethod._

import securesocial.core.providers.UsernamePasswordProvider.UsernamePassword


Seq[Any](format.raw/*1.69*/("""


"""),format.raw/*8.1*/("""
"""),_display_(Seq[Any](/*9.2*/main(Messages("securesocial.login.title"))/*9.44*/ {_display_(Seq[Any](format.raw/*9.46*/("""
    """),_display_(Seq[Any](/*10.6*/request/*10.13*/.flash.get("success").map/*10.38*/ { msg =>_display_(Seq[Any](format.raw/*10.47*/("""
        <div class="alert alert-info">
            """),_display_(Seq[Any](/*12.14*/msg)),format.raw/*12.17*/("""
        </div>
    """)))})),format.raw/*14.6*/("""

    """),_display_(Seq[Any](/*16.6*/request/*16.13*/.flash.get("error").map/*16.36*/ { msg =>_display_(Seq[Any](format.raw/*16.45*/("""
        <div class="alert alert-error">
            """),_display_(Seq[Any](/*18.14*/msg)),format.raw/*18.17*/("""
        </div>
    """)))})),format.raw/*20.6*/("""

""")))})))}
    }
    
    def render(user:securesocial.core.Identity,request:RequestHeader): play.api.templates.Html = apply(user)(request)
    
    def f:((securesocial.core.Identity) => (RequestHeader) => play.api.templates.Html) = (user) => (request) => apply(user)(request)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Oct 11 21:02:55 PDT 2013
                    SOURCE: /Users/shrikar/Work/playscala/crowdsource/app/views/newproject.scala.html
                    HASH: fc3e6f66754f3606f82dcfd4a661eaed21bf3ea5
                    MATRIX: 544->1|866->68|895->250|931->252|981->294|1020->296|1061->302|1077->309|1111->334|1158->343|1247->396|1272->399|1324->420|1366->427|1382->434|1414->457|1461->466|1551->520|1576->523|1628->544
                    LINES: 19->1|29->1|32->8|33->9|33->9|33->9|34->10|34->10|34->10|34->10|36->12|36->12|38->14|40->16|40->16|40->16|40->16|42->18|42->18|44->20
                    -- GENERATED --
                */
            