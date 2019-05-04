package models;

import java.util.*;

public class Proposta {

  public static String STATUS_ACEITO = "aceito";
  public static String STATUS_AGUARDANDO = "aguardando";
  public static String STATUS_RECUSADO = "recusado";

  public int id;
  public String status;
  public int usuario_id;

  public Proposta(int id, String status, int usuario_id){
    this.id = id;
    this.status = status;
    this.usuario_id = usuario_id;
  }

  public void setId(int id){
    this.id = id;
  }

  public int getId(){
    return this.id;
  }

  public void aceitar()
  {
    this.status = STATUS_ACEITO;
  }

  public void recusar()
  {
    this.status = STATUS_RECUSADO;
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

  private static Set<Proposta> propostas;

  static {
    propostas = new HashSet<>();
    propostas.add(new Proposta(1, STATUS_AGUARDANDO, 1) );
    propostas.add(new Proposta(3,STATUS_AGUARDANDO, 2531) );
    propostas.add(new Proposta(46,STATUS_AGUARDANDO, 2031) );
    propostas.add(new Proposta(16,STATUS_AGUARDANDO, 221) );
    propostas.add(new Proposta(543,STATUS_AGUARDANDO, 2135) );
    propostas.add(new Proposta(21,STATUS_AGUARDANDO, 3234) );
  }

  public static Set<Proposta> all() {
    return propostas;
  }

  public static Proposta findById(int id) {
    for (Proposta proposta : propostas)
      if(proposta.id == id)
        return proposta;

      return null;
  }


}
