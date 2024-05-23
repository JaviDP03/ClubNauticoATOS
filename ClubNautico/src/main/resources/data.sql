-- Inserción de datos
INSERT INTO socio (dni, nombre, direccion, fecha_nacimiento, sexo) VALUES
	('87264877V', 'Manuel', 'C/Sierpes 7', '2001-02-22', 'H'),
    ('23647856P', 'María', 'C/Amapola 11', '1999-07-16', 'M'),
    ('54223652B', 'Paco', 'Avd/Puerta Sol', '2005-11-01', 'H');

INSERT INTO barco (matricula, nombre, numero_amarre, cuota, id_socio) VALUES
	('7682GHB', 'Santa María', 5, 17.99, 3),
    ('1256SDJ', 'El Malamardo', 7, 15.99, 1),
    ('5322HKD', 'Sardinero', 2, 10.99, 2);

INSERT INTO patron (dni, nombre, fecha_licencia) VALUES
	('23407241R', 'Tomás', '2022-12-09'),
    ('57267425T', 'Lucía', '2014-04-17'),
    ('17643456U', 'Cristina', '2023-05-28');

INSERT INTO salida (fecha, destino, id_patron) VALUES
	('2024-05-12', 'Chipiona', 2),
    ('2024-05-15', 'Matalascañas', 1),
    ('2024-05-20', 'Málaga', 3);
