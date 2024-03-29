package Datos;

import Modelo.Empleado;

import java.sql.*;
import java.util.*;

public class EmpleadoDAO {
    Conexion con = new Conexion();
    private Connection connection;
    private PreparedStatement ps = null;
    private Statement stm = null;
    private ResultSet rs = null;
    private final List<Empleado> lista = new ArrayList<>();

    public EmpleadoDAO(Connection connection) {
        this.connection = connection;
    }

    private static final String insertSQL = "INSERT INTO Empleado VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
    private static final String selectSQL = "SELECT * FROM Empleado WHERE Status='true' ORDER BY CodEmpleado;";
    private static final String updateSQL = "UPDATE Empleado SET Nombre=?, aPaterno=?, aMaterno=?, Genero=?, Fecha_Nacimiento=?, Fecha_Contratacion=?, Direccion=?, Correo=?, Telefono=?, E_Cargo=?, Status=? WHERE CodEmpleado=?";
    private static final String searchSQL = "SELECT * FROM Empleado WHERE CodEmpleado=?;";
    private static final String deleteSQL = "UPDATE Empleado SET Status = false WHERE CodEmpleado=?;";
//    private static final String deleteSQL = "DELETE FROM Empleado WHERE CodEmpleado=?;";

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
            ps.setBoolean(12, empleado.isStatus());

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
                empleado.setStatus(rs.getBoolean("Status"));


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

    public Empleado getEmpleado(int codEmpleado) {
        Empleado empleado = null;
        try {
            ps = connection.prepareStatement(searchSQL);
            ps.setInt(1, codEmpleado);
            rs = ps.executeQuery();

            if (!rs.next()) {
                con.close(rs);
                con.close(ps);
                return null;
            }

            empleado = new Empleado(rs.getInt("CodEmpleado"),
                    rs.getString("Nombre"),
                    rs.getString("aPaterno"),
                    rs.getString("aMaterno"),
                    rs.getString("Genero"),
                    rs.getString("Fecha_Nacimiento"),
                    rs.getString("Fecha_Contratacion"),
                    rs.getString("Direccion"),
                    rs.getString("Correo"),
                    rs.getString("Telefono"),
                    rs.getString("E_Cargo"),
                    rs.getBoolean("Status"));
            con.close(rs);
            con.close(ps);
        }catch(Exception e) {
            e.printStackTrace();
        }

        System.out.println("CodEmpleado: " + empleado.getCodEmpleado() + "\nNombre: " + empleado.getNombre() + "\nApellido Paterno: " + empleado.getaPaterno() + "\nApellido Materno: " + empleado.getaMaterno() + "\nGenero: " + empleado.getGenero() + "\nFecha Nacimiento: " + empleado.getFechaNacimiento() + "\nFecha Contratación: " + empleado.getFechaContratacion() + "\nDirección: " + empleado.getDireccion() + "\nCorreo: " + empleado.getCorreo() + "\nTeléfono: " + empleado.getTelefono() + "\nCargo: " + empleado.geteCargo());

        return empleado;
    }

    public int Actualizar(Empleado empleado) {  // El empleado me actualiza raro
        int registros = 0;
        try {
            connection = con.getConnection();
            ps = connection.prepareStatement(updateSQL);
            ps.setInt(12, empleado.getCodEmpleado());
            ps.setString(1, empleado.getNombre());
            ps.setString(2, empleado.getaPaterno());
            ps.setString(3, empleado.getaMaterno());
            ps.setString(4, empleado.getGenero());
            ps.setDate(5, java.sql.Date.valueOf(empleado.getFechaNacimiento()));
            ps.setDate(6, java.sql.Date.valueOf(empleado.getFechaContratacion()));
            ps.setString(7, empleado.getDireccion());
            ps.setString(8, empleado.getCorreo());
            ps.setString(9, empleado.getTelefono());
            ps.setInt(10, Integer.parseInt(empleado.geteCargo()));
            ps.setBoolean(11, empleado.isStatus());


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

    public Empleado Eliminar (int codEmpleado) {
        Empleado empleado = getEmpleado(codEmpleado);
        if (empleado == null)
            return null;
        try {
            ps = connection.prepareStatement (deleteSQL);
            ps.setInt(1, codEmpleado);
            ps.executeUpdate();

            System.out.println("Registro Eliminado!!!");
            con.close(ps);
            con.close(connection);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return empleado;
    }

//    public Empleado Eliminar (int CodEmpleado) {
//        Empleado empleado = getEmpleado(CodEmpleado);
//        try {
//            if (empleado == null)
//                return null;
//            this.ps = this.connection.prepareStatement(deleteSQL);
//
//            this.ps.setInt(1, CodEmpleado);
//            this.ps.executeUpdate();
//
//            con.close(ps);
//        }catch (Exception e) {
//            e.printStackTrace();
//        }
//        return empleado;
//    }
}
