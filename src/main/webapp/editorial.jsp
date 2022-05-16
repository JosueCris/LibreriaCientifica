<%@ page import="Modelo.Editorial" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: JOSUE
  Date: 15/05/2022
  Time: 10:52 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Editorial</title>
</head>
<body background="fondo.jpg">
<main class="main">
    <div class="container">
        <center><h1>Lista de Editoriales</h1></center>
        <table align="center">
            <thead>
            <tr>
                <th>Código de la Editorial: </th>
                <th>Nombre Editorial: </th>
            </tr>
            </thead>
            <%
                ArrayList<Editorial> lista = (ArrayList) session.getAttribute("Datos");
                if (lista != null){
                    for (Editorial editorial : lista){
            %><tr>
            <td><%out.print(editorial.getCodEditorial()); %></td>
            <td><%out.print(editorial.getNombreEditorial());%></td>
            <td><%out.print(editorial.getContacto()); %></td>
            <td><%out.print(editorial.getTelefono());%></td>
            <td><%out.print(editorial.getCorreo()); %></td>
            <td><%out.print(editorial.getDireccion());%></td>
            <td><%out.print(editorial.getCiudad()); %></td>
            <td><%out.print(editorial.getPais());%></td>
        </tr><%
                }
            }
            else
                response.sendRedirect("/LibreriaCientifica/ServletEditorial");
            session.removeAttribute("Datos");
        %>
        </table>
        <form action="index.jsp">
            <input type="submit" value="Regresar"/>
        </form>
    </div>
</main>
</body>
</html>
