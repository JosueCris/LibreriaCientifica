package Controlador.Cliente;

import Datos.ClienteDAO;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;

@WebServlet(name = "EliminaCliente", urlPatterns = {"/EliminaCliente"})
public class EliminaCliente extends HttpServlet {
    private int codCliente;

    @Resource(name = "jdbc/database")
    private DataSource conexion;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        codCliente = Integer.parseInt(req.getParameter("codCliente"));
        try{
            Connection connection = conexion.getConnection();
            ClienteDAO clienteDAO = new ClienteDAO(connection);
            clienteDAO.Eliminar(codCliente);
            connection.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        resp.sendRedirect("/LibreriaCientifica/elimina_cliente.jsp");
    }
}