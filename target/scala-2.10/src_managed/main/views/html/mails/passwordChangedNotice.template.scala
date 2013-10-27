
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
object passwordChangedNotice extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[securesocial.core.Identity,play.api.mvc.RequestHeader,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(user: securesocial.core.Identity)(implicit request: play.api.mvc.RequestHeader):play.api.templates.Html = {
        _display_ {import securesocial.core.IdentityProvider


Seq[Any](format.raw/*1.82*/("""
"""),format.raw/*3.1*/("""
<html>
<body>
<p>Hello """),_display_(Seq[Any](/*6.11*/user/*6.15*/.firstName)),format.raw/*6.25*/(""",</p>

<p>Your password was updated.  Please log in using your newproject password by clicking
    <a href=""""),_display_(Seq[Any](/*9.15*/securesocial/*9.27*/.core.providers.utils.RoutesHelper.login.absoluteURL(IdentityProvider.sslEnabled)/*9.108*/(request))),format.raw/*9.117*/("""">here</a></p>
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
                    SOURCE: /Users/shrikar/Work/playscala/crowdsource/app/views/mails/passwordChangedNotice.scala.html
                    HASH: fefe2086657a41a638aa86885fc74c5f4d37ca54
                    MATRIX: 574->1|773->81|800->125|860->150|872->154|903->164|1047->273|1067->285|1157->366|1188->375
                    LINES: 19->1|23->1|24->3|27->6|27->6|27->6|30->9|30->9|30->9|30->9
                    -- GENERATED --
                */
            