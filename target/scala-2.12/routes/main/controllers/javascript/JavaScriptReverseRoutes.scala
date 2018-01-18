
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/yunqingjiang/Desktop/Max2App/conf/routes
// @DATE:Thu Jan 18 02:12:32 EST 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def Add: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.Add",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "add"})
        }
      """
    )
  
    // @LINE:18
    def RequestExternalAPI: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.RequestExternalAPI",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "foursquare"})
        }
      """
    )
  
    // @LINE:10
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.create",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "create"})
        }
      """
    )
  
    // @LINE:20
    def ReadLocalFile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.ReadLocalFile",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "readlocal"})
        }
      """
    )
  
    // @LINE:16
    def CountPeople: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.CountPeople",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "countpeople"})
        }
      """
    )
  
    // @LINE:12
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "save"})
        }
      """
    )
  
    // @LINE:14
    def CountColor: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.CountColor",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "countcolor"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:24
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
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
