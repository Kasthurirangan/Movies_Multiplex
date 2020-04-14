
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


Seq[Any](format.raw/*3.1*/("""
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
                  DATE: 2020-04-15T01:03:16.836252
                  SOURCE: /home/ramesh/Documents/Movies_Multiplex/app/views/movies/create.scala.html
                  HASH: 32d3df5ce6f6401c4d6352cb9f9e5cf143e0dfcf
                  MATRIX: 960->1|1133->103|1177->119|1204->120|1315->205|1330->211|1385->257|1425->259|1458->265|1537->317|1552->323|1588->338|1625->348|1640->354|1782->474|1819->484|1834->490|1938->573|1975->583|1990->589|2094->672|2131->682|2146->688|2250->771|2287->781|2302->787|2440->903|2477->913|2565->971|2597->976
                  LINES: 27->1|30->2|33->3|34->4|41->11|41->11|41->11|41->11|43->13|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|49->19|49->19|50->20|50->20|50->20|52->22|54->24|55->25
                  -- GENERATED --
              */
          