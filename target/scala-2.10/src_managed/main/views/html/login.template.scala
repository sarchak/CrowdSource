
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
object login extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[play.api.data.Form[scala.Tuple2[String, String]],Option[String],play.api.mvc.RequestHeader,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(loginForm: play.api.data.Form[(String,String)], errorMsg: Option[String] = None)(implicit request: play.api.mvc.RequestHeader):play.api.templates.Html = {
        _display_ {import helper._

import securesocial.core.Registry

import securesocial.core.AuthenticationMethod._

import securesocial.core.providers.UsernamePasswordProvider.UsernamePassword


Seq[Any](format.raw/*1.129*/("""

"""),format.raw/*7.1*/("""
"""),_display_(Seq[Any](/*8.2*/main(Messages("securesocial.login.title"))/*8.44*/ {_display_(Seq[Any](format.raw/*8.46*/("""
    <div class="page-header">
        <h1>"""),_display_(Seq[Any](/*10.14*/Messages("securesocial.login.title"))),format.raw/*10.50*/("""</h1>
    </div>

    """),_display_(Seq[Any](/*13.6*/errorMsg/*13.14*/.map/*13.18*/ { msg =>_display_(Seq[Any](format.raw/*13.27*/("""
        <div class="alert alert-error">
            """),_display_(Seq[Any](/*15.14*/Messages(msg))),format.raw/*15.27*/("""
        </div>
    """)))})),format.raw/*17.6*/("""

    """),_display_(Seq[Any](/*19.6*/request/*19.13*/.flash.get("success").map/*19.38*/ { msg =>_display_(Seq[Any](format.raw/*19.47*/("""
        <div class="alert alert-info">
            """),_display_(Seq[Any](/*21.14*/msg)),format.raw/*21.17*/("""
        </div>
    """)))})),format.raw/*23.6*/("""

    """),_display_(Seq[Any](/*25.6*/request/*25.13*/.flash.get("error").map/*25.36*/ { msg =>_display_(Seq[Any](format.raw/*25.45*/("""
        <div class="alert alert-error">
            """),_display_(Seq[Any](/*27.14*/msg)),format.raw/*27.17*/("""
        </div>
    """)))})),format.raw/*29.6*/("""


"""),_display_(Seq[Any](/*32.2*/defining( Registry.providers.all.values.filter( _.id != UsernamePassword) )/*32.77*/ { externalProviders =>_display_(Seq[Any](format.raw/*32.100*/("""

        """),_display_(Seq[Any](/*34.10*/if( externalProviders.size > 0 )/*34.42*/ {_display_(Seq[Any](format.raw/*34.44*/("""
            <div class="clearfix">
                <h3>"""),_display_(Seq[Any](/*36.22*/Messages("securesocial.login.instructions"))),format.raw/*36.65*/("""</h3>
                <h2>Awesomeness!!!</h2>
                <p>
                    """),_display_(Seq[Any](/*39.22*/for(p <- externalProviders) yield /*39.49*/ {_display_(Seq[Any](format.raw/*39.51*/("""
                        """),_display_(Seq[Any](/*40.26*/provider(p.id)/*40.40*/(request))),format.raw/*40.49*/("""
                    """)))})),format.raw/*41.22*/("""
                </p>
            </div>
        """)))})),format.raw/*44.10*/("""

        """),_display_(Seq[Any](/*46.10*/Registry/*46.18*/.providers.get(UsernamePassword).map/*46.54*/ { up =>_display_(Seq[Any](format.raw/*46.62*/("""
            <div class="clearfix">
                """),_display_(Seq[Any](/*48.18*/if( externalProviders.size > 0 )/*48.50*/ {_display_(Seq[Any](format.raw/*48.52*/("""
                    <h3>"""),_display_(Seq[Any](/*49.26*/Messages("securesocial.login.useEmailAndPassword"))),format.raw/*49.76*/("""</h3>
                """)))}/*50.19*/else/*50.24*/{_display_(Seq[Any](format.raw/*50.25*/("""
                    <h3>"""),_display_(Seq[Any](/*51.26*/Messages("securesocial.login.useEmailAndPasswordOnly"))),format.raw/*51.80*/("""</h3>
                """)))})),format.raw/*52.18*/("""

               """),_display_(Seq[Any](/*54.17*/provider("userpass", Some(loginForm))/*54.54*/(request))),format.raw/*54.63*/("""
            </div>
        """)))})),format.raw/*56.10*/("""
    """)))})),format.raw/*57.6*/("""
""")))})))}
    }
    
    def render(loginForm:play.api.data.Form[scala.Tuple2[String, String]],errorMsg:Option[String],request:play.api.mvc.RequestHeader): play.api.templates.Html = apply(loginForm,errorMsg)(request)
    
    def f:((play.api.data.Form[scala.Tuple2[String, String]],Option[String]) => (play.api.mvc.RequestHeader) => play.api.templates.Html) = (loginForm,errorMsg) => (request) => apply(loginForm,errorMsg)(request)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Oct 10 23:03:18 PDT 2013
                    SOURCE: /Users/shrikar/Work/playscala/crowdsource/app/views/login.scala.html
                    HASH: 5bf92e9b544ff3956c93bf4737e1ccae101cf061
                    MATRIX: 589->1|972->128|1000->309|1036->311|1086->353|1125->355|1205->399|1263->435|1321->458|1338->466|1351->470|1398->479|1488->533|1523->546|1575->567|1617->574|1633->581|1667->606|1714->615|1803->668|1828->671|1880->692|1922->699|1938->706|1970->729|2017->738|2107->792|2132->795|2184->816|2223->820|2307->895|2369->918|2416->929|2457->961|2497->963|2590->1020|2655->1063|2778->1150|2821->1177|2861->1179|2923->1205|2946->1219|2977->1228|3031->1250|3113->1300|3160->1311|3177->1319|3222->1355|3268->1363|3357->1416|3398->1448|3438->1450|3500->1476|3572->1526|3614->1550|3627->1555|3666->1556|3728->1582|3804->1636|3859->1659|3913->1677|3959->1714|3990->1723|4051->1752|4088->1758
                    LINES: 19->1|29->1|31->7|32->8|32->8|32->8|34->10|34->10|37->13|37->13|37->13|37->13|39->15|39->15|41->17|43->19|43->19|43->19|43->19|45->21|45->21|47->23|49->25|49->25|49->25|49->25|51->27|51->27|53->29|56->32|56->32|56->32|58->34|58->34|58->34|60->36|60->36|63->39|63->39|63->39|64->40|64->40|64->40|65->41|68->44|70->46|70->46|70->46|70->46|72->48|72->48|72->48|73->49|73->49|74->50|74->50|74->50|75->51|75->51|76->52|78->54|78->54|78->54|80->56|81->57
                    -- GENERATED --
                */
            