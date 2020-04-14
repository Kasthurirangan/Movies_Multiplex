// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/javasbt07/Downloads/multiplex_&_movies/conf/routes
// @DATE:Wed Apr 15 00:29:00 IST 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_5: controllers.HomeController,
  // @LINE:10
  MoviesController_0: controllers.MoviesController,
  // @LINE:20
  MultiplexController_3: controllers.MultiplexController,
  // @LINE:32
  SearchController_1: controllers.SearchController,
  // @LINE:34
  SearchRestController_2: controllers.SearchRestController,
  // @LINE:37
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_5: controllers.HomeController,
    // @LINE:10
    MoviesController_0: controllers.MoviesController,
    // @LINE:20
    MultiplexController_3: controllers.MultiplexController,
    // @LINE:32
    SearchController_1: controllers.SearchController,
    // @LINE:34
    SearchRestController_2: controllers.SearchRestController,
    // @LINE:37
    Assets_4: controllers.Assets
  ) = this(errorHandler, HomeController_5, MoviesController_0, MultiplexController_3, SearchController_1, SearchRestController_2, Assets_4, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_5, MoviesController_0, MultiplexController_3, SearchController_1, SearchRestController_2, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """movies""", """controllers.MoviesController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """movies/create""", """controllers.MoviesController.create(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """movies/show/""" + "$" + """id<[^/]+>""", """controllers.MoviesController.show(id:Integer, request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """movies/edit/""" + "$" + """id<[^/]+>""", """controllers.MoviesController.edit(id:Integer, request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """movies/delete/""" + "$" + """id<[^/]+>""", """controllers.MoviesController.delete(id:Integer, request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """movies/create""", """controllers.MoviesController.save(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """movies/edit""", """controllers.MoviesController.update(id:Integer, request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """multiplex""", """controllers.MultiplexController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """multiplex/create""", """controllers.MultiplexController.create(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """multiplex/alot_movie""", """controllers.MultiplexController.index_allocation"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """multiplex/alot_movie/""" + "$" + """multiplex_id<[^/]+>/""" + "$" + """name<[^/]+>/""" + "$" + """id<[^/]+>""", """controllers.MultiplexController.alotmovie(multiplex_id:Integer, name:String, id:Integer, request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """multiplex/show/""" + "$" + """id<[^/]+>""", """controllers.MultiplexController.show(id:Integer, requesy:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """multiplex/edit/""" + "$" + """id<[^/]+>""", """controllers.MultiplexController.edit(id:Integer, request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """multiplex/delete/""" + "$" + """id<[^/]+>""", """controllers.MultiplexController.delete(id:Integer, request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """multiplex/create""", """controllers.MultiplexController.save(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """multiplex/edit""", """controllers.MultiplexController.update(id:Integer, request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """multiplex/alot_movie/""" + "$" + """multiplex_id<[^/]+>/""" + "$" + """id<[^/]+>/""" + "$" + """movie_id<[^/]+>/""" + "$" + """timing<[^/]+>""", """controllers.MultiplexController.allocate_success_or_not(multiplex_id:Integer, id:Integer, movie_id:Integer, timing:String, request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search""", """controllers.SearchController.index(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search/socket""", """controllers.SearchController.socket"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/search""", """controllers.SearchRestController.search(search_value:String, multiplex_movie:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_5.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_MoviesController_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("movies")))
  )
  private[this] lazy val controllers_MoviesController_index1_invoker = createInvoker(
    MoviesController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MoviesController",
      "index",
      Nil,
      "GET",
      this.prefix + """movies""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_MoviesController_create2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("movies/create")))
  )
  private[this] lazy val controllers_MoviesController_create2_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      MoviesController_0.create(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MoviesController",
      "create",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """movies/create""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_MoviesController_show3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("movies/show/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MoviesController_show3_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      MoviesController_0.show(fakeValue[Integer], fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MoviesController",
      "show",
      Seq(classOf[Integer], classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """movies/show/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_MoviesController_edit4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("movies/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MoviesController_edit4_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      MoviesController_0.edit(fakeValue[Integer], fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MoviesController",
      "edit",
      Seq(classOf[Integer], classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """movies/edit/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_MoviesController_delete5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("movies/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MoviesController_delete5_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      MoviesController_0.delete(fakeValue[Integer], fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MoviesController",
      "delete",
      Seq(classOf[Integer], classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """movies/delete/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_MoviesController_save6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("movies/create")))
  )
  private[this] lazy val controllers_MoviesController_save6_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      MoviesController_0.save(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MoviesController",
      "save",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """movies/create""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_MoviesController_update7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("movies/edit")))
  )
  private[this] lazy val controllers_MoviesController_update7_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      MoviesController_0.update(fakeValue[Integer], fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MoviesController",
      "update",
      Seq(classOf[Integer], classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """movies/edit""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_MultiplexController_index8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("multiplex")))
  )
  private[this] lazy val controllers_MultiplexController_index8_invoker = createInvoker(
    MultiplexController_3.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MultiplexController",
      "index",
      Nil,
      "GET",
      this.prefix + """multiplex""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_MultiplexController_create9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("multiplex/create")))
  )
  private[this] lazy val controllers_MultiplexController_create9_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      MultiplexController_3.create(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MultiplexController",
      "create",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """multiplex/create""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_MultiplexController_index_allocation10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("multiplex/alot_movie")))
  )
  private[this] lazy val controllers_MultiplexController_index_allocation10_invoker = createInvoker(
    MultiplexController_3.index_allocation,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MultiplexController",
      "index_allocation",
      Nil,
      "GET",
      this.prefix + """multiplex/alot_movie""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_MultiplexController_alotmovie11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("multiplex/alot_movie/"), DynamicPart("multiplex_id", """[^/]+""",true), StaticPart("/"), DynamicPart("name", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MultiplexController_alotmovie11_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      MultiplexController_3.alotmovie(fakeValue[Integer], fakeValue[String], fakeValue[Integer], fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MultiplexController",
      "alotmovie",
      Seq(classOf[Integer], classOf[String], classOf[Integer], classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """multiplex/alot_movie/""" + "$" + """multiplex_id<[^/]+>/""" + "$" + """name<[^/]+>/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_MultiplexController_show12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("multiplex/show/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MultiplexController_show12_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      MultiplexController_3.show(fakeValue[Integer], fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MultiplexController",
      "show",
      Seq(classOf[Integer], classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """multiplex/show/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_MultiplexController_edit13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("multiplex/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MultiplexController_edit13_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      MultiplexController_3.edit(fakeValue[Integer], fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MultiplexController",
      "edit",
      Seq(classOf[Integer], classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """multiplex/edit/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_MultiplexController_delete14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("multiplex/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MultiplexController_delete14_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      MultiplexController_3.delete(fakeValue[Integer], fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MultiplexController",
      "delete",
      Seq(classOf[Integer], classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """multiplex/delete/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_MultiplexController_save15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("multiplex/create")))
  )
  private[this] lazy val controllers_MultiplexController_save15_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      MultiplexController_3.save(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MultiplexController",
      "save",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """multiplex/create""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_MultiplexController_update16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("multiplex/edit")))
  )
  private[this] lazy val controllers_MultiplexController_update16_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      MultiplexController_3.update(fakeValue[Integer], fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MultiplexController",
      "update",
      Seq(classOf[Integer], classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """multiplex/edit""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_MultiplexController_allocate_success_or_not17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("multiplex/alot_movie/"), DynamicPart("multiplex_id", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true), StaticPart("/"), DynamicPart("movie_id", """[^/]+""",true), StaticPart("/"), DynamicPart("timing", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MultiplexController_allocate_success_or_not17_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      MultiplexController_3.allocate_success_or_not(fakeValue[Integer], fakeValue[Integer], fakeValue[Integer], fakeValue[String], fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MultiplexController",
      "allocate_success_or_not",
      Seq(classOf[Integer], classOf[Integer], classOf[Integer], classOf[String], classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """multiplex/alot_movie/""" + "$" + """multiplex_id<[^/]+>/""" + "$" + """id<[^/]+>/""" + "$" + """movie_id<[^/]+>/""" + "$" + """timing<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_SearchController_index18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search")))
  )
  private[this] lazy val controllers_SearchController_index18_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      SearchController_1.index(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SearchController",
      "index",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """search""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_SearchController_socket19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search/socket")))
  )
  private[this] lazy val controllers_SearchController_socket19_invoker = createInvoker(
    SearchController_1.socket,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SearchController",
      "socket",
      Nil,
      "GET",
      this.prefix + """search/socket""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_SearchRestController_search20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/search")))
  )
  private[this] lazy val controllers_SearchRestController_search20_invoker = createInvoker(
    SearchRestController_2.search(fakeValue[String], fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SearchRestController",
      "search",
      Seq(classOf[String], classOf[Integer]),
      "GET",
      this.prefix + """api/search""",
      """""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_Assets_versioned21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned21_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_5.index)
      }
  
    // @LINE:10
    case controllers_MoviesController_index1_route(params@_) =>
      call { 
        controllers_MoviesController_index1_invoker.call(MoviesController_0.index)
      }
  
    // @LINE:11
    case controllers_MoviesController_create2_route(params@_) =>
      call { 
        controllers_MoviesController_create2_invoker.call(
          req => MoviesController_0.create(req))
      }
  
    // @LINE:12
    case controllers_MoviesController_show3_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_MoviesController_show3_invoker.call(
          req => MoviesController_0.show(id, req))
      }
  
    // @LINE:13
    case controllers_MoviesController_edit4_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_MoviesController_edit4_invoker.call(
          req => MoviesController_0.edit(id, req))
      }
  
    // @LINE:14
    case controllers_MoviesController_delete5_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_MoviesController_delete5_invoker.call(
          req => MoviesController_0.delete(id, req))
      }
  
    // @LINE:15
    case controllers_MoviesController_save6_route(params@_) =>
      call { 
        controllers_MoviesController_save6_invoker.call(
          req => MoviesController_0.save(req))
      }
  
    // @LINE:16
    case controllers_MoviesController_update7_route(params@_) =>
      call(params.fromQuery[Integer]("id", None)) { (id) =>
        controllers_MoviesController_update7_invoker.call(
          req => MoviesController_0.update(id, req))
      }
  
    // @LINE:20
    case controllers_MultiplexController_index8_route(params@_) =>
      call { 
        controllers_MultiplexController_index8_invoker.call(MultiplexController_3.index)
      }
  
    // @LINE:21
    case controllers_MultiplexController_create9_route(params@_) =>
      call { 
        controllers_MultiplexController_create9_invoker.call(
          req => MultiplexController_3.create(req))
      }
  
    // @LINE:22
    case controllers_MultiplexController_index_allocation10_route(params@_) =>
      call { 
        controllers_MultiplexController_index_allocation10_invoker.call(MultiplexController_3.index_allocation)
      }
  
    // @LINE:23
    case controllers_MultiplexController_alotmovie11_route(params@_) =>
      call(params.fromPath[Integer]("multiplex_id", None), params.fromPath[String]("name", None), params.fromPath[Integer]("id", None)) { (multiplex_id, name, id) =>
        controllers_MultiplexController_alotmovie11_invoker.call(
          req => MultiplexController_3.alotmovie(multiplex_id, name, id, req))
      }
  
    // @LINE:24
    case controllers_MultiplexController_show12_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_MultiplexController_show12_invoker.call(
          req => MultiplexController_3.show(id, req))
      }
  
    // @LINE:25
    case controllers_MultiplexController_edit13_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_MultiplexController_edit13_invoker.call(
          req => MultiplexController_3.edit(id, req))
      }
  
    // @LINE:26
    case controllers_MultiplexController_delete14_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_MultiplexController_delete14_invoker.call(
          req => MultiplexController_3.delete(id, req))
      }
  
    // @LINE:27
    case controllers_MultiplexController_save15_route(params@_) =>
      call { 
        controllers_MultiplexController_save15_invoker.call(
          req => MultiplexController_3.save(req))
      }
  
    // @LINE:28
    case controllers_MultiplexController_update16_route(params@_) =>
      call(params.fromQuery[Integer]("id", None)) { (id) =>
        controllers_MultiplexController_update16_invoker.call(
          req => MultiplexController_3.update(id, req))
      }
  
    // @LINE:29
    case controllers_MultiplexController_allocate_success_or_not17_route(params@_) =>
      call(params.fromPath[Integer]("multiplex_id", None), params.fromPath[Integer]("id", None), params.fromPath[Integer]("movie_id", None), params.fromPath[String]("timing", None)) { (multiplex_id, id, movie_id, timing) =>
        controllers_MultiplexController_allocate_success_or_not17_invoker.call(
          req => MultiplexController_3.allocate_success_or_not(multiplex_id, id, movie_id, timing, req))
      }
  
    // @LINE:32
    case controllers_SearchController_index18_route(params@_) =>
      call { 
        controllers_SearchController_index18_invoker.call(
          req => SearchController_1.index(req))
      }
  
    // @LINE:33
    case controllers_SearchController_socket19_route(params@_) =>
      call { 
        controllers_SearchController_socket19_invoker.call(SearchController_1.socket)
      }
  
    // @LINE:34
    case controllers_SearchRestController_search20_route(params@_) =>
      call(params.fromQuery[String]("search_value", None), params.fromQuery[Integer]("multiplex_movie", None)) { (search_value, multiplex_movie) =>
        controllers_SearchRestController_search20_invoker.call(SearchRestController_2.search(search_value, multiplex_movie))
      }
  
    // @LINE:37
    case controllers_Assets_versioned21_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned21_invoker.call(Assets_4.versioned(path, file))
      }
  }
}
