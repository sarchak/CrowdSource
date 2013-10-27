
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
object passwordChange extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[play.api.data.Form[securesocial.controllers.PasswordChange.ChangeInfo],play.api.mvc.RequestHeader,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(passwordChangeForm:play.api.data.Form[securesocial.controllers.PasswordChange.ChangeInfo])(implicit request: play.api.mvc.RequestHeader):play.api.templates.Html = {
        _display_ {import securesocial.core.providers.UsernamePasswordProvider

import securesocial.core.IdentityProvider

import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(securesocial.views.html.inputFieldConstructor.f) }};
Seq[Any](format.raw/*1.139*/("""
"""),format.raw/*5.99*/("""

"""),_display_(Seq[Any](/*7.2*/securesocial/*7.14*/.views.html.main( Messages("securesocial.passwordChange.title") )/*7.79*/ {_display_(Seq[Any](format.raw/*7.81*/("""
    <div class="page-header">
        <h1>"""),_display_(Seq[Any](/*9.14*/Messages("securesocial.passwordChange.title"))),format.raw/*9.59*/("""</h1>
    </div>

    """),_display_(Seq[Any](/*12.6*/request/*12.13*/.flash.get("error").map/*12.36*/ { msg =>_display_(Seq[Any](format.raw/*12.45*/("""
        <div class="alert alert-error">
            """),_display_(Seq[Any](/*14.14*/msg)),format.raw/*14.17*/("""
        </div>
    """)))})),format.raw/*16.6*/("""

    """),_display_(Seq[Any](/*18.6*/if( request.flash.get("success").isDefined )/*18.50*/ {_display_(Seq[Any](format.raw/*18.52*/("""
        <div class="alert alert-info">
            """),_display_(Seq[Any](/*20.14*/request/*20.21*/.flash.get("success").get)),format.raw/*20.46*/("""
        </div>

        <div class="form-actions">
            <a class="btn" href=""""),_display_(Seq[Any](/*24.35*/securesocial/*24.47*/.controllers.ProviderController.toUrl(request))),format.raw/*24.93*/("""">"""),_display_(Seq[Any](/*24.96*/Messages("securesocial.passwordChange.okButton"))),format.raw/*24.144*/("""</a>
        </div>
    """)))}/*26.7*/else/*26.12*/{_display_(Seq[Any](format.raw/*26.13*/("""
        <form action=""""),_display_(Seq[Any](/*27.24*/securesocial/*27.36*/.core.providers.utils.RoutesHelper.handlePasswordChange.absoluteURL(IdentityProvider.sslEnabled)/*27.132*/(request))),format.raw/*27.141*/(""""
              class="form-horizontal"
              autocomplete= "off"
              method="POST"
        >
            <fieldset>
                """),_display_(Seq[Any](/*33.18*/helper/*33.24*/.inputPassword(
                    passwordChangeForm("currentPassword"),
                    '_label -> Messages("securesocial.passwordChange.currentPassword"),
                    'class -> "input-xlarge"
                ))),format.raw/*37.18*/("""

                """),_display_(Seq[Any](/*39.18*/helper/*39.24*/.inputPassword(
                    passwordChangeForm("newPassword.password1"),
                    '_label -> Messages("securesocial.passwordChange.newPassword1"),
                    'class -> "input-xlarge"
                ))),format.raw/*43.18*/("""

                """),_display_(Seq[Any](/*45.18*/helper/*45.24*/.inputPassword(
                    passwordChangeForm("newPassword.password2"),
                    '_label -> Messages("securesocial.passwordChange.newPassword2"),
                    '_error -> passwordChangeForm.error("newPassword"),
                    'class -> "input-xlarge"
                ))),format.raw/*50.18*/("""

                <div class="form-actions">
                    <button type="submit" class="btn btn-primary">"""),_display_(Seq[Any](/*53.68*/Messages("securesocial.passwordChange.changeButton"))),format.raw/*53.120*/("""</button>
                    <a class="btn" href=""""),_display_(Seq[Any](/*54.43*/securesocial/*54.55*/.controllers.ProviderController.toUrl(request))),format.raw/*54.101*/("""">"""),_display_(Seq[Any](/*54.104*/Messages("securesocial.signup.cancel"))),format.raw/*54.142*/("""</a>
                </div>
            </fieldset>
        </form>
     """)))})),format.raw/*58.7*/("""
""")))})))}
    }
    
    def render(passwordChangeForm:play.api.data.Form[securesocial.controllers.PasswordChange.ChangeInfo],request:play.api.mvc.RequestHeader): play.api.templates.Html = apply(passwordChangeForm)(request)
    
    def f:((play.api.data.Form[securesocial.controllers.PasswordChange.ChangeInfo]) => (play.api.mvc.RequestHeader) => play.api.templates.Html) = (passwordChangeForm) => (request) => apply(passwordChangeForm)(request)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Oct 10 22:51:15 PDT 2013
                    SOURCE: /Users/shrikar/Work/playscala/crowdsource/app/views/passwordChange.scala.html
                    HASH: b688dd3b4dbc00baef0308f4dd4cf0e26402de97
                    MATRIX: 605->1|931->261|963->285|1067->138|1095->358|1132->361|1152->373|1225->438|1264->440|1343->484|1409->529|1467->552|1483->559|1515->582|1562->591|1652->645|1677->648|1729->669|1771->676|1824->720|1864->722|1953->775|1969->782|2016->807|2138->893|2159->905|2227->951|2266->954|2337->1002|2380->1028|2393->1033|2432->1034|2492->1058|2513->1070|2619->1166|2651->1175|2839->1327|2854->1333|3101->1558|3156->1577|3171->1583|3421->1811|3476->1830|3491->1836|3813->2136|3961->2248|4036->2300|4124->2352|4145->2364|4214->2410|4254->2413|4315->2451|4420->2525
                    LINES: 19->1|26->5|26->5|27->1|28->5|30->7|30->7|30->7|30->7|32->9|32->9|35->12|35->12|35->12|35->12|37->14|37->14|39->16|41->18|41->18|41->18|43->20|43->20|43->20|47->24|47->24|47->24|47->24|47->24|49->26|49->26|49->26|50->27|50->27|50->27|50->27|56->33|56->33|60->37|62->39|62->39|66->43|68->45|68->45|73->50|76->53|76->53|77->54|77->54|77->54|77->54|77->54|81->58
                    -- GENERATED --
                */
            