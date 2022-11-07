package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class change_005fpassword_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n");
      out.write("        <meta name=\"description\" content=\"\" />\n");
      out.write("        <meta name=\"author\" content=\"\" />\n");
      out.write("        <title>Change Password</title>\n");
      out.write("        <!-- Favicon-->\n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"assets/favicon.ico\" />\n");
      out.write("        <!-- Bootstrap icons-->\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- Core theme CSS (includes Bootstrap)-->\n");
      out.write("        <link href=\"css/styles.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Section: Design Block -->\n");
      out.write("        <section class=\"text-center\">\n");
      out.write("            <!-- Background image -->\n");
      out.write("            <div class=\"p-5 bg-image\" style=\"\n");
      out.write("                 background-image: url('images/head.png');\n");
      out.write("                 height: 250px;\n");
      out.write("                 \"></div>\n");
      out.write("            <!-- Background image -->\n");
      out.write("\n");
      out.write("            <div class=\"card shadow-5-strong\" style=\"\n");
      out.write("                 margin-top: -170px;\n");
      out.write("                 margin-left: 30%;\n");
      out.write("                 margin-bottom: 10px;\n");
      out.write("                 background: hsla(0, 0%, 100%, 0.8);\n");
      out.write("                 backdrop-filter: blur(30px);\n");
      out.write("                 width: 40%;\n");
      out.write("                 \">\n");
      out.write("                <div class=\"card-body py-5 px-md-5\">\n");
      out.write("\n");
      out.write("                    <div class=\"row d-flex justify-content-center\">\n");
      out.write("                        <div class=\"col-lg-8\">\n");
      out.write("                            <h2 class=\"fw-bold mb-5\">Change Password</h2>\n");
      out.write("\n");
      out.write("                            <form action=\"change-pass\" method=\"post\">\n");
      out.write("                                <!-- 2 column grid layout with text inputs for the first and last names -->\n");
      out.write("\n");
      out.write("                               \n");
      out.write("                                <!-- Username input -->\n");
      out.write("                                <div class=\"form-outline mb-4\">\n");
      out.write("                                    <input pattern=\"[a-z0-9]+$\" type=\"text\" name=\"username\" class=\"form-control\" placeholder=\"User name\" required />\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <!-- Phone input -->\n");
      out.write("                                <div class=\"form-outline mb-4\">\n");
      out.write("                                    <input pattern=\"^0[0-9]{9}\" title=\"Số điện thoại bao gồm 10 chữ số và bắt đầu bằng chữ số 0\"  type=\"text\" name=\"phone\" class=\"form-control\" placeholder=\"Phone number\" required/>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Address input -->\n");
      out.write("                                <div class=\"form-outline mb-4\">\n");
      out.write("                                    <input  type=\"text\" name=\"address\" class=\"form-control\" placeholder=\"Address\" required/>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Password input -->\n");
      out.write("                                <div class=\"form-outline mb-4\">\n");
      out.write("                                    <input  pattern=\"[a-z0-9]+$\" type=\"password\" name=\"password\" class=\"form-control\" placeholder=\"Password\" required/>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <!-- Submit button -->\n");
      out.write("\n");
      out.write("                                <button type=\"submit\"   style=\"color: white\" class=\"btn btn-primary btn-block mb-4\">\n");
      out.write("                                    Sign up\n");
      out.write("                                </button>\n");
      out.write("\n");
      out.write("                                <!-- msg is wrong username and pass -->\n");
      out.write("\n");
      out.write("                                <p class=\"text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                                <a href=\"login.jsp\">I did have a account</a>\n");
      out.write("                            </form>\n");
      out.write("                            <!--             Register buttons \n");
      out.write("                            -->                                            <div class=\"text-center\">\n");
      out.write("                                <br>\n");
      out.write("                                <button type=\"button\" class=\"btn btn-link btn-floating mx-1\">\n");
      out.write("                                    <i class=\"bi bi-facebook\"></i>\n");
      out.write("                                </button>\n");
      out.write("\n");
      out.write("                                <button type=\"button\" class=\"btn btn-link btn-floating mx-1\">\n");
      out.write("                                    <i class=\"bi bi-google\"></i>\n");
      out.write("                                </button>\n");
      out.write("\n");
      out.write("                                <button type=\"button\" class=\"btn btn-link btn-floating mx-1\">\n");
      out.write("                                    <i class=\"bi bi-twitter\"></i>\n");
      out.write("                                </button>\n");
      out.write("\n");
      out.write("                                <button type=\"button\" class=\"btn btn-link btn-floating mx-1\">\n");
      out.write("                                    <i class=\"bi bi-github\"></i>\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- Section: Design Block -->\n");
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
}
