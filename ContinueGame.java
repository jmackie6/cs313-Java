/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.scoretracker;

//import static com.mycompany.scoretracker.SignUpCheck.conn;
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
@WebServlet(name = "ContinueGame", urlPatterns = {"/ContinueGame"})
public class ContinueGame extends HttpServlet {

    static Connection con = null;
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
          
        PrintWriter out = response.getWriter();


          String player_name = request.getParameter("name");
          String game_name = request.getParameter("game_name");
//        out.print(player);
          String date = request.getParameter("date");

        try {
            
            this.makeConnection();
                
            
            //String query = "INSERT INTO players (date, winner, game_name, score, player_name)" + " VALUES (?, ?, ?, ?, ?)";
            String sql = "UPDATE players SET  player_name = ? WHERE game_name = " + game_name + "AND date = " + date;
            //String query = " INSERT INTO players (player_name) VALUES ('erin')";
            // create the mysql insert preparedstatement
            PreparedStatement st = con.prepareStatement(sql);
            
            st.setString (1, player_name);
            
            
            st.execute();           
            out.print("<p>execute</p>");
            response.sendRedirect("home.jsp");
            
        }
        catch (Exception e){
            System.out.println("error: "+ e);
        }
        
    }

    
    public void makeConnection() {
            try {
                //localhost
                
//                String user = "root";
//                String pass = "soccer66";
//                Class.forName("com.mysql.jdbc.Driver");
//                con = DriverManager.getConnection("jdbc:mysql://localhost/score_tracker",user,pass);
                
                //openshift
                
                Class.forName("com.mysql.jdbc.Driver");
                String host = System.getenv("OPENSHIFT_MYSQL_DB_HOST");
                String port = System.getenv("OPENSHIFT_MYSQL_DB_PORT");
                String username = System.getenv("OPENSHIFT_MYSQL_DB_USERNAME");
                String password = System.getenv("OPENSHIFT_MYSQL_DB_PASSWORD");
                con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/java", username, password);
                
            } catch (Exception e) {
                System.out.println("error: "+ e);
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



