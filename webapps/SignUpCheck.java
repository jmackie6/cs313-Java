/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.scoretracker;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Jared
 */
@WebServlet(name = "SignUpCheck", urlPatterns = {"/SignUpCheck"})
public class SignUpCheck extends HttpServlet {
    
    static Connection conn = null;
    Statement stmt = null;
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
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String user = request.getParameter("user");
        out.print(user + "\n");
        String pass = request.getParameter("pass");
        out.print(pass + "\n");
        String email = request.getParameter("email");
        out.print(email + "\n");
        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            out.print("getting into the try statnment" + "\n");
//            String u = "root";
//            String p = "soccer66";
//            Class.forName("com.mysql.jdbc.Driver");
//            conn = DriverManager.getConnection("jdbc:mysql://localhost/score_tracker",u,p);
            
            Class.forName("com.mysql.jdbc.Driver");
                String host = System.getenv("OPENSHIFT_MYSQL_DB_HOST");
                String port = System.getenv("OPENSHIFT_MYSQL_DB_PORT");
                String username = System.getenv("OPENSHIFT_MYSQL_DB_USERNAME");
                String password = System.getenv("OPENSHIFT_MYSQL_DB_PASSWORD");
                conn = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/java", username, password);
            
            // the mysql insert statement
            String query = " insert into user (username,password,email)" + " values (?, ?, ?)";
            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString (1, user);
            preparedStmt.setString (2, pass);
            preparedStmt.setString (3, email);
      
            int count = preparedStmt.executeUpdate();
            
            HttpSession session = request.getSession();
            if (count > 0) {
                //out.println("Correct login credentials");
                
                session.setAttribute("username",user); 
                session.setAttribute("password",pass); 
                response.sendRedirect("home.jsp");
            } 
            else {
                //out.println("Incorrect login credentials");
                response.sendRedirect("error.jsp");
            }
            conn.close();
        } 
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        
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


    
