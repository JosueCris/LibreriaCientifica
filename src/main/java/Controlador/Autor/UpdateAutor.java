package Controlador.Autor;

import Datos.AutorDAO;
import Modelo.Autor;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;

@WebServlet(name = "UpdateAutor", urlPatterns = {"/UpdateAutor"})
public class UpdateAutor extends HttpServlet {
    private int codAutor;
    private String nombreCompleto;

    @Resource(name = "jdbc/database")
    private DataSource conexion;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        codAutor = Integer.parseInt(req.getParameter("codAutor"));
        nombreCompleto = req.getParameter("nombreCompleto");

        try{
            Connection connection = conexion.getConnection();
            AutorDAO autorDAO = new AutorDAO(connection);
            Autor autor = new Autor(codAutor, nombreCompleto);
            autorDAO.Actualizar(autor);
            connection.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        resp.sendRedirect("/LibreriaCientifica/update_autor.jsp");
    }
}