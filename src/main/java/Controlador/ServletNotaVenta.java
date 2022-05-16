package Controlador;

import Datos.MateriaDAO;
import Datos.NotaVentaDAO;
import Modelo.Materia;
import Modelo.NotaVenta;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ServletNotaVenta", urlPatterns = {"/ServletNotaVenta"})
public class ServletNotaVenta extends HttpServlet {
    @Resource(name = "jdbc/database")
    NotaVenta notaVenta = new NotaVenta();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            NotaVentaDAO notaVentaDAO = new NotaVentaDAO();
            req.getSession().setAttribute("Datos", notaVentaDAO.Consulta(notaVenta));
        } catch (Exception e){
            req.getSession().setAttribute("Datos", new ArrayList<NotaVenta>());
            e.printStackTrace();
        }
        resp.sendRedirect("/notaventa.jsp");
    }
}
