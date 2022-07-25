package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MenuTrabajadores_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"path/to/font-awesome/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"https://kit.fontawesome.com/c747d09760.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" integrity=\"sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("        <style>     \n");
      out.write("            .container {\n");
      out.write("\n");
      out.write("\n");
      out.write("                text-align: center;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <style>\n");
      out.write("            /*Main CSS*/\n");
      out.write("\n");
      out.write("\n");
      out.write("            /*Login Signup Page*/\n");
      out.write("            a:focus,a:hover,a{\n");
      out.write("                outline:none;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("            li,ul{\n");
      out.write("                list-style: none;\n");
      out.write("                padding: 0;\n");
      out.write("                margin: 0;\n");
      out.write("            }\n");
      out.write("            .header-top i {\n");
      out.write("                font-size: 18px;\n");
      out.write("            }\n");
      out.write("            .bg-image {\n");
      out.write("                background: url(../images/background-login.jpg) no-repeat 0 0 / cover;\n");
      out.write("                position: relative;\n");
      out.write("                width: 100%;\n");
      out.write("                height: 100vh;\n");
      out.write("                display: table;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-header {\n");
      out.write("                display: inline-block;\n");
      out.write("                width: 100%;\n");
      out.write("                background: #0e1a35;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-signup {\n");
      out.write("                display: table-cell;\n");
      out.write("                vertical-align: middle;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-logo img {\n");
      out.write("                cursor: pointer;\n");
      out.write("                max-width: 171px;\n");
      out.write("                padding: 23px 15px 22px;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-header .navbar-right {\n");
      out.write("                margin-right: 0px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-header .nav-tabs > li.active > a,\n");
      out.write("            .login-header .nav-tabs > li.active > a:focus,\n");
      out.write("            .login-header .nav-tabs > li.active > a:hover {\n");
      out.write("                background-color: transparent;\n");
      out.write("                border: none;\n");
      out.write("                color: #fff;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-header .nav-tabs > li > a {\n");
      out.write("                border: medium none;\n");
      out.write("                border-radius: 0;\n");
      out.write("                font-size: 14px;\n");
      out.write("                font-weight: 500;\n");
      out.write("                line-height: 48px;\n");
      out.write("                padding: 15px 30px;\n");
      out.write("                color: #fff;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-header .nav-tabs {\n");
      out.write("                border-bottom: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-header .nav-tabs > li {\n");
      out.write("                margin-bottom: 0px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-header .nav > li > a:focus,\n");
      out.write("            .login-header .nav > li > a:hover {\n");
      out.write("                background: none;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-header .nav-tabs > li.active {\n");
      out.write("                border-bottom: 6px solid #5584ff;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-inner h1 {\n");
      out.write("                color: #8492af;\n");
      out.write("                font-size: 48px;\n");
      out.write("                font-weight: 300;\n");
      out.write("                text-align: center;\n");
      out.write("                margin-top: 0;\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-inner h1 span {\n");
      out.write("                color: #5584ff;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-form {\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-form input {\n");
      out.write("                -moz-border-bottom-colors: none;\n");
      out.write("                -moz-border-left-colors: none;\n");
      out.write("                -moz-border-right-colors: none;\n");
      out.write("                -moz-border-top-colors: none;\n");
      out.write("                background: rgba(0, 0, 0, 0) none repeat scroll 0 0;\n");
      out.write("                border-color: -moz-use-text-color -moz-use-text-color #d4d9e3;\n");
      out.write("                border-image: none;\n");
      out.write("                border-style: none none solid;\n");
      out.write("                border-width: medium medium 1px;\n");
      out.write("                font-size: 13px;\n");
      out.write("                font-weight: 300;\n");
      out.write("                width: 100%;\n");
      out.write("                color: #8492af;\n");
      out.write("                padding: 15px 50px;\n");
      out.write("                font-size: 17px;\n");
      out.write("                max-width: 550px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-form label {\n");
      out.write("                margin-bottom: 30px;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .user input {\n");
      out.write("                background: rgba(0, 0, 0, 0) url(\"../images/user.png\") no-repeat scroll 7px 12px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .pass input {\n");
      out.write("                background: rgba(0, 0, 0, 0) url(\"../images/password.png\") no-repeat scroll 7px 12px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .mail input {\n");
      out.write("                background: rgba(0, 0, 0, 0) url(\"../images/mail.png\") no-repeat scroll 4px 12px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-signup .tab-content {\n");
      out.write("                background: #ffffff none repeat scroll 0 0;\n");
      out.write("                box-shadow: 0 6px 12px rgba(0, 0, 0, 0.176);\n");
      out.write("                display: inline-block;\n");
      out.write("                margin-top: -8px;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-btn {\n");
      out.write("                background: #5584ff none repeat scroll 0 0;\n");
      out.write("                border: medium none;\n");
      out.write("                border-radius: 100px;\n");
      out.write("                color: #ffffff;\n");
      out.write("                font-weight: 400;\n");
      out.write("                max-width: 250px;\n");
      out.write("                padding: 10px 0;\n");
      out.write("                position: relative;\n");
      out.write("                width: 100%;\n");
      out.write("                margin: 40px 0;\n");
      out.write("                box-shadow: 0 2px 8px #d2d2d2;\n");
      out.write("                -moz-box-shadow: 0 2px 8px #d2d2d2;\n");
      out.write("                -webkit-box-shadow: 0 2px 8px #d2d2d2;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-btn::before {\n");
      out.write("                content: \"\";\n");
      out.write("                font-family: FontAwesome;\n");
      out.write("                position: absolute;\n");
      out.write("                right: 17px;\n");
      out.write("                top: 9px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-details {\n");
      out.write("                padding: 35px 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .tab-content .tab-pane {\n");
      out.write("                padding: 70px 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            /*Login Signup Page*/\n");
      out.write("\n");
      out.write("\n");
      out.write("            /*Home Page*/\n");
      out.write("\n");
      out.write("            .home {\n");
      out.write("                background: #f6f7fa;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #navigation {\n");
      out.write("                background: #212429;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #navigation {\n");
      out.write("                padding: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .display-table {\n");
      out.write("                display: table;\n");
      out.write("                padding: 0;\n");
      out.write("                height: 100%;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .display-table-row {\n");
      out.write("                display: table-row;\n");
      out.write("                height: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .display-table-cell {\n");
      out.write("                display: table-cell;\n");
      out.write("                float: none;\n");
      out.write("                height: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .v-align {\n");
      out.write("                vertical-align: top;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .logo img {\n");
      out.write("                max-width: 180px;\n");
      out.write("                padding: 16px 0 17px;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .header-top {\n");
      out.write("                margin: 0;\n");
      out.write("                padding-top: 2px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .header-top img {\n");
      out.write("                border-radius: 50%;\n");
      out.write("                max-width: 48px !important;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .add-project {\n");
      out.write("                background: #5584ff none repeat scroll 0 0;\n");
      out.write("                border-radius: 100px;\n");
      out.write("                color: #ffffff;\n");
      out.write("                font-size: 14px;\n");
      out.write("                font-weight: 600;\n");
      out.write("                padding: 10px 27px 10px 45px;\n");
      out.write("                position: relative;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .header-rightside .nav > li > a:focus,\n");
      out.write("            .header-rightside .nav > li > a:hover {\n");
      out.write("                background: none;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .add-project::before {\n");
      out.write("                background: rgba(0, 0, 0, 0) url(\"../images/plus.png\") no-repeat scroll 0 0;\n");
      out.write("                content: \"\";\n");
      out.write("                ;\n");
      out.write("                height: 12px;\n");
      out.write("                left: 17px;\n");
      out.write("                position: absolute;\n");
      out.write("                top: 12px;\n");
      out.write("                width: 12px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .add-project:hover {\n");
      out.write("                color: #ffffff;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .header-top i {\n");
      out.write("                color: #0e1a35;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .icon-info {\n");
      out.write("                position: relative;\n");
      out.write("            }\n");
      out.write("            .navi i {\n");
      out.write("                font-size: 20px;\n");
      out.write("            }\n");
      out.write("            .label.label-primary {\n");
      out.write("                border-radius: 50%;\n");
      out.write("                font-size: 9px;\n");
      out.write("                left: 8px;\n");
      out.write("                position: absolute;\n");
      out.write("                top: -9px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .icon-info .label {\n");
      out.write("                border: 2px solid #ffffff;\n");
      out.write("                font-weight: 500;\n");
      out.write("                padding: 3px 5px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .header-top li {\n");
      out.write("                display: inline-block;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .header-top .dropdown-toggle {\n");
      out.write("                color: #0e1a35;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .header-top .dropdown-menu {\n");
      out.write("                border: medium none;\n");
      out.write("                left: -85px;\n");
      out.write("                padding: 17px;\n");
      out.write("            }\n");
      out.write("            .view {\n");
      out.write("                background: #5584ff none repeat scroll 0 0;\n");
      out.write("                border-radius: 100px;\n");
      out.write("                color: #ffffff;\n");
      out.write("                display: inline-block;\n");
      out.write("                font-size: 14px;\n");
      out.write("                font-weight: 600;\n");
      out.write("                margin-top: 10px;\n");
      out.write("                padding: 10px 15px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .navbar-content > span {\n");
      out.write("                font-size: 13px;\n");
      out.write("                font-weight: 700;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .img-responsive {\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("            #navigation{\n");
      out.write("                -webkit-transition: all 0.5s ease;\n");
      out.write("                -moz-transition: all 0.5s ease;\n");
      out.write("                -o-transition: all 0.5s ease;\n");
      out.write("                transition: all 0.5s ease;\n");
      out.write("            }\n");
      out.write("            .search input {\n");
      out.write("                border: none;\n");
      out.write("                font-size: 15px;\n");
      out.write("                padding: 15px 9px;\n");
      out.write("                width: 100%;\n");
      out.write("                background: rgba(0, 0, 0, 0) url(\"../images/search.png\") no-repeat scroll 99% 12px;\n");
      out.write("                color: #8492af;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /*header {\n");
      out.write("                background: #ffffff none repeat scroll 0 0;\n");
      out.write("                box-shadow: 0 1px 12px rgba(0, 0, 0, 0.04);\n");
      out.write("                display: inline-block !important;\n");
      out.write("                line-height: 23px;\n");
      out.write("                padding: 15px;\n");
      out.write("                transition: all 0.5s ease 0s;\n");
      out.write("                width: 100%;\n");
      out.write("                -webkit-transition: all 0.5s ease;\n");
      out.write("                -moz-transition: all 0.5s ease;\n");
      out.write("                -o-transition: all 0.5s ease;\n");
      out.write("                transition: all 0.5s ease;\n");
      out.write("            }*/\n");
      out.write("\n");
      out.write("            .logo {\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .navi a {\n");
      out.write("                border-bottom: 1px solid #0d172e;\n");
      out.write("                border-top: 1px solid #0d172e;\n");
      out.write("                color: #ffffff;\n");
      out.write("                display: block;\n");
      out.write("                font-size: 17px;\n");
      out.write("                font-weight: 500;\n");
      out.write("                padding: 28px 20px;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .navi i {\n");
      out.write("                margin-right: 15px;\n");
      out.write("                color: #f6f7fa;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .navi .active a {\n");
      out.write("                background: #676767;\n");
      out.write("                border-left: 5px solid #676767;\n");
      out.write("                padding-left: 15px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .navi a:hover {\n");
      out.write("                background: #676767 none repeat scroll 0 0;\n");
      out.write("                border-left: 5px solid #676767;\n");
      out.write("                display: block;\n");
      out.write("                padding-left: 15px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .navbar-default {\n");
      out.write("                background-color: #ffffff;\n");
      out.write("                border-color: #ffffff;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .navbar-toggle {\n");
      out.write("                border: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .navbar-default .navbar-toggle:focus,\n");
      out.write("            .navbar-default .navbar-toggle:hover {\n");
      out.write("                background-color: rgba(0, 0, 0, 0);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .navbar-default .navbar-toggle .icon-bar {\n");
      out.write("                background-color: #0e1a35;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .circle-logo {\n");
      out.write("                margin: 0 auto;\n");
      out.write("                max-width: 30px !important;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            .hidden-xs{\n");
      out.write("                -webkit-transition: all 0.5s ease;\n");
      out.write("                -moz-transition: all 0.5s ease;\n");
      out.write("                -o-transition: all 0.5s ease;\n");
      out.write("                transition: all 0.5s ease;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .user-dashboard {\n");
      out.write("                padding: 0 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .user-dashboard h1 {\n");
      out.write("                color: #0e1a35;\n");
      out.write("                font-size: 30px;\n");
      out.write("                font-weight: 500;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 21px 0;\n");
      out.write("            }\n");
      out.write("            .sales {\n");
      out.write("                background: #ffffff none repeat scroll 0 0;\n");
      out.write("                border: 1px solid #d4d9e3;\n");
      out.write("                display: inline-block;\n");
      out.write("                padding: 15px;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("            .sales button {\n");
      out.write("                background: rgba(0, 0, 0, 0) none repeat scroll 0 0;\n");
      out.write("                border: 1px solid #dadee7;\n");
      out.write("                border-radius: 100px;\n");
      out.write("                font-size: 15px;\n");
      out.write("                letter-spacing: 0.5px;\n");
      out.write("                padding-right: 32px;\n");
      out.write("                color: #0e1a35;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .sales button::before {\n");
      out.write("                content: \"\";\n");
      out.write("                font-family: FontAwesome;\n");
      out.write("                position: absolute;\n");
      out.write("                right: 12px;\n");
      out.write("                top: 11px;\n");
      out.write("            }\n");
      out.write("            .sales  .btn-group {\n");
      out.write("                float: right;\n");
      out.write("            }\n");
      out.write("            .sales h2 {\n");
      out.write("                color: #8492af;\n");
      out.write("                float: left;\n");
      out.write("                font-size: 21px;\n");
      out.write("                font-weight: 600;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 9px 0 0;\n");
      out.write("            }\n");
      out.write("            .btn.btn-secondary.btn-lg.dropdown-toggle > span {\n");
      out.write("                font-size: 15px;\n");
      out.write("                font-weight: 600;\n");
      out.write("                letter-spacing: 0.5px;\n");
      out.write("            }\n");
      out.write("            .sales .dropdown-menu{\n");
      out.write("                margin: 0px;\n");
      out.write("                padding: 0px;\n");
      out.write("                border: 0px;\n");
      out.write("                border-radius: 8px;\n");
      out.write("                width: 100%;\n");
      out.write("                color: #0e1a35;\n");
      out.write("            }\n");
      out.write("            .sales .btn-group.open .dropdown-toggle, .btn.active, .btn:active{\n");
      out.write("                box-shadow: none;\n");
      out.write("            }\n");
      out.write("            .sales .dropdown-menu > a {\n");
      out.write("                color: #0e1a35;\n");
      out.write("                display: inline-block;\n");
      out.write("                font-weight: 800;\n");
      out.write("                padding: 9px 0;\n");
      out.write("                text-align: center;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("            #my-cool-chart svg {\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("            .sales .dropdown-menu > a:hover{\n");
      out.write("                color: #5584FF;   \n");
      out.write("            }\n");
      out.write("            .shield-buttons {\n");
      out.write("                display: none;\n");
      out.write("            }\n");
      out.write("            .close, .close:focus, .close:hover {\n");
      out.write("                color: #fff;;\n");
      out.write("                opacity: 1;\n");
      out.write("                text-shadow: none;\n");
      out.write("            }\n");
      out.write("            .modal-body input {\n");
      out.write("                border: 1px solid #d4d9e3;\n");
      out.write("                font-size: 14px;\n");
      out.write("                font-weight: 300;\n");
      out.write("                margin: 5px 0;\n");
      out.write("                padding: 14px 10px;\n");
      out.write("                width: 100%;\n");
      out.write("                color: #8492af;\n");
      out.write("            }\n");
      out.write("            .modal-body textarea {\n");
      out.write("                border: 1px solid #d4d9e3;\n");
      out.write("                font-size: 14px;\n");
      out.write("                font-weight: 300;\n");
      out.write("                height: 200px;\n");
      out.write("                margin-top: 5px;\n");
      out.write("                padding: 9px 10px;\n");
      out.write("                width: 100%;\n");
      out.write("                color: #8492af;\n");
      out.write("            }\n");
      out.write("            .modal-header.login-header h4 {\n");
      out.write("                color: #ffffff;\n");
      out.write("            }\n");
      out.write("            .modal-footer .add-project {\n");
      out.write("                background: #5584ff none repeat scroll 0 0;\n");
      out.write("                border: medium none;\n");
      out.write("                border-radius: 100px;\n");
      out.write("                color: #ffffff;\n");
      out.write("                font-size: 14px;\n");
      out.write("                font-weight: 600;\n");
      out.write("                padding: 10px 30px;\n");
      out.write("                position: relative;\n");
      out.write("            }\n");
      out.write("            .modal-footer .add-project::before{display: none;}\n");
      out.write("            .modal-footer {\n");
      out.write("                border: 0 none;\n");
      out.write("                padding: 10px 15px 26px;\n");
      out.write("                text-align: right;\n");
      out.write("            }\n");
      out.write("            .cancel {\n");
      out.write("                background: #0E1A35     ;\n");
      out.write("                border: medium none;\n");
      out.write("                border-radius: 100px;\n");
      out.write("                color: #ffffff;\n");
      out.write("                font-size: 14px;\n");
      out.write("                font-weight: 600;\n");
      out.write("                padding: 10px 30px;\n");
      out.write("                position: relative;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .modal{\n");
      out.write("                top: 20%; \n");
      out.write("            }\n");
      out.write("            .modal-header .close {\n");
      out.write("                margin-top: 2px;\n");
      out.write("            }\n");
      out.write("            .search input:focus{\n");
      out.write("                border-bottom: 1px solid #BDC4D4;\n");
      out.write("                line-height:22px;\n");
      out.write("                transition: 0.1s all;\n");
      out.write("            }\n");
      out.write("            .modal-header.login-header {\n");
      out.write("                border-top-left-radius: 5px;\n");
      out.write("                border-top-right-radius: 5px;\n");
      out.write("                /*Main CSS*/\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                @media only screen and (max-device-width: 767px) {\n");
      out.write("                    .login-logo img {\n");
      out.write("                        margin: 0 auto;\n");
      out.write("                    }\n");
      out.write("                    .login-details .nav-tabs > li {\n");
      out.write("                        text-align: center;\n");
      out.write("                        width: 50%;\n");
      out.write("                    }\n");
      out.write("                    .login-signup .login-inner h1 {\n");
      out.write("                        font-size: 26px;\n");
      out.write("                        margin-bottom: 0;\n");
      out.write("                        margin-top: 10px;\n");
      out.write("                    }\n");
      out.write("                    .login-inner .login-form input {\n");
      out.write("                        font-size: 15px;\n");
      out.write("                        max-width: 100%;\n");
      out.write("                        padding: 15px 45px;\n");
      out.write("                    }\n");
      out.write("                    .login-inner .form-details {\n");
      out.write("                        padding: 25px;\n");
      out.write("                    }\n");
      out.write("                    .login-inner .login-form label {\n");
      out.write("                        margin-bottom: 20px;\n");
      out.write("                        width: 100%;\n");
      out.write("                    }\n");
      out.write("                    .login-inner .form-btn {\n");
      out.write("                        margin: 0;\n");
      out.write("                        max-width: 180px;\n");
      out.write("                    }\n");
      out.write("                    .tab-content .tab-pane {\n");
      out.write("                        padding: 20px 0;\n");
      out.write("                    }\n");
      out.write("                    #navigation .navi a {\n");
      out.write("                        font-size: 14px;\n");
      out.write("                        padding: 20px;\n");
      out.write("                        text-align: center;\n");
      out.write("                    }\n");
      out.write("                    #navigation .navi i {\n");
      out.write("                        margin-right: 0px;\n");
      out.write("                    }\n");
      out.write("                    #navigation .navi a:hover,\n");
      out.write("                        #navigation .navi .active a {\n");
      out.write("                        background: #122143 none repeat scroll 0 0;\n");
      out.write("                        border-left: none;\n");
      out.write("                        display: block;\n");
      out.write("                        padding-left: 20px;\n");
      out.write("                    }\n");
      out.write("                    header .header-top img {\n");
      out.write("                        max-width: 38px !important;\n");
      out.write("                    }\n");
      out.write("                    .v-align header {\n");
      out.write("                        padding: 12px 15px;\n");
      out.write("                    }\n");
      out.write("                    header .header-top li {\n");
      out.write("                        padding-left: 13px;\n");
      out.write("                        padding-right: 6px;\n");
      out.write("                    }\n");
      out.write("                    .navbar-default .navbar-toggle {\n");
      out.write("                        border-color: rgba(0, 0, 0, 0);\n");
      out.write("                    }\n");
      out.write("                    .navbar-header .navbar-toggle {\n");
      out.write("                        float: left;\n");
      out.write("                        margin: 0;\n");
      out.write("                        padding: 0;\n");
      out.write("                        top: 12px;\n");
      out.write("                    }\n");
      out.write("                    button,\n");
      out.write("                    html [type=\"button\"],\n");
      out.write("                    [type=\"reset\"],\n");
      out.write("                    [type=\"submit\"] {\n");
      out.write("                        outline: medium none;\n");
      out.write("                    }\n");
      out.write("                    .user-dashboard .sales h2 {\n");
      out.write("                        color: #8492af;\n");
      out.write("                        float: left;\n");
      out.write("                        font-size: 14px;\n");
      out.write("                        font-weight: 600;\n");
      out.write("                        margin: 0;\n");
      out.write("                        padding: 13px 0 0;\n");
      out.write("                    }\n");
      out.write("                    .user-dashboard .btn.btn-secondary.btn-lg.dropdown-toggle > span {\n");
      out.write("                        font-size: 11px;\n");
      out.write("                    }\n");
      out.write("                    .user-dashboard .sales button {\n");
      out.write("                        font-size: 11px;\n");
      out.write("                        padding-right: 23px;\n");
      out.write("                    }  \n");
      out.write("                    .user-dashboard .sales h2 {\n");
      out.write("                        font-size: 12px;\n");
      out.write("                    }\n");
      out.write("                    .gutter{\n");
      out.write("                        padding: 0;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("\n");
      out.write("                    @media only screen and (max-device-width: 992px) {\n");
      out.write("                        header .header-top li {\n");
      out.write("                            padding-left: 20px !important;\n");
      out.write("                            padding-right: 0;\n");
      out.write("                        }\n");
      out.write("                        header .logo img {\n");
      out.write("                            max-width: 125px !important;\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    @media only screen and (min-device-width: 767px) and (max-device-width: 998px){\n");
      out.write("                        .user-dashboard .header-top {\n");
      out.write("                            padding-top: 5px;\n");
      out.write("                        }\n");
      out.write("                        .user-dashboard .header-rightside {\n");
      out.write("                            display: inline-block;\n");
      out.write("                            float: left;\n");
      out.write("                            width: 100%;\n");
      out.write("                        }\n");
      out.write("                        .user-dashboard .header-rightside .header-top img {\n");
      out.write("                            max-width: 41px !important;\n");
      out.write("                        } \n");
      out.write("                        .user-dashboard .sales button {\n");
      out.write("                            font-size: 10px;\n");
      out.write("                        }\n");
      out.write("                        .user-dashboard .btn.btn-secondary.btn-lg.dropdown-toggle > span {\n");
      out.write("                            font-size: 12px;\n");
      out.write("                        }\n");
      out.write("                        .user-dashboard .sales h2 {\n");
      out.write("                            font-size: 15px;\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                    @media only screen and (min-device-width:998px) and (max-device-width: 1350px){\n");
      out.write("                        #navigation .logo img {\n");
      out.write("                            max-width: 130px;\n");
      out.write("                            padding: 16px 0 17px;\n");
      out.write("                            width: 100%;\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                </style>\n");
      out.write("                <title>Masterbike</title>\n");
      out.write("\n");
      out.write("            </head>\n");
      out.write("\n");
      out.write("            <body class=\"home\">\n");
      out.write("\n");
      out.write("                <!-- Start Header Area -->\n");
      out.write("                <header class=\"header_area sticky-header\">\n");
      out.write("                    <div class=\"main_menu\">\n");
      out.write("                        <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark main_box\" >\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                                <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                                <a class=\"navbar-brand logo_h\" href=\"inicio.jsp\"><img src=\"https://i.ibb.co/CH3Ln98/logo.png\" alt=\"\"></a>\n");
      out.write("                                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\"\n");
      out.write("                                        aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                                    <span class=\"icon-bar\"></span>\n");
      out.write("                                    <span class=\"icon-bar\"></span>\n");
      out.write("                                    <span class=\"icon-bar\"></span>\n");
      out.write("                                </button>\n");
      out.write("                                <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                                <div class=\"collapse navbar-collapse offset\" id=\"navbarSupportedContent\">\n");
      out.write("                                    <ul class=\"nav navbar-nav menu_nav ml-auto\">\n");
      out.write("                                        ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                                        </ul>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </nav>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </header>\n");
      out.write("                    <!-- End Header Area -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"container-fluid display-table\">\n");
      out.write("                        <div class=\"row display-table-row\">\n");
      out.write("                            ");
      if (_jspx_meth_c_choose_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                                <br>\n");
      out.write("                                <br>\n");
      out.write("                                <h2 class=\"w3-wide w3-center text-center\" >Insertar aqui dentro las cosas</h2>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <!-- Footer -->\n");
      out.write("                    <footer class=\"bg-dark text-center text-white\">\n");
      out.write("                        <!-- Grid container -->\n");
      out.write("                        <div class=\"container p-4\">\n");
      out.write("                            <!-- Section: Social media -->\n");
      out.write("                            <section class=\"mb-4\">\n");
      out.write("                                <!-- Facebook -->\n");
      out.write("                                <a class=\"btn btn-outline-light btn-floating m-1\" href=\"#!\" role=\"button\"\n");
      out.write("                                   ><i class=\"fab fa-facebook-f\"></i\n");
      out.write("                                    ></a>\n");
      out.write("\n");
      out.write("                                <!-- Twitter -->\n");
      out.write("                                <a class=\"btn btn-outline-light btn-floating m-1\" href=\"#!\" role=\"button\"\n");
      out.write("                                   ><i class=\"fab fa-twitter\"></i\n");
      out.write("                                    ></a>\n");
      out.write("\n");
      out.write("                                <!-- Google -->\n");
      out.write("                                <a class=\"btn btn-outline-light btn-floating m-1\" href=\"#!\" role=\"button\"\n");
      out.write("                                   ><i class=\"fab fa-google\"></i\n");
      out.write("                                    ></a>\n");
      out.write("\n");
      out.write("                                <!-- Instagram -->\n");
      out.write("                                <a class=\"btn btn-outline-light btn-floating m-1\" href=\"#!\" role=\"button\"\n");
      out.write("                                   ><i class=\"fab fa-instagram\"></i\n");
      out.write("                                    ></a>\n");
      out.write("\n");
      out.write("                                <!-- Linkedin -->\n");
      out.write("                                <a class=\"btn btn-outline-light btn-floating m-1\" href=\"#!\" role=\"button\"\n");
      out.write("                                   ><i class=\"fab fa-linkedin-in\"></i\n");
      out.write("                                    ></a>\n");
      out.write("\n");
      out.write("                                <!-- Github -->\n");
      out.write("                                <a class=\"btn btn-outline-light btn-floating m-1\" href=\"#!\" role=\"button\"\n");
      out.write("                                   ><i class=\"fab fa-github\"></i\n");
      out.write("                                    ></a>\n");
      out.write("                            </section>\n");
      out.write("                            <!-- Section: Social media -->\n");
      out.write("\n");
      out.write("                            <!-- Section: Form -->\n");
      out.write("                            <section class=\"\">\n");
      out.write("                                <form action=\"\">\n");
      out.write("                                    <!--Grid row-->\n");
      out.write("                                    <div class=\"row d-flex justify-content-center\">\n");
      out.write("                                        <!--Grid column-->\n");
      out.write("                                        <div class=\"col-auto\">\n");
      out.write("                                            <p class=\"pt-2\">\n");
      out.write("                                                <strong>Suscribete a nuestras noticias</strong>\n");
      out.write("                                            </p>\n");
      out.write("                                        </div>\n");
      out.write("                                        <!--Grid column-->\n");
      out.write("\n");
      out.write("                                        <!--Grid column-->\n");
      out.write("                                        <div class=\"col-md-5 col-12\">\n");
      out.write("                                            <!-- Email input -->\n");
      out.write("                                            <div class=\"form-outline form-white mb-4\">\n");
      out.write("                                                <input type=\"email\" id=\"form5Example21\" class=\"form-control\" />\n");
      out.write("                                                <label class=\"form-label\" for=\"form5Example21\">Tu email</label>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <!--Grid column-->\n");
      out.write("\n");
      out.write("                                        <!--Grid column-->\n");
      out.write("                                        <div class=\"col-auto\">\n");
      out.write("                                            <!-- Submit button -->\n");
      out.write("                                            <button type=\"submit\" class=\"btn btn-outline-light mb-4\">\n");
      out.write("                                                Suscribir\n");
      out.write("                                            </button>\n");
      out.write("                                        </div>\n");
      out.write("                                        <!--Grid column-->\n");
      out.write("                                    </div>\n");
      out.write("                                    <!--Grid row-->\n");
      out.write("                                </form>\n");
      out.write("                            </section>\n");
      out.write("                            <!-- Section: Form -->\n");
      out.write("\n");
      out.write("                            <!-- Section: Text -->\n");
      out.write("                            <section class=\"mb-4\">\n");
      out.write("                                <p>\n");
      out.write("                                    La fabrica de bicicletas San Diego nacio en el año 1990 en la ciudad de Santiago como respuesta a \n");
      out.write("                                    la cresciente demanda de bicicletas de los habitantes de la capital, hoy, 31 años despúes bajo la\n");
      out.write("                                    nueva marca \"Masterbik\" busca nuevamente ser protagonista del ciclismo nacional ofreciendo nuevos \n");
      out.write("                                    servicios de acuerdo a las necesidades de los riders chilenos.\n");
      out.write("                                </p>\n");
      out.write("                            </section>\n");
      out.write("                            <!-- Section: Text -->\n");
      out.write("\n");
      out.write("                            <!-- Section: Links -->\n");
      out.write("                            <section class=\"\">\n");
      out.write("                                <!--Grid row-->\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <!--Grid column-->\n");
      out.write("                                    <div class=\"col-lg-3 col-md-6 mb-4 mb-md-0\">\n");
      out.write("                                        <h5 class=\"text-uppercase\">Categorias</h5>\n");
      out.write("\n");
      out.write("                                        <ul class=\"list-unstyled mb-0\">\n");
      out.write("                                            <li>\n");
      out.write("                                                <a href=\"#!\" class=\"text-white\">Nuestros productos</a>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li>\n");
      out.write("                                                <a href=\"ControladorMantencion\" class=\"text-white\">Taller de bicicletas</a>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li>\n");
      out.write("                                                <a href=\"SolicitudArriendo.jsp\" class=\"text-white\">Arriendo de bicicletas</a>\n");
      out.write("                                            </li>\n");
      out.write("\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!--Grid column-->\n");
      out.write("\n");
      out.write("                                    <!--Grid column-->\n");
      out.write("                                    <div class=\"col-lg-3 col-md-6 mb-4 mb-md-0\">\n");
      out.write("                                        <h5 class=\"text-uppercase\">Nuestros socios</h5>\n");
      out.write("\n");
      out.write("                                        <ul class=\"list-unstyled mb-0\">\n");
      out.write("                                            <li>\n");
      out.write("                                                <a href=\"https://bike.shimano.com/\" class=\"text-white\">Shimano</a>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li>\n");
      out.write("                                                <a href=\"https://www.ridefox.com/\" class=\"text-white\">Fox</a>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li>\n");
      out.write("                                                <a href=\"https://www.sram.com/\" class=\"text-white\">Sram</a>\n");
      out.write("                                            </li>\n");
      out.write("\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!--Grid column-->\n");
      out.write("\n");
      out.write("                                    <!--Grid column-->\n");
      out.write("                                    <div class=\"col-lg-3 col-md-6 mb-4 mb-md-0\">\n");
      out.write("                                        <h5 class=\"text-uppercase\">Atención al cliente</h5>\n");
      out.write("\n");
      out.write("                                        <ul class=\"list-unstyled mb-0\">\n");
      out.write("                                            <li>\n");
      out.write("                                                <a href=\"FormularioContacto.jsp\" class=\"text-white\">Contáctanos</a>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li>\n");
      out.write("                                                <a href=\"TerminosCondiciones.jsp\" class=\"text-white\">Terminos y condiciones</a>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li>\n");
      out.write("                                                <a href=\"#!\" class=\"text-white\">Seguimiento de envios</a>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li>\n");
      out.write("                                                <a href=\"AvisoLegal.jsp\" class=\"text-white\">Aviso legal</a>\n");
      out.write("                                            </li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!--Grid column-->\n");
      out.write("\n");
      out.write("                                    <!--Grid column-->\n");
      out.write("                                    <div class=\"col-lg-3 col-md-6 mb-4 mb-md-0\">\n");
      out.write("                                        <h5 class=\"text-uppercase\">Links</h5>\n");
      out.write("\n");
      out.write("                                        <ul class=\"list-unstyled mb-0\">\n");
      out.write("                                            <li>\n");
      out.write("                                                <a href=\"#!\" class=\"text-white\">Link 1</a>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li>\n");
      out.write("                                                <a href=\"#!\" class=\"text-white\">Link 2</a>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li>\n");
      out.write("                                                <a href=\"#!\" class=\"text-white\">Link 3</a>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li>\n");
      out.write("                                                <a href=\"#!\" class=\"text-white\">Link 4</a>\n");
      out.write("                                            </li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!--Grid column-->\n");
      out.write("                                </div>\n");
      out.write("                                <!--Grid row-->\n");
      out.write("                            </section>\n");
      out.write("                            <!-- Section: Links -->\n");
      out.write("                        </div>\n");
      out.write("                        <!-- Grid container -->\n");
      out.write("\n");
      out.write("                        <!-- Copyright -->\n");
      out.write("                        <div class=\"text-center p-3\" style=\"background-color: rgba(0, 0, 0, 0.2);\">\n");
      out.write("                        © 2021 Copyright:\n");
      out.write("                        <a class=\"text-white\" href=\"\">Sealsior</a>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Copyright -->\n");
      out.write("                </footer>\n");
      out.write("                <!-- Footer -->  \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- JavaScript -->\n");
      out.write("                <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("                <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\" integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\" crossorigin=\"anonymous\"></script>\n");
      out.write("                <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\" integrity=\"sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV\" crossorigin=\"anonymous\"></script>\n");
      out.write("            </body>\n");
      out.write("\n");
      out.write("        </html>\n");
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
        out.write("                                            ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                                                ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                                                ");
        if (_jspx_meth_c_when_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                                                ");
        if (_jspx_meth_c_when_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                                                ");
        if (_jspx_meth_c_when_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                            ");
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
        out.write("                                                <li class=\"nav-item active\"><a class=\"nav-link\" href=\"inicio.jsp\">Inicio</a></li>\n");
        out.write("                                                <li class=\"nav-item submenu dropdown\">\n");
        out.write("                                                    <a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
        out.write("                                                       aria-expanded=\"false\">Comprar</a>\n");
        out.write("                                                    <ul class=\"dropdown-menu\">\n");
        out.write("                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"Controlador?accion=bicicletas\">Bicicletas</a></li>\n");
        out.write("                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"Accesorio.jsp\">Accesorios</a></li>\n");
        out.write("                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"Repuesto.jsp\">Repuestos</a></li>\n");
        out.write("                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"Controlador?accion=home\">Todo</a></li>\n");
        out.write("                                                    </ul>\n");
        out.write("                                                </li>\n");
        out.write("                                                <li class=\"nav-item submenu dropdown\">\n");
        out.write("                                                    <a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
        out.write("                                                       aria-expanded=\"false\">Servicios</a>\n");
        out.write("                                                    <ul class=\"dropdown-menu\">\n");
        out.write("                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ControladorMantencion\">Solicitud Taller</a></li>\n");
        out.write("                                                        <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"SolicitudArriendo.jsp\">Solicitud Arriendo</a></li>\n");
        out.write("\n");
        out.write("                                                    </ul>\n");
        out.write("                                                </li>\n");
        out.write("                                                <li class=\"nav-item\">\n");
        out.write("                                                    <a class=\"nav-link\" href=\"Controlador?accion=Carrito\"><i class=\"fas fa-cart-plus\"><label style=\"color: darkorange\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contador}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</label></i>Carrito</a>\n");
        out.write("                                                    </li>\n");
        out.write("                                                    <li class=\"nav-item submenu dropdown\">\n");
        out.write("                                                        <a href=\"login.html\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
        out.write("                                                           aria-expanded=\"false\">Mi Cuenta</a>\n");
        out.write("                                                        <ul class=\"dropdown-menu\">\n");
        out.write("                                                            <li class=\"nav-item bg-dark\"><a class=\"nav-link\">Hola ");
        if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_0, _jspx_page_context))
          return true;
        out.write("</a></li>\n");
        out.write("                                                            <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ListarMantencionesPorUsuario.jsp\" >Mis mantenciones</a></li>\n");
        out.write("                                                            <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ListarArriendosPorUsuario.jsp\" >Mis arriendos</a></li>\n");
        out.write("                                                            <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"Controlador?accion=MisCompras\">Mis Compras</a></li>\n");
        out.write("                                                            <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ControladorLogout\" style=\"color:red\">Cerrar Sesión</a></li>\n");
        out.write("                                                        </ul>\n");
        out.write("\n");
        out.write("\n");
        out.write("                                                    </li>\n");
        out.write("\n");
        out.write("                                                ");
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
        out.write("                                                    <li class=\"nav-item active\"><a class=\"nav-link\" href=\"inicio.jsp\">Inicio</a></li>\n");
        out.write("\n");
        out.write("                                                    <li class=\"nav-item submenu dropdown\">\n");
        out.write("                                                        <a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
        out.write("                                                           aria-expanded=\"false\">Servicios</a>\n");
        out.write("                                                        <ul class=\"dropdown-menu\">\n");
        out.write("                                                            <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ListaStock.jsp\">Ver stock</a></li>\n");
        out.write("\n");
        out.write("                                                        </ul>\n");
        out.write("                                                    </li>\n");
        out.write("\n");
        out.write("                                                    <li class=\"nav-item submenu dropdown\">\n");
        out.write("                                                        <a href=\"login.html\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
        out.write("                                                           aria-expanded=\"false\">Mi Cuenta</a>\n");
        out.write("                                                        <ul class=\"dropdown-menu\">\n");
        out.write("                                                            <li class=\"nav-item bg-dark\"><a class=\"nav-link\">Hola ");
        if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("</a></li>\n");
        out.write("\n");
        out.write("                                                            <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ControladorLogout\" style=\"color:red\">Cerrar Sesión</a></li>\n");
        out.write("                                                        </ul>\n");
        out.write("\n");
        out.write("\n");
        out.write("                                                    </li>\n");
        out.write("\n");
        out.write("                                                ");
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
        out.write("                                                    <li class=\"nav-item active\"><a class=\"nav-link\" href=\"inicio.jsp\">Inicio</a></li>\n");
        out.write("\n");
        out.write("                                                    <li class=\"nav-item submenu dropdown\">\n");
        out.write("                                                        <a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
        out.write("                                                           aria-expanded=\"false\">Servicios</a>\n");
        out.write("                                                        <ul class=\"dropdown-menu\">\n");
        out.write("                                                            <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ListarSolicitudesMantenciones.jsp\">Listado solicitudes taller</a></li>\n");
        out.write("                                                            <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ControladorTaller\">Taller</a></li>\n");
        out.write("                                                            <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ListarSolicitudesArriendo.jsp\">Listado solicitudes arriendo</a></li>\n");
        out.write("                                                            <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ListaStock.jsp\">Ver stock</a></li>\n");
        out.write("\n");
        out.write("                                                        </ul>\n");
        out.write("                                                    </li>\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("                                                    <li class=\"nav-item submenu dropdown\">\n");
        out.write("                                                        <a href=\"login.html\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
        out.write("                                                           aria-expanded=\"false\">Mi Cuenta</a>\n");
        out.write("                                                        <ul class=\"dropdown-menu\">\n");
        out.write("                                                            <li class=\"nav-item bg-dark\"><a class=\"nav-link\">Hola ");
        if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_2, _jspx_page_context))
          return true;
        out.write("</a></li>\n");
        out.write("                                                            <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ControladorListarUsuarios\">Listado de clientes</a></li>\n");
        out.write("                                                            <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ControladorLogout\" style=\"color:red\">Cerrar Sesión</a></li>\n");
        out.write("                                                        </ul>\n");
        out.write("\n");
        out.write("\n");
        out.write("                                                    </li>\n");
        out.write("\n");
        out.write("\n");
        out.write("                                                ");
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
        out.write("                                                    <li class=\"nav-item active\"><a class=\"nav-link\" href=\"inicio.jsp\">Inicio</a></li>\n");
        out.write("                                                    <li class=\"nav-item submenu dropdown\">\n");
        out.write("                                                        <a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
        out.write("                                                           aria-expanded=\"false\">Productos</a>\n");
        out.write("                                                        <ul class=\"dropdown-menu\">\n");
        out.write("                                                            <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"Controlador?accion=bicicletas\">Bicicletas</a></li>\n");
        out.write("                                                            <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"Accesorio.jsp\">Accesorios</a></li>\n");
        out.write("                                                            <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"Repuesto.jsp\">Repuestos</a></li>\n");
        out.write("                                                            <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"Controlador?accion=home\">Todo</a></li>\n");
        out.write("                                                        </ul>\n");
        out.write("                                                    </li>\n");
        out.write("                                                    <li class=\"nav-item submenu dropdown\">\n");
        out.write("                                                        <a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
        out.write("                                                           aria-expanded=\"false\">Servicios</a>\n");
        out.write("                                                        <ul class=\"dropdown-menu\">\n");
        out.write("                                                            <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ControladorMantencion\">Solicitud Taller</a></li>\n");
        out.write("                                                            <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ListarSolicitudesMantenciones.jsp\">Listado solicitudes taller</a></li>\n");
        out.write("                                                            <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"SolicitudArriendo.jsp\">Arriendos</a></li>\n");
        out.write("                                                            <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ControladorListarSolicitudesArriendo\">Listado solicitudes arriendo</a></li>\n");
        out.write("\n");
        out.write("                                                        </ul>\n");
        out.write("                                                    </li>\n");
        out.write("\n");
        out.write("                                                    <li class=\"nav-item submenu dropdown\">\n");
        out.write("                                                        <a href=\"login.html\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
        out.write("                                                           aria-expanded=\"false\">Mi Cuenta</a>\n");
        out.write("                                                        <ul class=\"dropdown-menu\">\n");
        out.write("                                                            <li class=\"nav-item bg-dark\"><a class=\"nav-link\">Hola ");
        if (_jspx_meth_c_out_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_3, _jspx_page_context))
          return true;
        out.write("</a></li>\n");
        out.write("                                                            <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ControladorListarUsuarios\">Listado de usuarios</a></li>\n");
        out.write("                                                            <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ReporteVenta.jsp\" >Reportes</a></li>\n");
        out.write("                                                            <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ControladorLogout\" style=\"color:red\">Cerrar Sesión</a></li>\n");
        out.write("                                                        </ul>\n");
        out.write("\n");
        out.write("\n");
        out.write("                                                    </li>\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("                                                ");
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
        out.write("                                                    <li class=\"nav-item active\"><a class=\"nav-link\" href=\"inicio.jsp\">Inicio</a></li>\n");
        out.write("                                                    <li class=\"nav-item submenu dropdown\">\n");
        out.write("                                                        <a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
        out.write("                                                           aria-expanded=\"false\">Productos</a>\n");
        out.write("                                                        <ul class=\"dropdown-menu\">\n");
        out.write("                                                            <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"Controlador?accion=bicicletas\">Bicicletas</a></li>\n");
        out.write("                                                            <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"Accesorio.jsp\">Accesorios</a></li>\n");
        out.write("                                                            <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"Repuesto.jsp\">Repuestos</a></li>\n");
        out.write("                                                            <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"Controlador?accion=home\">Todo</a></li>\n");
        out.write("                                                        </ul>\n");
        out.write("                                                    </li>\n");
        out.write("                                                    <li class=\"nav-item submenu dropdown\">\n");
        out.write("                                                        <a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
        out.write("                                                           aria-expanded=\"false\">Servicios</a>\n");
        out.write("                                                        <ul class=\"dropdown-menu\">\n");
        out.write("                                                            <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ListaProductos.jsp\">Lista productos</a></li>\n");
        out.write("\n");
        out.write("                                                        </ul>\n");
        out.write("                                                    </li>\n");
        out.write("\n");
        out.write("                                                    <li class=\"nav-item submenu dropdown\">\n");
        out.write("                                                        <a href=\"login.html\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
        out.write("                                                           aria-expanded=\"false\">Mi Cuenta</a>\n");
        out.write("                                                        <ul class=\"dropdown-menu\">\n");
        out.write("                                                            <li class=\"nav-item bg-dark\"><a class=\"nav-link\">Hola ");
        if (_jspx_meth_c_out_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_4, _jspx_page_context))
          return true;
        out.write("</a></li>\n");
        out.write("                                                            <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ControladorLogout\" style=\"color:red\">Cerrar Sesión</a></li>\n");
        out.write("                                                        </ul>\n");
        out.write("\n");
        out.write("                                                    </li>\n");
        out.write("\n");
        out.write("                                                ");
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
        out.write("                                                    <li class=\"nav-item active\"><a class=\"nav-link\" href=\"inicio.jsp\">Inicio</a></li>\n");
        out.write("                                                    <li class=\"nav-item submenu dropdown\">\n");
        out.write("                                                        <a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
        out.write("                                                           aria-expanded=\"false\">Productos</a>\n");
        out.write("                                                        <ul class=\"dropdown-menu\">\n");
        out.write("                                                            <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"Controlador?accion=bicicletas\">Bicicletas</a></li>\n");
        out.write("                                                            <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"Accesorio.jsp\">Accesorios</a></li>\n");
        out.write("                                                            <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"Repuesto.jsp\">Repuestos</a></li>\n");
        out.write("                                                            <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"Controlador?accion=home\">Todo</a></li>\n");
        out.write("                                                        </ul>\n");
        out.write("                                                    </li>\n");
        out.write("\n");
        out.write("                                                    <li class=\"nav-item\">\n");
        out.write("                                                        <a class=\"nav-link\" href=\"Controlador?accion=Carrito\"><i class=\"fas fa-cart-plus\"><label style=\"color: darkorange\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contador}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</label></i>Carrito</a>\n");
        out.write("                                                    </li>\n");
        out.write("\n");
        out.write("                                                    <li class=\"nav-item submenu dropdown\">\n");
        out.write("                                                        <a href=\"login.html\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
        out.write("                                                           aria-expanded=\"false\">Mi Cuenta</a>\n");
        out.write("                                                        <ul class=\"dropdown-menu\">\n");
        out.write("                                                            <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"Login.jsp\">Iniciar Sesión</a></li>\n");
        out.write("                                                            <li class=\"nav-item bg-dark\"><a class=\"nav-link\" href=\"ControladorUsuario\">Registrate</a></li>\n");
        out.write("\n");
        out.write("\n");
        out.write("                                                        </ul>\n");
        out.write("\n");
        out.write("\n");
        out.write("                                                    </li>\n");
        out.write("\n");
        out.write("                                                ");
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

  private boolean _jspx_meth_c_choose_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_1.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_1.setParent(null);
    int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
    if (_jspx_eval_c_choose_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" \n");
        out.write("                                \n");
        out.write("                                ");
        if (_jspx_meth_c_when_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_c_when_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                \n");
        out.write("                                ");
        if (_jspx_meth_c_when_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                \n");
        out.write("                                ");
        if (_jspx_meth_c_when_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                \n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_choose_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
    return false;
  }

  private boolean _jspx_meth_c_when_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_5 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_5.setPageContext(_jspx_page_context);
    _jspx_th_c_when_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${perfil == 2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_5 = _jspx_th_c_when_5.doStartTag();
    if (_jspx_eval_c_when_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<!--Rol 2 Vendedor -->\n");
        out.write("\n");
        out.write("                                    <div class=\"col-md-2 col-sm-1 hidden-xs display-table-cell v-align box\" id=\"navigation\">\n");
        out.write("                                        <div class=\"logo\">\n");
        out.write("                                            <a hef=\"inicio.jsp\"><img src=\"https://i.ibb.co/CH3Ln98/logo.png\" alt=\"merkery_logo\" class=\"hidden-xs hidden-sm\">\n");
        out.write("                                            </a>\n");
        out.write("                                        </div>\n");
        out.write("                                        <div class=\"navi\">\n");
        out.write("                                            <ul>\n");
        out.write("                                                <li class=\"active\"><a href=\"MenuTrabajadores.jsp\"><i class=\"fa fa-home\" aria-hidden=\"true\"></i><span class=\"hidden-xs hidden-sm\">Inicio</span></a></li>\n");
        out.write("                                                <li><a href=\"ListaStock.jsp\"><i class=\"fab fa-stack-exchange\" aria-hidden=\"true\"></i><span class=\"hidden-xs hidden-sm\">Stock</span></a></li>\n");
        out.write("                                                <li><a href=\"MisDatos.jsp\"><i class=\"fa fa-cog\" aria-hidden=\"true\"></i><span class=\"hidden-xs hidden-sm\">Configuración</span></a></li>\n");
        out.write("                                            </ul>\n");
        out.write("                                        </div>\n");
        out.write("                                    </div>\n");
        out.write("\n");
        out.write("\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_when_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_5);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_5);
    return false;
  }

  private boolean _jspx_meth_c_when_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_6 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_6.setPageContext(_jspx_page_context);
    _jspx_th_c_when_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${perfil == 3}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_6 = _jspx_th_c_when_6.doStartTag();
    if (_jspx_eval_c_when_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<!--Rol 3 Tecnico -->\n");
        out.write("\n");
        out.write("                                    <div class=\"col-md-2 col-sm-1 hidden-xs display-table-cell v-align box\" id=\"navigation\">\n");
        out.write("                                        <div class=\"logo\">\n");
        out.write("                                            <a hef=\"inicio.jsp\"><img src=\"https://i.ibb.co/CH3Ln98/logo.png\" alt=\"merkery_logo\" class=\"hidden-xs hidden-sm\">\n");
        out.write("                                            </a>\n");
        out.write("                                        </div>\n");
        out.write("                                        <div class=\"navi\">\n");
        out.write("                                            <ul>\n");
        out.write("                                                <li class=\"active\"><a href=\"MenuTrabajadores.jsp\"><i class=\"fa fa-home\" aria-hidden=\"true\"></i><span class=\"hidden-xs hidden-sm\">Inicio</span></a></li>\n");
        out.write("                                                <li><a href=\"ListarSolicitudesMantenciones.jsp\"><i class=\"fa fa-tasks\" aria-hidden=\"true\"></i><span class=\"hidden-xs hidden-sm\">Solicitudes</span></a></li>\n");
        out.write("                                                \n");
        out.write("                                                <li><a href=\"ListaStock.jsp\"><i class=\"fab fa-stack-exchange\" aria-hidden=\"true\"></i><span class=\"hidden-xs hidden-sm\">Stock</span></a></li>\n");
        out.write("                                                <li><a href=\"ListaDocumentos.jsp\"><i class=\"fas fa-file-pdf\" aria-hidden=\"true\"></i><span class=\"hidden-xs hidden-sm\">Documentos</span></a></li>\n");
        out.write("                                                <li><a href=\"ControladorListarUsuarios\"><i class=\"fas fa-user\" aria-hidden=\"true\"></i><span class=\"hidden-xs hidden-sm\">Clientes</span></a></li>\n");
        out.write("                                                <li><a href=\"MisDatos.jsp\"><i class=\"fa fa-cog\" aria-hidden=\"true\"></i><span class=\"hidden-xs hidden-sm\">Configuración</span></a></li>\n");
        out.write("                                            </ul>\n");
        out.write("                                        </div>\n");
        out.write("                                    </div>\n");
        out.write("\n");
        out.write("\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_when_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_6);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_6);
    return false;
  }

  private boolean _jspx_meth_c_when_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_7 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_7.setPageContext(_jspx_page_context);
    _jspx_th_c_when_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${perfil == 4}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_7 = _jspx_th_c_when_7.doStartTag();
    if (_jspx_eval_c_when_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<!--Rol 4 Supervisor -->\n");
        out.write("\n");
        out.write("                                    <div class=\"col-md-2 col-sm-1 hidden-xs display-table-cell v-align box\" id=\"navigation\">\n");
        out.write("                                        <div class=\"logo\">\n");
        out.write("                                            <a hef=\"inicio.jsp\"><img src=\"https://i.ibb.co/CH3Ln98/logo.png\" alt=\"merkery_logo\" class=\"hidden-xs hidden-sm\">\n");
        out.write("                                            </a>\n");
        out.write("                                        </div>\n");
        out.write("                                        <div class=\"navi\">\n");
        out.write("                                            <ul>\n");
        out.write("                                                <li class=\"active\"><a href=\"MenuTrabajadores.jsp\"><i class=\"fa fa-home\" aria-hidden=\"true\"></i><span class=\"hidden-xs hidden-sm\">Inicio</span></a></li>\n");
        out.write("                                                <li><a href=\"ControladorMantencion\"><i class=\"fas fa-hammer\" aria-hidden=\"true\"></i><span class=\"hidden-xs hidden-sm\">Solicitud Taller</span></a></li>\n");
        out.write("                                                <li><a href=\"ControladorTaller\"><i class=\"fas fa-hammer\" aria-hidden=\"true\"></i><span class=\"hidden-xs hidden-sm\">Taller</span></a></li>\n");
        out.write("                                                <li><a href=\"SolicitudArriendo.jsp\"><i class=\"fa fa-calendar\" aria-hidden=\"true\"></i><span class=\"hidden-xs hidden-sm\">Solicitud Arriendos</span></a></li>\n");
        out.write("                                                <li><a href=\"ListarSolicitudesArriendo.jsp\"><i class=\"fa fa-calendar\" aria-hidden=\"true\"></i><span class=\"hidden-xs hidden-sm\">Arriendos</span></a></li>\n");
        out.write("                                                <li><a href=\"EnviarSeguimiento.jsp\"><i class=\"fas fa-shipping-fast\" aria-hidden=\"true\"></i><span class=\"hidden-xs hidden-sm\">Enviar compras</span></a></li>\n");
        out.write("                                                <li><a href=\"ListaSeguimiento.jsp\"><i class=\"fas fa-clipboard-check\" aria-hidden=\"true\"></i><span class=\"hidden-xs hidden-sm\">Finalizar compras</span></a></li>\n");
        out.write("                                                <li><a href=\"ListaProducto.jsp\"><i class=\"fas fa-clipboard-check\" aria-hidden=\"true\"></i><span class=\"hidden-xs hidden-sm\">Productos</span></a></li>\n");
        out.write("                                                <li><a href=\"ListarUsuarios.jsp\"><i class=\"fas fa-user\" aria-hidden=\"true\"></i><span class=\"hidden-xs hidden-sm\">Usuarios</span></a></li>\n");
        out.write("                                                <li><a href=\"ReporteVenta.jsp\"><i class=\"fas fa-clipboard-check\" aria-hidden=\"true\"></i><span class=\"hidden-xs hidden-sm\">Reportes de venta</span></a></li>\n");
        out.write("\n");
        out.write("                                                <li><a href=\"MisDatos.jsp\"><i class=\"fa fa-cog\" aria-hidden=\"true\"></i><span class=\"hidden-xs hidden-sm\">Configuración</span></a></li>\n");
        out.write("                                            </ul>\n");
        out.write("                                        </div>\n");
        out.write("                                    </div>\n");
        out.write("\n");
        out.write("\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_when_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_7);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_7);
    return false;
  }

  private boolean _jspx_meth_c_when_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_8 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_8.setPageContext(_jspx_page_context);
    _jspx_th_c_when_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${perfil == 5}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_8 = _jspx_th_c_when_8.doStartTag();
    if (_jspx_eval_c_when_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<!--Rol 5 Bodeguero -->\n");
        out.write("\n");
        out.write("                                    <div class=\"col-md-2 col-sm-1 hidden-xs display-table-cell v-align box\" id=\"navigation\">\n");
        out.write("                                        <div class=\"logo\">\n");
        out.write("                                            </a>\n");
        out.write("                                        </div>\n");
        out.write("                                        <div class=\"navi\">\n");
        out.write("                                            <ul>\n");
        out.write("                                                <li class=\"active\"><a href=\"MenuTrabajadores.jsp\"><i class=\"fa fa-home\" aria-hidden=\"true\"></i><span class=\"hidden-xs hidden-sm\">Inicio</span></a></li>\n");
        out.write("                                                <li><a href=\"ListaProducto.jsp\"><i class=\"fas fa-clipboard-check\" aria-hidden=\"true\"></i><span class=\"hidden-xs hidden-sm\">Productos</span></a></li>\n");
        out.write("                                                <li><a href=\"ListaDocumentos.jsp\"><i class=\"fas fa-file-pdf\" aria-hidden=\"true\"></i><span class=\"hidden-xs hidden-sm\">Documentos</span></a></li>\n");
        out.write("                                                <li><a href=\"MisDatos.jsp\"><i class=\"fa fa-cog\" aria-hidden=\"true\"></i><span class=\"hidden-xs hidden-sm\">Configuración</span></a></li>\n");
        out.write("                                            </ul>\n");
        out.write("                                        </div>\n");
        out.write("                                    </div>\n");
        out.write("\n");
        out.write("\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_when_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_8);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_8);
    return false;
  }
}
