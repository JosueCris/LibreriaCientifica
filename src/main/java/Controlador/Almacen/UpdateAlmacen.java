package Controlador.Almacen;

import Datos.AlmacenDAO;
import Modelo.Almacen;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;

@WebServlet(name = "UpdateAlmacen", urlPatterns = {"/UpdateAlmacen"})
public class UpdateAlmacen extends HttpServlet {
    private int codRepisa;
    private int numeroEjemplares;
    private int pasillosA;

    @Resource(name = "jdbc/database")
    private DataSource conexion;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        codRepisa = Integer.parseInt(req.getParameter("codRepisa"));
        numeroEjemplares = Integer.parseInt(req.getParameter("numeroEjemplares"));
        pasillosA = Integer.parseInt(req.getParameter("pasillosA"));

        try{
            Connection connection = conexion.getConnection();
            AlmacenDAO almacenDAO = new AlmacenDAO(connection);
            Almacen almacen = new Almacen(codRepisa, numeroEjemplares, pasillosA);
            almacenDAO.Actualizar(almacen);
            connection.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        resp.sendRedirect("/LibreriaCientifica/Almacen/update_almacen.jsp");
    }
}