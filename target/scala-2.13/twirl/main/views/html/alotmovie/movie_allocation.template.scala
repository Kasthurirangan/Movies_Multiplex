
package views.html.alotmovie

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

object movie_allocation extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template7[List[Moviesmodels],Integer,Integer,String,List[String],Http.Request,play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(moviesmodelList : List[Moviesmodels], multiplex_id : Integer, id : Integer, name : String, movie_timing : List[String])(implicit request: Http.Request, messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.184*/("""

"""),format.raw/*3.1*/("""<html>
<head>
    <title> Allocation movie </title>
</head>

<body>
<h2>Allocation of screen for list of movies</h2>
<table width="100%" border="1">
    <thead>
    <th>MULTIPLEX NAME</th>
    <th>ID</th>
    <th>NAME</th>
    <th>CATEGORY</th>
    <th>PRODUCER</th>
    <th>DIRECTOR</th>
    <th>DATE</th>
    <th>SCREEN NUMBER</th>
    <th>MOVIE TIMING</th>
    </thead>
    <tbody>
    """),_display_(/*23.6*/for(movie <- moviesmodelList) yield /*23.35*/ {_display_(Seq[Any](format.raw/*23.37*/("""
    """),format.raw/*24.5*/("""<tr>
        <td>"""),_display_(/*25.14*/name),format.raw/*25.18*/("""</td>
        <td>"""),_display_(/*26.14*/movie/*26.19*/.id),format.raw/*26.22*/("""</td>
        <td>"""),_display_(/*27.14*/movie/*27.19*/.name),format.raw/*27.24*/("""</td>
        <td>"""),_display_(/*28.14*/movie/*28.19*/.category),format.raw/*28.28*/("""</td>
        <td>"""),_display_(/*29.14*/movie/*29.19*/.producer),format.raw/*29.28*/("""</td>
        <td>"""),_display_(/*30.14*/movie/*30.19*/.Director),format.raw/*30.28*/("""</td>
        <td>"""),_display_(/*31.14*/movie/*31.19*/.date),format.raw/*31.24*/("""</td>
        <td>"""),_display_(/*32.14*/id),format.raw/*32.16*/("""</td>
        <td>
        """),_display_(/*34.10*/for(timing <- movie_timing) yield /*34.37*/{_display_(Seq[Any](format.raw/*34.38*/("""
            """),format.raw/*35.13*/("""<p>  <a href = """),_display_(/*35.29*/routes/*35.35*/.MultiplexController.allocate_success_or_not(multiplex_id,id,movie.id, timing)),format.raw/*35.113*/(""">"""),_display_(/*35.115*/timing),format.raw/*35.121*/("""</a>   </p>
        """)))}),format.raw/*36.10*/("""
        """),format.raw/*37.9*/("""</td>
    </tr>
    """)))}),format.raw/*39.6*/("""
    """),format.raw/*40.5*/("""</tbody>
</table>
</body>
</html>"""))
      }
    }
  }

  def render(moviesmodelList:List[Moviesmodels],multiplex_id:Integer,id:Integer,name:String,movie_timing:List[String],request:Http.Request,messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(moviesmodelList,multiplex_id,id,name,movie_timing)(request,messages)

  def f:((List[Moviesmodels],Integer,Integer,String,List[String]) => (Http.Request,play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (moviesmodelList,multiplex_id,id,name,movie_timing) => (request,messages) => apply(moviesmodelList,multiplex_id,id,name,movie_timing)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-04-15T00:29:00.651
                  SOURCE: C:/Users/javasbt07/Downloads/multiplex_&_movies/app/views/alotmovie/movie_allocation.scala.html
                  HASH: 329f1319147fcd80950aab8d1739cc52f2c1b2d9
                  MATRIX: 1009->1|1287->183|1317->187|1753->597|1798->626|1838->628|1871->634|1917->653|1942->657|1989->677|2003->682|2027->685|2074->705|2088->710|2114->715|2161->735|2175->740|2205->749|2252->769|2266->774|2296->783|2343->803|2357->808|2387->817|2434->837|2448->842|2474->847|2521->867|2544->869|2601->899|2644->926|2683->927|2725->941|2768->957|2783->963|2883->1041|2913->1043|2941->1049|2994->1071|3031->1081|3084->1104|3117->1110
                  LINES: 27->1|32->1|34->3|54->23|54->23|54->23|55->24|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|65->34|65->34|65->34|66->35|66->35|66->35|66->35|66->35|66->35|67->36|68->37|70->39|71->40
                  -- GENERATED --
              */
          