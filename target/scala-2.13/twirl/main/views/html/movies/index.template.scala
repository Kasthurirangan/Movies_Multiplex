
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


Seq[Any](format.raw/*1.40*/("""

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
                  DATE: 2020-04-15T00:29:00.803
                  SOURCE: C:/Users/javasbt07/Downloads/multiplex_&_movies/app/views/movies/index.scala.html
                  HASH: 4cb6a17d558377f8d1797566b13dfeb54c30817a
                  MATRIX: 927->1|1060->39|1090->43|1222->149|1236->155|1282->181|1622->494|1667->523|1707->525|1749->539|1803->566|1817->571|1841->574|1906->612|1921->618|1974->650|2003->652|2017->657|2043->662|2102->694|2116->699|2146->708|2201->736|2215->741|2245->750|2300->778|2314->783|2344->792|2399->820|2413->825|2439->830|2505->865|2542->875
                  LINES: 27->1|32->1|34->3|40->9|40->9|40->9|53->22|53->22|53->22|54->23|55->24|55->24|55->24|56->25|56->25|56->25|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|62->31|63->32
                  -- GENERATED --
              */
          