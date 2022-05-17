package Controlador;

import Datos.LibrosDAO;
import Modelo.Libros;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.util.*;

@WebServlet(name = "ServletLibros", urlPatterns = {"/ServletLibros"})
public class ServletLibros extends HttpServlet {
    @Resource(name = "jdbc/database")
    private DataSource conexion;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            Connection connection = conexion.getConnection();
            LibrosDAO librosDAO = new LibrosDAO(connection);
            Libros libros = new Libros();
            req.getSession().setAttribute("Datos", librosDAO.Consulta(libros));
        } catch (Exception e){
            req.getSession().setAttribute("Datos", new ArrayList<Libros>());
            e.printStackTrace();
        }
        resp.sendRedirect("/libros.jsp");
    }
}