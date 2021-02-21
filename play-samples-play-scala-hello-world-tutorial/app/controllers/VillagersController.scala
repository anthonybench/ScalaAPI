//=====================================
// Animal Crossing API Controller
//      - Isaac Yep; CS 557
//=====================================

// Dependencies
package controllers
import javax.inject._
import play.api._
import play.api.mvc._
import scala.collection.mutable
import play.api.libs.json._

// Controller
@Singleton
class VillagersController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

    private val villagers = new mutable.ListBuffer[Villager]()
    villagers += Villager(1, lazyy, horse, "May 1st", "clip clawp", play)
    villagers += Villager(2, peppy, tiger, "August 27th", "growf", fashion)

    implicit val villagerJson = Json.format[Villager]

    def getAll() = Action { implicit request: Request[AnyContent] =>
        if (Villagers.isEmpty) {
            NoContent
        } else {
            Ok(Json.toJason(todoList))
        }
    }
}