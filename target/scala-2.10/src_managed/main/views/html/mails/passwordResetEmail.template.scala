
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
object passwordResetEmail extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[securesocial.core.Identity,String,play.api.mvc.RequestHeader,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(user: securesocial.core.Identity, token: String)(implicit request: play.api.mvc.RequestHeader):play.api.templates.Html = {
        _display_ {import securesocial.core.IdentityProvider


Seq[Any](format.raw/*1.97*/("""
"""),format.raw/*3.1*/("""<html>
<body>
<p>Hello """),_display_(Seq[Any](/*5.11*/user/*5.15*/.firstName)),format.raw/*5.25*/(""",</p>

<p>Please follow this
    <a href=""""),_display_(Seq[Any](/*8.15*/securesocial/*8.27*/.core.providers.utils.RoutesHelper.resetPassword(token).absoluteURL(IdentityProvider.sslEnabled)/*8.123*/(request))),format.raw/*8.132*/("""">
    link</a> to reset your password.
</p>
</body>
</html>"""))}
    }
    
    def render(user:securesocial.core.Identity,token:String,request:play.api.mvc.RequestHeader): play.api.templates.Html = apply(user,token)(request)
    
    def f:((securesocial.core.Identity,String) => (play.api.mvc.RequestHeader) => play.api.templates.Html) = (user,token) => (request) => apply(user,token)(request)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Oct 10 22:51:15 PDT 2013
                    SOURCE: /Users/shrikar/Work/playscala/crowdsource/app/views/mails/passwordResetEmail.scala.html
                    HASH: c8d62b8d4ce393ba9e0b62a54de0e1b3794d0f28
                    MATRIX: 578->1|792->96|819->140|878->164|890->168|921->178|999->221|1019->233|1124->329|1155->338
                    LINES: 19->1|23->1|24->3|26->5|26->5|26->5|29->8|29->8|29->8|29->8
                    -- GENERATED --
                */
            