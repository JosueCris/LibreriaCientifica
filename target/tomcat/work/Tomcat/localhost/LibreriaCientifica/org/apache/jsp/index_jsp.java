/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-05-16 01:05:28 UTC
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
      out.write("            <center><h1 style=\"color:brown\">Bienvenido</h1></center>\n");
      out.write("        </p>\n");
      out.write("\n");
      out.write("        <div class=\"enlaces\">\n");
      out.write("            <li><font face=\"times new roman\" size=\"5px\"><a href=\"libros.jsp\">Lista de Libros</a></font></li>\n");
      out.write("            <li><font face=\"times new roman\" size=\"5px\"><a href=\"inserta_libros.jsp\">Inserta Libros</a></font></li>\n");
      out.write("            <li><font face=\"times new roman\" size=\"5px\"><a href=\"autores.jsp\">Lista de Autores</a></font></li>\n");
      out.write("            <li><font face=\"times new roman\" size=\"5px\"><a href=\"cliente.jsp\">Lista de Clientes</a></font></li>\n");
      out.write("            <li><font face=\"times new roman\" size=\"5px\"><a href=\"idioma.jsp\">Lista de Idiomas</a></font></li>\n");
      out.write("\n");
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
