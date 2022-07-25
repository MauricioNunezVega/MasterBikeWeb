package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class EnviarPromocion_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_url_value_nobody.release();
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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"https://masterbike.ro/img/favicon.ico?1636634012\">\n");
      out.write("         <!-- Bootstrap CSS -->\n");
      out.write("     <link rel=\"stylesheet\" href=\"path/to/font-awesome/css/font-awesome.min.css\">\n");
      out.write("     <script src=\"https://kit.fontawesome.com/c747d09760.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" integrity=\"sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <style>   \n");
      out.write("            HTML SCSSResult Skip Results Iframe\n");
      out.write("\n");
      out.write("\n");
      out.write("body {\n");
      out.write("  background: #eee !important;  \n");
      out.write("}\n");
      out.write("\n");
      out.write(".wrapper {  \n");
      out.write("  margin-top: 80px;\n");
      out.write("  margin-bottom: 80px;\n");
      out.write("  \n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".form-signin {\n");
      out.write("  max-width: 380px;\n");
      out.write("  padding: 15px 35px 45px;\n");
      out.write("  margin: 0 auto;\n");
      out.write("  background-color: #fff;\n");
      out.write("  border: 1px solid rgba(0,0,0,0.1);  \n");
      out.write("\n");
      out.write("  .form-signin-heading,\n");
      out.write("  .checkbox {\n");
      out.write("    margin-bottom: 30px;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .checkbox {\n");
      out.write("    font-weight: normal;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .form-control {\n");
      out.write("    position: relative;\n");
      out.write("    font-size: 16px;\n");
      out.write("    height: auto;\n");
      out.write("    padding: 10px;\n");
      out.write("    @include box-sizing(border-box);\n");
      out.write("\n");
      out.write("    &:focus {\n");
      out.write("      z-index: 2;\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  input[type=\"text\"] {\n");
      out.write("    margin-bottom: -1px;\n");
      out.write("    border-bottom-left-radius: 0;\n");
      out.write("    border-bottom-right-radius: 0;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  input[type=\"password\"] {\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("    border-top-left-radius: 0;\n");
      out.write("    border-top-right-radius: 0;\n");
      out.write("    \n");
      out.write("  }\n");
      out.write("}\n");
      out.write("View Compiled \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        .container {\n");
      out.write("                 \n");
      out.write("                   \n");
      out.write("                 text-align: center;\n");
      out.write("                }\n");
      out.write("        \n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("        <title>Envio de promociones</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("           <!-- Start Header Area -->\n");
      out.write("\t<header class=\"header_area sticky-header\">\n");
      out.write("\t\t<div class=\"main_menu\">\n");
      out.write("\t\t\t<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark main_box\" >\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("\t\t\t\t\t<a class=\"navbar-brand logo_h\" href=\"inicio.jsp\"><img src=\"https://i.ibb.co/CH3Ln98/logo.png\" alt=\"\"></a>\n");
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
      out.write("\t<!-- End Header Area -->     \n");
      out.write("        \n");
      out.write("        <!--Area formulario-->\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <h2 class=\"form-signin-heading\"style=\"text-align:center\">Enviar promociones masivas🤑</h2>\n");
      out.write("            <form action=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\" class=\"form-signin\" method=\"post\">\n");
      out.write("                   \n");
      out.write("            <div class=\"mb-3\">\n");
      out.write("            <strong for=\"cboTipoCliente\" class=\"form-label\">Clientes objetivo:</strong>\n");
      out.write("            <select name=\"cboTipoCliente\" id=\"cboTipoCliente\" class=\"custom-select my-1 mr-sm-2\">\n");
      out.write("              <option value=\"Sin convenio\">Sin convenio</option>\n");
      out.write("              <option value=\"Convenio municipalidad\">Convenio municipalidad</option>\n");
      out.write("              <option value=\"Convenio empresa\">Convenio empresa</option>\n");
      out.write("              <option value=\"Convenio Club deportivo\">Convenio Club deportivo</option>\n");
      out.write("              </select>\n");
      out.write("            </div>\n");
      out.write("             \n");
      out.write("            <div class=\"mb-3\">\n");
      out.write("            <strong for=\"txtDetalle\" class=\"form-label\" >Detalle de la promoción:</strong>\n");
      out.write("            <textarea  name=\"txtDetalle\" id=\"txtDetalle\" class=\"form-control\" placeholder=\"Ingrese contenido\" required maxlength=\"200\" rows=\"10\"></textarea>\n");
      out.write("            <div class=\"valid-feedback\">Valido.</div>\n");
      out.write("            <div class=\"invalid-feedback\">Por favor llene este campo.</div>\n");
      out.write("            </div>\n");
      out.write("              \n");
      out.write("            <button type=\"submit\" class=\"btn btn-primary\">Enviar promoción</button>\n");
      out.write("            <br>    \n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("        <!--Fin Area formulario-->\n");
      out.write("        \n");
      out.write("        <!-- Footer -->\n");
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
      out.write("              <a href=\"Controlador?accion=bicicletas\" class=\"text-white\">Bicicletas</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"Accesorio.jsp\" class=\"text-white\">Accesorios</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"Repuesto.jsp\" class=\"text-white\">Repuestos</a>\n");
      out.write("            </li>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        <!--Grid column-->\n");
      out.write("\n");
      out.write("        <!--Grid column-->\n");
      out.write("        <div class=\"col-lg-3 col-md-6 mb-4 mb-md-0\">\n");
      out.write("          <h5 class=\"text-uppercase\">Representamos a</h5>\n");
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
      out.write("              <a href=\"mailto:info@masterbike.cl\" class=\"text-white\">Contáctanos</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"TerminosCondiciones.jsp\" class=\"text-white\">Terminos y condiciones</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"AvisoLegal.jsp\" class=\"text-white\">Aviso legal</a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        <!--Grid column-->\n");
      out.write("\n");
      out.write("        <!--Grid column-->\n");
      out.write("        <div class=\"col-lg-3 col-md-6 mb-4 mb-md-0\">\n");
      out.write("          <h5 class=\"text-uppercase\">Tu Masterbike</h5>\n");
      out.write("\n");
      out.write("          <ul class=\"list-unstyled mb-0\">\n");
      out.write("            <li>\n");
      out.write("              <a href=\"RegistroUsuario.jsp\" class=\"text-white\">Registrate</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"Login.jsp\" class=\"text-white\">Iniciar sesión</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"Login.jsp\" class=\"text-white\">Seguimiento de envios</a>\n");
      out.write("            </li>\n");
      out.write("            </ul>\n");
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
      out.write("<!-- Footer --> \n");
      out.write("        \n");
      out.write("    <!-- JavaScript -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\" integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\" integrity=\"sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV\" crossorigin=\"anonymous\"></script>\n");
      out.write("   \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioActivo.getNombre()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioActivo.getNombre()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioActivo.getNombre()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioActivo.getNombre()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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
    _jspx_th_c_out_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioActivo.getNombre()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/ControladorPromociones");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }
}
