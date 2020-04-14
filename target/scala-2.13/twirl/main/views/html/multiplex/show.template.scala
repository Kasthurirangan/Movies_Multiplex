
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
/*1.2*/import models.Multiplexmodels

object show extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[Multiplexmodels],Http.Request,play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(multiplexmodelsList : List[Multiplexmodels])(implicit request: Http.Request, messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.109*/("""

"""),format.raw/*4.1*/("""<html>
<head>
    <title> Showing one of the Multiplex </title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style>
    .rectangle """),format.raw/*9.16*/("""{"""),format.raw/*9.17*/("""
     """),format.raw/*10.6*/("""height: 50px;
     width: 100px;
     background-color: steelblue;
    """),format.raw/*13.5*/("""}"""),format.raw/*13.6*/("""
    """),format.raw/*14.5*/("""</style>
</head>

<body>
    <h1> Multiplex Info </h1>

    """),_display_(/*20.6*/for(multiplex <- multiplexmodelsList) yield /*20.43*/{_display_(Seq[Any](format.raw/*20.44*/("""
    """),format.raw/*21.5*/("""<p><a href = """),_display_(/*21.19*/routes/*21.25*/.MultiplexController.edit(multiplex.multiplex_id)),format.raw/*21.74*/(""">edit multiplex</a> "     "
        <a href = """),_display_(/*22.20*/routes/*22.26*/.MultiplexController.delete(multiplex.multiplex_id)),format.raw/*22.77*/(""">Delete multiplex</a> </p>

    <p> id       = """),_display_(/*24.21*/multiplex/*24.30*/.multiplex_id),format.raw/*24.43*/(""" """),format.raw/*24.44*/("""</p>
    <p> Name    = """),_display_(/*25.20*/multiplex/*25.29*/.Multiplexname),format.raw/*25.43*/(""" """),format.raw/*25.44*/("""</p>
    <p> Address = """),_display_(/*26.20*/multiplex/*26.29*/.address),format.raw/*26.37*/(""" """),format.raw/*26.38*/("""</p>
    <p> Number of screens = """),_display_(/*27.30*/multiplex/*27.39*/.num_of_screens),format.raw/*27.54*/("""</p>

    <p>------------------------------------------------------------------------------------------------------------------</p>

    <h2>Screens </h2>
    """),_display_(/*32.6*/for(i <- 1 to multiplex.num_of_screens) yield /*32.45*/{_display_(Seq[Any](format.raw/*32.46*/("""
        """),format.raw/*33.9*/("""<div class="rectangle"><a href="""),_display_(/*33.41*/routes/*33.47*/.MultiplexController.alotmovie(multiplex.multiplex_id,multiplex.Multiplexname, i)),format.raw/*33.128*/("""> Screen """),_display_(/*33.138*/i),format.raw/*33.139*/("""<br> Allot movie</a></div>
    """)))}),format.raw/*34.6*/("""
    """)))}),format.raw/*35.6*/("""
"""),format.raw/*36.1*/("""</body>
</html>"""))
      }
    }
  }

  def render(multiplexmodelsList:List[Multiplexmodels],request:Http.Request,messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(multiplexmodelsList)(request,messages)

  def f:((List[Multiplexmodels]) => (Http.Request,play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (multiplexmodelsList) => (request,messages) => apply(multiplexmodelsList)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-04-15T00:29:00.964
                  SOURCE: C:/Users/javasbt07/Downloads/multiplex_&_movies/app/views/multiplex/show.scala.html
                  HASH: 6af4f2a54d01f3a7fe5bd5d2a49431ba6ab84624
                  MATRIX: 621->1|1001->33|1204->140|1234->144|1430->313|1458->314|1492->321|1593->395|1621->396|1654->402|1747->469|1800->506|1839->507|1872->513|1913->527|1928->533|1998->582|2073->630|2088->636|2160->687|2237->737|2255->746|2289->759|2318->760|2370->785|2388->794|2423->808|2452->809|2504->834|2522->843|2551->851|2580->852|2642->887|2660->896|2696->911|2887->1076|2942->1115|2981->1116|3018->1126|3077->1158|3092->1164|3195->1245|3233->1255|3256->1256|3319->1289|3356->1296|3385->1298
                  LINES: 23->1|28->2|33->2|35->4|40->9|40->9|41->10|44->13|44->13|45->14|51->20|51->20|51->20|52->21|52->21|52->21|52->21|53->22|53->22|53->22|55->24|55->24|55->24|55->24|56->25|56->25|56->25|56->25|57->26|57->26|57->26|57->26|58->27|58->27|58->27|63->32|63->32|63->32|64->33|64->33|64->33|64->33|64->33|64->33|65->34|66->35|67->36
                  -- GENERATED --
              */
          