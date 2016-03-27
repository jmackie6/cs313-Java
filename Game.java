/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.scoretracker;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import static javafx.beans.binding.Bindings.select;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jared
 */
@WebServlet(name = "Game", urlPatterns = {"/Game"})
public class Game extends HttpServlet {
    
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
        //String player = request.getParameter("player_name");
        
        out.print("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
"<head>\n" +
"<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n" +
"<title>Home Page</title>\n" +
"<link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\" />\n" +
"<link rel=\"stylesheet\" type=\"text/css\" href=\"home.css\">\n" +
"<script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-1.6.1.min.js\"></script>\n" +
"<!--<script type=\"text/javascript\">var search_input= $('.search input[type=text]');var search_input_size = 142; var search_large_size = 154; var padding = 7; //var shrinked = \"\";$(document).ready(function(){search_input.click(function(){shrink();}).focus(function(){shrink();});search_input.blur(function(){ if(shrinked==\"YES\")normal();});$('.button a').hover(function(){if(shrinked==\"YES\")normal();}); });function shrink(){if(search_input_size < search_large_size ){$('.button a').each(function(){$(this).animate({'padding-left': padding+'px','padding-right': padding+'px'},'fast');});search_input.animate({'width': search_large_size+'px'},'fast'); shrinked=\"YES\";}return false;}function normal(){search_input.animate({'width':search_input_size+'px'},'fast'); $('.button a').animate({'padding-left':'10px','padding-right':'10px'},'fast');shrinked=\"\";search_input.blur();return false;}\n" +
"</script> -->\n" +
"<style>\n" +
"         P.mainTitle \n" +
"         {\n" +
"               color: white; \n" +
"               font-family:\"times\";     \n" +
"               font-style:normal; \n" +
"               font-size:30pt;\n" +
"         }         \n" +
"         p.sideBar\n" +
"         {\n" +
"               font-family: courier;\n" +
"               \n" +
"         }\n" +
"         p.main\n" +
"         {\n" +
"               font-size: 15px;\n" +
"               \n" +
"               \n" +
"         }\n" +
"         p.bottom\n" +
"         {\n" +
"               font-size: 30px;\n" +
"               \n" +
"         }\n" +
"         \n" +
"</style>\n" +
"</head>\n" +
"	<body>\n" +
"            <div id=\"header\">\n" +
" 		<div id=\"left\">\n" +
"    		<label>Game Score Tracker</label>\n" +
"                </div>\n" +
"                <div id=\"right\">\n" +
"                    <div id=\"content\">\n" +
"                        <!--Hello-- <?php echo $userRow['username']; ?>&nbsp;<a class=\"sign\" href=\"logout.php?logout\">--Sign Out--</a>-->\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>\n" +
"            <div id=\"top\">\n" +
"                <ul id=\"menu_wrap\" class=\"Gray\">\n" +
"                    <li class=\"button\"><a href=\"NewGameForm.jsp\">New Game</a></li>\n" +
"                    <li class=\"button\"><a href=\"Form.jsp\">Continue Game</a></li>\n" +
"                    <li class=\"button\"><a href=\"player.jsp\">Player Stats</a></li>\n" +
"                    <li class=\"button\"><a href=\"Game\">Games Played</a></li>\n" +
"                    <li class=\"button\"><a href=\"logout.jsp\">Logout</a></li> \n" +
"                    <li class=\"button\"><a href=\"search.jsp\">Search BGG</a></li>\n" +
"                \n" +
"            </div>");
        
        try{
            this.makeConnection();
            
            PreparedStatement pst = con.prepareStatement("SELECT * FROM players WHERE winner = \"yes\" OR winner = \"YES\" ORDER BY player_id DESC");
            //SELECT DISTINCT(Date) AS Date FROM buy ORDER BY Date DESC;
            //pst.setString(1, player);
            //pst.setString(2, pass);
            out.println("prepare statment");
            ResultSet rs = pst.executeQuery();
            out.println("execute");
            //out.print("<table border='1'>");
            out.println("<h1> Games played from most recent Starting at list</h1><br>");
            while(rs.next()) {
                String game_name = rs.getString("game_name");
                String date = rs.getString("date");
                String player_name = rs.getString("player_name");
                String score = rs.getString("score");
                
                out.print("Game Name: "+ game_name + "<br>");
                out.print("Date of game: "+ date + "<br>");                
                out.print("Game Winner: "+ player_name + "<br>");
                out.print("Players winning Score: " + score + "<br><br>");
            }
            out.print("</body>\n" + "</html>");
            rs.close();
            pst.close();
            
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
