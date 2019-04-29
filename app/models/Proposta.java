package models;

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


}
