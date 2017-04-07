
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Desktop/project/up-to-6-4-17/conf/routes
// @DATE:Fri Apr 07 16:31:03 IST 2017


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
