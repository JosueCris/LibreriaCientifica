<%--
  Created by IntelliJ IDEA.
  User: JOSUE
  Date: 31/05/2022
  Time: 01:19 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="Modelo.Almacen" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>--%>
<html>
<head>
  <title>Actualiza Almacen</title>
</head>
<body background="fondo.jpg">
<main class="main">
  <div class="container">
    <form method="post" action="/LibreriaCientifica/UpdateAlmacen">
      <p>Código Repisa <input type="text" name = "codRepisa"> </p>
      <p>Numero de Ejemplares <input type="text" name = "numeroEjemplares"> </p>
      <p>Pasillos <input type="text" name = "pasillosA"> </p>
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