/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-05-20 17:08:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.Libros;
import java.util.ArrayList;

public final class libros_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>LIBROS</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body background=\"fondo.jpg\">\r\n");
      out.write("<main class=\"main\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <center><h1>Colección de libros</h1></center>\r\n");
      out.write("        <table align=\"center\">\r\n");
      out.write("            <thead>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>ISBN: </th>\r\n");
      out.write("                <th>Titulo: </th>\r\n");
      out.write("                <th>Año de Edición: </th>\r\n");
      out.write("                <th>Editorial: </th>\r\n");
      out.write("                <th>Idioma: </th>\r\n");
      out.write("                <th>Paginas: </th>\r\n");
      out.write("                <th>Materia: </th>\r\n");
      out.write("                <th>Precio: </th>\r\n");
      out.write("                <th>Sinopsis: </th>\r\n");
      out.write("                <th>Estante: </th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            ");

                ArrayList<Libros> lista = (ArrayList) session.getAttribute("Datos");
                if (lista != null){
                    for (Libros libros : lista){
            
      out.write("<tr>\r\n");
      out.write("            <td>");
out.print(libros.getIsbn()); 
      out.write("</td>\r\n");
      out.write("            <td>");
out.print(libros.getTitulo());
      out.write("</td>\r\n");
      out.write("            <td>");
out.print(libros.getAnioEdicion());
      out.write("</td>\r\n");
      out.write("            <td>");
out.print(libros.getrEditorial());
      out.write("</td>\r\n");
      out.write("            <td>");
out.print(libros.getrIdioma());
      out.write("</td>\r\n");
      out.write("            <td>");
out.print(libros.getNumeroPaginas());
      out.write("</td>\r\n");
      out.write("            <td>");
out.print(libros.getrMateria());
      out.write("</td>\r\n");
      out.write("            <td>");
out.print(libros.getPrecio());
      out.write("</td>\r\n");
      out.write("            <td>");
out.print(libros.getSinopsis());
      out.write("</td>\r\n");
      out.write("            <td>");
out.print(libros.getrEstante());
      out.write("</td>\r\n");
      out.write("        </tr>");

                }
            }
            else
                response.sendRedirect("/LibreriaCientifica/ServletLibros");
            session.removeAttribute("Datos");
        
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("        <form action=\"index.jsp\">\r\n");
      out.write("            <input type=\"submit\" value=\"Regresar\"/>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("</main>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\r\n");
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
