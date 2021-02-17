@Singleton
class TodoListController @Inject()(val controllerComponents: ControllerComponents)
extends BaseController {


    def getAll(): Action[AnyContent] = Action {
        NoContent
    }
}