
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
/*1.2*/import models.Moviesmodels

object show extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[Moviesmodels],Http.Request,play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(moviesmodels : List[Moviesmodels])(implicit request: Http.Request, messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.99*/("""

"""),format.raw/*4.1*/("""<html>
<head>
    <title> Showing one of the Movie </title>
</head>

<body>
    <h1> Movie Info </h1>
    """),_display_(/*11.6*/for(movie <- moviesmodels) yield /*11.32*/{_display_(Seq[Any](format.raw/*11.33*/("""
        """),format.raw/*12.9*/("""<p> id       = """),_display_(/*12.25*/movie/*12.30*/.id),format.raw/*12.33*/(""" """),format.raw/*12.34*/("""</p>
        <p> title    = """),_display_(/*13.25*/movie/*13.30*/.name),format.raw/*13.35*/(""" """),format.raw/*13.36*/("""</p>
        <p> category = """),_display_(/*14.25*/movie/*14.30*/.category),format.raw/*14.39*/(""" """),format.raw/*14.40*/("""</p>
        <p> Producer = """),_display_(/*15.25*/movie/*15.30*/.producer),format.raw/*15.39*/("""</p>
        <p> Director = """),_display_(/*16.25*/movie/*16.30*/.Director),format.raw/*16.39*/("""</p>
        <p> Date     = """),_display_(/*17.25*/movie/*17.30*/.date),format.raw/*17.35*/("""</p>

        <a href = """),_display_(/*19.20*/routes/*19.26*/.MoviesController.edit(movie.id)),format.raw/*19.58*/(""">edit movie</a>
        <a href = """),_display_(/*20.20*/routes/*20.26*/.MoviesController.delete(movie.id)),format.raw/*20.60*/(""">Delete movie</a>
        <button onclick="window.location.href = """),_display_(/*21.50*/routes/*21.56*/.MoviesController.edit(movie.id)),format.raw/*21.88*/(""";">Edit</button>
    """)))}),format.raw/*22.6*/("""
"""),format.raw/*23.1*/("""</body>
</html>"""))
      }
    }
  }

  def render(moviesmodels:List[Moviesmodels],request:Http.Request,messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(moviesmodels)(request,messages)

  def f:((List[Moviesmodels]) => (Http.Request,play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (moviesmodels) => (request,messages) => apply(moviesmodels)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-04-15T00:29:00.856
                  SOURCE: C:/Users/javasbt07/Downloads/multiplex_&_movies/app/views/movies/show.scala.html
                  HASH: d56383f1371434b3f9bfb0ed2a91508abdc1ae95
                  MATRIX: 618->1|992->30|1184->127|1214->131|1354->245|1396->271|1435->272|1472->282|1515->298|1529->303|1553->306|1582->307|1639->337|1653->342|1679->347|1708->348|1765->378|1779->383|1809->392|1838->393|1895->423|1909->428|1939->437|1996->467|2010->472|2040->481|2097->511|2111->516|2137->521|2191->548|2206->554|2259->586|2322->622|2337->628|2392->662|2487->730|2502->736|2555->768|2608->791|2637->793
                  LINES: 23->1|28->2|33->2|35->4|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|44->13|44->13|44->13|44->13|45->14|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|53->22|54->23
                  -- GENERATED --
              */
          