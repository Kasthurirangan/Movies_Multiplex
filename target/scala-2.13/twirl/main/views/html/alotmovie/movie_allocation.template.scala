
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


Seq[Any](format.raw/*2.1*/("""
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
                  DATE: 2020-04-15T01:03:16.905219
                  SOURCE: /home/ramesh/Documents/Movies_Multiplex/app/views/alotmovie/movie_allocation.scala.html
                  HASH: 902444a02ce99f81a20ef6039a5d56da4150aee7
                  MATRIX: 1009->1|1285->184|1312->185|1728->575|1773->604|1813->606|1845->611|1890->629|1915->633|1961->652|1975->657|1999->660|2045->679|2059->684|2085->689|2131->708|2145->713|2175->722|2221->741|2235->746|2265->755|2311->774|2325->779|2355->788|2401->807|2415->812|2441->817|2487->836|2510->838|2565->866|2608->893|2647->894|2688->907|2731->923|2746->929|2846->1007|2876->1009|2904->1015|2956->1036|2992->1045|3043->1066|3075->1071
                  LINES: 27->1|32->2|33->3|53->23|53->23|53->23|54->24|55->25|55->25|56->26|56->26|56->26|57->27|57->27|57->27|58->28|58->28|58->28|59->29|59->29|59->29|60->30|60->30|60->30|61->31|61->31|61->31|62->32|62->32|64->34|64->34|64->34|65->35|65->35|65->35|65->35|65->35|65->35|66->36|67->37|69->39|70->40
                  -- GENERATED --
              */
          