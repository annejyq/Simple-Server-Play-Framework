
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/yunqingjiang/Desktop/Max2App/conf/routes
// @DATE:Thu Jan 18 02:12:32 EST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def Add(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "add")
    }
  
    // @LINE:18
    def RequestExternalAPI(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "foursquare")
    }
  
    // @LINE:10
    def create(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "create")
    }
  
    // @LINE:20
    def ReadLocalFile(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "readlocal")
    }
  
    // @LINE:16
    def CountPeople(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "countpeople")
    }
  
    // @LINE:12
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "save")
    }
  
    // @LINE:14
    def CountColor(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "countcolor")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:24
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
