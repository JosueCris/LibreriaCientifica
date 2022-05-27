//package Controlador;
//
//import Datos.AlmacenDAO;
//import Modelo.Almacen;
//
//import javax.annotation.Resource;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.sql.DataSource;
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.SQLException;
//
//@WebServlet(name = "SearchAlmacen", urlPatterns = {"/SearchAlmacen"})
//public class SearchAlmacen extends HttpServlet {
//    private int codAlmacen;
//
//    @Resource(name = "jdbc/database")
//    private DataSource conexion;
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        codAlmacen = Integer.parseInt(req.getParameter("CodRepisa"));
//
//        try {
//            Connection connection = conexion.getConnection();
//            AlmacenDAO almacenDAO = new AlmacenDAO(connection);
//
//            Almacen almacen = almacenDAO.getAlmacen(codAlmacen);
//
//
//            if (almacen != null){
//                req.getSession().setAttribute("CodRepida", almacen.getCodRepisa());
//                req.getSession().setAttribute("Si se encuentra!!!", true);
//            }
//            else{
//                req.getSession().setAttribute("CodRepisa", null);
//                req.getSession().setAttribute("Si se encuentra!!!", false);
//            }
//            req.getSession().setAttribute("idCliente", null);
//            req.getSession().setAttribute("datos", cliente);
//            req.getSession().setAttribute("datosCitas", citas);
//
//            connection.close();
//        } catch (SQLException e){
//            req.getSession().setAttribute("encontrado", false);
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        response.sendRedirect("/zulemakeup/Clientes/BuscarCliente.jsp");
//    }
//}