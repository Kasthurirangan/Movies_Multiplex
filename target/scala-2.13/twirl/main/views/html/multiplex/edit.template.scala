
package views.html.multiplex

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

object edit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[Multiplexmodels],Integer,Http.Request,play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(multiplexmodelsForm : Form[Multiplexmodels],id : Integer)(implicit request: Http.Request, messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.122*/("""

"""),format.raw/*3.1*/("""<html>
<head>
    <title> Edit Multiplex </title>
</head>

<body>
<h1> Edit Multiplex </h1>
"""),_display_(/*10.2*/helper/*10.8*/.form(action = routes.MultiplexController.update(id))/*10.61*/{_display_(Seq[Any](format.raw/*10.62*/("""
"""),_display_(/*11.2*/helper/*11.8*/.CSRF.formField),format.raw/*11.23*/("""
"""),_display_(/*12.2*/helper/*12.8*/.inputText(multiplexmodelsForm("Multiplexname"))),format.raw/*12.56*/("""
"""),_display_(/*13.2*/helper/*13.8*/.inputText(multiplexmodelsForm("address"))),format.raw/*13.50*/("""
"""),_display_(/*14.2*/helper/*14.8*/.inputText(multiplexmodelsForm("num_of_screens"))),format.raw/*14.57*/("""

"""),format.raw/*16.1*/("""<input type="Submit" value="Edit book">
""")))}),format.raw/*17.2*/("""
"""),format.raw/*18.1*/("""</body>
</html>"""))
      }
    }
  }

  def render(multiplexmodelsForm:Form[Multiplexmodels],id:Integer,request:Http.Request,messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(multiplexmodelsForm,id)(request,messages)

  def f:((Form[Multiplexmodels],Integer) => (Http.Request,play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (multiplexmodelsForm,id) => (request,messages) => apply(multiplexmodelsForm,id)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-04-15T00:29:00.903
                  SOURCE: C:/Users/javasbt07/Downloads/multiplex_&_movies/app/views/multiplex/edit.scala.html
                  HASH: 2b1c2060cf2d98af7995cbef36f677334636b1d9
                  MATRIX: 972->1|1188->121|1218->125|1344->225|1358->231|1420->284|1459->285|1488->288|1502->294|1538->309|1567->312|1581->318|1650->366|1679->369|1693->375|1756->417|1785->420|1799->426|1869->475|1900->479|1972->521|2001->523
                  LINES: 27->1|32->1|34->3|41->10|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|47->16|48->17|49->18
                  -- GENERATED --
              */
          