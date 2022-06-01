package Controlador;

import Datos.ClienteDAO;
import Modelo.Cliente;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;

@WebServlet(name = "UpdateCliente", urlPatterns = {"/UpdateCliente"})
public class UpdateCliente extends HttpServlet {
    private int codCliente;
    private String nombre;
    private String aPaterno;
    private String aMaterno;
    private String correo;
    private String telefono;
    private Boolean status;

    @Resource(name = "jdbc/database")
    private DataSource conexion;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        codCliente = Integer.parseInt(req.getParameter("codCliente"));
        nombre = req.getParameter("nombre");
        aPaterno = req.getParameter("aPaterno");
        aMaterno = req.getParameter("aMaterno");
        correo = req.getParameter("correo");
        telefono = req.getParameter("telefono");
        status = Boolean.valueOf(req.getParameter("status"));

        try{
            Connection connection = conexion.getConnection();
            ClienteDAO clienteDAO = new ClienteDAO(connection);
            Cliente cliente = new Cliente(codCliente, nombre, aPaterno, aMaterno, correo, telefono, status);
            clienteDAO.Actualizar(cliente);
            connection.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        resp.sendRedirect("/LibreriaCientifica/update_cliente.jsp");
    }
}