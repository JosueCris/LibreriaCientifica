<%--
  Created by IntelliJ IDEA.
  User: JOSUE
  Date: 16/05/2022
  Time: 11:22 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="Modelo.NotaVenta" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>--%>
<html>
<head>
    <title>Inserta Nota</title>
</head>
<body background="../fondo.jpg">
<main class="main">
    <div class="container">
        <form method="post" action="/LibreriaCientifica/InsertaNotaVenta">
            <p>Código Nota <input type="text" name = "codNota"> </p>
            <p>Cliente <input type="text" name = "rCliente"> </p>
            <p>Libro <input type="text" name = "rLibro"> </p>
            <p>Cantidad <input type="text" name = "cantidad"> </p>
            <p>Tipo de Pago <input type="text" name = "tipoPago"> </p>
            <p>Empleado <input type="text" name = "rEmpleado"> </p>
            <p>Fecha de Compra <input type="text" name = "fechaCompra"> </p>
            <p>Status <input type="text" name = "status"> </p>
            <p class="center-content">
                <input type="submit" value="Ingresar"/>
            </p>
        </form>

        <form action="/LibreriaCientifica/NotaVenta/menu_notaventa.jsp">
            <input type="submit" value="Regresar"/>
        </form>
    </div>
</main>
</body>
</html>