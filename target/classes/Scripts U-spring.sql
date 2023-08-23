-- EJECUTAR PARA POBLAR LA BASE DE DATOS:

-- Insertar personas en "persona"
INSERT INTO persona (nombre, apellido, email, telefono) VALUES ('Juan', 'Pérez', 'juan@example.com', '1234567890');
INSERT INTO persona (nombre, apellido, email, telefono) VALUES ('Ricardo', 'Milos', 'richard@example.com','1234567890');
INSERT INTO persona (nombre, apellido, email, telefono) VALUES ('Jaime', 'Peralta', 'jaiper@example.com', '9876543210');
INSERT INTO persona (nombre, apellido, email, telefono) VALUES ('Juan', 'Sánchez', 'juancho@example.com', '5551234567');
INSERT INTO persona (nombre, apellido, email, telefono) VALUES ('Carlos', 'Gómez', 'carlos@example.com', '8765432109');
INSERT INTO persona (nombre, apellido, email, telefono) VALUES ('Patroclo', 'de Esparta', 'patroclo@example.com', '3543443479');
-- Insertar usuario "admin"
INSERT INTO usuario (username, password) VALUES ('admin', '$2a$10$hSr7D1ZW2Bjh.h5eTIZ3Gu0Eo79N9F3pF3XpFTrh6.XFulpd1w4h2');
-- Insertar usuario "user"
INSERT INTO usuario (username, password) VALUES ('user', '$2a$10$hSr7D1ZW2Bjh.h5eTIZ3Gu0Eo79N9F3pF3XpFTrh6.XFulpd1w4h2');
-- Insertar roles para "admin"
INSERT INTO rol (nombre, usuario_id) VALUES ('ROLE_ADMIN', 1);
-- Insertar roles para "admin-user"
INSERT INTO rol (nombre, usuario_id) VALUES ('ROLE_USER', 2);
-- Insertar roles para "user"
INSERT INTO rol (nombre, usuario_id) VALUES ('ROLE_USER', 2);

-- EJECUTAR DE SER NECESARIO:

-- Consultar en la base de datos
SELECT * FROM persona;
SELECT * FROM rol;
SELECT * FROM usuario;
-- Drop table
DROP TABLE persona;
DROP TABLE rol;
DROP TABLE usuario;


