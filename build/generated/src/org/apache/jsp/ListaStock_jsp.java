package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import Config.Conexion;
import java.sql.Connection;
import modelo.Producto1;
import java.util.List;
import DAO.ProductoDAO;
import Model.Producto;

public final class ListaStock_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <!--estos  link es para la paginacion y el buscador -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.datatables.net/1.11.3/css/jquery.dataTables.css\">\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("        <title>Lista de productos</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"card-header\">\n");
      out.write("\n");
      out.write("            <h2 class=\"w3-wide w3-center text-center\" >Lista de Productos</h2>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"container\" style=\"\">\n");
      out.write("            <table class=\"table table-bordered table-striped\" id=\"table_id\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr class=\"text-center\">\n");
      out.write("                        <th class=\"text-center\">ID</th>\n");
      out.write("                        <th class=\"text-center\">NOMBRE</th>\n");
      out.write("                        <th class=\"text-center\">TIPO</th>\n");
      out.write("                        <th class=\"text-center\">DESCRIPCION</th>\n");
      out.write("                        <th class=\"text-center\">PROVEEDOR</th>\n");
      out.write("                        <th class=\"text-center\">VALOR</th>\n");
      out.write("                        <th class=\"text-center\">MARCA</th>\n");
      out.write("                        <th class=\"text-center\">MODELO</th>\n");
      out.write("                        <th class=\"text-center\">STOCK</th>\n");
      out.write("                        <th>IMAGEN</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("\n");
      out.write("                ");
        
                    ProductoDAO pDAO = new ProductoDAO();
                    Producto p = new Producto();
                    
                    List<Producto> productos = pDAO.listarProductos();
                    request.setAttribute("pro", productos);
                
      out.write("\n");
      out.write("                <tbody  id=\"myTable\">\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("                    \n");
      out.write("                </tbody>\n");
      out.write("            </table>                         \n");
      out.write("        </div>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.0.min.js\"></script>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\" charset=\"utf8\" src=\"https://cdn.datatables.net/1.11.3/js/jquery.dataTables.js\"></script>\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            $.extend( true, $.fn.dataTable.defaults, {\n");
      out.write("    \"language\": {\n");
      out.write("        \"decimal\": \",\",\n");
      out.write("        \"thousands\": \".\",\n");
      out.write("        \"info\": \"Mostrando registros del _START_ al _END_ de un total de _TOTAL_ registros\",\n");
      out.write("        \"infoEmpty\": \"Mostrando registros del 0 al 0 de un total de 0 registros\",\n");
      out.write("        \"infoPostFix\": \"\",\n");
      out.write("        \"infoFiltered\": \"(filtrado de un total de _MAX_ registros)\",\n");
      out.write("        \"loadingRecords\": \"Cargando...\",\n");
      out.write("        \"lengthMenu\": \"Mostrar _MENU_ registros\",\n");
      out.write("        \"paginate\": {\n");
      out.write("            \"first\": \"Primero\",\n");
      out.write("            \"last\": \"Último\",\n");
      out.write("            \"next\": \"Siguiente\",\n");
      out.write("            \"previous\": \"Anterior\"\n");
      out.write("        },\n");
      out.write("        \"processing\": \"Procesando...\",\n");
      out.write("        \"search\": \"Buscar:\",\n");
      out.write("        \"searchPlaceholder\": \"Término de búsqueda\",\n");
      out.write("        \"zeroRecords\": \"No se encontraron resultados\",\n");
      out.write("        \"emptyTable\": \"Ningún dato disponible en esta tabla\",\n");
      out.write("        \"aria\": {\n");
      out.write("            \"sortAscending\":  \": Activar para ordenar la columna de manera ascendente\",\n");
      out.write("            \"sortDescending\": \": Activar para ordenar la columna de manera descendente\"\n");
      out.write("        },\n");
      out.write("        //only works for built-in buttons, not for custom buttons\n");
      out.write("        \"buttons\": {\n");
      out.write("            \"create\": \"Nuevo\",\n");
      out.write("            \"edit\": \"Cambiar\",\n");
      out.write("            \"remove\": \"Borrar\",\n");
      out.write("            \"copy\": \"Copiar\",\n");
      out.write("            \"csv\": \"fichero CSV\",\n");
      out.write("            \"excel\": \"tabla Excel\",\n");
      out.write("            \"pdf\": \"documento PDF\",\n");
      out.write("            \"print\": \"Imprimir\",\n");
      out.write("            \"colvis\": \"Visibilidad columnas\",\n");
      out.write("            \"collection\": \"Colección\",\n");
      out.write("            \"upload\": \"Seleccione fichero....\"\n");
      out.write("        },\n");
      out.write("        \"select\": {\n");
      out.write("            \"rows\": {\n");
      out.write("                _: '%d filas seleccionadas',\n");
      out.write("                0: 'clic fila para seleccionar',\n");
      out.write("                1: 'una fila seleccionada'\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    }           \n");
      out.write("} );       \n");
      out.write("            \n");
      out.write("            $(document).ready( function () {\n");
      out.write("            $('#table_id').DataTable();\n");
      out.write("} );\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("p");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <tr class=\"text-center\">\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getIdProducto()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getNombreproducto()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getTipoproducto()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getDescripcion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getFabricpropia()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getValproducto()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getMarca()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getModelo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getStock()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\n");
          out.write("                            <td><img src=\"ControladorIMG?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getIdProducto()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" height=\"100\" width=\"100\"></td>\n");
          out.write("\n");
          out.write("\n");
          out.write("                        </tr>\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
