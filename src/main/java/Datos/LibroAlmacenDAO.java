package Datos;

import Modelo.*;

import java.sql.*;
import java.util.*;

public class LibroAlmacenDAO {
    private final Conexion con;
    private Connection connection;
    private PreparedStatement ps = null;
    private Statement stm = null;
    private ResultSet rs = null;
    private final List<LibroAlmacen> lista = new ArrayList<>();

    public LibroAlmacenDAO() {
        con = new Conexion();
        this.connection = con.getConnection();
    }

    //private static final String insertSQL = "INSERT INTO Idioma VALUES (?, ?);";
    private static final String selectSQL = "SELECT Libros.Titulo AS Libro, Almacen.CodRepisa AS Almacen " +
            "FROM Libro_Almacen " +
            "JOIN Libros " +
            "ON Libro_Almacen.CodlibroAlmacen = Libros.ISBN " +
            "JOIN Almacen " +
            "ON Libro_Almacen.CodRepisa = Almacen.CodRepisa;";

    public List<LibroAlmacen> Consulta(LibroAlmacen libroAlmacen) {
        try {
            connection = con.getConnection();
            stm = connection.createStatement();
            rs = stm.executeQuery(selectSQL);
            while (rs.next()) {

                String claveLibro = rs.getString("Libro");
                Libros titulo = new Libros(claveLibro);

                int claveAlmacen = rs.getInt("Almacen");
                Almacen repisa = new Almacen(claveAlmacen);

                libroAlmacen = new LibroAlmacen(titulo, repisa);

                lista.add(libroAlmacen);
//                libroAlmacen = new LibroAlmacen();
            }

            con.close(rs);
            con.close(stm);
            con.close(connection);

            for(LibroAlmacen recorrido : lista)
                System.out.println("Libro: " + recorrido.getCodLibroAlmacen().getIsbn() + "\nAlmacen: " + recorrido.getCodRepisa().getCodRepisa() + "\n");


        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
}
