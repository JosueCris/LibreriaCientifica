import Datos.*;
import Modelo.*;

import java.sql.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Conexion con = new Conexion();
        Connection connection = null;

        connection = con.getConnection();
//        Almacen almacen = new Almacen();
//        AlmacenDAO almacenDAO = new AlmacenDAO(connection);
//        almacenDAO.getAlmacen(20);
//        Almacen almacen = new Almacen(5, 8, 2);
//        almacenDAO.Actualizar(almacen);
//        almacenDAO.Consulta(almacen);

//        AutorDAO autorDAO = new AutorDAO(connection);
//        Autor autor = new Autor();
//        autorDAO.getAutor(5);
//        Autor autor = new Autor(3, "Rakso MagBel");
//        autorDAO.Actualizar(autor);
//        autorDAO.Consulta(autor);

//        CargoDAO cargoDAO = new CargoDAO(connection);
//        Cargo cargo = new Cargo();
//        cargoDAO.getCargo(8);
//        Cargo cargo = new Cargo(8, "Contador");
//        cargoDAO.Insertar(cargo);
//        cargoDAO.Actualizar(cargo);
//        cargoDAO.Consulta(cargo);

//        ClienteDAO clienteDAO = new ClienteDAO(connection);
//        Cliente cliente = new Cliente();
//        clienteDAO.getCliente(7);
//        Cliente cliente = new Cliente(1, "Sergio", "Bustamante", "Palmeros", "dragonballgt@hotmail.com", "2851009413");
//        clienteDAO.Actualizar(cliente);
//        clienteDAO.Eliminar(10);
//        clienteDAO.Consulta(cliente);


//        EditorialDAO editorialDAO = new EditorialDAO(connection);
//        Editorial editorial = new Editorial();
//        editorialDAO.getEditorial(12);
//        Editorial editorial = new Editorial(2, "Rokubi", "Jesse Pinkman", "2291068899", "jepink@gmail.com", "Las Rosas, New Mexico", "Albuquerque", "EUA");
//        editorialDAO.Actualizar(editorial);
//        editorialDAO.Eliminar(8);
//        editorialDAO.Consulta(editorial);


//        EmpleadoDAO empleadoDAO = new EmpleadoDAO(connection);
//        Empleado empleado = new Empleado();
//        empleadoDAO.getEmpleado(14);
//        Empleado empleado = new Empleado(6, "Rosa", "Pedro", "Luis", "Femenino", "2000-09-21", "2020-06-26", "Lomas 4", "rosapelu@gmail.com", "2291093618","5", true);
//        empleadoDAO.Actualizar(empleado);
//        Empleado empleado = empleadoDAO.getEmpleado(7);
//        empleadoDAO.Eliminar(4);
//        empleadoDAO.Consulta(empleado);

//        System.out.println(empleado);

//        empleadoDAO.Consulta(empleado);

//        EstanteDAO estanteDAO = new EstanteDAO(connection);
//        Estante estante = new Estante();
//        estanteDAO.getEstante(26);
//        Estante estante = new Estante(3, 8, 2);
//        estanteDAO.Actualizar(estante);
//        estanteDAO.Consulta(estante);


//        IdiomaDAO idiomaDAO = new IdiomaDAO(connection);
//        Idioma idioma = new Idioma();
//        idiomaDAO.getIdioma(5);
//        Idioma idioma = new Idioma(6, "Ruso");
//        idiomaDAO.Insertar(idioma);
//        idiomaDAO.Actualizar(idioma);
//        idiomaDAO.Consulta(idioma);

//        LibrosDAO librosDAO = new LibrosDAO(connection);
//        Libros libros = new Libros();
//        librosDAO.getLibros("978-84-450-0067-0");
//        Libros libros = new Libros("152-888-93hf", "Harry Potter y el prisionero de Azkaban", 2003, "7", "2", 361, "2", 289, "Harry conoce a su padrino y salvan a un hipogrifo", 11, true);
//        Libros libros = new Libros();
//        librosDAO.Insertar(libros);
//        librosDAO.actualizar(libros));
//        librosDAO.Eliminar("978-84-450-0067-0");
//        librosDAO.Consulta(libros); // Compruebo que la consulta de todos los libros funciona bien



//        MateriaDAO materiaDAO = new MateriaDAO(connection);
//        Materia materia = new Materia();
//        materiaDAO.getMateria(17);
//        Materia materia = new Materia(4, "Lectura y Logica");
//        materiaDAO.Actualizar(materia);
//        materiaDAO.Consulta(materia);


//        NotaVentaDAO notaVentaDAO = new NotaVentaDAO(connection);
//        NotaVenta notaVenta = new NotaVenta();
//        notaVentaDAO.getNotaVenta(11);
//        NotaVenta notaVenta = new NotaVenta(2, "3", "6", 1, "Efectivo", 2, "2022-11-12");
//        notaVentaDAO.Actualizar(notaVenta);
//        notaVentaDAO.Eliminar(12);
//        notaVentaDAO.Consulta(notaVenta);


//        LibroAutorDAO libroAutorDAO = new LibroAutorDAO();
//        LibroAutor libroAutor = new LibroAutor();
//        libroAutorDAO.Consulta(libroAutor);

//        LibroAlmacenDAO libroAlmacenDAO = new LibroAlmacenDAO();
//        LibroAlmacen libroAlmacen = new LibroAlmacen();
//        libroAlmacenDAO.Consulta(libroAlmacen);
    }
}
