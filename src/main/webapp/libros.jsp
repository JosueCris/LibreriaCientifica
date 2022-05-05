<%@ page import="Modelo.Libros" %><%--
  Created by IntelliJ IDEA.
  User: JOSUE
  Date: 28/04/2022
  Time: 03:17 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List, Modelo.Libros"  %>

<html>
<head>
    <title>Libros</title>
</head>
    <body>

        <div class="fila">
            <div class="column side">
                <h2>MENU LIBROS</h2>
                <div class="menu">
                    <ul class="listas">
                        <center>
                            <li><a href="ServletLibros">Listado de libros</a></li>
                            <%--                            <li><a href="Buscarempleado">Buscar libro</a></li>--%>
                        </center>
                    </ul>
                </div>
            </div>
        </div>

        <div class="column middle">
            <center><h2>LISTA LIBROS</h2></center>
            <div class="contenidomiddle">
                <%
                    List<List<Libros>> list = (List<List<Libros>>) request.getAttribute("libros");
                    if(list != null) {
                        for (List<Libros> lib : list) { %>
                <table border="1px" class="tablaDatos">
                    <thead>
                    <tr>
                        <th>ISBN</th>
                        <th>Titulo</th>
                        <th>Año</th>
                        <th>Editorial</th>
                        <th>Idioma</th>
                        <th>Paginas</th>
                        <th>Materia</th>
                        <th>Precio</th>
                        <th>Sinopsis</th>
                        <th>Estante</th>
                    </tr>
                    </thead>
                    <%for (Libros book : lib) { %>
                    <tr>
                        <td><%=book.getIsbn()%></td>
                        <td><%=book.getTitulo()%></td>
                        <td><%=book.getAnioEdicion()%></td>
                        <td><%=book.getrEditorial()%></td>
                        <td><%=book.getrIdioma()%></td>
                        <td><%=book.getNumeroPaginas()%></td>
                        <td><%=book.getrMateria()%></td>
                        <td><%=book.getPrecio()%></td>
                        <td><%=book.getSinopsis()%></td>
                        <td><%=book.getrEstante()%></td>
                    </tr>


                    <%}%>
                    <%}%>
                    <%}%>

                </table>
            </div>
        </div>

    </body>
</html>
