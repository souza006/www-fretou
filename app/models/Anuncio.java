package models;

import java.util.*;
import java.text.SimpleDateFormat;

import io.ebean.*;

import javax.persistence.*;

@Entity
public class Anuncio extends Model {

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

    @Id
    public Integer id;
    public Integer usuario_id;
    public String titulo;
    public String categoria;
    public String descricao;
    public String origem ;
    public String destino;
    public Double peso;
    public Double valor;
    public Date data;

    public String getDataFormatada() {
        return new SimpleDateFormat("dd/MM/yyyy hh:mm").format(this.data);
    }

    public static Finder<Double, Anuncio> find = new Finder<>(Anuncio.class);

}
