package Controlador;

import Datos.AutorDAO;
import Modelo.Autor;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;

@WebServlet(name = "ServletAutor", urlPatterns = {"/ServletAutor"})
public class ServletAutor extends HttpServlet {
    @Resource(name = "jdbc/database")
    private DataSource conexion;
    Autor autor = new Autor();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            Connection connection = conexion.getConnection();
            AutorDAO autorDAO = new AutorDAO(connection);
            req.getSession().setAttribute("Datos", autorDAO.Consulta(autor));
        } catch (Exception e){
            req.getSession().setAttribute("Datos", new ArrayList<Autor>());
            e.printStackTrace();
        }
        resp.sendRedirect("/LibreriaCientifica/autores.jsp");
    }
}
