/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.mpl.OrderDetailDAOImpl;
import dao.OrderDAO;
import dao.OrderDetailDAO;
import dao.mpl.OrderDAOImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Cart;
import model.Order;

/**
 *
 * @author ACER
 */
public class CheckOutController extends HttpServlet {

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
            HttpSession session = request.getSession();
            Map<Integer, Cart> carts = (Map<Integer, Cart>) session.getAttribute("carts");
            if (carts == null) {
                carts = new LinkedHashMap<>();
            }
            //tinh total amout
            double totalAmout = 0;
            for (Map.Entry<Integer, Cart> entry : carts.entrySet()) {
                Integer foodid = entry.getKey();
                Cart cart = entry.getValue();

                totalAmout += cart.getQuantity() * cart.getProduct().getUnitprice();
            }
            request.setAttribute("totalAmount", totalAmout);
            request.getRequestDispatcher("checkout.jsp").forward(request, response);

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
        
        response.setCharacterEncoding("UTF-8");
        
        // lay ve thong tin order cua customer
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");

        //luu order
        HttpSession session = request.getSession();
        Map<Integer, Cart> carts = (Map<Integer, Cart>) session.getAttribute("carts");
        if (carts == null) {

            carts = new LinkedHashMap<>();
        }
        
        //tinh total amount
        float totalAmout = 0;
        for (Map.Entry<Integer, Cart> entry : carts.entrySet()) {
            Integer foodid = entry.getKey();
            Cart cart = entry.getValue();

            totalAmout += cart.getQuantity() * cart.getProduct().getUnitprice();
        }
        Order order = new Order();
        order.setAccountId(id);
        order.setName(name);
        order.setPhone(phone);
        order.setAddress(address);
        order.setTotalPrice(totalAmout);
        int orderId = new OrderDAOImpl().createReturnId(order);
        
        //luu order detail
        new OrderDetailDAOImpl().saveCart(orderId, carts);

        //sau khi payment xoa khoi gio hang
        session.removeAttribute("carts");
        response.sendRedirect("thank");
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
