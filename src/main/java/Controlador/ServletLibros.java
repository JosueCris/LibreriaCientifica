package Controlador;

import Datos.LibrosDAO;
import Modelo.Libros;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.*;

@WebServlet(name = "ServletLibros", urlPatterns = {"/ServletLibros"})
public class ServletLibros extends HttpServlet {
    @Resource(name = "jdbc/database")
    Libros libros = new Libros();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            LibrosDAO librosDAO = new LibrosDAO();
            req.getSession().setAttribute("Datos", librosDAO.Consulta(libros));
        } catch (Exception e){
            req.getSession().setAttribute("Datos", new ArrayList<Libros>());
            e.printStackTrace();
        }
        resp.sendRedirect("/libros.jsp");
    }
}