package models;

import java.util.*;

public class Usuario {

  public static String TIPO_CONTRATANTE = "contratante";
  public static String TIPO_FRETISTA = "fretista";

  private int id;
  private String tipo;
  private String nome;

  private static Set<Usuario> usuarios;



  public Usuario(int id, String tipo, String nome){
    this.id = id;
    this.tipo = tipo;
    this.nome = nome;
  }

  static {
    usuarios = new HashSet<>();

    usuarios.add(new Usuario(1, TIPO_CONTRATANTE, "Daniel Souza"));
    usuarios.add(new Usuario(11, TIPO_FRETISTA, "David Héricles"));
    usuarios.add(new Usuario(111, TIPO_CONTRATANTE, "Eduardo Riev"));
    usuarios.add(new Usuario(1111, TIPO_FRETISTA, "Elvis Silva"));
    usuarios.add(new Usuario(11111, TIPO_CONTRATANTE, "Esther Aragão"));
    usuarios.add(new Usuario(111111, TIPO_FRETISTA, "Hérikle Mesquita"));
  }

  public static Set<Usuario> all() {
    return usuarios;
  }

  public static Set<Usuario> filterByTipo(String tipo) {
    Set<Usuario> filtrados = new HashSet<>();
    for (Usuario usuario : usuarios)
      if (usuario.tipo.equals(tipo))
        filtrados.add(usuario);

    return filtrados;
  }

  public void setId(int id){
    this.id = id;
  }
  public int getId(){
    return this.id;
  }

  public void setTipo(String tipo){
    this.tipo = tipo;
  }

  public String getTipo(){
    return this.tipo;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getNome(){
    return this.nome;
  }

}
