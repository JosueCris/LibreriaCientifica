<%--
  Created by IntelliJ IDEA.
  User: JOSUE
  Date: 06/06/2022
  Time: 02:53 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Menú Empleado</title>
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
        <br/><h1>Empleado</h1>
        <p>Esta persona es quien se encarga de desempeñar el cargo que le otorga la empresa, con el tiempo puede ir escalando de puesto y proporcionalmente aumentando su sueldo.</p>
        <br>
        <form class="center" action="/LibreriaCientifica/Empleado/empleado.jsp">
            <input type="submit" class=" opc opc-green" value="Lista de Empleados">
        </form><br>

        <form class="center" action="/LibreriaCientifica/Empleado/inserta_empleado.jsp">
            <input type="submit" class=" opc opc-green" value="Inserta Empleado">
        </form><br>
        <form class="center" action="/LibreriaCientifica/Empleado/update_empleado.jsp">
            <input type="submit" class=" opc opc-green" value="Actualiza Empleado">
        </form><br>
        <form class="center" action="/LibreriaCientifica/Empleado/elimina_empleado.jsp">
            <input type="submit" class=" opc opc-green" value="Elimina Empleado">
        </form>
    </div><br>
</main>

<!-- <script src="../js/jquery-3.5.0.min.js"></script> -->
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="/XMenWebProject/javaS1.js"></script>
</body>
</html>
