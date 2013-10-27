
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
object signUpEmail extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,play.api.mvc.RequestHeader,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(token: String)(implicit request: play.api.mvc.RequestHeader):play.api.templates.Html = {
        _display_ {import securesocial.core.IdentityProvider


Seq[Any](format.raw/*1.63*/("""
"""),format.raw/*3.1*/("""<html>
<body>
<p>Hello,</p>

<p>Please follow this
    <a href=""""),_display_(Seq[Any](/*8.15*/securesocial/*8.27*/.core.providers.utils.RoutesHelper.signUp(token).absoluteURL(IdentityProvider.sslEnabled)/*8.116*/(request))),format.raw/*8.125*/("""">link</a> to complete your registration.
</p>
</body>
</html>"""))}
    }
    
    def render(token:String,request:play.api.mvc.RequestHeader): play.api.templates.Html = apply(token)(request)
    
    def f:((String) => (play.api.mvc.RequestHeader) => play.api.templates.Html) = (token) => (request) => apply(token)(request)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Oct 10 22:51:15 PDT 2013
                    SOURCE: /Users/shrikar/Work/playscala/crowdsource/app/views/mails/signUpEmail.scala.html
                    HASH: 16591d8634a17edd3d54bb29d34fc7ffc91e2423
                    MATRIX: 544->1|724->62|751->106|851->171|871->183|969->272|1000->281
                    LINES: 19->1|23->1|24->3|29->8|29->8|29->8|29->8
                    -- GENERATED --
                */
            