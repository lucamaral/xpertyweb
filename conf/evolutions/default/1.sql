# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table attribute (
  ID                        bigint auto_increment not null,
  NAME                      varchar(255),
  VALUE_TYPE                integer,
  IS_GOAL                   tinyint(1) default 0,
  QUESTION                  varchar(255),
  constraint ck_attribute_VALUE_TYPE check (VALUE_TYPE in (0,1,2)),
  constraint pk_attribute primary key (ID))
;

create table rule (
  ID                        bigint auto_increment not null,
  NAME                      varchar(255),
  EXPRESSION                varchar(255),
  constraint pk_rule primary key (ID))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table attribute;

drop table rule;

SET FOREIGN_KEY_CHECKS=1;

