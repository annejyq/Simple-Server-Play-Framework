
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/yunqingjiang/Desktop/Max2App/conf/routes
// @DATE:Thu Jan 18 02:12:32 EST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:24
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:24
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """add""", """controllers.HomeController.Add"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """create""", """controllers.HomeController.create"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """save""", """controllers.HomeController.save"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """countcolor""", """controllers.HomeController.CountColor"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """countpeople""", """controllers.HomeController.CountPeople"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """foursquare""", """controllers.HomeController.RequestExternalAPI"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """readlocal""", """controllers.HomeController.ReadLocalFile"""),
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
    HomeController_0.index,
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
  private[this] lazy val controllers_HomeController_Add1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("add")))
  )
  private[this] lazy val controllers_HomeController_Add1_invoker = createInvoker(
    HomeController_0.Add,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "Add",
      Nil,
      "POST",
      this.prefix + """add""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_create2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("create")))
  )
  private[this] lazy val controllers_HomeController_create2_invoker = createInvoker(
    HomeController_0.create,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "create",
      Nil,
      "GET",
      this.prefix + """create""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_save3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("save")))
  )
  private[this] lazy val controllers_HomeController_save3_invoker = createInvoker(
    HomeController_0.save,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "save",
      Nil,
      "POST",
      this.prefix + """save""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_CountColor4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("countcolor")))
  )
  private[this] lazy val controllers_HomeController_CountColor4_invoker = createInvoker(
    HomeController_0.CountColor,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "CountColor",
      Nil,
      "GET",
      this.prefix + """countcolor""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_CountPeople5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("countpeople")))
  )
  private[this] lazy val controllers_HomeController_CountPeople5_invoker = createInvoker(
    HomeController_0.CountPeople,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "CountPeople",
      Nil,
      "GET",
      this.prefix + """countpeople""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_RequestExternalAPI6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("foursquare")))
  )
  private[this] lazy val controllers_HomeController_RequestExternalAPI6_invoker = createInvoker(
    HomeController_0.RequestExternalAPI,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "RequestExternalAPI",
      Nil,
      "GET",
      this.prefix + """foursquare""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HomeController_ReadLocalFile7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("readlocal")))
  )
  private[this] lazy val controllers_HomeController_ReadLocalFile7_invoker = createInvoker(
    HomeController_0.ReadLocalFile,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "ReadLocalFile",
      Nil,
      "POST",
      this.prefix + """readlocal""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Assets_versioned8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned8_invoker = createInvoker(
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


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:8
    case controllers_HomeController_Add1_route(params@_) =>
      call { 
        controllers_HomeController_Add1_invoker.call(HomeController_0.Add)
      }
  
    // @LINE:10
    case controllers_HomeController_create2_route(params@_) =>
      call { 
        controllers_HomeController_create2_invoker.call(HomeController_0.create)
      }
  
    // @LINE:12
    case controllers_HomeController_save3_route(params@_) =>
      call { 
        controllers_HomeController_save3_invoker.call(HomeController_0.save)
      }
  
    // @LINE:14
    case controllers_HomeController_CountColor4_route(params@_) =>
      call { 
        controllers_HomeController_CountColor4_invoker.call(HomeController_0.CountColor)
      }
  
    // @LINE:16
    case controllers_HomeController_CountPeople5_route(params@_) =>
      call { 
        controllers_HomeController_CountPeople5_invoker.call(HomeController_0.CountPeople)
      }
  
    // @LINE:18
    case controllers_HomeController_RequestExternalAPI6_route(params@_) =>
      call { 
        controllers_HomeController_RequestExternalAPI6_invoker.call(HomeController_0.RequestExternalAPI)
      }
  
    // @LINE:20
    case controllers_HomeController_ReadLocalFile7_route(params@_) =>
      call { 
        controllers_HomeController_ReadLocalFile7_invoker.call(HomeController_0.ReadLocalFile)
      }
  
    // @LINE:24
    case controllers_Assets_versioned8_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned8_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
