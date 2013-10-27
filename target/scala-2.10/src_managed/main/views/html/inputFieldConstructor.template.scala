
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
object inputFieldConstructor extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[views.html.helper.FieldElements,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(elements: views.html.helper.FieldElements):play.api.templates.Html = {
        _display_ {import play.api.i18n._

import views.html.helper._


Seq[Any](format.raw/*1.45*/("""

"""),format.raw/*5.1*/("""
<div class="control-group """),_display_(Seq[Any](/*6.28*/elements/*6.36*/.args.get('_class))),format.raw/*6.54*/(""" """),_display_(Seq[Any](/*6.56*/if(elements.hasErrors)/*6.78*/ {_display_(Seq[Any](format.raw/*6.80*/("""error""")))})),format.raw/*6.86*/("""" id=""""),_display_(Seq[Any](/*6.93*/elements/*6.101*/.args.get('_id).getOrElse(elements.id + "_field"))),format.raw/*6.150*/("""">
    <label class="control-label" for=""""),_display_(Seq[Any](/*7.40*/elements/*7.48*/.id)),format.raw/*7.51*/("""">"""),_display_(Seq[Any](/*7.54*/elements/*7.62*/.label(elements.lang))),format.raw/*7.83*/("""</label>
    <div class="controls">
        """),_display_(Seq[Any](/*9.10*/elements/*9.18*/.input)),format.raw/*9.24*/("""
	"""),_display_(Seq[Any](/*10.3*/if( elements.hasErrors )/*10.27*/ {_display_(Seq[Any](format.raw/*10.29*/("""
            <span class="help-inline">"""),_display_(Seq[Any](/*11.40*/elements/*11.48*/.errors(elements.lang).mkString(", "))),format.raw/*11.85*/("""</span>
        """)))}/*12.11*/else/*12.16*/{_display_(Seq[Any](format.raw/*12.17*/("""
            <span class="help-block">"""),_display_(Seq[Any](/*13.39*/elements/*13.47*/.infos(elements.lang).mkString(", "))),format.raw/*13.83*/("""</span>
        """)))})),format.raw/*14.10*/("""
    </div>
</div>
"""))}
    }
    
    def render(elements:views.html.helper.FieldElements): play.api.templates.Html = apply(elements)
    
    def f:((views.html.helper.FieldElements) => play.api.templates.Html) = (elements) => apply(elements)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Oct 10 22:51:15 PDT 2013
                    SOURCE: /Users/shrikar/Work/playscala/crowdsource/app/views/inputFieldConstructor.scala.html
                    HASH: 47d55fa60055a960f7a3665ea571c71eb26d811e
                    MATRIX: 546->1|717->44|745->98|808->126|824->134|863->152|900->154|930->176|969->178|1006->184|1048->191|1065->199|1136->248|1213->290|1229->298|1253->301|1291->304|1307->312|1349->333|1429->378|1445->386|1472->392|1510->395|1543->419|1583->421|1659->461|1676->469|1735->506|1771->524|1784->529|1823->530|1898->569|1915->577|1973->613|2022->630
                    LINES: 19->1|25->1|27->5|28->6|28->6|28->6|28->6|28->6|28->6|28->6|28->6|28->6|28->6|29->7|29->7|29->7|29->7|29->7|29->7|31->9|31->9|31->9|32->10|32->10|32->10|33->11|33->11|33->11|34->12|34->12|34->12|35->13|35->13|35->13|36->14
                    -- GENERATED --
                */
            