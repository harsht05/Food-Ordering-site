/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.70
 * Generated at: 2024-02-26 09:38:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SelectFood_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
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
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Select Food</title>\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/select-food.css\">\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("#custHeight {\r\n");
      out.write("	min-height:100vh;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-color: #ffc3a149 !important;\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Navbar -->\r\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-dark\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <!-- Logo with Background -->\r\n");
      out.write("    <!-- Logo -->\r\n");
      out.write("    <a class=\"navbar-brand\" href=\"#\">\r\n");
      out.write("      <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/assests/icons/LOGO.png\"\r\n");
      out.write("				alt=\"Your Logo\" style=\"height: 80px; width: 200px\" class=\"rounded\">\r\n");
      out.write("    </a>\r\n");
      out.write("      <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\"\r\n");
      out.write("              data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("              aria-label=\"Toggle navigation\">\r\n");
      out.write("          <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("      </button>\r\n");
      out.write("      <div class=\"collapse navbar-collapse justify-content-center\" id=\"navbarSupportedContent\">\r\n");
      out.write("          <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n");
      out.write("              <li class=\"nav-item\">\r\n");
      out.write("                  <a class=\"nav-link active fs-5 fw-bold\" aria-current=\"page\" href=\"backToDashboard\">Home</a>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li class=\"nav-item\">\r\n");
      out.write("                  <a class=\"nav-link fs-5 fw-bold\" href=\"ordersPage\">Orders</a>\r\n");
      out.write("              </li>\r\n");
      out.write("              \r\n");
      out.write("          </ul>\r\n");
      out.write("          \r\n");
      out.write("          <ul class=\"navbar-nav mb-2 mb-lg-0\">\r\n");
      out.write("              <li class=\"nav-item dropdown\">\r\n");
      out.write("                  <a class=\"nav-link dropdown-toggle fs-5 fw-bold\" href=\"#\" id=\"profileDropdown\" role=\"button\"\r\n");
      out.write("                     data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("                      <i class=\"fas fa-user-circle me-2\"> Hi, ");
      out.print(session.getAttribute("cust_name") );
      out.write("</i>\r\n");
      out.write("                  </a>\r\n");
      out.write("                  <ul class=\"dropdown-menu dropdown-menu-end\" aria-labelledby=\"profileDropdown\">\r\n");
      out.write("                      <li><a class=\"dropdown-item\" href=\"viewCustomerRequest\">View Profile</a></li>\r\n");
      out.write("                      <li><a class=\"dropdown-item\" href=\"updateCustomerPage\">Update Profile</a></li>\r\n");
      out.write("                      <li><hr class=\"dropdown-divider\"></li>\r\n");
      out.write("                      <li><a class=\"dropdown-item\" href=\"logoutRequest\">Logout</a></li>\r\n");
      out.write("                  </ul>\r\n");
      out.write("              </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container-fluid p-1\" id=\"custHeight\">\r\n");
      out.write("\r\n");
      out.write("    <p class=\"fw-bolder fs-2 text-center heading\">Fresh in ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rest_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"container p-2\">\r\n");
      out.write("        <div class=\"row card_container\">\r\n");
      out.write("          <div class=\"col-md-8\">\r\n");
      out.write("          \r\n");
      out.write("          <div class=\"d-flex justify-content-center gap-4 flex-row flex-wrap mb-3 cards-container\">\r\n");
      out.write("\r\n");
      out.write("		");
int i = 1; 
      out.write("\r\n");
      out.write("		");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      boolean _jspx_th_c_005fforEach_005f0_reused = false;
      try {
        _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
        _jspx_th_c_005fforEach_005f0.setParent(null);
        // /WEB-INF/views/SelectFood.jsp(77,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f0.setVar("food");
        // /WEB-INF/views/SelectFood.jsp(77,2) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/SelectFood.jsp(77,2) '${food_list}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${food_list}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
        int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
        try {
          int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
          if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("	            \r\n");
              out.write("	            <div class=\"card m-2 rounded\" style=\"width: 18rem;\">\r\n");
              out.write("                <img src=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("/resources/assests/food/");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${food.getFooditems().getFoodImage()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("\" class=\"card-img-top\" alt=\"...\" style=\"height: 200px;\">\r\n");
              out.write("                <div class=\"card-body\">\r\n");
              out.write("                  <p class=\"card-title fs-4 fw-semibold\">");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${food.getFooditems().foodName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</p>\r\n");
              out.write("                  <p class=\"card-text fs-5\">Starting at just <b>&#8377; ");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${food.getPrice()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</b> </p>\r\n");
              out.write("                \r\n");
              out.write("                	<button class=\"btn btn-danger add-to-cart p-2 mb-2\" data-item=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${food.getFooditems().getFoodName()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("\" data-price=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${food.getPrice()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("\" data-quantity=\"meal");
              out.print(i );
              out.write("Quantity\"> Add to Cart</button>\r\n");
              out.write("                 \r\n");
              out.write("                        \r\n");
              out.write("                        <div class=\"quantity-bar\" id=\"meal");
              out.print(i );
              out.write("Quantity\">\r\n");
              out.write("                            <button type=\"button\" class=\"btn btn-success decrease-quantity\" style=\"display: none\"> - </button>\r\n");
              out.write("                            <span class=\"p-2 span-con\" id=\"span-con\"></span>\r\n");
              out.write("                            <button type=\"button\" class=\"btn btn-success increase-quantity\" style=\"display: none\"> + </button>\r\n");
              out.write("                        </div>\r\n");
              out.write("                </div>\r\n");
              out.write("              </div>\r\n");
              out.write("              \r\n");
              out.write("              ");
i++; 
              out.write("\r\n");
              out.write("	            \r\n");
              out.write("	        ");
              int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            return;
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
      out.write("\r\n");
      out.write("		\r\n");
      out.write("    </div>\r\n");
      out.write("          \r\n");
      out.write("          </div>    \r\n");
      out.write("          \r\n");
      out.write("          <div class=\"col-md-4\">\r\n");
      out.write("            <div class=\"summary bg-white p-3 rounded\">\r\n");
      out.write("              <p class=\"fs-4 fw-semibold\">Summary</p>\r\n");
      out.write("              <p class=\"fs-6 fw-normal\" id=\"mealCharges\">Meal Charges : &#8377;0</p>\r\n");
      out.write("              <p class=\"fs-6 fw-normal\" id=\"mealCount\">Meals : None</p>\r\n");
      out.write("              <!-- <p id=\"mealTotal\">Meal total : 0</p> -->\r\n");
      out.write("              \r\n");
      out.write("              <hr>\r\n");
      out.write("              \r\n");
      out.write("              <p class=\"fs-6 fw-normal\" id=\"deliveryFee\">Delivery Charges : &#8377;0</p>\r\n");
      out.write("              <p class=\"fs-6 fw-normal\" id=\"convenienceFee\">Convenience Fee : &#8377;0</p>\r\n");
      out.write("\r\n");
      out.write("              <hr>\r\n");
      out.write("              <p class=\"fs-6 fw-normal\" id=\"totalPrice\">Total Price : &#8377;0</p>\r\n");
      out.write("\r\n");
      out.write("				<form id=\"summaryForm\" action=\"payementSummaryPage\" method=\"post\">\r\n");
      out.write("				    <input type=\"hidden\" id=\"mealChargesF\" name=\"meal_charges\">\r\n");
      out.write("				    <input type=\"hidden\" id=\"mealCountF\" name=\"meals\">\r\n");
      out.write("				    <input type=\"hidden\" id=\"totalPriceF\" name=\"total_price\">\r\n");
      out.write("				    <button type=\"submit\" class=\"btn btn-success mt-2 disabled\" id=\"proceedButton\">Proceed</button>\r\n");
      out.write("				</form>\r\n");
      out.write("\r\n");
      out.write("              <!-- Proceed button -->\r\n");
      out.write("              <!-- <button class=\"btn btn-success mt-2 disabled\" id=\"proceedButton\"> Proceed </button> -->\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<footer\r\n");
      out.write("		style=\"position: sticky; bottom:0; width: 100%;background-color:#000000c5;\">\r\n");
      out.write("		<div class=\"row justify-content-center align-items-center\">\r\n");
      out.write("			<div class=\"col-auto\">\r\n");
      out.write("				<a class=\"navbar-brand\" href=\"#\"> <img\r\n");
      out.write("					src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assests/icons/LOGO.png\"\r\n");
      out.write("					alt=\"Your Logo\" height=\"80px\" class=\"rounded\" style=\"height: 80px;width: auto;\">\r\n");
      out.write("				</a>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-auto\">\r\n");
      out.write("				<p style=\"color: white;\">&copy; 2024 QUISINE. All rights reserved.</p>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</footer>\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/select-food.js\" type=\"text/javascript\"></script>\r\n");
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
}
