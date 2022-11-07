package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\r\n");
      out.write("        <meta name=\"description\" content=\"\" />\r\n");
      out.write("        <meta name=\"author\" content=\"\" />\r\n");
      out.write("        <title>Profile</title>\r\n");
      out.write("        <!-- Favicon-->\r\n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"assets/favicon.ico\" />\r\n");
      out.write("        <!-- Bootstrap icons-->\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <!-- Core theme CSS (includes Bootstrap)-->\r\n");
      out.write("        <link href=\"css/styles.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\"/>\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <section style=\"background-color: #eee;\">\r\n");
      out.write("            <div class=\"container py-5\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col\">\r\n");
      out.write("                        <nav aria-label=\"breadcrumb\" class=\"bg-light rounded-3 p-3 mb-4\">\r\n");
      out.write("                            <ol class=\"breadcrumb mb-0\">\r\n");
      out.write("                                <li class=\"breadcrumb-item\"><a href=\"home\" style=\"text-decoration: none\">Home</a></li>\r\n");
      out.write("                                <li class=\"breadcrumb-item active\" aria-current=\"page\">User Profile</li>\r\n");
      out.write("                            </ol>\r\n");
      out.write("                        </nav>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-4\">\r\n");
      out.write("                        <div class=\"card mb-4\">\r\n");
      out.write("                            <div class=\"card-body text-center\">\r\n");
      out.write("                                <img src=\"https://1.bp.blogspot.com/-r8taaC_nv5U/XngOYFjbRVI/AAAAAAAAZnc/QjGkkHS78GMm6CocQ1OqrWGgQTkG1oQNACLcBGAsYHQ/s1600/Avatar-Facebook%2B%25281%2529.jpg\" alt=\"avatar\"\r\n");
      out.write("                                     class=\"rounded-circle img-fluid\" style=\"width: 150px;\">\r\n");
      out.write("                                <h5 class=\"my-3\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${profile.displayName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h5>\r\n");
      out.write("                                <div class=\"d-flex justify-content-center mb-2\">\r\n");
      out.write("                                    <a href=\"#editprofile\" data-toggle=\"editprofile-modal\"  class=\"btn btn-outline-primary ms-1\">Edit Profile</a>\r\n");
      out.write("                                    <a href=\"#changepassword\" data-toggle=\"changepassword-modal\"  class=\"btn btn-outline-primary ms-1\">Edit Profile</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-8\">\r\n");
      out.write("                        <div class=\"card mb-4\">\r\n");
      out.write("                            <div class=\"card-body\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-sm-3\">\r\n");
      out.write("                                        <p class=\"mb-0\">Username</p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-sm-9\">\r\n");
      out.write("                                        <p class=\"text-muted mb-0\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${profile.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <hr>\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-sm-3\">\r\n");
      out.write("                                        <p  class=\"mb-0\">Password</p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div  class=\"col-sm-9\">\r\n");
      out.write("\r\n");
      out.write("                                        <input type=\"password\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${profile.password}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" style=\"border: 0 ; background-color: white\" disabled=\"\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <hr>\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-sm-3\">\r\n");
      out.write("                                        <p class=\"mb-0\">Full Name</p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-sm-9\">\r\n");
      out.write("                                        <p class=\"text-muted mb-0\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${profile.displayName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <hr>\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-sm-3\">\r\n");
      out.write("                                        <p class=\"mb-0\">Phone</p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-sm-9\">\r\n");
      out.write("                                        <p class=\"text-muted mb-0\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${profile.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <hr>\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-sm-3\">\r\n");
      out.write("                                        <p class=\"mb-0\">Role</p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <hr>\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-sm-3\">\r\n");
      out.write("                                        <p class=\"mb-0\">Address</p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-sm-9\">\r\n");
      out.write("                                        <p class=\"text-muted mb-0\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${profile.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- Edit profile -->\r\n");
      out.write("        <div id=\"editprofile\" class=\"editprofile-modal fade\">\r\n");
      out.write("            <div class=\"modal-dialog\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                    <form action=\"edit-profile\" method=\"post\">\r\n");
      out.write("                        <div class=\"modal-header\">\t\t\t\t\t\t\r\n");
      out.write("                            <h4 class=\"modal-title\">Edit Profile</h4>\r\n");
      out.write("                            <h6 style=\"color: #be123c\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h6>\r\n");
      out.write("                            <button style=\"background-color: white ; border: 0 ; font-weight: 700\" type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <script>\r\n");
      out.write("                            function togglePassword() {\r\n");
      out.write("                                var upass = document.getElementById('upass');\r\n");
      out.write("                                var toggleBtn = document.getElementById('toggleBtn');\r\n");
      out.write("\r\n");
      out.write("                                toggleBtn.onclick = (() => {\r\n");
      out.write("                                    if (upass.type === \"password\") {\r\n");
      out.write("                                        upass.type = \"text\";\r\n");
      out.write("\r\n");
      out.write("                                        toggleBtn.classList.add(\"bi bi-eye-slash-fill\");\r\n");
      out.write("                                    } else {\r\n");
      out.write("                                        upass.type = \"password\";\r\n");
      out.write("                                        toggleBtn.classList.remove(\"bi bi-eye-slash-fill\");\r\n");
      out.write("\r\n");
      out.write("                                    }\r\n");
      out.write("                                });\r\n");
      out.write("                            }\r\n");
      out.write("                        </script>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"modal-body\">\t\r\n");
      out.write("                            <a hidden >\r\n");
      out.write("                                <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${profile.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"id\" type=\"text\" class=\"form-control\" required>\r\n");
      out.write("                            </a>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>Name</label>\r\n");
      out.write("                                <input maxlength=\"32\" pattern=\"^[a-zA-Z]+(([',. -][a-zA-Z])?[a-zA-Z]*)*$\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${profile.displayName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"name\" type=\"text\" class=\"form-control\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>Phone</label>\r\n");
      out.write("                                <input pattern=\"^0[0-9]{9}\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${profile.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" title=\"Số điện thoại bao gồm 10 chữ số và bắt đầu bằng chữ số 0\" name=\"phone\" type=\"text\" class=\"form-control\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>Address</label>\r\n");
      out.write("                                <input maxlength=\"32\" pattern=\"^[a-zA-Z]+((,?[',. -][a-zA-Z])?[a-zA-Z]*\\.?)*$\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${profile.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"address\" type=\"text\" class=\"form-control\" required>\r\n");
      out.write("                            </div>       \r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>Password</label>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"row \">\r\n");
      out.write("                                    <div class=\"col-sm-11\"><input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${profile.password}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\"   id=\"upass\" type=\"password\" name=\"userpass\" required></div>\r\n");
      out.write("                                    <div style=\"margin-left: -13px;margin-top: 8px\" class=\"col-sm-1 \"> <i  id=\"toggleBtn\" onclick=\"togglePassword()\"  class=\"fas fa-eye\"></i></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"modal-footer\">\r\n");
      out.write("                            <input type=\"button\" class=\"btn btn-default\" style=\"background:#f5f5f5\" data-dismiss=\"modal\" value=\"Cancel\">\r\n");
      out.write("                            <input type=\"submit\" class=\"btn btn-success\" value=\"Edit\">\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- End edit profile -->\r\n");
      out.write("\r\n");
      out.write("        <!-- change password -->\r\n");
      out.write("        <div id=\"change-pass\" class=\"changepassword-modal fade\">\r\n");
      out.write("            <div class=\"modal-dialog\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                    <form action=\"edit-profile\" method=\"post\">\r\n");
      out.write("                        <div class=\"modal-header\">\t\t\t\t\t\t\r\n");
      out.write("                            <h4 class=\"modal-title\">Change password</h4>\r\n");
      out.write("                            <h6 style=\"color: #be123c\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h6>\r\n");
      out.write("                            <button style=\"background-color: white ; border: 0 ; font-weight: 700\" type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <script>\r\n");
      out.write("                            function togglePassword() {\r\n");
      out.write("                                var upass = document.getElementById('upass');\r\n");
      out.write("                                var toggleBtn = document.getElementById('toggleBtn');\r\n");
      out.write("\r\n");
      out.write("                                toggleBtn.onclick = (() => {\r\n");
      out.write("                                    if (upass.type === \"password\") {\r\n");
      out.write("                                        upass.type = \"text\";\r\n");
      out.write("\r\n");
      out.write("                                        toggleBtn.classList.add(\"bi bi-eye-slash-fill\");\r\n");
      out.write("                                    } else {\r\n");
      out.write("                                        upass.type = \"password\";\r\n");
      out.write("                                        toggleBtn.classList.remove(\"bi bi-eye-slash-fill\");\r\n");
      out.write("\r\n");
      out.write("                                    }\r\n");
      out.write("                                });\r\n");
      out.write("                            }\r\n");
      out.write("                        </script>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"modal-body\">\t\r\n");
      out.write("                            <a hidden >\r\n");
      out.write("                                <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${profile.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"id\" type=\"text\" class=\"form-control\" required>\r\n");
      out.write("                            </a>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>Old Password</label>\r\n");
      out.write("                                <div class=\"row \">\r\n");
      out.write("                                    <div class=\"col-sm-11\"><input value=\"\" class=\"form-control\"   id=\"oldpass\" type=\"password\" name=\"oldpass\" required></div>\r\n");
      out.write("                                    <div style=\"margin-left: -13px;margin-top: 8px\" class=\"col-sm-1 \"> <i  id=\"toggleBtn\" onclick=\"togglePassword()\"  class=\"fas fa-eye\"></i></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            div class=\"form-group\">\r\n");
      out.write("                            <label>New Password</label>\r\n");
      out.write("                            <div class=\"row \">\r\n");
      out.write("                                <div class=\"col-sm-11\"><input value=\"\" class=\"form-control\"   id=\"newpass\" type=\"password\" name=\"newpass\" required></div>\r\n");
      out.write("                                <div style=\"margin-left: -13px;margin-top: 8px\" class=\"col-sm-1 \"> <i  id=\"toggleBtn\" onclick=\"togglePassword()\"  class=\"fas fa-eye\"></i></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        div class=\"form-group\">\r\n");
      out.write("                        <label>Confirm Password</label>\r\n");
      out.write("                        <div class=\"row \">\r\n");
      out.write("                            <div class=\"col-sm-11\"><input value=\"\" class=\"form-control\"   id=\"confirmedpass\" type=\"password\" name=\"confirmedpass\" required></div>\r\n");
      out.write("                            <div style=\"margin-left: -13px;margin-top: 8px\" class=\"col-sm-1 \"> <i  id=\"toggleBtn\" onclick=\"togglePassword()\"  class=\"fas fa-eye\"></i></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <input type=\"button\" class=\"btn btn-default\" style=\"background:#f5f5f5\" data-dismiss=\"modal\" value=\"Cancel\">\r\n");
      out.write("                <input type=\"submit\" class=\"btn btn-success\" value=\"Edit\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- change password -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- jQery -->\r\n");
      out.write("<script src=\"js/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("<!-- popper js -->\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\">\r\n");
      out.write("</script>\r\n");
      out.write("<!-- bootstrap js -->\r\n");
      out.write("<script src=\"js/bootstrap.js\"></script>\r\n");
      out.write("<!-- owl slider -->\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/owl.carousel.min.js\">\r\n");
      out.write("</script>\r\n");
      out.write("<!-- isotope js -->\r\n");
      out.write("<script src=\"https://unpkg.com/isotope-layout@3.0.4/dist/isotope.pkgd.min.js\"></script>\r\n");
      out.write("<!-- nice select -->\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-nice-select/1.1.0/js/jquery.nice-select.min.js\"></script>\r\n");
      out.write("<!-- custom js -->\r\n");
      out.write("<script src=\"js/custom.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap core JS-->\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("<!-- Core theme JS-->\r\n");
      out.write("<script src=\"js/scripts-1.js\"></script>\r\n");
      out.write("</body>\r\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${profile.isAdmin == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                        <div class=\"col-sm-9\">\r\n");
        out.write("                                            <p class=\"text-muted mb-0\">Admin</p>\r\n");
        out.write("                                        </div>\r\n");
        out.write("                                    ");
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${profile.isCustomer == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                        <div class=\"col-sm-9\">\r\n");
        out.write("                                            <p class=\"text-muted mb-0\">Customer</p>\r\n");
        out.write("                                        </div>\r\n");
        out.write("                                    ");
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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${profile.isShipper == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                        <div class=\"col-sm-9\">\r\n");
        out.write("                                            <p class=\"text-muted mb-0\">Shipper</p>\r\n");
        out.write("                                        </div>\r\n");
        out.write("                                    ");
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
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${profile.isSeller == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                        <div class=\"col-sm-9\">\r\n");
        out.write("                                            <p class=\"text-muted mb-0\">Seller</p>\r\n");
        out.write("                                        </div>\r\n");
        out.write("                                    ");
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
}
