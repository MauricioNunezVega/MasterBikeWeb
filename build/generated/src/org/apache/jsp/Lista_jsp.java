package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Lista_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <title></title>\n");
      out.write("    <script src=\"http://code.jquery.com/jquery-2.0.3.min.js\" data-semver=\"2.0.3\" data-require=\"jquery\"></script>\n");
      out.write("    <link href=\"//cdnjs.cloudflare.com/ajax/libs/datatables/1.9.4/css/jquery.dataTables_themeroller.css\" rel=\"stylesheet\" data-semver=\"1.9.4\" data-require=\"datatables@*\" />\n");
      out.write("    <link href=\"//cdnjs.cloudflare.com/ajax/libs/datatables/1.9.4/css/jquery.dataTables.css\" rel=\"stylesheet\" data-semver=\"1.9.4\" data-require=\"datatables@*\" />\n");
      out.write("    <link href=\"//cdnjs.cloudflare.com/ajax/libs/datatables/1.9.4/css/demo_table_jui.css\" rel=\"stylesheet\" data-semver=\"1.9.4\" data-require=\"datatables@*\" />\n");
      out.write("    <link href=\"//cdnjs.cloudflare.com/ajax/libs/datatables/1.9.4/css/demo_table.css\" rel=\"stylesheet\" data-semver=\"1.9.4\" data-require=\"datatables@*\" />\n");
      out.write("    <link href=\"//cdnjs.cloudflare.com/ajax/libs/datatables/1.9.4/css/demo_page.css\" rel=\"stylesheet\" data-semver=\"1.9.4\" data-require=\"datatables@*\" />\n");
      out.write("    <link data-require=\"jqueryui@*\" data-semver=\"1.10.0\" rel=\"stylesheet\" href=\"//cdnjs.cloudflare.com/ajax/libs/jqueryui/1.10.0/css/smoothness/jquery-ui-1.10.0.custom.min.css\" />\n");
      out.write("    <script data-require=\"jqueryui@*\" data-semver=\"1.10.0\" src=\"//cdnjs.cloudflare.com/ajax/libs/jqueryui/1.10.0/jquery-ui.js\"></script>\n");
      out.write("    <script src=\"//cdnjs.cloudflare.com/ajax/libs/datatables/1.9.4/jquery.dataTables.js\" data-semver=\"1.9.4\" data-require=\"datatables@*\"></script>\n");
      out.write("    <link href=\"style.css\" rel=\"stylesheet\" />\n");
      out.write("    <script src=\"js/Funciones.js\" type=\"text/javascript\"></script>\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("<p id=\"date_filter\">\n");
      out.write("    <span id=\"date-label-from\" class=\"date-label\">From: </span><input class=\"date_range_filter date\" type=\"text\" id=\"datepicker_from\" />\n");
      out.write("    <span id=\"date-label-to\" class=\"date-label\">To:<input class=\"date_range_filter date\" type=\"text\" id=\"datepicker_to\" />\n");
      out.write("</p>\n");
      out.write("    <table width=\"100%\" class=\"display\" id=\"datatable\">\n");
      out.write("      <thead>\n");
      out.write("        <tr>\n");
      out.write("          <th>Col1</th>\n");
      out.write("          <th>Col2</th>\n");
      out.write("        </tr>\n");
      out.write("      </thead>\n");
      out.write("      <tbody>\n");
      out.write("        <tr>\n");
      out.write("          <td>\n");
      out.write("            03/03/2016\n");
      out.write("          </td>\n");
      out.write("          <td>5</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("          <td>\n");
      out.write("            03/04/2017\n");
      out.write("          </td>\n");
      out.write("          <td>4</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("          <td>\n");
      out.write("             03/05/2017\n");
      out.write("          </td>\n");
      out.write("          <td>2</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("          <td>\n");
      out.write("            03/06/2016\n");
      out.write("          </td>\n");
      out.write("          <td>17</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("          <td>\n");
      out.write("            03/07/2017\n");
      out.write("          </td>\n");
      out.write("          <td>10</td>\n");
      out.write("        </tr>\n");
      out.write("      </tbody>\n");
      out.write("    </table>\n");
      out.write("  </body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
