// @SOURCE:/Users/agc/Central/Desarrollo/AngularJS/aprendizaje/ngplaychat/conf/routes
// @HASH:0d1ee5a9457858138120897c661299519c018020
// @DATE:Fri Nov 15 17:58:27 CET 2013

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:13
class ReverseAssets {
    

// @LINE:13
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:10
// @LINE:9
// @LINE:6
class ReverseChatApplication {
    

// @LINE:9
def chatFeed(room:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "chatFeed/" + implicitly[PathBindable[String]].unbind("room", dynamicString(room)))
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:10
def postMessage(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "chat")
}
                                                
    
}
                          
}
                  


// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:13
class ReverseAssets {
    

// @LINE:13
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:10
// @LINE:9
// @LINE:6
class ReverseChatApplication {
    

// @LINE:9
def chatFeed : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ChatApplication.chatFeed",
   """
      function(room) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "chatFeed/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("room", encodeURIComponent(room))})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ChatApplication.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:10
def postMessage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ChatApplication.postMessage",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "chat"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:13
class ReverseAssets {
    

// @LINE:13
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:10
// @LINE:9
// @LINE:6
class ReverseChatApplication {
    

// @LINE:9
def chatFeed(room:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ChatApplication.chatFeed(room), HandlerDef(this, "controllers.ChatApplication", "chatFeed", Seq(classOf[String]), "GET", """""", _prefix + """chatFeed/$room<[^/]+>""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ChatApplication.index(), HandlerDef(this, "controllers.ChatApplication", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:10
def postMessage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ChatApplication.postMessage(), HandlerDef(this, "controllers.ChatApplication", "postMessage", Seq(), "POST", """""", _prefix + """chat""")
)
                      
    
}
                          
}
        
    