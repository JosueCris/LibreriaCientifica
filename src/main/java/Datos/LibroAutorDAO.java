package Datos;

import Modelo.Autor;
import Modelo.LibroAutor;
import Modelo.Libros;

import java.sql.*;
import java.util.*;

public class LibroAutorDAO {
    private final Conexion con;
    private Connection connection;
    private PreparedStatement ps = null;
    private Statement stm = null;
    private ResultSet rs = null;
    private final List<LibroAutor> lista = new ArrayList<>();

    public LibroAutorDAO() {
        con = new Conexion();
        this.connection = con.getConnection();
    }

    private static final String insertSQL = "INSERT INTO Libro_Autor VALUES (?, ?);";
    private static final String selectSQL = "SELECT Libros.Titulo AS Libro, Autor.Nombre_Completo AS Autor " +
                                            "FROM Libro_Autor " +
                                            "JOIN Libros " +
                                            "ON Libro_Autor.CodlibroAutor = Libros.ISBN " +
                                            "JOIN Autor " +
                                            "ON Libro_Autor.CodAutor = Autor.CodAutor;";

   // private static final String updateSQL ="UPDATE Idioma SET Nombre_Idioma=?";


//    public void Insertar(Idioma idioma) {
//        try {
//            ps = connection.prepareStatement(insertSQL);
//            ps.setInt(1, idioma.getCodIdioma());
//            ps.setString(2, idioma.getNombreIdioma());
//
//            ps.executeUpdate();
//            System.out.println("Registro exitoso!!!");
//
//            con.close(ps);
//            con.close(connection);
//        }catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    public List<LibroAutor> Consulta(LibroAutor libroAutor) {
        try {
            connection = con.getConnection();
            stm = connection.createStatement();
            rs = stm.executeQuery(selectSQL);
            while (rs.next()) {
//                libroAutor.setCodLibroAutor(rs.getInt("Libro"));
//                libroAutor.setCodAutor(rs.getString("Autor"));

                String claveLibro = rs.getString("Libro");
                Libros titulo = new Libros(claveLibro);

                String claveAutor = rs.getString("Autor");
                Autor nombre = new Autor(claveAutor);

                libroAutor = new LibroAutor(titulo, nombre);

                lista.add(libroAutor);
//                libroAutor = new LibroAutor();
            }

            con.close(rs);
            con.close(stm);
            con.close(connection);

            for(LibroAutor recorrido : lista)
                System.out.println("Libro: " + recorrido.getCodLibroAutor().getIsbn() + "\nAutor: " + recorrido.getCodAutor().getNombreCompleto() + "\n");


        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

//    public int Actualizar(LibroAutor libroAutor) {
//        int registros = 0;
//        try {
//            connection = con.getConnection();
//            ps = connection.prepareStatement(updateSQL);
//            ps.setString(1, libroAutor.getCodLibroAutor());
//
//            registros = ps.executeUpdate();
//            if (registros > 0)
//                System.out.println("Registro Actualizado!!!");
//
//            con.close(ps);
//            con.close(connection);
//
//        }catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return registros;
//    }

}
