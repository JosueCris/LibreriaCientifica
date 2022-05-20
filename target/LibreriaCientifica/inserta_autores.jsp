<%--
  Created by IntelliJ IDEA.
  User: JOSUE
  Date: 16/05/2022
  Time: 09:53 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="Modelo.Autor" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>--%>
<html>
<head>
    <title>Inserta Autor</title>
</head>
<body background="fondo.jpg">
<main class="main">
    <div class="container">
        <form method="post" action="/LibreriaCientifica/InsertaAutor">
            <p>Código Autor <input type="text" name = "codAutor"> </p>
            <p>Nombre Completo <input type="text" name = "nombreCompleto"> </p>
            <p class="center-content">
                <input type="submit" value="Ingresar"/>
            </p>
        </form>

        <form action="index.jsp">
            <input type="submit" value="Regresar"/>
        </form>
    </div>
</main>
</body>
</html>
