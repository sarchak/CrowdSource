
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
object signUp extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[play.api.data.Form[securesocial.controllers.Registration.RegistrationInfo],String,play.api.mvc.RequestHeader,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(signUpForm:play.api.data.Form[securesocial.controllers.Registration.RegistrationInfo], token: String)(implicit request: play.api.mvc.RequestHeader):play.api.templates.Html = {
        _display_ {import securesocial.core.providers.UsernamePasswordProvider

import securesocial.core.IdentityProvider

import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(securesocial.views.html.inputFieldConstructor.f) }};
Seq[Any](format.raw/*1.150*/("""
"""),format.raw/*5.99*/("""

"""),_display_(Seq[Any](/*7.2*/securesocial/*7.14*/.views.html.main( Messages("securesocial.signup.title") )/*7.71*/ {_display_(Seq[Any](format.raw/*7.73*/("""
    <div class="page-header">
        <h1>"""),_display_(Seq[Any](/*9.14*/Messages("securesocial.signup.title"))),format.raw/*9.51*/("""</h1>
    </div>

    """),_display_(Seq[Any](/*12.6*/request/*12.13*/.flash.get("error").map/*12.36*/ { msg =>_display_(Seq[Any](format.raw/*12.45*/("""
        <div class="alert alert-error">
            """),_display_(Seq[Any](/*14.14*/msg)),format.raw/*14.17*/("""
        </div>
    """)))})),format.raw/*16.6*/("""

    <form action=""""),_display_(Seq[Any](/*18.20*/securesocial/*18.32*/.core.providers.utils.RoutesHelper.handleSignUp(token).absoluteURL(IdentityProvider.sslEnabled)/*18.127*/(request))),format.raw/*18.136*/(""""
          class="form-horizontal"
          autocomplete= "off"
          method="POST"
    >
        <fieldset>
            """),_display_(Seq[Any](/*24.14*/if( UsernamePasswordProvider.withUserNameSupport )/*24.64*/ {_display_(Seq[Any](format.raw/*24.66*/("""
                """),_display_(Seq[Any](/*25.18*/helper/*25.24*/.inputText(
                    signUpForm("userName"),
                    '_label -> Messages("securesocial.signup.username"),
                    'class -> "input-xlarge"
                ))),format.raw/*29.18*/("""
            """)))})),format.raw/*30.14*/("""

            """),_display_(Seq[Any](/*32.14*/helper/*32.20*/.inputText(
                signUpForm("firstName"),
                '_label -> Messages("securesocial.signup.firstName"),
                'class -> "input-xlarge"
            ))),format.raw/*36.14*/("""

            """),_display_(Seq[Any](/*38.14*/helper/*38.20*/.inputText(
                signUpForm("lastName"),
                '_label -> Messages("securesocial.signup.lastName"),
                'class -> "input-xlarge"
            ))),format.raw/*42.14*/("""

            """),_display_(Seq[Any](/*44.14*/helper/*44.20*/.inputPassword(
                signUpForm("password.password1"),
                '_label -> Messages("securesocial.signup.password1"),
                'class -> "input-xlarge"
            ))),format.raw/*48.14*/("""

            """),_display_(Seq[Any](/*50.14*/helper/*50.20*/.inputPassword(
                signUpForm("password.password2"),
                '_label -> Messages("securesocial.signup.password2"),
                '_error -> signUpForm.error("password"),
                'class -> "input-xlarge"
            ))),format.raw/*55.14*/("""

            <div class="form-actions">
                <button type="submit" class="btn btn-primary">"""),_display_(Seq[Any](/*58.64*/Messages("securesocial.signup.createAccount"))),format.raw/*58.109*/("""</button>
                <a class="btn" href=""""),_display_(Seq[Any](/*59.39*/securesocial/*59.51*/.core.providers.utils.RoutesHelper.login())),format.raw/*59.93*/("""">"""),_display_(Seq[Any](/*59.96*/Messages("securesocial.signup.cancel"))),format.raw/*59.134*/("""</a>
            </div>
        </fieldset>
    </form>
""")))})))}
    }
    
    def render(signUpForm:play.api.data.Form[securesocial.controllers.Registration.RegistrationInfo],token:String,request:play.api.mvc.RequestHeader): play.api.templates.Html = apply(signUpForm,token)(request)
    
    def f:((play.api.data.Form[securesocial.controllers.Registration.RegistrationInfo],String) => (play.api.mvc.RequestHeader) => play.api.templates.Html) = (signUpForm,token) => (request) => apply(signUpForm,token)(request)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Oct 10 22:51:15 PDT 2013
                    SOURCE: /Users/shrikar/Work/playscala/crowdsource/app/views/Registration/signUp.scala.html
                    HASH: a8003d52faf0bec6cfee098f39024e84e71be813
                    MATRIX: 621->1|958->272|990->296|1094->149|1122->369|1159->372|1179->384|1244->441|1283->443|1362->487|1420->524|1478->547|1494->554|1526->577|1573->586|1663->640|1688->643|1740->664|1797->685|1818->697|1923->792|1955->801|2119->929|2178->979|2218->981|2272->999|2287->1005|2500->1196|2546->1210|2597->1225|2612->1231|2811->1408|2862->1423|2877->1429|3074->1604|3125->1619|3140->1625|3352->1815|3403->1830|3418->1836|3687->2083|3827->2187|3895->2232|3979->2280|4000->2292|4064->2334|4103->2337|4164->2375
                    LINES: 19->1|26->5|26->5|27->1|28->5|30->7|30->7|30->7|30->7|32->9|32->9|35->12|35->12|35->12|35->12|37->14|37->14|39->16|41->18|41->18|41->18|41->18|47->24|47->24|47->24|48->25|48->25|52->29|53->30|55->32|55->32|59->36|61->38|61->38|65->42|67->44|67->44|71->48|73->50|73->50|78->55|81->58|81->58|82->59|82->59|82->59|82->59|82->59
                    -- GENERATED --
                */
            