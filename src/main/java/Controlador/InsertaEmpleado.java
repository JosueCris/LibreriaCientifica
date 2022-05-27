package Controlador;

import Datos.AlmacenDAO;
import Datos.EmpleadoDAO;
import Modelo.Almacen;
import Modelo.Empleado;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;

@WebServlet(name = "InsertaEmpleado", urlPatterns = {"/InsertaEmpleado"})
public class InsertaEmpleado extends HttpServlet {
    private int codEmpleado;
    private String nombre;
    private String aPaterno;
    private String aMaterno;
    private String genero;
    private String fechaNacimiento;
    private String fechaContratacion;
    private String direccion;
    private String correo;
    private String telefono;
    private String eCargo;

    @Resource(name = "jdbc/database")
    private DataSource conexion;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        codEmpleado = Integer.parseInt(req.getParameter("codEmpleado"));
        nombre = req.getParameter("nombre");
        aPaterno = req.getParameter("aPaterno");
        aMaterno = req.getParameter("aMaterno");
        genero = req.getParameter("genero");
        fechaNacimiento = req.getParameter("fechaNacimiento");
        fechaContratacion = req.getParameter("fechaContratacion");
        direccion = req.getParameter("direccion");
        correo = req.getParameter("correo");
        telefono = req.getParameter("telefono");
        eCargo = req.getParameter("eCargo");

        try{
            Connection connection = conexion.getConnection();
            EmpleadoDAO empleadoDAO = new EmpleadoDAO(connection);
            Empleado empleado = new Empleado(nombre, aPaterno, aMaterno, genero, fechaNacimiento, fechaContratacion, direccion, correo, telefono, eCargo);
            empleadoDAO.Insertar(empleado);
            connection.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        resp.sendRedirect("/LibreriaCientifica/inserta_empleado.jsp");
    }
}