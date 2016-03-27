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
@WebServlet(name = "newGame", urlPatterns = {"/newGame"})
public class newGame extends HttpServlet {

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
        
        
        String date = request.getParameter("date");
        String game_name = request.getParameter("game_name");  
        
        String player = request.getParameter("name");       
        String score = request.getParameter("total");       
        String winner = request.getParameter("1");
        
        String player2 = request.getParameter("name2");  
        String score2 = request.getParameter("total2");       
        String winner2 = request.getParameter("2");
        
        String player3 = request.getParameter("name3");       
        String score3 = request.getParameter("total3");       
        String winner3 = request.getParameter("3");
        
        String player4 = request.getParameter("name4");       
        String score4 = request.getParameter("total4");       
        String winner4 = request.getParameter("4");
        
        String player5 = request.getParameter("name5");       
        String score5 = request.getParameter("total5");       
        String winner5 = request.getParameter("5");
        
        String player6 = request.getParameter("name6");       
        String score6 = request.getParameter("total6");       
        String winner6 = request.getParameter("6");
        
        String player7 = request.getParameter("name7");       
        String score7 = request.getParameter("total7");       
        String winner7 = request.getParameter("7");
        
        String player8 = request.getParameter("name8");       
        String score8 = request.getParameter("total8");       
        String winner8 = request.getParameter("8");
        
        
           
                
                
                
                
                 try {
                this.makeConnection();
                

                
                String query = "INSERT INTO players (date, winner, game_name, score, player_name)" + " VALUES (?, ?, ?, ?, ?)";
                
                PreparedStatement st = con.prepareStatement(query);
                
                st.setString (1, date);
                st.setString (2, winner);
                st.setString (3, game_name);
                st.setString (4, score);
                st.setString (5, player);

                st.execute();           
                
                
                
            
            
            if(!player2.equals("")) 
            {
                
                this.makeConnection();
                out.print("<p>connection</p>");

                String query2 = "INSERT INTO players (date, winner, game_name, score, player_name)" + " VALUES (?, ?, ?, ?, ?)";
                PreparedStatement st2 = con.prepareStatement(query2);

                st2.setString (1, date);
                st2.setString (2, winner2);
                st2.setString (3, game_name);
                st2.setString (4, score2);
                st2.setString (5, player2);

                st2.execute();           
                out.print("<p>execute2</p>");
            
            }
            else
            {
                out.println("failed, it was empty\n");
            }
            
            if(!player3.equals("")) 
            {
                
                this.makeConnection();
                out.print("<p>connection</p>");

                String query3 = "INSERT INTO players (date, winner, game_name, score, player_name)" + " VALUES (?, ?, ?, ?, ?)";
                PreparedStatement st3 = con.prepareStatement(query3);

                st3.setString (1, date);
                st3.setString (2, winner3);
                st3.setString (3, game_name);
                st3.setString (4, score3);
                st3.setString (5, player3);

                st3.execute();           
                out.print("<p>execute3</p>");
            
            }
            else
            {
                out.println("failed, it was empty\n");
            }
            
            if(!player4.equals("")) 
            {
                
                this.makeConnection();
                out.print("<p>connection</p>");

                String query4 = "INSERT INTO players (date, winner, game_name, score, player_name)" + " VALUES (?, ?, ?, ?, ?)";
                PreparedStatement st4 = con.prepareStatement(query4);

                st4.setString (1, date);
                st4.setString (2, winner4);
                st4.setString (3, game_name);
                st4.setString (4, score4);
                st4.setString (5, player4);

                st4.execute();           
                out.print("<p>execute3</p>");
            
            }
            else
            {
                out.println("failed, it was empty\n");
            }
            
            if(!player5.equals("")) 
            {
                
                this.makeConnection();
                out.print("<p>connection</p>");

                String query5 = "INSERT INTO players (date, winner, game_name, score, player_name)" + " VALUES (?, ?, ?, ?, ?)";
                PreparedStatement st5 = con.prepareStatement(query5);

                st5.setString (1, date);
                st5.setString (2, winner5);
                st5.setString (3, game_name);
                st5.setString (4, score5);
                st5.setString (5, player5);

                st5.execute();           
                out.print("<p>execute3</p>");
            
            }
            else
            {
                out.println("failed, it was empty\n");
            }
            
            if(!player6.equals("")) 
            {
                
                this.makeConnection();
                out.print("<p>connection</p>");

                String query6 = "INSERT INTO players (date, winner, game_name, score, player_name)" + " VALUES (?, ?, ?, ?, ?)";
                PreparedStatement st6 = con.prepareStatement(query6);

                st6.setString (1, date);
                st6.setString (2, winner6);
                st6.setString (3, game_name);
                st6.setString (4, score6);
                st6.setString (5, player6);

                st6.execute();           
                out.print("<p>execute3</p>");
            
            }
            else
            {
                out.println("failed, it was empty\n");
            }
            if(!player7.equals("")) 
            {
                
                this.makeConnection();
                out.print("<p>connection</p>");

                String query7 = "INSERT INTO players (date, winner, game_name, score, player_name)" + " VALUES (?, ?, ?, ?, ?)";
                PreparedStatement st7 = con.prepareStatement(query7);

                st7.setString (1, date);
                st7.setString (2, winner7);
                st7.setString (3, game_name);
                st7.setString (4, score7);
                st7.setString (5, player7);

                st7.execute();           
                out.print("<p>execute3</p>");
            
            }
            else
            {
                out.println("failed, it was empty\n");
            }
            
            if(!player8.equals("")) 
            {
                
                this.makeConnection();
                out.print("<p>connection</p>");

                String query8 = "INSERT INTO players (date, winner, game_name, score, player_name)" + " VALUES (?, ?, ?, ?, ?)";
                PreparedStatement st8 = con.prepareStatement(query8);

                st8.setString (1, date);
                st8.setString (2, winner8);
                st8.setString (3, game_name);
                st8.setString (4, score8);
                st8.setString (5, player8);

                st8.execute();           
                out.print("<p>execute3</p>");
            
            }
            else
            {
                out.println("");
            }
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
