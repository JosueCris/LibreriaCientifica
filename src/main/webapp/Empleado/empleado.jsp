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
    <title>Empleados</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="/LibreriaCientifica/estilo1.css">
    <link rel="stylesheet" href="/LibreriaCientifica/style.css">
    <link rel="icon" href="/LibreriaCientifica/loguito.png">
    <script src="https://kit.fontawesome.com/0458944bda.js" crossorigin="anonymous"></script>
</head>
<body background="../fondo.jpg">

<header class="header">
    <div class="container logo-nav-container">
        <nav class="navigation">
            <ul class="show">
                <a href="#" class="logo"><img src="../logo.png" style="width: 150px; height: 43px;"/></a>
                <li><a href="/LibreriaCientifica">Inicio</a></li>
                <li><font face="times new roman" size="5px"><a href="/LibreriaCientifica/Almacen/menu_almacen.jsp">Almacen</a></font></li>
                <li><font face="times new roman" size="5px"><a href="/LibreriaCientifica/Autor/menu_autores.jsp">Autor</a></font></li>
                <li><font face="times new roman" size="5px"><a href="/LibreriaCientifica/Cargo/menu_cargo.jsp">Cargo</a></font></li>
                <li><font face="times new roman" size="5px"><a href="/LibreriaCientifica/Cliente/menu_cliente.jsp">Cliente</a></font></li>
                <li><font face="times new roman" size="5px"><a href="/LibreriaCientifica/Editorial/menu_editorial.jsp">Editorial</a></font></li>
                <li><font face="times new roman" size="5px"><a href="/LibreriaCientifica/Empleado/menu_empleado.jsp">Empleado</a></font></li>
                <li><font face="times new roman" size="5px"><a href="/LibreriaCientifica/Estante/menu_estante.jsp">Estante</a></font></li>
                <li><font face="times new roman" size="5px"><a href="/LibreriaCientifica/Idioma/menu_idioma.jsp">Idioma</a></font></li>
                <li><font face="times new roman" size="5px"><a href="/LibreriaCientifica/Libros/menu_libros.jsp">Libros</a></font></li>
                <li><font face="times new roman" size="5px"><a href="/LibreriaCientifica/Materia/menu_materia.jsp">Materia</a></font></li>
                <li><font face="times new roman" size="5px"><a href="/LibreriaCientifica/NotaVenta/menu_notaventa.jsp">Nota</a></font></li>

            </ul>
        </nav>
    </div>
</header>

<main class="main">
    <div class="container">
        <br/><center><h1>Lista de Empleados</h1></center>
        <table align="center" bgcolor="#f4a460" style="width: 100%">
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
            <style>
                table, th, td {
                    border:3px solid saddlebrown;
                }
            </style>
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
        <br/><form action="/LibreriaCientifica/Empleado/menu_empleado.jsp">
            <input type="submit" value="Regresar"/>
        </form>
    </div>
</main>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
</body>
</html>