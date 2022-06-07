<%@ page import="Modelo.Empleado" %><%--
<%--
  Created by IntelliJ IDEA.
  User: JOSUE
  Date: 31/05/2022
  Time: 12:14 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.ArrayList" %>

<html>
<head>
    <title>EMPLEADOS</title>
</head>
<body background="../fondo.jpg">
<main class="main">
    <div class="container">
        <center><h1>Lista de Empleados</h1></center>
        <table align="center">
            <thead>
            <tr>
                <th>Código Empleado: </th>
                <th>Nombre: </th>
                <th>Apellido Paterno: </th>
                <th>Apellido Materno: </th>
                <th>Género: </th>
                <th>Fecha Nacimiento: </th>
                <th>Fecha Contratación: </th>
                <th>Dirección: </th>
                <th>Correo: </th>
                <th>Teléfono: </th>
                <th>Cargo: </th>
            </tr>
            </thead>
            <%
                ArrayList<Empleado> lista = (ArrayList) session.getAttribute("Datos");
                if (lista != null){
                    for (Empleado empleado : lista){
            %><tr>
            <td><%out.print(empleado.getCodEmpleado()); %></td>
            <td><%out.print(empleado.getNombre());%></td>
            <td><%out.print(empleado.getaPaterno());%></td>
            <td><%out.print(empleado.getaMaterno());%></td>
            <td><%out.print(empleado.getGenero());%></td>
            <td><%out.print(empleado.getFechaNacimiento());%></td>
            <td><%out.print(empleado.getFechaContratacion());%></td>
            <td><%out.print(empleado.getDireccion());%></td>
            <td><%out.print(empleado.getCorreo());%></td>
            <td><%out.print(empleado.getTelefono());%></td>
            <td><%out.print(empleado.geteCargo());%></td>
        </tr><%
                }
            }
            else
                response.sendRedirect("/LibreriaCientifica/ServletEmpleado");
            session.removeAttribute("Datos");
        %>
        </table>
        <form action="/LibreriaCientifica/Empleado/menu_empleado.jsp">
            <input type="submit" value="Regresar"/>
        </form>
    </div>
</main>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
</body>
</html>