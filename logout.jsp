<%-- 
    Document   : logout
    Created on : Mar 18, 2016, 2:54:01 PM
    Author     : Jared
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>logout page</title>
    </head>
    <body>
        <% 
            session.removeAttribute("username"); 
            session.removeAttribute("password"); 
            session.invalidate(); 
        %> 
        <h1>Logout was done successfully.</h1>
        <%
            response.sendRedirect("login.jsp");
        %>
    </body>
</html>
