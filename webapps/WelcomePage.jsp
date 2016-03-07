<%-- 
    Document   : WelcomePage
    Created on : Mar 4, 2016, 10:56:48 AM
    Author     : Jared
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body>
    <center>
        <p>Welcome ${username} <a href="login_form.jsp">Log Out</a></p>
        <form method="POST" action="AddComment">
            Add a Comment<br/>
            <input type="text" name="comment">
            <input type="submit" value="Post Comment">
        </form>
        <a href="LoadComments">View Comments</a>
    </center>
    </body>
</html>
