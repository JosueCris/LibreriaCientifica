package Controlador.Cargo;

import Datos.CargoDAO;
import Modelo.Cargo;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;

@WebServlet(name = "ServletCargo", urlPatterns = {"/ServletCargo"})
public class ServletCargo extends HttpServlet {
    @Resource(name = "jdbc/database")
    private DataSource conexion;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Connection connection = conexion.getConnection();
            CargoDAO cargoDAO = new CargoDAO(connection);
            Cargo cargo = new Cargo();
            req.getSession().setAttribute("Datos", cargoDAO.Consulta(cargo));
        } catch (Exception e){
            req.getSession().setAttribute("Datos", new ArrayList<Cargo>());
            e.printStackTrace();
        }
        resp.sendRedirect("/LibreriaCientifica/cargo.jsp");
    }
}
