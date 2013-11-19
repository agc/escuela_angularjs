
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.17*/("""

<!DOCTYPE html>

<html>
<head>
    <title>"""),_display_(Seq[Any](/*7.13*/title)),format.raw/*7.18*/("""</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.50*/routes/*8.56*/.Assets.at("stylesheets/main.css"))),format.raw/*8.90*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.50*/routes/*9.56*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*9.99*/("""">

    <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*11.55*/routes/*11.61*/.Assets.at("images/favicon.png"))),format.raw/*11.93*/("""">

    <script src=""""),_display_(Seq[Any](/*13.19*/routes/*13.25*/.Assets.at("javascripts/angular.min.js"))),format.raw/*13.65*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*14.19*/routes/*14.25*/.Assets.at("javascripts/app.js"))),format.raw/*14.57*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*15.19*/routes/*15.25*/.Assets.at("javascripts/services.js"))),format.raw/*15.62*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*16.19*/routes/*16.25*/.Assets.at("javascripts/controllers.js"))),format.raw/*16.65*/(""""></script>

</head>
<body ng-app="sseChat">

<div ng-controller="ChatCtrl">

    <div id="header">
        Tu Nombre: <input type="text" name="user" id="userField" value="John Doe" ng-model="user" />

        <select ng-model="currentRoom" ng-change="setCurrentRoom(currentRoom)"
                ng-options="r.name for r in rooms" id="roomSelect"></select>
    </div>

    <div id="chat">
        <div class=""""),format.raw/*31.21*/("""{"""),format.raw/*31.22*/("""{"""),format.raw/*31.23*/("""msg.who"""),format.raw/*31.30*/("""}"""),format.raw/*31.31*/("""}"""),format.raw/*31.32*/(""" msg" ng-repeat="msg in msgs | limitTo:-10"
             ng-class="msg.user === 'Juliet' ? 'juliet' : msg.user !== user ? 'others' : ''">"""),format.raw/*32.94*/("""{"""),format.raw/*32.95*/("""{"""),format.raw/*32.96*/("""msg.time"""),format.raw/*32.104*/("""}"""),format.raw/*32.105*/("""}"""),format.raw/*32.106*/("""<br/>
            <strong>"""),format.raw/*33.21*/("""{"""),format.raw/*33.22*/("""{"""),format.raw/*33.23*/("""msg.user"""),format.raw/*33.31*/("""}"""),format.raw/*33.32*/("""}"""),format.raw/*33.33*/(""" says: </strong>"""),format.raw/*33.49*/("""{"""),format.raw/*33.50*/("""{"""),format.raw/*33.51*/("""msg.text"""),format.raw/*33.59*/("""}"""),format.raw/*33.60*/("""}"""),format.raw/*33.61*/("""<br/>
        </div>
    </div>

    <div id="footer">
        <form ng-submit="submitMsg()">
            <input type="text" name="chat" id="textField" ng-model="inputText"
                   placeholder="Say something" class="ng-pristine ng-valid input-block-level" />
            <input type="button" class="btn btn-primary" id="saySomething" value="Submit" ng-click="submitMsg()" />
        </form>
    </div>
</div>

</body>
</html>"""))}
    }
    
    def render(title:String): play.api.templates.HtmlFormat.Appendable = apply(title)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (title) => apply(title)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Nov 16 22:59:05 CET 2013
                    SOURCE: /Users/agc/Central/Desarrollo/AngularJS/aprendizaje/ngplaychat/app/views/index.scala.html
                    HASH: cac438f6482e405dbfcd025415a0e54db4092bb3
                    MATRIX: 556->1|665->16|745->61|771->66|864->124|878->130|933->164|1020->216|1034->222|1098->265|1192->323|1207->329|1261->361|1319->383|1334->389|1396->429|1462->459|1477->465|1531->497|1597->527|1612->533|1671->570|1737->600|1752->606|1814->646|2252->1056|2281->1057|2310->1058|2345->1065|2374->1066|2403->1067|2568->1204|2597->1205|2626->1206|2663->1214|2693->1215|2723->1216|2777->1242|2806->1243|2835->1244|2871->1252|2900->1253|2929->1254|2973->1270|3002->1271|3031->1272|3067->1280|3096->1281|3125->1282
                    LINES: 19->1|22->1|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|32->11|32->11|32->11|34->13|34->13|34->13|35->14|35->14|35->14|36->15|36->15|36->15|37->16|37->16|37->16|52->31|52->31|52->31|52->31|52->31|52->31|53->32|53->32|53->32|53->32|53->32|53->32|54->33|54->33|54->33|54->33|54->33|54->33|54->33|54->33|54->33|54->33|54->33|54->33
                    -- GENERATED --
                */
            