package controller;

import dao.AccountDAO;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import dao.AccountDAO;
import java.io.IOException;
import java.io.PrintWriter;
import model.Account;


public class Profile extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        AccountDAO dao = new AccountDAO();
        String id1 = request.getParameter("id");
        int id = Integer.parseInt(id1);
        Account profile = dao.getAccountByID(id);
        System.out.println(profile);
        request.setAttribute("profile", profile);
        request.getRequestDispatcher("profile.jsp").forward(request, response);
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
