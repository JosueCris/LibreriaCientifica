<%--
  Created by IntelliJ IDEA.
  User: JOSUE
  Date: 16/05/2022
  Time: 11:14 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="Modelo.Materia" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>--%>
<html>
<head>
  <title>Inserta Materia</title>
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
    <br/><br/><form method="post" action="/LibreriaCientifica/InsertaMateria">
      <p>Código Materia <input type="text" name = "codMateria"> </p>
      <p>Nombre Materia <input type="text" name = "nombreMateria"> </p>
      <p class="center-content">
        <input type="submit" value="Ingresar"/>
      </p>
    </form>

    <form action="/LibreriaCientifica/Materia/menu_materia.jsp">
      <input type="submit" value="Regresar"/>
    </form>
  </div>
</main>
</body>
</html>