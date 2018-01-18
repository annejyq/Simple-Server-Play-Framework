
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/yunqingjiang/Desktop/Max2App/conf/routes
// @DATE:Thu Jan 18 02:12:32 EST 2018


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
