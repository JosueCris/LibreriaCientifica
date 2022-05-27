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
import java.util.ArrayList;

@WebServlet(name = "ServletCliente", urlPatterns = {"/ServletCliente"})
public class ServletCliente extends HttpServlet {
    @Resource(name = "jdbc/database")
    private DataSource conexion;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            Connection connection = conexion.getConnection();
            ClienteDAO clienteDAO = new ClienteDAO(connection);
            Cliente cliente = new Cliente();
            req.getSession().setAttribute("Datos", clienteDAO.Consulta(cliente));
        } catch (Exception e){
            req.getSession().setAttribute("Datos", new ArrayList<Cliente>());
            e.printStackTrace();
        }
        resp.sendRedirect("/LibreriaCientifica/cliente.jsp");
    }
}
