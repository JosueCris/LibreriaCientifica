<%--
  Created by IntelliJ IDEA.
  User: JOSUE
  Date: 31/05/2022
  Time: 01:16 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="Modelo.Libros" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>--%>
<html>
<head>
    <title>Actualiza Empleado</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="/LibreriaCientifica/estilo1.css">
    <link rel="stylesheet" href="/LibreriaCientifica/style.css">
    <link rel="icon" href="/LibreriaCientifica/loguito.png">
</head>
<body background="../fondo.jpg">

<header class="header">
    <div class="container logo-nav-container">
        <nav class="navigation">
            <ul class="show">
                <a href="#" class="logo"><img src="../logo.png" style="width: 150px; height: 43px;"/></a>
                <li><a href="/LibreriaCientifica">Inicio</a></li>
                <li><font face="times new roman" size="5px"><a href="/LibreriaCientifica/Almacen/menu_almacen.jsp">Almacen</a></font></li>
                <li><font face="times new roman" size="5px"><a href="/LibreriaCientifica/Autor/menu_autores.jsp">Autor</a></font></li>
                <li><font face="times new roman" size="5px"><a href="/LibreriaCientifica/Cargo/menu_cargo.jsp">Cargo</a></font></li>
                <li><font face="times new roman" size="5px"><a href="/LibreriaCientifica/Cliente/menu_cliente.jsp">Cliente</a></font></li>
                <li><font face="times new roman" size="5px"><a href="/LibreriaCientifica/Editorial/menu_editorial.jsp">Editorial</a></font></li>
                <li><font face="times new roman" size="5px"><a href="/LibreriaCientifica/Empleado/menu_empleado.jsp">Empleado</a></font></li>
                <li><font face="times new roman" size="5px"><a href="/LibreriaCientifica/Estante/menu_estante.jsp">Estante</a></font></li>
                <li><font face="times new roman" size="5px"><a href="/LibreriaCientifica/Idioma/menu_idioma.jsp">Idioma</a></font></li>
                <li><font face="times new roman" size="5px"><a href="/LibreriaCientifica/Libros/menu_libros.jsp">Libros</a></font></li>
                <li><font face="times new roman" size="5px"><a href="/LibreriaCientifica/Materia/menu_materia.jsp">Materia</a></font></li>
                <li><font face="times new roman" size="5px"><a href="/LibreriaCientifica/NotaVenta/menu_notaventa.jsp">Nota</a></font></li>

            </ul>
        </nav>
    </div>
</header>

<main class="main">
    <div class="container">
        <br/><br/><form method="post" action="/LibreriaCientifica/UpdateEmpleado">
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
                <input type="submit" value="Actualizar"/>
            </p>
        </form>

        <form action="/LibreriaCientifica/Empleado/menu_empleado.jsp">
            <input type="submit" value="Regresar"/>
        </form>
    </div>
</main>
</body>
</html>