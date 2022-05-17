package Controlador;

import Datos.NotaVentaDAO;
import Modelo.NotaVenta;

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

@WebServlet(name = "ServletNotaVenta", urlPatterns = {"/ServletNotaVenta"})
public class ServletNotaVenta extends HttpServlet {
    @Resource(name = "jdbc/database")
    private DataSource conexion;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            Connection connection = conexion.getConnection();
            NotaVentaDAO notaVentaDAO = new NotaVentaDAO(connection);
            NotaVenta notaVenta = new NotaVenta();
            req.getSession().setAttribute("Datos", notaVentaDAO.Consulta(notaVenta));
        } catch (Exception e){
            req.getSession().setAttribute("Datos", new ArrayList<NotaVenta>());
            e.printStackTrace();
        }
        resp.sendRedirect("/notaventa.jsp");
    }
}
