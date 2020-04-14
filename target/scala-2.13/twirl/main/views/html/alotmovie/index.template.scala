
package views.html.alotmovie

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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Alotmoviemodel],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(alotmoviemodelList : List[Alotmoviemodel]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<html>
<head>
    <title> Allocation movie info </title>
</head>

<body>

<h2>Allocation movies Catalogue</h2>
<table width="100%" border="1">
    <thead>
    <th>Movie Allocation id</th>
    <th>Movie id</th>
    <th>Multiplex id</th>
    <th>Screen Number</th>
    <th>Time range</th>
    <th>Aloted or not</th>
    </thead>
    <tbody>
    """),_display_(/*21.6*/for(alloc_movie <- alotmoviemodelList) yield /*21.44*/ {_display_(Seq[Any](format.raw/*21.46*/("""
    """),format.raw/*22.5*/("""<tr>
        <td>"""),_display_(/*23.14*/alloc_movie/*23.25*/.movieallocation_id),format.raw/*23.44*/("""</td>
        <td>"""),_display_(/*24.14*/alloc_movie/*24.25*/.movie_id),format.raw/*24.34*/("""</a></td>
        <td>"""),_display_(/*25.14*/alloc_movie/*25.25*/.mutiplex_id),format.raw/*25.37*/("""</td>
        <td>"""),_display_(/*26.14*/alloc_movie/*26.25*/.screen_no),format.raw/*26.35*/("""</td>
        <td>"""),_display_(/*27.14*/alloc_movie/*27.25*/.timerange),format.raw/*27.35*/("""</td>
        <td>"""),_display_(/*28.14*/alloc_movie/*28.25*/.aloted_or_not),format.raw/*28.39*/("""</td>
    </tr>
    """)))}),format.raw/*30.6*/("""
    """),format.raw/*31.5*/("""</tbody>
</table>
</body>
</html>"""))
      }
    }
  }

  def render(alotmoviemodelList:List[Alotmoviemodel]): play.twirl.api.HtmlFormat.Appendable = apply(alotmoviemodelList)

  def f:((List[Alotmoviemodel]) => play.twirl.api.HtmlFormat.Appendable) = (alotmoviemodelList) => apply(alotmoviemodelList)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-04-15T01:03:16.920776
                  SOURCE: /home/ramesh/Documents/Movies_Multiplex/app/views/alotmovie/index.scala.html
                  HASH: 02799fecc58db671a79082e11cc75cd709a112c6
                  MATRIX: 932->1|1069->45|1096->46|1466->390|1520->428|1560->430|1592->435|1637->453|1657->464|1697->483|1743->502|1763->513|1793->522|1843->545|1863->556|1896->568|1942->587|1962->598|1993->608|2039->627|2059->638|2090->648|2136->667|2156->678|2191->692|2242->713|2274->718
                  LINES: 27->1|32->2|33->3|51->21|51->21|51->21|52->22|53->23|53->23|53->23|54->24|54->24|54->24|55->25|55->25|55->25|56->26|56->26|56->26|57->27|57->27|57->27|58->28|58->28|58->28|60->30|61->31
                  -- GENERATED --
              */
          