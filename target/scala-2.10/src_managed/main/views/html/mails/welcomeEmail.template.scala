
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
object welcomeEmail extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[securesocial.core.Identity,play.api.mvc.RequestHeader,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(user: securesocial.core.Identity)(implicit request: play.api.mvc.RequestHeader):play.api.templates.Html = {
        _display_ {import securesocial.core.IdentityProvider


Seq[Any](format.raw/*1.82*/("""
"""),format.raw/*3.1*/("""<html>
<body>
<p>Welcome """),_display_(Seq[Any](/*5.13*/user/*5.17*/.firstName)),format.raw/*5.27*/(""",</p>

<p>
    Your newproject account is ready.
    Click <a href=""""),_display_(Seq[Any](/*9.21*/securesocial/*9.33*/.core.providers.utils.RoutesHelper.login.absoluteURL(IdentityProvider.sslEnabled)/*9.114*/(request))),format.raw/*9.123*/("""">here</a> to log in</p>
</body>
</html>"""))}
    }
    
    def render(user:securesocial.core.Identity,request:play.api.mvc.RequestHeader): play.api.templates.Html = apply(user)(request)
    
    def f:((securesocial.core.Identity) => (play.api.mvc.RequestHeader) => play.api.templates.Html) = (user) => (request) => apply(user)(request)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Oct 11 20:34:42 PDT 2013
                    SOURCE: /Users/shrikar/Work/playscala/crowdsource/app/views/mails/welcomeEmail.scala.html
                    HASH: e8ea29a79658b731e354a82a46bfddc05cd0e089
                    MATRIX: 565->1|764->81|791->125|852->151|864->155|895->165|999->234|1019->246|1109->327|1140->336
                    LINES: 19->1|23->1|24->3|26->5|26->5|26->5|30->9|30->9|30->9|30->9
                    -- GENERATED --
                */
            