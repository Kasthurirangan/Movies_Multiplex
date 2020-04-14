// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ramesh/Documents/Movies_Multiplex/conf/routes
// @DATE:Wed Apr 15 01:03:15 IST 2020


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
