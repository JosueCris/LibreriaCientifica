package Datos;

import Modelo.Editorial;
import Modelo.Libros;

import java.sql.*;
import java.util.*;

public class LibrosDAO {
    Conexion con = new Conexion();
    private Connection connection;
    private PreparedStatement ps = null;
    private Statement stm = null;
    private ResultSet rs = null;
    private final List<Libros> lista = new ArrayList<>();

    public LibrosDAO(Connection connection) {
        this.connection = connection;
    }

// Esto lo tengo pendiente en lo que resuelvo mi conflicto con la incongruencia entre la BD y los constructores
    private static final String insertSQL = "INSERT INTO Libros " +
                                            "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
    private static final String selectSQL = "SELECT Libros.ISBN, libros.Titulo, Libros.Año_Edicion, Editorial.Nombre_Editorial AS Editorial, Idioma.Nombre_Idioma AS Idioma, Libros.Numero_Paginas, Materia.Nombre_Materia AS Materia, Libros.Precio, Libros.Sinopsis, Estante.codEstante AS Estante, Libros.Status" +
                                            " FROM Libros" +
                                            " JOIN Editorial" +
                                            " ON Libros.R_Editorial = Editorial.CodEditorial" +
                                            " JOIN Idioma" +
                                            " ON Libros.R_Idioma = Idioma.CodIdioma" +
                                            " JOIN Materia" +
                                            " ON Libros.R_Materia = Materia.CodMateria" +
                                            " JOIN Estante" +
                                            " ON Libros.R_Estante = Estante.CodEstante;";
    private static final String updateSQL = "UPDATE Libros " +
                                            "SET Titulo=?, Año_Edicion=?, R_Editorial=?,R_Idioma=?, Numero_Paginas=?, R_Materia=?, Precio=?, Sinopsis=?, R_Estante=?, Status=? WHERE ISBN=?";
    private static final String searchSQL = "SELECT Libros.ISBN, libros.Titulo, Libros.Año_Edicion, Editorial.Nombre_Editorial AS Editorial, Idioma.Nombre_Idioma AS Idioma, Libros.Numero_Paginas, Materia.Nombre_Materia AS Materia, Libros.Precio, Libros.Sinopsis, Estante.codEstante AS Estante" +
                                            " FROM Libros" +
                                            " JOIN Editorial" +
                                            " ON Libros.R_Editorial = Editorial.CodEditorial" +
                                            " JOIN Idioma" +
                                            " ON Libros.R_Idioma = Idioma.CodIdioma" +
                                            " JOIN Materia" +
                                            " ON Libros.R_Materia = Materia.CodMateria" +
                                            " JOIN Estante" +
                                            " ON Libros.R_Estante = Estante.CodEstante" +
                                            " WHERE ISBN=?;";
    private static final String deleteSQL = "DELETE * FROM Libro WHERE ISBN=?;";


    public void Insertar(Libros libros) {
        try {
            ps = connection.prepareStatement(insertSQL);
            ps.setString(1, libros.getIsbn());
            ps.setString(2, libros.getTitulo());
            ps.setInt(3, libros.getAnioEdicion());
            ps.setInt(4, Integer.parseInt(libros.getrEditorial()));
            ps.setInt(5, Integer.parseInt(libros.getrIdioma()));
            ps.setInt(6, libros.getNumeroPaginas());
            ps.setInt(7, Integer.parseInt(libros.getrMateria()));
            ps.setDouble(8, libros.getPrecio());
            ps.setString(9, libros.getSinopsis());
            ps.setInt(10, libros.getrEstante());
            ps.setBoolean(11, libros.getStatus());

            ps.executeUpdate();
            System.out.println("Registro exitoso!!!");

            con.close(ps);
            con.close(connection);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Libros> Consulta(Libros libros) {
        try {
            connection = con.getConnection();
            stm = connection.createStatement();
            rs = stm.executeQuery(selectSQL);
            while (rs.next()) {
                libros.setIsbn(rs.getString("ISBN"));
                libros.setTitulo(rs.getString("Titulo"));
                libros.setAnioEdicion(rs.getInt("Año_Edicion"));
                libros.setrEditorial(rs.getString("Editorial"));
                libros.setrIdioma(rs.getString("Idioma"));
                libros.setNumeroPaginas(rs.getInt("Numero_Paginas"));
                libros.setrMateria(rs.getString("Materia"));
                libros.setPrecio(rs.getDouble("Precio"));
                libros.setSinopsis(rs.getString("Sinopsis"));
                libros.setrEstante(rs.getInt("Estante"));
                libros.setStatus(rs.getBoolean("Status"));

                lista.add(libros);
                libros = new Libros();
            }

            con.close(rs);
            con.close(stm);
            con.close(connection);

            lista.forEach(System.out::println); // Aqui hacemos el recorrido de la lista completa

        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public Libros getLibros(String isbn) {
        Libros libros = null;
        try {
            ps = connection.prepareStatement(searchSQL);
            ps.setString(1, isbn);
            rs = ps.executeQuery();

            if (!rs.next()) {
                con.close(rs);
                con.close(ps);
                return null;
            }

            libros = new Libros(rs.getString("ISBN"),
                    rs.getString("Titulo"),
                    rs.getInt("Año_Edicion"),
                    rs.getString("Editorial"),
                    rs.getString("Idioma"),
                    rs.getInt("Numero_Paginas"),
                    rs.getString("Materia"),
                    rs.getDouble("Precio"),
                    rs.getString("Sinopsis"),
                    rs.getInt("Estante"),
                    rs.getBoolean("Status"));
            con.close(rs);
            con.close(ps);
        }catch(Exception e) {
            e.printStackTrace();
        }

        System.out.println("ISBN: " + libros.getIsbn() + "\nTítulo: " + libros.getTitulo() + "\nAño Edición: " + libros.getAnioEdicion() + "\nEditorial: " + libros.getrEditorial() + "\nIdioma: " + libros.getrIdioma() + "\nPaginas: " +libros.getNumeroPaginas() + "\nMateria: " + libros.getrMateria() + "\nPrecio: " + libros.getPrecio() + "\nSinopsis: " + libros.getSinopsis());

        return libros;
    }

    public int Actualizar(Libros libros) {
        int registros = 0;
        try {
            connection = con.getConnection();
            ps = connection.prepareStatement(updateSQL);
            ps.setString(11, libros.getIsbn());
            ps.setString(1, libros.getTitulo());
            ps.setInt(2, libros.getAnioEdicion());
            ps.setString(3, libros.getrEditorial());
            ps.setString(4, libros.getrIdioma());
            ps.setInt(5, libros.getNumeroPaginas());
            ps.setString(6, libros.getrMateria());
            ps.setDouble(7, libros.getPrecio());
            ps.setString(8, libros.getSinopsis());
            ps.setInt(9, libros.getrEstante());
            ps.setBoolean(10, libros.getStatus());

            registros = ps.executeUpdate();
            if (registros > 0)
                System.out.println("Registro Actualizado!!!");

            con.close(ps);
            con.close(connection);

        }catch (Exception e) {
            e.printStackTrace();
        }

       return registros;
    }

}
