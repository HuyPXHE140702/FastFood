/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.impl.OrderDAOImpl;
import dao.OrderDAO;
import dao.ShipperDAO;
import dao.impl.ShipperDAOImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Order;
import model.Shipper;

/**
 *
 * @author Admin
 */
public class ShipperAcceptedOrderController extends HttpServlet {

    private String name = "";
    private String role = "";
    String condition = "and Name like '%" + name.trim() + "%' ";
    String sortBy = "";

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
        try {
            int page = 1;
            int recordsPerPage = 3;
            if (request.getParameter("page") != null) {
                page = Integer.parseInt(request.getParameter("page"));
            }
            OrderDAO orderDAOImpl = new OrderDAOImpl();
            int accountId = Integer.parseInt(request.getParameter("accountid"));
            List<Order> temp = new ArrayList<>();
            List<Order> orderList = new ArrayList<>();
            orderList = orderDAOImpl.ViewAccpectedOrder(accountId, sortBy);
            if (orderList.size() > 0) {
                if (page == 1) {
                    if (orderList.size() <= recordsPerPage) {
                        for (int i = 0; i < orderList.size(); i++) {
                            temp.add(orderList.get((page - 1) * recordsPerPage + i));
                        }
                    } else if (orderList.size() > recordsPerPage) {
                        for (int i = 0; i < recordsPerPage; i++) {
                            temp.add(orderList.get((page - 1) * recordsPerPage + i));
                        }
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
            int noOfRecords = orderList.size();
            int noOfPages = (int) Math.ceil(noOfRecords * 1.0 / recordsPerPage);
            ShipperDAO shipperDAOImpl = new ShipperDAOImpl();
            Shipper shipper = shipperDAOImpl.getShipperByAccountID(accountId);
            request.setAttribute("listOrder", temp);
            request.setAttribute("noOfPages", noOfPages);
            request.setAttribute("currentPage", page);
            request.setAttribute("currentPage", name);
            request.setAttribute("roleSelect", role);
            request.setAttribute("shipper", shipper);
            request.getRequestDispatcher("shipperacceptorder.jsp").forward(request, response);
        } catch (NumberFormatException | ServletException | IOException | IllegalStateException e) {
            e.printStackTrace();
            response.sendRedirect("error_Database.jsp");
        } catch (Exception ex) {
            Logger.getLogger(HomeshipperController.class.getName()).log(Level.SEVERE, null, ex);
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
            int page = 1;
            int recordsPerPage = 3;
            if (request.getParameter("page") != null) {
                page = Integer.parseInt(request.getParameter("page"));
            }
            OrderDAO orderDAOImpl = new OrderDAOImpl();
            int accountId = Integer.parseInt(request.getParameter("accountid"));
            String name = request.getParameter("customerName");
            String role = (String) request.getParameter("roles");

            if (role.equalsIgnoreCase("all")) {
                sortBy = "";
            } else if (role.equalsIgnoreCase("newest")) {
                sortBy = "ORDER BY created_date Desc";
            } else if (role.equalsIgnoreCase("priceAsc")) {
                sortBy = "ORDER BY TotalPrice Asc";
            } else if (role.equalsIgnoreCase("priceDes")) {
                sortBy = "ORDER BY TotalPrice Desc";
            }
            List<Order> orderList = new ArrayList<>();
            orderList = orderDAOImpl.ViewAccpectedOrder(accountId, sortBy);
            ShipperDAO shipperDAOImpl = new ShipperDAOImpl();
            Shipper shipper = shipperDAOImpl.getShipperByAccountID(accountId);
            List<Order> temp = new ArrayList<>();
            if (orderList.size() > 0) {
                if (page == 1) {
                    if (orderList.size() <= recordsPerPage) {
                        for (int i = 0; i < orderList.size(); i++) {
                            temp.add(orderList.get((page - 1) * recordsPerPage + i));
                        }
                    } else if (orderList.size() > recordsPerPage) {
                        for (int i = 0; i < recordsPerPage; i++) {
                            temp.add(orderList.get((page - 1) * recordsPerPage + i));
                        }
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
            } else {
                temp = null;
            }
            int noOfRecords = orderList.size();
            int noOfPages = (int) Math.ceil(noOfRecords * 1.0 / recordsPerPage);
            request.setAttribute("noOfPages", noOfPages);
            request.setAttribute("currentPage", page);
            request.setAttribute("listOrder", temp);
            request.setAttribute("currentPage", name);
            request.setAttribute("roleSelect", role);
            request.setAttribute("shipper", shipper);
            //request.setAttribute("accountid", accountId);
            request.getRequestDispatcher("shipperacceptorder.jsp").forward(request, response);
        } catch (NumberFormatException | ServletException | IOException | IllegalStateException e) {
            e.printStackTrace();
            response.sendRedirect("error_Database.jsp");
        } catch (Exception ex) {
            Logger.getLogger(HomeshipperController.class.getName()).log(Level.SEVERE, null, ex);
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
