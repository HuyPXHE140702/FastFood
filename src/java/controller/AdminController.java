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
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Account;

/**
 * The class contains method for view account list, add or update an account,
 * search and paging <br>
 * The method wil throw an object of  <code>java.lang.Exception</code> class if
 * there is any error occurring when finding, inserting, or updating data <br>
 *
 * @author HuyPX
 */
public class AdminController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    /**
     * Get a list of Account for Admin role to view, edit, add with paging <br>
     * The result contain a list of <code>model.Account </code> objects <br>
     *
     * @param accountDAO get connection from Database
     * @param accountList request data from Database
     * @param request set attribute for jsp page
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws SQLException if an SQL error occurs
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
            AccountDAO accountDAO = new AccountDAOImpl();
            //get all account with paging
            List<Account> accountList = accountDAO.viewAllAccounts((page - 1) * recordsPerPage, recordsPerPage);
            int noOfRecords = accountDAO.getNoOfRecords();
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
     * Get a list of Account for Admin when search by name <br>
     * The result contain a list of <code>model.Account </code> objects <br>
     *
     * @param baseDAO get connection from Database
     * @param accountList request data from Database
     * @param request set attribute for jsp page
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws SQLException if an SQL error occurs
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
            //get role for sql purpose
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
            //get all account with paging and name contain
            AccountDAO accountDAO = new AccountDAOImpl();
            List<Account> accountList = accountDAO.getAccountByName(name, setRole, (page - 1) * recordsPerPage);
            int noOfRecords = new AccountDAOImpl().getNoOfRecordsPost(condition + setRole);
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
