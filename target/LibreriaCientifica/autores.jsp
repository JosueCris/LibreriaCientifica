<%@ page import="Modelo.Autor" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: JOSUE
  Date: 28/04/2022
  Time: 03:17 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Autores</title>
</head>
<body background="fondo.jpg">
<main class="main">
    <div class="container">
        <center><h1>Lista de Autores</h1></center>
        <table align="center">
            <thead>
            <tr>
                <th>Código del Autor: </th>
                <th>Nombre Completo: </th>
            </tr>
            </thead>
            <%
                ArrayList<Autor> lista = (ArrayList) session.getAttribute("Datos");
                if (lista != null){
                    for (Autor autores : lista){
            %><tr>
            <td><%out.print(autores.getCodAutor()); %></td>
            <td><%out.print(autores.getNombreCompleto());%></td>
            </tr><%
                }
            }
            else
                response.sendRedirect("/LibreriaCientifica/ServletAutor");
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
