<%@ page import="Modelo.Libros" %><%--
  Created by IntelliJ IDEA.
  User: JOSUE
  Date: 28/04/2022
  Time: 03:17 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.ArrayList" %>

<html>
<head>
    <title>LIBROS</title>
</head>
<body background="fondo.jpg">
<main class="main">
    <div class="container">
        <center><h1>Colección de libros</h1></center>
        <table align="center">
            <thead>
            <tr>
                <th>ISBN: </th>
                <th>Titulo: </th>
                <th>Año de Edición: </th>
                <th>Editorial: </th>
                <th>Idioma: </th>
                <th>Paginas: </th>
                <th>Materia: </th>
                <th>Precio: </th>
                <th>Sinopsis: </th>
                <th>Estante: </th>
            </tr>
            </thead>
            <%
                ArrayList<Libros> lista = (ArrayList) session.getAttribute("Datos");
                if (lista != null){
                    for (Libros libros : lista){
            %><tr>
            <td><%out.print(libros.getIsbn()); %></td>
            <td><%out.print(libros.getTitulo());%></td>
            <td><%out.print(libros.getAnioEdicion());%></td>
            <td><%out.print(libros.getrEditorial());%></td>
            <td><%out.print(libros.getrIdioma());%></td>
            <td><%out.print(libros.getNumeroPaginas());%></td>
            <td><%out.print(libros.getrMateria());%></td>
            <td><%out.print(libros.getPrecio());%></td>
            <td><%out.print(libros.getSinopsis());%></td>
            <td><%out.print(libros.getrEstante());%></td>
        </tr><%
                }
            }
            else
                response.sendRedirect("/LibreriaCientifica/ServletLibros");
            session.removeAttribute("Datos");
        %>
        </table>
        <form action="index.jsp">
            <input type="submit" value="Regresar"/>
        </form>
    </div>
</main>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
</body>
</html>