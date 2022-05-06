package Datos;

import Modelo.Cliente;

import java.sql.*;
import java.util.*;

public class ClienteDAO {
    private Conexion con;
    private Connection connection;
    private PreparedStatement ps = null;
    private Statement stm = null;
    private ResultSet rs = null;
    private List<Cliente> lista = new ArrayList<>();

    public ClienteDAO() {
        con = new Conexion();
        this.connection = con.getConnection();
    }

    private static final String insertSQL = "INSERT INTO Cliente " +
            "VALUES (?, ?, ?, ?, ?, ?);";
    private static final String selectSQL = "SELECT * FROM CLiente;";
    private static final String updateSQL = "UPDATE Cliente SET Nombre=?, aPaterno=?, aMaterno=?, Correo=?, Telefono=? WHERE CodCliente=?";


    public void Insertar(Cliente cliente) {
        try {
            ps = connection.prepareStatement(insertSQL);
            ps.setInt(1, cliente.getCodCliente());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getaPaterno());
            ps.setString(4, cliente.getaMaterno());
            ps.setString(5, cliente.getCorreo());
            ps.setString(6, cliente.getTelefono());

            ps.executeUpdate();
            System.out.println("Registro exitoso!!!");

            con.close(ps);
            con.close(connection);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Cliente> Consulta(Cliente cliente) {
        try {
            connection = con.getConnection();
            stm = connection.createStatement();
            rs = stm.executeQuery(selectSQL);
            while (rs.next()) {
                cliente.setCodCliente(rs.getInt("CodCliente"));
                cliente.setNombre(rs.getString("Nombre"));
                cliente.setaPaterno(rs.getString("aPaterno"));
                cliente.setaMaterno(rs.getString("aMaterno"));
                cliente.setCorreo(rs.getString("Correo"));
                cliente.setTelefono(rs.getString("Telefono"));

                lista.add(cliente);
                cliente = new Cliente();
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

    public int Actualizar(Cliente cliente) {
        int registros = 0;
        try {
            connection = con.getConnection();
            ps = connection.prepareStatement(updateSQL);
            ps.setInt(6, cliente.getCodCliente());
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getaPaterno());
            ps.setString(3, cliente.getaMaterno());;
            ps.setString(4, cliente.getCorreo());
            ps.setString(5, cliente.getTelefono());


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
