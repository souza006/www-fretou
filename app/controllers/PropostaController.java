package controllers;

import play.mvc.*;
import javax.inject.Inject;
/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class PropostaController extends Controller {

   /*
    * @method: index
    * @param: none
    * @result: Mostra a view com todos os dados do anúncio.
   */

    public Result index() {
        return ok(views.html.pages.home.render());
    }

   /*
    * @method: acompanhar
    * @param: int id
    * @result: Mostra a view com as informações de uma proposta para um anúncio.
   */

    public Result acompanhar(int id) {
        return ok("Handling HTTP GET to show the view of a proposta.");
    }

   /*
    * @method: verPropostas
    * @param: int id
    * @result: Mostra a view com todas as propostas de um anúncio.
   */

    public Result verPropostas(int id) {
        return ok("Handling HTTP GET to show the view of a proposta.");
    }

   /*
    * @method: realizar
    * @param: int id
    * @result: Função para pegar as informações do POST para realizar uma proposta
   */

    public Result realizar(int id) {
        return ok("Handling HTTP POST to send a proposta.");
    }

   /*
    * @method: ver
    * @param: int anuncio_id, int proposta_id
    * @result: Mostra a view com as informações de uma proposta específica para um anúncio. 
   */

    public Result ver(int anuncio_id, int proposta_id) {
        return ok("Handling HTTP GET to show the view of a proposta from an anuncio.");
    }

   /*
    * @method: responderProposta
    * @param: int anuncio_id, int proposta_id
    * @result: Função para pegar as informações do POST para responder uma proposta.
   */

    public Result responderProposta(int anuncio_id, int proposta_id) {
        return ok("Handling HTTP POST to show the view of a proposta from an anuncio.");
    }
}
