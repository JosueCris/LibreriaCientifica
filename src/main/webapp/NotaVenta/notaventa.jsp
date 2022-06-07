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
</head>
<body background="../fondo.jpg">
<main class="main">
    <div class="container">
        <center><h1>Lista de Notas</h1></center>
        <table align="center">
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
        <form action="/LibreriaCientifica/NotaVenta/menu_notaventa.jsp">
            <input type="submit" value="Regresar"/>
        </form>
    </div>
</main>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
</body>
</html>