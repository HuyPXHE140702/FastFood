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
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Account;

public class AdminController extends HttpServlet {

    // private List<Account> accountList;
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
        try {
            int page = 1;
            int recordsPerPage = 3;
            if (request.getParameter("page") != null) {
                page = Integer.parseInt(request.getParameter("page"));
            }
            String role = (String) request.getParameter("roles");
            AccountDAO dao = new AccountDAO();
            List<Account> accountList = dao.viewAllAccounts((page - 1) * recordsPerPage, recordsPerPage);
            int noOfRecords = dao.getNoOfRecords();
            int noOfPages = (int) Math.ceil(noOfRecords * 1.0 / recordsPerPage);
            request.setAttribute("listAccounts", accountList);
            request.setAttribute("noOfPages", noOfPages);
            request.setAttribute("currentPage", page);
            request.getRequestDispatcher("admin.jsp").forward(request, response);
        } catch (Exception e) {
            response.sendRedirect("error_Database.jsp");
        }

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            int page = 1;
            int recordsPerPage = 3;
            if (request.getParameter("page") != null) {
                page = Integer.parseInt(request.getParameter("page"));
            }
            String name = request.getParameter("Displayname");
            String role = (String) request.getParameter("roles");
            String setRole = "";
            String condition = "WHERE Displayname like '%" + name + "%' ";
            if (role.equalsIgnoreCase("all")) {
                setRole = "";
            } else if (role.equalsIgnoreCase("admin")) {
                setRole = "and isAdmin = 1";
            } else if (role.equalsIgnoreCase("customer")) {
                setRole = "and isCustomer = 1";
            } else if (role.equalsIgnoreCase("seller")) {
                setRole = "and isSaller = 1";
            } else if (role.equalsIgnoreCase("shipper")) {
                setRole = "and isShipper = 1";
            }
            List<Account> accountList = new AccountDAO().getAccountByName(name, setRole, (page - 1) * recordsPerPage);
            int noOfRecords = new AccountDAO().getNoOfRecordsPost(condition + setRole);
            int noOfPages = (int) Math.ceil(noOfRecords * 1.0 / recordsPerPage);
            request.setAttribute("noOfPages", noOfPages);
            request.setAttribute("currentPage", page);
            request.setAttribute("listAccounts", accountList);
            request.getRequestDispatcher("admin.jsp").forward(request, response);
        } catch (Exception e) {
            response.sendRedirect("error_Database.jsp");
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
