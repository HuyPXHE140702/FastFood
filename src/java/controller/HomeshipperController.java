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

import dao.impl.OrderDAOImpl;
import dao.OrderDAO;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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

    private List<Order> orderList = new ArrayList<>();
    private int noOfRecords = 0;
    private int noOfPages = 0;
    private String dateFrom = "";
    private String dateTo = "";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //request.getRequestDispatcher("homeshipper.jsp").forward(request, response);
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
            List<Order> temp = new ArrayList<>();
            if (orderList.size() > 0) {
                if (page == 1) {
                    for (int i = 0; i < recordsPerPage; i++) {
                        temp.add(orderList.get((page - 1) * recordsPerPage + i));
                    }
                } else if (page > 1) {
                    int remainSize = orderList.size() - recordsPerPage * (page - 1);
                    if (remainSize >= 0 && remainSize <= recordsPerPage) {
                        for (int i = 0; i < remainSize; i++) {
                            temp.add(orderList.get((page - 1) * recordsPerPage + i));
                        }
                    } else if (remainSize >= 0 && remainSize > recordsPerPage) {
                        for (int i = 0; i < recordsPerPage; i++) {
                            temp.add(orderList.get((page - 1) * recordsPerPage + i));
                        }
                    }
                }
            }
            request.setAttribute("listOrder", temp);
            request.setAttribute("noOfPages", noOfPages);
            request.setAttribute("currentPage", page);
            request.setAttribute("dateF", dateFrom);
            request.setAttribute("dateT", dateTo);
            request.setAttribute("maxDate", LocalDate.now());
            request.getRequestDispatcher("homeshipper.jsp").forward(request, response);
        } catch (NumberFormatException | ServletException | IOException | IllegalStateException e) {
            e.printStackTrace();
            response.sendRedirect("error_Database.jsp");
        } catch (Exception ex) {
            Logger.getLogger(HomeshipperController.class.getName()).log(Level.SEVERE, null, ex);
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
            dateFrom = (String) request.getParameter("DateFrom");
            dateTo = (String) request.getParameter("DateTo");
            int page = 1;
            int recordsPerPage = 3;
            if (request.getParameter("page") != null) {
                page = Integer.parseInt(request.getParameter("page"));
            }
            OrderDAO orderDAO = new OrderDAOImpl();
            String condition = "and created_date BETWEEN ? and ?";
            //if search form empty
            if (dateFrom.equals("") && dateTo.equals("")) {
                orderList = orderDAO.getOrderNotAcceptByShipperID();
                //orderList = orderDAO.viewAllOrders((page - 1) * recordsPerPage, recordsPerPage);
                //noOfRecords = orderDAO.getNoOfRecords();
                //if shipper do not choose start date
            } else if (dateFrom.equals("")) {
                condition = "and created_date <= ?";
                //               orderList = orderDAO.getOrderByDateNoOffset(dateTo, condition);
                //orderList = orderDAO.getOrderByDate(dateTo, condition, (page - 1) * recordsPerPage);
                //noOfRecords = orderDAO.getNoOfRecordsOneDate(condition, dateTo);
                //if shipper do not choose end date
            } else if (dateTo.equals("")) {
                condition = "and created_date >= ?";
//                orderList = orderDAO.getOrderByDateNoOffset(dateFrom, condition);
                //orderList = orderDAO.getOrderByDate(dateFrom, condition, (page - 1) * recordsPerPage);
                //noOfRecords = orderDAO.getNoOfRecordsOneDate(condition, dateFrom);
            } else {

                //               orderList = orderDAO.getOrderByDateToDateNoOffset(dateFrom, dateTo, condition);
//orderList = orderDAO.getOrderByDateToDate(dateFrom, dateTo, condition, (page - 1) * recordsPerPage);
                //noOfRecords = orderDAO.getNoOfRecordsBetweenDate(condition, dateFrom, dateTo);
            }

            List<Order> temp = new ArrayList<>();
            if (orderList.size() > 0) {
                if (orderList.size() <= recordsPerPage) {
                    for (int i = 0; i < orderList.size(); i++) {
                        temp.add(orderList.get((page - 1) * recordsPerPage + i));
                    }
                } else if (orderList.size() > recordsPerPage) {
                    for (int i = 0; i < recordsPerPage; i++) {
                        temp.add(orderList.get((page - 1) * recordsPerPage + i));
                    }
                }
            } else {
                temp = null;
            }
            noOfRecords = orderList.size();
            noOfPages = (int) Math.ceil(noOfRecords * 1.0 / recordsPerPage);
            request.setAttribute("noOfPages", noOfPages);
            request.setAttribute("currentPage", page);
            request.setAttribute("listOrder", temp);
            request.setAttribute("dateF", dateFrom);
            request.setAttribute("dateT", dateTo);
            request.setAttribute("maxDate", LocalDate.now());
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
