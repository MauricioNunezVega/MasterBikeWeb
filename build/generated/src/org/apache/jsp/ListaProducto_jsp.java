package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.Producto1;
import java.util.List;
import DAO.ProductoDAO;
import Model.Producto;

public final class ListaProducto_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("        <!-- esta linea y una de abajo es para el buscar y la paginacion-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.datatables.net/1.11.3/css/jquery.dataTables.css\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <title>Lista de productos</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Start Header Area -->\n");
      out.write("\t<header class=\"header_area sticky-header\">\n");
      out.write("\t\t<div class=\"main_menu\">\n");
      out.write("\t\t\t<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark main_box\" >\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("\t\t\t\t\t<a class=\"navbar-brand logo_h\" href=\"inicio.jsp\"><img src=\"https://i.ibb.co/S0J0VKs/logo.png\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\"\n");
      out.write("\t\t\t\t\t aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t<!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("\t\t\t\t\t<div class=\"collapse navbar-collapse offset\" id=\"navbarSupportedContent\">\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav navbar-nav menu_nav ml-auto\">\n");
      out.write("                                                    ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                        \n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</nav>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t</header>\n");
      out.write("\t<!-- End Header Area -->\n");
      out.write("        \n");
      out.write("     \n");
      out.write("        <div class=\"container\">\n");
      out.write("                <table class=\"table table-bordered table-striped\" id=\"table_id\">\n");
      out.write("                    <div class=\"card-header\">\n");
      out.write("                        <a href=\"Producto.jsp\" class=\"btn btn-success\">+ AGREGAR</a>  \n");
      out.write("\n");
      out.write("                        <h2 class=\"w3-wide w3-center text-center\" >Lista de Productos</h2>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <thead>\n");
      out.write("                        <tr class=\"text-center\">\n");
      out.write("                            <th class=\"text-center\">ID</th>\n");
      out.write("                            <th class=\"text-center\">NOMBRE</th>\n");
      out.write("                            <th class=\"text-center\">TIPO</th>\n");
      out.write("                            <th class=\"text-center\">DESCRIPCION</th>\n");
      out.write("                            <th class=\"text-center\">PROVEEDOR</th>\n");
      out.write("                            <th class=\"text-center\">VALOR</th>\n");
      out.write("                            <!--<th class=\"text-center\">MARCA</th>\n");
      out.write("                            <th class=\"text-center\">MODELO</th>-->\n");
      out.write("                            <th class=\"text-center\">STOCK</th>\n");
      out.write("                            <th>IMAGEN</th>\n");
      out.write("                            <th class=\"text-center\">ACCION</th>\n");
      out.write("                            <th class=\"text-center\">DOCUMENTACIÓN</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    \n");
      out.write("                    ");
  
                          Producto p = new Producto();
                          ProductoDAO pDAO=new ProductoDAO();
                          List<Producto>productos=pDAO.listarProductos();
                          request.setAttribute("pro", productos);
                    
      out.write("\n");
      out.write("                    <tbody id=\"myTable\">\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("                    \n");
      out.write("                    </tbody>\n");
      out.write("                </table>                         \n");
      out.write("            </div>\n");
      out.write("                     <!-- Footer -->\n");
      out.write("<footer class=\"bg-dark text-center text-white\">\n");
      out.write("  <!-- Grid container -->\n");
      out.write("  <div class=\"container p-4\">\n");
      out.write("    <!-- Section: Social media -->\n");
      out.write("    <section class=\"mb-4\">\n");
      out.write("      <!-- Facebook -->\n");
      out.write("      <a class=\"btn btn-outline-light btn-floating m-1\" href=\"#!\" role=\"button\"\n");
      out.write("        ><i class=\"fab fa-facebook-f\"></i\n");
      out.write("      ></a>\n");
      out.write("\n");
      out.write("      <!-- Twitter -->\n");
      out.write("      <a class=\"btn btn-outline-light btn-floating m-1\" href=\"#!\" role=\"button\"\n");
      out.write("        ><i class=\"fab fa-twitter\"></i\n");
      out.write("      ></a>\n");
      out.write("\n");
      out.write("      <!-- Google -->\n");
      out.write("      <a class=\"btn btn-outline-light btn-floating m-1\" href=\"#!\" role=\"button\"\n");
      out.write("        ><i class=\"fab fa-google\"></i\n");
      out.write("      ></a>\n");
      out.write("\n");
      out.write("      <!-- Instagram -->\n");
      out.write("      <a class=\"btn btn-outline-light btn-floating m-1\" href=\"#!\" role=\"button\"\n");
      out.write("        ><i class=\"fab fa-instagram\"></i\n");
      out.write("      ></a>\n");
      out.write("\n");
      out.write("      <!-- Linkedin -->\n");
      out.write("      <a class=\"btn btn-outline-light btn-floating m-1\" href=\"#!\" role=\"button\"\n");
      out.write("        ><i class=\"fab fa-linkedin-in\"></i\n");
      out.write("      ></a>\n");
      out.write("\n");
      out.write("      <!-- Github -->\n");
      out.write("      <a class=\"btn btn-outline-light btn-floating m-1\" href=\"#!\" role=\"button\"\n");
      out.write("        ><i class=\"fab fa-github\"></i\n");
      out.write("      ></a>\n");
      out.write("    </section>\n");
      out.write("    <!-- Section: Social media -->\n");
      out.write("\n");
      out.write("    <!-- Section: Form -->\n");
      out.write("    <section class=\"\">\n");
      out.write("      <form action=\"\">\n");
      out.write("        <!--Grid row-->\n");
      out.write("        <div class=\"row d-flex justify-content-center\">\n");
      out.write("          <!--Grid column-->\n");
      out.write("          <div class=\"col-auto\">\n");
      out.write("            <p class=\"pt-2\">\n");
      out.write("              <strong>Suscribete a nuestras noticias</strong>\n");
      out.write("            </p>\n");
      out.write("          </div>\n");
      out.write("          <!--Grid column-->\n");
      out.write("\n");
      out.write("          <!--Grid column-->\n");
      out.write("          <div class=\"col-md-5 col-12\">\n");
      out.write("            <!-- Email input -->\n");
      out.write("            <div class=\"form-outline form-white mb-4\">\n");
      out.write("              <input type=\"email\" id=\"form5Example21\" class=\"form-control\" />\n");
      out.write("              <label class=\"form-label\" for=\"form5Example21\">Tu email</label>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <!--Grid column-->\n");
      out.write("\n");
      out.write("          <!--Grid column-->\n");
      out.write("          <div class=\"col-auto\">\n");
      out.write("            <!-- Submit button -->\n");
      out.write("            <button type=\"submit\" class=\"btn btn-outline-light mb-4\">\n");
      out.write("              Suscribir\n");
      out.write("            </button>\n");
      out.write("          </div>\n");
      out.write("          <!--Grid column-->\n");
      out.write("        </div>\n");
      out.write("        <!--Grid row-->\n");
      out.write("      </form>\n");
      out.write("    </section>\n");
      out.write("    <!-- Section: Form -->\n");
      out.write("\n");
      out.write("    <!-- Section: Text -->\n");
      out.write("    <section class=\"mb-4\">\n");
      out.write("      <p>\n");
      out.write("        La fabrica de bicicletas San Diego nacio en el año 1990 en la ciudad de Santiago como respuesta a \n");
      out.write("        la cresciente demanda de bicicletas de los habitantes de la capital, hoy, 31 años despúes bajo la\n");
      out.write("        nueva marca \"Masterbike\" busca nuevamente ser protagonista del ciclismo nacional ofreciendo nuevos \n");
      out.write("        servicios de acuerdo a las necesidades de los riders chilenos.\n");
      out.write("      </p>\n");
      out.write("    </section>\n");
      out.write("    <!-- Section: Text -->\n");
      out.write("\n");
      out.write("    <!-- Section: Links -->\n");
      out.write("    <section class=\"\">\n");
      out.write("      <!--Grid row-->\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <!--Grid column-->\n");
      out.write("        <div class=\"col-lg-3 col-md-6 mb-4 mb-md-0\">\n");
      out.write("          <h5 class=\"text-uppercase\">Categorias</h5>\n");
      out.write("\n");
      out.write("          <ul class=\"list-unstyled mb-0\">\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#!\" class=\"text-white\">Nuestros productos</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"ControladorMantencion\" class=\"text-white\">Taller de bicicletas</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"SolicitudArriendo.jsp\" class=\"text-white\">Arriendo de bicicletas</a>\n");
      out.write("            </li>\n");
      out.write("            \n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        <!--Grid column-->\n");
      out.write("\n");
      out.write("        <!--Grid column-->\n");
      out.write("        <div class=\"col-lg-3 col-md-6 mb-4 mb-md-0\">\n");
      out.write("          <h5 class=\"text-uppercase\">Nuestros socios</h5>\n");
      out.write("\n");
      out.write("          <ul class=\"list-unstyled mb-0\">\n");
      out.write("            <li>\n");
      out.write("              <a href=\"https://bike.shimano.com/\" class=\"text-white\">Shimano</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"https://www.ridefox.com/\" class=\"text-white\">Fox</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"https://www.sram.com/\" class=\"text-white\">Sram</a>\n");
      out.write("            </li>\n");
      out.write("           \n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        <!--Grid column-->\n");
      out.write("\n");
      out.write("        <!--Grid column-->\n");
      out.write("        <div class=\"col-lg-3 col-md-6 mb-4 mb-md-0\">\n");
      out.write("          <h5 class=\"text-uppercase\">Atención al cliente</h5>\n");
      out.write("\n");
      out.write("          <ul class=\"list-unstyled mb-0\">\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#!\" class=\"text-white\">Contáctanos</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#!\" class=\"text-white\">Terminos y condiciones</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#!\" class=\"text-white\">Seguimiento de envios</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#!\" class=\"text-white\">Aviso legal</a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        <!--Grid column-->\n");
      out.write("\n");
      out.write("        <!--Grid column-->\n");
      out.write("        <div class=\"col-lg-3 col-md-6 mb-4 mb-md-0\">\n");
      out.write("          <h5 class=\"text-uppercase\">Links</h5>\n");
      out.write("\n");
      out.write("          <ul class=\"list-unstyled mb-0\">\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#!\" class=\"text-white\">Link 1</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#!\" class=\"text-white\">Link 2</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#!\" class=\"text-white\">Link 3</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#!\" class=\"text-white\">Link 4</a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        <!--Grid column-->\n");
      out.write("      </div>\n");
      out.write("      <!--Grid row-->\n");
      out.write("    </section>\n");
      out.write("    <!-- Section: Links -->\n");
      out.write("  </div>\n");
      out.write("  <!-- Grid container -->\n");
      out.write("\n");
      out.write("  <!-- Copyright -->\n");
      out.write("  <div class=\"text-center p-3\" style=\"background-color: rgba(0, 0, 0, 0.2);\">\n");
      out.write("    © 2021 Copyright:\n");
      out.write("    <a class=\"text-white\" href=\"\">Sealsior</a>\n");
      out.write("  </div>\n");
      out.write("  <!-- Copyright -->\n");
      out.write("</footer>\n");
      out.write("<!-- Footer -->  \n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.0.min.js\"></script>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\" charset=\"utf8\" src=\"https://cdn.datatables.net/1.11.3/js/jquery.dataTables.js\"></script>\n");
      out.write("        \n");
      out.write("         <script>\n");
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

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                        ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                        \n");
        out.write("                                                        ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                        \n");
        out.write("                                                        ");
        if (_jspx_meth_c_when_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                        \n");
        out.write("                                                        ");
        if (_jspx_meth_c_when_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                        \n");
        out.write("                                                        ");
        if (_jspx_meth_c_when_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                        ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${perfil == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                            <li class=\"nav-item active\"><a class=\"nav-link\" href=\"inicio.jsp\">Inicio</a></li>\n");
        out.write("\t\t\t\t\t\t\t<li class=\"nav-item submenu dropdown\">\n");
        out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
        out.write("\t\t\t\t\t\t\t\t aria-expanded=\"false\">Comprar</a>\n");
        out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
        out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"Controlador?accion=bicicletas\">Bicicletas</a></li>\n");
        out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"Accesorio.jsp\">Accesorios</a></li>\n");
        out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"Repuesto.jsp\">Repuestos</a></li>\n");
        out.write("                                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"Controlador?accion=home\">Todo</a></li>\n");
        out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
        out.write("\t\t\t\t\t\t\t</li>\n");
        out.write("\t\t\t\t\t\t\t<li class=\"nav-item submenu dropdown\">\n");
        out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
        out.write("\t\t\t\t\t\t\t\t aria-expanded=\"false\">Servicios</a>\n");
        out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
        out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ControladorMantencion\">Solicitud Taller</a></li>\n");
        out.write("                                                                       \t<li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"SolicitudArriendo.jsp\">Solicitud Arriendo</a></li>\n");
        out.write("                                                                        \n");
        out.write("\t\t\t\t\t\t\t\t</ul>\n");
        out.write("\t\t\t\t\t\t\t</li>\n");
        out.write("\t\t\t\t\t\t\t<li class=\"nav-item\">\n");
        out.write("                                                            <a class=\"nav-link\" href=\"Controlador?accion=Carrito\"><i class=\"fas fa-cart-plus\"><label style=\"color: darkorange\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contador}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</label></i>Carrito</a>\n");
        out.write("                                                        </li>\n");
        out.write("\t\t\t\t\t\t\t<li class=\"nav-item submenu dropdown\">\n");
        out.write("\t\t\t\t\t\t\t\t<a href=\"login.html\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
        out.write("\t\t\t\t\t\t\t\t aria-expanded=\"false\">Mi Cuenta</a>\n");
        out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
        out.write("                                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\">Hola ");
        if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_0, _jspx_page_context))
          return true;
        out.write("</a></li>\n");
        out.write("                                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ListarMantencionesPorUsuario.jsp\" >Mis mantenciones</a></li>\n");
        out.write("                                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ListarArriendosPorUsuario.jsp\" >Mis arriendos</a></li>\n");
        out.write("                                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"Controlador?accion=MisCompras\">Mis Compras</a></li>\n");
        out.write("                                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ControladorLogout\" style=\"color:red\">Cerrar Sesión</a></li>\n");
        out.write("                                                                </ul>\n");
        out.write("                                                            \n");
        out.write("                                                            \n");
        out.write("\t\t\t\t\t\t\t</li>\n");
        out.write("                                                            \n");
        out.write("                                                        ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioActivo.getPnombre()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${perfil == 2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                            <li class=\"nav-item active\"><a class=\"nav-link\" href=\"inicio.jsp\">Inicio</a></li>\n");
        out.write("\t\t\t\t\t\t\t\n");
        out.write("\t\t\t\t\t\t\t<li class=\"nav-item submenu dropdown\">\n");
        out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
        out.write("\t\t\t\t\t\t\t\t aria-expanded=\"false\">Servicios</a>\n");
        out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
        out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ListaStock.jsp\">Ver stock</a></li>\n");
        out.write("                                                                        \n");
        out.write("\t\t\t\t\t\t\t\t</ul>\n");
        out.write("\t\t\t\t\t\t\t</li>\n");
        out.write("\t\t\t\t\t\t\t\n");
        out.write("\t\t\t\t\t\t\t<li class=\"nav-item submenu dropdown\">\n");
        out.write("\t\t\t\t\t\t\t\t<a href=\"login.html\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
        out.write("\t\t\t\t\t\t\t\t aria-expanded=\"false\">Mi Cuenta</a>\n");
        out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
        out.write("                                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\">Hola ");
        if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("</a></li>\n");
        out.write("                                                                        \n");
        out.write("                                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ControladorLogout\" style=\"color:red\">Cerrar Sesión</a></li>\n");
        out.write("                                                                </ul>\n");
        out.write("                                                            \n");
        out.write("                                                            \n");
        out.write("\t\t\t\t\t\t\t</li>\n");
        out.write("                                                            \n");
        out.write("                                                        ");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioActivo.getPnombre()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_when_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_2.setPageContext(_jspx_page_context);
    _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${perfil == 3}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
    if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                            <li class=\"nav-item active\"><a class=\"nav-link\" href=\"inicio.jsp\">Inicio</a></li>\n");
        out.write("\t\t\t\t\t\t\t\n");
        out.write("\t\t\t\t\t\t\t<li class=\"nav-item submenu dropdown\">\n");
        out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
        out.write("\t\t\t\t\t\t\t\t aria-expanded=\"false\">Servicios</a>\n");
        out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
        out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ListarSolicitudesMantenciones.jsp\">Listado solicitudes taller</a></li>\n");
        out.write("                                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ControladorTaller\">Taller</a></li>\n");
        out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ListarSolicitudesArriendo.jsp\">Listado solicitudes arriendo</a></li>\n");
        out.write("                                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ListaStock.jsp\">Ver stock</a></li>\n");
        out.write("                                                                        \n");
        out.write("\t\t\t\t\t\t\t\t</ul>\n");
        out.write("\t\t\t\t\t\t\t</li>\n");
        out.write("                                                        \n");
        out.write("                                                       \n");
        out.write("\t\t\t\t\t\t\t\n");
        out.write("\t\t\t\t\t\t\t<li class=\"nav-item submenu dropdown\">\n");
        out.write("\t\t\t\t\t\t\t\t<a href=\"login.html\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
        out.write("\t\t\t\t\t\t\t\t aria-expanded=\"false\">Mi Cuenta</a>\n");
        out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
        out.write("                                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\">Hola ");
        if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_2, _jspx_page_context))
          return true;
        out.write("</a></li>\n");
        out.write("                                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ControladorListarUsuarios\">Listado de clientes</a></li>\n");
        out.write("                                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ControladorLogout\" style=\"color:red\">Cerrar Sesión</a></li>\n");
        out.write("                                                                </ul>\n");
        out.write("                                                            \n");
        out.write("                                                            \n");
        out.write("\t\t\t\t\t\t\t</li>\n");
        out.write("                                                            \n");
        out.write("                                                            \n");
        out.write("                                                        ");
        int evalDoAfterBody = _jspx_th_c_when_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
    return false;
  }

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_2);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioActivo.getPnombre()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_when_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_3 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_3.setPageContext(_jspx_page_context);
    _jspx_th_c_when_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${perfil == 4}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_3 = _jspx_th_c_when_3.doStartTag();
    if (_jspx_eval_c_when_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                            <li class=\"nav-item active\"><a class=\"nav-link\" href=\"inicio.jsp\">Inicio</a></li>\n");
        out.write("\t\t\t\t\t\t\t<li class=\"nav-item submenu dropdown\">\n");
        out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
        out.write("\t\t\t\t\t\t\t\t aria-expanded=\"false\">Productos</a>\n");
        out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
        out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"Controlador?accion=bicicletas\">Bicicletas</a></li>\n");
        out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"Accesorio.jsp\">Accesorios</a></li>\n");
        out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"Repuesto.jsp\">Repuestos</a></li>\n");
        out.write("                                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"Controlador?accion=home\">Todo</a></li>\n");
        out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
        out.write("\t\t\t\t\t\t\t</li>\n");
        out.write("\t\t\t\t\t\t\t<li class=\"nav-item submenu dropdown\">\n");
        out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
        out.write("\t\t\t\t\t\t\t\t aria-expanded=\"false\">Servicios</a>\n");
        out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
        out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ControladorMantencion\">Solicitud Taller</a></li>\n");
        out.write("                                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ListarSolicitudesMantenciones.jsp\">Listado solicitudes taller</a></li>\n");
        out.write("                                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"SolicitudArriendo.jsp\">Arriendos</a></li>\n");
        out.write("                                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ControladorListarSolicitudesArriendo\">Listado solicitudes arriendo</a></li>\n");
        out.write("                                                                        \n");
        out.write("\t\t\t\t\t\t\t\t</ul>\n");
        out.write("\t\t\t\t\t\t\t</li>\n");
        out.write("\t\t\t\t\t\t\t\n");
        out.write("\t\t\t\t\t\t\t<li class=\"nav-item submenu dropdown\">\n");
        out.write("\t\t\t\t\t\t\t\t<a href=\"login.html\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
        out.write("\t\t\t\t\t\t\t\t aria-expanded=\"false\">Mi Cuenta</a>\n");
        out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
        out.write("                                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\">Hola ");
        if (_jspx_meth_c_out_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_3, _jspx_page_context))
          return true;
        out.write("</a></li>\n");
        out.write("                                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ControladorListarUsuarios\">Listado de usuarios</a></li>\n");
        out.write("                                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ReporteVenta.jsp\" >Reportes</a></li>\n");
        out.write("                                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ControladorLogout\" style=\"color:red\">Cerrar Sesión</a></li>\n");
        out.write("                                                                </ul>\n");
        out.write("                                                            \n");
        out.write("                                                            \n");
        out.write("\t\t\t\t\t\t\t</li>\n");
        out.write("                                                            \n");
        out.write("                                                            \n");
        out.write("                                                        ");
        int evalDoAfterBody = _jspx_th_c_when_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
    return false;
  }

  private boolean _jspx_meth_c_out_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_3);
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioActivo.getPnombre()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }

  private boolean _jspx_meth_c_when_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_4 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_4.setPageContext(_jspx_page_context);
    _jspx_th_c_when_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${perfil == 5}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_4 = _jspx_th_c_when_4.doStartTag();
    if (_jspx_eval_c_when_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                            <li class=\"nav-item active\"><a class=\"nav-link\" href=\"inicio.jsp\">Inicio</a></li>\n");
        out.write("\t\t\t\t\t\t\t<li class=\"nav-item submenu dropdown\">\n");
        out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
        out.write("\t\t\t\t\t\t\t\t aria-expanded=\"false\">Productos</a>\n");
        out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
        out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"Controlador?accion=bicicletas\">Bicicletas</a></li>\n");
        out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"Accesorio.jsp\">Accesorios</a></li>\n");
        out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"Repuesto.jsp\">Repuestos</a></li>\n");
        out.write("                                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"Controlador?accion=home\">Todo</a></li>\n");
        out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
        out.write("\t\t\t\t\t\t\t</li>\n");
        out.write("\t\t\t\t\t\t\t<li class=\"nav-item submenu dropdown\">\n");
        out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
        out.write("\t\t\t\t\t\t\t\t aria-expanded=\"false\">Servicios</a>\n");
        out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
        out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ListaProductos.jsp\">Lista productos</a></li>\n");
        out.write("                                                                        \n");
        out.write("\t\t\t\t\t\t\t\t</ul>\n");
        out.write("\t\t\t\t\t\t\t</li>\n");
        out.write("\t\t\t\t\t\t\t\n");
        out.write("\t\t\t\t\t\t\t<li class=\"nav-item submenu dropdown\">\n");
        out.write("\t\t\t\t\t\t\t\t<a href=\"login.html\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
        out.write("\t\t\t\t\t\t\t\t aria-expanded=\"false\">Mi Cuenta</a>\n");
        out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
        out.write("                                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\">Hola ");
        if (_jspx_meth_c_out_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_4, _jspx_page_context))
          return true;
        out.write("</a></li>\n");
        out.write("                                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ControladorLogout\" style=\"color:red\">Cerrar Sesión</a></li>\n");
        out.write("                                                                </ul>\n");
        out.write("                                                                                                                        \n");
        out.write("\t\t\t\t\t\t\t</li>\n");
        out.write("                                                                                                                        \n");
        out.write("                                                        ");
        int evalDoAfterBody = _jspx_th_c_when_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_4);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_4);
    return false;
  }

  private boolean _jspx_meth_c_out_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_4.setPageContext(_jspx_page_context);
    _jspx_th_c_out_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_4);
    _jspx_th_c_out_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioActivo.getPnombre()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
    if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("   \n");
        out.write("                                                        <li class=\"nav-item active\"><a class=\"nav-link\" href=\"inicio.jsp\">Inicio</a></li>\n");
        out.write("\t\t\t\t\t\t\t<li class=\"nav-item submenu dropdown\">\n");
        out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
        out.write("\t\t\t\t\t\t\t\t aria-expanded=\"false\">Productos</a>\n");
        out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
        out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"Controlador?accion=bicicletas\">Bicicletas</a></li>\n");
        out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"Accesorio.jsp\">Accesorios</a></li>\n");
        out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"Repuesto.jsp\">Repuestos</a></li>\n");
        out.write("                                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"Controlador?accion=home\">Todo</a></li>\n");
        out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
        out.write("\t\t\t\t\t\t\t</li>\n");
        out.write("\t\t\t\t\t\t\t\n");
        out.write("                                                        <li class=\"nav-item\">\n");
        out.write("                                                            <a class=\"nav-link\" href=\"Controlador?accion=Carrito\"><i class=\"fas fa-cart-plus\"><label style=\"color: darkorange\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contador}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</label></i>Carrito</a>\n");
        out.write("                                                        </li>\n");
        out.write("\t\t\t\t\t\t\t\n");
        out.write("\t\t\t\t\t\t\t<li class=\"nav-item submenu dropdown\">\n");
        out.write("\t\t\t\t\t\t\t\t<a href=\"login.html\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
        out.write("\t\t\t\t\t\t\t\t aria-expanded=\"false\">Mi Cuenta</a>\n");
        out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
        out.write("                                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"Login.jsp\">Iniciar Sesión</a></li>\n");
        out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ControladorUsuario\">Registrate</a></li>\n");
        out.write("\t\t\t\t\t\t\t\t\t\n");
        out.write("                                                                        \n");
        out.write("                                                                </ul>\n");
        out.write("                                                            \n");
        out.write("                                                            \n");
        out.write("\t\t\t\t\t\t\t</li>\n");
        out.write("                                                        \n");
        out.write("                                                        ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
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
          out.write("                            <tr class=\"text-center\">\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getIdProducto()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getNombreproducto()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getTipoproducto()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getDescripcion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getFabricpropia()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getValproducto()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <!--<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getMarca()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getModelo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>-->\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getStock()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                \n");
          out.write("                                <td><img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getImagen()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" height=\"100\" width=\"100\"></td>\n");
          out.write("                                \n");
          out.write("                                <td class=\"d-flex\">\n");
          out.write("                                    <form action=\"ControladorEditarProducto\" method=\"POST\">\n");
          out.write("                                        <input type=\"hidden\" name=\"id\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getIdProducto()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                        <input type=\"submit\" name=\"accion\" value=\"Editar\" class=\"btn btn-success\">\n");
          out.write("\n");
          out.write("                                    </form>\n");
          out.write("                                    <a href=\"ControladorProducto?accion=eliminar&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getIdProducto()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-danger\" onclick=\"javascript:if(!confirm('¿Desea eliminar el producto ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getNombreproducto()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('?');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getIdProducto()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("'))return false\">Eliminar</a>           \n");
          out.write("                                </td>\n");
          out.write("                        \n");
          out.write("                                <td>\n");
          out.write("                                    <a href=\"ControladorDocumentos?accion=add&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getIdProducto()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-primary\">Agregar</a>\n");
          out.write("                                </td>\n");
          out.write("                            </tr>\n");
          out.write("                        ");
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
