package Controlador;

import Datos.CargoDAO;
import Datos.EstanteDAO;
import Modelo.Cargo;
import Modelo.Estante;

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

@WebServlet(name = "ServletEstante", urlPatterns = {"/ServletEstante"})
public class ServletEstante extends HttpServlet {
    @Resource(name = "jdbc/database")
    private DataSource conexion;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Connection connection = conexion.getConnection();
            EstanteDAO estanteDAO = new EstanteDAO(connection);
            Estante estante = new Estante();
            req.getSession().setAttribute("Datos", estanteDAO.Consulta(estante));
        } catch (Exception e){
            req.getSession().setAttribute("Datos", new ArrayList<Cargo>());
            e.printStackTrace();
        }
        resp.sendRedirect("/estante.jsp");
    }
}
