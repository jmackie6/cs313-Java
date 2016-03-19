<%-- 
    Document   : login
    Created on : Mar 17, 2016, 9:22:52 PM
    Author     : Jared
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="javax.servlet.http.HttpSession;"%>
        
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Home Page</title>

<link rel="stylesheet" href="style.css" type="text/css" />
<link rel="stylesheet" type="text/css" href="home.css">
    
    <body>
        <center>
<div id="login-form">
    <h1>Login</h1>
<form method="post" action="LoginCheck">
<table align="center" width="30%" border="0">
<tr>
<td><input type="text" name="user" placeholder="username" required /></td>
</tr>
<tr>
<td><input type="password" name="pass" placeholder="password" required /></td>
</tr>
<tr>
<td><button type="submit" name="submit">Login In</button></td>
</tr>
<tr>
<td><a href="sign_up.jsp">Sign Up </a></td>
</tr>
</table>
</form>
</div>
</center>
      </body>
</html>      
