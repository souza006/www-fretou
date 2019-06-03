package models;

import java.util.*;

public class Anuncio {

    public int id;
    public int usuario_id;
    public String titulo;
    public String categoria;
    public String descricao;
    public String origem ;
    public String destino;
    public double peso;
    public double valor;

    public Anuncio(int id, String titulo, String categoria , double peso , String descricao, double valor, String origem , String destino ,int usuario_id ){
        this.id = id;
        this.titulo = titulo;
        this.categoria = categoria;
        this.descricao = descricao;
        this.origem = origem;
        this.destino = destino;
        this.valor = valor;
        this.peso = peso;
        this.usuario_id = usuario_id;
        this.propostas = new HashSet<>();
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

    private static Set<Anuncio> anuncios;
    private Set<Proposta> propostas;

    static {

        anuncios = new HashSet<>();

        // new Anuncio(int id, String titulo, String categoria , double peso , String descricao, double valor, String origem , String destino ,int usuario_id )

        anuncios.add(new Anuncio(1,"Carga d'água - " + 1, "Pesada- "  + 1, 0.25 , "- oi tudobom -", 0.2 , "Casa" , "natal" , 1 ));
        /*anuncios.add(new Anuncio(3,"Anúncio - " + 3, "Descrição incrível - " + 3, 3) );
        anuncios.add(new Anuncio(46,"Anúncio - " + 46, "Descrição incrível - " + 46, 46) );
        anuncios.add(new Anuncio(16,"Anúncio - " + 16, "Descrição incrível - " + 16, 16) );
        anuncios.add(new Anuncio(543,"Anúncio - " + 543, "Descrição incrível - " + 543, 543) );
        anuncios.add(new Anuncio(21,"Anúncio - " + 21, "Descrição incrível - " + 21, 21) );**/
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