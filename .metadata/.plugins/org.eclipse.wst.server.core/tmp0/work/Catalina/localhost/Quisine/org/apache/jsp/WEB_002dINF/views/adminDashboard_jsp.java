/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.70
 * Generated at: 2024-02-26 09:49:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;

public final class adminDashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1708249447063L));
    _jspx_dependants.put("jar:file:/C:/Users/harshtr/Documents/Mini_Project_Spring/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Quisine/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Order Food Online from India's Best Food Delivery Service\r\n");
      out.write("	| QUISINE</title>\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/Index.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<link href=\"https://getbootstrap.com/docs/5.2/assets/css/docs.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("#custHeight {\r\n");
      out.write("	min-height:100vh;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("	background-color: #f8f9fa;\r\n");
      out.write("	font-family: Arial, sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".table {\r\n");
      out.write("	background-color: #fff;\r\n");
      out.write("	border-radius: 10px;\r\n");
      out.write("	box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	border-collapse: collapse;\r\n");
      out.write("	overflow: hidden;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".table th, .table td {\r\n");
      out.write("	padding: 12px 15px;\r\n");
      out.write("	border-bottom: 1px solid #dee2e6;\r\n");
      out.write("	text-align: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".table th {\r\n");
      out.write("	background-color: #343a40;\r\n");
      out.write("	color: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".table-striped tbody tr:nth-of-type(odd) {\r\n");
      out.write("	background-color: rgba(0, 0, 0, 0.05);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Hover effect */\r\n");
      out.write(".table tbody tr:hover {\r\n");
      out.write("	background-color: rgba(0, 0, 0, 0.075);\r\n");
      out.write("	transition: background-color 0.3s ease;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("	<!-- Navbar -->\r\n");
      out.write("	<nav class=\"navbar navbar-expand-lg navbar-dark sticky-top\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<a class=\"navbar-brand\" href=\"#\"> <img\r\n");
      out.write("				src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assests/icons/LOGO.png\"\r\n");
      out.write("				alt=\"Your Logo\" height=\"50px\" class=\"rounded\"\r\n");
      out.write("				style=\"height: 80px; width: auto;\">\r\n");
      out.write("			</a> <a class=\"navbar-brand\" href=\"backtoadmin\">Admin Dashboard <img\r\n");
      out.write("				src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assests/icons/home.png\"\r\n");
      out.write("				height=\"17em\" class=\"align-middle\"></a>\r\n");
      out.write("			<button class=\"navbar-toggler\" type=\"button\"\r\n");
      out.write("				data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNav\"\r\n");
      out.write("				aria-controls=\"navbarNav\" aria-expanded=\"false\"\r\n");
      out.write("				aria-label=\"Toggle navigation\">\r\n");
      out.write("				<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("			</button>\r\n");
      out.write("			<div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n");
      out.write("				<ul class=\"navbar-nav\">\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link\"\r\n");
      out.write("						href=\"restaurants.html\">Restaurant Owners <img\r\n");
      out.write("							src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assests/icons/restaurant_icon.png\"\r\n");
      out.write("							height=\"17em\" class=\"align-middle\">\r\n");
      out.write("					</a></li>\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link\" href=\"orders.html\">Orders\r\n");
      out.write("							<img\r\n");
      out.write("							src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assests/icons/checkout.png\"\r\n");
      out.write("							height=\"18em\" class=\"align-middle\">\r\n");
      out.write("					</a></li>\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link\" href=\"users.html\">Users\r\n");
      out.write("							<img\r\n");
      out.write("							src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assests/icons/user.png\"\r\n");
      out.write("							height=\"18em\" class=\"align-middle\">\r\n");
      out.write("					</a></li>\r\n");
      out.write("\r\n");
      out.write("					<li class=\"nav-item ml-auto mr-0\"><a class=\"nav-link\"\r\n");
      out.write("						href=\"logoutRequest\">Logout</a></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("	</nav>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"container mt-5\" id=\"custHeight\">\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"row justify-content-center\">\r\n");
      out.write("        <!-- Cards -->\r\n");
      out.write("        ");

        String[] sectionTitles = { "Users", "Restaurants", "Orders", "Feedbacks" };
        String[] sectionContent = { "Users around the year", "Total Restaurants", "Orders around the year", "All Feedback's" };
        String[] listAttributes = { "allusers", "showrest", "allorders", "allfeed" };

        for (int i = 0; i < sectionTitles.length; i++) {
            List<?> list = (List<?>) request.getAttribute(listAttributes[i]);
            int count = list != null ? list.size() : 0;

            // Determine column size for the cards
            String colSize = "col-md-4";
            if (i == 3) { // If it's the fourth card
                colSize += " mt-4"; // Add margin top to separate it from the third card
            }
        
      out.write("\r\n");
      out.write("        <div class=\"");
      out.print(colSize);
      out.write(" mb-4\">\r\n");
      out.write("            <div class=\"card rounded border border-danger\">\r\n");
      out.write("                <div class=\"card-body text-center\">\r\n");
      out.write("                    <h5 class=\"card-title\">\r\n");
      out.write("                        <h3>");
      out.print(sectionTitles[i]);
      out.write("</h3>\r\n");
      out.write("                        <h1 style=\"font-weight: semi-bold;\">");
      out.print(count);
      out.write("</h1>\r\n");
      out.write("                        <p class=\"card-text\">");
      out.print(sectionContent[i]);
      out.write("</p>\r\n");
      out.write("                    </h5>\r\n");
      out.write("                    <a href=\"");
      out.print(request.getContextPath());
      out.write('/');
      out.print(sectionTitles[i].toLowerCase());
      out.write("\"\r\n");
      out.write("                        class=\"btn btn-danger\">View Details</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");

        }
        
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("	<div class=\"container mt-5\">\r\n");
      out.write("		<h3 class=\"text-center mb-4 text-danger\">\r\n");
      out.write("			<strong> <i> Orders By Date</i></strong>\r\n");
      out.write("		</h3>\r\n");
      out.write("		<div class=\"table-responsive rounded\">\r\n");
      out.write("			<table class=\"table table-striped \">\r\n");
      out.write("				<thead>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<th>Date</th>\r\n");
      out.write("						<th>Counts</th>\r\n");
      out.write("					</tr>\r\n");
      out.write("				</thead>\r\n");
      out.write("				<tbody>\r\n");
      out.write("					");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("				</tbody>\r\n");
      out.write("			</table>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<footer style=\"background-color: #000000c5\">\r\n");
      out.write("		<div class=\"row justify-content-center align-items-center\">\r\n");
      out.write("			<div class=\"col-auto\">\r\n");
      out.write("				<a class=\"navbar-brand\" href=\"#\"> <img\r\n");
      out.write("					src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assests/icons/LOGO.png\"\r\n");
      out.write("					alt=\"Your Logo\" height=\"60px\" class=\"rounded\">\r\n");
      out.write("				</a>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-auto\">\r\n");
      out.write("				<p style=\"color: white;\">&copy; 2024 QUISINE. All rights reserved.</p>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</footer>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/views/adminDashboard.jsp(162,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("entry");
      // /WEB-INF/views/adminDashboard.jsp(162,5) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/adminDashboard.jsp(162,5) '${ordercount}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${ordercount}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("						<tr>\r\n");
            out.write("							<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${entry.key}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("							<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${entry.value}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("						</tr>\r\n");
            out.write("					");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
