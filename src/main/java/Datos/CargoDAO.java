package Datos;

import Modelo.Cargo;

import java.sql.*;
import java.util.*;

public class CargoDAO {
    private final Conexion con;
    private Connection connection;
    private PreparedStatement ps = null;
    private Statement stm = null;
    private ResultSet rs = null;
    private final List<Cargo> lista = new ArrayList<>();

    public CargoDAO() {
        con = new Conexion();
        this.connection = con.getConnection();
    }

    private static final String insertSQL = "INSERT INTO Cargo VALUES (?, ?);";
    private static final String selectSQL = "SELECT * FROM Cargo;";
    private static final String updateSQL ="UPDATE Cargo SET Nombre_Cargo=?";


    public void Insertar(Cargo cargo) {
        try {
            ps = connection.prepareStatement(insertSQL);
            ps.setInt(1, cargo.getCodCargo());
            ps.setString(2, cargo.getNombreCargo());

            ps.executeUpdate();
            System.out.println("Registro exitoso!!!");

            con.close(ps);
            con.close(connection);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Cargo> Consulta(Cargo cargo) {
        try {
            connection = con.getConnection();
            stm = connection.createStatement();
            rs = stm.executeQuery(selectSQL);
            while (rs.next()) {
                cargo.setCodCargo(rs.getInt("CodCargo"));
                cargo.setNombreCargo(rs.getString("Nombre_Cargo"));

                lista.add(cargo);
                cargo = new Cargo();
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

    public int Actualizar(Cargo cargo) {
        int registros = 0;
        try {
            connection = con.getConnection();
            ps = connection.prepareStatement(updateSQL);
            ps.setString(1, cargo.getNombreCargo());

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