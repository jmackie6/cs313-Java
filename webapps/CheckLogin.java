/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thread2;

import com.mycompany.thread2.readwrite.FileSevices;

import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jared
 */
@WebServlet(name = "CheckLogin", urlPatterns = {"/CheckLogin"})
public class CheckLogin extends HttpServlet {

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
        
        Boolean matchingPass = false;
        
        String userName = request.getParameter("username");
        String passWord = request.getParameter("password");
        //List<String> users = FileSevices.loadUsers("C:/Users/Jared/Documents/NetBeansProjects/thread2/src/main/java/com/mycompany/thread2/users.txt");
        List<String> users = FileSevices.readUsers("users.txt");
        try (PrintWriter out = response.getWriter()) {
            for (String user : users) {
                String Name = user.split(",")[0];
                //username matched
                if (Name.equals(Name)) {
                    String pass = user.split(",")[1];
                    if (pass.equals(passWord)) {
                        //password matched
                        matchingPass = true;
                        out.println(Name + " is a valid user!" + "<br>");
                    }
                } else {
                    out.println(":" + Name +
                            ":" + Name + ":<br>");
                }
            }
            if (matchingPass == true) {
            
            request.getSession().setAttribute("username", userName);
            request.setAttribute("username", userName);
            request.getRequestDispatcher("WelcomePage.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("Fail_Login.jsp").forward(request, response);
        }
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
