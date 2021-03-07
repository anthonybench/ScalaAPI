// @GENERATOR:play-routes-compiler
// @SOURCE:/home/sleepyboy/ScalaAPI/play-samples-play-scala-hello-world-tutorial/conf/routes
// @DATE:Sun Mar 07 13:50:33 PST 2021

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:22
  class ReverseVillagersController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def getAll(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "myvillagers")
    }
  
    // @LINE:23
    def getOne(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "villager/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def tutorial(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tutorial")
    }
  
    // @LINE:18
    def getTest(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "test")
    }
  
    // @LINE:17
    def getAll(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "todo")
    }
  
    // @LINE:8
    def explore(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "explore")
    }
  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:13
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
