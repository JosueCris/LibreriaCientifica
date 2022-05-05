package Datos;

import Modelo.Autor;

import java.sql.*;
import java.util.*;

public class AutorDAO {
    private final Conexion con;
    private Connection connection;
    private PreparedStatement ps = null;
    private Statement stm = null;
    private ResultSet rs = null;
    private final List<Autor> lista = new ArrayList<>();

    public AutorDAO() {
        con = new Conexion();
        this.connection = con.getConnection();
    }

    private static final String insertSQL = "INSERT INTO Autor VALUES (?, ?);";
    private static final String selectSQL = "SELECT * FROM Autor;";
    private static final String updateSQL ="UPDATE Cargo SET Nombre_Completo=?";


    public void Insertar(Autor autor) {
        try {
            ps = connection.prepareStatement(insertSQL);
            ps.setInt(1, autor.getCodAutor());
            ps.setString(2, autor.getNombreCompleto());

            ps.executeUpdate();
            System.out.println("Registro exitoso!!!");

            con.close(ps);
            con.close(connection);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Autor> Consulta(Autor autor) {
        try {
            connection = con.getConnection();
            stm = connection.createStatement();
            rs = stm.executeQuery(selectSQL);
            while (rs.next()) {
                autor.setCodAutor(rs.getInt("CodAutor"));
                autor.setNombreCompleto(rs.getString("Nombre_Completo"));

                lista.add(autor);
                autor = new Autor();
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

    public int Actualizar(Autor autor) {
        int registros = 0;
        try {
            connection = con.getConnection();
            ps = connection.prepareStatement(updateSQL);
            ps.setString(1, autor.getNombreCompleto());

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
