<%--
  Created by IntelliJ IDEA.
  User: JOSUE
  Date: 02/06/2022
  Time: 01:11 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="Modelo.Cliente" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>--%>
<html>
<head>
    <title>Elimina Cliente</title>
</head>
<body background="../fondo.jpg">
<main class="main">
    <div class="container">
        <form method="post" action="/LibreriaCientifica/EliminaCliente">
            <p>Código Cliente <input type="text" name = "codCliente"> </p>
            <p class="center-content">
                <input type="submit" value="Eliminar"/>
            </p>
        </form>

        <form action="/LibreriaCientifica/Cliente/menu_cliente.jsp">
            <input type="submit" value="Regresar"/>
        </form>
    </div>
</main>
</body>
</html>