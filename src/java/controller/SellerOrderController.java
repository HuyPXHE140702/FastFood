/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.SellerDAO;
import dao.impl.OrderDAOImpl;
import dao.impl.SellerDAOImpl;
import dao.impl.ShipperDAOImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Order;
import model.Seller;

/**
 *
 * @author dangtm
 */
public class SellerOrderController extends HttpServlet {

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
            throws ServletException, IOException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
//           int idseller = Integer.parseInt(request.getParameter("idSeller"));
//            System.out.println(idseller);
            SellerDAO sellerDAO = new SellerDAOImpl();
            float recieveMoney = sellerDAO.getReceiveMoney(12);
            OrderDAOImpl oderDAO = new OrderDAOImpl();
            ShipperDAOImpl shipperDAOImpl = new ShipperDAOImpl();
            List<Order> list2 = oderDAO.getAllOrder();
            String indexPage = request.getParameter("index");
            //String searchName = request.getParameter("searchName");
            List<Order> list = new ArrayList<>();
            if (indexPage == null) {
                indexPage = "1";
            }

            int index = Integer.parseInt(indexPage);

            int count = list2.size();
            int endPage = count / 9;
            if (count % 9 != 0) {
                endPage++;
            }
            list = oderDAO.getOrderWithpagging(index);
            request.setAttribute("page", indexPage);//de khi an vao trang 2 thi trang 2 mau den
            request.setAttribute("endP", endPage);
            request.setAttribute("receivemoney", recieveMoney);
            HttpSession session = request.getSession();
            session.setAttribute("listfood", list);
            request.getRequestDispatcher("sellerOrder.jsp").forward(request, response);
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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(SellerOrderController.class.getName()).log(Level.SEVERE, null, ex);
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
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(SellerOrderController.class.getName()).log(Level.SEVERE, null, ex);
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
