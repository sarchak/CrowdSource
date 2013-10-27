
package views.html.mails

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
object unknownEmailNotice extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[play.api.mvc.RequestHeader,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(implicit request: play.api.mvc.RequestHeader):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.48*/("""
<html>
<body>
<p>Hello,</p>

<p>We received a request to reset a password in our system.  The attempt has failed because we do not have
    a registered account with this email address. It could be that you logged in using an external account such as Twitter
    or Facebook.</p>

<p>
    If you never created an account with us ignore this email, otherwise if you think you have an account with us contact
    tech support for further assistance.
</p>
</body>
</html>"""))}
    }
    
    def render(request:play.api.mvc.RequestHeader): play.api.templates.Html = apply(request)
    
    def f:((play.api.mvc.RequestHeader) => play.api.templates.Html) = (request) => apply(request)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Oct 10 22:51:15 PDT 2013
                    SOURCE: /Users/shrikar/Work/playscala/crowdsource/app/views/mails/unknownEmailNotice.scala.html
                    HASH: 611085b92d015a347ae0d5c24dc142fa9459d5ed
                    MATRIX: 544->1|667->47
                    LINES: 19->1|22->1
                    -- GENERATED --
                */
            