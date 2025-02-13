/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.servlet;

import DAO.UserDAOImpl;
import DB.DBConnect;
import entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Hoang
 */
@WebServlet(name = "RegisterServlet", urlPatterns = {"/register"})
public class RegisterServlet extends HttpServlet {

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
        try {
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String phone = request.getParameter("phno");
            String password = request.getParameter("password");
            String check = request.getParameter("check");
            //System.out.println(name + " " + email + " " + phone + " " + password + " " + check);
            User us = new User();
            us.setName(name);
            us.setEmail(email);
            us.setPhno(phone);
            us.setPassword(password);
            HttpSession session = request.getSession();
            if (check != null) {
                UserDAOImpl dao = new UserDAOImpl(DBConnect.getConnection());
                boolean f = dao.userRegister(us);
                if (f) {
                    // System.out.println("User Register Sucess...");
                    session.setAttribute("succeMsg", "Registration Successfully!!!");
                    response.sendRedirect("register.jsp");
                } else {
                    //System.out.println("Something wrong on sever...");
                    session.setAttribute("failedMsg", "Something wrong on sever...");
                    response.sendRedirect("register.jsp");
                }
            } else {
                //System.out.println("Please Check Agree & Terms Condition");
                session.setAttribute("failedMsg", "Please Check Agree & Terms Condition");
                response.sendRedirect("register.jsp");
            }
        } catch (Exception e) {
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
