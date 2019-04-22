package controllers;

import play.mvc.*;
import javax.inject.Inject;
/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class AnuncioController extends Controller {

   /*
    * @method: index
    * @param: none
    * @result: Mostra a view com todos os dados do anúncio.
   */

    public Result index() {
        return ok(views.html.pages.home.render());
    }

   /*
    * @method: show
    * @param: String slug
    * @result: Mostra a view de um anúncio específico.
   */

    public Result show(String slug) {
        return ok("Handling HTTP GET to update an anuncio.");
    }

   /*
    * @method: create
    * @param: none
    * @result: POST para enviar os dados por HTTP com as informações do anúncio
   */

    public Result create() {
        return ok("Handlig HTTP GET to show the view to create an anuncio.");
    }

   /*
    * @method: store
    * @param: none
    * @result: Sessão para salvar os dados do anúncio.
   */

    public Result store() {
        return ok("Handling HTTP POST to store anuncio");
    }

   /*
    * @method: edit
    * @param: int Id
    * @result: Página de editar o anuncio.
   */

    public Result edit(int id) {
        return ok("Handling HTTP GET to show the view to edit an anuncio.");
    }

   /*
    * @method: update
    * @param: int Id
    * @result: Função para controlar a requisição de atualização dos dados do anúncio
   */

    public Result update(int id) {
        return ok("Handling HTTP GET to update an anuncio.");
    }

   /*
    * @method: update
    * @param: int Id
    * @result: Função para controlar a requisição de atualização dos dados do anúncio
   */

    public Result update(int id) {
        return ok("Handling HTTP GET to update an anuncio.");
    }

}
