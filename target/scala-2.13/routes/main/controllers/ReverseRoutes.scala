// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ramesh/Documents/Movies_Multiplex/conf/routes
// @DATE:Wed Apr 15 01:03:15 IST 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:37
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:37
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:34
  class ReverseSearchRestController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def search(search_value:String, multiplex_movie:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/search" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("search_value", search_value)), Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("multiplex_movie", multiplex_movie)))))
    }
  
  }

  // @LINE:10
  class ReverseMoviesController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "movies/create")
    }
  
    // @LINE:14
    def delete(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "movies/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:16
    def update(id:Integer): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "movies/edit" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("id", id)))))
    }
  
    // @LINE:13
    def edit(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "movies/edit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:12
    def show(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "movies/show/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:11
    def create(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "movies/create")
    }
  
    // @LINE:10
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "movies")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:20
  class ReverseMultiplexController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "multiplex/create")
    }
  
    // @LINE:26
    def delete(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "multiplex/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:29
    def allocate_success_or_not(multiplex_id:Integer, id:Integer, movie_id:Integer, timing:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "multiplex/alot_movie/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("multiplex_id", multiplex_id)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("movie_id", movie_id)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("timing", timing)))
    }
  
    // @LINE:28
    def update(id:Integer): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "multiplex/edit" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("id", id)))))
    }
  
    // @LINE:22
    def index_allocation(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "multiplex/alot_movie")
    }
  
    // @LINE:25
    def edit(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "multiplex/edit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:23
    def alotmovie(multiplex_id:Integer, name:String, id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "multiplex/alot_movie/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("multiplex_id", multiplex_id)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:24
    def show(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "multiplex/show/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:21
    def create(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "multiplex/create")
    }
  
    // @LINE:20
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "multiplex")
    }
  
  }

  // @LINE:32
  class ReverseSearchController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "search")
    }
  
    // @LINE:33
    def socket(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "search/socket")
    }
  
  }


}
