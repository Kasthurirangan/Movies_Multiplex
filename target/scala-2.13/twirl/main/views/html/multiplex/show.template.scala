
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


Seq[Any](format.raw/*3.1*/("""
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
                  DATE: 2020-04-15T01:03:16.600681
                  SOURCE: /home/ramesh/Documents/Movies_Multiplex/app/views/multiplex/show.scala.html
                  HASH: b4226f7fb17537c33fd9b0e91a55c9389f8cb2f5
                  MATRIX: 621->1|1001->32|1202->140|1229->141|1420->305|1448->306|1481->312|1579->383|1607->384|1639->389|1726->450|1779->487|1818->488|1850->493|1891->507|1906->513|1976->562|2050->609|2065->615|2137->666|2212->714|2230->723|2264->736|2293->737|2344->761|2362->770|2397->784|2426->785|2477->809|2495->818|2524->826|2553->827|2614->861|2632->870|2668->885|2854->1045|2909->1084|2948->1085|2984->1094|3043->1126|3058->1132|3161->1213|3199->1223|3222->1224|3284->1256|3320->1262|3348->1263
                  LINES: 23->1|28->2|33->3|34->4|39->9|39->9|40->10|43->13|43->13|44->14|50->20|50->20|50->20|51->21|51->21|51->21|51->21|52->22|52->22|52->22|54->24|54->24|54->24|54->24|55->25|55->25|55->25|55->25|56->26|56->26|56->26|56->26|57->27|57->27|57->27|62->32|62->32|62->32|63->33|63->33|63->33|63->33|63->33|63->33|64->34|65->35|66->36
                  -- GENERATED --
              */
          