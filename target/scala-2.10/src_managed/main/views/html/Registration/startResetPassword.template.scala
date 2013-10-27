
package views.html.Registration

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
object startResetPassword extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[play.api.data.Form[String],play.api.mvc.RequestHeader,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(startForm:play.api.data.Form[String])(implicit request: play.api.mvc.RequestHeader):play.api.templates.Html = {
        _display_ {import helper._

import securesocial.core.IdentityProvider

implicit def /*4.2*/implicitFieldConstructor/*4.26*/ = {{ FieldConstructor(securesocial.views.html.inputFieldConstructor.f) }};
Seq[Any](format.raw/*1.86*/("""
"""),format.raw/*4.99*/("""

"""),_display_(Seq[Any](/*6.2*/securesocial/*6.14*/.views.html.main( Messages("securesocial.password.title") )/*6.73*/ {_display_(Seq[Any](format.raw/*6.75*/("""
    <div class="page-header">
        <h1>"""),_display_(Seq[Any](/*8.14*/Messages("securesocial.password.title"))),format.raw/*8.53*/("""</h1>
    </div>

    """),_display_(Seq[Any](/*11.6*/request/*11.13*/.flash.get("error").map/*11.36*/ { msg =>_display_(Seq[Any](format.raw/*11.45*/("""
    <div class="alert alert-error">
        """),_display_(Seq[Any](/*13.10*/Messages(msg))),format.raw/*13.23*/("""
    </div>
    """)))})),format.raw/*15.6*/("""

    <form action=""""),_display_(Seq[Any](/*17.20*/securesocial/*17.32*/.core.providers.utils.RoutesHelper.handleStartResetPassword().absoluteURL(IdentityProvider.sslEnabled)/*17.134*/(request))),format.raw/*17.143*/(""""
          class="form-horizontal"
          autocomplete="off"
          method="POST"
    >
        <fieldset>
            """),_display_(Seq[Any](/*23.14*/helper/*23.20*/.inputText(
            startForm("email"),
            '_label -> Messages("securesocial.signup.email1"),
            'class -> "input-xlarge"
            ))),format.raw/*27.14*/("""

            <div class="form-actions">
                <button type="submit" class="btn btn-primary">"""),_display_(Seq[Any](/*30.64*/Messages("securesocial.password.reset"))),format.raw/*30.103*/("""</button>
                <a class="btn" href=""""),_display_(Seq[Any](/*31.39*/securesocial/*31.51*/.core.providers.utils.RoutesHelper.login())),format.raw/*31.93*/("""">"""),_display_(Seq[Any](/*31.96*/Messages("securesocial.signup.cancel"))),format.raw/*31.134*/("""</a>
            </div>

        </fieldset>
    </form>
""")))})))}
    }
    
    def render(startForm:play.api.data.Form[String],request:play.api.mvc.RequestHeader): play.api.templates.Html = apply(startForm)(request)
    
    def f:((play.api.data.Form[String]) => (play.api.mvc.RequestHeader) => play.api.templates.Html) = (startForm) => (request) => apply(startForm)(request)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Oct 10 22:51:15 PDT 2013
                    SOURCE: /Users/shrikar/Work/playscala/crowdsource/app/views/Registration/startResetPassword.scala.html
                    HASH: 1b367dea2397f834781b43c5e4a9ea3e4b7b3bfb
                    MATRIX: 578->1|790->147|822->171|925->85|953->244|990->247|1010->259|1077->318|1116->320|1195->364|1255->403|1313->426|1329->433|1361->456|1408->465|1490->511|1525->524|1573->541|1630->562|1651->574|1763->676|1795->685|1958->812|1973->818|2152->975|2292->1079|2354->1118|2438->1166|2459->1178|2523->1220|2562->1223|2623->1261
                    LINES: 19->1|24->4|24->4|25->1|26->4|28->6|28->6|28->6|28->6|30->8|30->8|33->11|33->11|33->11|33->11|35->13|35->13|37->15|39->17|39->17|39->17|39->17|45->23|45->23|49->27|52->30|52->30|53->31|53->31|53->31|53->31|53->31
                    -- GENERATED --
                */
            