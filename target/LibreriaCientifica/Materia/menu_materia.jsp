<%--
  Created by IntelliJ IDEA.
  User: JOSUE
  Date: 06/06/2022
  Time: 03:39 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Menú Materia</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="/LibreriaCientifica/estilo1.css">
    <link rel="stylesheet" href="/LibreriaCientifica/select.css">
    <link rel="icon" href="../loguito.png"/>
    <script src="https://kit.fontawesome.com/0458944bda.js" crossorigin="anonymous"></script>
</head>
<body background="/LibreriaCientifica/fondo.jpg">
<header class="header">
    <div class="container logo-nav-container">
        <%--        <a href="#" class="logo"><img src="/XMenWebProject/logo.png" style="width: 150px; height: 43px;"></a>--%>
        <%--        <span class="menu-icon">Ver menú</span>--%>

        <nav class="navigation">
            <ul class="show">
                <a href="#" class="logo"><img src="../logo.png" style="width: 150px; height: 43px;"/></a>
                <li><a href="/LibreriaCientifica">Inicio</a></li>
                <li><a href="/LibreriaCientifica/Almacen/menu_almacen.jsp">Almacén</a></li>
                <li><a href="/LibreriaCientifica/Autor/menu_autores.jsp">Autores</a></li>
                <li><a href="/LibreriaCientifica/Cargo/menu_cargo.jsp">Cargo</a></li>
                <li><a href="/LibreriaCientifica/Cliente/menu_cliente.jsp">Cliente</a></li>
                <li><a href="/LibreriaCientifica/Editorial/menu_editorial.jsp">Editorial</a></li>
                <li><a href="/LibreriaCientifica/Empleado/menu_empleado.jsp">Empleado</a></li>
                <li><a href="/LibreriaCientifica/Estante/menu_estante.jsp">Estante</a></li>
                <li><a href="/LibreriaCientifica/Idioma/menu_idioma.jsp">Idioma</a></li>
                <li><a href="/LibreriaCientifica/Libros/menu_libros.jsp">Libros</a></li>
                <li><a href="/LibreriaCientifica/Materia/menu_materia.jsp">Materia</a></li>
                <li><a href="/LibreriaCientifica/NotaVenta/menu_notaventa.jsp">Nota</a></li>

                <%--                <li><a href="/XMenWebProject/presentations/menu_presentations.html">Presentaciones</a></li>--%>
            </ul>
        </nav>
    </div>
</header>

<main class="main">
    <div class="container">
        <br/><h1>Materia</h1>
        <p>Estas son las asignaturas que forman de una carrera o un plan de estudios, y que se imparten en los centros educativos. Entre muchos ejemplares, también contamos con libros escolares de muchas materias.</p>
        <br>
        <form class="center" action="/LibreriaCientifica/Materia/materia.jsp">
            <input type="submit" class=" opc opc-green" value="Lista de Materias">
        </form><br>

        <form class="center" action="/LibreriaCientifica/Materia/inserta_materia.jsp">
            <input type="submit" class=" opc opc-green" value="Inserta Materia">
        </form><br>
        <form class="center" action="/LibreriaCientifica/Materia/update_materia.jsp">
            <input type="submit" class=" opc opc-green" value="Actualiza Materia">
        </form>

    </div><br>
</main>

<!-- <script src="../js/jquery-3.5.0.min.js"></script> -->
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="/XMenWebProject/javaS1.js"></script>
</body>
</html>