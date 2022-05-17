package Controlador;

import Datos.MateriaDAO;
import Modelo.Materia;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;

@WebServlet(name = "ServletMateria", urlPatterns = {"/ServletMateria"})
public class ServletMateria extends HttpServlet {
    @Resource(name = "jdbc/database")
    private DataSource conexion;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            Connection connection = conexion.getConnection();
            MateriaDAO materiaDAO = new MateriaDAO(connection);
            Materia materia = new Materia();
            req.getSession().setAttribute("Datos", materiaDAO.Consulta(materia));
        } catch (Exception e){
            req.getSession().setAttribute("Datos", new ArrayList<Materia>());
            e.printStackTrace();
        }
        resp.sendRedirect("/materia.jsp");
    }
}
