
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
object provider extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,Option[play.api.data.Form[scala.Tuple2[String, String]]],play.api.mvc.RequestHeader,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(providerId: String, loginForm: Option[play.api.data.Form[(String, String)]] = None)(implicit request: play.api.mvc.RequestHeader):play.api.templates.Html = {
        _display_ {import securesocial.core.Registry

import securesocial.core.IdentityProvider

import securesocial.core.providers.UsernamePasswordProvider

import securesocial.core.AuthenticationMethod._

import securesocial.core.providers.utils.RoutesHelper

import play.api.Logger

import helper._

implicit def /*10.2*/implicitFieldConstructor/*10.26*/ = {{ FieldConstructor(securesocial.views.html.inputFieldConstructor.f) }};
Seq[Any](format.raw/*1.132*/("""

"""),format.raw/*10.99*/("""

"""),_display_(Seq[Any](/*12.2*/Registry/*12.10*/.providers.get(providerId).map/*12.40*/ { provider =>_display_(Seq[Any](format.raw/*12.54*/("""
            """),_display_(Seq[Any](/*13.14*/if( provider.authMethod == OAuth1 || provider.authMethod == OAuth2 )/*13.82*/ {_display_(Seq[Any](format.raw/*13.84*/("""
                """),_display_(Seq[Any](/*14.18*/defining( "securesocial/images/providers/%s.png".format(provider.id) )/*14.88*/ { imageUrl =>_display_(Seq[Any](format.raw/*14.102*/("""
                    <a href=""""),_display_(Seq[Any](/*15.31*/provider/*15.39*/.authenticationUrl)),format.raw/*15.57*/(""""> <img src=""""),_display_(Seq[Any](/*15.71*/RoutesHelper/*15.83*/.at(imageUrl))),format.raw/*15.96*/(""""/></a>
                """)))})),format.raw/*16.18*/("""
            """)))})),format.raw/*17.14*/("""

            """),_display_(Seq[Any](/*19.14*/if( provider.authMethod == UserPassword )/*19.55*/ {_display_(Seq[Any](format.raw/*19.57*/("""
                <form action = """"),_display_(Seq[Any](/*20.34*/securesocial/*20.46*/.core.providers.utils.RoutesHelper.authenticateByPost("userpass").absoluteURL(IdentityProvider.sslEnabled)/*20.152*/(request))),format.raw/*20.161*/(""""
                      class="form-horizontal" autocomplete="off" method="POST">
                    <fieldset>

                        """),_display_(Seq[Any](/*24.26*/if( UsernamePasswordProvider.withUserNameSupport )/*24.76*/ {_display_(Seq[Any](format.raw/*24.78*/("""
                            """),_display_(Seq[Any](/*25.30*/helper/*25.36*/.inputText(
                                loginForm.get("username"),
                                '_label -> Messages("securesocial.signup.username"),
                                'class -> "input-xlarge"
                            ))),format.raw/*29.30*/("""
                        """)))}/*30.27*/else/*30.32*/{_display_(Seq[Any](format.raw/*30.33*/("""
                            """),_display_(Seq[Any](/*31.30*/helper/*31.36*/.inputText(
                                loginForm.get("username"),
                                '_label -> Messages("securesocial.signup.email1"),
                                'class -> "input-xlarge"
                            ))),format.raw/*35.30*/("""
                        """)))})),format.raw/*36.26*/("""

                        """),_display_(Seq[Any](/*38.26*/helper/*38.32*/.inputPassword(
                            loginForm.get("password"),
                            '_label -> Messages("securesocial.signup.password1"),
                            'class -> "input-xlarge"
                        ))),format.raw/*42.26*/("""

                        <div class="form-actions">
                            <button type="submit" class="btn btn-primary">"""),_display_(Seq[Any](/*45.76*/Messages("securesocial.login.title"))),format.raw/*45.112*/("""</button>
                        </div>
                        <div class="clearfix">
                            <a href=""""),_display_(Seq[Any](/*48.39*/securesocial/*48.51*/.core.providers.utils.RoutesHelper.startResetPassword())),format.raw/*48.106*/(""""><p>"""),_display_(Seq[Any](/*48.112*/Messages("securesocial.login.forgotPassword"))),format.raw/*48.157*/(""" </p></a>
                        </div>
                            <div class="clearfix">
                                <p>"""),_display_(Seq[Any](/*51.37*/Messages("securesocial.login.signUp"))),format.raw/*51.74*/(""" <a href=""""),_display_(Seq[Any](/*51.85*/securesocial/*51.97*/.core.providers.utils.RoutesHelper.startSignUp())),format.raw/*51.145*/("""">"""),_display_(Seq[Any](/*51.148*/Messages("securesocial.login.here"))),format.raw/*51.183*/("""</a></p>
                            </div>
                    </fieldset>
                </form>
            """)))})),format.raw/*55.14*/("""
""")))}/*56.2*/.getOrElse/*56.12*/ {_display_(Seq[Any](format.raw/*56.14*/("""
    """),format.raw/*59.48*/("""
    """),_display_(Seq[Any](/*60.6*/Logger/*60.12*/.error("[securesocial] unknown provider '%s'. Can't render it.".format(providerId)))),format.raw/*60.95*/("""
    """),format.raw/*61.5*/("""{"""),format.raw/*61.6*/(""" throw newproject RuntimeException() """),format.raw/*61.43*/("""}"""),format.raw/*61.44*/("""
""")))})),format.raw/*62.2*/("""
"""))}
    }
    
    def render(providerId:String,loginForm:Option[play.api.data.Form[scala.Tuple2[String, String]]],request:play.api.mvc.RequestHeader): play.api.templates.Html = apply(providerId,loginForm)(request)
    
    def f:((String,Option[play.api.data.Form[scala.Tuple2[String, String]]]) => (play.api.mvc.RequestHeader) => play.api.templates.Html) = (providerId,loginForm) => (request) => apply(providerId,loginForm)(request)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Oct 11 20:34:42 PDT 2013
                    SOURCE: /Users/shrikar/Work/playscala/crowdsource/app/views/provider.scala.html
                    HASH: 3e9d5421d17e99ef9fee749d03d70498c344b5af
                    MATRIX: 592->1|1075->418|1108->442|1212->131|1242->515|1280->518|1297->526|1336->556|1388->570|1438->584|1515->652|1555->654|1609->672|1688->742|1741->756|1808->787|1825->795|1865->813|1915->827|1936->839|1971->852|2028->877|2074->891|2125->906|2175->947|2215->949|2285->983|2306->995|2422->1101|2454->1110|2629->1249|2688->1299|2728->1301|2794->1331|2809->1337|3073->1579|3118->1606|3131->1611|3170->1612|3236->1642|3251->1648|3513->1888|3571->1914|3634->1941|3649->1947|3902->2178|4066->2306|4125->2342|4287->2468|4308->2480|4386->2535|4429->2541|4497->2586|4661->2714|4720->2751|4767->2762|4788->2774|4859->2822|4899->2825|4957->2860|5102->2973|5122->2975|5141->2985|5181->2987|5214->3150|5255->3156|5270->3162|5375->3245|5407->3250|5435->3251|5500->3288|5529->3289|5562->3291
                    LINES: 19->1|34->10|34->10|35->1|37->10|39->12|39->12|39->12|39->12|40->13|40->13|40->13|41->14|41->14|41->14|42->15|42->15|42->15|42->15|42->15|42->15|43->16|44->17|46->19|46->19|46->19|47->20|47->20|47->20|47->20|51->24|51->24|51->24|52->25|52->25|56->29|57->30|57->30|57->30|58->31|58->31|62->35|63->36|65->38|65->38|69->42|72->45|72->45|75->48|75->48|75->48|75->48|75->48|78->51|78->51|78->51|78->51|78->51|78->51|78->51|82->55|83->56|83->56|83->56|84->59|85->60|85->60|85->60|86->61|86->61|86->61|86->61|87->62
                    -- GENERATED --
                */
            