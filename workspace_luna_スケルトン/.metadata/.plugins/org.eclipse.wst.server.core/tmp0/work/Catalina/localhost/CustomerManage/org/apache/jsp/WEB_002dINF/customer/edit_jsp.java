/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.34
 * Generated at: 2023-10-04 08:33:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      user.UserBean user = null;
      synchronized (session) {
        user = (user.UserBean) _jspx_page_context.getAttribute("user", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (user == null){
          user = new user.UserBean();
          _jspx_page_context.setAttribute("user", user, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      customer.CustomerBean customer = null;
      synchronized (session) {
        customer = (customer.CustomerBean) _jspx_page_context.getAttribute("customer", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (customer == null){
          customer = new customer.CustomerBean();
          _jspx_page_context.setAttribute("customer", customer, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>顧客管理</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("    href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/style.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <h1>顧客管理</h1>\r\n");
      out.write("    <div class=\"main\">\r\n");
      out.write("        <!-- TODO ｢既存データ編集･削除｣画面 -->\r\n");
      out.write("       <h2>既存データの編集</h2>\r\n");
      out.write("        <form name=\"form1\" action=\"CustomerServlet\" method=\"post\"\r\n");
      out.write("            onsubmit=\"return funcConfirm()\">\r\n");
      out.write("            <table>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td class=\"title\">氏名</td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"name\" maxlength=\"15\"\r\n");
      out.write("                        value=\"");
      out.print(customer.getName());
      out.write("\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td class=\"title\">郵便番号</td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"zip\" maxlength=\"20\"\r\n");
      out.write("                        value=\"");
      out.print(customer.getZip());
      out.write("\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("       　　                          <tr>\r\n");
      out.write("                    <td class=\"title\">住所１</td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"address1\" maxlength=\"20\"\r\n");
      out.write("                        value=\"");
      out.print(customer.getAddress1());
      out.write("\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td class=\"title\">住所２</td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"address2\" maxlength=\"20\"\r\n");
      out.write("                        value=\"");
      out.print(customer.getAddress2());
      out.write("\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td class=\"title\">TEL</td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"tel\" maxlength=\"20\"\r\n");
      out.write("                        value=\"");
      out.print(customer.getTel());
      out.write("\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td class=\"title\">FAX</td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"fax\" maxlength=\"20\"\r\n");
      out.write("                        value=\"");
      out.print(customer.getFax());
      out.write("\"></td>\r\n");
      out.write("                </tr>   \r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td class=\"title\">E-mail</td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"email\" maxlength=\"20\"\r\n");
      out.write("                        value=\"");
      out.print(customer.getEmail());
      out.write("\"></td>\r\n");
      out.write("                </tr>                                                                      \r\n");
      out.write("            </table> \r\n");
      out.write("            <p>\r\n");
      out.write("                <button name=\"state\" value=\"edit_confirm\">送信</button>\r\n");
      out.write("                <input type=\"button\" value=\"戻る\" onclick=\"history.back()\">\r\n");
      out.write("            </p>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    function funcConfirm() {\r\n");
      out.write("        if (document.form1.name.value == \"\") {\r\n");
      out.write("            alert(\"氏名が入力されていません。\");\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("    function funcConfirm() {\r\n");
      out.write("            if (document.form1.zipvalue == \"\") {\r\n");
      out.write("                alert(\"郵便番号が入力されていません。\");\r\n");
      out.write("                return false;\r\n");
      out.write("        } \r\n");
      out.write("    function funcConfirm() {\r\n");
      out.write("        if (document.form1.address1.value == \"\") {\r\n");
      out.write("            alert(\"住所が入力されていません。\");\r\n");
      out.write("            return false;\r\n");
      out.write("        }        \r\n");
      out.write("    function funcConfirm() {\r\n");
      out.write("        if (document.form1.tel.value == \"\") {\r\n");
      out.write("            alert(\"電話番号が入力されていません。\");\r\n");
      out.write("            return false;\r\n");
      out.write("        }         \r\n");
      out.write("    function funcConfirm() {\r\n");
      out.write("        if (document.form1.email.value == \"\") {\r\n");
      out.write("            alert(\"E-mailアドレスが入力されていません。\");\r\n");
      out.write("            return false;\r\n");
      out.write("        }           \r\n");
      out.write("            \r\n");
      out.write("        // TODO バリデーションチェック･alertダイアログ処理\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("</html>\r\n");
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
