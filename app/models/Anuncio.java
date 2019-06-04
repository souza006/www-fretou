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
    private String titulo;
    private String categoria;
    private String descricao;
    private String origem ;
    private String destino;
    private Double peso;
    private Double valor;
    public Date data;

    public static Finder<Double, Anuncio> find = new Finder<>(Anuncio.class);

}
