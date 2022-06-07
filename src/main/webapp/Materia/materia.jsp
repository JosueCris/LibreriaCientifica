<%--
  Created by IntelliJ IDEA.
  User: JOSUE
  Date: 15/05/2022
  Time: 11:22 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="Modelo.Materia" %>

<html>
<head>
    <title>Materia</title>
</head>
<body background="../fondo.jpg">
<main class="main">
    <div class="container">
        <center><h1>Lista de Materias</h1></center>
        <table align="center">
            <thead>
            <tr>
                <th>Código de Materia: </th>
                <th>Nombre Materia: </th>
            </tr>
            </thead>
            <%
                ArrayList<Materia> lista = (ArrayList) session.getAttribute("Datos");
                if (lista != null){
                    for (Materia materia : lista){
            %><tr>
            <td><%out.print(materia.getCodMateria()); %></td>
            <td><%out.print(materia.getNombreMateria());%></td>
        </tr><%
                }
            }
            else
                response.sendRedirect("/LibreriaCientifica/ServletMateria");
            session.removeAttribute("Datos");
        %>
        </table>
        <form action="/LibreriaCientifica/Materia/menu_materia.jsp">
            <input type="submit" value="Regresar"/>
        </form>
    </div>
</main>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
</body>
</html>
