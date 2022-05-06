package Datos;

import Modelo.Idioma;

import java.sql.*;
import java.util.*;

public class LibroAutorDAO {
    private final Conexion con;
    private Connection connection;
    private PreparedStatement ps = null;
    private Statement stm = null;
    private ResultSet rs = null;
    private final List<Idioma> lista = new ArrayList<>();

    public LibroAutorDAO() {
        con = new Conexion();
        this.connection = con.getConnection();
    }

    private static final String insertSQL = "INSERT INTO Idioma VALUES (?, ?);";
    private static final String selectSQL = "SELECT * FROM Idioma;";
    private static final String updateSQL ="UPDATE Idioma SET Nombre_Idioma=?";


    public void Insertar(Idioma idioma) {
        try {
            ps = connection.prepareStatement(insertSQL);
            ps.setInt(1, idioma.getCodIdioma());
            ps.setString(2, idioma.getNombreIdioma());

            ps.executeUpdate();
            System.out.println("Registro exitoso!!!");

            con.close(ps);
            con.close(connection);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Idioma> Consulta(Idioma idioma) {
        try {
            connection = con.getConnection();
            stm = connection.createStatement();
            rs = stm.executeQuery(selectSQL);
            while (rs.next()) {
                idioma.setCodIdioma(rs.getInt("CodIdioma"));
                idioma.setNombreIdioma(rs.getString("Nombre_Idioma"));

                lista.add(idioma);
                idioma = new Idioma();
            }

            con.close(rs);
            con.close(stm);
            con.close(connection);

            lista.forEach(System.out::println);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public int Actualizar(Idioma idioma) {
        int registros = 0;
        try {
            connection = con.getConnection();
            ps = connection.prepareStatement(updateSQL);
            ps.setString(1, idioma.getNombreIdioma());

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
