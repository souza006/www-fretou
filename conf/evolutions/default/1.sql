# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table anuncio (
  id                            integer auto_increment not null,
  usuario_id                    integer not null,
  titulo                        varchar(255),
  categoria                     varchar(255),
  descricao                     varchar(255),
  origem                        varchar(255),
  destino                       varchar(255),
  peso                          double not null,
  valor                         double not null,
  data                          timestamp,
  constraint pk_anuncio primary key (id)
);


# --- !Downs

drop table if exists anuncio;

