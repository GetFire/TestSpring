CREATE DATABASE spring;
-- -------------------------------
-- GOODS TABLE
-- -------------------------------

CREATE TABLE  IF NOT EXISTS public.goods (
  id INTEGER PRIMARY KEY NOT NULL,
  name CHARACTER VARYING(30),
  manufacturers CHARACTER VARYING(60),
  price BIGINT,
  description CHARACTER VARYING(300),
  url_logo CHARACTER VARYING(30)
);
CREATE UNIQUE INDEX goods_id_uindex ON public.goods (id);
-- -------------------------------
-- USERS TABLE
-- -------------------------------

CREATE TABLE IF NOT EXISTS public.users (
  id INTEGER PRIMARY KEY NOT NULL,
  first_name CHARACTER VARYING(30) NOT NULL,
  last_name CHARACTER VARYING(30) NOT NULL,
  user_type CHARACTER VARYING(30),
  login CHARACTER VARYING(30),
  email CHARACTER VARYING(30),
  phone CHARACTER VARYING(30),
  address CHARACTER VARYING(60),
  password CHARACTER VARYING(35) NOT NULL
);
CREATE UNIQUE INDEX users_id_uindex ON public.goods (id);