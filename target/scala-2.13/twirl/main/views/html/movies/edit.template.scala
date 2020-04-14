
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


Seq[Any](format.raw/*2.1*/("""
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
                  DATE: 2020-04-15T01:03:16.780693
                  SOURCE: /home/ramesh/Documents/Movies_Multiplex/app/views/movies/edit.scala.html
                  HASH: a29d0ceaa72410a562f5d69c518beb786b2ddb37
                  MATRIX: 966->1|1174->116|1201->117|1325->214|1340->220|1399->270|1438->271|1475->281|1490->287|1526->302|1563->312|1578->318|1635->354|1672->364|1687->370|1748->410|1785->420|1800->426|1861->466|1898->476|1913->482|1974->522|2011->532|2026->538|2083->574|2120->584|2200->633|2228->634
                  LINES: 27->1|32->2|33->3|40->10|40->10|40->10|40->10|41->11|41->11|41->11|42->12|42->12|42->12|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|48->18|49->19|50->20
                  -- GENERATED --
              */
          