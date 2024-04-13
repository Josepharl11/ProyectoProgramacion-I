CREATE DATABASE SistemaVentas;
USE SistemaVentas;

CREATE TABLE clientes (
    id_cliente INT PRIMARY KEY,
    nombre VARCHAR(50),
    direccion VARCHAR(255),
    telefono VARCHAR(20),
    email VARCHAR(100)
);

DROP TABLE empleados;
CREATE TABLE empleados (
    cedula INT PRIMARY KEY,
    nombre VARCHAR(50),
    apellido VARCHAR(50),
    contraseña VARCHAR(50),
    cargo VARCHAR(50), -- adm o emp
    direccion VARCHAR(255),
    telefono VARCHAR(20),
    documento VARCHAR(100)
);

INSERT INTO empleados (id_empleado, nombre, apellido, contraseña, cargo, salario, direccion, telefono, email, fecha_nacimiento) 
VALUES
(1, 'joseph', 'reyes', 'ledesma11', 'Administrador', 50000.00,  'Don Honorio', '8299438324', 'josepharl11@gmail.com', '2004-07-11'),
(2, 'cristian', 'ledesma', 'lede15', 'Administrador', 55000.00, 'San Isidro', '8297578394', 'cristianlede@gmail.com', '2004-03-20'),
(3, 'waston', 'romero', 'thewaston', 'Administrador', 60000.00, 'Don Honorio', '8297563847', 'thewaston@gmail.com', '2003-05-24'),
(4, 'elfrank', 'kelly', 'elstrimer', 'Administrador', 62000.00, 'San Isidro', '8491726373', 'elfrank@gmail.com', '2002-01-17'),
(5, 'freidy', 'nunez', 'freidynunez', 'Administrador', 65000.00, 'Villa Mella', '8298770493', 'freidynun@gmail.com', '1985-09-03');

CREATE TABLE productos (
    codigo INT PRIMARY KEY,
    nombre VARCHAR(50),
    descripcion VARCHAR(255),
    precio DECIMAL(10, 2),
    cantidad INT
);

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

CREATE TABLE facturas (
    id_factura INT PRIMARY KEY,
    fecha DATE,
    cliente VARCHAR(50),
    total DOUBLE,
    FOREIGN KEY (cliente) REFERENCES clientes(id_cliente)
);

CREATE TABLE detalle_factura (
    id_detalle INT AUTO_INCREMENT PRIMARY KEY,
    id_factura INT,
    id_producto INT,
    cantidad INT,
    precio_unitario DOUBLE,
    FOREIGN KEY (id_factura) REFERENCES facturas(id_factura),
    FOREIGN KEY (id_producto) REFERENCES productos(id_producto)
);