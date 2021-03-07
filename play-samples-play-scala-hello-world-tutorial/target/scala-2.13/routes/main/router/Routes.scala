// @GENERATOR:play-routes-compiler
// @SOURCE:/home/sleepyboy/ScalaAPI/play-samples-play-scala-hello-world-tutorial/conf/routes
// @DATE:Sun Mar 07 13:50:33 PST 2021

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_2: controllers.HomeController,
  // @LINE:13
  Assets_1: controllers.Assets,
  // @LINE:22
  VillagersController_0: controllers.VillagersController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_2: controllers.HomeController,
    // @LINE:13
    Assets_1: controllers.Assets,
    // @LINE:22
    VillagersController_0: controllers.VillagersController
  ) = this(errorHandler, HomeController_2, Assets_1, VillagersController_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, Assets_1, VillagersController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """explore""", """controllers.HomeController.explore"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tutorial""", """controllers.HomeController.tutorial"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """todo""", """controllers.HomeController.getAll"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """test""", """controllers.HomeController.getTest"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """myvillagers""", """controllers.VillagersController.getAll"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """villager/""" + "$" + """id<[^/]+>""", """controllers.VillagersController.getOne(id:Long)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_2.index,
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

  // @LINE:8
  private[this] lazy val controllers_HomeController_explore1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("explore")))
  )
  private[this] lazy val controllers_HomeController_explore1_invoker = createInvoker(
    HomeController_2.explore,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "explore",
      Nil,
      "GET",
      this.prefix + """explore""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_tutorial2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tutorial")))
  )
  private[this] lazy val controllers_HomeController_tutorial2_invoker = createInvoker(
    HomeController_2.tutorial,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "tutorial",
      Nil,
      "GET",
      this.prefix + """tutorial""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
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

  // @LINE:17
  private[this] lazy val controllers_HomeController_getAll4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("todo")))
  )
  private[this] lazy val controllers_HomeController_getAll4_invoker = createInvoker(
    HomeController_2.getAll,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getAll",
      Nil,
      "GET",
      this.prefix + """todo""",
      """ Test Routes""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_getTest5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("test")))
  )
  private[this] lazy val controllers_HomeController_getTest5_invoker = createInvoker(
    HomeController_2.getTest,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getTest",
      Nil,
      "GET",
      this.prefix + """test""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_VillagersController_getAll6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("myvillagers")))
  )
  private[this] lazy val controllers_VillagersController_getAll6_invoker = createInvoker(
    VillagersController_0.getAll,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VillagersController",
      "getAll",
      Nil,
      "GET",
      this.prefix + """myvillagers""",
      """ Sleepy Routes""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_VillagersController_getOne7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("villager/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_VillagersController_getOne7_invoker = createInvoker(
    VillagersController_0.getOne(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VillagersController",
      "getOne",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """villager/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_2.index)
      }
  
    // @LINE:8
    case controllers_HomeController_explore1_route(params@_) =>
      call { 
        controllers_HomeController_explore1_invoker.call(HomeController_2.explore)
      }
  
    // @LINE:9
    case controllers_HomeController_tutorial2_route(params@_) =>
      call { 
        controllers_HomeController_tutorial2_invoker.call(HomeController_2.tutorial)
      }
  
    // @LINE:13
    case controllers_Assets_versioned3_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:17
    case controllers_HomeController_getAll4_route(params@_) =>
      call { 
        controllers_HomeController_getAll4_invoker.call(HomeController_2.getAll)
      }
  
    // @LINE:18
    case controllers_HomeController_getTest5_route(params@_) =>
      call { 
        controllers_HomeController_getTest5_invoker.call(HomeController_2.getTest)
      }
  
    // @LINE:22
    case controllers_VillagersController_getAll6_route(params@_) =>
      call { 
        controllers_VillagersController_getAll6_invoker.call(VillagersController_0.getAll)
      }
  
    // @LINE:23
    case controllers_VillagersController_getOne7_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_VillagersController_getOne7_invoker.call(VillagersController_0.getOne(id))
      }
  }
}
