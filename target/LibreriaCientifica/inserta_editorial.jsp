<%--
  Created by IntelliJ IDEA.
  User: JOSUE
  Date: 16/05/2022
  Time: 10:25 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="Modelo.Editorial" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>--%>
<html>
<head>
    <title>Inserta Editorial</title>
</head>
<body background="fondo.jpg">
<main class="main">
    <div class="container">
        <form method="post" action="/LibreriaCientifica/InsertaEditorial">
            <p>Código Editorial <input type="text" name = "codEditorial"> </p>
            <p>Nombre Editorial <input type="text" name = "nombreEditorial"> </p>
            <p>Contacto <input type="text" name = "contacto"> </p>
            <p>Teléfono <input type="text" name = "telefono"> </p>
            <p>Correo <input type="text" name = "correo"> </p>
            <p>Dirección <input type="text" name = "direccion"> </p>
            <p>Ciudad <input type="text" name = "ciudad"> </p>
            <p>País <input type="text" name = "pais"> </p>
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