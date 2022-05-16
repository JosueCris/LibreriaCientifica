package Controlador;

import Datos.EditorialDAO;
import Datos.LibrosDAO;
import Modelo.Editorial;
import Modelo.Libros;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ServletEditorial", urlPatterns = {"/ServletEditorial"})
public class ServletEditorial extends HttpServlet {
    @Resource(name = "jdbc/database")
    Editorial editorial = new Editorial();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            EditorialDAO editorialDAO = new EditorialDAO();
            req.getSession().setAttribute("Datos", editorialDAO.Consulta(editorial));
        } catch (Exception e){
            req.getSession().setAttribute("Datos", new ArrayList<Libros>());
            e.printStackTrace();
        }
        resp.sendRedirect("/editorial.jsp");
    }
}
