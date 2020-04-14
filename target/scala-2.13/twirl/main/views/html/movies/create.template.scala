
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

object create extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[Moviesmodels],Http.Request,play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(moviesmodelForm : Form[Moviesmodels])(implicit request: Http.Request, messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.102*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<html>
    <head>
        <title> Movie Info  </title>
    </head>

    <body>

    """),_display_(/*11.6*/helper/*11.12*/.form(action = routes.MoviesController.save())/*11.58*/ {_display_(Seq[Any](format.raw/*11.60*/("""

    """),format.raw/*13.5*/("""<fieldset>
        <legend>Movies</legend>
        """),_display_(/*15.10*/helper/*15.16*/.CSRF.formField),format.raw/*15.31*/("""
        """),_display_(/*16.10*/helper/*16.16*/.inputText(moviesmodelForm("name"), Symbol("_label") -> "Enter movie Name", Symbol("placeholder") -> "Enter movie name")),format.raw/*16.136*/("""
        """),_display_(/*17.10*/helper/*17.16*/.inputText(moviesmodelForm("category"), Symbol("_label") -> "Enter movie Category")),format.raw/*17.99*/("""
        """),_display_(/*18.10*/helper/*18.16*/.inputText(moviesmodelForm("producer"), Symbol("_label") -> "Enter movie producer")),format.raw/*18.99*/("""
        """),_display_(/*19.10*/helper/*19.16*/.inputText(moviesmodelForm("Director"), Symbol("_label") -> "Enter movie Director")),format.raw/*19.99*/("""
        """),_display_(/*20.10*/helper/*20.16*/.inputText(moviesmodelForm("date"), Symbol("_label") -> "Enter release date", Symbol("placeholder") -> "MM/DD/YYYY")),format.raw/*20.132*/("""

        """),format.raw/*22.9*/("""<input type="submit" value="SAVE" />
    </fieldset>
    """)))}),format.raw/*24.6*/("""
    """),format.raw/*25.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(moviesmodelForm:Form[Moviesmodels],request:Http.Request,messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(moviesmodelForm)(request,messages)

  def f:((Form[Moviesmodels]) => (Http.Request,play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (moviesmodelForm) => (request,messages) => apply(moviesmodelForm)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-04-15T00:29:00.755
                  SOURCE: C:/Users/javasbt07/Downloads/multiplex_&_movies/app/views/movies/create.scala.html
                  HASH: 684c42070404be0ab4b416f7d9b87fab5e08ea69
                  MATRIX: 960->1|1133->104|1179->101|1207->121|1235->123|1353->215|1368->221|1423->267|1463->269|1498->277|1579->331|1594->337|1630->352|1668->363|1683->369|1825->489|1863->500|1878->506|1982->589|2020->600|2035->606|2139->689|2177->700|2192->706|2296->789|2334->800|2349->806|2487->922|2526->934|2616->994|2649->1000
                  LINES: 27->1|30->2|33->1|34->3|35->4|42->11|42->11|42->11|42->11|44->13|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|53->22|55->24|56->25
                  -- GENERATED --
              */
          