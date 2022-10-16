package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/component/header.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <!-- Basic -->\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("        <!-- Mobile Metas -->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n");
      out.write("        <!-- Site Metas -->\n");
      out.write("        <meta name=\"keywords\" content=\"\" />\n");
      out.write("        <meta name=\"description\" content=\"\" />\n");
      out.write("        <meta name=\"author\" content=\"\" />\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/favicon.png\" type=\"\">\n");
      out.write("\n");
      out.write("        <title> Cart </title>\n");
      out.write("\n");
      out.write("        <!-- bootstrap core css -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.css\" />\n");
      out.write("\n");
      out.write("        <!--owl slider stylesheet -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.carousel.min.css\" />\n");
      out.write("        <!-- nice select  -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-nice-select/1.1.0/css/nice-select.min.css\" integrity=\"sha512-CruCP+TD3yXzlvvijET8wV5WxxEh5H8P4cmz0RFbKK6FlZ2sYl3AEsKlLPHbniXKSrDdFewhbmBK5skbdsASbQ==\" crossorigin=\"anonymous\" />\n");
      out.write("        <!-- font awesome style -->\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("        <!-- Custom styles for this template -->\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- responsive style -->\n");
      out.write("        <link href=\"css/responsive.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- Favicon-->\n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"assets/favicon.ico\" />\n");
      out.write("        <!-- Bootstrap icons-->\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- Core theme CSS (includes Bootstrap)-->\n");
      out.write("        <link href=\"css/styles.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"css/styles-1.css\" rel=\"stylesheet\" />\n");
      out.write("    </head>\n");
      out.write("    <body class=\"sub_page\">  \n");
      out.write("        <div class=\"hero_area\">\n");
      out.write("            <div class=\"bg-box\">\n");
      out.write("                <img src=\"images/hero-bg.jpg\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("            <!-- header section strats -->\n");
      out.write("            ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta name=\"description\" content=\"\" />\r\n");
      out.write("        <meta name=\"author\" content=\"\" />\r\n");
      out.write("        <title>Register</title>\r\n");
      out.write("        <!-- Favicon-->\r\n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"assets/favicon.ico\" />\r\n");
      out.write("        <!-- Bootstrap icons-->\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <!-- Core theme CSS (includes Bootstrap)-->\r\n");
      out.write("        <link href=\"css/styles.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <link href=\"css/styles-1.css\" rel=\"stylesheet\" />\r\n");
      out.write("    </head>\r\n");
      out.write("    <body >\r\n");
      out.write("        <header class=\"header_section \" style=\"margin-top: -1.5rem;margin-bottom: -1.5rem\">\r\n");
      out.write("            <div class=\"container \">\r\n");
      out.write("                <nav class=\"navbar navbar-expand-lg custom_nav-container \">\r\n");
      out.write("                    <a class=\"navbar-brand\" href=\"home\" style=\"text-decoration: none \">\r\n");
      out.write("                        <span style=\"font-size: 45px\" >\r\n");
      out.write("                            FastFood\r\n");
      out.write("                        </span>\r\n");
      out.write("                    </a>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbarScroll\">\r\n");
      out.write("                        <ul class=\"navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll\" style=\"--bs-scroll-height: 100px; padding-left: 5%\">\r\n");
      out.write("                            <li class=\"nav-item\">\r\n");
      out.write("                                <a class=\"nav-link active\" aria-current=\"page\"  href=\"home\">Home</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"nav-item\">\r\n");
      out.write("                                <a class=\"nav-link\" href=\"menu\">Menu</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        </ul>\r\n");
      out.write("                        <div class=\"d-flex\" >\r\n");
      out.write("                            <a class=\"btn btn-light \" style=\"background-color: white\"  href=\"carts\">\r\n");
      out.write("                                <i class=\"bi-cart-fill me-1\"></i>\r\n");
      out.write("                                Cart\r\n");
      out.write("                                 \r\n");
      out.write("                           \r\n");
      out.write("                                    <span id=\"cart_number\" class=\"badge bg-dark text-white ms-1 rounded-pill\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.carts.size()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>    \r\n");
      out.write("                                \r\n");
      out.write("\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        ");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </nav>\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
      out.write("\n");
      out.write("            <!-- end header section -->\n");
      out.write("        </div>    \n");
      out.write("        <section class=\"py-5\">\n");
      out.write("            <div class=\"container\" style=\"min-height: 1000px\">\n");
      out.write("                ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- jQery -->\n");
      out.write("        <script src=\"js/jquery-3.4.1.min.js\"></script>\n");
      out.write("        <!-- popper js -->\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\">\n");
      out.write("        </script>\n");
      out.write("        <!-- bootstrap js -->\n");
      out.write("        <script src=\"js/bootstrap.js\"></script>\n");
      out.write("        <!-- owl slider -->\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/owl.carousel.min.js\">\n");
      out.write("        </script>\n");
      out.write("        <!-- isotope js -->\n");
      out.write("        <script src=\"https://unpkg.com/isotope-layout@3.0.4/dist/isotope.pkgd.min.js\"></script>\n");
      out.write("        <!-- nice select -->\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-nice-select/1.1.0/js/jquery.nice-select.min.js\"></script>\n");
      out.write("        <!-- custom js -->\n");
      out.write("        <script src=\"js/custom.js\"></script>\n");
      out.write("        <!-- Bootstrap core JS-->\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <!-- Core theme JS-->\n");
      out.write("        <script src=\"js/scripts-1.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.isAdmin == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                <li class=\"nav-item\">\r\n");
        out.write("                                    <a class=\"nav-link\" href=\"admin\">Manage Account</a>\r\n");
        out.write("                                </li>\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.isShipper == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                <li class=\"nav-item\">\r\n");
        out.write("                                    <a class=\"nav-link\" href=\"homeshipper\">List Order Ship</a>\r\n");
        out.write("                                </li>\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.isSeller == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                <li class=\"nav-item\">\r\n");
        out.write("                                    <a class=\"nav-link\" href=\"SellerFood\">Seller</a>\r\n");
        out.write("                                </li>\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            <form class=\"d-flex\" style=\"margin-left: 2%\">\r\n");
        out.write("                                <button class=\"btn btn-outline-dark btn-secondary\" >\r\n");
        out.write("                                    <a href=\"login.jsp\" style=\"text-decoration: none; color: white\">Login</a>\r\n");
        out.write("                                </button>\r\n");
        out.write("                            </form>\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent(null);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            <li class=\"nav-item dropdown\" style=\"margin-top: -3%\" >\r\n");
        out.write("                                <a class=\"nav-link dropdown-toggle\"  id=\"navbarScrollingDropdown\" role=\"button\" data-bs-toggle=\"dropdown\"  style=\"color: white; pointer-events:\">\r\n");
        out.write("                                    <span style=\"color:  white\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.displayName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span>  <i class=\"bi bi-person-circle\" style=\"font-size: 150%;margin-left: 5% ; color: white\"></i>\r\n");
        out.write("                                </a>\r\n");
        out.write("                                <ul class=\"dropdown-menu\" aria-labelledby=\"navbarScrollingDropdown\">\r\n");
        out.write("                                    <li><a class=\"dropdown-item\" href=\"profile?id=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">Profile</a></li>\r\n");
        out.write("<!--                                     <li><a class=\"dropdown-item\" href=\"viewBill?idCustomer=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">View Bill</a></li>-->\r\n");
        out.write("                                    <li><hr class=\"dropdown-divider\"></li>\r\n");
        out.write("                                    <li><a class=\"dropdown-item\" href=\"logout\">Logout</a></li>\r\n");
        out.write("                                    \r\n");
        out.write("                                </ul>\r\n");
        out.write("                            </li>\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
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
        out.write("                    ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                ");
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
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.carts == null || sessionScope.carts.size()== 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <h1 style=\"text-align: center\">List Cart is Empty</h1>\n");
        out.write("                    ");
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
        out.write("\n");
        out.write("                        <br>\n");
        out.write("\n");
        out.write("                        <br>\n");
        out.write("                        <h1>Shopping Cart</h1>\n");
        out.write("                       \n");
        out.write("                        <table class=\"table\" >\n");
        out.write("                            <thead>\n");
        out.write("                                <tr>\n");
        out.write("                                    <th scope=\"col\">#</th>\n");
        out.write("                                    <th scope=\"col\">Image</th>\n");
        out.write("                                    <th scope=\"col\">Name</th>\n");
        out.write("                                    <th scope=\"col\">Price</th>\n");
        out.write("                                    <th scope=\"col\">Quantity</th>\n");
        out.write("                                    <th scope=\"col\">Total Price</th>\n");
        out.write("                                    <th scope=\"col\">Action</th>\n");
        out.write("                                </tr>\n");
        out.write("                            </thead>\n");
        out.write("                            <tbody>\n");
        out.write("                                ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                            </tbody>\n");
        out.write("                        </table>\n");
        out.write("                        <h2>Total Amount: $");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalAmount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</h2>\n");
        out.write("                        <a href=\"payment\" class=\"btn btn-success\" style=\"color: white\">Check out</a>\n");
        out.write("                    ");
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

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_0);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${carts}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("C");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <form action=\"update-quantity\" method=\"get\">\n");
          out.write("                                    <tr>                               \n");
          out.write("                                    <input type=\"hidden\" name=\"foodid\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${C.value.product.foodid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                    <th scope=\"row\">");
          if (_jspx_meth_c_set_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>\n");
          out.write("                                    <td><img style=\"width: 70px\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${C.value.product.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"></td>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${C.value.product.foodname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${C.value.product.unitprice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </td>\n");
          out.write("                                    <td ><input  onchange=\"this.form.submit()\"  name=\"quantity\" style=\"width: 50px\" min=\"1\" type=\"number\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${C.value.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"></td>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${C.value.product.unitprice*C.value.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td>\n");
          out.write("                                        <a href=\"delete-cart?foodid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${C.value.product.foodid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-outline-danger \"\n");
          out.write("                                           style=\"background-color: white; color: red\"  >\n");
          out.write("                                            <i class=\"bi bi-trash\"></i> Delete\n");
          out.write("                                        </a>\n");
          out.write("                                    </td>\n");
          out.write("\n");
          out.write("                                    </tr>\n");
          out.write("                                </form>\n");
          out.write("                            ");
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

  private boolean _jspx_meth_c_set_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_set_0.setVar("count");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${count+1}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }
}
