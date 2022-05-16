package Controlador;

import Datos.CargoDAO;
import Modelo.Cargo;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ServletCargo", urlPatterns = {"/ServletCargo"})
public class ServletCargo extends HttpServlet {
    @Resource(name = "jdbc/database")
    Cargo cargo = new Cargo();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            CargoDAO cargoDAO = new CargoDAO();
            req.getSession().setAttribute("Datos", cargoDAO.Consulta(cargo));
        } catch (Exception e){
            req.getSession().setAttribute("Datos", new ArrayList<Cargo>());
            e.printStackTrace();
        }
        resp.sendRedirect("/cargo.jsp");
    }
}
