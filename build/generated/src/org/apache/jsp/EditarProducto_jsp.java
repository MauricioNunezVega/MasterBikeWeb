package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Producto;
import DAO.ProductoDAO;

public final class EditarProducto_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_url_value_nobody.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("        <title>Editar Producto</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
  
            
            ProductoDAO pDAO=new ProductoDAO();
            long id=Long.parseLong((String)request.getAttribute("idpro"));
            Producto p = (Producto)pDAO.findID(id);
            //List<Producto>productos=pDAO.listarProductos();
            //request.setAttribute("pro", productos);
        
      out.write("\n");
      out.write("        <div class=\"container mt-4 d-flex\">\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <form action=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\" method=\"post\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("            <div class=\"card-header\">\n");
      out.write("                <h3>Editar Producto</h3>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("                  <div class=\"card-body\">\n");
      out.write("                      <input type=\"hidden\" name=\"txtid2\" id=\"txtid2\" value=\"");
      out.print(p.getIdProducto());
      out.write("\"/>\n");
      out.write("                      \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"col-sm-4\">Nombre</label>\n");
      out.write("                            <input type=\"text\" name=\"txtNombre2\" id=\"txtNombre2\" required=\"true\" value=\"");
      out.print(p.getNombreproducto());
      out.write("\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"col-sm-4\">Tipo </label>\n");
      out.write("                            <select name=\"txtTipo2\" id=\"txtTipo2\">\n");
      out.write("                                <option value=\"Bicicleta\">Bicicleta</option>\n");
      out.write("                                <option value=\"Accesorio\">Accesorio</option>\n");
      out.write("                                <option value=\"Respuesto\">Respuesto</option>\n");
      out.write("                             </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"col-sm-4\">Descripcion</label>\n");
      out.write("                            <input type=\"text\" name=\"txtDescripcion2\" id=\"txtDescripcion2\" required=\"true\" value=\"");
      out.print(p.getDescripcion());
      out.write("\"/>\n");
      out.write("                        </div>\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                            <label class=\"col-sm-4\">Proveedor</label>\n");
      out.write("                            <select name=\"txtProveedo2\" id=\"txtProveedor2\">\n");
      out.write("                                <option value=\"No\">No</option>\n");
      out.write("                                <option value=\"Shimano\">Shimano</option>\n");
      out.write("                                \n");
      out.write("                            </select>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                            <label class=\"col-sm-4\">Valor</label>\n");
      out.write("                            <input type=\"number\" name=\"txtValor2\" id=\"txtValor2\" min=\"1\" required=\"true\" value=\"");
      out.print(p.getValproducto());
      out.write("\"/>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                            <label class=\"col-sm-4\">Marca</label>\n");
      out.write("                            <input type=\"text\" name=\"txtMarca2\" id=\"txtMarca2\" required=\"true\" value=\"");
      out.print(p.getMarca());
      out.write("\"/>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                            <label class=\"col-sm-4\">Modelo</label>\n");
      out.write("                            <input type=\"text\" name=\"txtModelo2\" id=\"txtModelo2\" required=\"true\" value=\"");
      out.print(p.getModelo());
      out.write("\"/>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                            <label class=\"col-sm-4\">Stock</label>\n");
      out.write("                            <input type=\"number\" name=\"txtStock2\" id=\"txtStock2\" min=\"0\" required=\"true\" value=\"");
      out.print(p.getStock());
      out.write("\"/>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                            <label class=\"col-sm-4\">Imagen</label>\n");
      out.write("                            <input type=\"file\" name=\"fileImagen\" id=\"fileImagen\">\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"card-footer d-flex\">\n");
      out.write("                          <input type=\"submit\" name=\"accion\" value=\"Actualizar\" class=\"btn-success\" />\n");
      out.write("                          <input type=\"reset\" value=\"Limpiar\" class=\"btn-primary\" />\n");
      out.write("                          <div class=\"d-flex\">\n");
      out.write("                              <a class=\"btn-danger \" href=\"Producto.jsp\">Cancelar</a>\n");
      out.write("                          </div>\n");
      out.write("                          \n");
      out.write("                      </div>\n");
      out.write("                \n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </form>\n");
      out.write("            \n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.0.min.js\"></script>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("   \n");
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

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/ControladorProducto");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }
}
