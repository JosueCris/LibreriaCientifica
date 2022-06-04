package Controlador.NotaVenta;

import Datos.NotaVentaDAO;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;

@WebServlet(name = "EliminaNotaVenta", urlPatterns = {"/EliminaNotaVenta"})
public class EliminaNotaVenta extends HttpServlet {
    private int codNota;

    @Resource(name = "jdbc/database")
    private DataSource conexion;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        codNota = Integer.parseInt(req.getParameter("codNota"));
        try {
            Connection connection = conexion.getConnection();
            NotaVentaDAO notaVentaDAO = new NotaVentaDAO(connection);
            notaVentaDAO.Eliminar(codNota);
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        resp.sendRedirect("/LibreriaCientifica/elimina_notaventa.jsp");
    }
}