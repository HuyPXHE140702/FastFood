/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.impl.AccountDAOImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Account;

/**
 *
 * @author ACER
 */
public class ChangePasswordController extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        try {
            int id = Integer.parseInt(request.getParameter("id"));
            AccountDAOImpl accountDAO = new AccountDAOImpl();
            String oldPassword = request.getParameter("oldpass");
            String newPassword = request.getParameter("newpass");
            String confirmedPassword = request.getParameter("confirmedpass");
            Account account = accountDAO.getAccountByID(id);
            if (account.getPassword().equals(oldPassword)) {
                if (newPassword.equals(confirmedPassword)) {
                    accountDAO.changePasswordById(newPassword, id);
                } else {
                    String error = "Confirmed password is not matched";
                    request.setAttribute("error2", error);
                }
            } else {
                String error = "Old password is not right";
                request.setAttribute("error1", error);
            }
            String url = "profile?id=" + id;
            request.getRequestDispatcher(url).forward(request, response);

        } catch (IOException | NumberFormatException | ServletException exception) {
            Logger.getLogger(ChangePasswordController.class.getName()).log(Level.SEVERE, null, exception);
        } catch (Exception ex) {
            Logger.getLogger(ChangePasswordController.class.getName()).log(Level.SEVERE, null, ex);
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
