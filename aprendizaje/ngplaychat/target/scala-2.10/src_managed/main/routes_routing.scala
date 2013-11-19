// @SOURCE:/Users/agc/Central/Desarrollo/AngularJS/aprendizaje/ngplaychat/conf/routes
// @HASH:0d1ee5a9457858138120897c661299519c018020
// @DATE:Fri Nov 15 17:58:27 CET 2013


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_ChatApplication_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_ChatApplication_chatFeed1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("chatFeed/"),DynamicPart("room", """[^/]+""",true))))
        

// @LINE:10
private[this] lazy val controllers_ChatApplication_postMessage2 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("chat"))))
        

// @LINE:13
private[this] lazy val controllers_Assets_at3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.ChatApplication.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """chatFeed/$room<[^/]+>""","""controllers.ChatApplication.chatFeed(room:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """chat""","""controllers.ChatApplication.postMessage"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_ChatApplication_index0(params) => {
   call { 
        invokeHandler(controllers.ChatApplication.index, HandlerDef(this, "controllers.ChatApplication", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_ChatApplication_chatFeed1(params) => {
   call(params.fromPath[String]("room", None)) { (room) =>
        invokeHandler(controllers.ChatApplication.chatFeed(room), HandlerDef(this, "controllers.ChatApplication", "chatFeed", Seq(classOf[String]),"GET", """""", Routes.prefix + """chatFeed/$room<[^/]+>"""))
   }
}
        

// @LINE:10
case controllers_ChatApplication_postMessage2(params) => {
   call { 
        invokeHandler(controllers.ChatApplication.postMessage, HandlerDef(this, "controllers.ChatApplication", "postMessage", Nil,"POST", """""", Routes.prefix + """chat"""))
   }
}
        

// @LINE:13
case controllers_Assets_at3(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     