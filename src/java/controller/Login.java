package controller;

import dao.AccountDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Account;

public class Login extends HttpServlet {

  /**
   * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
   * methods.
   *
   * @param request  servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException      if an I/O error occurs
   */
  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    try (PrintWriter out = response.getWriter()) {
      /* TODO output your page here. You may use following sample code. */

    }
  }

  // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the
  // + sign on the left to edit the code.">
  /**
   * Handles the HTTP <code>GET</code> method.
   *
   * @param request  servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException      if an I/O error occurs
   */
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    // Cookie[] cookies = request.getCookies();
    // String username = null;
    // String password = null;
    // for (Cookie cooky : cookies) {
    // if (cooky.getName().equals("username")) {
    // username = cooky.getValue();
    // }
    // if (cooky.getName().equals("password")) {
    // password = cooky.getValue();
    // }
    // if (username != null && password != null) {
    // break;
    // }
    // }
    // if (username != null && password != null) {
    // Account account = new AccountDAO().login(username, password);
    // if (account != null) {//cokkie hop le
    // request.getSession().setAttribute("account", account);
    // response.sendRedirect("home");
    // return;
    // }
    // }
    // request.getRequestDispatcher("login.jsp").forward(request, response);

  }

  /**
   * Handles the HTTP <code>POST</code> method.
   *
   * @param request  servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException      if an I/O error occurs
   */
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    AccountDAO dao = new AccountDAO();
    Account account = dao.login(username, password);
    //check input 
    if (account == null) {
      //get fail request 
      request.setAttribute("msg", "Wrong username or password.");
      request.getRequestDispatcher("login.jsp").forward(request, response);
    } else {
      //create session and save
      HttpSession session = request.getSession();
      session.setAttribute("acc", account);
      // session.setMaxInactiveInterval(300);
      response.sendRedirect("home");
    }
  }

  /**
   * Returns a short description of the servlet.
   *
   * @return a String containing servlet description
   */
  @Override
  public String getServletInfo() {
    return "Short description";
  }// </editor-fold>

}