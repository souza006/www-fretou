package models;

import java.util.*;
import java.text.SimpleDateFormat;

public class Proposta {

  public static String STATUS_ACEITA = "aceita";
  public static String STATUS_AGUARDANDO = "aguardando";
  public static String STATUS_RECUSADA = "recusada";

  public static int lastInsertedId = 1;

  public int id;
  public String status;
  public String descricao;
  public Date data;
  public int usuario_id;
  public Anuncio anuncio;

  public Proposta(int id, String status, String descricao, Date data, int usuario_id, Integer anuncio_id){
    this.id = id + Proposta.lastInsertedId++;
    this.status = status;
    this.usuario_id = usuario_id;
    this.descricao = descricao;
    this.data = data;
    this.anuncio = Anuncio.find.byId(anuncio_id.doubleValue());
  }

  public Proposta() {
    this.status = STATUS_AGUARDANDO;
  }

  static {
    propostas = new HashSet<>();
  }

  public void setId(int id){
    this.id = id;
  }

  public int getId(){
    return this.id;
  }

  public void setData(Date data){
    this.data = data;
  }

  public String getData(){
    String dt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(this.data);
    return dt;
  }

  public void aceitar()
  {
    this.status = STATUS_ACEITA;
  }

  public void recusar()
  {
    this.status = STATUS_RECUSADA;
  }

  public String getStatus(){
    return this.status;
  }

  public void setUsuario_id(int usuario_id){
    this.usuario_id = usuario_id;
  }

  public int getUsuario_id(){
    return this.usuario_id;
  }

  public void setDescricao(String descricao) { this.descricao = descricao; }

  public String getDescricao() { return this.descricao; }

  public Anuncio anuncio()
  {
    return anuncio;
  }

  private static Set<Proposta> propostas;
  public static Set<Proposta> all() {
    return propostas;
  }

  public static Set<Proposta> filterByStatus(String status) {
    Set<Proposta> filtradas = new HashSet<>();
    for (Proposta proposta : propostas)
      if (status.equals(proposta.status))
        filtradas.add(proposta);

    return filtradas;
  }

  public static Proposta findById(int id) {

    for (Proposta proposta : propostas)
      if(proposta.id == id)
        return proposta;

      return null;
  }


}
