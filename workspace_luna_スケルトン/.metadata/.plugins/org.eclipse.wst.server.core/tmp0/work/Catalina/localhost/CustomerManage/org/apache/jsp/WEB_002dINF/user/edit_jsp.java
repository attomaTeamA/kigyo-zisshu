/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.34
 * Generated at: 2023-10-03 09:46:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.user;

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
      user.UserBean userEdit = null;
      synchronized (session) {
        userEdit = (user.UserBean) _jspx_page_context.getAttribute("userEdit", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (userEdit == null){
          userEdit = new user.UserBean();
          _jspx_page_context.setAttribute("userEdit", userEdit, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>ユーザー管理</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("    href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/style.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <h1>ユーザー管理</h1>\r\n");
      out.write("    <div class=\"main\">\r\n");
      out.write("        <h2>既存データの編集･削除</h2>\r\n");
      out.write("        <form name=\"form1\" action=\"UserServlet\" method=\"post\"\r\n");
      out.write("            onsubmit=\"return funcConfirm()\">\r\n");
      out.write("            <table>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>ID</td>\r\n");
      out.write("                    <td>");
      out.print(userEdit.getId());
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td class=\"title\">ログイン名</td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"login\" maxlength=\"15\"\r\n");
      out.write("                        value=\"");
      out.print(userEdit.getLogin());
      out.write("\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td class=\"title\">氏名</td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"user_name\" maxlength=\"20\"\r\n");
      out.write("                        value=\"");
      out.print(userEdit.getName());
      out.write("\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td class=\"title\">ユーザーレベル</td>\r\n");
      out.write("                    <td><select name=\"user_level\">\r\n");
      out.write("                            <option value=\"0\" ");
if (userEdit.getLvl() == 0) {
      out.write(" selected\r\n");
      out.write("                                ");
}
      out.write(">一般ユーザー\r\n");
      out.write("                            <option value=\"1\" ");
if (userEdit.getLvl() == 1) {
      out.write(" selected\r\n");
      out.write("                                ");
}
      out.write(">顧客管理者\r\n");
      out.write("                            <option value=\"2\" ");
if (userEdit.getLvl() == 2) {
      out.write(" selected\r\n");
      out.write("                                ");
}
      out.write(">システム管理者\r\n");
      out.write("                    </select></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("            <table>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td colspan=\"2\"><input type=\"checkbox\" name=\"password_change\"\r\n");
      out.write("                        onclick=\"funcPasswordChange()\"> パスワードを変更</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td class=\"title\">パスワード</td>\r\n");
      out.write("                    <td><input type=\"password\" name=\"password1\" maxlength=\"20\"\r\n");
      out.write("                        value=\"********\" disabled></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td class=\"title\">パスワード（確認用）</td>\r\n");
      out.write("                    <td><input type=\"password\" name=\"password2\" maxlength=\"20\"\r\n");
      out.write("                        value=\"********\" disabled></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("            <p>\r\n");
      out.write("                <button name=\"state\" value=\"update\">送信</button>\r\n");
      out.write("                <input type=\"button\" value=\"戻る\" onclick=\"history.back()\">\r\n");
      out.write("                <input type=\"button\" value=\"削除\" onclick=\"funcDelete()\">\r\n");
      out.write("            </p>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        function funcConfirm() {\r\n");
      out.write("            if (!document.form1.login.value.match(/^[a-zA-Z0-9]+$/)) {\r\n");
      out.write("                alert(\"ログイン名を半角英数字で入力してください\");\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            if (document.form1.user_name.value == \"\") {\r\n");
      out.write("                alert(\"氏名が入力されていません。\");\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            if (!document.form1.password1.value.match(/^[\\x20-\\x7E]+$/)) {\r\n");
      out.write("                alert(\"パスワードは半角英数字と記号で入力してください\");\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            if (document.form1.password1.value != document.form1.password2.value) {\r\n");
      out.write("                alert(\"確認用のパスワードが一致しません\");\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("        function funcPasswordChange() {\r\n");
      out.write("            if (document.form1.password_change.checked == true) {\r\n");
      out.write("                document.form1.password1.disabled = false;\r\n");
      out.write("                document.form1.password1.value = \"\";\r\n");
      out.write("                document.form1.password2.disabled = false;\r\n");
      out.write("                document.form1.password2.value = \"\";\r\n");
      out.write("            } else {\r\n");
      out.write("                document.form1.password1.disabled = true;\r\n");
      out.write("                document.form1.password1.value = \"********\";\r\n");
      out.write("                document.form1.password2.disabled = true;\r\n");
      out.write("                document.form1.password2.value = \"********\";\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("        function funcDelete() {\r\n");
      out.write("            if (confirm(\"削除します。よろしいですか？\")) {\r\n");
      out.write("                var form = document.createElement(\"form\");\r\n");
      out.write("                form.setAttribute(\"action\", \"UserServlet\");\r\n");
      out.write("                form.setAttribute(\"method\", \"post\");\r\n");
      out.write("                form.style.display = \"none\";\r\n");
      out.write("                document.body.appendChild(form);\r\n");
      out.write("                var input = document.createElement(\"input\");\r\n");
      out.write("                input.setAttribute(\"type\",\"hidden\");\r\n");
      out.write("                input.setAttribute(\"name\", \"state\");\r\n");
      out.write("                input.setAttribute(\"value\", \"delete\");\r\n");
      out.write("                form.appendChild(input);\r\n");
      out.write("                form.submit();\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
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
