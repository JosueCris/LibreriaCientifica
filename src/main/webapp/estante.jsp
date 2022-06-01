<%--
  Created by IntelliJ IDEA.
  User: JOSUE
  Date: 31/05/2022
  Time: 10:24 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="Modelo.Estante" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Almacen</title>
</head>
<body background="fondo.jpg">
<main class="main">
  <div class="container">
    <center><h1>Lista de Estantes</h1></center>
    <table align="center">
      <thead>
      <tr>
        <th>Código del Estante: </th>
        <th>Numero de Ejemplares: </th>
        <th>Pasillo: </th>
      </tr>
      </thead>
      <%
        ArrayList<Estante> lista = (ArrayList) session.getAttribute("Datos");
        if (lista != null){
          for (Estante estante : lista){
      %><tr>
      <td><%out.print(estante.getCodEstante()); %></td>
      <td><%out.print(estante.getNumeroEjemplares());%></td>
      <td><%out.print(estante.getPasillo());%></td>

    </tr><%
        }
      }
      else{
        response.sendRedirect("/LibreriaCientifica/ServletEstante");
      }
      session.removeAttribute("Datos");
    %>
    </table>
    <form action="index.jsp">
      <input type="submit" value="Regresar"/>
    </form>
  </div>
</main>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
</body>
</html>