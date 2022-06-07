<%@ page language ="java" contentType="text/html, charset=utf-8" pageEncoding="utf-8"%>
<html>
    <head>
        <title>Libreria Cientifica</title>
        <meta charset="UTF-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1"/>
        <link rel="stylesheet" href="estilo1.css"/>
        <link rel="icon" href="loguito.png"/>
        <script src="https://kit.fontawesome.com/0458944bda.js" crossorigin="anonymous"></script>
    </head>
    <body background="fondo.jpg">

        <header class="header">
            <div class="container logo-nav-container">
                <nav class="navigation">
                    <ul class="show">
                        <a href="#" class="logo"><img src="logo.png" style="width: 150px; height: 43px;"/></a>
                        <li><a href="index.jsp">Inicio</a></li>
                        <li><font face="times new roman" size="5px"><a href="Almacen/menu_almacen.jsp">Almacen</a></font></li>
                        <li><font face="times new roman" size="5px"><a href="Autor/menu_autores.jsp">Autor</a></font></li>
                        <li><font face="times new roman" size="5px"><a href="Cargo/menu_cargo.jsp">Cargo</a></font></li>
                        <li><font face="times new roman" size="5px"><a href="Cliente/menu_cliente.jsp">Cliente</a></font></li>
                        <li><font face="times new roman" size="5px"><a href="Editorial/menu_editorial.jsp">Editorial</a></font></li>
                        <li><font face="times new roman" size="5px"><a href="Empleado/menu_empleado.jsp">Empleado</a></font></li>
                        <li><font face="times new roman" size="5px"><a href="Estante/menu_estante.jsp">Estante</a></font></li>
                        <li><font face="times new roman" size="5px"><a href="Idioma/menu_idioma.jsp">Idioma</a></font></li>
                        <li><font face="times new roman" size="5px"><a href="Libros/menu_libros.jsp">Libros</a></font></li>
                        <li><font face="times new roman" size="5px"><a href="Materia/menu_materia.jsp">Materia</a></font></li>
                        <li><font face="times new roman" size="5px"><a href="NotaVenta/menu_notaventa.jsp">Nota</a></font></li>

                    </ul>
                </nav>
            </div>
        </header>

        <main class="main">
            <div class="container">
                <br/><p><center><h1 style="color:brown">Bienvenido a tu Libreria Cientifica</h1></center></p>
                <p>En esta libreria podras enriquecer tu conocimiento y explorar tu creatividad con nuestra basta coleccion de libros del hermoso puerto de Veracruz, tanto tematicas de entretenimiento como lo mas sofisticado que te podrias imaginar</p>
                <img src="libreria.jpg" style="width: 100%; height: 80%"/>

            </div>
        </main>

        <!-- <script src="../js/jquery-3.5.0.min.js"></script> -->
        <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
        <script src="/javaS1.js"></script>
        <div class="contenido">
            <h2>Materia: Diseño de Aplicaciones Web</h2>
            <h2>Docente: Yuliana Berumen Diaz</h2>
            <h2>Alumno: Josue Cristofer Tellez Huerta</h2>
        </div>
    </body>
</html>
