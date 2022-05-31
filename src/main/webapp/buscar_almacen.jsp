<%--
  Created by IntelliJ IDEA.
  User: JOSUE
  Date: 27/05/2022
  Time: 12:28 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="Modelo.Almacen" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Buscar Cliente</title>
</head>
<body>
<main class="main">
    <div class="container">
        <form method="post" action="/LibreriaCientifica/SearchAlmacen">
            <p>Id <input type="number" name="CodRepisa"/></p>
            <p class="center-content">
                <input type="submit" value="Buscar"/>
            </p>
        </form>

        <%!
        %><%
        Boolean status = (Boolean) session.getAttribute("Si se encuentra!!!");
        Almacen almacen = (Almacen) session.getAttribute("Datos");
        if (status != null){
            if (status){
                session.setAttribute("CodRepisa", almacen.getCodRepisa());
    %><tr>
        <tr>Código Repisa: <%out.print(almacen.getCodRepisa());%></tr>
        <tr>Número Ejemplares: <%out.print(almacen.getNumeroEjemplares());%></tr>
        <tr>Pasillos: <%out.print(almacen.getPasillosA());%></tr>
        </tr>
        <p/>
        <p/>
        <form action="../index.jsp">
            <p class="center-content"><input type="submit" value="Modificar"/></p>
        </form>
<%--        <form method="post" action="/LibreriaCientifica/EliminarProducto"> &lt;%&ndash; Aun debo implemetar esa wea &ndash;%&gt;--%>
<%--            <p class="center-content"><input type="submit" value="Eliminar"/></p>--%>
<%--        </form>--%>
        <%
        }
        else {
        %><p>No se encuntra el almacen :(</p><%
            }
        }
        session.removeAttribute("Datos");
        session.removeAttribute("Si se encuentra!!!");
    %>

    </div>
</main>

</body>
</html>