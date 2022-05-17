package Controlador;

import Datos.CargoDAO;
import Modelo.Cargo;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;

@WebServlet(name = "InsertaCargo", urlPatterns = {"/InsertaCargo"})
public class InsertaCargo extends HttpServlet {
    private int codCargo;
    private String nombreCargo;

    @Resource(name = "jdbc/database")
    private DataSource conexion;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        codCargo = Integer.parseInt(req.getParameter("codCargo"));
        nombreCargo = req.getParameter("nombreCargo");

        try{
            Connection connection = conexion.getConnection();
            CargoDAO cargoDAO = new CargoDAO(connection);
            Cargo cargo = new Cargo(codCargo, nombreCargo);
            cargoDAO.Insertar(cargo);
            connection.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        resp.sendRedirect("/inserta_cargo.jsp");
    }
}
