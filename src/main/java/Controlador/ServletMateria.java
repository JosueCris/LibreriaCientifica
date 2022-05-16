package Controlador;

import Datos.AlmacenDAO;
import Datos.MateriaDAO;
import Modelo.Almacen;
import Modelo.Materia;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ServletMateria", urlPatterns = {"/ServletMateria"})
public class ServletMateria extends HttpServlet {
    @Resource(name = "jdbc/database")
    Materia materia = new Materia();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            MateriaDAO materiaDAO = new MateriaDAO();
            req.getSession().setAttribute("Datos", materiaDAO.Consulta(materia));
        } catch (Exception e){
            req.getSession().setAttribute("Datos", new ArrayList<Materia>());
            e.printStackTrace();
        }
        resp.sendRedirect("/materia.jsp");
    }
}
