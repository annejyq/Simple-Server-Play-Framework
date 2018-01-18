# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table contact (
  id                            integer auto_increment not null,
  name                          varchar(255),
  address                       varchar(255),
  zipcode                       varchar(255),
  number                        varchar(255),
  color                         varchar(255),
  constraint pk_contact primary key (id)
);


# --- !Downs

drop table if exists contact;

