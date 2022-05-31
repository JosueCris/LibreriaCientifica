<%--
  Created by IntelliJ IDEA.
  User: JOSUE
  Date: 16/05/2022
  Time: 10:46 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="Modelo.Libros" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>--%>
<html>
<head>
    <title>Inserta Empleado</title>
</head>
<body background="fondo.jpg">
<main class="main">
    <div class="container">
        <form method="post" action="/LibreriaCientifica/InsertaEmpleado">
            <p>Código Empleado <input type="text" name = "codEmpleado"> </p>
            <p>Nombre <input type="text" name = "nombre"> </p>
            <p>Apellido Paterno <input type="text" name = "aPaterno"> </p>
            <p>Apellido Materno <input type="text" name = "aMaterno"> </p>
            <p>Género <input type="text" name = "genero"> </p>
            <p>Fecha de Nacimiento <input type="text" name = "fechaNacimiento"> </p>
            <p>Fecha de Contratación <input type="text" name = "fechaContratacion"> </p>
            <p>Dirección <input type="text" name = "direccion"> </p>
            <p>Correo <input type="text" name = "correo"> </p>
            <p>Teléfono <input type="text" name = "telefono"> </p>
            <p>Cargo <input type="text" name = "eCargo"> </p>
            <p>Status <input type="text" name = "status"> </p>
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