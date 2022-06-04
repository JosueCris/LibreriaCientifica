<%@ page language ="java" contentType="text/html, charset=utf-8" pageEncoding="utf-8"%>
<html>
    <head>
        <title>Librería Científica</title>
        <link rel="stylesheet" href="botones.css" />
    </head>
    <body background="fondo.jpg">
        <p>
            <center><h1 style="color:brown">Bienvenido a tu Librería Científica</h1></center>
        </p>

        <div class="enlaces">
            <form class="center" action="almacen.jsp">
                <input type="submit" class="opc-green" value="Lista de Almacen"/>
            </form> <br/>

            <form class="center" action="autores.jsp">
<%--            <li><font face="times new roman" size="5px"><a href="autores.jsp">Lista de Autores</a></font></li>--%>
                <input type="submit" class="opc-green" value="Lista de Autores"/>
            </form><br/>

            <form class="center" action="cargo.jsp">
<%--            <li><font face="times new roman" size="5px"><a href="cargo.jsp">Lista de Cargos</a></font></li>--%>
                 <input type="submit" class="opc-green" value="Lista de Cargos"/>
            </form><br/>

            <form class="center" action="cliente.jsp">
<%--            <li><font face="times new roman" size="5px"><a href="cliente.jsp">Lista de Clientes</a></font></li>--%>
                <input type="submit" class="opc-green" value="Lista de Clientes"/>
            </form><br/>

            <form class="center" action="editorial.jsp">
<%--            <li><font face="times new roman" size="5px"><a href="editorial.jsp">Lista de Editoriales</a></font></li>--%>
                <input type="submit" class="opc-green" value="Lista de Editoriales"/>
            </form><br/>

            <form class="center" action="empleado.jsp">
<%--            <li><font face="times new roman" size="5px"><a href="empleado.jsp">Lista de Empleados</a></font></li>--%>
                <input type="submit" class="opc-green" value="Lista de Empleados"/>
            </form><br/>

            <form class="center" action="estante.jsp">
<%--            <li><font face="times new roman" size="5px"><a href="estante.jsp">Lista de Estantes</a></font></li>--%>
                <input type="submit" class="opc-green" value="Lista de Estantes"/>
            </form><br/>

            <form class="center" action="idioma.jsp">
<%--            <li><font face="times new roman" size="5px"><a href="idioma.jsp">Lista de Idiomas</a></font></li>--%>
                <input type="submit" class="opc-green" value="Lista de Idiomas"/>
            </form><br/>

            <form class="center" action="libros.jsp">
<%--            <li><font face="times new roman" size="5px"><a href="libros.jsp">Lista de Libros</a></font></li>--%>
                <input type="submit" class="opc-green" value="Lista de Libros"/>
            </form><br/>

            <form class="center" action="materia.jsp">
<%--            <li><font face="times new roman" size="5px"><a href="materia.jsp">Lista de Materias</a></font></li>--%>
                <input type="submit" class="opc-green" value="Lista de Materias"/>
            </form><br/>

            <form class="center" action="notaventa.jsp">
<%--            <li><font face="times new roman" size="5px"><a href="notaventa.jsp">Lista de Notas</a></font></li>--%>
                <input type="submit" class="opc-green" value="Lista de Notas"/>
            </form><br/>



            <form class="center" action="inserta_almacen.jsp">
<%--            <li><font face="times new roman" size="5px"><a href="inserta_almacen.jsp">Inserta Almacen</a></font></li>--%>
                <input type="submit" class="opc-green" value="Inserta Almacen"/>
            </form><br/>

            <form class="center" action="inserta_autores.jsp">
<%--            <li><font face="times new roman" size="5px"><a href="inserta_autores.jsp">Inserta Autores</a></font></li>--%>
                <input type="submit" class="opc-green" value="Inserta Autores"/>
            </form><br/>

            <form class="center" action="inserta_cargo.jsp">
<%--            <li><font face="times new roman" size="5px"><a href="inserta_cargo.jsp">Inserta Cargo</a></font></li>--%>
                <input type="submit" class="opc-green" value="Inserta Cargo"/>
            </form><br/>

            <form class="center" action="inserta_cliente.jsp">
<%--            <li><font face="times new roman" size="5px"><a href="inserta_cliente.jsp">Inserta Cliente</a></font></li>--%>
                <input type="submit" class="opc-green" value="Inserta Cliente"/>
            </form><br/>

            <form class="center" action="inserta_editorial.jsp">
<%--            <li><font face="times new roman" size="5px"><a href="inserta_editorial.jsp">Inserta Editorial</a></font></li>--%>
                <input type="submit" class="opc-green" value="Inserta Editorial"/>
            </form><br/>

            <form class="center" action="inserta_empleado.jsp">
<%--            <li><font face="times new roman" size="5px"><a href="inserta_empleado.jsp">Inserta Empleado</a></font></li>--%>
                <input type="submit" class="opc-green" value="Inserta Empleado"/>
            </form><br/>

            <form class="center" action="inserta_estante.jsp">
<%--            <li><font face="times new roman" size="5px"><a href="inserta_estante.jsp">Inserta Estante</a></font></li>--%>
                <input type="submit" class="opc-green" value="Inserta Estante"/>
            </form><br/>

            <form class="center" action="inserta_idioma.jsp">
<%--            <li><font face="times new roman" size="5px"><a href="inserta_idioma.jsp">Inserta Idioma</a></font></li>--%>
                <input type="submit" class="opc-green" value="Inserta Idioma"/>
            </form><br/>

            <form class="center" action="inserta_libros.jsp">
<%--            <li><font face="times new roman" size="5px"><a href="inserta_libros.jsp">Inserta Libros</a></font></li>--%>
                <input type="submit" class="opc-green" value="Inserta Libros"/>
            </form><br/>

            <form class="center" action="inserta_materia.jsp">
<%--            <li><font face="times new roman" size="5px"><a href="inserta_materia.jsp">Inserta Materia</a></font></li>--%>
                <input type="submit" class="opc-green" value="Inserta Materia"/>
            </form><br/>

            <form class="center" action="inserta_notaventa.jsp">
<%--            <li><font face="times new roman" size="5px"><a href="inserta_notaventa.jsp">Inserta Nota</a></font></li>--%>
                <input type="submit" class="opc-green" value="Inserta Nota"/>
            </form><br/>



            <form class="center" action="update_almacen.jsp">
<%--            <li><font face="times new roman" size="5px"><a href="update_almacen.jsp">Actualiza Almacen</a></font></li>--%>
                <input type="submit" class="opc-green" value="Actualiza Almacén"/>
            </form>
            <br/>

            <form class="center" action="update_autor.jsp">
<%--            <li><font face="times new roman" size="5px"><a href="update_autor.jsp">Actualiza Autor</a></font></li>--%>
                <input type="submit" class="opc-green" value="Actualiza Autor"/>
            </form>
            <br/>

            <form class="center" action="update_cargo.jsp">
<%--            <li><font face="times new roman" size="5px"><a href="update_cargo.jsp">Actualiza Cargo</a></font></li>--%>
                <input type="submit" class="opc-green" value="Actualiza Cargo"/>
            </form>
            <br/>

            <form class="center" action="update_cliente.jsp">
<%--            <li><font face="times new roman" size="5px"><a href="update_cliente.jsp">Actualiza Cliente</a></font></li>--%>
                <input type="submit" class="opc-green" value="Actualiza Cliente"/>
            </form>
            <br/>

            <form class="center" action="update_editorial.jsp">
<%--            <li><font face="times new roman" size="5px"><a href="update_editorial.jsp">Actualiza Editorial</a></font></li>--%>
                <input type="submit" class="opc-green" value="Actualiza Editorial"/>
            </form>
            <br/>

            <form class="center" action="update_empleado.jsp">
<%--            <li><font face="times new roman" size="5px"><a href="update_empleado.jsp">Actualiza Empleado</a></font></li>--%>
            <input type="submit" class="opc-green" value="Actualiza Empleado"/>
            </form>
            <br/>

            <form class="center" action="update_estante.jsp">
<%--            <li><font face="times new roman" size="5px"><a href="update_estante.jsp">Actualiza Estante</a></font></li>--%>
                <input type="submit" class="opc-green" value="Actualiza Estante"/>
            </form>
            <br/>

            <form class="center" action="update_idioma.jsp">
<%--            <li><font face="times new roman" size="5px"><a href="update_idioma.jsp">Actualiza Idioma</a></font></li>--%>
                 <input type="submit" class="opc-green" value="Actualiza Idioma"/>
            </form>
            <br/>

            <form class="center" action="update_libros.jsp">
<%--            <li><font face="times new roman" size="5px"><a href="update_libros.jsp">Actualiza Libros</a></font></li>--%>
                <input type="submit" class="opc-green" value="Actualiza Libros"/>
            </form>
            <br/>

            <form class="center" action="update_materia.jsp">
<%--            <li><font face="times new roman" size="5px"><a href="update_materia.jsp">Actualiza Materia</a></font></li>--%>
                <input type="submit" class="opc-green" value="Actualiza Materia"/>
            </form>
            <br/>

            <form class="center" action="update_notaventa.jsp">
<%--            <li><font face="times new roman" size="5px"><a href="update_notaventa.jsp">Actualiza Nota</a></font></li>--%>
                <input type="submit" class="opc-green" value="Actualiza Nota"/>
            </form>
            <br/>



            <form class="center" action="elimina_cliente.jsp">
<%--            <li><font face="times new roman" size="5px"><a href="elimina_cliente.jsp">Elimina Cliente</a></font></li>--%>
                <input type="submit" class="opc-green" value="Elimina Cliente"/>
            </form>
            <br/>

            <form class="center" action="elimina_empleado.jsp">
<%--            <li><font face="times new roman" size="5px"><a href="elimina_empleado.jsp">Elimina Empleado</a></font></li>--%>
                <input type="submit" class="opc-green" value="Elimina Empleado"/>
            </form>
            <br/>

            <form class="center" action="elimina_editorial.jsp">
<%--            <li><font face="times new roman" size="5px"><a href="elimina_editorial.jsp">Elimina Editorial</a></font></li>--%>
                <input type="submit" class="opc-green" value="Elimina Editorial"/>
            </form>
            <br/>

            <form class="center" action="elimina_libros.jsp">
<%--            <li><font face="times new roman" size="5px"><a href="elimina_libros.jsp">Elimina Libros</a></font></li>--%>
                <input type="submit" class="opc-green" value="Elimina Libros"/>
            </form>
            <br/>

            <form class="center" action="elimina_notaventa.jsp">
<%--            <li><font face="times new roman" size="5px"><a href="elimina_notaventa.jsp">Elimina Nota</a></font></li>--%>
                <input type="submit" class="opc-green" value="Elimina Nota"/>
            </form>
            <br/>
        </div>

        <div class="contenido">
            <h2>Materia: Diseño de Aplicaciones Web</h2>
            <h2>Docente: Yuliana Berumen Díaz</h2>
            <h2>Alumno: Josué Cristofer Tellez Huerta</h2>
        </div>
    </body>
</html>
