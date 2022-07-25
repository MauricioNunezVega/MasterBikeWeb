package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Venta;
import java.util.List;
import DAO.VentaDAO;

public final class ListaV_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"es\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Reportes Venta</title>\n");
      out.write("\n");
      out.write("    <!-- Required meta tags -->\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.0/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.0/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Datatables -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.datatables.net/v/bs4-4.1.1/dt-1.10.18/datatables.min.css\">\n");
      out.write("    <script src=\"https://cdn.datatables.net/v/bs4-4.1.1/dt-1.10.18/datatables.min.js\"></script>\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("        #mydatatable tfoot input {\n");
      out.write("            width: 100% !important;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #mydatatable tfoot {\n");
      out.write("            display: table-header-group !important;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"container-fluid p-5\">\n");
      out.write("    <div class=\"card-header\">\n");
      out.write("\n");
      out.write("        <h2 class=\"w3-wide w3-center text-center\" >Reportes</h2>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <div class=\"table-responsive\" id=\"mydatatable-container\">\n");
      out.write("        <table class=\"records_list table table-striped table-bordered table-hover\" id=\"mydatatable\">\n");
      out.write("            <thead>\n");
      out.write("                <tr class=\"encabezado\">\n");
      out.write("                    <th class=\"text-center\">ID</th>\n");
      out.write("                    <th class=\"text-center\">FECHA</th>\n");
      out.write("                    <th class=\"text-center\">MONTO</th>\n");
      out.write("                    <th class=\"text-center\">USUARIO</th>\n");
      out.write("                    <th class=\"text-center\">ESTADO</th>\n");
      out.write("                   \n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            ");

                VentaDAO vDAO = new VentaDAO();
                
                List<Venta> venta = vDAO.listarVentas();
                request.setAttribute("pro", venta);
            
      out.write("\n");
      out.write("            <tfoot>\n");
      out.write("                <tr>\n");
      out.write("                    <th></th>\n");
      out.write("                    <th class=\"date\"></th>\n");
      out.write("                </tr>\n");
      out.write("            </tfoot>\n");
      out.write("            <tbody>\n");
      out.write("                ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("  \n");
      out.write("                \n");
      out.write("                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.stream().map(p -> p.getTotalventa()).sum()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("\n");
      out.write("               $.");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Total}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("    \n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        $(document).ready(function () {\n");
      out.write("            $('#mydatatable tfoot th').each(function () {\n");
      out.write("                var title = $(this).text();\n");
      out.write("                if ($(this).hasClass('date')) {\n");
      out.write("                    $(this).html(\n");
      out.write("                        '<input id=\"date-from\" type=\"date\" placeholder=\"Desde..\" />' +\n");
      out.write("                        '<input id=\"date-to\" type=\"date\" placeholder=\"Hasta..\" />'\n");
      out.write("                    );\n");
      out.write("                } \n");
      out.write("            });\n");
      out.write("\n");
      out.write("            $.fn.dataTable.ext.search.push(\n");
      out.write("                function (settings, data, dataIndex) {\n");
      out.write("                    var dateFrom = $('#date-from').val();\n");
      out.write("                    var dateTo = $('#date-to').val();\n");
      out.write("                    var date = data[1];\n");
      out.write("\n");
      out.write("                    if ((dateFrom == '' && dateTo == '') ||\n");
      out.write("                        (dateFrom == '' && Date.parse(date) <= Date.parse(dateTo)) ||\n");
      out.write("                        (Date.parse(dateFrom) <= Date.parse(date) && dateTo == '') ||\n");
      out.write("                        (Date.parse(dateFrom) <= Date.parse(date) && Date.parse(date) <= Date.parse(dateTo))) {\n");
      out.write("                        return true;\n");
      out.write("                    }\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("            );\n");
      out.write("\n");
      out.write("            var table = $('#mydatatable').DataTable({\n");
      out.write("                \"dom\": 'B<\"float-left\"i><\"float-right\"f>t<\"float-left\"l><\"float-right\"p><\"clearfix\">',\n");
      out.write("                \"responsive\": false,\n");
      out.write("                \"language\": {\n");
      out.write("                    \"url\": \"https://cdn.datatables.net/plug-ins/1.10.19/i18n/Spanish.json\"\n");
      out.write("                },\n");
      out.write("                \"order\": [\n");
      out.write("                    [0, \"desc\"]\n");
      out.write("                ],\n");
      out.write("                \"initComplete\": function () {\n");
      out.write("                    this.api().columns().every(function () {\n");
      out.write("                        var that = this;\n");
      out.write("\n");
      out.write("                        $('input', this.footer()).on('keyup change', function () {\n");
      out.write("                            if ($(this).closest('th').hasClass('date')) {\n");
      out.write("                                console.log('Filtering dates..');\n");
      out.write("                                table.draw();\n");
      out.write("                            } else {\n");
      out.write("                                if (that.search() == this.value) {\n");
      out.write("                                    that\n");
      out.write("                                        .search(this.value)\n");
      out.write("                                        .draw();\n");
      out.write("                                }\n");
      out.write("                            }\n");
      out.write("                        });\n");
      out.write("                    })\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("        \n");
      out.write("    </script>\n");
      out.write("    \n");
      out.write("    <!--<script >\n");
      out.write("        \n");
      out.write("        document.querySelectorAll('.Total').forEach(function (total) {\n");
      out.write("        if (total.classList.length > 1) {\n");
      out.write("            var letra = total.classList[1];\n");
      out.write("            var suma = 0;\n");
      out.write("            document.querySelectorAll('.Columna' + letra).forEach(function (celda) {\n");
      out.write("                var valor = parseInt(celda.innerHTML);\n");
      out.write("                suma += valor;\n");
      out.write("            });\n");
      out.write("            total.innerHTML = suma;\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("    </script>-->\n");
      out.write("   \n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("Total");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${0}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
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
          out.write("                ");
          if (_jspx_meth_c_set_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                <tr class=\"text-center\">\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getIdVenta()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getFechora()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>$.");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getTotalventa()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getUsuario().getPnombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getUsuario().getAppaterno()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getEstadoventa()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                   \n");
          out.write("                </tr>\n");
          out.write("                 \n");
          out.write("            ");
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

  private boolean _jspx_meth_c_set_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_set_1.setVar("Total");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Total + p.getTotalventa()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }
}
