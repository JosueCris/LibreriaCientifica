/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-10-18 18:55:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Cargo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.Cargo;

public final class inserta_005fcargo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <title>Inserta Cargo</title>\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/LibreriaCientifica/estilo1.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/LibreriaCientifica/style.css\">\r\n");
      out.write("  <link rel=\"icon\" href=\"/LibreriaCientifica/loguito.png\">\r\n");
      out.write("</head>\r\n");
      out.write("<body background=\"../fondo.jpg\">\r\n");
      out.write("\r\n");
      out.write("<header class=\"header\">\r\n");
      out.write("  <div class=\"container logo-nav-container\">\r\n");
      out.write("    <nav class=\"navigation\">\r\n");
      out.write("      <ul class=\"show\">\r\n");
      out.write("        <a href=\"#\" class=\"logo\"><img src=\"../logo.png\" style=\"width: 150px; height: 43px;\"/></a>\r\n");
      out.write("        <li><a href=\"/LibreriaCientifica\">Inicio</a></li>\r\n");
      out.write("        <li><font face=\"times new roman\" size=\"5px\"><a href=\"/LibreriaCientifica/Almacen/menu_almacen.jsp\">Almacen</a></font></li>\r\n");
      out.write("        <li><font face=\"times new roman\" size=\"5px\"><a href=\"/LibreriaCientifica/Autor/menu_autores.jsp\">Autor</a></font></li>\r\n");
      out.write("        <li><font face=\"times new roman\" size=\"5px\"><a href=\"/LibreriaCientifica/Cargo/menu_cargo.jsp\">Cargo</a></font></li>\r\n");
      out.write("        <li><font face=\"times new roman\" size=\"5px\"><a href=\"/LibreriaCientifica/Cliente/menu_cliente.jsp\">Cliente</a></font></li>\r\n");
      out.write("        <li><font face=\"times new roman\" size=\"5px\"><a href=\"/LibreriaCientifica/Editorial/menu_editorial.jsp\">Editorial</a></font></li>\r\n");
      out.write("        <li><font face=\"times new roman\" size=\"5px\"><a href=\"/LibreriaCientifica/Empleado/menu_empleado.jsp\">Empleado</a></font></li>\r\n");
      out.write("        <li><font face=\"times new roman\" size=\"5px\"><a href=\"/LibreriaCientifica/Estante/menu_estante.jsp\">Estante</a></font></li>\r\n");
      out.write("        <li><font face=\"times new roman\" size=\"5px\"><a href=\"/LibreriaCientifica/Idioma/menu_idioma.jsp\">Idioma</a></font></li>\r\n");
      out.write("        <li><font face=\"times new roman\" size=\"5px\"><a href=\"/LibreriaCientifica/Libros/menu_libros.jsp\">Libros</a></font></li>\r\n");
      out.write("        <li><font face=\"times new roman\" size=\"5px\"><a href=\"/LibreriaCientifica/Materia/menu_materia.jsp\">Materia</a></font></li>\r\n");
      out.write("        <li><font face=\"times new roman\" size=\"5px\"><a href=\"/LibreriaCientifica/NotaVenta/menu_notaventa.jsp\">Nota</a></font></li>\r\n");
      out.write("\r\n");
      out.write("      </ul>\r\n");
      out.write("    </nav>\r\n");
      out.write("  </div>\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("<main class=\"main\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <br/><br/><form method=\"post\" action=\"/LibreriaCientifica/InsertaCargo\">\r\n");
      out.write("      <p>Código Cargo <input type=\"text\" name = \"codCargo\"> </p>\r\n");
      out.write("      <p>Nombre Cargo <input type=\"text\" name = \"nombreCargo\"> </p>\r\n");
      out.write("      <p class=\"center-content\">\r\n");
      out.write("        <input type=\"submit\" value=\"Ingresar\"/>\r\n");
      out.write("      </p>\r\n");
      out.write("    </form>\r\n");
      out.write("\r\n");
      out.write("    <form action=\"/LibreriaCientifica/Cargo/menu_cargo.jsp\">\r\n");
      out.write("      <input type=\"submit\" value=\"Regresar\"/>\r\n");
      out.write("    </form>\r\n");
      out.write("  </div>\r\n");
      out.write("</main>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
