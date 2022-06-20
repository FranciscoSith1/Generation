USE testjoin;

SELECT * FROM alumnos;
SELECT * FROM grupos g;

-- inner join
/*SELECT * 
FROM tablaA a
INNER JOIN tablaB b
ON a.key = b.key;*/

SELECT a.id, a.nombre, g.nombre nombreGrupo
FROM alumnos a
INNER JOIN grupos g
ON a.grupo_id = g.id
WHERE g.id= 1;

-- left join
SELECT *
FROM alumnos a
LEFT JOIN grupos g
ON a.grupo_id = g.id;

SELECT a.id, a.nombre nombreAlumno, g.nombre nombreGrupo
FROM alumnos a
LEFT JOIN grupos g
ON a.grupo_id = g.id

-- right join
INSERT INTO Grupos VALUES(7, 'Grupo7');

SELECT *
FROM alumnos a
RIGHT JOIN grupos g
ON a.grupo_id = g.id;

SELECT a.id, a.nombre nombreAlumno, g.nombre nombreGrupo
FROM alumnos a
RIGHT JOIN grupos g
ON a.grupo_id = g.id

-- full join: trae todo el universo de datos
-- pero no funciona en MySql
/*
SELECT *
FROM alumnos a
FULL OUTER JOIN grupos g
ON a.grupo_id = g.id;

SELECT a.id, a.nombre nombreAlumno, g.nombre nombreGrupo
FROM alumnos a
FULL JOIN grupos g
ON a.grupo_id = g.id
*/

-- alternativa para MySql
SELECT *
FROM alumnos a
RIGHT JOIN grupos g
ON a.grupo_id = g.id 
UNION   
SELECT *
FROM alumnos a
LEFT  JOIN grupos g
ON a.grupo_id = g.id;

INSERT INTO Alumnos(nombre, grupo_id) VALUES
('Alondra', 6);
INSERT INTO Alumnos(nombre, grupo_id) VALUES
('Diana', 6);
INSERT INTO Alumnos(nombre, grupo_id) VALUES
('Matias', 6);
INSERT INTO Alumnos(nombre, grupo_id) VALUES
('Michael', 6);
INSERT INTO Alumnos(nombre, grupo_id) VALUES
('Paulino', 6);





