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

import dao.Impl.AccountDAOImpl;
import dao.Impl.OrderDAOImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Account;
import model.Order;

/**
 *
 * @author HuyPX
 */
public class HomeshipperController extends HttpServlet {

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
//        try {
//            OrderDAO orderDao = new OrderDAO();
//            List<Order> orderList = orderDao.getOrderNotAcceptByShipperID();
//            if (orderList == null) {
//                response.sendRedirect("error_Database.jsp");
//            } else {
//                request.setAttribute("listorder", orderList);
//                request.getRequestDispatcher("homeshipper.jsp").forward(request, response);
//            }
//        } catch (Exception e) {
//            response.sendRedirect("error_Database.jsp");
//        }

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
            OrderDAOImpl dao = new OrderDAOImpl();
            List<Order> orderList = dao.viewAllOrders((page - 1) * recordsPerPage, recordsPerPage);
            int noOfRecords = dao.getNoOfRecords();
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
        try {
            String dateFrom = (String) request.getParameter("DateFrom");
            String dateTo = (String) request.getParameter("DateTo");
            String condition = "and created_date BETWEEN ? and ?";

            OrderDAOImpl orderDao = new OrderDAOImpl();
            List<Order> orderList = new ArrayList<>();
            if (dateFrom.equals("") && dateTo.equals("")) {
                orderList = orderDao.getOrderNotAcceptByShipperID();
            } else if (dateFrom.equals("")) {
                condition = "and created_date <= ?";
                orderList = orderDao.getOrderByDate(dateTo, condition);
            } else if (dateTo.equals("")) {
                condition = "and created_date >= ?";
                orderList = orderDao.getOrderByDate(dateFrom, condition);
            } else {
                orderList = orderDao.getOrderByDateToDate(dateFrom, dateTo, condition);
            }

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
