package Controlador;

import Datos.AutorDAO;
import Datos.IdiomaDAO;
import Modelo.Autor;
import Modelo.Idioma;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ServletIdioma", urlPatterns = {"/ServletIdioma"})
public class ServletIdioma extends HttpServlet {
    @Resource(name = "jdbc/database")
    Idioma idioma = new Idioma();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            IdiomaDAO idiomaDAO = new IdiomaDAO();
            req.getSession().setAttribute("Datos", idiomaDAO.Consulta(idioma));
        } catch (Exception e){
            req.getSession().setAttribute("Datos", new ArrayList<Idioma>());
            e.printStackTrace();
        }
        resp.sendRedirect("/idioma.jsp");
    }
}
