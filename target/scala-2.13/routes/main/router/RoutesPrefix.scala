// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/javasbt07/Downloads/multiplex_&_movies/conf/routes
// @DATE:Wed Apr 15 00:29:00 IST 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
