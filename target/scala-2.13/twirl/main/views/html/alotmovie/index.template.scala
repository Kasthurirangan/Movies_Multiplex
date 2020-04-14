
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


Seq[Any](format.raw/*1.45*/("""

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
                  DATE: 2020-04-15T00:29:00.612
                  SOURCE: C:/Users/javasbt07/Downloads/multiplex_&_movies/app/views/alotmovie/index.scala.html
                  HASH: 24ee105aab3d69c12d72035803f92bb8bd975472
                  MATRIX: 932->1|1070->44|1100->48|1488->410|1542->448|1582->450|1615->456|1661->475|1681->486|1721->505|1768->525|1788->536|1818->545|1869->569|1889->580|1922->592|1969->612|1989->623|2020->633|2067->653|2087->664|2118->674|2165->694|2185->705|2220->719|2273->742|2306->748
                  LINES: 27->1|32->1|34->3|52->21|52->21|52->21|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|61->30|62->31
                  -- GENERATED --
              */
          