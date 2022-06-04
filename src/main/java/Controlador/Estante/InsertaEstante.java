package Controlador.Estante;

import Datos.EstanteDAO;
import Modelo.Estante;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;

@WebServlet(name = "InsertaEstante", urlPatterns = {"/InsertaEstante"})
public class InsertaEstante extends HttpServlet {
    private int codEstante;
    private int numeroEjemplares;
    private int pasillo;

    @Resource(name = "jdbc/database")
    private DataSource conexion;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        codEstante = Integer.parseInt(req.getParameter("codEstante"));
        numeroEjemplares = Integer.parseInt(req.getParameter("numeroEjemplares"));
        pasillo = Integer.parseInt(req.getParameter("pasillo"));

        try{
            Connection connection = conexion.getConnection();
            EstanteDAO estanteDAO = new EstanteDAO(connection);
            Estante estante = new Estante(codEstante, numeroEjemplares, pasillo);
            estanteDAO.Insertar(estante);
            connection.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        resp.sendRedirect("/LibreriaCientifica/inserta_estante.jsp");
    }
}