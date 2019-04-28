package controllers;

import play.mvc.*;
import javax.inject.Inject;
/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    public Result index() {
        return ok(views.html.pages.home.render());
    }

    public Result anuncio(int id){
        return ok(views.html.pages.anuncio.render(id));
    }

}
