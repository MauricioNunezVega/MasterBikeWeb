package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Mantencion;
import java.util.List;
import DAO.MantencionDAO;

public final class MantencionReportes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Reportes de venta</title>\n");
      out.write("\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.0/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.0/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Datatables -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.datatables.net/v/bs4-4.1.1/dt-1.10.18/datatables.min.css\">\n");
      out.write("        <script src=\"https://cdn.datatables.net/v/bs4-4.1.1/dt-1.10.18/datatables.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!--cdn para diseño y tipo de letra -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                font: 90%/1.45em \"Helvetica Neue\", HelveticaNeue, Verdana, Arial, Helvetica, sans-serif;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                color: #333;\n");
      out.write("                background-color: #fff;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <style>\n");
      out.write("            #mydatatable tfoot input {\n");
      out.write("                width: 70% !important;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #mydatatable tfoot {\n");
      out.write("                display: table-header-group !important;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body class=\"container-fluid p-5\">\n");
      out.write("        <div class=\"card-header\">\n");
      out.write("\n");
      out.write("            <h2 class=\"w3-wide w3-center text-center\" >Reportes</h2>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"table-responsive\" id=\"mydatatable-container\">\n");
      out.write("            <table class=\"records_list table table-striped table-bordered table-hover\" id=\"mydatatable\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th class=\"text-center\">ID</th>\n");
      out.write("                        <th class=\"text-center\">RETIRO DOMICILIO</th>\n");
      out.write("                        <th class=\"text-center\">FECHA SOLICITADA</th>\n");
      out.write("                        <th class=\"text-center\">COMENTARIOS</th>\n");
      out.write("                        <th class=\"text-center\">TOTAL</th>\n");
      out.write("                        <th class=\"text-center\">GARANTIA</th>\n");
      out.write("                        <th class=\"text-center\">FECHA INGRESO</th>\n");
      out.write("\n");
      out.write("                        <th class=\"text-center\">FECHA SALIDA</th>\n");
      out.write("                        <th class=\"text-center\">ESTADO</th>\n");
      out.write("                       \n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                ");

                    MantencionDAO dDAO = new MantencionDAO();

                    List<Mantencion> venta = dDAO.listarMantenciones();
                    request.setAttribute("pro", venta);
                
      out.write("\n");
      out.write("                <tfoot>\n");
      out.write("                    <tr>\n");
      out.write("                        <th></th>\n");
      out.write("                        <th class=\"date\"></th>\n");
      out.write("                    </tr>\n");
      out.write("                </tfoot>\n");
      out.write("                <tbody>\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("  \n");
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("                <tfoot>\n");
      out.write("                <td class=\"bg-grays-active color-palette\"><b>TOTAL</b></td>\n");
      out.write("                <td class=\"bg-teals-active color-palette text-center\"></td>\n");
      out.write("                <td class=\"bg-teals-active color-palette text-center\">\n");
      out.write("                    <strong></strong>\n");
      out.write("                </td>\n");
      out.write("                <td class=\"bg-teals-active color-palette text-center\"></td>\n");
      out.write("\n");
      out.write("                <td class=\"bg-teals-active color-palette text-center\">\n");
      out.write("                    <b>$. </b><strong id=\"monto\" class=\"badge\"></strong>\n");
      out.write("                </td>\n");
      out.write("                <td class=\"bg-teals-active color-palette text-center\">\n");
      out.write("                    <strong></strong>\n");
      out.write("                </td>\n");
      out.write("                <td class=\"bg-teals-active color-palette text-center\">\n");
      out.write("                    \n");
      out.write("                </td>\n");
      out.write("                <td class=\"bg-teals-active color-palette text-center\"></td>\n");
      out.write("                </tfoot>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("                <!-- Scripts de PDF-->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.js\"></script>\n");
      out.write("        <script src=\"https://cdn.datatables.net/1.11.3/js/jquery.dataTables.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.datatables.net/buttons/2.1.0/js/dataTables.buttons.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.53/pdfmake.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.53/vfs_fonts.js\"></script>\n");
      out.write("        <script src=\"https://cdn.datatables.net/buttons/2.1.0/js/buttons.html5.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $('#mydatatable tfoot th').each(function () {\n");
      out.write("                    var title = $(this).text();\n");
      out.write("                    if ($(this).hasClass('date')) {\n");
      out.write("                        $(this).html(\n");
      out.write("                                '<input id=\"date-from\" type=\"date\" placeholder=\"Desde..\" />' +\n");
      out.write("                                '<input id=\"date-to\" type=\"date\" placeholder=\"Hasta..\" />'\n");
      out.write("                                );\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                $.fn.dataTable.ext.search.push(\n");
      out.write("                        function (settings, data, dataIndex) {\n");
      out.write("                            var dateFrom = $('#date-from').val();\n");
      out.write("                            var dateTo = $('#date-to').val();\n");
      out.write("                            var date = data[1];\n");
      out.write("\n");
      out.write("                            if ((dateFrom == '' && dateTo == '') ||\n");
      out.write("                                    (dateFrom == '' && Date.parse(date) <= Date.parse(dateTo)) ||\n");
      out.write("                                    (Date.parse(dateFrom) <= Date.parse(date) && dateTo == '') ||\n");
      out.write("                                    (Date.parse(dateFrom) <= Date.parse(date) && Date.parse(date) <= Date.parse(dateTo))) {\n");
      out.write("                                return true;\n");
      out.write("                            }\n");
      out.write("                            return false;\n");
      out.write("                        }\n");
      out.write("                );\n");
      out.write("\n");
      out.write("                var table = $('#mydatatable').DataTable({\n");
      out.write("                    \"dom\": 'B<\"float-left\"i><\"float-right\"f>t<\"float-left\"l><\"float-right\"p><\"clearfix\">',\n");
      out.write("                    \"responsive\": false,\n");
      out.write("                    dom: 'Bfrtip',\n");
      out.write("                    buttons: [\n");
      out.write("                        {\n");
      out.write("                            extend: 'pdfHtml5',\n");
      out.write("                            download: 'open'\n");
      out.write("                        }\n");
      out.write("                    ],\n");
      out.write("                    drawCallback: function () {\n");
      out.write("                        var api = this.api();\n");
      out.write("                       \n");
      out.write("                        var monto = api.column(4, {\"filter\": \"applied\"}).data().sumSpan();\n");
      out.write("                        $('#monto').html(monto);\n");
      out.write("                    },\n");
      out.write("                    \"language\": {\n");
      out.write("                        \"url\": \"https://cdn.datatables.net/plug-ins/1.10.19/i18n/Spanish.json\"\n");
      out.write("                    },\n");
      out.write("                    \"order\": [\n");
      out.write("                        [0, \"desc\"]\n");
      out.write("                    ],\n");
      out.write("                    \"initComplete\": function () {\n");
      out.write("                        this.api().columns().every(function () {\n");
      out.write("                            var that = this;\n");
      out.write("\n");
      out.write("                            $('input', this.footer()).on('keyup change', function () {\n");
      out.write("                                if ($(this).closest('th').hasClass('date')) {\n");
      out.write("                                    console.log('Filtering dates..');\n");
      out.write("                                    table.draw();\n");
      out.write("                                } else {\n");
      out.write("                                    if (that.search() == this.value) {\n");
      out.write("                                        that\n");
      out.write("                                                .search(this.value)\n");
      out.write("                                                .draw();\n");
      out.write("                                    }\n");
      out.write("                                }\n");
      out.write("                            });\n");
      out.write("                        })\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            $(document).ready(function () {\n");
      out.write("               \n");
      out.write("                jQuery.fn.dataTable.Api.register('sumSpan()', function ( ) {\n");
      out.write("                    return this.flatten().reduce(function (a, b) {\n");
      out.write("                        if (typeof a === 'string') {\n");
      out.write("                            a = a.replace(/[^\\d.-]/g, '') * 1;\n");
      out.write("                        }\n");
      out.write("                        if (typeof b === 'string') {\n");
      out.write("                            var regex = /(\\d+)/g;\n");
      out.write("                            b = b.match(regex)[0];\n");
      out.write("                            b = b.replace(/[^\\d.-]/g, '') * 1;\n");
      out.write("                        }\n");
      out.write("                        return a + b;\n");
      out.write("                    }, 0);\n");
      out.write("                });\n");
      out.write("\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
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
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getIdMantencion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getRetirodomicilio()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>$.");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getFecSolicitada()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getComentarios()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>$.");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getValortotal}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getGarantia()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getFecingreso()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getFecsalida()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getEstadosolicitud()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\n");
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
