package Datos;

import Modelo.Almacen;

import java.sql.*;
import java.util.*;

public class AlmacenDAO {
    Conexion con = new Conexion();
    private Connection connection;
    private PreparedStatement ps = null;
    private Statement stm = null;
    private ResultSet rs = null;
    private final List<Almacen> lista = new ArrayList<>();

    public AlmacenDAO(Connection connection) {
        this.connection = connection;
    }

    private static final String insertSQL = "INSERT INTO Almacen VALUES (?, ?, ?);";
    private static final String selectSQL = "SELECT * FROM Almacen;";
    private static final String updateSQL =" UPDATE Almacen SET Numero_Ejemplares=?, PasillosA=? WHERE CodRepisa=?";



    public void Insertar(Almacen almacen) {
        try {
            ps = connection.prepareStatement(insertSQL);
            ps.setInt(1, almacen.getCodRepisa());
            ps.setInt(2, almacen.getNumeroEjemplares());
            ps.setInt(3, almacen.getPasillosA());

            ps.executeUpdate();
            System.out.println("Registro exitoso!!!");

            con.close(ps);
            con.close(connection);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Almacen> Consulta(Almacen almacen) {
        try {
            connection = con.getConnection();
            stm = connection.createStatement();
            rs = stm.executeQuery(selectSQL);
            while (rs.next()) {
                almacen.setCodRepisa(rs.getInt("CodRepisa"));
                almacen.setNumeroEjemplares(rs.getInt("Numero_Ejemplares"));
                almacen.setPasillosA(rs.getInt("PasillosA"));

                lista.add(almacen);
                almacen = new Almacen();
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

    public int Actualizar(Almacen almacen) {
        int registros = 0;
        try {
            connection = con.getConnection();
            ps = connection.prepareStatement(updateSQL);
            ps.setInt(3, almacen.getCodRepisa());
            ps.setInt(1, almacen.getNumeroEjemplares());
            ps.setInt(2, almacen.getPasillosA());

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
