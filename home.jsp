<%-- 
    Document   : home
    Created on : Mar 11, 2016, 9:36:12 AM
    Author     : Jared
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    
if (session.getAttribute("username") == null || session.getAttribute("username").equals(""))
{
    response.sendRedirect("login.jsp");
}
else
{
    String u = session.getAttribute("username").toString();   
}

%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Home Page</title>
<link rel="stylesheet" href="style.css" type="text/css" />
<link rel="stylesheet" type="text/css" href="home.css">
<script type="text/javascript" src="http://code.jquery.com/jquery-1.6.1.min.js"></script>
<!--<script type="text/javascript">var search_input= $('.search input[type=text]');var search_input_size = 142; var search_large_size = 154; var padding = 7; //var shrinked = "";$(document).ready(function(){search_input.click(function(){shrink();}).focus(function(){shrink();});search_input.blur(function(){ if(shrinked=="YES")normal();});$('.button a').hover(function(){if(shrinked=="YES")normal();}); });function shrink(){if(search_input_size < search_large_size ){$('.button a').each(function(){$(this).animate({'padding-left': padding+'px','padding-right': padding+'px'},'fast');});search_input.animate({'width': search_large_size+'px'},'fast'); shrinked="YES";}return false;}function normal(){search_input.animate({'width':search_input_size+'px'},'fast'); $('.button a').animate({'padding-left':'10px','padding-right':'10px'},'fast');shrinked="";search_input.blur();return false;}
</script> -->
<style>
         P.mainTitle 
         {
               color: white; 
               font-family:"times";     
               font-style:normal; 
               font-size:30pt;
         }         
         p.sideBar
         {
               font-family: courier;
               
         }
         p.main
         {
               font-size: 15px;
               
               
         }
         p.bottom
         {
               font-size: 30px;
               
         }
         
</style>
</head>
	<body>
            <div id="header">
 		<div id="left">
    		<label>Game Score Tracker</label>
                </div>
                <div id="right">
                    <div id="content">
                        <!--Hello-- <?php echo $userRow['username']; ?>&nbsp;<a class="sign" href="logout.php?logout">--Sign Out--</a>-->
                    </div>
                </div>
            </div>
            <div id="top">
                <ul id="menu_wrap" class="Gray">
                    <li class="button"><a href="NewGameForm.jsp">New Game</a></li>
                    <li class="button"><a href="Form.jsp">Continue Game</a></li>
                    <li class="button"><a href="player.jsp">Player Stats</a></li>
                    <li class="button"><a href="Game">Games Played</a></li>
                    <li class="button"><a href="logout.jsp">Logout</a></li> 
                    <li class="button"><a href="search.jsp">Search Board Game Geek</a></li>
<!--                    <li class="search"><input type="text" name="bgg" placeHolder="Search"  /></li></ul>-->
<!--                    <li class="search"><a href="BGG2"></a><input type="text" name="bgg" placeHolder="Search"  /></li></ul>-->
                
            </div>
      
            <center>
                <h1>Popular New Board Games </h1>
            </center>
            <table width="100%" border="0">
                <tr>    
                    <td><img src="instanbul.jpg" alt="" align="left" style="width: 300px; height: 300px"/></td>
                    <td><img src="machiKoro.jpg" alt="" align="center" style="width: 300px; height: 300px"/></td>
                    <td><img src="fiveTribes.jpg" alt="" align="right" style="width: 300px; height: 300px"/></td>
                </tr>
            </table>
            
            <table width="100%" border="0">
                <tr>    
                    <td><img src="Coup.jpg" alt="" align="left" style="width: 300px; height: 300px"/></td>
                    <td><img src="camelUp.jpg" alt="" align="center" style="width: 300px; height: 300px"/></td>
                    <td><img src="deadOfWinter.jpg" alt="" align="right" style="width: 300px; height: 300px"/></td>
                </tr>
            </table>
            
            <table width="100%" border="0">
                <tr>    
                    <td><img src="splendor.jpg" alt="" align="left" style="width: 300px; height: 300px"/></td>
                    <td><img src="starRealms.jpg" alt="" align="center" style="width: 300px; height: 300px"/></td>
                    <td><img src="summoner.jpg" alt="" align="right" style="width: 300px; height: 300px"/></td>
                </tr>
            </table>
            
            <table width="100%" border="0">
                <tr>    
                    <td><img src="tobago.jpg" alt="" align="left" style="width: 300px; height: 300px"/></td>
                    <td><img src="sheriff.jpg" alt="" align="center" style="width: 300px; height: 300px"/></td>
                    
                </tr>
            </table><br><br>
                    <center>
                    <a href="search.jsp"><span style="color: black">For more information about these games click here to search them</span></a>
                    <br><br><br><br>
                    </center>
        </body>
</html>
