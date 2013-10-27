
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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.Html = {
        _display_ {import securesocial.core.providers.utils.RoutesHelper


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*4.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*8.17*/title)),format.raw/*8.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/RoutesHelper/*9.66*/.bootstrapCssPath)),format.raw/*9.83*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*10.59*/RoutesHelper/*10.71*/.faviconPath)),format.raw/*10.83*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*11.54*/RoutesHelper/*11.66*/.customCssPath.getOrElse(""))),format.raw/*11.94*/("""">
        <script src=""""),_display_(Seq[Any](/*12.23*/RoutesHelper/*12.35*/.jqueryPath)),format.raw/*12.46*/("""" type="text/javascript"></script>
    </head>
    <body>
        <div class="navbar navbar-fixed-top">
            <div class="navbar-inner">
                <div class="container">
                    <span class="brand" >CrowdPower</span>
                </div>
            </div>
        </div>

        <div class="container" style="padding-top:30px">
            """),_display_(Seq[Any](/*24.14*/content)),format.raw/*24.21*/("""
        </div>
    </body>
</html>
"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.Html = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.Html) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Oct 10 23:03:58 PDT 2013
                    SOURCE: /Users/shrikar/Work/playscala/crowdsource/app/views/main.scala.html
                    HASH: e8e7ef102245d09116037517cbc1808ea5900ba7
                    MATRIX: 509->1|670->31|698->88|784->139|810->144|907->206|927->218|965->235|1062->296|1083->308|1117->320|1209->376|1230->388|1280->416|1341->441|1362->453|1395->464|1801->834|1830->841
                    LINES: 19->1|23->1|25->4|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|32->11|32->11|32->11|33->12|33->12|33->12|45->24|45->24
                    -- GENERATED --
                */
            