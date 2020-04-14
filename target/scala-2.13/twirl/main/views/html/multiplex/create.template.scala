
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


Seq[Any](format.raw/*3.1*/("""
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
                  DATE: 2020-04-15T01:03:16.722436
                  SOURCE: /home/ramesh/Documents/Movies_Multiplex/app/views/multiplex/create.scala.html
                  HASH: b968212cda55cd4b5df1a9ae4ba818eed7846e36
                  MATRIX: 966->1|1146->110|1190->126|1217->127|1312->196|1326->202|1384->251|1424->253|1453->255|1526->302|1541->308|1577->323|1609->329|1624->335|1787->476|1819->482|1834->488|1948->580|1980->586|1995->592|2131->706|2164->712|2244->762|2272->763
                  LINES: 27->1|30->2|33->3|34->4|41->11|41->11|41->11|41->11|43->13|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|50->20|52->22|53->23
                  -- GENERATED --
              */
          