
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


Seq[Any](format.raw/*1.4*/("""

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
                  DATE: 2020-04-15T00:29:00.697
                  SOURCE: C:/Users/javasbt07/Downloads/multiplex_&_movies/app/views/index.scala.html
                  HASH: 2fb78862e5d327921137671d369424739d25b981
                  MATRIX: 901->1|997->3|1027->7|1175->129|1189->135|1234->160|1306->205|1321->211|1370->239|1446->288|1461->294|1507->319
                  LINES: 27->1|32->1|34->3|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11
                  -- GENERATED --
              */
          