// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ramesh/Documents/Movies_Multiplex/conf/routes
// @DATE:Wed Apr 15 01:03:15 IST 2020

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:37
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:37
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:34
  class ReverseSearchRestController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def search: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SearchRestController.search",
      """
        function(search_value0,multiplex_movie1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/search" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("search_value", search_value0), (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("multiplex_movie", multiplex_movie1)])})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseMoviesController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MoviesController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "movies/create"})
        }
      """
    )
  
    // @LINE:14
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MoviesController.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "movies/delete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:16
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MoviesController.update",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "movies/edit" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:13
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MoviesController.edit",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "movies/edit/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:12
    def show: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MoviesController.show",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "movies/show/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:11
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MoviesController.create",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "movies/create"})
        }
      """
    )
  
    // @LINE:10
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MoviesController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "movies"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
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

  // @LINE:20
  class ReverseMultiplexController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MultiplexController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "multiplex/create"})
        }
      """
    )
  
    // @LINE:26
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MultiplexController.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "multiplex/delete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:29
    def allocate_success_or_not: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MultiplexController.allocate_success_or_not",
      """
        function(multiplex_id0,id1,movie_id2,timing3) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "multiplex/alot_movie/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("multiplex_id", multiplex_id0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id1)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("movie_id", movie_id2)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("timing", timing3))})
        }
      """
    )
  
    // @LINE:28
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MultiplexController.update",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "multiplex/edit" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:22
    def index_allocation: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MultiplexController.index_allocation",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "multiplex/alot_movie"})
        }
      """
    )
  
    // @LINE:25
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MultiplexController.edit",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "multiplex/edit/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:23
    def alotmovie: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MultiplexController.alotmovie",
      """
        function(multiplex_id0,name1,id2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "multiplex/alot_movie/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("multiplex_id", multiplex_id0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("name", name1)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id2))})
        }
      """
    )
  
    // @LINE:24
    def show: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MultiplexController.show",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "multiplex/show/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:21
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MultiplexController.create",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "multiplex/create"})
        }
      """
    )
  
    // @LINE:20
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MultiplexController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "multiplex"})
        }
      """
    )
  
  }

  // @LINE:32
  class ReverseSearchController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SearchController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search"})
        }
      """
    )
  
    // @LINE:33
    def socket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SearchController.socket",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search/socket"})
        }
      """
    )
  
  }


}
