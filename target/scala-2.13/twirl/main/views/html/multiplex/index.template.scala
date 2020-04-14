
package views.html.multiplex

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Multiplexmodels],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(multiplexmodelsList : List[Multiplexmodels]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<html>
<head>
    <title> Multiplex info </title>
</head>

<body>
<h4><a href=""""),_display_(/*9.15*/routes/*9.21*/.MultiplexController.create()),format.raw/*9.50*/("""">Add New Multiplex</a></h4>

<h2>Multiplex in Catalogue</h2>
<table width="100%" border="1">
    <thead>
    <th>ID</th>
    <th>NAME</th>
    <th>ADDRESS</th>
    <th>NUMBER_OF_SCREENS</th>
    </thead>
    <tbody>
    """),_display_(/*20.6*/for(multiplex <- multiplexmodelsList) yield /*20.43*/ {_display_(Seq[Any](format.raw/*20.45*/("""
    """),format.raw/*21.5*/("""<tr>
        <td>"""),_display_(/*22.14*/multiplex/*22.23*/.multiplex_id),format.raw/*22.36*/("""</td>
        <td><a href = """),_display_(/*23.24*/routes/*23.30*/.MultiplexController.show(multiplex.multiplex_id)),format.raw/*23.79*/(""">"""),_display_(/*23.81*/multiplex/*23.90*/.Multiplexname),format.raw/*23.104*/("""</a></td>
        <td>"""),_display_(/*24.14*/multiplex/*24.23*/.address),format.raw/*24.31*/("""</td>
        <td>"""),_display_(/*25.14*/multiplex/*25.23*/.num_of_screens),format.raw/*25.38*/("""</td>
    </tr>
    """)))}),format.raw/*27.6*/("""
    """),format.raw/*28.5*/("""</tbody>
</table>
</body>
</html>"""))
      }
    }
  }

  def render(multiplexmodelsList:List[Multiplexmodels]): play.twirl.api.HtmlFormat.Appendable = apply(multiplexmodelsList)

  def f:((List[Multiplexmodels]) => play.twirl.api.HtmlFormat.Appendable) = (multiplexmodelsList) => apply(multiplexmodelsList)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-04-15T01:03:16.699080
                  SOURCE: /home/ramesh/Documents/Movies_Multiplex/app/views/multiplex/index.scala.html
                  HASH: 8ed7d46b220cdefa4293c534243664c33a36fb82
                  MATRIX: 933->1|1072->47|1099->48|1205->128|1219->134|1268->163|1516->385|1569->422|1609->424|1641->429|1686->447|1704->456|1738->469|1794->498|1809->504|1879->553|1908->555|1926->564|1962->578|2012->601|2030->610|2059->618|2105->637|2123->646|2159->661|2210->682|2242->687
                  LINES: 27->1|32->2|33->3|39->9|39->9|39->9|50->20|50->20|50->20|51->21|52->22|52->22|52->22|53->23|53->23|53->23|53->23|53->23|53->23|54->24|54->24|54->24|55->25|55->25|55->25|57->27|58->28
                  -- GENERATED --
              */
          