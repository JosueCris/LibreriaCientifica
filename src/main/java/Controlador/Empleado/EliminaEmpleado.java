package Controlador.Empleado;

import Datos.EmpleadoDAO;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;

@WebServlet(name = "EliminaEmpleado", urlPatterns = {"/EliminaEmpleado"})
public class EliminaEmpleado extends HttpServlet {
    private int codEmpleado;

    @Resource(name = "jdbc/database")
    private DataSource conexion;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        codEmpleado = Integer.parseInt(req.getParameter("codEmpleado"));
        try {
            Connection connection = conexion.getConnection();
            EmpleadoDAO empleadoDAO = new EmpleadoDAO(connection);
            empleadoDAO.Eliminar(codEmpleado);
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        resp.sendRedirect("/LibreriaCientifica/elimina_notaventa.jsp");
    }
}