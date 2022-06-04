package Controlador.Editorial;

import Datos.EditorialDAO;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;

@WebServlet(name = "EliminaEditorial", urlPatterns = {"/EliminaEditorial"})
public class EliminaEditorial extends HttpServlet {
    private int codEditorial;

    @Resource(name = "jdbc/database")
    private DataSource conexion;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        codEditorial = Integer.parseInt(req.getParameter("codEditorial"));
        try {
            Connection connection = conexion.getConnection();
            EditorialDAO editorialDAO = new EditorialDAO(connection);
            editorialDAO.Eliminar(codEditorial);
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        resp.sendRedirect("/LibreriaCientifica/elimina_editorial.jsp");
    }
}