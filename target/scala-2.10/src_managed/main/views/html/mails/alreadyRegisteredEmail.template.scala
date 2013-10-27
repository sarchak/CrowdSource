
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
object alreadyRegisteredEmail extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[securesocial.core.Identity,play.api.mvc.RequestHeader,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(user: securesocial.core.Identity)(implicit request: play.api.mvc.RequestHeader):play.api.templates.Html = {
        _display_ {import securesocial.core.IdentityProvider


Seq[Any](format.raw/*1.82*/("""
"""),format.raw/*3.1*/("""
<html>
    <body>
        <p>Hello """),_display_(Seq[Any](/*6.19*/user/*6.23*/.firstName)),format.raw/*6.33*/(""",</p>

        <p>You tried to sign up but you already have an account with us.  If you don't remember your password please go
            <a href=""""),_display_(Seq[Any](/*9.23*/securesocial/*9.35*/.core.providers.utils.RoutesHelper.startResetPassword().absoluteURL(IdentityProvider.sslEnabled)/*9.131*/(request))),format.raw/*9.140*/("""">here</a> to reset it.</p>
    </body>
</html>"""))}
    }
    
    def render(user:securesocial.core.Identity,request:play.api.mvc.RequestHeader): play.api.templates.Html = apply(user)(request)
    
    def f:((securesocial.core.Identity) => (play.api.mvc.RequestHeader) => play.api.templates.Html) = (user) => (request) => apply(user)(request)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Oct 10 22:51:15 PDT 2013
                    SOURCE: /Users/shrikar/Work/playscala/crowdsource/app/views/mails/alreadyRegisteredEmail.scala.html
                    HASH: 81f02a6bb0cfacf988b62ab4df96cb0d144c0acb
                    MATRIX: 575->1|774->81|801->125|873->162|885->166|916->176|1100->325|1120->337|1225->433|1256->442
                    LINES: 19->1|23->1|24->3|27->6|27->6|27->6|30->9|30->9|30->9|30->9
                    -- GENERATED --
                */
            