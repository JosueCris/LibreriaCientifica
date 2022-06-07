<%--
  Created by IntelliJ IDEA.
  User: JOSUE
  Date: 16/05/2022
  Time: 09:45 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="Modelo.Almacen" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>--%>
<html>
<head>
    <title>Inserta Almacen</title>
</head>
<body background="../fondo.jpg">
<main class="main">
    <div class="container">
        <form method="post" action="/LibreriaCientifica/InsertaAlmacen">
            <p>Código Repisa <input type="text" name = "codRepisa"> </p>
            <p>Numero de Ejemplares <input type="text" name = "numeroEjemplares"> </p>
            <p>Pasillos <input type="text" name = "pasillosA"> </p>
            <p class="center-content">
                <input type="submit" value="Ingresar"/>
            </p>
        </form>

        <form action="/LibreriaCientifica/Almacen/menu_almacen.jsp">
            <input type="submit" value="Regresar"/>
        </form>
    </div>
</main>
</body>
</html>