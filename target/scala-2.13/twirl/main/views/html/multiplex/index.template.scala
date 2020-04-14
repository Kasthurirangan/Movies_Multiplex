
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


Seq[Any](format.raw/*1.47*/("""

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
                  DATE: 2020-04-15T00:29:00.924
                  SOURCE: C:/Users/javasbt07/Downloads/multiplex_&_movies/app/views/multiplex/index.scala.html
                  HASH: 3f714737be6d9447de9fc06ac8ff3a9f8baf7b70
                  MATRIX: 933->1|1073->46|1103->50|1215->136|1229->142|1278->171|1537->404|1590->441|1630->443|1663->449|1709->468|1727->477|1761->490|1818->520|1833->526|1903->575|1932->577|1950->586|1986->600|2037->624|2055->633|2084->641|2131->661|2149->670|2185->685|2238->708|2271->714
                  LINES: 27->1|32->1|34->3|40->9|40->9|40->9|51->20|51->20|51->20|52->21|53->22|53->22|53->22|54->23|54->23|54->23|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|58->27|59->28
                  -- GENERATED --
              */
          