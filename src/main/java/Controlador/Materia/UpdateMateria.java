package Controlador.Materia;

import Datos.MateriaDAO;
import Modelo.Materia;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;

@WebServlet(name = "UpdateMateria", urlPatterns = {"/UpdateMateria"})
public class UpdateMateria extends HttpServlet {
    private int codMateria;
    private String nombreMateria;

    @Resource(name = "jdbc/database")
    private DataSource conexion;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        codMateria = Integer.parseInt(req.getParameter("codMateria"));
        nombreMateria = req.getParameter("nombreMateria");

        try{
            Connection connection = conexion.getConnection();
            MateriaDAO materiaDAO = new MateriaDAO(connection);
            Materia materia = new Materia(codMateria, nombreMateria);
            materiaDAO.Actualizar(materia);
            connection.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        resp.sendRedirect("/LibreriaCientifica/update_materia.jsp");
    }
}