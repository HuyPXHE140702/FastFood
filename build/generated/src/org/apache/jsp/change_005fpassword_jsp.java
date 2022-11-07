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
      out.write("        <!-- Favicon-->\r\n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"assets/favicon.ico\" />\r\n");
      out.write("        <!-- Bootstrap icons-->\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <!-- Core theme CSS (includes Bootstrap)-->\r\n");
      out.write("        <link href=\"css/styles.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\"/>\r\n");
      out.write("        <meta charset=\"utf-8\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\r\n");
      out.write("        <meta name=\"description\" content=\"\" />\r\n");
      out.write("        <meta name=\"author\" content=\"\" />\r\n");
      out.write("        <title>Change Password</title>\r\n");
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
      out.write("                            <h2 class=\"fw-bold mb-5\">Change Password</h2>\r\n");
      out.write("\r\n");
      out.write("                            <script>\r\n");
      out.write("                                function togglePassword() {\r\n");
      out.write("                                    var upass = document.getElementById('upass');\r\n");
      out.write("                                    var toggleBtn = document.getElementById('toggleBtn');\r\n");
      out.write("\r\n");
      out.write("                                    toggleBtn.onclick = (() => {\r\n");
      out.write("                                        if (upass.type === \"password\") {\r\n");
      out.write("                                            upass.type = \"text\";\r\n");
      out.write("\r\n");
      out.write("                                            toggleBtn.classList.add(\"bi bi-eye-slash-fill\");\r\n");
      out.write("                                        } else {\r\n");
      out.write("                                            upass.type = \"password\";\r\n");
      out.write("                                            toggleBtn.classList.remove(\"bi bi-eye-slash-fill\");\r\n");
      out.write("\r\n");
      out.write("                                        }\r\n");
      out.write("                                    });\r\n");
      out.write("                                }\r\n");
      out.write("                            </script>\r\n");
      out.write("\r\n");
      out.write("                            <form action=\"change-pass\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("                                <!-- old password input -->\r\n");
      out.write("                                <div class=\"form-outline mb-4\">\r\n");
      out.write("                                    <input  pattern=\"[a-z0-9]+$\" type=\"password\" name=\"password\" class=\"form-control\" placeholder=\"Old Password\" required/>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div style=\"margin-left: -13px;margin-top: 8px\" class=\"col-sm-1 \"> <i  id=\"toggleBtn\" onclick=\"togglePassword()\"  class=\"fas fa-eye\"></i></div>\r\n");
      out.write("\r\n");
      out.write("                                <!-- new password input -->\r\n");
      out.write("                                <div class=\"form-outline mb-4\">\r\n");
      out.write("                                    <input  pattern=\"[a-z0-9]+$\" type=\"password\" name=\"password\" class=\"form-control\" placeholder=\"New Password\" required/>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <!-- confirmed password input -->\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"form-outline mb-4\">\r\n");
      out.write("                                        <input  pattern=\"[a-z0-9]+$\" type=\"password\" name=\"password\" class=\"form-control\" placeholder=\"Confirm Password\" required/>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>Password</label>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"row \">\r\n");
      out.write("                                        <div class=\"col-sm-11\"><input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${profile.password}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\"   id=\"upass\" type=\"password\" name=\"userpass\" required></div>\r\n");
      out.write("                                        <div style=\"margin-left: -13px;margin-top: 8px\" class=\"col-sm-1 \"> <i  id=\"toggleBtn\" onclick=\"togglePassword()\"  class=\"fas fa-eye\"></i></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <!-- Submit button -->\r\n");
      out.write("                                <a href=\"/profile?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.profile.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"\"  style=\"color: white\" class=\"btn btn-primary btn-block mb-4\">\r\n");
      out.write("                                    Cancel\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <button type=\"submit\"   style=\"color: white\" class=\"btn btn-primary btn-block mb-4\">\r\n");
      out.write("                                    Change\r\n");
      out.write("                                </button>\r\n");
      out.write("\r\n");
      out.write("                                <!-- msg is wrong username and pass -->\r\n");
      out.write("\r\n");
      out.write("                                <p class=\"text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                            </form>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- jQery -->\r\n");
      out.write("        <script src=\"js/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("        <!-- popper js -->\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\">\r\n");
      out.write("        </script>\r\n");
      out.write("        <!-- bootstrap js -->\r\n");
      out.write("        <script src=\"js/bootstrap.js\"></script>\r\n");
      out.write("        <!-- owl slider -->\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/owl.carousel.min.js\">\r\n");
      out.write("        </script>\r\n");
      out.write("        <!-- isotope js -->\r\n");
      out.write("        <script src=\"https://unpkg.com/isotope-layout@3.0.4/dist/isotope.pkgd.min.js\"></script>\r\n");
      out.write("        <!-- nice select -->\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-nice-select/1.1.0/js/jquery.nice-select.min.js\"></script>\r\n");
      out.write("        <!-- custom js -->\r\n");
      out.write("        <script src=\"js/custom.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap core JS-->\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("        <!-- Core theme JS-->\r\n");
      out.write("        <script src=\"js/scripts-1.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
