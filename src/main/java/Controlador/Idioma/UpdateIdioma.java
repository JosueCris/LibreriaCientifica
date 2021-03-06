package Controlador.Idioma;

import Datos.IdiomaDAO;
import Modelo.Idioma;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;

@WebServlet(name = "UpdateIdioma", urlPatterns = {"/UpdateIdioma"})
public class UpdateIdioma extends HttpServlet {
    private int codIdioma;
    private String nombreIdioma;

    @Resource(name = "jdbc/database")
    private DataSource conexion;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        codIdioma = Integer.parseInt(req.getParameter("codIdioma"));
        nombreIdioma = req.getParameter("nombreIdioma");

        try{
            Connection connection = conexion.getConnection();
            IdiomaDAO idiomaDAO = new IdiomaDAO(connection);
            Idioma idioma = new Idioma(codIdioma, nombreIdioma);
            idiomaDAO.Actualizar(idioma);
            connection.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        resp.sendRedirect("/LibreriaCientifica/update_idioma.jsp");
    }
}