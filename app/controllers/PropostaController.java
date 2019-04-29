package controllers;

import play.mvc.*;
import javax.inject.Inject;
import java.util.*;
import models.Proposta;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class PropostaController extends Controller {

   /*
    * @method: index
    * @param: none
    * @result: Mostra a view com todos os dados do anúncio.
    * @http: GET
   */

    public Result index() {
        /* Proposta p = new Proposta(1,"aguardando", 1); */
        HashMap<Integer, Proposta> p = new HashMap<Integer, Proposta>();
        p.put(1, new Proposta(1,"aguardando", 1) );
        p.put(2, new Proposta(3,"aguardando", 2531) );
        p.put(3, new Proposta(46,"aguardando", 2031) );
        p.put(4, new Proposta(16,"aguardando", 221) );
        p.put(5, new Proposta(543,"aguardando", 2135) );
        p.put(6, new Proposta(21,"aguardando", 3234) );

        return ok(views.html.pages.propostas.render(p));
    }

   /*
    * @method: acompanhar
    * @param: int id
    * @result: Mostra a view com as informações de uma proposta para um anúncio.
    * @http: GET
   */

    public Result acompanhar(int id) {
        return ok("Handling HTTP GET to show the view of a proposta.");
    }

   /*
    * @method: verPropostas
    * @param: int id
    * @result: Mostra a view com todas as propostas de um anúncio.
    * @http: GET
   */

    public Result verPropostas(int id) {
        return ok("Handling HTTP GET to show the view of a proposta.");
    }

   /*
    * @method: realizar
    * @param: int id
    * @result: Função para pegar as informações do POST para realizar uma proposta
    * @http: POST
   */

    public Result realizar(int id) {
        return ok("Handling HTTP POST to send a proposta.");
    }

   /*
    * @method: ver
    * @param: int anuncio_id, int proposta_id
    * @result: Mostra a view com as informações de uma proposta específica para um anúncio.
    * @http: GET
   */

    public Result ver(int proposta_id) {
        return ok(views.html.pages.proposta.render());
    }

   /*
    * @method: responderProposta
    * @param: int anuncio_id, int proposta_id
    * @result: Função para pegar as informações do POST para responder uma proposta.
    * @http: POST
   */

    public Result responderProposta(int proposta_id, String status) {
      HashMap<Integer, Proposta> p;
      Proposta atual = p.get(proposta_id);
      atual.setStatus = status;
      p.set(proposta_id)
        return ok();
    }
}
