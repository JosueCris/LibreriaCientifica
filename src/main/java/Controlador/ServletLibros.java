package Controlador;

import Datos.LibrosDAO;
import Modelo.Libros;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@WebServlet(name = "ServletLibros", urlPatterns = {"/ServletLibros"})
public class ServletLibros extends HttpServlet {
    private static final Integer maximo_numero = 30;
    public static final long serialVersionUID = 1L;

    public ServletLibros() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Libros libros = new Libros();
            LibrosDAO librosDAO = new LibrosDAO();
            final List<Libros> libro = librosDAO.Consulta(libros);
            int limite = contar(libro.size());
            List<List<Libros>> sublista = Stream.iterate(0, n -> n + 1).limit(limite).parallel().map(a->libro.stream().skip(a*maximo_numero).limit(maximo_numero).parallel().collect(Collectors.toList())).collect(Collectors.toList());
            req.setAttribute("ServletLibros", sublista);
            req.getRequestDispatcher("ServletLibros.jsp").forward(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Integer contar(Integer size) {
        return (size + maximo_numero - 1) / maximo_numero;
    }
}
