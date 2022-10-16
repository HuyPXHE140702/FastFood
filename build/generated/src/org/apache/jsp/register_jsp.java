package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\r\n");
      out.write("        <meta name=\"description\" content=\"\" />\r\n");
      out.write("        <meta name=\"author\" content=\"\" />\r\n");
      out.write("        <title>Register</title>\r\n");
      out.write("        <!-- Favicon-->\r\n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"assets/favicon.ico\" />\r\n");
      out.write("        <!-- Bootstrap icons-->\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <!-- Core theme CSS (includes Bootstrap)-->\r\n");
      out.write("        <link href=\"css/styles.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl\" crossorigin=\"anonymous\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!-- Section: Design Block -->\r\n");
      out.write("        <section class=\"text-center\">\r\n");
      out.write("            <!-- Background image -->\r\n");
      out.write("            <div class=\"p-5 bg-image\" style=\"\r\n");
      out.write("                 background-image: url('images/head.png');\r\n");
      out.write("                 height: 250px;\r\n");
      out.write("                 \"></div>\r\n");
      out.write("            <!-- Background image -->\r\n");
      out.write("\r\n");
      out.write("            <div class=\"card shadow-5-strong\" style=\"\r\n");
      out.write("                 margin-top: -170px;\r\n");
      out.write("                 margin-left: 30%;\r\n");
      out.write("                 margin-bottom: 10px;\r\n");
      out.write("                 background: hsla(0, 0%, 100%, 0.8);\r\n");
      out.write("                 backdrop-filter: blur(30px);\r\n");
      out.write("                 width: 40%;\r\n");
      out.write("                 \">\r\n");
      out.write("                <div class=\"card-body py-5 px-md-5\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"row d-flex justify-content-center\">\r\n");
      out.write("                        <div class=\"col-lg-8\">\r\n");
      out.write("                            <h2 class=\"fw-bold mb-5\">Sign up now</h2>\r\n");
      out.write("\r\n");
      out.write("                            <form action=\"register\" method=\"post\">\r\n");
      out.write("                                <!-- 2 column grid layout with text inputs for the first and last names -->\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-md-6 mb-4\">\r\n");
      out.write("                                        <div class=\"form-outline\">\r\n");
      out.write("                                            <input pattern=\"[^!@#$%^&*()_+\\-=\\[\\]{};':\\\\|,.<>\\/?]+$\" type=\"text\" name=\"firstname\" class=\"form-control\" placeholder=\"First name\"  required/>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-md-6 mb-4\">\r\n");
      out.write("                                        <div class=\"form-outline\">\r\n");
      out.write("                                            <input pattern=\"[^!@#$%^&*()_+\\-=\\[\\]{};':\\\\|,.<>\\/?]+$\" type=\"text\" name=\"lastname\" class=\"form-control\" placeholder=\"Last name\" required />\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <!-- Username input -->\r\n");
      out.write("                                <div class=\"form-outline mb-4\">\r\n");
      out.write("                                    <input pattern=\"[a-z0-9]+$\" type=\"text\" name=\"username\" class=\"form-control\" placeholder=\"User name\" required />\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <!-- Phone input -->\r\n");
      out.write("                                <div class=\"form-outline mb-4\">\r\n");
      out.write("                                    <input pattern=\"^0[0-9]{9}\" title=\"Số điện thoại bao gồm 10 chữ số và bắt đầu bằng chữ số 0\"  type=\"text\" name=\"phone\" class=\"form-control\" placeholder=\"Phone number\" required/>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <!-- Address input -->\r\n");
      out.write("                                <div class=\"form-outline mb-4\">\r\n");
      out.write("                                    <input  type=\"text\" name=\"address\" class=\"form-control\" placeholder=\"Address\" required/>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <!-- Password input -->\r\n");
      out.write("                                <div class=\"form-outline mb-4\">\r\n");
      out.write("                                    <input  pattern=\"[a-z0-9]+$\" type=\"password\" name=\"password\" class=\"form-control\" placeholder=\"Password\" required/>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <!-- Submit button -->\r\n");
      out.write("\r\n");
      out.write("                                <button type=\"submit\"   style=\"color: white\" class=\"btn btn-primary btn-block mb-4\">\r\n");
      out.write("                                    Sign up\r\n");
      out.write("                                </button>\r\n");
      out.write("\r\n");
      out.write("                                <!-- msg is wrong username and pass -->\r\n");
      out.write("\r\n");
      out.write("                                <p class=\"text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                                <a href=\"login.jsp\">I did have a account</a>\r\n");
      out.write("                            </form>\r\n");
      out.write("                            <!--             Register buttons \r\n");
      out.write("                            -->                                            <div class=\"text-center\">\r\n");
      out.write("                                <br>\r\n");
      out.write("                                <button type=\"button\" class=\"btn btn-link btn-floating mx-1\">\r\n");
      out.write("                                    <i class=\"bi bi-facebook\"></i>\r\n");
      out.write("                                </button>\r\n");
      out.write("\r\n");
      out.write("                                <button type=\"button\" class=\"btn btn-link btn-floating mx-1\">\r\n");
      out.write("                                    <i class=\"bi bi-google\"></i>\r\n");
      out.write("                                </button>\r\n");
      out.write("\r\n");
      out.write("                                <button type=\"button\" class=\"btn btn-link btn-floating mx-1\">\r\n");
      out.write("                                    <i class=\"bi bi-twitter\"></i>\r\n");
      out.write("                                </button>\r\n");
      out.write("\r\n");
      out.write("                                <button type=\"button\" class=\"btn btn-link btn-floating mx-1\">\r\n");
      out.write("                                    <i class=\"bi bi-github\"></i>\r\n");
      out.write("                                </button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- Section: Design Block -->\r\n");
      out.write("    </body>\r\n");
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
}
