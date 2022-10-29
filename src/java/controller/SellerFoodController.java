/*
 * Copyright(C) 2005, FPT University
 * Java MVC:
 *  Fast Food Shop
 *
 * Record of change:
 * DATE            Version             AUTHOR                   DESCRIPTION
 * 2022-10-28      1.0                 Vinh                     Implement
 */
package controller;

import dao.FoodDAO;
import dao.Impl.FoodDAOImpl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Food;

/**
 *
 * @author ASUS
 */
@WebServlet(name = "SellerFoodController", urlPatterns = {"/SellerFood"})
public class SellerFoodController extends HttpServlet {

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
             FoodDAOImpl foodDAOImpl = new FoodDAOImpl();
            List<Food> list2 = foodDAOImpl.getAllFood();
            String indexPage = request.getParameter("index");
            String searchName = request.getParameter("searchName");
            List<Food> list = new ArrayList<>();
            if(indexPage == null){
                indexPage = "1";
            }
          
            int index = Integer.parseInt(indexPage);
            
            int count = list2.size();
            int endPage = count / 9;
            if (count % 9 != 0) {
                endPage++;
            } 
            if(searchName == null){
                 list = foodDAOImpl.getProductwithPagging(index);
            }else{
                list = foodDAOImpl.getProductWithPaggingByName(index, searchName);
            }
            
            request.setAttribute("page", indexPage);//de khi an vao trang 2 thi trang 2 mau den
            request.setAttribute("endP", endPage);
             
            HttpSession session = request.getSession();
            session.setAttribute("listfood", list);
            session.setAttribute("urlHistory", "menu");
            
            request.getRequestDispatcher("sellerFood.jsp").forward(request, response);
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
