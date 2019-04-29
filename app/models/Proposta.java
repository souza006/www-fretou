package models;

import java.util.*;

public class Proposta {

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

  public void setStatus(String status){
    this.status = status;
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
    propostas.add(new Proposta(1,"aguardando", 1) );
    propostas.add(new Proposta(3,"aguardando", 2531) );
    propostas.add(new Proposta(46,"aguardando", 2031) );
    propostas.add(new Proposta(16,"aguardando", 221) );
    propostas.add(new Proposta(543,"aguardando", 2135) );
    propostas.add(new Proposta(21,"aguardando", 3234) );
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
