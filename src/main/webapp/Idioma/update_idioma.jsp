<%--
  Created by IntelliJ IDEA.
  User: JOSUE
  Date: 31/05/2022
  Time: 10:09 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="Modelo.Idioma" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>--%>
<html>
<head>
  <title>Actualiza Idioma</title>
</head>
<body background="../fondo.jpg">
<main class="main">
  <div class="container">
    <form method="post" action="/LibreriaCientifica/UpdateIdioma">
      <p>Código Idioma <input type="text" name = "codIdioma"> </p>
      <p>Nombre Idioma <input type="text" name = "nombreIdioma"> </p>
      <p class="center-content">
        <input type="submit" value="Actualizar"/>
      </p>
    </form>

    <form action="/LibreriaCientifica/Idioma/menu_idioma.jsp">
      <input type="submit" value="Regresar"/>
    </form>
  </div>
</main>
</body>
</html>