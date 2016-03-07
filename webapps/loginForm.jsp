<%-- 
    Document   : login_form
    Created on : Mar 4, 2016, 10:57:20 AM
    Author     : Jared
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
    <center>
        <form action="CheckLogin" method="POST">
            Username<br/>
            <input type="text" name="username" > <br>
            Password<br/>
            <input type="password" name="password" > <br>
            <input type="submit" value="Log In" >
        </form>
    </center>
    </body>
</html>
