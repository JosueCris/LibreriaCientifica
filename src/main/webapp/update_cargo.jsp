<%--
  Created by IntelliJ IDEA.
  User: JOSUE
  Date: 31/05/2022
  Time: 01:56 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="Modelo.Cargo" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>--%>
<html>
<head>
    <title>Actualiza Cargo</title>
</head>
<body background="fondo.jpg">
<main class="main">
    <div class="container">
        <form method="post" action="/LibreriaCientifica/UpdateCargo">
            <p>Código Cargo <input type="text" name = "codAutor"> </p>
            <p>Nombre Cargo <input type="text" name = "nombreCargo"> </p>
            <p class="center-content">
                <input type="submit" value="Actualizar"/>
            </p>
        </form>

        <form action="index.jsp">
            <input type="submit" value="Regresar"/>
        </form>
    </div>
</main>
</body>
</html>

