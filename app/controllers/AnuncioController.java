package controllers;

import models.Anuncio;
import models.Proposta;
import models.Usuario;
import play.data.DynamicForm;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;
import javax.inject.Inject;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.text.SimpleDateFormat;


/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class AnuncioController extends Controller {

    @Inject
    FormFactory formFactory;

   /*
    * @method: index
    * @param: none
    * @result: Mostra a view com todos os dados do anúncio.
    * @http: GET
   */

    public Result index() {
        List<Anuncio> anuncios = Anuncio.find.all();

        return ok(views.html.pages.anuncios.render(anuncios));
    }

   /*
    * @method: show
    * @param: String slug
    * @result: Mostra a view de um anúncio específico.
    * @http: GET
   */

    public Result show(Integer id) {
        Form propostaForm = formFactory.form(Proposta.class);

        return ok(views.html.pages.anuncio.render(Anuncio.find.byId(id), propostaForm));
    }

   /*
    * @method: create
    * @param: none
    * @result: Mostra a view para criar um anúncio.
    * @http: GET
   */

    public Result create() {

        return ok(views.html.pages.criarAnuncio.render(Anuncio.CATEGORIAS, Usuario.filterByTipo(Usuario.TIPO_CONTRATANTE)));
    }

   /*
    * @method: store
    * @param: none
    * @result: Sessão para salvar os dados do anúncio vindo da página de criação.
    * @http: POST
   */

    public Result store() throws ParseException {
        DynamicForm anuncioForm = formFactory.form().bindFromRequest();

        //Date data = new SimpleDateFormat("yyyy-MM-dd").parse(anuncioForm.get("data").toString());
        Date data = new Date(System.currentTimeMillis());

        Anuncio anuncio = new Anuncio();

        anuncio.titulo = anuncioForm.get("titulo");
        anuncio.categoria = anuncioForm.get("categoria");
        anuncio.valor = Double.parseDouble(anuncioForm.get("valor"));
        anuncio.peso = Double.parseDouble(anuncioForm.get("peso"));
        anuncio.descricao = anuncioForm.get("descricao");
        anuncio.origem = anuncioForm.get("origem");
        anuncio.destino = anuncioForm.get("destino");
        anuncio.usuario_id = Integer.parseInt(anuncioForm.get("usuario_id"));
        anuncio.data = data;

        anuncio.save();

        return redirect(routes.AnuncioController.index());
    }

   /*
    * @method: edit
    * @param: int Id
    * @result: Página de editar o anuncio.
    * @http: GET
   */

    public Result edit(int id) {
        return ok("Handling HTTP GET to show the view to edit an anuncio.");
    }

   /*
    * @method: update
    * @param: int Id
    * @result: Função para controlar a requisição de atualização dos dados do anúncio
    * @http: PATCH
   */

    public Result update(int id) {
        return ok("Handling HTTP PATCH to update an anuncio.");
    }

    /*
     * @method: realizar
     * @param: int id
     * @result: Função para enviar a requisição e realizar uma negociação.
     * @http: POST
     */

    public Result realizar(int id) {
        return ok("Handling HTTP POST to realizar proposta a um anuncio");
    }
}
