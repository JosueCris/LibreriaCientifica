package Controlador;

import Datos.ClienteDAO;
import Modelo.Cliente;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ServletCliente", urlPatterns = {"/ServletCliente"})
public class ServletCliente extends HttpServlet {
    @Resource(name = "jdbc/database")
    Cliente cliente = new Cliente();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            ClienteDAO clienteDAO = new ClienteDAO();
            req.getSession().setAttribute("Datos", clienteDAO.Consulta(cliente));
        } catch (Exception e){
            req.getSession().setAttribute("Datos", new ArrayList<Cliente>());
            e.printStackTrace();
        }
        resp.sendRedirect("/cliente.jsp");
    }
}
