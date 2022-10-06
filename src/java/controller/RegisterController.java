package controller;

import dao.AccountDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Account;

public class RegisterController extends HttpServlet {
  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
    try (PrintWriter out = response.getWriter()) {
      /* TODO output your page here. You may use following sample code. */
      //set input 
      String firstname = request.getParameter("firstname");
      String lastname = request.getParameter("lastname");
      String displayname = firstname + " " + lastname;
      String username = request.getParameter("username");
      String phone = request.getParameter("phone");
      String address = request.getParameter("address");
      String password = request.getParameter("password");
      AccountDAO dao = new AccountDAO();
      Account account = dao.checkAccountExist(username);
      if (account == null) {
        // dc signup
        dao.signup(username, password, displayname, address, phone);
        request.setAttribute("alert", "Register successfully");
        request.getRequestDispatcher("login.jsp").forward(request, response);
      } else {
        // day ve signup
        request.setAttribute("msg", "Username exist");
        request.getRequestDispatcher("register.jsp").forward(request, response);
      }

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
    processRequest(request, response);
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
    processRequest(request, response);
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
