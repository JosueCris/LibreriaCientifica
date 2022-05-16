<%@ page import="Modelo.Idioma" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: JOSUE
  Date: 15/05/2022
  Time: 07:58 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Idioma</title>
</head>
<body background="fondo.jpg">
<main class="main">
    <div class="container">
        <center><h1>Lista de Idiomas</h1></center>
        <table align="center">
            <thead>
            <tr>
                <th>Código del Idioma </th>
                <th>Nombre Idioma </th>
            </tr>
            </thead>
            <%
                ArrayList<Idioma> lista = (ArrayList) session.getAttribute("Datos");
                if (lista != null) {
                    for (Idioma idioma : lista){
            %><tr>
            <td><%out.print(idioma.getCodIdioma()); %></td>
            <td><%out.print(idioma.getNombreIdioma());%></td>
        </tr><%
                }
            }
            else
                response.sendRedirect("/LibreriaCientifica/ServletIdioma");
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