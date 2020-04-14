
package views.html.movies

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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Moviesmodels],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(moviesmodelList : List[Moviesmodels]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<html>
    <head>
        <title> Movie info </title>
    </head>

    <body>
        <h4><a href=""""),_display_(/*9.23*/routes/*9.29*/.MoviesController.create()),format.raw/*9.55*/("""">Add New Movies</a></h4>

        <h2>Movies in Catalogue</h2>
    <table width="100%" border="1">
        <thead>
        <th>ID</th>
        <th>NAME</th>
        <th>CATEGORY</th>
        <th>PRODUCER</th>
        <th>DIRECTOR</th>
        <th>DATE</th>
        </thead>
        <tbody>
        """),_display_(/*22.10*/for(movie <- moviesmodelList) yield /*22.39*/ {_display_(Seq[Any](format.raw/*22.41*/("""
            """),format.raw/*23.13*/("""<tr>
                <td>"""),_display_(/*24.22*/movie/*24.27*/.id),format.raw/*24.30*/("""</td>
                <td><a href = """),_display_(/*25.32*/routes/*25.38*/.MoviesController.show(movie.id)),format.raw/*25.70*/(""">"""),_display_(/*25.72*/movie/*25.77*/.name),format.raw/*25.82*/("""</a></td>
                <td>"""),_display_(/*26.22*/movie/*26.27*/.category),format.raw/*26.36*/("""</td>
                <td>"""),_display_(/*27.22*/movie/*27.27*/.producer),format.raw/*27.36*/("""</td>
                <td>"""),_display_(/*28.22*/movie/*28.27*/.Director),format.raw/*28.36*/("""</td>
                <td>"""),_display_(/*29.22*/movie/*29.27*/.date),format.raw/*29.32*/("""</td>
            </tr>
        """)))}),format.raw/*31.10*/("""
        """),format.raw/*32.9*/("""</tbody>
    </table>
    </body>
</html>"""))
      }
    }
  }

  def render(moviesmodelList:List[Moviesmodels]): play.twirl.api.HtmlFormat.Appendable = apply(moviesmodelList)

  def f:((List[Moviesmodels]) => play.twirl.api.HtmlFormat.Appendable) = (moviesmodelList) => apply(moviesmodelList)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-04-15T01:03:16.819968
                  SOURCE: /home/ramesh/Documents/Movies_Multiplex/app/views/movies/index.scala.html
                  HASH: aa18b937d89fe92be36eff38741a0979e9402da7
                  MATRIX: 927->1|1059->40|1086->41|1212->141|1226->147|1272->173|1599->473|1644->502|1684->504|1725->517|1778->543|1792->548|1816->551|1880->588|1895->594|1948->626|1977->628|1991->633|2017->638|2075->669|2089->674|2119->683|2173->710|2187->715|2217->724|2271->751|2285->756|2315->765|2369->792|2383->797|2409->802|2473->835|2509->844
                  LINES: 27->1|32->2|33->3|39->9|39->9|39->9|52->22|52->22|52->22|53->23|54->24|54->24|54->24|55->25|55->25|55->25|55->25|55->25|55->25|56->26|56->26|56->26|57->27|57->27|57->27|58->28|58->28|58->28|59->29|59->29|59->29|61->31|62->32
                  -- GENERATED --
              */
          