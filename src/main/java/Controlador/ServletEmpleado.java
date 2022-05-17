package Controlador;

import Datos.CargoDAO;
import Datos.EmpleadoDAO;
import Modelo.Cargo;
import Modelo.Empleado;

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

@WebServlet(name = "ServletEmpleado", urlPatterns = {"/ServletEmpleado"})
public class ServletEmpleado extends HttpServlet {
    @Resource(name = "jdbc/database")
    private DataSource conexion;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Connection connection = conexion.getConnection();
            EmpleadoDAO empleadoDAO = new EmpleadoDAO(connection);
            Empleado empleado = new Empleado();
            req.getSession().setAttribute("Datos", empleadoDAO.Consulta(empleado));
        } catch (Exception e){
            req.getSession().setAttribute("Datos", new ArrayList<Cargo>());
            e.printStackTrace();
        }
        resp.sendRedirect("/empleado.jsp");
    }
}
