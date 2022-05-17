package Controlador;

import Datos.AlmacenDAO;
import Modelo.Almacen;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;

@WebServlet(name = "ServletAlmacen", urlPatterns = {"/ServletAlmacen"})
public class ServletAlmacen extends HttpServlet {
    @Resource(name = "jdbc/database")
    private DataSource conexion;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            Connection connection = conexion.getConnection();
            AlmacenDAO almacenDAO = new AlmacenDAO(connection);
            Almacen almacen = new Almacen();
            req.getSession().setAttribute("Datos", almacenDAO.Consulta(almacen));
            connection.close();
        } catch (Exception e){
            req.getSession().setAttribute("Datos", new ArrayList<Almacen>());
            e.printStackTrace();
        }
        resp.sendRedirect("/LibreriaCientifica/src/main/webapp/almacen.jsp");
    }
}
