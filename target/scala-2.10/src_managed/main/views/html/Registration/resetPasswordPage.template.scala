
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
object resetPasswordPage extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[play.api.data.Form[scala.Tuple2[String, String]],String,play.api.mvc.RequestHeader,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(resetForm:play.api.data.Form[(String, String)], token: String)(implicit request: play.api.mvc.RequestHeader):play.api.templates.Html = {
        _display_ {import helper._

import securesocial.core.IdentityProvider

implicit def /*4.2*/implicitFieldConstructor/*4.26*/ = {{ FieldConstructor(securesocial.views.html.inputFieldConstructor.f) }};
Seq[Any](format.raw/*1.111*/("""
"""),format.raw/*4.99*/("""

"""),_display_(Seq[Any](/*6.2*/securesocial/*6.14*/.views.html.main( Messages("securesocial.password.title") )/*6.73*/ {_display_(Seq[Any](format.raw/*6.75*/("""
    <div class="page-header">
        <h1>"""),_display_(Seq[Any](/*8.14*/Messages("securesocial.password.title"))),format.raw/*8.53*/("""</h1>
    </div>

    """),_display_(Seq[Any](/*11.6*/request/*11.13*/.flash.get("error").map/*11.36*/ { msg =>_display_(Seq[Any](format.raw/*11.45*/("""
        <div class="alert alert-error">
            """),_display_(Seq[Any](/*13.14*/Messages(msg))),format.raw/*13.27*/("""
        </div>
    """)))})),format.raw/*15.6*/("""

    <form action=""""),_display_(Seq[Any](/*17.20*/securesocial/*17.32*/.core.providers.utils.RoutesHelper.handleResetPassword(token).absoluteURL(IdentityProvider.sslEnabled)/*17.134*/(request))),format.raw/*17.143*/(""""
          class="form-horizontal"
          autocomplete="off"
          method="POST"
    >
        <fieldset>
            """),_display_(Seq[Any](/*23.14*/helper/*23.20*/.inputPassword(
            resetForm("password.password1"),
            '_label -> Messages("securesocial.signup.password1"),
            'class -> "input-xlarge"
            ))),format.raw/*27.14*/("""

            """),_display_(Seq[Any](/*29.14*/helper/*29.20*/.inputPassword(
            resetForm("password.password2"),
            '_label -> Messages("securesocial.signup.password2"),
            '_error -> resetForm.error("password"),
            'class -> "input-xlarge"
            ))),format.raw/*34.14*/("""

            <div class="form-actions">
                <button type="submit" class="btn btn-primary">"""),_display_(Seq[Any](/*37.64*/Messages("securesocial.password.reset"))),format.raw/*37.103*/("""</button>
            </div>

        </fieldset>
    </form>
""")))})),format.raw/*42.2*/("""


"""))}
    }
    
    def render(resetForm:play.api.data.Form[scala.Tuple2[String, String]],token:String,request:play.api.mvc.RequestHeader): play.api.templates.Html = apply(resetForm,token)(request)
    
    def f:((play.api.data.Form[scala.Tuple2[String, String]],String) => (play.api.mvc.RequestHeader) => play.api.templates.Html) = (resetForm,token) => (request) => apply(resetForm,token)(request)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Oct 10 22:51:15 PDT 2013
                    SOURCE: /Users/shrikar/Work/playscala/crowdsource/app/views/Registration/resetPasswordPage.scala.html
                    HASH: 7033b72b861f03416e616938bd22e3fa609198cb
                    MATRIX: 606->1|843->172|875->196|979->110|1007->269|1044->272|1064->284|1131->343|1170->345|1249->389|1309->428|1367->451|1383->458|1415->481|1462->490|1552->544|1587->557|1639->578|1696->599|1717->611|1829->713|1861->722|2024->849|2039->855|2238->1032|2289->1047|2304->1053|2555->1282|2695->1386|2757->1425|2851->1488
                    LINES: 19->1|24->4|24->4|25->1|26->4|28->6|28->6|28->6|28->6|30->8|30->8|33->11|33->11|33->11|33->11|35->13|35->13|37->15|39->17|39->17|39->17|39->17|45->23|45->23|49->27|51->29|51->29|56->34|59->37|59->37|64->42
                    -- GENERATED --
                */
            