
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

object create extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[Multiplexmodels],Http.Request,play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(multiplexmodelsForm : Form[Multiplexmodels])(implicit request: Http.Request, messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.109*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<html>
<head>
    <title> Multiplex Info  </title>
</head>

<body>

"""),_display_(/*11.2*/helper/*11.8*/.form(action = routes.MultiplexController.save())/*11.57*/ {_display_(Seq[Any](format.raw/*11.59*/("""

"""),format.raw/*13.1*/("""<fieldset>
    <legend>Multiplex</legend>
    """),_display_(/*15.6*/helper/*15.12*/.CSRF.formField),format.raw/*15.27*/("""
    """),_display_(/*16.6*/helper/*16.12*/.inputText(multiplexmodelsForm("Multiplexname"), Symbol("_label") -> "Enter Multiplex Name", Symbol("placeholder") -> "Enter multiplex name")),format.raw/*16.153*/("""
    """),_display_(/*17.6*/helper/*17.12*/.inputText(multiplexmodelsForm("address"), Symbol("_label") -> "Enter Address of multiplex")),format.raw/*17.104*/("""
    """),_display_(/*18.6*/helper/*18.12*/.inputText(multiplexmodelsForm("num_of_screens"), Symbol("_label") -> "Enter number of screens in this multiplex")),format.raw/*18.126*/("""

    """),format.raw/*20.5*/("""<input type="submit" value="SAVE" />
</fieldset>
""")))}),format.raw/*22.2*/("""
"""),format.raw/*23.1*/("""</body>
</html>"""))
      }
    }
  }

  def render(multiplexmodelsForm:Form[Multiplexmodels],request:Http.Request,messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(multiplexmodelsForm)(request,messages)

  def f:((Form[Multiplexmodels]) => (Http.Request,play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (multiplexmodelsForm) => (request,messages) => apply(multiplexmodelsForm)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-04-15T00:29:00.883
                  SOURCE: C:/Users/javasbt07/Downloads/multiplex_&_movies/app/views/multiplex/create.scala.html
                  HASH: 63dfd59fe424d73674c1ea2aca17880d8e71ca39
                  MATRIX: 966->1|1146->111|1192->108|1220->128|1248->130|1350->206|1364->212|1422->261|1462->263|1493->267|1568->316|1583->322|1619->337|1652->344|1667->350|1830->491|1863->498|1878->504|1992->596|2025->603|2040->609|2176->723|2211->731|2293->783|2322->785
                  LINES: 27->1|30->2|33->1|34->3|35->4|42->11|42->11|42->11|42->11|44->13|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|51->20|53->22|54->23
                  -- GENERATED --
              */
          