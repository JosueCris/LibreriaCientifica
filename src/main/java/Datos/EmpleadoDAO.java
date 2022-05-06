package Datos;

import Modelo.Editorial;
import Modelo.Empleado;

import java.sql.*;
import java.util.*;

public class EmpleadoDAO {
    private final Conexion con;
    private Connection connection;
    private PreparedStatement ps = null;
    private Statement stm = null;
    private ResultSet rs = null;
    private final List<Empleado> lista = new ArrayList<>();

    public EmpleadoDAO() {
        con = new Conexion();
        this.connection = con.getConnection();
    }

    private static final String insertSQL = "INSERT INTO Empleado VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
    private static final String selectSQL = "SELECT * FROM Empleado;";
    private static final String updateSQL = "UPDATE Empleado SET Nombre=?, aPaterno=?, aMaterno=?, Genero=?, Fecha_Nacimiento=?, Fecha_Contratacion=?, Direccion=?, Correo=?, Telefono=?, E_Cargo=? WHERE CodEmpleado=?";


    public void Insertar(Empleado empleado) {
        try {
            ps = connection.prepareStatement(insertSQL);
            ps.setInt(1, empleado.getCodEmpleado());
            ps.setString(2, empleado.getNombre());
            ps.setString(3, empleado.getaPaterno());
            ps.setString(4, empleado.getaMaterno());
            ps.setString(5, empleado.getGenero());
            ps.setDate(6, java.sql.Date.valueOf(empleado.getFechaNacimiento()));
 //           ps.setString(6, empleado.getFechaNacimiento());
            ps.setDate(7, java.sql.Date.valueOf(empleado.getFechaContratacion()));
 //           ps.setString(7, empleado.getFechaContratacion());
            ps.setString(8, empleado.getDireccion());
            ps.setString(9, empleado.getCorreo());
            ps.setString(10, empleado.getTelefono());
            ps.setInt(11, Integer.parseInt(empleado.geteCargo()));

            ps.executeUpdate();
            System.out.println("Registro exitoso!!!");

            con.close(ps);
            con.close(connection);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Empleado> Consulta(Empleado empleado) {
        try {
            connection = con.getConnection();
            stm = connection.createStatement();
            rs = stm.executeQuery(selectSQL);
            while (rs.next()) {
                empleado.setCodEmpleado(rs.getInt("CodEmpleado"));
                empleado.setNombre(rs.getString("Nombre"));
                empleado.setaPaterno(rs.getString("aPaterno"));
                empleado.setaMaterno(rs.getString("aMaterno"));
                empleado.setGenero(rs.getString("Genero"));
                empleado.setFechaNacimiento(rs.getString("Fecha_Nacimiento"));
                empleado.setFechaContratacion(rs.getString("Fecha_Contratacion"));
                empleado.setDireccion(rs.getString("Direccion"));
                empleado.setCorreo(rs.getString("Correo"));
                empleado.setTelefono(rs.getString("Telefono"));
                empleado.seteCargo(rs.getString("E_Cargo"));


                lista.add(empleado);
                empleado = new Empleado();
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

    public int Actualizar(Empleado empleado) {
        int registros = 0;
        try {
            connection = con.getConnection();
            ps = connection.prepareStatement(updateSQL);
            ps.setInt(11, empleado.getCodEmpleado());
            ps.setString(1, empleado.getNombre());
            ps.setString(2, empleado.getaPaterno());
            ps.setString(3, empleado.getaMaterno());
            ps.setString(4, empleado.getGenero());
            ps.setDate(5, java.sql.Date.valueOf(empleado.getFechaNacimiento()));
//            ps.setString(5, empleado.getFechaNacimiento());
            ps.setDate(6, java.sql.Date.valueOf(empleado.getFechaContratacion()));
//            ps.setString(6, empleado.getFechaContratacion());
            ps.setString(7, empleado.getDireccion());
            ps.setString(8, empleado.getCorreo());
            ps.setString(9, empleado.getTelefono());
            ps.setInt(10, Integer.parseInt(empleado.geteCargo()));


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
