
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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[securesocial.core.Identity,RequestHeader,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(user: securesocial.core.Identity)(implicit request: RequestHeader):play.api.templates.Html = {
        _display_ {import securesocial.core.IdentityProvider


Seq[Any](format.raw/*1.69*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("SecureSocial - Sample Protected Page")/*4.46*/ {_display_(Seq[Any](format.raw/*4.48*/("""
<div class="page-header">
    <h2><img src=""""),_display_(Seq[Any](/*6.20*/user/*6.24*/.avatarUrl)),format.raw/*6.34*/("""" alt=""""),_display_(Seq[Any](/*6.42*/user/*6.46*/.fullName)),format.raw/*6.55*/("""" width="40px" height="40px"/> Welcome """),_display_(Seq[Any](/*6.95*/user/*6.99*/.firstName)),format.raw/*6.109*/("""</h2>
</div>

<div class="clearfix">
    <h2>User Details</h2>

    <ul>
        <li>User Id: """),_display_(Seq[Any](/*13.23*/user)),format.raw/*13.27*/("""</li>
        <li>Logged in from: """),_display_(Seq[Any](/*14.30*/user/*14.34*/.identityId.userId)),format.raw/*14.52*/("""</li>
        <li>Fist name: """),_display_(Seq[Any](/*15.25*/user/*15.29*/.firstName)),format.raw/*15.39*/("""</li>
        <li>Last name: """),_display_(Seq[Any](/*16.25*/user/*16.29*/.lastName)),format.raw/*16.38*/("""</li>
        <li>Full name: """),_display_(Seq[Any](/*17.25*/user/*17.29*/.fullName)),format.raw/*17.38*/("""</li>
        <li>Email: """),_display_(Seq[Any](/*18.21*/user/*18.25*/.email.map/*18.35*/ { email =>_display_(Seq[Any](format.raw/*18.46*/(""" """),_display_(Seq[Any](/*18.48*/email)),format.raw/*18.53*/(""" """)))}/*18.55*/.getOrElse("Not Available"))),format.raw/*18.82*/("""</li>
        <li>Authentication method: """),_display_(Seq[Any](/*19.37*/user/*19.41*/.authMethod)),format.raw/*19.52*/("""</li>
    </ul>

    """),_display_(Seq[Any](/*22.6*/user/*22.10*/.oAuth1Info.map/*22.25*/ { info =>_display_(Seq[Any](format.raw/*22.35*/("""
    <h2>OAuth1 Info</h2>

    <ul>
        <li>Token: """),_display_(Seq[Any](/*26.21*/info/*26.25*/.token)),format.raw/*26.31*/("""</li>
        <li>Secret: """),_display_(Seq[Any](/*27.22*/info/*27.26*/.secret)),format.raw/*27.33*/("""</li>
    </ul>
    """)))})),format.raw/*29.6*/("""

    """),_display_(Seq[Any](/*31.6*/user/*31.10*/.oAuth2Info.map/*31.25*/ { info =>_display_(Seq[Any](format.raw/*31.35*/("""
    <h2>OAuth2 Info</h2>

    <ul>
        <li>Access Token: """),_display_(Seq[Any](/*35.28*/info/*35.32*/.accessToken)),format.raw/*35.44*/("""</li>
        """),_display_(Seq[Any](/*36.10*/info/*36.14*/.tokenType.map/*36.28*/ { t =>_display_(Seq[Any](format.raw/*36.35*/(""" <li>Token Type: """),_display_(Seq[Any](/*36.53*/t)),format.raw/*36.54*/("""</li> """)))})),format.raw/*36.61*/("""
        """),_display_(Seq[Any](/*37.10*/info/*37.14*/.expiresIn.map/*37.28*/ { exp =>_display_(Seq[Any](format.raw/*37.37*/(""" <li>Expires in: """),_display_(Seq[Any](/*37.55*/exp)),format.raw/*37.58*/(""" seconds</li>""")))})),format.raw/*37.72*/("""
        """),_display_(Seq[Any](/*38.10*/info/*38.14*/.refreshToken.map/*38.31*/ { rt =>_display_(Seq[Any](format.raw/*38.39*/(""" <li>Refresh Token: """),_display_(Seq[Any](/*38.60*/rt)),format.raw/*38.62*/("""</li>""")))})),format.raw/*38.68*/("""
    </ul>
    """)))})),format.raw/*40.6*/("""
    <hr>
    """),_display_(Seq[Any](/*42.6*/user/*42.10*/.passwordInfo.map/*42.27*/ { info =>_display_(Seq[Any](format.raw/*42.37*/("""
	<a class="btn" href=""""),_display_(Seq[Any](/*43.24*/securesocial/*43.36*/.core.providers.utils.RoutesHelper.changePasswordPage.absoluteURL(IdentityProvider.sslEnabled))),format.raw/*43.130*/("""">Change Password</a>
    """)))})),format.raw/*44.6*/("""
    <a class="btn" href=""""),_display_(Seq[Any](/*45.27*/securesocial/*45.39*/.controllers.routes.LoginPage.logout())),format.raw/*45.77*/("""">Logout</a>
    <a class="btn" href="#">Create Project</a>
</div>
""")))})),format.raw/*48.2*/("""
"""))}
    }
    
    def render(user:securesocial.core.Identity,request:RequestHeader): play.api.templates.Html = apply(user)(request)
    
    def f:((securesocial.core.Identity) => (RequestHeader) => play.api.templates.Html) = (user) => (request) => apply(user)(request)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Oct 11 20:31:27 PDT 2013
                    SOURCE: /Users/shrikar/Work/playscala/crowdsource/app/views/index.scala.html
                    HASH: 98f06cc8c4e9a9c6de047416e0c0b900572f9835
                    MATRIX: 539->1|725->68|752->112|788->114|840->158|879->160|960->206|972->210|1003->220|1046->228|1058->232|1088->241|1163->281|1175->285|1207->295|1338->390|1364->394|1435->429|1448->433|1488->451|1554->481|1567->485|1599->495|1665->525|1678->529|1709->538|1775->568|1788->572|1819->581|1881->607|1894->611|1913->621|1962->632|2000->634|2027->639|2048->641|2097->668|2175->710|2188->714|2221->725|2278->747|2291->751|2315->766|2363->776|2455->832|2468->836|2496->842|2559->869|2572->873|2601->880|2653->901|2695->908|2708->912|2732->927|2780->937|2879->1000|2892->1004|2926->1016|2977->1031|2990->1035|3013->1049|3058->1056|3112->1074|3135->1075|3174->1082|3220->1092|3233->1096|3256->1110|3303->1119|3357->1137|3382->1140|3428->1154|3474->1164|3487->1168|3513->1185|3559->1193|3616->1214|3640->1216|3678->1222|3725->1238|3775->1253|3788->1257|3814->1274|3862->1284|3922->1308|3943->1320|4060->1414|4118->1441|4181->1468|4202->1480|4262->1518|4361->1586
                    LINES: 19->1|23->1|24->3|25->4|25->4|25->4|27->6|27->6|27->6|27->6|27->6|27->6|27->6|27->6|27->6|34->13|34->13|35->14|35->14|35->14|36->15|36->15|36->15|37->16|37->16|37->16|38->17|38->17|38->17|39->18|39->18|39->18|39->18|39->18|39->18|39->18|39->18|40->19|40->19|40->19|43->22|43->22|43->22|43->22|47->26|47->26|47->26|48->27|48->27|48->27|50->29|52->31|52->31|52->31|52->31|56->35|56->35|56->35|57->36|57->36|57->36|57->36|57->36|57->36|57->36|58->37|58->37|58->37|58->37|58->37|58->37|58->37|59->38|59->38|59->38|59->38|59->38|59->38|59->38|61->40|63->42|63->42|63->42|63->42|64->43|64->43|64->43|65->44|66->45|66->45|66->45|69->48
                    -- GENERATED --
                */
            