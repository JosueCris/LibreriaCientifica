<%--
  Created by IntelliJ IDEA.
  User: JOSUE
  Date: 15/05/2022
  Time: 03:14 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="Modelo.Libros" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>--%>
<html>
<head>
    <title>Inserta Libros</title>
</head>
<body background="fondo.jpg">
<main class="main">
    <div class="container">
        <form method="post" action="/LibreriaCientifica/InsertaLibros">
            <p>ISBN <input type="text" name = "isbn"> </p>
            <p>Titulo <input type="text" name = "titulo"> </p>
            <p>Año Edición <input type="text" name = "anioEdicion"> </p>
            <p>Editorial <input type="text" name = "rEditorial"> </p>
            <p>Idioma <input type="text" name = "rIdioma"> </p>
            <p>Paginas <input type="text" name = "numeroPaginas"> </p>
            <p>Materia <input type="text" name = "rMateria"> </p>
            <p>Precio <input type="text" name = "precio"> </p>
            <p>Sinopsis <input type="text" name = "sinopsis"> </p>
            <p>Estante <input type="text" name = "rEstante"> </p>
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