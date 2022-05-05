import Datos.*;
import Modelo.*;

import java.sql.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Conexion con = new Conexion();
        Connection connection = null;
//        Statement stm = null;
//        ResultSet rs = null;

        connection = con.getConnection();
        LibrosDAO librosDAO = new LibrosDAO();
        Libros libros = new Libros("152-888-93hf", "Harry Potter y el prisionero de Azkaban", 2003, "Anaconda", "Ingles", 361, "Literatura", 289, "Harry conoce a su padrino y salvan a un hipogrifo", 11);
       // List<Libros> lista = librosDAO.consulta(libros); // Compruebo que la consulta de todos los libros funciona bien
        //System.out.println(librosDAO.actualizar(libros));
        //librosDAO.Insertar(libros);

        CargoDAO cargoDAO = new CargoDAO();
        Cargo cargo = new Cargo("Licenciado");
        //cargoDAO.Insertar(cargo);
//        cargoDAO.Actualizar(cargo);
//        cargoDAO.Consulta(cargo);

//        IdiomaDAO idiomaDAO = new IdiomaDAO();
//        idiomaDAO.Consulta(new Idioma());

//        MateriaDAO materiaDAO = new MateriaDAO();
//        materiaDAO.Consulta(new Materia());

//        EstanteDAO estanteDAO = new EstanteDAO();
//        estanteDAO.Consulta(new Estante());

//        AlmacenDAO almacenDAO = new AlmacenDAO();
//        almacenDAO.Consulta(new Almacen());

//        EditorialDAO editorialDAO = new EditorialDAO();
//        editorialDAO.Consulta(new Editorial());

//        AutorDAO autorDAO = new AutorDAO();
//        autorDAO.Consulta(new Autor());

        EmpleadoDAO empleadoDAO = new EmpleadoDAO();
        empleadoDAO.Consulta(new Empleado());
    }
}
