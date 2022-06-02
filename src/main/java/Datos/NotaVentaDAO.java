package Datos;

import Modelo.Empleado;
import Modelo.NotaVenta;

import java.sql.*;
import java.util.*;

public class NotaVentaDAO {
    Conexion con = new Conexion();
    private Connection connection;
    private PreparedStatement ps = null;
    private Statement stm = null;
    private ResultSet rs = null;
    private final List<NotaVenta> lista = new ArrayList<>();

    public NotaVentaDAO(Connection connection) {
        this.connection = connection;
    }

    private static final String insertSQL = "INSERT INTO Nota_Venta " +
            "VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
    private static final String selectSQL = "SELECT Nota_Venta.CodNota, Cliente.Nombre AS Cliente, Libros.Titulo AS Libro, Nota_Venta.Cantidad, Nota_Venta.Tipo_Pago, Empleado.CodEmpleado, Nota_Venta.Fecha_Compra, Nota_Venta.Status " +
                                            "FROM Nota_Venta " +
                                            "JOIN Cliente " +
                                            "ON Nota_Venta.R_Cliente = Cliente.CodCliente " +
                                            "JOIN Libros " +
                                            "ON Nota_Venta.R_Libro = Libros.ISBN " +
                                            "JOIN Empleado " +
                                            "ON Nota_Venta.R_Empleado = Empleado.CodEmpleado " +
                                            "WHERE Nota_Venta.Status='true'" +
                                            "ORDER BY Nota_Venta.CodNota;";
    private static final String searchSQL = "SELECT Nota_Venta.CodNota, Cliente.Nombre AS Cliente, Libros.Titulo AS Libro, Nota_Venta.Cantidad, Nota_Venta.Tipo_Pago, Empleado.CodEmpleado, Nota_Venta.Fecha_Compra, Nota_Venta.Status " +
                                            "FROM Nota_Venta " +
                                            "JOIN Cliente " +
                                            "ON Nota_Venta.R_Cliente = Cliente.CodCliente " +
                                            "JOIN Libros " +
                                            "ON Nota_Venta.R_Libro = Libros.ISBN " +
                                            "JOIN Empleado " +
                                            "ON Nota_Venta.R_Empleado = Empleado.CodEmpleado " +
                                            "WHERE CodNota=?;";
    private static final String updateSQL = "UPDATE Nota_Venta " +
                                            "SET R_Cliente=?, R_Libro=?, Cantidad=?, Tipo_Pago=?, R_Empleado=?, Fecha_Compra=?, Status=? " +
                                            "WHERE CodNota=?;";
    private static final String deleteSQL = "UPDATE Nota_Venta SET Status = false WHERE CodNota=?;";

    public void Insertar(NotaVenta notaVenta) {
        try {
            ps = connection.prepareStatement(insertSQL);
            ps.setInt(1, notaVenta.getCodNota());
            ps.setInt(2, Integer.parseInt(notaVenta.getrCliente()));
            ps.setInt(3, Integer.parseInt(notaVenta.getrLibro()));
            ps.setInt(4, notaVenta.getCantidad());
            ps.setString(5, notaVenta.getTipoPago());
            ps.setInt(6, notaVenta.getrEmpleado());
            ps.setDate(7, java.sql.Date.valueOf(notaVenta.getFechaCompra()));
            ps.setBoolean(8, notaVenta.isStatus());

            ps.executeUpdate();
            System.out.println("Registro exitoso!!!");

            con.close(ps);
            con.close(connection);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<NotaVenta> Consulta(NotaVenta notaVenta) {
        try {
            connection = con.getConnection();
            stm = connection.createStatement();
            rs = stm.executeQuery(selectSQL);
            while (rs.next()) {
                notaVenta.setCodNota(rs.getInt("CodNota"));
                notaVenta.setrCliente(rs.getString("Cliente"));
                notaVenta.setrLibro(rs.getString("Libro"));
                notaVenta.setCantidad(rs.getInt("Cantidad"));
                notaVenta.setTipoPago(rs.getString("Tipo_Pago"));
                notaVenta.setrEmpleado(rs.getInt("CodEmpleado"));
                notaVenta.setFechaCompra(rs.getString("Fecha_Compra"));
                notaVenta.setStatus(rs.getBoolean("Status"));

                lista.add(notaVenta);
                notaVenta = new NotaVenta();
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

    public NotaVenta getNotaVenta(int codNota) {
        NotaVenta notaVenta = null;
        try {
            ps = connection.prepareStatement(searchSQL);
            ps.setInt(1, codNota);
            rs = ps.executeQuery();

            if (!rs.next()) {
                con.close(rs);
                con.close(ps);
                return null;
            }

            notaVenta = new NotaVenta(rs.getInt("CodNota"),
                    rs.getString("Cliente"),
                    rs.getString("Libro"),
                    rs.getInt("Cantidad"),
                    rs.getString("Tipo_Pago"),
                    rs.getInt("CodEmpleado"),
                    rs.getString("Fecha_Compra"),
                    rs.getBoolean("Status"));
            con.close(rs);
            con.close(ps);
        }catch(Exception e) {
            e.printStackTrace();
        }

        System.out.println("CodNota: " + notaVenta.getCodNota() + "\nCliente: " + notaVenta.getrCliente() + "\nLibro: " + notaVenta.getrLibro() + "\nCantidad: " + notaVenta.getCantidad() + "\nTipo Pago: " + notaVenta.getTipoPago() + "\nEmpleado: " + notaVenta.getrEmpleado() + "\nFecha Compra: " + notaVenta.getFechaCompra());

        return notaVenta;
    }

    public int Actualizar(NotaVenta notaVenta) {
        int registros = 0;
        try {
            connection = con.getConnection();
            ps = connection.prepareStatement(updateSQL);
            ps.setInt(8, notaVenta.getCodNota());
            ps.setInt(1, Integer.parseInt(notaVenta.getrCliente()));
            ps.setInt(2, Integer.parseInt(notaVenta.getrLibro()));
            ps.setInt(3, notaVenta.getCantidad());
            ps.setString(4, notaVenta.getTipoPago());
            ps.setInt(5, notaVenta.getrEmpleado());
            ps.setDate(6, java.sql.Date.valueOf(notaVenta.getFechaCompra()));
            ps.setBoolean(7, notaVenta.isStatus());

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

    public NotaVenta Eliminar (int codNota) {
        NotaVenta notaVenta = getNotaVenta(codNota);
        if (notaVenta == null)
            return null;
        try {
            ps = connection.prepareStatement (deleteSQL);
            ps.setInt(1, codNota);
            ps.executeUpdate();

            System.out.println("Registro Eliminado!!!");
            con.close(ps);
            con.close(connection);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return notaVenta;
    }
}
