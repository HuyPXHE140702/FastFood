/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.FoodDAO;
import dao.Impl.FoodDAOImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Food;

/**
* Copyright(C) 2005, FPT University
* Java MVC:
*  Fast Food Shop
*
* Record of change:
* DATE            Version             AUTHOR                   DESCRIPTION
* 2022-10-12      1.0                 NamVNHE140527            First Implement
 */
public class AddToCart extends HttpServlet {

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
                request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           int foodid = Integer.parseInt(request.getParameter("foodid"));
            HttpSession session = request.getSession();
            //checklogin
//            Account account = (Account) session.getAttribute("acc");
//            if(account ==null){
//                response.sendRedirect("login.jsp");
//                return;
//            }
            Map<Integer,model.Cart> carts = (Map<Integer,model.Cart>) session.getAttribute("carts");
            if(carts == null){
                carts = new LinkedHashMap<>();//linkedmap se sap xep theo thu tu
            }
            //lau food voi id nhan dc
            if(carts.containsKey(foodid)){//th2
                int oldQuantity = carts.get(foodid).getQuantity();
                carts.get(foodid).setQuantity(oldQuantity +1);
            }else{//th1
                Food food =  new FoodDAOImpl().getFoodById(foodid);
                carts.put(foodid,new model.Cart(food,1));
            }
            //th1: sp chua co trong gio hang
            //th2: san pham da co tren gio hang -> cap nhat lai so luong tren gio hang
            session.setAttribute("carts", carts);
//            response.getWriter().println(carts.size());
            String urlHistory = (String) session.getAttribute("urlHistory");
            if(urlHistory == null){
                urlHistory = "home";
            }
            response.sendRedirect(urlHistory);
            
        } catch (Exception ex) {
            Logger.getLogger(AddToCart.class.getName()).log(Level.SEVERE, null, ex);
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
        processRequest(request, response);
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
