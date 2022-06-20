use generationg1;

CREATE TABLE direcciones (
    id int PRIMARY KEY not null auto_increment,
    nombre varchar(30),
    numero int,
    ciudad varchar(20),
    region int,
    pais varchar (15)
);

create table registros(
    id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    codigo_registro varchar(100) NOT NULL,
    rut varchar(100) NOT NULL
);

create table cursos(
    id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nombre varchar(100) NOT NULL,
    descripcion varchar(100) NOT NULL
);

create TABLE alumnos(
	id Integer NOT NULL AUTO_INCREMENT,
	nombre varchar(100),
	apellido varchar(100),
	edad int,
	curso_id int,
	direcciones_id int,
	registro_id int,
	PRIMARY KEY (id)
);

ALTER TABLE alumnos
ADD CONSTRAINT FK_direcciones_id 
FOREIGN KEY (direcciones_id) REFERENCES direcciones(id),
ADD CONSTRAINT FK_curso_id 
FOREIGN KEY (curso_id) REFERENCES cursos(id),
ADD CONSTRAINT FK_registro_id 
FOREIGN KEY (registro_id) REFERENCES registros(id)
;
