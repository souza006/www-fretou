package models;

import java.util.*;

public class Anuncio {

    public int id;
    public int usuario_id;

    public Anuncio(int id, int usuario_id){
        this.id = id;
        this.usuario_id = usuario_id;
        this.propostas = new HashSet<>();
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void setUsuario_id(int usuario_id){
        this.usuario_id = usuario_id;
    }

    public int getUsuario_id(){
        return this.usuario_id;
    }

    private static Set<Anuncio> anuncios;
    private Set<Proposta> propostas;

    static {

        anuncios = new HashSet<>();
        anuncios.add(new Anuncio(1,1));
        anuncios.add(new Anuncio(3, 3) );
        anuncios.add(new Anuncio(46, 46) );
        anuncios.add(new Anuncio(16, 16) );
        anuncios.add(new Anuncio(543, 543) );
        anuncios.add(new Anuncio(21, 21) );
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

    public Set<Proposta> propostas () { return propostas; }

    private void generatePropostas()
    {
        this.propostas.add(new Proposta(this.id + 1, Proposta.STATUS_AGUARDANDO, 1, this.id) );
        this.propostas.add(new Proposta(this.id + 3, Proposta.STATUS_AGUARDANDO, 2531, this.id) );
        this.propostas.add(new Proposta(this.id + 46, Proposta.STATUS_AGUARDANDO, 2031, this.id) );
        this.propostas.add(new Proposta(this.id + 16, Proposta.STATUS_AGUARDANDO, 221, this.id) );
        this.propostas.add(new Proposta(this.id + 543, Proposta.STATUS_AGUARDANDO, 2135, this.id) );
        this.propostas.add(new Proposta(this.id + 21, Proposta.STATUS_AGUARDANDO, 3234, this.id) );

    }
}
