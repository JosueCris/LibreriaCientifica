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
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;

@WebServlet(name = "ServletEditorial", urlPatterns = {"/ServletEditorial"})
public class ServletEditorial extends HttpServlet {
    @Resource(name = "jdbc/database")
    private DataSource conexion;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            Connection connection = conexion.getConnection();
            EditorialDAO editorialDAO = new EditorialDAO(connection);
            Editorial editorial = new Editorial();
            req.getSession().setAttribute("Datos", editorialDAO.Consulta(editorial));
        } catch (Exception e){
            req.getSession().setAttribute("Datos", new ArrayList<Libros>());
            e.printStackTrace();
        }
        resp.sendRedirect("/editorial.jsp");
    }
}
