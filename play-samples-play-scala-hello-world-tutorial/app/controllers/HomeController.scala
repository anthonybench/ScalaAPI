//=====================================
// Animal Crossing API Controller
//      - Isaac Yep; CS 557
//=====================================
package controllers
// Base Dependencies
import javax.inject._
import play.api._
import play.api.mvc._
// API Dependencies
import scala.collection.mutable
import play.api.libs.json._
import models._

// Stock/Test Controller
@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }
  
  def explore() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.explore())
  }
  
  def tutorial() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.tutorial())
  }
  

  // sleeepy test: tutorial part-1
  def getAll(): Action[AnyContent] = Action {
    NoContent
  }

  // sleepy test: adding view
  def getTest() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.test())
  }
}


// API Controller@Singleton
class VillagersController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

    private val villagers = new mutable.ListBuffer[Villager]()
    villagers += Villager(1, Personality.lazyy, Species.horse, "May 1st", "clip clawp", Hobby.play)
    villagers += Villager(2, Personality.peppy, Species.tiger, "August 27th", "growf", Hobby.fashion)

    implicit val villagerJson = Json.format[Villager]

    def getAll() = Action { implicit request: Request[AnyContent] =>
        if (villagers.isEmpty) {
            NoContent
        } else {
            Ok(Json.toJson(villagers))
        }
    }
}
