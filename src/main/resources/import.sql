INSERT INTO regiones (nombre) VALUES ('Sudamérica');
INSERT INTO regiones (nombre) VALUES ('Centroamérica');
INSERT INTO regiones (nombre) VALUES ('Norteamérica');
INSERT INTO regiones (nombre) VALUES ('Europa');
INSERT INTO regiones (nombre) VALUES ('Asia');
INSERT INTO regiones (nombre) VALUES ('Africa');
INSERT INTO regiones (nombre) VALUES ('Oceanía');
INSERT INTO regiones (nombre) VALUES ('Antártida');

INSERT INTO clientes (region_id, nombre, apellido, email, created_at) VALUES (1, 'Ezequiel', 'Gavilán', 'ezegavilan95@gmail.com', '2019-05-06');
INSERT INTO clientes (region_id, nombre, apellido, email, created_at) VALUES (1, 'Roque', 'Lopez', 'roquel@gmail.com', '2019-05-06');
INSERT INTO clientes (region_id, nombre, apellido, email, created_at) VALUES (4, 'Manolo', 'Repaco', 'manolor@gmail.com', '2019-05-06');
INSERT INTO clientes (region_id, nombre, apellido, email, created_at) VALUES (1, 'Fernanda', 'Chima', 'fernandac@gmail.com', '2019-05-06');
INSERT INTO clientes (region_id, nombre, apellido, email, created_at) VALUES (3, 'Sofia', 'Chielse', 'sofiac@gmail.com', '2019-05-06');
INSERT INTO clientes (region_id, nombre, apellido, email, created_at) VALUES (4, 'Ron', 'Rabo', 'ronr@gmail.com', '2019-05-06');

INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('neritoo', '$2a$10$obNb0XUTfzck4rnxPyyW4O.tv9IdGw5EJtf9eXD9h37/xj3aENBRy' , true, 'Ezequiel', 'Gavilán', 'ezegavilan95@gmail.com' );
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('admin' , '$2a$10$itqKfcxtAJjO509QPlh/Neq6p/UQfsJd7VXzGPjfPqxdIz5Fg.fLC' , true, 'ADMIN', 'ADMIN', 'admin@aviato.com' );

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_roles (usuario_id, rol_id) VALUES (1, 1);
INSERT INTO usuarios_roles (usuario_id, rol_id) VALUES (2, 2);
INSERT INTO usuarios_roles (usuario_id, rol_id) VALUES (2, 1);


INSERT INTO productos (nombre, precio, fecha_creacion) VALUES ('Panasonic Pantalla LCD', 259990, NOW());
INSERT INTO productos (nombre, precio, fecha_creacion) VALUES ('Sony Camara digital DSC-W320B', 123490, NOW());
INSERT INTO productos (nombre, precio, fecha_creacion) VALUES ('Apple iPod shuffle', 1499990, NOW());
INSERT INTO productos (nombre, precio, fecha_creacion) VALUES ('Sony Notebook Z110', 37990, NOW());
INSERT INTO productos (nombre, precio, fecha_creacion) VALUES ('Hewlett Packard Multifuncional F2280', 69990, NOW());
INSERT INTO productos (nombre, precio, fecha_creacion) VALUES ('Bianchi Bicicleta Aro 26', 69990, NOW());
INSERT INTO productos (nombre, precio, fecha_creacion) VALUES ('Mica Comoda 5 Cajones', 299990, NOW());

INSERT INTO facturas (descripcion, observacion, cliente_id, fecha_creacion) VALUES ('Factura equipos de oficina', null, 1, NOW());
INSERT INTO factura_detalles(cantidad, factura_id, producto_id ) VALUES (1, 1, 1);
INSERT INTO factura_detalles(cantidad, factura_id, producto_id ) VALUES (2, 1, 4);
INSERT INTO factura_detalles(cantidad, factura_id, producto_id ) VALUES (1, 1, 5);
INSERT INTO factura_detalles(cantidad, factura_id, producto_id ) VALUES (1, 1, 7);

INSERT INTO facturas (descripcion, observacion, cliente_id, fecha_creacion) VALUES ('Factura bicicleta', 'Factura A', 1, NOW());
INSERT INTO factura_detalles(cantidad, factura_id, producto_id ) VALUES (1, 2, 6);


