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
import scalaz._, Scalaz._

// Stock/Test Controller
@Singleton
class HomeController @javax.inject.Inject()(cc: ControllerComponents) extends AbstractController(cc) {

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
class VillagersController @javax.inject.Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  // Villagers Start //
  private val villagers = new mutable.ListBuffer[Villager]()
  //~
  villagers += Villager(1, "Clyde", Personality.lazyy.toString, Species.horse.toString, "May 1st", "clip clawp", Hobby.play.toString)
  villagers += Villager(2, "Bangle", Personality.peppy.toString, Species.tiger.toString, "August 27th", "growf", Hobby.fashion.toString)
  villagers += Villager(3, "Buzz", Personality.cranky.toString, Species.eagle.toString, "December 7th", "captain", Hobby.nature.toString)
  villagers += Villager(4, "Tank", Personality.jock.toString, Species.rhino.toString, "May 6th", "kerPOW", Hobby.fitness.toString)
  villagers += Villager(5, "Sylvia", Personality.sisterly.toString, Species.kangaroo.toString, "May 3rd", "boing", Hobby.music.toString)
  villagers += Villager(6, "Rex", Personality.lazyy.toString, Species.lion.toString, "July 24th", "cool cat", Hobby.nature.toString)
  villagers += Villager(7, "Roscoe", Personality.cranky.toString, Species.horse.toString, "June 16th", "nay", Hobby.music.toString)
  villagers += Villager(8, "Rowan", Personality.jock.toString, Species.tiger.toString, "August 26th", "mango", Hobby.fitness.toString)
  villagers += Villager(9, "Norma", Personality.normal.toString, Species.cow.toString, "September 20th", "hoof hoo", Hobby.nature.toString)
  villagers += Villager(10, "Marina", Personality.normal.toString, Species.octopus.toString, "June 26th", "blurp", Hobby.music.toString)
  villagers += Villager(11, "Billy", Personality.jock.toString, Species.goat.toString, "March 25th", "dagnaabit", Hobby.play.toString)
  villagers += Villager(12, "Beau", Personality.lazyy.toString, Species.deer.toString, "April 5th", "saltlick", Hobby.nature.toString)
  villagers += Villager(13, "Ankha", Personality.snooty.toString, Species.cat.toString, "September 22nd", "me meow", Hobby.nature.toString)
  villagers += Villager(14, "Lucky", Personality.lazyy.toString, Species.dog.toString, "November 4th", "rrr-owch", Hobby.play.toString)
  villagers += Villager(15, "Broffina", Personality.snooty.toString, Species.chicken.toString, "October 24th", "cluckadoo", Hobby.music.toString)
  //~
  implicit val villagerJson = Json.format[Villager]
  // Villagers End //

  // localhost:9000/myvillagers
  def getAll() = Action { implicit request: Request[AnyContent] =>
      if (villagers.isEmpty) {
        NoContent
      } else {
        Ok(Json.toJson(villagers))
      }
  }

  // localhost:9000/villager
  def getOne( id:Long ) = Action { implicit request: Request[AnyContent] =>
    // Disjunction Utility
    def findVillager(villagerId:Long): Exception \/ mutable.ListBuffer[Villager] = {
      if (villagerId > 15) \/.left(new Exception("ID out of range!"))
      else {
        val foundVillager = new mutable.ListBuffer[Villager]()
        val villagerMatch = villagers.find(v => v.id == villagerId).head
        foundVillager += villagerMatch
        
        \/.right(foundVillager)
      }
    }
    
    Ok(Json.toJson(findVillager(id)))

  }
}
