package Datos;

import Modelo.Estante;

import java.sql.*;
import java.util.*;

public class EstanteDAO {
    private final Conexion con;
    private Connection connection;
    private PreparedStatement ps = null;
    private Statement stm = null;
    private ResultSet rs = null;
    private final List<Estante> lista = new ArrayList<>();

    public EstanteDAO() {
        con = new Conexion();
        this.connection = con.getConnection();
    }

    private static final String insertSQL = "INSERT INTO Estante VALUES (?, ?, ?);";
    private static final String selectSQL = "SELECT * FROM Estante;";
    private static final String updateSQL ="UPDATE Estante SET Numero_Ejemplares=?, Pasillo=?";

    public EstanteDAO(Conexion con) {
        this.con = con;
    }


    public void Insertar(Estante estante) {
        try {
            ps = connection.prepareStatement(insertSQL);
            ps.setInt(1, estante.getCodEstante());
            ps.setInt(2, estante.getNumeroEjemplares());
            ps.setInt(3, estante.getPasillo());

            ps.executeUpdate();
            System.out.println("Registro exitoso!!!");

            con.close(ps);
            con.close(connection);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Estante> Consulta(Estante estante) {
        try {
            connection = con.getConnection();
            stm = connection.createStatement();
            rs = stm.executeQuery(selectSQL);
            while (rs.next()) {
                estante.setCodEstante(rs.getInt("CodEstante"));
                estante.setNumeroEjemplares(rs.getInt("Numero_Ejemplares"));
                estante.setPasillo(rs.getInt("Pasillo"));

                lista.add(estante);
                estante = new Estante();
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

    public int Actualizar(Estante estante) {
        int registros = 0;
        try {
            connection = con.getConnection();
            ps = connection.prepareStatement(updateSQL);
            ps.setInt(1, estante.getNumeroEjemplares());
            ps.setInt(2, estante.getPasillo());

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
