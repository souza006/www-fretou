package controllers;

import play.mvc.*;
import javax.inject.Inject;
/**
 * This controller contains an action to handle HTTP requests
 * to the application's index page.
 */
public class IndexController extends Controller {

    public Result index() {
        return ok(views.html.index.render());
    }

}
