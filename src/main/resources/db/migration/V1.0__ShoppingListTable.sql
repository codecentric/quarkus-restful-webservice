CREATE SEQUENCE hibernate_sequence START 1;

CREATE TABLE shoppinglist
(
  id   BIGINT,
  name VARCHAR(50) unique
);

CREATE TABLE shoppingitem
(
  id   BIGINT,
  amount FLOAT,
  incard BOOLEAN,
  name VARCHAR(50) unique ,
  shopping_list_id BIGINT
);

