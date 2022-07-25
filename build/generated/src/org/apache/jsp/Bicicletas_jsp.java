package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import DAO.ProductoDAO;
import Model.Producto;

public final class Bicicletas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("            <style>     \n");
      out.write("            .container {\n");
      out.write("\n");
      out.write("\n");
      out.write("                     text-align: center;\n");
      out.write("\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("\n");
      out.write("            </style>\n");
      out.write("            <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" integrity=\"sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z\" crossorigin=\"anonymous\">\n");
      out.write("            <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("            <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <title>MasterBikes</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"path/to/font-awesome/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"https://kit.fontawesome.com/c747d09760.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-uWxY/CJNBR+1zjPWmfnSnVxwRheevXITnMqoEIeG1LJrdI0GlVs/9cVSyPYXdcSF\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("    \n");
      out.write("     <!-- Start Header Area -->\n");
      out.write("\t<header class=\"header_area sticky-header\">\n");
      out.write("\t\t<div class=\"main_menu\">\n");
      out.write("\t\t\t<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark main_box\">\n");
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
      out.write("\t\t\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"inicio.jsp\">Inicio</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"nav-item submenu dropdown active\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
      out.write("\t\t\t\t\t\t\t\t aria-expanded=\"false\">Comprar</a>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item bg-dark active\"><a class=\"nav-link\" href=\"Controlador?accion=bicicletas\">Bicicletas</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"single-product.html\">Accesorios</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"checkout.html\">Repuestos</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"tracking.html\">Seguimiento</a></li>\n");
      out.write("                                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"Controlador?accion=home\">Todo</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"nav-item submenu dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
      out.write("\t\t\t\t\t\t\t\t aria-expanded=\"false\">Servicios</a>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ControladorMantencion\">Taller</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"SolicitudArriendo.jsp\">Arriendos</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"nav-item submenu dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"login.html\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
      out.write("\t\t\t\t\t\t\t\t aria-expanded=\"false\">Iniciar Sesión</a>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ControladorUsuario\">Registrate</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ControladorListarUsuarios\">Listado de usuarios</a></li>\n");
      out.write("                                                                </ul>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"contact.html\">Contáctanos</a></li>\n");
      out.write("                                                         <li class=\"nav-item\">\n");
      out.write("                                                            <a class=\"nav-link\" href=\"Controlador?accion=Carrito\"><i class=\"fas fa-cart-plus\"><label style=\"color: darkorange\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contador}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label></i>Carrito</a>\n");
      out.write("                                                        </li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</nav>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t</header>\n");
      out.write("                    ");
  
                          Producto p = new Producto();
                          ProductoDAO pDAO=new ProductoDAO();
                          List<Producto>productos=pDAO.listarBicicleta();
                          request.setAttribute("pro", productos);
                    
      out.write("\n");
      out.write("        <div class=\"container mt-4\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Footer -->\n");
      out.write("    <footer class=\"bg-dark text-center text-white\">\n");
      out.write("      <!-- Grid container -->\n");
      out.write("      <div class=\"container p-4\">\n");
      out.write("        <!-- Section: Social media -->\n");
      out.write("        <section class=\"mb-4\">\n");
      out.write("          <!-- Facebook -->\n");
      out.write("          <a class=\"btn btn-outline-light btn-floating m-1\" href=\"#!\" role=\"button\"\n");
      out.write("            ><i class=\"fab fa-facebook-f\"></i\n");
      out.write("          ></a>\n");
      out.write("\n");
      out.write("          <!-- Twitter -->\n");
      out.write("          <a class=\"btn btn-outline-light btn-floating m-1\" href=\"#!\" role=\"button\"\n");
      out.write("            ><i class=\"fab fa-twitter\"></i\n");
      out.write("          ></a>\n");
      out.write("\n");
      out.write("          <!-- Google -->\n");
      out.write("          <a class=\"btn btn-outline-light btn-floating m-1\" href=\"#!\" role=\"button\"\n");
      out.write("            ><i class=\"fab fa-google\"></i\n");
      out.write("          ></a>\n");
      out.write("\n");
      out.write("          <!-- Instagram -->\n");
      out.write("          <a class=\"btn btn-outline-light btn-floating m-1\" href=\"#!\" role=\"button\"\n");
      out.write("            ><i class=\"fab fa-instagram\"></i\n");
      out.write("          ></a>\n");
      out.write("\n");
      out.write("          <!-- Linkedin -->\n");
      out.write("          <a class=\"btn btn-outline-light btn-floating m-1\" href=\"#!\" role=\"button\"\n");
      out.write("            ><i class=\"fab fa-linkedin-in\"></i\n");
      out.write("          ></a>\n");
      out.write("\n");
      out.write("          <!-- Github -->\n");
      out.write("          <a class=\"btn btn-outline-light btn-floating m-1\" href=\"#!\" role=\"button\"\n");
      out.write("            ><i class=\"fab fa-github\"></i\n");
      out.write("          ></a>\n");
      out.write("        </section>\n");
      out.write("        <!-- Section: Social media -->\n");
      out.write("\n");
      out.write("        <!-- Section: Form -->\n");
      out.write("        <section class=\"\">\n");
      out.write("          <form action=\"\">\n");
      out.write("            <!--Grid row-->\n");
      out.write("            <div class=\"row d-flex justify-content-center\">\n");
      out.write("              <!--Grid column-->\n");
      out.write("              <div class=\"col-auto\">\n");
      out.write("                <p class=\"pt-2\">\n");
      out.write("                  <strong>Suscribete a nuestras noticias</strong>\n");
      out.write("                </p>\n");
      out.write("              </div>\n");
      out.write("              <!--Grid column-->\n");
      out.write("\n");
      out.write("              <!--Grid column-->\n");
      out.write("              <div class=\"col-md-5 col-12\">\n");
      out.write("                <!-- Email input -->\n");
      out.write("                <div class=\"form-outline form-white mb-4\">\n");
      out.write("                  <input type=\"email\" id=\"form5Example21\" class=\"form-control\" />\n");
      out.write("                  <label class=\"form-label\" for=\"form5Example21\">Tu email</label>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <!--Grid column-->\n");
      out.write("\n");
      out.write("              <!--Grid column-->\n");
      out.write("              <div class=\"col-auto\">\n");
      out.write("                <!-- Submit button -->\n");
      out.write("                <button type=\"submit\" class=\"btn btn-outline-light mb-4\">\n");
      out.write("                  Suscribir\n");
      out.write("                </button>\n");
      out.write("              </div>\n");
      out.write("              <!--Grid column-->\n");
      out.write("            </div>\n");
      out.write("            <!--Grid row-->\n");
      out.write("          </form>\n");
      out.write("        </section>\n");
      out.write("        <!-- Section: Form -->\n");
      out.write("\n");
      out.write("        <!-- Section: Text -->\n");
      out.write("        <section class=\"mb-4\">\n");
      out.write("          <p>\n");
      out.write("            La fabrica de bicicletas San Diego nacio en el año 1990 en la ciudad de Santiago como respuesta a \n");
      out.write("            la cresciente demanda de bicicletas de los habitantes de la capital, hoy, 31 años despúes bajo la\n");
      out.write("            nueva marca \"Masterbik\" busca nuevamente ser protagonista del ciclismo nacional ofreciendo nuevos \n");
      out.write("            servicios de acuerdo a las necesidades de los riders chilenos.\n");
      out.write("          </p>\n");
      out.write("        </section>\n");
      out.write("        <!-- Section: Text -->\n");
      out.write("\n");
      out.write("        <!-- Section: Links -->\n");
      out.write("        <section class=\"\">\n");
      out.write("          <!--Grid row-->\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <!--Grid column-->\n");
      out.write("            <div class=\"col-lg-3 col-md-6 mb-4 mb-md-0\">\n");
      out.write("              <h5 class=\"text-uppercase\">Categorias</h5>\n");
      out.write("\n");
      out.write("              <ul class=\"list-unstyled mb-0\">\n");
      out.write("                <li>\n");
      out.write("                  <a href=\"#!\" class=\"text-white\">Nuestros productos</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                  <a href=\"ControladorMantencion\" class=\"text-white\">Taller de bicicletas</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                  <a href=\"SolicitudArriendo.jsp\" class=\"text-white\">Arriendo de bicicletas</a>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("            <!--Grid column-->\n");
      out.write("\n");
      out.write("            <!--Grid column-->\n");
      out.write("            <div class=\"col-lg-3 col-md-6 mb-4 mb-md-0\">\n");
      out.write("              <h5 class=\"text-uppercase\">Nuestros socios</h5>\n");
      out.write("\n");
      out.write("              <ul class=\"list-unstyled mb-0\">\n");
      out.write("                <li>\n");
      out.write("                  <a href=\"https://bike.shimano.com/\" class=\"text-white\">Shimano</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                  <a href=\"https://www.ridefox.com/\" class=\"text-white\">Fox</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                  <a href=\"https://www.sram.com/\" class=\"text-white\">Sram</a>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("            <!--Grid column-->\n");
      out.write("\n");
      out.write("            <!--Grid column-->\n");
      out.write("            <div class=\"col-lg-3 col-md-6 mb-4 mb-md-0\">\n");
      out.write("              <h5 class=\"text-uppercase\">Atención al cliente</h5>\n");
      out.write("\n");
      out.write("              <ul class=\"list-unstyled mb-0\">\n");
      out.write("                <li>\n");
      out.write("                  <a href=\"#!\" class=\"text-white\">Contáctanos</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                  <a href=\"#!\" class=\"text-white\">Terminos y condiciones</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                  <a href=\"#!\" class=\"text-white\">Seguimiento de envios</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                  <a href=\"#!\" class=\"text-white\">Aviso legal</a>\n");
      out.write("                </li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("            <!--Grid column-->\n");
      out.write("\n");
      out.write("            <!--Grid column-->\n");
      out.write("            <div class=\"col-lg-3 col-md-6 mb-4 mb-md-0\">\n");
      out.write("              <h5 class=\"text-uppercase\">Links</h5>\n");
      out.write("\n");
      out.write("              <ul class=\"list-unstyled mb-0\">\n");
      out.write("                <li>\n");
      out.write("                  <a href=\"#!\" class=\"text-white\">Link 1</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                  <a href=\"#!\" class=\"text-white\">Link 2</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                  <a href=\"#!\" class=\"text-white\">Link 3</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                  <a href=\"#!\" class=\"text-white\">Link 4</a>\n");
      out.write("                </li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("            <!--Grid column-->\n");
      out.write("          </div>\n");
      out.write("          <!--Grid row-->\n");
      out.write("        </section>\n");
      out.write("        <!-- Section: Links -->\n");
      out.write("      </div>\n");
      out.write("      <!-- Grid container -->\n");
      out.write("\n");
      out.write("      <!-- Copyright -->\n");
      out.write("      <div class=\"text-center p-3\" style=\"background-color: rgba(0, 0, 0, 0.2);\">\n");
      out.write("        © 2021 Copyright:\n");
      out.write("        <a class=\"text-white\" href=\"\">Sealsior</a>\n");
      out.write("      </div>\n");
      out.write("      <!-- Copyright -->\n");
      out.write("    </footer>\n");
      out.write("    <!-- Footer -->  \n");
      out.write("      <script src=\"https://code.jquery.com/jquery-3.5.0.min.js\"></script> \n");
      out.write("      <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("      <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("      <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("      \n");
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
          out.write(" \n");
          out.write("                    <div class=\"col-sm-4\">\n");
          out.write("                        <div class=\"card\">\n");
          out.write("                            <div class=\"card-header\">\n");
          out.write("                                <label>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</label>\n");
          out.write("                            </div>\n");
          out.write("                            <div class=\"card-body\">\n");
          out.write("                                <i>$.");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getValor()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</i>\n");
          out.write("                                <img src=\"ControladorIMG?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" width=\"200\" height=\"180\">\n");
          out.write("                            </div>\n");
          out.write("                            <div class=\"card-footer text-center\">\n");
          out.write("                                <label>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getDescripcion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</label>\n");
          out.write("                                <div>\n");
          out.write("                                    <a href=\"Controlador?accion=AgregarCarrito&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-outline-info\">Agregar al carrito<i class=\"fas fa-cart-plus\"></i></a>\n");
          out.write("                                    <a href=\"Controlador?accion=Comprar&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-outline-danger\">Comprar</a>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                ");
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
