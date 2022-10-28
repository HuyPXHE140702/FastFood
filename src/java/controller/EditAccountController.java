/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.Impl.AccountDAOImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Account;

/**
 *
 * @author vinhnv
 */
public class EditAccountController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");
        int role = Integer.parseInt(request.getParameter("role"));

        AccountDAOImpl accdao = new AccountDAOImpl();
        String user = accdao.getUsernameById(id);
        Account account = accdao.checkAccountExist(username);
        String url = "loadAccount?accountid=" + id;
        if (account == null || username.equals(user)) {
            //dc add
            switch (role) {
                case 1:
                    //add customer
                    accdao.editAccountById(username, password, name, address, phone, 1, 0, 0, id);
                    request.setAttribute("msg", "Update account information successfully!");
                    request.getRequestDispatcher(url).forward(request, response);
                    break;
                case 2:
                    //add seller
                    accdao.editAccountById(username, password, name, address, phone, 0, 0, 1, id);
                    request.setAttribute("msg", "Update account information successfully!");
                    request.getRequestDispatcher(url).forward(request, response);
                    break;
                case 3:
                    //add shipper
                    accdao.editAccountById(username, password, name, address, phone, 0, 1, 0, id);
                    request.setAttribute("msg", "Update account information successfully!");
                    request.getRequestDispatcher(url).forward(request, response);
                    break;
            }
        } else {
            //ko dc add
            request.setAttribute("error", "Username exist");
            request.getRequestDispatcher(url).forward(request, response);
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
