<%@ page import="Modelo.Libros" %><%--
  Created by IntelliJ IDEA.
  User: JOSUE
  Date: 28/04/2022
  Time: 03:17 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="Modelo.Cliente" %>

<html>
<head>
    <title>Cliente</title>
</head>
<body background="fondo.jpg">
<main class="main">
    <div class="container">
        <center><h1>Lista de Clientes</h1></center>
        <table align="center">
            <thead>
            <tr>
                <th>Código Cliente </th>
                <th>Nombre </th>
                <th>Apellido Paterno </th>
                <th>Apellido Materno </th>
                <th>Correo </th>
                <th>Telefono </th>
            </tr>
            </thead>
            <%
                ArrayList<Cliente> lista = (ArrayList) session.getAttribute("Datos");
                if (lista != null){
                    for (Cliente cliente : lista){
            %><tr>
            <td><%out.print(cliente.getCodCliente()); %></td>
            <td><%out.print(cliente.getNombre());%></td>
            <td><%out.print(cliente.getaPaterno());%></td>
            <td><%out.print(cliente.getaMaterno());%></td>
            <td><%out.print(cliente.getCorreo());%></td>
            <td><%out.print(cliente.getTelefono());%></td>
        </tr><%
                }
            }
            else
                response.sendRedirect("/LibreriaCientifica/ServletCliente");
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