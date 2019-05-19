package models;

import java.util.*;

public class Anuncio {

    public int id;
    public int usuario_id;

    public Anuncio(int id, int usuario_id){
        this.id = id;
        this.usuario_id = usuario_id;
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

    static {
        anuncios = new HashSet<>();
        anuncios.add(new Anuncio(1,1) );
        anuncios.add(new Anuncio(3, 2531) );
        anuncios.add(new Anuncio(46, 2031) );
        anuncios.add(new Anuncio(16, 221) );
        anuncios.add(new Anuncio(543, 2135) );
        anuncios.add(new Anuncio(21, 3234) );
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
}
