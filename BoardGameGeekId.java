/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.scoretracker;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.net.URL;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.*;

/**
 *
 * @author Jared
 */
@WebServlet(name = "BoardGameGeekId", urlPatterns = {"/BoardGameGeekId"})
public class BoardGameGeekId extends HttpServlet {

    
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
        String game_id = request.getParameter("game_id");
        //out.println(game_id);
        
        out.print("<html xmlns=\"http://www.w3.org/1999/xhtml\"><head>\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" /><title>Home Page</title>\n<link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\" />\n<link rel=\"stylesheet\" type=\"text/css\" href=\"home.css\">\n<script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-1.6.1.min.js\"></script>");
        out.print("<style>\n" +
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
"                    <li class=\"search\"><input type=\"text\" name=\"bgg\" placeHolder=\"Search\"  /></li></ul>\n" +
"<!--                    <li class=\"search\"><a href=\"BGG2\"></a><input type=\"text\" name=\"bgg\" placeHolder=\"Search\"  /></li></ul>-->\n" +
"                \n" +
"            </div>\n" +
"            \n"); 
        
        try {
                    
                    String url = "https://www.boardgamegeek.com/xmlapi/boardgame/" + game_id +"?stats=1";
                    //out.println(url);
                    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                    //out.println("dbf");
                    DocumentBuilder db = dbf.newDocumentBuilder();
                    //out.println("db");
                    //out.println("URL: " + url);
                    Document doc = db.parse(new URL(url).openStream());
                    //out.println("doc ready to go");

                    doc.getDocumentElement().normalize();
                    
                    NodeList nList = doc.getElementsByTagName("boardgame");
              
                for (int temp = 0; temp < nList.getLength(); temp++) {

                    Node nNode = nList.item(temp);
                    
                    Element eElement = (Element) nNode;

                    
                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                            
                        out.println("<br><br>Year Published : " + eElement.getElementsByTagName("yearpublished").item(0).getTextContent() + "<br>");    
                        out.println("min players : " + eElement.getElementsByTagName("minplayers").item(0).getTextContent() + "<br>");
                        out.println("max players : " + eElement.getElementsByTagName("maxplayers").item(0).getTextContent() + "<br>");
                        out.println("Playing time : " + eElement.getElementsByTagName("playingtime").item(0).getTextContent() + "<br>");
                        out.println("mim playing time : " + eElement.getElementsByTagName("minplaytime").item(0).getTextContent() + "<br>");
                        out.println("max playing time : " + eElement.getElementsByTagName("maxplaytime").item(0).getTextContent() + "<br><br>");
                        out.println("Description : " + eElement.getElementsByTagName("description").item(0).getTextContent() + "<br>");
                        out.println("Board game publisher : " + eElement.getElementsByTagName("boardgamepublisher").item(0).getTextContent() + "<br>");
                        out.println("Board game subdomain : " + eElement.getElementsByTagName("boardgamesubdomain").item(0).getTextContent() + "<br>");
                        out.println("Board game category : " + eElement.getElementsByTagName("boardgamecategory").item(0).getTextContent() + "<br>");
                        out.println("Board game designer : " + eElement.getElementsByTagName("boardgamedesigner").item(0).getTextContent() + "<br>");
                        NodeList sList = doc.getElementsByTagName("ratings");
                        for (int temp2 = 0; temp2 < nList.getLength(); temp2++) {
                            
                            Node sNode = sList.item(temp2);

                            Element sElement = (Element) sNode;
                            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                                out.println("average rating : " + sElement.getElementsByTagName("average").item(0).getTextContent() + "<br>");
                            
                            }
                        }

                    }
                }
                
                out.print("</body>\n" + "</html>");
        }
        catch (Exception e) {
            e.printStackTrace();
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

