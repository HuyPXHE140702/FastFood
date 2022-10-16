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

import dao.Impl.OrderDAOImpl;
import dao.OrderDAO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Order;

/**
 * The class contains method for view order list, search and paging <br>
 * The method wil throw an object of  <code>java.lang.Exception</code> class if
 * there is any error occurring when finding data <br>
 *
 * @author HuyPX
 */
public class HomeshipperController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    /**
     * Get a list of Order for Shipper role to view, accept order with paging
     * <br>
     * The result contain a list of <code>model.Account </code> objects <br>
     *
     * @param baseDAO get connection from Database
     * @param orderList request data from Database
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
            OrderDAO orderDAO = new OrderDAOImpl();
            //get all available orders with paging
            List<Order> orderList = orderDAO.viewAllOrders((page - 1) * recordsPerPage, recordsPerPage);
            int noOfRecords = orderDAO.getNoOfRecords();
            int noOfPages = (int) Math.ceil(noOfRecords * 1.0 / recordsPerPage);
            request.setAttribute("listOrder", orderList);
            request.setAttribute("noOfPages", noOfPages);
            request.setAttribute("currentPage", page);
            request.getRequestDispatcher("homeshipper.jsp").forward(request, response);
        } catch (Exception e) {
            response.sendRedirect("error_Database.jsp");
        }
    }

    /**
     * Get a list of Order for Shipper when search by date <br>
     * The result contain a list of <code>model.Order </code> objects <br>
     *
     * @param baseDAO get connection from Database
     * @param orderList request data from Database
     * @param request set attribute for jsp page
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws SQLException if an SQL error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String dateFrom = (String) request.getParameter("DateFrom");
            String dateTo = (String) request.getParameter("DateTo");
            String condition = "and created_date BETWEEN ? and ?";

            int page = 1;
            int recordsPerPage = 3;
            if (request.getParameter("page") != null) {
                page = Integer.parseInt(request.getParameter("page"));
            }
            OrderDAO orderDao = new OrderDAOImpl();

            List<Order> orderList = new ArrayList<>();
            //if search form empty
            if (dateFrom.equals("") && dateTo.equals("")) {
                orderList = orderDao.viewAllOrders(page, recordsPerPage);
                //if shipper do not choose start date
            } else if (dateFrom.equals("")) {
                condition = "and created_date <= ?";
                orderList = orderDao.getOrderByDate(dateTo, condition, (page - 1) * recordsPerPage);
                //if shipper do not choose end date
            } else if (dateTo.equals("")) {
                condition = "and created_date >= ?";
                orderList = orderDao.getOrderByDate(dateFrom, condition, (page - 1) * recordsPerPage);
            } else {
                orderList = orderDao.getOrderByDateToDate(dateFrom, dateTo, condition, (page - 1) * recordsPerPage);
            }
            int noOfRecords = orderDao.getNoOfRecords();
            int noOfPages = (int) Math.ceil(noOfRecords * 1.0 / recordsPerPage);
            request.setAttribute("noOfPages", noOfPages);
            request.setAttribute("currentPage", page);
            request.setAttribute("listOrder", orderList);
            request.getRequestDispatcher("homeshipper.jsp").forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();

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
