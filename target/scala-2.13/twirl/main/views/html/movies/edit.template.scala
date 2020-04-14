
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

object edit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[Moviesmodels],Integer,Http.Request,play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(moviesmodelsForm : Form[Moviesmodels],id : Integer)(implicit request: Http.Request, messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.116*/("""

"""),format.raw/*3.1*/("""<html>
<head>
    <title> Edit Movie </title>
</head>

<body>
    <h1> Edit Movie </h1>
        """),_display_(/*10.10*/helper/*10.16*/.form(action = routes.MoviesController.update(id))/*10.66*/{_display_(Seq[Any](format.raw/*10.67*/("""
        """),_display_(/*11.10*/helper/*11.16*/.CSRF.formField),format.raw/*11.31*/("""
        """),_display_(/*12.10*/helper/*12.16*/.inputText(moviesmodelsForm("name"))),format.raw/*12.52*/("""
        """),_display_(/*13.10*/helper/*13.16*/.inputText(moviesmodelsForm("category"))),format.raw/*13.56*/("""
        """),_display_(/*14.10*/helper/*14.16*/.inputText(moviesmodelsForm("producer"))),format.raw/*14.56*/("""
        """),_display_(/*15.10*/helper/*15.16*/.inputText(moviesmodelsForm("Director"))),format.raw/*15.56*/("""
        """),_display_(/*16.10*/helper/*16.16*/.inputText(moviesmodelsForm("date"))),format.raw/*16.52*/("""

        """),format.raw/*18.9*/("""<input type="Submit" value="Edit book">
        """)))}),format.raw/*19.10*/("""
"""),format.raw/*20.1*/("""</body>
</html>"""))
      }
    }
  }

  def render(moviesmodelsForm:Form[Moviesmodels],id:Integer,request:Http.Request,messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(moviesmodelsForm,id)(request,messages)

  def f:((Form[Moviesmodels],Integer) => (Http.Request,play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (moviesmodelsForm,id) => (request,messages) => apply(moviesmodelsForm,id)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-04-15T00:29:00.781
                  SOURCE: C:/Users/javasbt07/Downloads/multiplex_&_movies/app/views/movies/edit.scala.html
                  HASH: 9a25acd07878b84a5bdf6af73af506018a070854
                  MATRIX: 966->1|1176->115|1206->119|1337->223|1352->229|1411->279|1450->280|1488->291|1503->297|1539->312|1577->323|1592->329|1649->365|1687->376|1702->382|1763->422|1801->433|1816->439|1877->479|1915->490|1930->496|1991->536|2029->547|2044->553|2101->589|2140->601|2221->651|2250->653
                  LINES: 27->1|32->1|34->3|41->10|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|49->18|50->19|51->20
                  -- GENERATED --
              */
          