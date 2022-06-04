package Controlador.Libros;

import Datos.LibrosDAO;
import Modelo.Libros;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;

@WebServlet(name = "UpdateLibros", urlPatterns = {"/UpdateLibros"})
public class UpdateLibros extends HttpServlet {
    private String isbn;
    private String titulo;
    private int anioEdicion;
    private String rEditorial;
    private String rIdioma;
    private int numeroPaginas;
    private String rMateria;
    private double precio;
    private String sinopsis;
    private int rEstante;
    private boolean status;

    @Resource(name = "jdbc/database")
    private DataSource conexion;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        isbn = req.getParameter("isbn");
        titulo = req.getParameter("titulo");
        anioEdicion = Integer.parseInt(req.getParameter("anioEdicion"));
        rEditorial = req.getParameter("rEditorial");
        rIdioma = req.getParameter("rIdioma");
        numeroPaginas = Integer.parseInt(req.getParameter("numeroPaginas"));
        rMateria = req.getParameter("rMateria");
        precio = Double.parseDouble(req.getParameter("precio"));
        sinopsis = req.getParameter("sinopsis");
        rEstante = Integer.parseInt(req.getParameter("rEstante"));
        status = Boolean.parseBoolean(req.getParameter("status"));

        try{
            Connection connection = conexion.getConnection();
            LibrosDAO librosDAO = new LibrosDAO(connection);
            Libros libros = new Libros(isbn, titulo, anioEdicion, rEditorial, rIdioma, numeroPaginas, rMateria, precio, sinopsis, rEstante, status);
            librosDAO.Actualizar(libros);
            connection.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        resp.sendRedirect("/LibreriaCientifica/update_libros.jsp");
    }
}
