package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/component/header.jsp");
    _jspx_dependants.add("/component/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <!-- Basic -->\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("        <!-- Mobile Metas -->\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\r\n");
      out.write("        <!-- Site Metas -->\r\n");
      out.write("        <meta name=\"keywords\" content=\"\" />\r\n");
      out.write("        <meta name=\"description\" content=\"\" />\r\n");
      out.write("        <meta name=\"author\" content=\"\" />\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/favicon.png\" type=\"\">\r\n");
      out.write("\r\n");
      out.write("        <title> FastFood </title>\r\n");
      out.write("        <!-- all for blog  -->\r\n");
      out.write("\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;700;900&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Dancing+Script:wght@400;500;600;700&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/animate.css\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.theme.default.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/flaticon.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/styleblog.css\">\r\n");
      out.write("        <!-- bootstrap core css -->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.css\" />\r\n");
      out.write("\r\n");
      out.write("        <!--owl slider stylesheet -->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.carousel.min.css\" />\r\n");
      out.write("        <!-- nice select  -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-nice-select/1.1.0/css/nice-select.min.css\" integrity=\"sha512-CruCP+TD3yXzlvvijET8wV5WxxEh5H8P4cmz0RFbKK6FlZ2sYl3AEsKlLPHbniXKSrDdFewhbmBK5skbdsASbQ==\" crossorigin=\"anonymous\" />\r\n");
      out.write("        <!-- font awesome style -->\r\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom styles for this template -->\r\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <!-- responsive style -->\r\n");
      out.write("        <link href=\"css/responsive.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <!-- Favicon-->\r\n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"assets/favicon.ico\" />\r\n");
      out.write("        <!-- Bootstrap icons-->\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <!-- Core theme CSS (includes Bootstrap)-->\r\n");
      out.write("        <link href=\"css/styles.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <link href=\"css/styles-1.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body >\r\n");
      out.write("\r\n");
      out.write("        <div class=\"hero_area \">\r\n");
      out.write("            <div class=\"bg-box \">\r\n");
      out.write("                <img src=\"images/bg_2.jpg\" alt=\"\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- header section strats -->\r\n");
      out.write("\r\n");
      out.write("            <div >\r\n");
      out.write("                ");
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
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!-- end header section -->\r\n");
      out.write("            <!-- slider section -->\r\n");
      out.write("\r\n");
      out.write("            <section class=\"slider_section \">\r\n");
      out.write("                <div id=\"customCarousel1\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("                    <div class=\"carousel-inner\">\r\n");
      out.write("                        <div class=\"carousel-item active\">\r\n");
      out.write("                            <div class=\"container \">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-md-7 col-lg-6 \">\r\n");
      out.write("                                        <div class=\"detail-box\" style=\"margin-bottom: 35px\">\r\n");
      out.write("                                            <h1 style=\"color: white;font-size: 80px\">\r\n");
      out.write("                                                Fast Food Restaurant\r\n");
      out.write("                                            </h1>\r\n");
      out.write("                                            <p style=\"width: 100% \" >\r\n");
      out.write("                                                Present in more than 118 countries with a chain of 35,000 \r\n");
      out.write("                                                restaurants on all continents, every day, Global FastFood \r\n");
      out.write("                                                serves more than 70 million consumers, not only ensuring to bring them delicious, safe and hygienic meals. \r\n");
      out.write("                                                , but also make them satisfied with FastFood's service.\r\n");
      out.write("                                            </p>\r\n");
      out.write("\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"carousel-item \">\r\n");
      out.write("                            <div class=\"container \">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-md-7 col-lg-6 \">\r\n");
      out.write("                                        <div class=\"detail-box\" style=\"margin-bottom: 35px\">\r\n");
      out.write("                                            <h1 style=\"color: white;font-size: 80px\">\r\n");
      out.write("                                                Fast Food Restaurant\r\n");
      out.write("                                            </h1>\r\n");
      out.write("                                            <p style=\"width: 100% \">\r\n");
      out.write("                                                Grasping the needs of Vietnamese consumers today, we aim to serve fast but hygienic, nutritious meals with professional service.\r\n");
      out.write("                                            </p>\r\n");
      out.write("\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"carousel-item\">\r\n");
      out.write("                            <div class=\"container \">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-md-7 col-lg-6 \">\r\n");
      out.write("                                        <div class=\"detail-box\" style=\"margin-bottom: 35px\">\r\n");
      out.write("                                            <h1 style=\"color: white;font-size: 80px\">\r\n");
      out.write("                                                Fast Food Restaurant\r\n");
      out.write("                                            </h1>\r\n");
      out.write("                                            <p style=\"width: 100% \">\r\n");
      out.write("                                                FastFood Vietnam is committed to applying the standards of FastFood globally, which are: Quality, Service, Cleanliness & Values.\r\n");
      out.write("                                            </p>\r\n");
      out.write("\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <ol class=\"carousel-indicators\">\r\n");
      out.write("                            <li data-target=\"#customCarousel1\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("                            <li data-target=\"#customCarousel1\" data-slide-to=\"1\"></li>\r\n");
      out.write("                            <li data-target=\"#customCarousel1\" data-slide-to=\"2\"></li>\r\n");
      out.write("                        </ol>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </section>\r\n");
      out.write("            <!-- end slider section -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- end slider section -->\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <br>\r\n");
      out.write("\r\n");
      out.write("    <!-- food section -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <section class=\"food_section layout_padding-bottom\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"heading_container heading_center  text-center heading-section ftco-animate\">\r\n");
      out.write("                <span class=\"subheading\">Specialties</span>\r\n");
      out.write("                <strong style=\"font-size: 240%\">Our Menu</strong>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!--            <ul class=\"filters_menu\">\r\n");
      out.write("                            <li class=\"active\" data-filter=\"*\">All</li>\r\n");
      out.write("                            <li data-filter=\".burger\">Burger</li>\r\n");
      out.write("                            <li data-filter=\".pizza\">Pizza</li>\r\n");
      out.write("                            <li data-filter=\".pasta\">Pasta</li>\r\n");
      out.write("                            <li data-filter=\".fries\">Fries</li>\r\n");
      out.write("                        </ul>-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"filters-content\">\r\n");
      out.write("                <div class=\"row grid ftco-animate\">\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    <div class=\"btn-box\">\r\n");
      out.write("                        <a href=\"menu\" style=\"text-decoration: none\">\r\n");
      out.write("                            View Menu\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div> \r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    <section class=\"food_section layout_padding-bottom ftco-animate\">\r\n");
      out.write("        <div class=\"container \">\r\n");
      out.write("            <div class=\"heading_container heading_center  text-center heading-section ftco-animate\">\r\n");
      out.write("                <span class=\"subheading\">New</span>\r\n");
      out.write("                <!--                <h2>\r\n");
      out.write("                                    Newest Food\r\n");
      out.write("                                </h2>-->\r\n");
      out.write("\r\n");
      out.write("                <strong style=\"font-size: 240%\">Newest Food</strong>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"filters-content\">\r\n");
      out.write("                <div class=\"row grid\">\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    <div class=\"btn-box\">\r\n");
      out.write("                        <a href=\"menu\" style=\"text-decoration: none\">\r\n");
      out.write("                            View Menu\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div> \r\n");
      out.write("        </div>\r\n");
      out.write("    </section> \r\n");
      out.write("    <!-- end food section -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!--    <section class=\"client_section layout_padding-bottom\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"heading_container heading_center psudo_white_primary mb_45\">\r\n");
      out.write("                    <h2>\r\n");
      out.write("                        What Says Our Customers\r\n");
      out.write("                    </h2>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"carousel-wrap row \">\r\n");
      out.write("                    <div class=\"owl-carousel client_owl-carousel\">\r\n");
      out.write("                        <div class=\"item\">\r\n");
      out.write("                            <div class=\"box\">\r\n");
      out.write("                                <div class=\"detail-box\">\r\n");
      out.write("                                    <p>\r\n");
      out.write("                                        Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam\r\n");
      out.write("                                    </p>\r\n");
      out.write("                                    <h6>\r\n");
      out.write("                                        Moana Michell\r\n");
      out.write("                                    </h6>\r\n");
      out.write("                                    <p>\r\n");
      out.write("                                        magna aliqua\r\n");
      out.write("                                    </p>\r\n");
      out.write("                                </div>\r\n");
      out.write("    \r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"item\">\r\n");
      out.write("                            <div class=\"box\">\r\n");
      out.write("                                <div class=\"detail-box\">\r\n");
      out.write("                                    <p>\r\n");
      out.write("                                        Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam\r\n");
      out.write("                                    </p>\r\n");
      out.write("                                    <h6>\r\n");
      out.write("                                        Mike Hamell\r\n");
      out.write("                                    </h6>\r\n");
      out.write("                                    <p>\r\n");
      out.write("                                        magna aliqua\r\n");
      out.write("                                    </p>\r\n");
      out.write("                                </div>\r\n");
      out.write("    \r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    </section>-->\r\n");
      out.write("\r\n");
      out.write("    <!-- end client section -->  \r\n");
      out.write("    <!-- blog section -->      \r\n");
      out.write("    <section class=\"ftco-section bg-light\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row justify-content-center mb-5 pb-2\">\r\n");
      out.write("                <div class=\"col-md-7 text-center heading-section ftco-animate\">\r\n");
      out.write("                    <span class=\"subheading\">Blog</span>\r\n");
      out.write("\r\n");
      out.write("                    <strong style=\"font-size: 240%\">Recent Blog</strong>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-4 ftco-animate\">\r\n");
      out.write("                    <div class=\"blog-entry\">\r\n");
      out.write("                        <a class=\"block-20\" style=\"background-image: url('images/Fast-Food-and-Junk-Food-4-1.jpg');\">\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <div class=\"text px-4 pt-3 pb-4\">\r\n");
      out.write("                            <div class=\"meta\">\r\n");
      out.write("                                <div><a href=\"#\">Sep 24, 2022</a></div>\r\n");
      out.write("                                <div><a href=\"#\">Admin</a></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <h3 class=\"heading\"><a target=\"_blank\" href=\"https://foodtolive.com/healthy-blog/fast-food-junk-food-difference/\">Fast Food and Junk Food: Is There Any Difference</a></h3>\r\n");
      out.write("<!--                            <p class=\"clearfix\">\r\n");
      out.write("                                <a target=\"_blank\"  href=\"https://foodtolive.com/healthy-blog/fast-food-junk-food-difference/\" class=\"float-left read btn btn-primary\">Read more</a>\r\n");
      out.write("                                                            <a href=\"#\" class=\"float-right meta-chat\"><span class=\"fa fa-comment\"></span> 3</a>\r\n");
      out.write("                            </p>-->\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-4 ftco-animate\">\r\n");
      out.write("                    <div class=\"blog-entry\">\r\n");
      out.write("                        <a class=\"block-20\" style=\"background-image: url('images/565b3881692c5f5c4402fa8ebc0e4675_wendys-Salads.jpg');\">\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <div class=\"text px-4 pt-3 pb-4\">\r\n");
      out.write("                            <div class=\"meta\">\r\n");
      out.write("                                <div><a href=\"#\">Sep 24, 2022</a></div>\r\n");
      out.write("                                <div><a href=\"#\">Admin</a></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <h3 class=\"heading\"><a target=\"_blank\" href=\"https://www.hungryforever.com/recreate-wendys-salads-at-home/\">Recreate Wendy’s Salads at Home</a></h3>\r\n");
      out.write("                            <br>\r\n");
      out.write("<!--                            <p class=\"clearfix\">\r\n");
      out.write("                                <a target=\"_blank\"  href=\"https://www.hungryforever.com/recreate-wendys-salads-at-home/\" class=\"float-left read btn btn-primary\">Read more</a>\r\n");
      out.write("                                                            <a href=\"#\" class=\"float-right meta-chat\"><span class=\"fa fa-comment\"></span> 3</a>\r\n");
      out.write("                            </p>-->\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-4 ftco-animate\">\r\n");
      out.write("                    <div class=\"blog-entry\">\r\n");
      out.write("                        <a  class=\"block-20\" style=\"background-image: url('images/blog_04_2-1170x725.jpg');\">\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <div class=\"text px-4 pt-3 pb-4\">\r\n");
      out.write("                            <div class=\"meta\">\r\n");
      out.write("                                <div><a href=\"#\">Sep 24, 2022</a></div>\r\n");
      out.write("                                <div><a href=\"#\">Admin</a></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <h3 class=\"heading\"><a target=\"_blank\" href=\"https://hotdogonline.com/2019/09/11/your-perfect-burger-2/\">Choose Your Perfect Burger</a></h3>\r\n");
      out.write("                            <br>\r\n");
      out.write("<!--                            <p class=\"clearfix\">\r\n");
      out.write("                                <a target=\"_blank\"  href=\"https://hotdogonline.com/2019/09/11/your-perfect-burger-2/\" class=\"float-left read btn btn-primary\">Read more</a>\r\n");
      out.write("                                <a href=\"#\" class=\"float-right meta-chat\"><span class=\"fa fa-comment\"></span> 3</a>\r\n");
      out.write("                            </p>-->\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- end blog section -->      \r\n");
      out.write("    <!-- footer section -->\r\n");
      out.write("    ");
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
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("       \r\n");
      out.write("        \r\n");
      out.write("        <footer class=\"footer_section\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-4 footer-col\">\r\n");
      out.write("          <div class=\"footer_contact\">\r\n");
      out.write("            <h4 style=\"color: white\">\r\n");
      out.write("              Contact Us\r\n");
      out.write("            </h4>\r\n");
      out.write("            <div class=\"contact_link_box\">\r\n");
      out.write("                <a style=\"text-decoration: none\" target=\"_blank\" href=\"https://www.google.com/maps/place/Tr%C6%B0%E1%BB%9Dng+%C4%90%E1%BA%A1i+H%E1%BB%8Dc+FPT/@21.01325,105.5248756,17z/data=!3m1!4b1!4m5!3m4!1s0x31345b465a4e65fb:0xaae6040cfabe8fe!8m2!3d21.01325!4d105.5270643?hl=vi-VN\">\r\n");
      out.write("                <i class=\"fa fa-map-marker\" aria-hidden=\"true\"></i>\r\n");
      out.write("                <span >\r\n");
      out.write("                  DH FPT Ha Noi\r\n");
      out.write("                </span>\r\n");
      out.write("              </a>\r\n");
      out.write("              <a >\r\n");
      out.write("                <i class=\"fa fa-phone\" aria-hidden=\"true\"></i>\r\n");
      out.write("                <span>\r\n");
      out.write("                  Call +84 1234567890\r\n");
      out.write("                </span>\r\n");
      out.write("              </a>\r\n");
      out.write("              <a >\r\n");
      out.write("                <i class=\"fa fa-envelope\" aria-hidden=\"true\"></i>\r\n");
      out.write("                <span >\r\n");
      out.write("                  fastfood@gmail.com\r\n");
      out.write("                </span>\r\n");
      out.write("              </a>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-4 footer-col\">\r\n");
      out.write("          <div class=\"footer_detail\">\r\n");
      out.write("            <a  class=\"footer-logo\">\r\n");
      out.write("              FastFood\r\n");
      out.write("            </a>\r\n");
      out.write("\r\n");
      out.write("              <p>Some people call it a sizzle. We think of it as an anthem.</p>\r\n");
      out.write("              <p style=\"text-align: center\">- Ruth’s Chris Steakhouse -</p>\r\n");
      out.write("            <div class=\"footer_social\">\r\n");
      out.write("              <a href=\"\">\r\n");
      out.write("                <i class=\"fa fa-facebook\" aria-hidden=\"true\"></i>\r\n");
      out.write("              </a>\r\n");
      out.write("              <a href=\"\">\r\n");
      out.write("                <i class=\"fa fa-twitter\" aria-hidden=\"true\"></i>\r\n");
      out.write("              </a>\r\n");
      out.write("              <a href=\"\">\r\n");
      out.write("                <i class=\"fa fa-linkedin\" aria-hidden=\"true\"></i>\r\n");
      out.write("              </a>\r\n");
      out.write("              <a href=\"\">\r\n");
      out.write("                <i class=\"fa fa-instagram\" aria-hidden=\"true\"></i>\r\n");
      out.write("              </a>\r\n");
      out.write("              <a href=\"\">\r\n");
      out.write("                <i class=\"fa fa-pinterest\" aria-hidden=\"true\"></i>\r\n");
      out.write("              </a>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-4 footer-col\">\r\n");
      out.write("            <h4 style=\"color: white\">\r\n");
      out.write("            Opening Hours\r\n");
      out.write("          </h4>\r\n");
      out.write("          <p>\r\n");
      out.write("            Everyday\r\n");
      out.write("          </p>\r\n");
      out.write("          <p>\r\n");
      out.write("            10.00 Am -10.00 Pm\r\n");
      out.write("          </p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("    </div>\r\n");
      out.write("  </footer>\r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("    <!-- footer section -->\r\n");
      out.write("\r\n");
      out.write("    <!-- jQery -->\r\n");
      out.write("    <script src=\"js/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("    <!-- popper js -->\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\">\r\n");
      out.write("    </script>\r\n");
      out.write("    <!-- bootstrap js -->\r\n");
      out.write("    <script src=\"js/bootstrap.js\"></script>\r\n");
      out.write("    <!-- owl slider -->\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/owl.carousel.min.js\">\r\n");
      out.write("    </script>\r\n");
      out.write("    <!-- isotope js -->\r\n");
      out.write("    <script src=\"https://unpkg.com/isotope-layout@3.0.4/dist/isotope.pkgd.min.js\"></script>\r\n");
      out.write("    <!-- nice select -->\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-nice-select/1.1.0/js/jquery.nice-select.min.js\"></script>\r\n");
      out.write("    <!-- custom js -->\r\n");
      out.write("    <script src=\"js/custom.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap core JS-->\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("    <!-- Core theme JS-->\r\n");
      out.write("    <script src=\"js/scripts-1.js\"></script>\r\n");
      out.write("    <!-- Core theme JS for Blog-->\r\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery-migrate-3.0.1.min.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.waypoints.min.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.stellar.min.js\"></script>\r\n");
      out.write("    <script src=\"js/owl.carousel.min.js\"></script>\r\n");
      out.write("    <script src=\"js/scrollax.min.js\"></script>\r\n");
      out.write("    <script src=\"js/main.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js\"></script>\r\n");
      out.write("</body>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listspecialfood}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("f");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <div class=\"col-sm-6 col-lg-4 all pizza\">\r\n");
          out.write("                            <div class=\"box\">\r\n");
          out.write("\r\n");
          out.write("                                <div>\r\n");
          out.write("                                    <div class=\"img-box\">\r\n");
          out.write("                                        <a href=\"DetailFood?foodid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.foodid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                            <img style=\"background: #f1f2f3\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\">\r\n");
          out.write("                                        </a>  \r\n");
          out.write("                                    </div >\r\n");
          out.write("                                    <div class=\"detail-box\">\r\n");
          out.write("                                        <h5 style=\"color: white\">\r\n");
          out.write("                                            ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.foodname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                        </h5>\r\n");
          out.write("                                        <p style=\"min-height: 80px\">\r\n");
          out.write("                                            ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                        </p>\r\n");
          out.write("                                        <div class=\"options\">\r\n");
          out.write("                                            <h6 style=\"font-size: 20px\">\r\n");
          out.write("                                                $");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.unitprice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                            </h6>\r\n");
          out.write("                                            <!-- add to cart o day -->\r\n");
          out.write("                                            <a href=\"add-to-cart?foodid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.foodid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"background-color: #ffdf9a\">\r\n");
          out.write("                                                <i style=\"color: black \" class=\"bi bi-cart2\" ></i>\r\n");
          out.write("                                            </a>\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                </div>\r\n");
          out.write("                            </div>\r\n");
          out.write("                        </div>\r\n");
          out.write("                    ");
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

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listnewestfood}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("f");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <div class=\"col-sm-6 col-lg-4 all pizza\">\r\n");
          out.write("                            <div class=\"box\">\r\n");
          out.write("\r\n");
          out.write("                                <div>\r\n");
          out.write("                                    <div class=\"img-box\">\r\n");
          out.write("                                        <a href=\"DetailFood?foodid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.foodid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                            <img style=\"background: #f1f2f3\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\">\r\n");
          out.write("                                        </a>  \r\n");
          out.write("                                    </div >\r\n");
          out.write("                                    <div class=\"detail-box\">\r\n");
          out.write("                                        <h5 style=\"color: white\">\r\n");
          out.write("                                            ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.foodname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                        </h5>\r\n");
          out.write("                                        <p style=\"min-height: 80px\">\r\n");
          out.write("                                            ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                        </p>\r\n");
          out.write("                                        <div class=\"options\">\r\n");
          out.write("                                            <h6 style=\"font-size: 20px\">\r\n");
          out.write("                                                $");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.unitprice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                            </h6>\r\n");
          out.write("                                            <!-- add to cart o day -->\r\n");
          out.write("                                             <a href=\"add-to-cart?foodid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.foodid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"background-color: #ffdf9a\">\r\n");
          out.write("                                                <i style=\"color: black \" class=\"bi bi-cart2\" ></i>\r\n");
          out.write("                                            </a>\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                </div>\r\n");
          out.write("                            </div>\r\n");
          out.write("                        </div>\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
