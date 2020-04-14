// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ramesh/Documents/Movies_Multiplex/conf/routes
// @DATE:Wed Apr 15 01:03:15 IST 2020

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseSearchRestController SearchRestController = new controllers.ReverseSearchRestController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseMoviesController MoviesController = new controllers.ReverseMoviesController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseMultiplexController MultiplexController = new controllers.ReverseMultiplexController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseSearchController SearchController = new controllers.ReverseSearchController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseSearchRestController SearchRestController = new controllers.javascript.ReverseSearchRestController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseMoviesController MoviesController = new controllers.javascript.ReverseMoviesController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseMultiplexController MultiplexController = new controllers.javascript.ReverseMultiplexController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseSearchController SearchController = new controllers.javascript.ReverseSearchController(RoutesPrefix.byNamePrefix());
  }

}
