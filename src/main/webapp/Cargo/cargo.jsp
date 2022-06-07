<%--
  Created by IntelliJ IDEA.
  User: JOSUE
  Date: 15/05/2022
  Time: 09:19 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="Modelo.Cargo" %>

<html>
<head>
    <title>Cargo</title>
</head>
<body background="../fondo.jpg">
<main class="main">
    <div class="container">
        <center><h1>Lista de cargos</h1></center>
        <table align="center">
            <thead>
            <tr>
                <th>Código de Cargo: </th>
                <th>Nombre Cargo: </th>
            </tr>
            </thead>
            <%
                ArrayList<Cargo> lista = (ArrayList) session.getAttribute("Datos");
                if (lista != null){
                    for (Cargo cargo : lista){
            %><tr>
            <td><%out.print(cargo.getCodCargo()); %></td>
            <td><%out.print(cargo.getNombreCargo());%></td>
        </tr><%
                }
            }
            else
                response.sendRedirect("/LibreriaCientifica/ServletCargo");
            session.removeAttribute("Datos");
        %>
        </table>
        <form action="/LibreriaCientifica/Cargo/menu_cargo.jsp">
            <input type="submit" value="Regresar"/>
        </form>
    </div>
</main>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
</body>
</html>