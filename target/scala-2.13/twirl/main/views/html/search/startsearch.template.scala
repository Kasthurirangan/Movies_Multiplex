
package views.html.search

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

object startsearch extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(url : String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<html>
    <head>
        <title> Search </title>
    </head>

    <body>
    <div class="search">
        <h2 style="margin-bottom: 20px">Search for Movie or Multiplex</h2>
        <div class="col-sm-4 col-sm-offset-4" style="text-align: center;
                margin: 0 auto">
            <div class="input-group mb-3">
                <input id="search" type="text" class="form-control" placeholder="Search" aria-label="Search" aria-describedby="basic-addon2">
                <div class="input-group-append">
                    <button id="sendButton" class="btn btn-primary" type="button">Search</button>
                </div>
            </div>
        </div>
        <form>
            <label class="radio-inline">
                <input type="radio" name="rad" value="1" checked>Movie
            </label>
            <label class="radio-inline">
                <input type="radio" name="rad" value="2">Multiplex
            </label>
        </form>
    </div>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
    <script>
                var webSocket;
                var search_value;
                var message;

                function init() """),format.raw/*35.33*/("""{"""),format.raw/*35.34*/("""
                    """),format.raw/*36.21*/("""initWebSocket();
                """),format.raw/*37.17*/("""}"""),format.raw/*37.18*/("""

                """),format.raw/*39.17*/("""function initWebSocket() """),format.raw/*39.42*/("""{"""),format.raw/*39.43*/("""
                    """),format.raw/*40.21*/("""webSocket = new WebSocket(""""),_display_(/*40.49*/url),format.raw/*40.52*/("""");
                    webSocket.onopen = onOpen;
                    webSocket.onclose = onClose;
                    webSocket.onmessage = onMessage;
                    webSocket.onerror = onError;
                """),format.raw/*45.17*/("""}"""),format.raw/*45.18*/("""

                """),format.raw/*47.17*/("""function onOpen(evt) """),format.raw/*47.38*/("""{"""),format.raw/*47.39*/("""
                    """),format.raw/*48.21*/("""writeToScreen("CONNECTED");
                """),format.raw/*49.17*/("""}"""),format.raw/*49.18*/("""

                """),format.raw/*51.17*/("""function onClose(evt) """),format.raw/*51.39*/("""{"""),format.raw/*51.40*/("""
                    """),format.raw/*52.21*/("""writeToScreen("DISCONNECTED");
                    appendMessageToView(":", "DISCONNECTED");
                """),format.raw/*54.17*/("""}"""),format.raw/*54.18*/("""

                """),format.raw/*56.17*/("""function onError(evt) """),format.raw/*56.39*/("""{"""),format.raw/*56.40*/("""
                    """),format.raw/*57.21*/("""writeToScreen("ERROR: " + evt.data);
                    writeToScreen("ERROR: " + JSON.stringify(evt));
                """),format.raw/*59.17*/("""}"""),format.raw/*59.18*/("""

                """),format.raw/*61.17*/("""function onMessage(evt) """),format.raw/*61.41*/("""{"""),format.raw/*61.42*/("""
                    """),format.raw/*62.21*/("""var receivedData = JSON.parse(evt.data);
                    console.log("New Data: ", receivedData);
                    listData(receivedData.body)
                    /*appendMessageToView("Server", receivedData.body[0].movieName);*/
                """),format.raw/*66.17*/("""}"""),format.raw/*66.18*/("""

                """),format.raw/*68.17*/("""function appendMessageToView(title, message) """),format.raw/*68.62*/("""{"""),format.raw/*68.63*/("""
                    """),format.raw/*69.21*/("""$("#messageContent").append("<p>" + title + ": " + message + "</p>");
                """),format.raw/*70.17*/("""}"""),format.raw/*70.18*/("""

                """),format.raw/*72.17*/("""function listData(data) """),format.raw/*72.41*/("""{"""),format.raw/*72.42*/("""
                    """),format.raw/*73.21*/("""for (i in data) """),format.raw/*73.37*/("""{"""),format.raw/*73.38*/("""
                        """),format.raw/*74.25*/("""if (message.multiplex_movie === "2") """),format.raw/*74.62*/("""{"""),format.raw/*74.63*/("""
                            """),format.raw/*75.29*/("""$("#messageContent").append("<div class=\"card mb-3\"><div class=\"card-body\"><h5 class=\"card-title\">Name of the Multiplex : " + data[i].name + "</h5><p class=\"card-text\">Address : " + data[i].address + "</p><p class=\"card-text\">Number of Screens : " + data[i].numberOfScreens + "</p><p class=\"card-text\">Now Screening : " + sublist(data[i].screens) + "</p></div></div>");
                        """),format.raw/*76.25*/("""}"""),format.raw/*76.26*/(""" """),format.raw/*76.27*/("""else """),format.raw/*76.32*/("""{"""),format.raw/*76.33*/("""
                            """),format.raw/*77.29*/("""$("#messageContent").append("<div class=\"card mb-3\"><div class=\"card-body\"><h5 class=\"card-title\">Movie Name : " + data[i].name + "</h5><p class=\"card-text\">Directed By : " + data[i].director + "</p><p class=\"card-text\">Release Date : " + data[i].releaseDate + "</p>" + sublist(data[i].screens) + "</div></div>");
                        """),format.raw/*78.25*/("""}"""),format.raw/*78.26*/("""

                    """),format.raw/*80.21*/("""}"""),format.raw/*80.22*/("""
                """),format.raw/*81.17*/("""}"""),format.raw/*81.18*/("""

                """),format.raw/*83.17*/("""function sublist(screenModel) """),format.raw/*83.47*/("""{"""),format.raw/*83.48*/("""
                    """),format.raw/*84.21*/("""/*var screen="";
                    for (i in screenModel)"""),format.raw/*85.43*/("""{"""),format.raw/*85.44*/("""
                        """),format.raw/*86.25*/("""console.log(screenModel[i].movie);
                        screen=screen+"Screen Number -> "+screenModel[i].screenNumber+" Movie -> "+screenModel[i].movie.movieName+",";
                    """),format.raw/*88.21*/("""}"""),format.raw/*88.22*/("""*/
                    return "";
                """),format.raw/*90.17*/("""}"""),format.raw/*90.18*/("""

                """),format.raw/*92.17*/("""function writeToScreen(message) """),format.raw/*92.49*/("""{"""),format.raw/*92.50*/("""
                    """),format.raw/*93.21*/("""console.log("New message: ", message);
                """),format.raw/*94.17*/("""}"""),format.raw/*94.18*/("""

                """),format.raw/*96.17*/("""function doSend(protocolMessage) """),format.raw/*96.50*/("""{"""),format.raw/*96.51*/("""
                    """),format.raw/*97.21*/("""if (webSocket.readyState === WebSocket.OPEN) """),format.raw/*97.66*/("""{"""),format.raw/*97.67*/("""
                        """),format.raw/*98.25*/("""writeToScreen("SENT: " + protocolMessage.message);
                        webSocket.send(JSON.stringify(protocolMessage));
                    """),format.raw/*100.21*/("""}"""),format.raw/*100.22*/(""" """),format.raw/*100.23*/("""else """),format.raw/*100.28*/("""{"""),format.raw/*100.29*/("""
                        """),format.raw/*101.25*/("""writeToScreen("Could not send data. Websocket is not open.");
                    """),format.raw/*102.21*/("""}"""),format.raw/*102.22*/("""
                """),format.raw/*103.17*/("""}"""),format.raw/*103.18*/("""

                """),format.raw/*105.17*/("""window.addEventListener("load", init, false);


                $("#sendButton").click(function () """),format.raw/*108.52*/("""{"""),format.raw/*108.53*/("""
                    """),format.raw/*109.21*/("""console.log("Submitting.");
                    newMessage();
                """),format.raw/*111.17*/("""}"""),format.raw/*111.18*/(""");

                $(window).on("keydown", function (e) """),format.raw/*113.54*/("""{"""),format.raw/*113.55*/("""
                    """),format.raw/*114.21*/("""if (e.which === 13) """),format.raw/*114.41*/("""{"""),format.raw/*114.42*/("""
                        """),format.raw/*115.25*/("""console.log("Enter pressed.");
                        newMessage();
                        return false;
                    """),format.raw/*118.21*/("""}"""),format.raw/*118.22*/("""
                """),format.raw/*119.17*/("""}"""),format.raw/*119.18*/(""");

                function newMessage() """),format.raw/*121.39*/("""{"""),format.raw/*121.40*/("""
                    """),format.raw/*122.21*/("""search_value = $("#search").val();
                    document.getElementById("search").value = "";
                    if ($.trim(search_value) === "") """),format.raw/*124.54*/("""{"""),format.raw/*124.55*/("""
                        """),format.raw/*125.25*/("""return false;
                    """),format.raw/*126.21*/("""}"""),format.raw/*126.22*/("""

                    """),format.raw/*128.21*/("""appendMessageToView("Search Result for ", search_value);

                    message = """),format.raw/*130.31*/("""{"""),format.raw/*130.32*/("""
                        """),format.raw/*131.25*/("""search_value: search_value,
                        multiplex_movie: $("input[name='rad']:checked").val()
                    """),format.raw/*133.21*/("""}"""),format.raw/*133.22*/(""";
                    console.log(message)

                    doSend(message);
                """),format.raw/*137.17*/("""}"""),format.raw/*137.18*/("""
        """),format.raw/*138.9*/("""</script>
    </body>
</html>"""))
      }
    }
  }

  def render(url:String): play.twirl.api.HtmlFormat.Appendable = apply(url)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (url) => apply(url)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-04-15T01:37:40.271891
                  SOURCE: /home/ramesh/Documents/Movies_Multiplex/app/views/search/startsearch.scala.html
                  HASH: b798c7d5e464f02e265ab5cdc1b5525545b80063
                  MATRIX: 921->1|1029->16|1056->17|2289->1222|2318->1223|2367->1244|2428->1277|2457->1278|2503->1296|2556->1321|2585->1322|2634->1343|2689->1371|2713->1374|2959->1592|2988->1593|3034->1611|3083->1632|3112->1633|3161->1654|3233->1698|3262->1699|3308->1717|3358->1739|3387->1740|3436->1761|3573->1870|3602->1871|3648->1889|3698->1911|3727->1912|3776->1933|3925->2054|3954->2055|4000->2073|4052->2097|4081->2098|4130->2119|4411->2372|4440->2373|4486->2391|4559->2436|4588->2437|4637->2458|4751->2544|4780->2545|4826->2563|4878->2587|4907->2588|4956->2609|5000->2625|5029->2626|5082->2651|5147->2688|5176->2689|5233->2718|5667->3124|5696->3125|5725->3126|5758->3131|5787->3132|5844->3161|6220->3509|6249->3510|6299->3532|6328->3533|6373->3550|6402->3551|6448->3569|6506->3599|6535->3600|6584->3621|6671->3680|6700->3681|6753->3706|6971->3896|7000->3897|7078->3947|7107->3948|7153->3966|7213->3998|7242->3999|7291->4020|7374->4075|7403->4076|7449->4094|7510->4127|7539->4128|7588->4149|7661->4194|7690->4195|7743->4220|7916->4364|7946->4365|7976->4366|8010->4371|8040->4372|8094->4397|8205->4479|8235->4480|8281->4497|8311->4498|8358->4516|8486->4615|8516->4616|8566->4637|8673->4715|8703->4716|8789->4773|8819->4774|8869->4795|8918->4815|8948->4816|9002->4841|9158->4968|9188->4969|9234->4986|9264->4987|9335->5029|9365->5030|9415->5051|9598->5205|9628->5206|9682->5231|9745->5265|9775->5266|9826->5288|9943->5376|9973->5377|10027->5402|10182->5528|10212->5529|10338->5626|10368->5627|10405->5636
                  LINES: 27->1|32->2|33->3|65->35|65->35|66->36|67->37|67->37|69->39|69->39|69->39|70->40|70->40|70->40|75->45|75->45|77->47|77->47|77->47|78->48|79->49|79->49|81->51|81->51|81->51|82->52|84->54|84->54|86->56|86->56|86->56|87->57|89->59|89->59|91->61|91->61|91->61|92->62|96->66|96->66|98->68|98->68|98->68|99->69|100->70|100->70|102->72|102->72|102->72|103->73|103->73|103->73|104->74|104->74|104->74|105->75|106->76|106->76|106->76|106->76|106->76|107->77|108->78|108->78|110->80|110->80|111->81|111->81|113->83|113->83|113->83|114->84|115->85|115->85|116->86|118->88|118->88|120->90|120->90|122->92|122->92|122->92|123->93|124->94|124->94|126->96|126->96|126->96|127->97|127->97|127->97|128->98|130->100|130->100|130->100|130->100|130->100|131->101|132->102|132->102|133->103|133->103|135->105|138->108|138->108|139->109|141->111|141->111|143->113|143->113|144->114|144->114|144->114|145->115|148->118|148->118|149->119|149->119|151->121|151->121|152->122|154->124|154->124|155->125|156->126|156->126|158->128|160->130|160->130|161->131|163->133|163->133|167->137|167->137|168->138
                  -- GENERATED --
              */
          