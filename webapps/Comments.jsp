<%-- 
    Document   : Comments
    Created on : Mar 4, 2016, 10:55:43 AM
    Author     : Jared
--%>

<%@page import="java.util.Collections"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Comments Page</title>
    </head>
    <body>
        <h2>Comments Page</h2>
        <%
            List<String> comments = (List<String>)request.getSession().getAttribute("commentList");          
            //print list backwards
            Collections.reverse(comments);
            for (String c : comments) {
                String[] parts = c.split(":");
                String user = parts[0];
                String comment = parts[1];
                String date = parts[2] + ":" + parts[3];
                out.write("<h3>Comment by " + user + "</h3> " + comment + "<br>"
                        + "<span style=\"color:grey\">" + date + "</span><br>");
            }
        %>
        <a href="WelcomePage.jsp">Post another comment</a>
    </body>
</html>
