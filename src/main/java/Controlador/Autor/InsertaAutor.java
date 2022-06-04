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

@WebServlet(name = "InsertaAutor", urlPatterns = {"/InsertaAutor"})
public class InsertaAutor extends HttpServlet {
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
            autorDAO.Insertar(autor);
            connection.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        resp.sendRedirect("/LibreriaCientifica/inserta_autores.jsp");
    }
}