<%--
  Created by IntelliJ IDEA.
  User: JOSUE
  Date: 02/06/2022
  Time: 09:23 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="Modelo.NotaVenta" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>--%>
<html>
<head>
    <title>Elimina Nota</title>
</head>
<body background="fondo.jpg">
<main class="main">
    <div class="container">
        <form method="post" action="/LibreriaCientifica/EliminaNotaVenta">
            <p>Código Nota <input type="text" name = "codNota"> </p>
            <p class="center-content">
                <input type="submit" value="Eliminar"/>
            </p>
        </form>

        <form action="index.jsp">
            <input type="submit" value="Regresar"/>
        </form>
    </div>
</main>
</body>
</html>