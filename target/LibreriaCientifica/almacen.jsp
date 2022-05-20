<%--
  Created by IntelliJ IDEA.
  User: JOSUE
  Date: 15/05/2022
  Time: 10:38 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="Modelo.Almacen" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Almacen</title>
</head>
<body background="fondo.jpg">
<main class="main">
    <div class="container">
        <center><h1>Lista de Almacenes</h1></center>
        <table align="center">
            <thead>
            <tr>
                <th>Código de la Repisa </th>
                <th>Numero de Ejemplares </th>
                <th>Pasillo </th>
            </tr>
            </thead>
            <%
                ArrayList<Almacen> lista = (ArrayList) session.getAttribute("Datos");
                if (lista != null){
                    for (Almacen almacen : lista){
            %><tr>
            <td><%out.print(almacen.getCodRepisa()); %></td>
            <td><%out.print(almacen.getNumeroEjemplares());%></td>
            <td><%out.print(almacen.getPasillosA());%></td>

        </tr><%
                }
            }
            else{
                    response.sendRedirect("/LibreriaCientifica/ServletAlmacen");
                }
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