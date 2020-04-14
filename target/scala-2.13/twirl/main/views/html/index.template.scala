
package views.html

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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<html>
    <head>
      <title>  Welcome to movie management </title>
    </head>

    <body>
        <h4><a href=""""),_display_(/*9.23*/routes/*9.29*/.MoviesController.index()),format.raw/*9.54*/("""">Movie Info</a></h4>
        <h4><a href=""""),_display_(/*10.23*/routes/*10.29*/.MultiplexController.index()),format.raw/*10.57*/("""">Multiplex Info</a></h4>
        <h4><a href=""""),_display_(/*11.23*/routes/*11.29*/.SearchController.index()),format.raw/*11.54*/("""">Search management</a></h4>
    </body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-04-15T01:03:16.762344
                  SOURCE: /home/ramesh/Documents/Movies_Multiplex/app/views/index.scala.html
                  HASH: 03c1c56fb1db56aa9dd612e228c9345a49ee6680
                  MATRIX: 901->1|997->4|1024->5|1166->121|1180->127|1225->152|1296->196|1311->202|1360->230|1435->278|1450->284|1496->309
                  LINES: 27->1|32->2|33->3|39->9|39->9|39->9|40->10|40->10|40->10|41->11|41->11|41->11
                  -- GENERATED --
              */
          