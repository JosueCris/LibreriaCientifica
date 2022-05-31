package Controlador;

import Datos.ClienteDAO;
import Datos.NotaVentaDAO;
import Modelo.Cliente;
import Modelo.NotaVenta;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;

@WebServlet(name = "InsertaNotaVenta", urlPatterns = {"/InsertaNotaVenta"})
public class InsertaNotaVenta extends HttpServlet {
    private int codNota;
    private String rCliente;
    private String rLibro;
    private int cantidad;
    private String tipoPago;
    private int rEmpleado;
    private String fechaCompra;
    private boolean status;

    @Resource(name = "jdbc/database")
    private DataSource conexion;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        codNota = Integer.parseInt(req.getParameter("codNota"));
        rCliente = req.getParameter("rCliente");
        rLibro = req.getParameter("rLibro");
        cantidad = Integer.parseInt(req.getParameter("cantidad"));
        tipoPago = req.getParameter("tipoPago");
        rEmpleado = Integer.parseInt(req.getParameter("rEmpleado"));
        fechaCompra = req.getParameter("fechaCompra");
        status = Boolean.parseBoolean(req.getParameter("status"));


        try{
            Connection connection = conexion.getConnection();
            NotaVentaDAO notaVentaDAO = new NotaVentaDAO(connection);
            NotaVenta notaVenta = new NotaVenta(codNota, rCliente, rLibro, cantidad, tipoPago, rEmpleado, fechaCompra, status);
            notaVentaDAO.Insertar(notaVenta);
            connection.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        resp.sendRedirect("/LibreriaCientifica/inserta_notaventa.jsp");
    }
}