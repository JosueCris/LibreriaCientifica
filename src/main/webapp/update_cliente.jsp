<%--
  Created by IntelliJ IDEA.
  User: JOSUE
  Date: 31/05/2022
  Time: 12:41 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="Modelo.Cliente" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>--%>
<html>
<head>
    <title>Actualiza Cliente</title>
</head>
<body background="fondo.jpg">
<main class="main">
    <div class="container">
        <form method="post" action="/LibreriaCientifica/UpdateCliente">
            <p>Código Cliente <input type="text" name = "codCliente"> </p>
            <p>Nombre <input type="text" name = "nombre"> </p>
            <p>Apellido Paterno <input type="text" name = "aPaterno"> </p>
            <p>Apellido Materno <input type="text" name = "aMaterno"> </p>
            <p>Correo <input type="text" name = "correo"> </p>
            <p>Telefono <input type="text" name = "telefono"> </p>
            <p>Status <input type="text" name = "status"> </p>
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