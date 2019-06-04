package models;

import java.util.*;
import java.text.SimpleDateFormat;

public class Anuncio {

    public static String CATEGORIA_PERIGOSA = "perigosa";
    public static String CATEGORIA_PESADA = "pesada";
    public static String CATEGORIA_GRANEL = "granel";
    public static String CATEGORIA_NEOGRANEL = "neogranel";

    public static int lastInsertedId = 1;


    public static String[] CATEGORIAS = {
            CATEGORIA_PERIGOSA,
            CATEGORIA_PESADA,
            CATEGORIA_GRANEL,
            CATEGORIA_NEOGRANEL
    };

    public int id;
    public int usuario_id;
    private String titulo;
    private String categoria;
    private String descricao;
    private String origem ;
    private String destino;
    private double peso;
    private double valor;
    public Date data;

    public Anuncio(int id, String titulo, String categoria , double peso, double valor, String descricao,
                   String origem , String destino, int usuario_id, Date data){
        this.id = id;
        this.titulo = titulo;
        this.categoria = categoria;
        this.descricao = descricao;
        this.origem = origem;
        this.destino = destino;
        this.valor = valor;
        this.peso = peso;
        this.usuario_id = usuario_id;
        this.data = data;
        this.propostas = new HashSet<>();
        lastInsertedId = id;
    }

    public Anuncio()
    {
        this.id = lastInsertedId;
    }


    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }

    public void setUsuarioId(int usuario_id){
        this.usuario_id = usuario_id;
    }

    public int getUsuarioId(){
        return this.usuario_id;
    }

    public void setTitulo(String titulo) {this.titulo = titulo;}

    public String getTitulo() { return this.titulo; }

    public void setCategoria(String categoria) {this.categoria = categoria;}

    public String getCategoria() { return this.categoria; }

    public void setDescricao(String descricao) {this.descricao = descricao;}

    public String getDescricao() { return this.descricao; }

    public void setOrigem(String origem) {this.origem = origem;}

    public String getOrigem() { return this.origem; }

    public void setDestino(String destino) {this.destino = destino;}

    public String getDestino() { return this.destino; }

    public void setValor(double valor) {this.valor = valor;}

    public double getValor() { return this.valor; }

    public void setPeso(double peso) {this.peso = peso;}

    public double getPeso() { return this.peso; }

    public void setData(Date data) {this.data = data;}

    public String getData() { return new SimpleDateFormat("dd/MM/yyyy hh:mm").format(this.data); }

    private static Set<Anuncio> anuncios;
    private Set<Proposta> propostas;

    static {

        anuncios = new HashSet<>();

        // new Anuncio(int id, String titulo, String categoria , double peso , String descricao, double valor, String origem , String destino ,int usuario_id )

        anuncios.add(new Anuncio(lastInsertedId,"Carga d'água - " + 1, "Pesada- "  + 1, 0.25 ,  0.2 , "- oi tudobom -", "Casa" , "natal" , 1, new Date()));
        anuncios.add(new Anuncio(lastInsertedId + 1,"Nova caixinha - " + 1, "Pesada- "  + 1, 0.25 ,  0.2 , "- oi tudobom -", "Casa" , "natal" , 1, new Date()));
        anuncios.add(new Anuncio(lastInsertedId + 1,"meu deus do ceu - " + 1, "Pesada- "  + 1, 0.25 ,  0.2 , "- oi tudobom -", "Casa" , "natal" , 1, new Date()));
        anuncios.add(new Anuncio(lastInsertedId + 1,"Casa nova - " + 1, "Pesada- "  + 1, 0.25 ,  0.2 , "- oi tudobom -", "Casa" , "natal" , 1, new Date()));
        anuncios.add(new Anuncio(lastInsertedId + 1,"Cachorro vivo - " + 1, "Pesada- "  + 1, 0.25 ,  0.2 , "- oi tudobom -", "Casa" , "natal" , 1, new Date()));
        anuncios.add(new Anuncio(lastInsertedId + 1,"Corre manooo - " + 1, "Pesada- "  + 1, 0.25 ,  0.2 , "- oi tudobom -", "Casa" , "natal" , 1, new Date()));

        for (Anuncio anuncio: anuncios)
            anuncio.generatePropostas();
    }

    public static Set<Anuncio> all() {
        return anuncios;
    }

    public static Anuncio findById(int id) {

        for (Anuncio anuncio: anuncios)
            if(anuncio.id == id)
                return anuncio;

        return null;
    }

    public static void add(Anuncio a)
    {
        anuncios.add(a);
    }

    public void addProposta(Proposta proposta)
    {
        this.propostas.add(proposta);
    }

    public Set<Proposta> propostas() { return propostas; }

    private void generatePropostas()
    {
        this.propostas.add(new Proposta(this.id + 1, Proposta.STATUS_AGUARDANDO, "Lorem Ipsum", new Date(),1, this.id) );
        this.propostas.add(new Proposta(this.id + 3, Proposta.STATUS_AGUARDANDO, "Lorem Ipsum", new Date(),2531, this.id) );
        this.propostas.add(new Proposta(this.id + 46, Proposta.STATUS_AGUARDANDO, "Lorem Ipsum", new Date(),2031, this.id) );
        this.propostas.add(new Proposta(this.id + 16, Proposta.STATUS_AGUARDANDO, "Lorem Ipsum", new Date(),221, this.id) );
        this.propostas.add(new Proposta(this.id + 543, Proposta.STATUS_AGUARDANDO, "Lorem Ipsum", new Date(),2135, this.id) );
        this.propostas.add(new Proposta(this.id + 21, Proposta.STATUS_AGUARDANDO, "Lorem Ipsum", new Date(),3234, this.id) );

    }

    public static void criarAnuncio(Anuncio novo) {

    }
}
