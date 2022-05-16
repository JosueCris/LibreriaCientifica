package Controlador;

import Datos.LibrosDAO;
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

@WebServlet(name = "InsertaLibros", urlPatterns = {"/InsertaLibros"})
public class InsertaLibros extends HttpServlet {
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

        try{
            //Connection connection = conexion.getConnection();
            LibrosDAO librosDAO = new LibrosDAO();
            Libros libros = new Libros(isbn, titulo, anioEdicion, rEditorial, rIdioma, numeroPaginas, rMateria, precio, sinopsis, rEstante);
            librosDAO.Insertar(libros);
            //connection.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        resp.sendRedirect("/inserta_libros.jsp");
    }
}