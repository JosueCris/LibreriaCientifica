package Controlador;

import Datos.AlmacenDAO;
import Datos.LibrosDAO;
import Modelo.Almacen;
import Modelo.Libros;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ServletAlmacen", urlPatterns = {"/ServletAlmacen"})
public class ServletAlmacen extends HttpServlet {
    @Resource(name = "jdbc/database")
    Almacen almacen = new Almacen();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            AlmacenDAO almacenDAO = new AlmacenDAO();
            req.getSession().setAttribute("Datos", almacenDAO.Consulta(almacen));
        } catch (Exception e){
            req.getSession().setAttribute("Datos", new ArrayList<Almacen>());
            e.printStackTrace();
        }
        resp.sendRedirect("/almacen.jsp");
    }
}
