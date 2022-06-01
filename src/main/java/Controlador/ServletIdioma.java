package Controlador;

import Datos.IdiomaDAO;
import Modelo.Idioma;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;

@WebServlet(name = "ServletIdioma", urlPatterns = {"/ServletIdioma"})
public class ServletIdioma extends HttpServlet {
    @Resource(name = "jdbc/database")
    private DataSource conexion;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            Connection connection = conexion.getConnection();
            IdiomaDAO idiomaDAO = new IdiomaDAO(connection);
            Idioma idioma = new Idioma();
            req.getSession().setAttribute("Datos", idiomaDAO.Consulta(idioma));
        } catch (Exception e){
            req.getSession().setAttribute("Datos", new ArrayList<Idioma>());
            e.printStackTrace();
        }
        resp.sendRedirect("/LibreriaCientifica/idioma.jsp");
    }
}
