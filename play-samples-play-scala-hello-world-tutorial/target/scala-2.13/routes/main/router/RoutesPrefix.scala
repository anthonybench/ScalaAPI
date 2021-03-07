// @GENERATOR:play-routes-compiler
// @SOURCE:/home/sleepyboy/ScalaAPI/play-samples-play-scala-hello-world-tutorial/conf/routes
// @DATE:Sun Mar 07 13:50:33 PST 2021


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
