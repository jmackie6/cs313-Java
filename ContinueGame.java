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


          //String player_name = request.getParameter("name");
          String game_name = request.getParameter("game_name");
        
          String date = request.getParameter("date");
          
          out.print("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
"<head>\n" +
"<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n" +
"<title>Home Page</title>\n" +
"<script src=\"new_game_form.js\"></script>\n" +
"\n" +
"<link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\" />\n" +
"<link rel=\"stylesheet\" type=\"text/css\" href=\"home.css\">\n" +
"<script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-1.6.1.min.js\"></script>\n" +
"<script type=\"text/javascript\">var search_input= $('.search input[type=text]');var search_input_size = 142; var search_large_size = 154; var padding = 7; var shrinked = \"\";$(document).ready(function(){search_input.click(function(){shrink();}).focus(function(){shrink();});search_input.blur(function(){ if(shrinked==\"YES\")normal();});$('.button a').hover(function(){if(shrinked==\"YES\")normal();}); });function shrink(){if(search_input_size < search_large_size ){$('.button a').each(function(){$(this).animate({'padding-left': padding+'px','padding-right': padding+'px'},'fast');});search_input.animate({'width': search_large_size+'px'},'fast'); shrinked=\"YES\";}return false;}function normal(){search_input.animate({'width':search_input_size+'px'},'fast'); $('.button a').animate({'padding-left':'10px','padding-right':'10px'},'fast');shrinked=\"\";search_input.blur();return false;}\n" +
"</script>\n" +
"<script>\n" +
"    $(document).ready(function() {\n" +
"    \n" +
"    $( \"#add\" ).click(function() {       \n" +
"     var addedVal =  parseInt($(\"#val\").val())\n" +
"     \n" +
"      var totalVal = parseInt($(\"#total\").attr(\"value\")) \n" +
"      var total = addedVal + totalVal     \n" +
"     $(\"#total\").attr(\"value\", total)\n" +
"     var totalVal = parseInt($(\"#total\").attr(\"value\"))\n" +
"    });\n" +
"    $( \"#sub\" ).click(function() {       \n" +
"     var subVal =  parseInt($(\"#val\").val())\n" +
"     \n" +
"      var totalVal = parseInt($(\"#total\").attr(\"value\")) \n" +
"      var total = subVal - totalVal     \n" +
"     $(\"#total\").attr(\"value\", total)\n" +
"     var totalVal = parseInt($(\"#total\").attr(\"value\"))\n" +
"    });\n" +
"    \n" +
"    \n" +
"    $( \"#add2\" ).click(function() {       \n" +
"     var addedVal2 =  parseInt($(\"#val2\").val())\n" +
"     \n" +
"      var totalVal2 = parseInt($(\"#total2\").attr(\"value\")) \n" +
"      var total2 = addedVal2 + totalVal2     \n" +
"     $(\"#total2\").attr(\"value\", total2)\n" +
"     var totalVal2 = parseInt($(\"#total2\").attr(\"value\"))\n" +
"    });\n" +
"    $( \"#sub2\" ).click(function() {       \n" +
"     var subVal2 =  parseInt($(\"#val2\").val())\n" +
"     \n" +
"      var totalVal2 = parseInt($(\"#total2\").attr(\"value\")) \n" +
"      var total2 = subVal2 - totalVal2     \n" +
"     $(\"#total2\").attr(\"value\", total)\n" +
"     var totalVal2 = parseInt($(\"#total2\").attr(\"value\"))\n" +
"    });\n" +
"    \n" +
"    \n" +
"    $( \"#add3\" ).click(function() {       \n" +
"     var addedVal3 =  parseInt($(\"#val3\").val())\n" +
"     \n" +
"      var totalVal3 = parseInt($(\"#total3\").attr(\"value\")) \n" +
"      var total3 = addedVal3 + totalVal3     \n" +
"     $(\"#total3\").attr(\"value\", total3)\n" +
"     var totalVal3 = parseInt($(\"#total3\").attr(\"value\"))\n" +
"    });\n" +
"    $( \"#sub3\" ).click(function() {       \n" +
"     var subVal3 =  parseInt($(\"#val3\").val())\n" +
"     \n" +
"      var totalVal3 = parseInt($(\"#total3\").attr(\"value\")) \n" +
"      var total3 = subVal3 - totalVal3     \n" +
"     $(\"#total3\").attr(\"value\", total3)\n" +
"     var totalVal3 = parseInt($(\"#total3\").attr(\"value\"))\n" +
"    });\n" +
"    \n" +
"    \n" +
"    $( \"#add4\" ).click(function() {       \n" +
"     var addedVal4 =  parseInt($(\"#val4\").val())\n" +
"     \n" +
"      var totalVal4 = parseInt($(\"#total4\").attr(\"value\")) \n" +
"      var total4 = addedVal4 + totalVal4     \n" +
"     $(\"#total4\").attr(\"value\", total4)\n" +
"     var totalVal4 = parseInt($(\"#total4\").attr(\"value\"))\n" +
"    });\n" +
"    $( \"#sub4\" ).click(function() {       \n" +
"     var subVal4 =  parseInt($(\"#val4\").val())\n" +
"     \n" +
"      var totalVal4 = parseInt($(\"#total4\").attr(\"value\")) \n" +
"      var total4 = subVal4 - totalVal4     \n" +
"     $(\"#total4\").attr(\"value\", total4)\n" +
"     var totalVal4 = parseInt($(\"#total4\").attr(\"value\"))\n" +
"    });\n" +
"    \n" +
"    \n" +
"    $( \"#add5\" ).click(function() {       \n" +
"     var addedVal5 =  parseInt($(\"#val5\").val())\n" +
"     \n" +
"      var totalVal5 = parseInt($(\"#total5\").attr(\"value\")) \n" +
"      var total5 = addedVal5 + totalVal5     \n" +
"     $(\"#total5\").attr(\"value\", total5)\n" +
"     var totalVal5 = parseInt($(\"#total5\").attr(\"value\"))\n" +
"    });\n" +
"    $( \"#sub5\" ).click(function() {       \n" +
"     var subVal5 =  parseInt($(\"#val5\").val())\n" +
"     \n" +
"      var totalVal5 = parseInt($(\"#total5\").attr(\"value\")) \n" +
"      var total5 = subVal5 - totalVal5     \n" +
"     $(\"#total5\").attr(\"value\", total5)\n" +
"     var totalVal5 = parseInt($(\"#total5\").attr(\"value\"))\n" +
"    });\n" +
"  \n" +
"  \n" +
"  \n" +
"  $( \"#add6\" ).click(function() {       \n" +
"     var addedVal6 =  parseInt($(\"#val6\").val())\n" +
"     \n" +
"      var totalVal6 = parseInt($(\"#total6\").attr(\"value\")) \n" +
"      var total6 = addedVal6 + totalVal6     \n" +
"     $(\"#total6\").attr(\"value\", total6)\n" +
"     var totalVal6 = parseInt($(\"#total6\").attr(\"value\"))\n" +
"    });\n" +
"    $( \"#sub6\" ).click(function() {       \n" +
"     var subVal6 =  parseInt($(\"#val6\").val())\n" +
"     \n" +
"      var totalVal6 = parseInt($(\"#total6\").attr(\"value\")) \n" +
"      var total6 = subVal6 - totalVal6     \n" +
"     $(\"#total6\").attr(\"value\", total6)\n" +
"     var totalVal6 = parseInt($(\"#total6\").attr(\"value\"))\n" +
"    });\n" +
"    \n" +
"    \n" +
"    $( \"#add7\" ).click(function() {       \n" +
"     var addedVal7 =  parseInt($(\"#val7\").val())\n" +
"     \n" +
"      var totalVal7 = parseInt($(\"#total7\").attr(\"value\")) \n" +
"      var total7 = addedVal7 + totalVal7     \n" +
"     $(\"#total7\").attr(\"value\", total7)\n" +
"     var totalVal7 = parseInt($(\"#total7\").attr(\"value\"))\n" +
"    });\n" +
"    $( \"#sub7\" ).click(function() {       \n" +
"     var subVal7 =  parseInt($(\"#val7\").val())\n" +
"     \n" +
"      var totalVal7 = parseInt($(\"#total7\").attr(\"value\")) \n" +
"      var total7 = subVal7 - totalVal7     \n" +
"     $(\"#total7\").attr(\"value\", total7)\n" +
"     var totalVal7 = parseInt($(\"#total7\").attr(\"value\"))\n" +
"    });\n" +
"    \n" +
"    \n" +
"    $( \"#add8\" ).click(function() {       \n" +
"     var addedVal8 =  parseInt($(\"#val8\").val())\n" +
"     \n" +
"      var totalVal8 = parseInt($(\"#total8\").attr(\"value\")) \n" +
"      var total8 = addedVal8 + totalVal8     \n" +
"     $(\"#total8\").attr(\"value\", total8)\n" +
"     var totalVal8 = parseInt($(\"#total8\").attr(\"value\"))\n" +
"    });\n" +
"    $( \"#sub8\" ).click(function() {       \n" +
"     var subVal8 =  parseInt($(\"#val8\").val())\n" +
"     \n" +
"      var totalVal8 = parseInt($(\"#total8\").attr(\"value\")) \n" +
"      var total8 = subVal8 - totalVal8     \n" +
"     $(\"#total8\").attr(\"value\", total8)\n" +
"     var totalVal8 = parseInt($(\"#total8\").attr(\"value\"))\n" +
"    });\n" +
"    \n" +
"    });\n" +
"    \n" +
"    function reset()\n" +
"{\n" +
"   $('input[type=\"text\"]').each (function() { this.val = \"\"; });\n" +
"}\n" +
"</script>\n" +
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
"       \n" +
"</style>\n" +
"</head>\n" +
"    \n" +
"	<body>\n" +
"            <h2 name=\"game_players\" id=\"game_players\" style=\"display:none;\"><%= request.getParameter(\"num_players\")%></h2>\n" +
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
"                    <li class=\"button\"><a href=\"search.jsp\">Search Board Game Geek</a></li></ul>\n" +
"                    \n" +
"                    \n" +
"                \n" +
"                \n" +
"            </div>");

        try {
            
            this.makeConnection();
                
            String query = "SELECT * FROM players WHERE game_name = ? AND date = ?";
            // create the mysql insert preparedstatement
            PreparedStatement st = con.prepareStatement(query);
            
            st.setString (1, game_name);
            st.setString (2, date);
            
            ResultSet rs = st.executeQuery();
            out.println("<h3> Player names and thier individual scores from last time played</h3><br>");
            while(rs.next()) {

                String player_name = rs.getString("player_name");
                String score = rs.getString("score");
                         
                out.print("Player Name: "+ player_name + "<br>");
                out.print("Player Score: " + score + "<br><br>");
            }
            
            out.print("<div name=\"2\" id=\"2\">\n" +
"                <form method=\"post\" action=\"updateGame\">\n" +
"                    <center>\n" +
"                        <br><br><h2>Make sure you fill out every field for each player or they will not be saved or submitted</h2>\n" +
"                                <br/><br><h3>Game Name: <input type=\"text\" name=\"game_name\" value=\"" + game_name + "\"" + "required /><h3><br/><br>\n" +
"                Date: <input type=\"date\" name=\"date\" value=\"" + date + "\"" + " required /><br/><br>\n" +
"                        \n" +
"                Player Name:<input type=\"text\" id=\"name\" name=\"name\" align=\"left\" required/>Add Value:<input value=\"0\" type=\"text\" name=\"val\" id=\"val\" align=\"center\" min=\"1\" max=\"3\" size=\"2\"/>\n" +
"                <input type=\"button\" name=\"add\" id=\"add\" value=\"Add To Total\"/><input type=\"button\" id=\"sub\" name=\"sub\" value=\"Subtract To Total\"/> \n" +
"                Total: <input type=\"text\" id=\"total\" name=\"total\" align=\"left\" value=\"0\" max=\"5\" size=\"4\" />\n" +
"                Winner:<input name=\"1\" type=\"text\" placeholder=\"Yes/no\" max=\"5\" size=\"4\"/> <br><br>\n" +
"                        \n" +
"                Player Name:<input type=\"text\" id=\"name2\" name=\"name2\" align=\"left\"/>Add Value:<input value=\"0\" type=\"text\" name=\"val2\" id=\"val2\" align=\"center\" min=\"1\" max=\"3\" size=\"2\"/>\n" +
"                <input type=\"button\" name=\"add2\" id=\"add2\" value=\"Add To Total\"/><input type=\"button\" id=\"sub2\" name=\"sub2\" value=\"Subtract To Total\"/> \n" +
"                Total: <input type=\"text\" id=\"total2\" name=\"total2\" align=\"left\" value=\"0\" max=\"5\" size=\"4\"/>\n" +
"                Winner:<input name=\"2\" type=\"text\" placeholder=\"Yes/no\" max=\"5\" size=\"4\"/> <br><br>\n" +
"                \n" +
"                \n" +
"                Player Name:<input type=\"text\" id=\"name3\" name=\"name3\" align=\"left\"/>Add Value:<input value=\"0\" type=\"text\" name=\"val3\" id=\"val3\" align=\"center\" min=\"1\" max=\"3\" size=\"2\"/>\n" +
"                <input type=\"button\" name=\"add3\" id=\"add3\" value=\"Add To Total\"/><input type=\"button\" id=\"sub3\" name=\"sub3\" value=\"Subtract To Total\"/> \n" +
"                Total: <input type=\"text\" id=\"total3\" name=\"total3\" align=\"left\" value=\"0\" max=\"5\" size=\"4\"/>\n" +
"                Winner:<input name=\"3\" type=\"text\" placeholder=\"Yes/no\" max=\"5\" size=\"4\"/> <br><br>\n" +
"                \n" +
"                \n" +
"                Player Name:<input type=\"text\" id=\"name4\" name=\"name4\" align=\"left\"/>Add Value:<input value=\"0\" type=\"text\" name=\"val4\" id=\"val4\" align=\"center\" min=\"1\" max=\"3\" size=\"2\"/>\n" +
"                <input type=\"button\" name=\"add4\" id=\"add4\" value=\"Add To Total\"/><input type=\"button\" id=\"sub4\" name=\"sub4\" value=\"Subtract To Total\"/> \n" +
"                Total: <input type=\"text\" id=\"total4\" name=\"total4\" align=\"left\" value=\"0\" max=\"5\" size=\"4\"/>\n" +
"                Winner:<input name=\"4\" type=\"text\" placeholder=\"Yes/no\" max=\"5\" size=\"4\"/> <br><br>\n" +
"                \n" +
"                \n" +
"                Player Name:<input type=\"text\" id=\"name5\" name=\"name5\" align=\"left\"/>Add Value:<input value=\"0\" type=\"text\" name=\"val5\" id=\"val5\" align=\"center\" min=\"1\" max=\"3\" size=\"2\"/>\n" +
"                <input type=\"button\" name=\"add5\" id=\"add5\" value=\"Add To Total\"/><input type=\"button\" id=\"sub5\" name=\"sub5\" value=\"Subtract To Total\"/> \n" +
"                Total: <input type=\"text\" id=\"total5\" name=\"total5\" align=\"left\" value=\"0\" max=\"5\" size=\"4\"/>\n" +
"                Winner:<input name=\"5\" type=\"text\" placeholder=\"Yes/no\" max=\"5\" size=\"4\"/> <br><br>\n" +
"                \n" +
"                \n" +
"                Player Name:<input type=\"text\" id=\"name6\" name=\"name6\" align=\"left\"/>Add Value:<input value=\"0\" type=\"text\" name=\"val6\" id=\"val6\" align=\"center\" min=\"1\" max=\"3\" size=\"2\"/>\n" +
"                <input type=\"button\" name=\"add6\" id=\"add6\" value=\"Add To Total\"/><input type=\"button\" id=\"sub6\" name=\"sub6\" value=\"Subtract To Total\"/> \n" +
"                Total: <input type=\"text\" id=\"total6\" name=\"total6\" align=\"left\" value=\"0\" max=\"5\" size=\"4\"/>\n" +
"                Winner:<input name=\"6\" type=\"text\" placeholder=\"Yes/no\" max=\"5\" size=\"4\"/> <br><br>\n" +
"                \n" +
"                Player Name:<input type=\"text\" id=\"name7\" name=\"name7\" align=\"left\"/>Add Value:<input value=\"0\" type=\"text\" name=\"val7\" id=\"val7\" align=\"center\" min=\"1\" max=\"3\" size=\"2\"/>\n" +
"                <input type=\"button\" name=\"add7\" id=\"add7\" value=\"Add To Total\"/><input type=\"button\" id=\"sub7\" name=\"sub7\" value=\"Subtract To Total\"/> \n" +
"                Total: <input type=\"text\" id=\"total7\" name=\"total7\" align=\"left\" value=\"0\" max=\"5\" size=\"4\"/>\n" +
"                Winner:<input name=\"7\" type=\"text\" placeholder=\"Yes/no\" max=\"5\" size=\"4\"/> <br><br>\n" +
"                \n" +
"                \n" +
"                Player Name:<input type=\"text\" id=\"name8\" name=\"name8\" align=\"left\"/>Add Value:<input value=\"0\" type=\"text\" name=\"val8\" id=\"val8\" align=\"center\" min=\"1\" max=\"3\" size=\"2\"/>\n" +
"                <input type=\"button\" name=\"add8\" id=\"add8\" value=\"Add To Total\"/><input type=\"button\" id=\"sub8\" name=\"sub8\" value=\"Subtract To Total\"/> \n" +
"                Total: <input type=\"text\" id=\"total8\" name=\"total8\" align=\"left\" value=\"0\" max=\"5\" size=\"4\"/>\n" +
"                Winner:<input name=\"8\" type=\"text\" placeholder=\"Yes/no\" max=\"5\" size=\"4\"/> <br><br>\n" +
"                        </center>\n" +
"                <center>\n" +
"                <input type=\"submit\" name=\"submit\" value =\"Submit Game\"/>\n" +
"                <input type=\"submit\" name=\"submit\" value =\"Save Game\"/>\n" +
"                <input type=\"reset\" name=\"reset\" value =\"Reset Game\" action=\"reset\"/><br><br><br>\n" +
"                <!--<input type=\"button\" name=\"new_game\" value=\"New game\" action=\"Form.jsp\">-->\n" +
"                </center>\n" +
"                </form>\n" +
"            </div>");
            out.print("</body>\n" + "</html>");
            
            
            
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



