
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
object notAuthorized extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main(Messages("securesocial.notAuthorized.title"))/*1.52*/ {_display_(Seq[Any](format.raw/*1.54*/("""
    <div class="page-header">
        <h1>"""),_display_(Seq[Any](/*3.14*/Messages("securesocial.notAuthorized.title"))),format.raw/*3.58*/("""</h1>
    </div>

    <div class="alert alert-error">
        """),_display_(Seq[Any](/*7.10*/Messages("securesocial.notAuthorized.message"))),format.raw/*7.56*/("""
    </div>
""")))})))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Oct 10 22:51:15 PDT 2013
                    SOURCE: /Users/shrikar/Work/playscala/crowdsource/app/views/notAuthorized.scala.html
                    HASH: f5f6ebf2897e7aa9306cd8e0f7cf865179fdc45d
                    MATRIX: 586->1|644->51|683->53|762->97|827->141|925->204|992->250
                    LINES: 22->1|22->1|22->1|24->3|24->3|28->7|28->7
                    -- GENERATED --
                */
            