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
</head>
<body background="../fondo.jpg">
<main class="main">
  <div class="container">
    <form method="post" action="/LibreriaCientifica/InsertaMateria">
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