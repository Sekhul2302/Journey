/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.6.v20170531
 * Generated at: 2018-01-19 10:22:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class kategori_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"/resources/assets/css/bootstrap.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"/resources/assets/css/bootstrap.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"/resources/assets/css/bootstrap-theme.min.css\" />\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"/resources/assets/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"/resources/assets/js/bootstrap.min.js\"></script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".thh{\r\n");
      out.write("\tbackground-color: green;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\t\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tshowData();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#simpan\").on(\"click\",function(){\r\n");
      out.write("\t\t\tsave();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(document).on('click','.delete',function(){\r\n");
      out.write("\t\t\tonDelete(this);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(document).on('click','.edit',function(){\r\n");
      out.write("\t\t\talert('edit');\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<title>Form Kategori</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t\t<br>Form Kategori\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t<div class=\"col-lg-12\">\r\n");
      out.write("    \t<div class=\"panel panel-default\">\r\n");
      out.write("           \t<div class=\"panel-heading\">\r\n");
      out.write("               Form Kategori\r\n");
      out.write("           \t</div>\r\n");
      out.write("          \t<div class=\"panel-body\">\r\n");
      out.write("           \t\t<form id=\"formKategori\">\r\n");
      out.write("           \t\t\t<div class=\"form-group col-xs-4\">\r\n");
      out.write("\t\t\t\t\t\t<label>Nama Kategori</label>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"namaKategori\" placeholder=\"Masukan Nama Kategori\"/>\r\n");
      out.write("\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" id=\"simpan\" class=\"btn btn-success\" value=\"Simpan\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t<table class=\"table table-striped\" id='dataTable'>\r\n");
      out.write("\t\t\t\t\t\t<thead class='thh'>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td align=\"left\"><b>JENIS KATEGORI</b></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><b>ACTION</b></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>Novel</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>Update</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>Delete</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("         \t</div>\r\n");
      out.write("      \t</div>\r\n");
      out.write(" \t</div>\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction save(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar namaKategori = $(\"#namaKategori\").val();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar kategori = {\r\n");
      out.write("\t\t\t\tnamaKategori : namaKategori\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl : 'kategori/save',\r\n");
      out.write("\t\t\tcontentType : 'application/JSON',\r\n");
      out.write("\t\t\tdata : JSON.stringify(kategori),\r\n");
      out.write("\t\t\ttype : 'POST',\r\n");
      out.write("\t\t\tsuccess : function(data,a,xhr){\r\n");
      out.write("\t\t\t\tconsole.log('data berhasil disimpan')\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t};\r\n");
      out.write("\t\r\n");
      out.write("\tfunction fillData(data){\r\n");
      out.write("\t\tvar dt = $(\"#dataTable\");\r\n");
      out.write("\t\tvar tBody = dt.find(\"tbody\");\r\n");
      out.write("\t\ttBody.find(\"tr\").remove();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$.each(data,function(index, kategori){\r\n");
      out.write("\t\t\tvar thead = \"<tr>\";\r\n");
      out.write("\t\t\tthead +=\"<td>\"; thead+=kategori.namaKategori; thead += \"</td>\";\r\n");
      out.write("\t\t\tthead +=\"<td>\"; \r\n");
      out.write("\t\t\t\tthead+=\"<input type='submit' id_delete='\"+kategori.id+\"' class='delete button btn-warning' value='Delete'>\"; \r\n");
      out.write("\t\t\t\tthead+=\"<input type='submit' class='edit button btn-warning' value='edit'>\";\r\n");
      out.write("\t\t\tthead += \"</td>\";\r\n");
      out.write("\t\t\t/* thead +=\"<td>\"; thead+=\"<input type='submit' class='edit button btn-warning' value='edit'>\"; thead += \"</td>\"; */\r\n");
      out.write("\t\t\tthead +=\"</tr>\"\r\n");
      out.write("\t\t\ttBody.append(thead);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t};\r\n");
      out.write("\t\r\n");
      out.write("\tfunction showData(){\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl : '/kategori/getall',\r\n");
      out.write("\t\t\tcontentType : JSON,\r\n");
      out.write("\t\t\ttype  : 'GET',\r\n");
      out.write("\t\t\tsuccess : function(data,a,xhr){\r\n");
      out.write("\t\t\t\tconsole.log('load');\r\n");
      out.write("\t\t\t\tfillData(data);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t};\r\n");
      out.write("\t\r\n");
      out.write("\tfunction onDelete(del){\r\n");
      out.write("\t\tvar id = $(del).attr('id_delete'); \r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl : '/kategori/delete/'+id,\r\n");
      out.write("\t\t\ttype : 'DELETE',\r\n");
      out.write("\t\t\tcontentType : JSON,\r\n");
      out.write("\t\t\tsuccess : function(data,x,xhr){\r\n");
      out.write("\t\t\t\tconsole.log('data dihapus');\r\n");
      out.write("\t\t\t\talert('sukses');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t})\r\n");
      out.write("\t};\r\n");
      out.write("</script>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
