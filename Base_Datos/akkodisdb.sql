CREATE DATABASE akkodisdb;

USE akkodisdb;

CREATE TABLE usuario (
  id INT PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(100),
  correo VARCHAR(100),
  fecha_nacimiento DATE,
  password VARCHAR(100)
);

INSERT INTO usuario (nombre, correo, fecha_nacimiento, password)
VALUES ('Marc', 'marc@akkodis.com', '1990-01-01', '1234');
