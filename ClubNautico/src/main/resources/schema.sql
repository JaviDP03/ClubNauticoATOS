-- Borrado de tablas
DROP TABLE IF EXISTS barco;
DROP TABLE IF EXISTS salida;
DROP TABLE IF EXISTS socio;
DROP TABLE IF EXISTS patron;

-- Creación de tablas
CREATE TABLE socio (
	id BIGINT PRIMARY KEY AUTO_INCREMENT,
	dni CHAR(9),
    nombre VARCHAR(20),
    direccion VARCHAR(30),
    fecha_nacimiento DATE,
    sexo CHAR(1)
);

CREATE TABLE barco (
	id BIGINT PRIMARY KEY AUTO_INCREMENT,
	matricula CHAR(7),
    nombre VARCHAR(20),
    numero_amarre INT,
    cuota FLOAT,
    id_socio BIGINT,
    CONSTRAINT fk_id_socio FOREIGN KEY (id_socio) REFERENCES socio (id) ON DELETE CASCADE
);

CREATE TABLE patron (
	id BIGINT PRIMARY KEY AUTO_INCREMENT,
	dni CHAR(9),
    nombre VARCHAR(20),
    fecha_licencia DATE
);

CREATE TABLE salida (
	id BIGINT PRIMARY KEY AUTO_INCREMENT,
	fecha DATETIME,
    destino VARCHAR(20),
    id_patron BIGINT,
    CONSTRAINT fk_id_patron FOREIGN KEY (id_patron) REFERENCES patron (id) ON DELETE CASCADE
);
