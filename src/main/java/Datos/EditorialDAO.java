package Datos;

import Modelo.Cliente;
import Modelo.Editorial;

import java.sql.*;
import java.util.*;

public class EditorialDAO {
    private Conexion con = new Conexion();
    private Connection connection;
    private PreparedStatement ps = null;
    private Statement stm = null;
    private ResultSet rs = null;
    private final List<Editorial> lista = new ArrayList<>();

    public EditorialDAO(Connection connection) {
        this.connection = connection;
    }

    private static final String insertSQL = "INSERT INTO Editorial VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
    private static final String selectSQL = "SELECT * FROM Editorial;";
    private static final String searchSQL = "SELECT * FROM Editorial WHERE CodEditorial = ?;";
    private static final String updateSQL = "UPDATE Editorial SET Nombre_Editorial=?, Contacto=?, Telefono=?, Correo=?, Direccion=?, Ciudad=?, Pais=? WHERE codEditorial=?";

    public void Insertar(Editorial editorial) {
        try {
            ps = connection.prepareStatement(insertSQL);
            ps.setInt(1, editorial.getCodEditorial());
            ps.setString(2, editorial.getNombreEditorial());
            ps.setString(3, editorial.getContacto());
            ps.setString(4, editorial.getTelefono());
            ps.setString(5, editorial.getCorreo());
            ps.setString(6, editorial.getDireccion());
            ps.setString(7, editorial.getCiudad());
            ps.setString(8, editorial.getPais());

            ps.executeUpdate();
            System.out.println("Registro exitoso!!!");

            con.close(ps);
            con.close(connection);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Editorial> Consulta(Editorial editorial) {
        try {
            connection = con.getConnection();
            stm = connection.createStatement();
            rs = stm.executeQuery(selectSQL);
            while (rs.next()) {
                editorial.setCodEditorial(rs.getInt("CodEditorial"));
                editorial.setNombreEditorial(rs.getString("Nombre_Editorial"));
                editorial.setContacto(rs.getString("Contacto"));
                editorial.setTelefono(rs.getString("Telefono"));
                editorial.setCorreo(rs.getString("Correo"));
                editorial.setDireccion(rs.getString("Direccion"));
                editorial.setCiudad(rs.getString("Ciudad"));
                editorial.setPais(rs.getString("Pais"));


                lista.add(editorial);
                editorial = new Editorial();
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

    public Editorial getEditorial(int codEditorial) {
        Editorial editorial = null;
        try {
            ps = connection.prepareStatement(searchSQL);
            ps.setInt(1, codEditorial);
            rs = ps.executeQuery();

            if (!rs.next()) {
                con.close(rs);
                con.close(ps);
                return null;
            }

            editorial = new Editorial(rs.getInt("CodEditorial"),
                    rs.getString("Nombre_Editorial"),
                    rs.getString("Contacto"),
                    rs.getString("Telefono"),
                    rs.getString("Correo"),
                    rs.getString("Direccion"),
                    rs.getString("Ciudad"),
                    rs.getString("Pais"));
            con.close(rs);
            con.close(ps);
        }catch(Exception e) {
            e.printStackTrace();
        }

        System.out.println("CodEditorial: " + editorial.getCodEditorial() + "\nNombre: " + editorial.getNombreEditorial() + "\nContacto: " + editorial.getContacto() + "\nTelefono: " + editorial.getTelefono() + "\nCorreo: " + editorial.getCorreo() + "\nDireccion: " + editorial.getDireccion() + "\nCiudad: " + editorial.getCiudad() + "\nPaís: " + editorial.getPais());

        return editorial;
    }

    public int Actualizar(Editorial editorial) {
        int registros = 0;
        try {
            connection = con.getConnection();
            ps = connection.prepareStatement(updateSQL);
            ps.setInt(8, editorial.getCodEditorial());
            ps.setString(1, editorial.getNombreEditorial());
            ps.setString(2, editorial.getContacto());
            ps.setString(3, editorial.getTelefono());
            ps.setString(4, editorial.getCorreo());
            ps.setString(5, editorial.getDireccion());
            ps.setString(6, editorial.getCiudad());
            ps.setString(7, editorial.getPais());


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
