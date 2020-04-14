
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


Seq[Any](format.raw/*2.1*/("""
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
                  DATE: 2020-04-15T01:03:16.551568
                  SOURCE: /home/ramesh/Documents/Movies_Multiplex/app/views/multiplex/edit.scala.html
                  HASH: ff6d343ba443ff355f3469d6e4095ae83acd545a
                  MATRIX: 972->1|1186->122|1213->123|1332->216|1346->222|1408->275|1447->276|1475->278|1489->284|1525->299|1553->301|1567->307|1636->355|1664->357|1678->363|1741->405|1769->407|1783->413|1853->462|1882->464|1953->505|1981->506
                  LINES: 27->1|32->2|33->3|40->10|40->10|40->10|40->10|41->11|41->11|41->11|42->12|42->12|42->12|43->13|43->13|43->13|44->14|44->14|44->14|46->16|47->17|48->18
                  -- GENERATED --
              */
          