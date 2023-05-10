CREATE TABLE libros (
ISBN VARCHAR (45) PRIMARY KEY,
Titulo VARCHAR (80),
Año_Edicion INT,
R_Editorial INT,
R_Idioma INT,
Numero_Paginas INT,
R_Materia INT,
Precio FLOAT,
Sinopsis VARCHAR (500),
R_Estante INT,
Status BOOLEAN
);

CREATE TABLE cargo (
CodCargo INTEGER PRIMARY KEY,
Nombre_Cargo VARCHAR (30)
);

CREATE TABLE empleado (
CodEmpleado INTEGER PRIMARY KEY,
Nombre VARCHAR (30),
aPaterno VARCHAR (20),
aMaterno VARCHAR (20),
Genero VARCHAR (10),
Fecha_Nacimiento DATE,
Fecha_Contratacion DATE,
Direccion VARCHAR (50),
Correo VARCHAR (50),
Telefono VARCHAR (10),
E_Cargo INT,
Status BOOLEAN
);

CREATE TABLE nota_venta (
CodNota INTEGER PRIMARY KEY,
R_Cliente INT,
R_Libro VARCHAR (45),
Cantidad INT,
Tipo_Pago VARCHAR (10),
R_Empleado INT,
Fecha_Compra DATE,	
Status BOOLEAN
);

CREATE TABLE cliente (
CodCliente INTEGER PRIMARY KEY,
Nombre VARCHAR (30),
aPaterno VARCHAR (20),
aMaterno VARCHAR (20),	
Correo VARCHAR (50),
Telefono VARCHAR (10),
Status BOOLEAN
);

CREATE TABLE idioma (
CodIdioma INTEGER PRIMARY KEY,
Nombre_Idioma VARCHAR (10)	
);

CREATE TABLE materia (
CodMateria INTEGER PRIMARY KEY,
Nombre_Materia VARCHAR (40)	
);

CREATE TABLE autor (
CodAutor INTEGER PRIMARY KEY,
Nombre_Completo VARCHAR (60)
);

CREATE TABLE almacen (
CodRepisa INTEGER PRIMARY KEY,
Numero_Ejemplares INT,
PasillosA INT	
);

CREATE TABLE libro_autor (
CodlibroAutor VARCHAR (45),
CodAutor INT,
FOREIGN KEY (CodlibroAutor) REFERENCES libros (ISBN),
FOREIGN KEY (CodAutor) REFERENCES autor (CodAutor)
);

CREATE TABLE libro_almacen (
CodlibroAlmacen VARCHAR (45),
CodRepisa INT,
FOREIGN KEY (CodlibroAlmacen) REFERENCES libros (ISBN),
FOREIGN KEY (CodRepisa) REFERENCES almacen (CodRepisa)
);

CREATE TABLE editorial (
CodEditorial INTEGER PRIMARY KEY,
Nombre_Editorial VARCHAR (25),
Contacto VARCHAR (60),
Telefono VARCHAR (10),
Correo VARCHAR (50),
Direccion VARCHAR (50),
Ciudad VARCHAR (30),
Pais VARCHAR (30),
Status BOOLEAN
);

CREATE TABLE estante (
CodEstante INTEGER PRIMARY KEY,
Numero_Ejemplares INT,
Pasillo INT	
);


-- Aca hago las relaciones que necesito para tener mejor orden
ALTER TABLE libros
ADD FOREIGN KEY (R_Estante) REFERENCES estante (CodEstante);

ALTER TABLE libros
ADD FOREIGN KEY (R_Materia) REFERENCES materia (CodMateria);

ALTER TABLE libros
ADD FOREIGN KEY (R_Idioma) REFERENCES idioma (CodIdioma);

ALTER TABLE empleado
ADD FOREIGN KEY (E_Cargo) REFERENCES cargo (CodCargo);

ALTER TABLE nota_venta
ADD FOREIGN KEY (R_Empleado) REFERENCES empleado (CodEmpleado);

ALTER TABLE nota_venta
ADD FOREIGN KEY (R_Cliente) REFERENCES cliente (CodCliente);