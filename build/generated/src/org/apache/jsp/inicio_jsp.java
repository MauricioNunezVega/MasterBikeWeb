package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class inicio_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"shortcut icon\" href=\"https://masterbike.ro/img/favicon.ico?1636634012\">\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"path/to/font-awesome/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"https://kit.fontawesome.com/c747d09760.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" integrity=\"sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <style>     \n");
      out.write("            .container {\n");
      out.write("\n");
      out.write("\n");
      out.write("                text-align: center;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #myCarousel .carousel-item .mask {\n");
      out.write("                position: absolute;\n");
      out.write("                top: 0;\n");
      out.write("                left:0;\n");
      out.write("                height:100%;\n");
      out.write("                width: 100%;\n");
      out.write("                background-attachment: fixed;\n");
      out.write("            }\n");
      out.write("            #myCarousel h4{\n");
      out.write("                font-size:50px;\n");
      out.write("                margin-bottom:15px;\n");
      out.write("                color:#FFF;\n");
      out.write("                line-height:100%;\n");
      out.write("                letter-spacing:0.5px;\n");
      out.write("                font-weight:600;\n");
      out.write("            }\n");
      out.write("            #myCarousel p{\n");
      out.write("                font-size:18px;\n");
      out.write("                margin-bottom:15px;\n");
      out.write("                color:#d5d5d5;\n");
      out.write("            }\n");
      out.write("            #myCarousel .carousel-item a{background:#F47735; font-size:14px; color:#FFF; padding:13px 32px; display:inline-block; }\n");
      out.write("            #myCarousel .carousel-item a:hover{background:#394fa2; text-decoration:none;  }\n");
      out.write("\n");
      out.write("            #myCarousel .carousel-item h4{-webkit-animation-name:fadeInLeft; animation-name:fadeInLeft;} \n");
      out.write("            #myCarousel .carousel-item p{-webkit-animation-name:slideInRight; animation-name:slideInRight;} \n");
      out.write("            #myCarousel .carousel-item a{-webkit-animation-name:fadeInUp; animation-name:fadeInUp;}\n");
      out.write("            #myCarousel .carousel-item .mask img{-webkit-animation-name:slideInRight; animation-name:slideInRight; display:block; height:auto; max-width:100%;}\n");
      out.write("            #myCarousel h4, #myCarousel p, #myCarousel a, #myCarousel .carousel-item .mask img{-webkit-animation-duration: 1s;\n");
      out.write("                                                                                               animation-duration: 1.2s;\n");
      out.write("                                                                                               -webkit-animation-fill-mode: both;\n");
      out.write("                                                                                               animation-fill-mode: both;\n");
      out.write("            }\n");
      out.write("            #myCarousel .container {max-width: 1430px;  }\n");
      out.write("            #myCarousel .carousel-item{height:100%; min-height:550px; }\n");
      out.write("            #myCarousel{position:relative; z-index:1; background:url(https://i.imgur.com/6axE29k.jpg) center center no-repeat; background-size:cover; }\n");
      out.write("\n");
      out.write("            .carousel-control-next, .carousel-control-prev{height:40px; width:40px; padding:12px; top:50%; bottom:auto; transform:translateY(-50%); background-color: #f47735; }\n");
      out.write("\n");
      out.write("\n");
      out.write("            .carousel-item {\n");
      out.write("                position: relative;\n");
      out.write("                display: none;\n");
      out.write("                -webkit-box-align: center;\n");
      out.write("                -ms-flex-align: center;\n");
      out.write("                align-items: center;\n");
      out.write("                width: 100%;\n");
      out.write("                transition: -webkit-transform .6s ease;\n");
      out.write("                transition: transform .6s ease;\n");
      out.write("                transition: transform .6s ease,-webkit-transform .6s ease;\n");
      out.write("                -webkit-backface-visibility: hidden;\n");
      out.write("                backface-visibility: hidden;\n");
      out.write("                -webkit-perspective: 1000px;\n");
      out.write("                perspective: 1000px;\n");
      out.write("            }\n");
      out.write("            .carousel-fade .carousel-item {\n");
      out.write("                opacity: 0;\n");
      out.write("                -webkit-transition-duration: .6s;\n");
      out.write("                transition-duration: .6s;\n");
      out.write("                -webkit-transition-property: opacity;\n");
      out.write("                transition-property: opacity\n");
      out.write("            }\n");
      out.write("            .carousel-fade .carousel-item-next.carousel-item-left, .carousel-fade .carousel-item-prev.carousel-item-right, .carousel-fade .carousel-item.active {\n");
      out.write("                opacity: 1\n");
      out.write("            }\n");
      out.write("            .carousel-fade .carousel-item-left.active, .carousel-fade .carousel-item-right.active {\n");
      out.write("                opacity: 0\n");
      out.write("            }\n");
      out.write("            .carousel-fade .carousel-item-left.active, .carousel-fade .carousel-item-next, .carousel-fade .carousel-item-prev, .carousel-fade .carousel-item-prev.active, .carousel-fade .carousel-item.active {\n");
      out.write("                -webkit-transform: translateX(0);\n");
      out.write("                -ms-transform: translateX(0);\n");
      out.write("                transform: translateX(0)\n");
      out.write("            }\n");
      out.write("           /* @supports (transform-style:preserve-3d) {*/\n");
      out.write("                .carousel-fade .carousel-item-left.active, .carousel-fade .carousel-item-next, .carousel-fade .carousel-item-prev, .carousel-fade .carousel-item-prev.active, .carousel-fade .carousel-item.active {\n");
      out.write("                    -webkit-transform:translate3d(0, 0, 0);\n");
      out.write("                    transform:translate3d(0, 0, 0)\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .carousel-fade .carousel-item-left.active, .carousel-fade .carousel-item-next, .carousel-fade .carousel-item-prev, .carousel-fade .carousel-item-prev.active, .carousel-fade .carousel-item.active {\n");
      out.write("                    -webkit-transform: translate3d(0,0,0);\n");
      out.write("                    transform: translate3d(0,0,0);\n");
      out.write("                }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                @-webkit-keyframes fadeInLeft {\n");
      out.write("                    from {\n");
      out.write("                        opacity: 0;\n");
      out.write("                        -webkit-transform: translate3d(-100%, 0, 0);\n");
      out.write("                        transform: translate3d(-100%, 0, 0);\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    to {\n");
      out.write("                        opacity: 1;\n");
      out.write("                        -webkit-transform: translate3d(0, 0, 0);\n");
      out.write("                        transform: translate3d(0, 0, 0);\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                @keyframes fadeInLeft {\n");
      out.write("                    from {\n");
      out.write("                        opacity: 0;\n");
      out.write("                        -webkit-transform: translate3d(-100%, 0, 0);\n");
      out.write("                        transform: translate3d(-100%, 0, 0);\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    to {\n");
      out.write("                        opacity: 1;\n");
      out.write("                        -webkit-transform: translate3d(0, 0, 0);\n");
      out.write("                        transform: translate3d(0, 0, 0);\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .fadeInLeft {\n");
      out.write("                    -webkit-animation-name: fadeInLeft;\n");
      out.write("                    animation-name: fadeInLeft;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                @-webkit-keyframes fadeInUp {\n");
      out.write("                    from {\n");
      out.write("                        opacity: 0;\n");
      out.write("                        -webkit-transform: translate3d(0, 100%, 0);\n");
      out.write("                        transform: translate3d(0, 100%, 0);\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    to {\n");
      out.write("                        opacity: 1;\n");
      out.write("                        -webkit-transform: translate3d(0, 0, 0);\n");
      out.write("                        transform: translate3d(0, 0, 0);\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                @keyframes fadeInUp {\n");
      out.write("                    from {\n");
      out.write("                        opacity: 0;\n");
      out.write("                        -webkit-transform: translate3d(0, 100%, 0);\n");
      out.write("                        transform: translate3d(0, 100%, 0);\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    to {\n");
      out.write("                        opacity: 1;\n");
      out.write("                        -webkit-transform: translate3d(0, 0, 0);\n");
      out.write("                        transform: translate3d(0, 0, 0);\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .fadeInUp {\n");
      out.write("                    -webkit-animation-name: fadeInUp;\n");
      out.write("                    animation-name: fadeInUp;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                @-webkit-keyframes slideInRight {\n");
      out.write("                    from {\n");
      out.write("                        -webkit-transform: translate3d(100%, 0, 0);\n");
      out.write("                        transform: translate3d(100%, 0, 0);\n");
      out.write("                        visibility: visible;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    to {\n");
      out.write("                        -webkit-transform: translate3d(0, 0, 0);\n");
      out.write("                        transform: translate3d(0, 0, 0);\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                @keyframes slideInRight {\n");
      out.write("                    from {\n");
      out.write("                        -webkit-transform: translate3d(100%, 0, 0);\n");
      out.write("                        transform: translate3d(100%, 0, 0);\n");
      out.write("                        visibility: visible;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    to {\n");
      out.write("                        -webkit-transform: translate3d(0, 0, 0);\n");
      out.write("                        transform: translate3d(0, 0, 0);\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .slideInRight {\n");
      out.write("                    -webkit-animation-name: slideInRight;\n");
      out.write("                    animation-name: slideInRight;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </style>\n");
      out.write("            <title>Masterbike</title>\n");
      out.write("\n");
      out.write("        </head>\n");
      out.write("\n");
      out.write("        <body>\n");
      out.write("\n");
      out.write("            <!-- Start Header Area -->\n");
      out.write("            <header class=\"header_area sticky-header\">\n");
      out.write("                <div class=\"main_menu\">\n");
      out.write("                    <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark main_box\" >\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                            <a class=\"navbar-brand logo_h\" href=\"inicio.jsp\"><img src=\"https://i.ibb.co/3Fm1YdV/MBLOGO1.png\" alt=\"\"></a>\n");
      out.write("                            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\"\n");
      out.write("                                    aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                            </button>\n");
      out.write("                            <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                            <div class=\"collapse navbar-collapse offset\" id=\"navbarSupportedContent\">\n");
      out.write("                                <ul class=\"nav navbar-nav menu_nav ml-auto\">\n");
      out.write("                                    ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                                    </ul>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </nav>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </header>\n");
      out.write("                <!-- End Header Area -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div id=\"myCarousel\" class=\"carousel slide carousel-fade\" data-ride=\"carousel\">\n");
      out.write("                    <div class=\"carousel-inner\">\n");
      out.write("                        <div class=\"carousel-item active\">\n");
      out.write("                            <div class=\"mask flex-center\">\n");
      out.write("                                <div class=\"container\">\n");
      out.write("                                    <div class=\"row align-items-center\">\n");
      out.write("                                        <div class=\"col-md-7 col-12 order-md-1 order-2\">\n");
      out.write("                                            <h4>Todo en bicicletas<br>\n");
      out.write("                                                para principiantes y profesionales</h4>\n");
      out.write("                                            <p>Tenemos disponibles bicicletas recreativas, Enduro <br>\n");
      out.write("                                                Mountain bikes, Downhill, Cross Country y más.</p>\n");
      out.write("                                            <a href=\"Controlador?accion=bicicletas\">¡COMPRA AHORA!</a> </div>\n");
      out.write("                                        <div class=\"col-md-5 col-12 order-md-2 order-1\"><img src=\"https://i.ibb.co/KrRhjR8/bici3.png\" class=\"mx-auto\" alt=\"slide\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"carousel-item\">\n");
      out.write("                            <div class=\"mask flex-center\">\n");
      out.write("                                <div class=\"container\">\n");
      out.write("                                    <div class=\"row align-items-center\">\n");
      out.write("                                        <div class=\"col-md-7 col-12 order-md-1 order-2\">\n");
      out.write("                                            <h4>Tenemos todo en<br>\n");
      out.write("                                                accesorios de seguridad</h4>\n");
      out.write("                                            <p>Cascos para principiantes, integrales y enduro, <br>\n");
      out.write("                                                además de gran cantidad de otros accesorios para mejorar tu experiencia .</p>\n");
      out.write("                                            <a href=\"Accesorio.jsp\">¡COMPRA AHORA!</a> </div>\n");
      out.write("                                        <div class=\"col-md-5 col-12 order-md-2 order-1\"><img src=\"https://i.ibb.co/DVHvQj6/casco2.png\" class=\"mx-auto\" alt=\"slide\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"carousel-item\">\n");
      out.write("                            <div class=\"mask flex-center\">\n");
      out.write("                                <div class=\"container\">\n");
      out.write("                                    <div class=\"row align-items-center\">\n");
      out.write("                                        <div class=\"col-md-7 col-12 order-md-1 order-2\">\n");
      out.write("                                            <h4>Los mejores repuestos<br>\n");
      out.write("                                                para tu bicicleta</h4>\n");
      out.write("                                            <p>Somos representantes directos por lo que ofrecemos los mejores precios<br>\n");
      out.write("                                                y una gran variedad de alternativas.</p>\n");
      out.write("                                            <a href=\"Repuesto.jsp\">¡COMPRA AHORA!</a> </div>\n");
      out.write("                                        <div class=\"col-md-5 col-12 order-md-2 order-1\"><img src=\"https://i.ibb.co/PgK4tpG/frenodisc.png\" class=\"mx-auto\" alt=\"slide\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <a class=\"carousel-control-prev\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\"> <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span> <span class=\"sr-only\">Previous</span> </a> <a class=\"carousel-control-next\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\"> <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span> <span class=\"sr-only\">Next</span> </a> </div>\n");
      out.write("                <!--slide end--> \n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- start features Area -->\n");
      out.write("                <section class=\"features-area section_gap\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row features-inner\">\n");
      out.write("                            <!-- single features -->\n");
      out.write("                            <div class=\"col-lg-3 col-md-6 col-sm-6\">\n");
      out.write("                                <div class=\"single-features\">\n");
      out.write("                                    <div class=\"f-icon\">\n");
      out.write("                                        <img src=\"https://i.ibb.co/SrFhxjN/f-icon1.png\" alt=\"\"/>\n");
      out.write("                                    </div>\n");
      out.write("                                    <h6>Envío gratuito</h6>\n");
      out.write("                                    <p>Dentro de región metropolitana</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- single features -->\n");
      out.write("                            <div class=\"col-lg-3 col-md-6 col-sm-6\">\n");
      out.write("                                <div class=\"single-features\">\n");
      out.write("                                    <div class=\"f-icon\">\n");
      out.write("                                        <img src=\"https://i.ibb.co/NsSXnf0/f-icon2.png\" alt=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <h6>Política de reembolso</h6>\n");
      out.write("                                    <p>Hasta 90 días</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- single features -->\n");
      out.write("                            <div class=\"col-lg-3 col-md-6 col-sm-6\">\n");
      out.write("                                <div class=\"single-features\">\n");
      out.write("                                    <div class=\"f-icon\">\n");
      out.write("                                        <img src=\"https://i.ibb.co/x3rHg8Q/f-icon3.png\" alt=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <h6>Servicio al cliente</h6>\n");
      out.write("                                    <p>Respondemos tus dudas</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- single features -->\n");
      out.write("                            <div class=\"col-lg-3 col-md-6 col-sm-6\">\n");
      out.write("                                <div class=\"single-features\">\n");
      out.write("                                    <div class=\"f-icon\">\n");
      out.write("                                        <img src=\"https://i.ibb.co/wB1z1CT/f-icon4.png\" alt=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <h6>Todo medio de pago</h6>\n");
      out.write("                                    <p>Crédito sin intereses</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </section>\n");
      out.write("                <!-- end features Area -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- Footer -->\n");
      out.write("                <footer class=\"bg-dark text-center text-white\">\n");
      out.write("                    <!-- Grid container -->\n");
      out.write("                    <div class=\"container p-4\">\n");
      out.write("                        <!-- Section: Social media -->\n");
      out.write("                        <section class=\"mb-4\">\n");
      out.write("                            <!-- Facebook -->\n");
      out.write("                            <a class=\"btn btn-outline-light btn-floating m-1\" href=\"#!\" role=\"button\"\n");
      out.write("                               ><i class=\"fab fa-facebook-f\"></i\n");
      out.write("                                ></a>\n");
      out.write("\n");
      out.write("                            <!-- Twitter -->\n");
      out.write("                            <a class=\"btn btn-outline-light btn-floating m-1\" href=\"#!\" role=\"button\"\n");
      out.write("                               ><i class=\"fab fa-twitter\"></i\n");
      out.write("                                ></a>\n");
      out.write("\n");
      out.write("                            <!-- Google -->\n");
      out.write("                            <a class=\"btn btn-outline-light btn-floating m-1\" href=\"#!\" role=\"button\"\n");
      out.write("                               ><i class=\"fab fa-google\"></i\n");
      out.write("                                ></a>\n");
      out.write("\n");
      out.write("                            <!-- Instagram -->\n");
      out.write("                            <a class=\"btn btn-outline-light btn-floating m-1\" href=\"#!\" role=\"button\"\n");
      out.write("                               ><i class=\"fab fa-instagram\"></i\n");
      out.write("                                ></a>\n");
      out.write("\n");
      out.write("                            <!-- Linkedin -->\n");
      out.write("                            <a class=\"btn btn-outline-light btn-floating m-1\" href=\"#!\" role=\"button\"\n");
      out.write("                               ><i class=\"fab fa-linkedin-in\"></i\n");
      out.write("                                ></a>\n");
      out.write("\n");
      out.write("                            <!-- Github -->\n");
      out.write("                            <a class=\"btn btn-outline-light btn-floating m-1\" href=\"#!\" role=\"button\"\n");
      out.write("                               ><i class=\"fab fa-github\"></i\n");
      out.write("                                ></a>\n");
      out.write("                        </section>\n");
      out.write("                        <!-- Section: Social media -->\n");
      out.write("\n");
      out.write("                        <!-- Section: Form -->\n");
      out.write("                        <section class=\"\">\n");
      out.write("                            <form action=\"\">\n");
      out.write("                                <!--Grid row-->\n");
      out.write("                                <div class=\"row d-flex justify-content-center\">\n");
      out.write("                                    <!--Grid column-->\n");
      out.write("                                    <div class=\"col-auto\">\n");
      out.write("                                        <p class=\"pt-2\">\n");
      out.write("                                            <strong>Suscríbete a nuestras noticias</strong>\n");
      out.write("                                        </p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!--Grid column-->\n");
      out.write("\n");
      out.write("                                    <!--Grid column-->\n");
      out.write("                                    <div class=\"col-md-5 col-12\">\n");
      out.write("                                        <!-- Email input -->\n");
      out.write("                                        <div class=\"form-outline form-white mb-4\">\n");
      out.write("                                            <input type=\"email\" id=\"form5Example21\" class=\"form-control\" />\n");
      out.write("                                            <label class=\"form-label\" for=\"form5Example21\">Tú email</label>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!--Grid column-->\n");
      out.write("\n");
      out.write("                                    <!--Grid column-->\n");
      out.write("                                    <div class=\"col-auto\">\n");
      out.write("                                        <!-- Submit button -->\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-outline-light mb-4\">\n");
      out.write("                                            Suscribir\n");
      out.write("                                        </button>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!--Grid column-->\n");
      out.write("                                </div>\n");
      out.write("                                <!--Grid row-->\n");
      out.write("                            </form>\n");
      out.write("                        </section>\n");
      out.write("                        <!-- Section: Form -->\n");
      out.write("\n");
      out.write("                        <!-- Section: Text -->\n");
      out.write("                        <section class=\"mb-4\">\n");
      out.write("                            <p>\n");
      out.write("                                La fábrica de bicicletas San Diego nació en el año 1990 en la ciudad de Santiago como respuesta a \n");
      out.write("                                la creciente demanda de bicicletas de los habitantes de la capital, hoy, 31 años después bajo la\n");
      out.write("                                nueva marca \"Masterbike\" busca nuevamente ser protagonista del ciclismo nacional ofreciendo nuevos \n");
      out.write("                                servicios de acuerdo a las necesidades de los riders chilenos.\n");
      out.write("                            </p>\n");
      out.write("                        </section>\n");
      out.write("                        <!-- Section: Text -->\n");
      out.write("\n");
      out.write("                        <!-- Section: Links -->\n");
      out.write("                        <section class=\"\">\n");
      out.write("                            <!--Grid row-->\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <!--Grid column-->\n");
      out.write("                                <div class=\"col-lg-3 col-md-6 mb-4 mb-md-0\">\n");
      out.write("                                    <h5 class=\"text-uppercase\">Categorias</h5>\n");
      out.write("\n");
      out.write("                                    <ul class=\"list-unstyled mb-0\">\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"Controlador?accion=bicicletas\" class=\"text-white\">Bicicletas</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"Accesorio.jsp\" class=\"text-white\">Accesorios</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"Repuesto.jsp\" class=\"text-white\">Repuestos</a>\n");
      out.write("                                        </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                                <!--Grid column-->\n");
      out.write("\n");
      out.write("                                <!--Grid column-->\n");
      out.write("                                <div class=\"col-lg-3 col-md-6 mb-4 mb-md-0\">\n");
      out.write("                                    <h5 class=\"text-uppercase\">Representamos a</h5>\n");
      out.write("\n");
      out.write("                                    <ul class=\"list-unstyled mb-0\">\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"https://bike.shimano.com/\" class=\"text-white\">Shimano</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"https://www.ridefox.com/\" class=\"text-white\">Fox</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"https://www.sram.com/\" class=\"text-white\">Sram</a>\n");
      out.write("                                        </li>\n");
      out.write("\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                                <!--Grid column-->\n");
      out.write("\n");
      out.write("                                <!--Grid column-->\n");
      out.write("                                <div class=\"col-lg-3 col-md-6 mb-4 mb-md-0\">\n");
      out.write("                                    <h5 class=\"text-uppercase\">Atención al cliente</h5>\n");
      out.write("\n");
      out.write("                                    <ul class=\"list-unstyled mb-0\">\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"FormularioContacto.jsp\" class=\"text-white\">Contáctanos</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"TerminosCondiciones.jsp\" class=\"text-white\">Términos y condiciones</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"AvisoLegal.jsp\" class=\"text-white\">Aviso legal</a>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                                <!--Grid column-->\n");
      out.write("\n");
      out.write("                                <!--Grid column-->\n");
      out.write("                                <div class=\"col-lg-3 col-md-6 mb-4 mb-md-0\">\n");
      out.write("                                    <h5 class=\"text-uppercase\">Tu Masterbike</h5>\n");
      out.write("\n");
      out.write("                                    <ul class=\"list-unstyled mb-0\">\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"RegistroUsuario.jsp\" class=\"text-white\">Regístrate</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"Login.jsp\" class=\"text-white\">Iniciar sesión</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"Login.jsp\" class=\"text-white\">Seguimiento de envíos</a>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                                <!--Grid column-->\n");
      out.write("                            </div>\n");
      out.write("                            <!--Grid row-->\n");
      out.write("                        </section>\n");
      out.write("                        <!-- Section: Links -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Grid container -->\n");
      out.write("\n");
      out.write("                    <!-- Copyright -->\n");
      out.write("                    <div class=\"text-center p-3\" style=\"background-color: rgba(0, 0, 0, 0.2);\">\n");
      out.write("                    © 2021 Copyright:\n");
      out.write("                    <a class=\"text-white\" href=\"\">Sealsior</a>\n");
      out.write("                </div>\n");
      out.write("                <!-- Copyright -->\n");
      out.write("            </footer>\n");
      out.write("                <!-- Footer -->  \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- JavaScript -->\n");
      out.write("            <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("            <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\" integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\" crossorigin=\"anonymous\"></script>\n");
      out.write("            <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\" integrity=\"sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV\" crossorigin=\"anonymous\"></script>\n");
      out.write("        </body>\n");
      out.write("\n");
      out.write("    </html>\n");
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
        out.write("                                        ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                                            ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                                            ");
        if (_jspx_meth_c_when_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                                            ");
        if (_jspx_meth_c_when_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                                            ");
        if (_jspx_meth_c_when_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                            ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                        ");
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
        out.write("                                            <li class=\"nav-item active\"><a class=\"nav-link\" href=\"inicio.jsp\">Inicio</a></li>\n");
        out.write("                                            <li class=\"nav-item submenu dropdown\">\n");
        out.write("                                                <a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
        out.write("                                                   aria-expanded=\"false\">Comprar</a>\n");
        out.write("                                                <ul class=\"dropdown-menu\">\n");
        out.write("                                                    <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"Controlador?accion=bicicletas\">Bicicletas</a></li>\n");
        out.write("                                                    <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"Accesorio.jsp\">Accesorios</a></li>\n");
        out.write("                                                    <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"Repuesto.jsp\">Repuestos</a></li>\n");
        out.write("                                                    <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"Controlador?accion=home\">Todo</a></li>\n");
        out.write("                                                </ul>\n");
        out.write("                                            </li>\n");
        out.write("                                            <li class=\"nav-item submenu dropdown\">\n");
        out.write("                                                <a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
        out.write("                                                   aria-expanded=\"false\">Servicios</a>\n");
        out.write("                                                <ul class=\"dropdown-menu\">\n");
        out.write("                                                    <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ControladorMantencion\">Solicitud Taller</a></li>\n");
        out.write("                                                    <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"SolicitudArriendo.jsp\">Solicitud Arriendo</a></li>\n");
        out.write("\n");
        out.write("                                                </ul>\n");
        out.write("                                            </li>\n");
        out.write("                                            <li class=\"nav-item\">\n");
        out.write("                                                <a class=\"nav-link\" href=\"Controlador?accion=Carrito\"><i class=\"fas fa-cart-plus\"><label style=\"color: darkorange\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contador}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</label></i>Carrito</a>\n");
        out.write("                                                </li>\n");
        out.write("                                                <li class=\"nav-item submenu dropdown\">\n");
        out.write("                                                    <a href=\"login.html\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
        out.write("                                                       aria-expanded=\"false\">Mi Cuenta</a>\n");
        out.write("                                                    <ul class=\"dropdown-menu\">\n");
        out.write("                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\">Hola ");
        if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_0, _jspx_page_context))
          return true;
        out.write("</a></li>\n");
        out.write("                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ListarMantencionesPorUsuario.jsp\" >Mis mantenciones</a></li>\n");
        out.write("                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ListarArriendosPorUsuario.jsp\" >Mis arriendos</a></li>\n");
        out.write("                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"Controlador?accion=MisCompras\">Mis compras</a></li>\n");
        out.write("                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"MisDatos.jsp\" >Mis datos</a></li>\n");
        out.write("                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ControladorLogout\" style=\"color:red\">Cerrar Sesión</a></li>\n");
        out.write("                                                    </ul>\n");
        out.write("\n");
        out.write("\n");
        out.write("                                                </li>\n");
        out.write("\n");
        out.write("                                            ");
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
        out.write("                                                <li class=\"nav-item active\"><a class=\"nav-link\" href=\"inicio.jsp\">Inicio</a></li>\n");
        out.write("\n");
        out.write("                                                <li class=\"nav-item submenu dropdown\">\n");
        out.write("                                                    <a href=\"login.html\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
        out.write("                                                       aria-expanded=\"false\">Mi Cuenta</a>\n");
        out.write("                                                    <ul class=\"dropdown-menu\">\n");
        out.write("                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\">Hola ");
        if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("</a></li>\n");
        out.write("                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"MenuTrabajadores.jsp\">Corporativo</a></li>\n");
        out.write("\n");
        out.write("                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ControladorLogout\" style=\"color:red\">Cerrar Sesión</a></li>\n");
        out.write("                                                    </ul>\n");
        out.write("\n");
        out.write("\n");
        out.write("                                                </li>\n");
        out.write("\n");
        out.write("                                            ");
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
        out.write("                                                <li class=\"nav-item active\"><a class=\"nav-link\" href=\"inicio.jsp\">Inicio</a></li>\n");
        out.write("\n");
        out.write("                                                <li class=\"nav-item submenu dropdown\">\n");
        out.write("                                                    <a href=\"login.html\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
        out.write("                                                       aria-expanded=\"false\">Mi Cuenta</a>\n");
        out.write("                                                    <ul class=\"dropdown-menu\">\n");
        out.write("                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\">Hola ");
        if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_2, _jspx_page_context))
          return true;
        out.write("</a></li>\n");
        out.write("                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"MenuTrabajadores.jsp\">Corporativo</a></li>\n");
        out.write("                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ControladorLogout\" style=\"color:red\">Cerrar Sesión</a></li>\n");
        out.write("                                                    </ul>\n");
        out.write("\n");
        out.write("\n");
        out.write("                                                </li>\n");
        out.write("\n");
        out.write("\n");
        out.write("                                            ");
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
        out.write("                                                <li class=\"nav-item active\"><a class=\"nav-link\" href=\"inicio.jsp\">Inicio</a></li>\n");
        out.write("\n");
        out.write("\n");
        out.write("                                                <li class=\"nav-item submenu dropdown\">\n");
        out.write("                                                    <a href=\"login.html\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
        out.write("                                                       aria-expanded=\"false\">Mi Cuenta</a>\n");
        out.write("                                                    <ul class=\"dropdown-menu\">\n");
        out.write("                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\">Hola ");
        if (_jspx_meth_c_out_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_3, _jspx_page_context))
          return true;
        out.write("</a></li>\n");
        out.write("                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"MenuTrabajadores.jsp\">Corporativo</a></li>\n");
        out.write("\n");
        out.write("                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ControladorLogout\" style=\"color:red\">Cerrar Sesión</a></li>\n");
        out.write("                                                    </ul>\n");
        out.write("\n");
        out.write("\n");
        out.write("                                                </li>\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("                                            ");
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
        out.write("                                                <li class=\"nav-item active\"><a class=\"nav-link\" href=\"inicio.jsp\">Inicio</a></li>\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("                                                <li class=\"nav-item submenu dropdown\">\n");
        out.write("                                                    <a href=\"login.html\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
        out.write("                                                       aria-expanded=\"false\">Mi Cuenta</a>\n");
        out.write("                                                    <ul class=\"dropdown-menu\">\n");
        out.write("                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\">Hola ");
        if (_jspx_meth_c_out_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_4, _jspx_page_context))
          return true;
        out.write("</a></li>\n");
        out.write("                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"MenuTrabajadores.jsp\">Corporativo</a></li>\n");
        out.write("\n");
        out.write("                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ControladorLogout\" style=\"color:red\">Cerrar Sesión</a></li>\n");
        out.write("                                                    </ul>\n");
        out.write("\n");
        out.write("                                                </li>\n");
        out.write("\n");
        out.write("                                            ");
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
        out.write("                                                <li class=\"nav-item active\"><a class=\"nav-link\" href=\"inicio.jsp\">Inicio</a></li>\n");
        out.write("                                                <li class=\"nav-item submenu dropdown\">\n");
        out.write("                                                    <a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
        out.write("                                                       aria-expanded=\"false\">Productos</a>\n");
        out.write("                                                    <ul class=\"dropdown-menu\">\n");
        out.write("                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"Controlador?accion=bicicletas\">Bicicletas</a></li>\n");
        out.write("                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"Accesorio.jsp\">Accesorios</a></li>\n");
        out.write("                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"Repuesto.jsp\">Repuestos</a></li>\n");
        out.write("                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"Controlador?accion=home\">Todo</a></li>\n");
        out.write("                                                    </ul>\n");
        out.write("                                                </li>\n");
        out.write("\n");
        out.write("                                                <li class=\"nav-item\">\n");
        out.write("                                                    <a class=\"nav-link\" href=\"Controlador?accion=Carrito\"><i class=\"fas fa-cart-plus\"><label style=\"color: darkorange\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contador}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</label></i>Carrito</a>\n");
        out.write("                                                </li>\n");
        out.write("\n");
        out.write("                                                <li class=\"nav-item submenu dropdown\">\n");
        out.write("                                                    <a href=\"login.html\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
        out.write("                                                       aria-expanded=\"false\">Mi Cuenta</a>\n");
        out.write("                                                    <ul class=\"dropdown-menu\">\n");
        out.write("                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"Login.jsp\">Iniciar Sesión</a></li>\n");
        out.write("                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ControladorUsuario\">Regístrate</a></li>\n");
        out.write("\n");
        out.write("\n");
        out.write("                                                    </ul>\n");
        out.write("\n");
        out.write("\n");
        out.write("                                                </li>\n");
        out.write("\n");
        out.write("                                            ");
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
}
