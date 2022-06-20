-- INSERT INTO nombre_tabla (columna1, columna 2...) values (valor1, valor2...):
-- multiples inserciones
INSERT INTO cursos (nombre, descripcion) VALUES 
('Alfa','aplicados'), 
('Beta','inteligentes'),
('Gamma','Astutos');

INSERT INTO registros (codigo_registro, rut) values
('ZP202201', '12345-6'), 
('AP202202', '12345-7'), 
('PL202203', '12345-9');

INSERT INTO direcciones (nombre, numero, ciudad) values
('Prat', 123, 'Arica'), 
('Montt', 2345,'Concepcion'), 
('Arriagada', 3452, 'Rancagua');

INSERT INTO alumnos (nombre, apellido, edad, curso_id, direcciones_id, registro_id) values 
('Francisco', 'Cid',1, 2, 3, 4), 
('Andres', 'Segovia', 5,6,7,8), 
('Pedro', 'Santos', 9,10,11,12);


INSERT INTO alumnos (nombre,apellido,edad,curso_id,direcciones_id,registro_id)values
('Zoe',	'Palma','3','1','3','1'),
('Ayun','Palma','3','1','3','2'),
('Tom','Loren','5','3','1','3');

