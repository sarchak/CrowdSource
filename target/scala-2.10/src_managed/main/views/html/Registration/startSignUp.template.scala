
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
object startSignUp extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[play.api.data.Form[String],play.api.mvc.RequestHeader,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(startForm:play.api.data.Form[String])(implicit request: play.api.mvc.RequestHeader):play.api.templates.Html = {
        _display_ {import helper._

import securesocial.core.IdentityProvider

implicit def /*4.2*/implicitFieldConstructor/*4.26*/ = {{ FieldConstructor(securesocial.views.html.inputFieldConstructor.f) }};
Seq[Any](format.raw/*1.86*/("""
"""),format.raw/*4.99*/("""

"""),_display_(Seq[Any](/*6.2*/securesocial/*6.14*/.views.html.main( Messages("securesocial.signup.title") )/*6.71*/ {_display_(Seq[Any](format.raw/*6.73*/("""
    <div class="page-header">
        <h1>"""),_display_(Seq[Any](/*8.14*/Messages("securesocial.signup.title"))),format.raw/*8.51*/("""</h1>
    </div>

    """),_display_(Seq[Any](/*11.6*/request/*11.13*/.flash.get("error").map/*11.36*/ { msg =>_display_(Seq[Any](format.raw/*11.45*/("""
    <div class="alert alert-error">
        """),_display_(Seq[Any](/*13.10*/Messages(msg))),format.raw/*13.23*/("""
    </div>
    """)))})),format.raw/*15.6*/("""

    <form action=""""),_display_(Seq[Any](/*17.20*/securesocial/*17.32*/.core.providers.utils.RoutesHelper.handleStartSignUp().absoluteURL(IdentityProvider.sslEnabled)/*17.127*/(request))),format.raw/*17.136*/(""""
          class="form-horizontal"
          autocomplete="off" method="post"
    >
        <fieldset>
            """),_display_(Seq[Any](/*22.14*/helper/*22.20*/.inputText(
            startForm("email"),
            '_label -> Messages("securesocial.signup.email1"),
            'class -> "input-xlarge"
            ))),format.raw/*26.14*/("""

            <div class="form-actions">
                <button type="submit" class="btn btn-primary">"""),_display_(Seq[Any](/*29.64*/Messages("securesocial.signup.createAccount"))),format.raw/*29.109*/("""</button>
                <a class="btn" href=""""),_display_(Seq[Any](/*30.39*/securesocial/*30.51*/.core.providers.utils.RoutesHelper.login())),format.raw/*30.93*/("""">"""),_display_(Seq[Any](/*30.96*/Messages("securesocial.signup.cancel"))),format.raw/*30.134*/("""</a>
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
                    SOURCE: /Users/shrikar/Work/playscala/crowdsource/app/views/Registration/startSignUp.scala.html
                    HASH: ecd407944321bc81f9ed3b980d2530e0558d1bfd
                    MATRIX: 571->1|783->147|815->171|918->85|946->244|983->247|1003->259|1068->316|1107->318|1186->362|1244->399|1302->422|1318->429|1350->452|1397->461|1479->507|1514->520|1562->537|1619->558|1640->570|1745->665|1777->674|1930->791|1945->797|2124->954|2264->1058|2332->1103|2416->1151|2437->1163|2501->1205|2540->1208|2601->1246
                    LINES: 19->1|24->4|24->4|25->1|26->4|28->6|28->6|28->6|28->6|30->8|30->8|33->11|33->11|33->11|33->11|35->13|35->13|37->15|39->17|39->17|39->17|39->17|44->22|44->22|48->26|51->29|51->29|52->30|52->30|52->30|52->30|52->30
                    -- GENERATED --
                */
            