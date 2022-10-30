/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.impl.OrderDetailDAOImpl;
import dao.OrderDetailDAO;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.OrderDetail;

/**
 *
 * @author ACER
 */
public class ViewBillController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if idBill servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    /*
    * ProcessRequest lay id cua customer va lay ra order detail ma customer vua order
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        OrderDetailDAO orderDetailDAO = new OrderDetailDAOImpl();
        try {
            //lay ve id customer vua thuc hien bill
            int id = Integer.parseInt(request.getParameter("idCustomer"));

            double totalAmout = 0; // khoi tao tong tien
            int idBill=0; // khoi tao gia tri cua id item dau tien cua bill list
            List<OrderDetail> list = orderDetailDAO.getOrderDetailByAccountID(id); // lay ra list bill trong orderdetail

            // tinh tong tien
            for (OrderDetail list1 : list) {
                totalAmout += list1.getPricefood() * list1.getQuantity();
            }

            //lay ra gia tri cua id item dau tien trong bill hien tai
            for (OrderDetail list1 : list) {
                idBill = list1.getId() - 1;
                break;
            }

            // tao attribute gui toi page viewBill
            request.setAttribute("idBill", idBill);
            request.setAttribute("totalAmout", totalAmout);
            request.setAttribute("list", list);
            request.getRequestDispatcher("viewBill.jsp").forward(request, response);
        } catch (IOException | NumberFormatException | ServletException exception) {
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if idBill servlet-specific error occurs
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
     * @throws ServletException if idBill servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns idBill short description of the servlet.
     *
     * @return idBill String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
