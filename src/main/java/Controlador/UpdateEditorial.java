package Controlador;

import Datos.EditorialDAO;
import Modelo.Editorial;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;

@WebServlet(name = "UpdateEditorial", urlPatterns = {"/UpdateEditorial"})
public class UpdateEditorial extends HttpServlet {
    private int codEditorial;
    private String nombreEditorial;
    private String contacto;
    private String telefono;
    private String correo;
    private String direccion;
    private String ciudad;
    private String pais;
    private boolean status;

    @Resource(name = "jdbc/database")
    private DataSource conexion;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        codEditorial = Integer.parseInt(req.getParameter("codEditorial"));
        nombreEditorial = req.getParameter("nombreEditorial");
        contacto = req.getParameter("contacto");
        telefono = req.getParameter("telefono");
        correo = req.getParameter("correo");
        direccion = req.getParameter("direccion");
        ciudad = req.getParameter("ciudad");
        pais = req.getParameter("pais");
        status = Boolean.parseBoolean(req.getParameter("status"));

        try{
            Connection connection = conexion.getConnection();
            EditorialDAO editorialDAO = new EditorialDAO(connection);
            Editorial editorial = new Editorial(codEditorial, nombreEditorial, contacto, telefono, correo, direccion, ciudad, pais, status);
            editorialDAO.Actualizar(editorial);
            connection.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        resp.sendRedirect("/LibreriaCientifica/update_editorial.jsp");
    }
}