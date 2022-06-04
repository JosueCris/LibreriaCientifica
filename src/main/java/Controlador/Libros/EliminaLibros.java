package Controlador.Libros;

import Datos.LibrosDAO;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;

@WebServlet(name = "EliminaLibros", urlPatterns = {"/EliminaLibros"})
public class EliminaLibros extends HttpServlet {
    private String isbn;

    @Resource(name = "jdbc/database")
    private DataSource conexion;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        isbn = req.getParameter("isbn");
        try {
            Connection connection = conexion.getConnection();
            LibrosDAO librosDAO = new LibrosDAO(connection);
            librosDAO.Eliminar(isbn);
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        resp.sendRedirect("/LibreriaCientifica/elimina_libros.jsp");
    }
}
