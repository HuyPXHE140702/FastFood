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
import java.util.ArrayList;
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

    private String name = "";
    private String role = "";
    String setRole = "";
    //String condition = "WHERE Displayname like '%" + name.trim() + "%' ";

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
            //get all account with paging
            List<Account> temp = new ArrayList<>();
            AccountDAO accountDAO = new AccountDAOImpl();
            List<Account> accountList = new ArrayList<>();
            //get all account with paging and name contain
           
            accountList = accountDAO.getAccountByNamePaging(name.trim(), setRole);
            if (accountList.size() > 0) {
                if (page == 1) {
                    if (accountList.size() <= recordsPerPage) {
                        for (int i = 0; i < accountList.size(); i++) {
                            temp.add(accountList.get((page - 1) * recordsPerPage + i));
                        }
                    } else if (accountList.size() > recordsPerPage) {
                        for (int i = 0; i < recordsPerPage; i++) {
                            temp.add(accountList.get((page - 1) * recordsPerPage + i));
                        }
                    }
                } else if (page > 1) {
                    int remainSize = accountList.size() - recordsPerPage * (page - 1);
                    if (remainSize >= 0 && remainSize <= recordsPerPage) {
                        for (int i = 0; i < remainSize; i++) {
                            temp.add(accountList.get((page - 1) * recordsPerPage + i));
                        }
                    } else if (remainSize >= 0 && remainSize > recordsPerPage) {
                        for (int i = 0; i < recordsPerPage; i++) {
                            temp.add(accountList.get((page - 1) * recordsPerPage + i));
                        }
                    }
                }
            }
            int noOfRecords = accountList.size();
            int noOfPages = (int) Math.ceil(noOfRecords * 1.0 / recordsPerPage);
            request.setAttribute("listAccounts", temp);
            request.setAttribute("noOfPages", noOfPages);
            request.setAttribute("currentPage", page);
            request.setAttribute("nameSearch", name);
            request.setAttribute("roleSelect", role);
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
            AccountDAO accountDAO = new AccountDAOImpl();
            List<Account> accountList = new ArrayList<>();
            //get all account with paging and name contain
             String tmp = name.trim();
            accountList = accountDAO.getAccountByNamePaging(name.trim(), setRole);
            List<Account> temp = new ArrayList<>();
            if (accountList.size() > 0) {
                if (page == 1) {
                    if (accountList.size() <= recordsPerPage) {
                        for (int i = 0; i < accountList.size(); i++) {
                            temp.add(accountList.get((page - 1) * recordsPerPage + i));
                        }
                    } else if (accountList.size() > recordsPerPage) {
                        for (int i = 0; i < recordsPerPage; i++) {
                            temp.add(accountList.get((page - 1) * recordsPerPage + i));
                        }
                    }
                } else if (page > 1) {
                    int remainSize = accountList.size() - recordsPerPage * (page - 1);
                    if (remainSize >= 0 && remainSize <= recordsPerPage) {
                        for (int i = 0; i < remainSize; i++) {
                            temp.add(accountList.get((page - 1) * recordsPerPage + i));
                        }
                    } else if (remainSize >= 0 && remainSize > recordsPerPage) {
                        for (int i = 0; i < recordsPerPage; i++) {
                            temp.add(accountList.get((page - 1) * recordsPerPage + i));
                        }
                    }
                }
            } else {
                temp = null;
            }
            int noOfRecords = accountList.size();
            int noOfPages = (int) Math.ceil(noOfRecords * 1.0 / recordsPerPage);
            request.setAttribute("noOfPages", noOfPages);
            request.setAttribute("currentPage", page);
            request.setAttribute("listAccounts", temp);
            request.setAttribute("nameSearch", name);
            request.setAttribute("roleSelect", role);
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
