CREATE DATABASE SistemaVentas;
USE SistemaVentas;

DROP TABLE clientes;
CREATE TABLE clientes (
    documento VARCHAR(50) PRIMARY KEY,
    nombre VARCHAR(50),
    tipoDocumento VARCHAR(10),
    direccion VARCHAR(255),
    telefono VARCHAR(20),
    email VARCHAR(100),
    tipoCliente VARCHAR(30),
    vendedor VARCHAR(40),
    estado VARCHAR(10),
    fechaIngreso DATE
);

SELECT * FROM clientes;

DROP TABLE empleados;
CREATE TABLE empleados (
    documento VARCHAR(50) PRIMARY KEY,
    tipodocumento VARCHAR(10), -- cedula o pasaporte
    nombre VARCHAR(50),
    apellido VARCHAR(50),
    contraseña VARCHAR(50),
    cargo VARCHAR(50), -- adm o emp
    direccion VARCHAR(255),
    telefono VARCHAR(20)
);

INSERT INTO empleados (documento, tipodocumento, nombre, apellido, contraseña, cargo, direccion, telefono) 
VALUES
('402-3125924-9', 'cedula', 'joseph', 'reyes', 'ledesma11', 'Administrador', 'Don Honorio', '8299438324'),
('371-6578298-9', 'cedula', 'cristian', 'ledesma', 'lede15', 'Administrador', 'San Isidro', '8297578394'),
('681-7285912-3', 'cedula', 'waston', 'romero', 'thewaston', 'Administrador', 'Don Honorio', '8297563847'),
('867-1823919-5', 'cedula', 'elfrank', 'kelly', 'elstrimer', 'Administrador', 'San Isidro', '8491726373'),
('728-3846718-9', 'cedula', 'freidy', 'nunez', 'freidynunez', 'Administrador', 'Villa Mella', '8298770493');

SELECT * FROM empleados;

DROP TABLE productos;
CREATE TABLE productos (
    id INT PRIMARY KEY,
    nombre VARCHAR(50),
    referencia VARCHAR(255),
    tipo VARCHAR(50),
    marca VARCHAR(30),
    cantidad INT,
    precio DECIMAL(10, 2)
);

SELECT * FROM productos;

DROP TABLE proveedores;
CREATE TABLE proveedores (
    rnc INT PRIMARY KEY,
    nombre VARCHAR(50),
    direccion VARCHAR(255),
    telefono VARCHAR(20),
    email VARCHAR(100),
    tipoProveedor VARCHAR(20)
);

SELECT * FROM proveedores;

DROP TABLE facturas;
CREATE TABLE facturas (
    id_factura INT PRIMARY KEY,
    fecha DATE,
    cliente VARCHAR(50),
    total DOUBLE,
    FOREIGN KEY (cliente) REFERENCES clientes(id_cliente)
);

DROP TABLE detalle_factura;
CREATE TABLE detalle_factura (
    id_detalle INT AUTO_INCREMENT PRIMARY KEY,
    id_factura INT,
    id_producto INT,
    cantidad INT,
    precio_unitario DOUBLE,
    FOREIGN KEY (id_factura) REFERENCES facturas(id_factura),
    FOREIGN KEY (id_producto) REFERENCES productos(id_producto)
);

/*
En caso de que si hagamos contabilidad en un futuro:

CREATE TABLE cuentas_por_pagar (
    id_pagar INT PRIMARY KEY,
    proveedor VARCHAR(100),
    monto DECIMAL(10, 2),
    fecha_vencimiento DATE
);

CREATE TABLE cuentas_por_cobrar (
    id_cobrar INT PRIMARY KEY,
    cliente VARCHAR(50),
    monto DECIMAL(10, 2),
    fecha_vencimiento DATE
);
*/