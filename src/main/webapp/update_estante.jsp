<%--
  Created by IntelliJ IDEA.
  User: JOSUE
  Date: 31/05/2022
  Time: 10:03 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="Modelo.Libros" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>--%>
<html>
<head>
    <title>Update Estante</title>
</head>
<body background="fondo.jpg">
<main class="main">
    <div class="container">
        <form method="post" action="/LibreriaCientifica/UpdateEstante">
            <p>Código Estante <input type="text" name = "codEstante"> </p>
            <p>Número de Ejemplares <input type="text" name = "numeroEjemplares"> </p>
            <p>Pasillo <input type="text" name = "pasillo"> </p>
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