<%-- 
    Document   : home
    Created on : Mar 11, 2016, 9:36:12 AM
    Author     : Jared
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--session_start();
include_once 'dbconnect.php';

if(!isset($_SESSION['user']))
{
 header("Location: main.php");
}
$res=mysqli_query($mysqlCon, "SELECT * FROM user WHERE user_id=".$_SESSION['user']);
$userRow=mysqli_fetch_array($res);
?>
-->
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Home Page</title>
<link rel="stylesheet" href="style.css" type="text/css" />
<link rel="stylesheet" type="text/css" href="home.css">
<script type="text/javascript" src="http://code.jquery.com/jquery-1.6.1.min.js"></script>
<script type="text/javascript">var search_input= $('.search input[type=text]');var search_input_size = 142; var search_large_size = 154; var padding = 7; var shrinked = "";$(document).ready(function(){search_input.click(function(){shrink();}).focus(function(){shrink();});search_input.blur(function(){ if(shrinked=="YES")normal();});$('.button a').hover(function(){if(shrinked=="YES")normal();}); });function shrink(){if(search_input_size < search_large_size ){$('.button a').each(function(){$(this).animate({'padding-left': padding+'px','padding-right': padding+'px'},'fast');});search_input.animate({'width': search_large_size+'px'},'fast'); shrinked="YES";}return false;}function normal(){search_input.animate({'width':search_input_size+'px'},'fast'); $('.button a').animate({'padding-left':'10px','padding-right':'10px'},'fast');shrinked="";search_input.blur();return false;}
</script>
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
                    <li class="button"><a href="#"><a href="NewGameForm.jsp">New Game</a></a></li>
                    <li class="button"><a href="#">Continue Game</a></li>
                    <li class="button"><a href="#">Player Stats</a></li>
                    <li class="button"><a href="#">Games Played</a></li>
                    <li class="button"><a href="#">Logout</a></li> 
                    <li class="search"><a href="#"></a><input type="text" placeHolder="Search"  /></li></ul>
                <!--<p class="mainTitle">Lets get started on this project</P> -->
                
            </div>
            
            
        </body>
</html>
