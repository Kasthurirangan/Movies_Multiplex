
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


Seq[Any](format.raw/*3.1*/("""
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
                  DATE: 2020-04-15T01:03:16.802304
                  SOURCE: /home/ramesh/Documents/Movies_Multiplex/app/views/movies/show.scala.html
                  HASH: 14cfe40eced963a638950efe57cd6767b5b99727
                  MATRIX: 618->1|992->29|1183->127|1210->128|1343->235|1385->261|1424->262|1460->271|1503->287|1517->292|1541->295|1570->296|1626->325|1640->330|1666->335|1695->336|1751->365|1765->370|1795->379|1824->380|1880->409|1894->414|1924->423|1980->452|1994->457|2024->466|2080->495|2094->500|2120->505|2172->530|2187->536|2240->568|2302->603|2317->609|2372->643|2466->710|2481->716|2534->748|2586->770|2614->771
                  LINES: 23->1|28->2|33->3|34->4|41->11|41->11|41->11|42->12|42->12|42->12|42->12|42->12|43->13|43->13|43->13|43->13|44->14|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|49->19|49->19|49->19|50->20|50->20|50->20|51->21|51->21|51->21|52->22|53->23
                  -- GENERATED --
              */
          