/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-06-01 04:07:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html, charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Librería Científica</title>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"fondo.jpg\">\n");
      out.write("        <p>\n");
      out.write("            <center><h1 style=\"color:brown\">Bienvenido a tu Librería Científica</h1></center>\n");
      out.write("        </p>\n");
      out.write("\n");
      out.write("        <div class=\"enlaces\">\n");
      out.write("            <li><font face=\"times new roman\" size=\"5px\"><a href=\"almacen.jsp\">Lista de Almacenes</a></font></li>\n");
      out.write("            <li><font face=\"times new roman\" size=\"5px\"><a href=\"autores.jsp\">Lista de Autores</a></font></li>\n");
      out.write("            <li><font face=\"times new roman\" size=\"5px\"><a href=\"cargo.jsp\">Lista de Cargos</a></font></li>\n");
      out.write("            <li><font face=\"times new roman\" size=\"5px\"><a href=\"cliente.jsp\">Lista de Clientes</a></font></li>\n");
      out.write("            <li><font face=\"times new roman\" size=\"5px\"><a href=\"editorial.jsp\">Lista de Editoriales</a></font></li>\n");
      out.write("            <li><font face=\"times new roman\" size=\"5px\"><a href=\"empleado.jsp\">Lista de Empleados</a></font></li>\n");
      out.write("            <li><font face=\"times new roman\" size=\"5px\"><a href=\"estante.jsp\">Lista de Estantes</a></font></li>\n");
      out.write("            <li><font face=\"times new roman\" size=\"5px\"><a href=\"idioma.jsp\">Lista de Idiomas</a></font></li>\n");
      out.write("            <li><font face=\"times new roman\" size=\"5px\"><a href=\"libros.jsp\">Lista de Libros</a></font></li>\n");
      out.write("            <li><font face=\"times new roman\" size=\"5px\"><a href=\"materia.jsp\">Lista de Materias</a></font></li>\n");
      out.write("            <li><font face=\"times new roman\" size=\"5px\"><a href=\"notaventa.jsp\">Lista de Notas</a></font></li>\n");
      out.write("\n");
      out.write("            <li><font face=\"times new roman\" size=\"5px\"><a href=\"inserta_almacen.jsp\">Inserta Almacen</a></font></li>\n");
      out.write("            <li><font face=\"times new roman\" size=\"5px\"><a href=\"inserta_autores.jsp\">Inserta Autores</a></font></li>\n");
      out.write("            <li><font face=\"times new roman\" size=\"5px\"><a href=\"inserta_cargo.jsp\">Inserta Cargo</a></font></li>\n");
      out.write("            <li><font face=\"times new roman\" size=\"5px\"><a href=\"inserta_cliente.jsp\">Inserta Cliente</a></font></li>\n");
      out.write("            <li><font face=\"times new roman\" size=\"5px\"><a href=\"inserta_editorial.jsp\">Inserta Editorial</a></font></li>\n");
      out.write("            <li><font face=\"times new roman\" size=\"5px\"><a href=\"inserta_empleado.jsp\">Inserta Empleado</a></font></li>\n");
      out.write("            <li><font face=\"times new roman\" size=\"5px\"><a href=\"inserta_estante.jsp\">Inserta Estante</a></font></li>\n");
      out.write("            <li><font face=\"times new roman\" size=\"5px\"><a href=\"inserta_idioma.jsp\">Inserta Idioma</a></font></li>\n");
      out.write("            <li><font face=\"times new roman\" size=\"5px\"><a href=\"inserta_libros.jsp\">Inserta Libros</a></font></li>\n");
      out.write("            <li><font face=\"times new roman\" size=\"5px\"><a href=\"inserta_materia.jsp\">Inserta Materia</a></font></li>\n");
      out.write("            <li><font face=\"times new roman\" size=\"5px\"><a href=\"inserta_notaventa.jsp\">Inserta Nota</a></font></li>\n");
      out.write("\n");
      out.write("            <li><font face=\"times new roman\" size=\"5px\"><a href=\"update_almacen.jsp\">Actualiza Almacen</a></font></li>\n");
      out.write("            <li><font face=\"times new roman\" size=\"5px\"><a href=\"update_autor.jsp\">Actualiza Autor</a></font></li>\n");
      out.write("            <li><font face=\"times new roman\" size=\"5px\"><a href=\"update_cargo.jsp\">Actualiza Cargo</a></font></li>\n");
      out.write("            <li><font face=\"times new roman\" size=\"5px\"><a href=\"update_cliente.jsp\">Actualiza Cliente</a></font></li>\n");
      out.write("            <li><font face=\"times new roman\" size=\"5px\"><a href=\"update_editorial.jsp\">Actualiza Editorial</a></font></li>\n");
      out.write("            <li><font face=\"times new roman\" size=\"5px\"><a href=\"update_empleado.jsp\">Actualiza Empleado</a></font></li>\n");
      out.write("            <li><font face=\"times new roman\" size=\"5px\"><a href=\"update_estante.jsp\">Actualiza Estante</a></font></li>\n");
      out.write("            <li><font face=\"times new roman\" size=\"5px\"><a href=\"update_idioma.jsp\">Actualiza Idioma</a></font></li>\n");
      out.write("            <li><font face=\"times new roman\" size=\"5px\"><a href=\"update_libros.jsp\">Actualiza Libros</a></font></li>\n");
      out.write("            <li><font face=\"times new roman\" size=\"5px\"><a href=\"update_materia.jsp\">Actualiza Materia</a></font></li>\n");
      out.write("            <li><font face=\"times new roman\" size=\"5px\"><a href=\"update_notaventa.jsp\">Actualiza Nota</a></font></li>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"contenido\">\n");
      out.write("            <h2>Materia: Diseño de Aplicaciones Web</h2>\n");
      out.write("            <h2>Docente: Yuliana Berumen Díaz</h2>\n");
      out.write("            <h2>Alumno: Josué Cristofer Tellez Huerta</h2>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
