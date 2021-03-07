// @GENERATOR:play-routes-compiler
// @SOURCE:/home/sleepyboy/ScalaAPI/play-samples-play-scala-hello-world-tutorial/conf/routes
// @DATE:Sun Mar 07 13:50:33 PST 2021

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers.javascript {

  // @LINE:22
  class ReverseVillagersController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def getAll: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VillagersController.getAll",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "myvillagers"})
        }
      """
    )
  
    // @LINE:23
    def getOne: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VillagersController.getOne",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "villager/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def tutorial: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.tutorial",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tutorial"})
        }
      """
    )
  
    // @LINE:18
    def getTest: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getTest",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "test"})
        }
      """
    )
  
    // @LINE:17
    def getAll: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getAll",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "todo"})
        }
      """
    )
  
    // @LINE:8
    def explore: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.explore",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "explore"})
        }
      """
    )
  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:13
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
