<%--
  Created by IntelliJ IDEA.
  User: JOSUE
  Date: 15/05/2022
  Time: 11:28 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="Modelo.NotaVenta" %>

<html>
<head>
    <title>Nota Venta</title>
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
        <br/><center><h1>Lista de Notas</h1></center>
        <table align="center" bgcolor="#f4a460" style="width: 100%">
            <thead>
            <tr>
                <th>Código de la Nota </th>
                <th>Cliente </th>
                <th>Libro </th>
                <th>Cantidad </th>
                <th>Tipo de Pago </th>
                <th>Empleado </th>
                <th>Fecha Compra </th>
            </tr>
            <style>
                table, th, td {
                    border:3px solid saddlebrown;
                }
            </style>
            </thead>
            <%
                ArrayList<NotaVenta> lista = (ArrayList) session.getAttribute("Datos");
                if (lista != null){
                    for (NotaVenta notaVenta : lista){
            %><tr>
            <td><%out.print(notaVenta.getCodNota()); %></td>
            <td><%out.print(notaVenta.getrCliente());%></td>
            <td><%out.print(notaVenta.getrLibro()); %></td>
            <td><%out.print(notaVenta.getCantidad());%></td>
            <td><%out.print(notaVenta.getTipoPago()); %></td>
            <td><%out.print(notaVenta.getrEmpleado());%></td>
            <td><%out.print(notaVenta.getFechaCompra()); %></td>
        </tr><%
                }
            }
            else
                response.sendRedirect("/LibreriaCientifica/ServletNotaVenta");
            session.removeAttribute("Datos");
        %>
        </table>
        <br/><form action="/LibreriaCientifica/NotaVenta/menu_notaventa.jsp">
            <input type="submit" value="Regresar"/>
        </form>
    </div>
</main>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
</body>
</html>