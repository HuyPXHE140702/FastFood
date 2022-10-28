/*
 * Copyright(C) 2005, FPT University
 * Java MVC:
 *  Fast Food Shop
 *
 * Record of change:
 * DATE            Version             AUTHOR                   DESCRIPTION
 * 2022-10-02      1.0                 HuyPXHE140702            First Implement
 */
package controller;

import dao.AccountDAO;
import dao.impl.AccountDAOImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * The class contains method to delete an account for Admin role<br>
 * The method wil throw an object of  <code>java.lang.Exception</code> class if
 * there is any error occurring when finding, inserting, or updating data<br>
 *
 * @author HuyPX
 */
public class DeleteAccountController extends HttpServlet {

    /**
     * Get a list of Account for Admin role to view, edit, add with paging <br>
     * The result contain a list of <code>model.Account </code> objects <br>
     *
     * @param accountDAO get connection from Database
     * @param accountId get accountID to delete
     * @param request set attribute for jsp page
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws SQLException if an SQL error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            int accountID = Integer.parseInt(request.getParameter("accountid"));
            AccountDAO accountDAO = new AccountDAOImpl();
            accountDAO.deleteAcountByID(accountID);
            response.sendRedirect("admin");
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
