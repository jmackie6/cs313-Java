<%-- 
    Document   : NewGameForm
    Created on : Mar 11, 2016, 11:11:09 AM
    Author     : Jared
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="javax.servlet.http.HttpSession;"%>
<%
    
    String game_name = request.getParameter("game_name");
    String date = request.getParameter("date");
    String num_players = request.getParameter("num_players");
    session.setAttribute("game_name",game_name); 
    session.setAttribute("date",date);
    session.setAttribute("num_player", num_players); 
                
%>
        
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Home Page</title>
<script src="new_game_form.js"></script>

<link rel="stylesheet" href="style.css" type="text/css" />
<link rel="stylesheet" type="text/css" href="home.css">
<script type="text/javascript" src="http://code.jquery.com/jquery-1.6.1.min.js"></script>
<script type="text/javascript">var search_input= $('.search input[type=text]');var search_input_size = 142; var search_large_size = 154; var padding = 7; var shrinked = "";$(document).ready(function(){search_input.click(function(){shrink();}).focus(function(){shrink();});search_input.blur(function(){ if(shrinked=="YES")normal();});$('.button a').hover(function(){if(shrinked=="YES")normal();}); });function shrink(){if(search_input_size < search_large_size ){$('.button a').each(function(){$(this).animate({'padding-left': padding+'px','padding-right': padding+'px'},'fast');});search_input.animate({'width': search_large_size+'px'},'fast'); shrinked="YES";}return false;}function normal(){search_input.animate({'width':search_input_size+'px'},'fast'); $('.button a').animate({'padding-left':'10px','padding-right':'10px'},'fast');shrinked="";search_input.blur();return false;}
</script>
<script>
    $(document).ready(function() {
    
    $( "#add" ).click(function() {       
     var addedVal =  parseInt($("#val").val())
     
      var totalVal = parseInt($("#total").attr("value")) 
      var total = addedVal + totalVal     
     $("#total").attr("value", total)
     var totalVal = parseInt($("#total").attr("value"))
    });
    $( "#sub" ).click(function() {       
     var subVal =  parseInt($("#val").val())
     
      var totalVal = parseInt($("#total").attr("value")) 
      var total = subVal - totalVal     
     $("#total").attr("value", total)
     var totalVal = parseInt($("#total").attr("value"))
    });
    
    
    $( "#add2" ).click(function() {       
     var addedVal =  parseInt($("#val2").val())
     
      var totalVal = parseInt($("#total2").attr("value")) 
      var total = addedVal + totalVal     
     $("#total2").attr("value", total)
     var totalVal = parseInt($("#total2").attr("value"))
    });
    $( "#sub2" ).click(function() {       
     var subVal =  parseInt($("#val2").val())
     
      var totalVal = parseInt($("#total2").attr("value")) 
      var total = subVal - totalVal     
     $("#total2").attr("value", total)
     var totalVal = parseInt($("#total2").attr("value"))
    });
    
    
    $( "#add3" ).click(function() {       
     var addedVal =  parseInt($("#val3").val())
     
      var totalVal = parseInt($("#total3").attr("value")) 
      var total = addedVal + totalVal     
     $("#total3").attr("value", total)
     var totalVal = parseInt($("#total3").attr("value"))
    });
    $( "#sub3" ).click(function() {       
     var subVal =  parseInt($("#val3").val())
     
      var totalVal = parseInt($("#total3").attr("value")) 
      var total = subVal - totalVal     
     $("#total3").attr("value", total)
     var totalVal = parseInt($("#total3").attr("value"))
    });
    
    
    $( "#add4" ).click(function() {       
     var addedVal =  parseInt($("#val4").val())
     
      var totalVal = parseInt($("#total4").attr("value")) 
      var total = addedVal + totalVal     
     $("#total4").attr("value", total)
     var totalVal = parseInt($("#total4").attr("value"))
    });
    $( "#sub4" ).click(function() {       
     var subVal =  parseInt($("#val4").val())
     
      var totalVal = parseInt($("#total4").attr("value")) 
      var total = subVal - totalVal     
     $("#total4").attr("value", total)
     var totalVal = parseInt($("#total4").attr("value"))
    });
    
    
    $( "#add5" ).click(function() {       
     var addedVal =  parseInt($("#val5").val())
     
      var totalVal = parseInt($("#total5").attr("value")) 
      var total = addedVal + totalVal     
     $("#total5").attr("value", total)
     var totalVal = parseInt($("#total5").attr("value"))
    });
    $( "#sub5" ).click(function() {       
     var subVal =  parseInt($("#val5").val())
     
      var totalVal = parseInt($("#total5").attr("value")) 
      var total = subVal - totalVal     
     $("#total5").attr("value", total)
     var totalVal = parseInt($("#total5").attr("value"))
    });
  });
  
  
  $( "#add6" ).click(function() {       
     var addedVal =  parseInt($("#val6").val())
     
      var totalVal = parseInt($("#total6").attr("value")) 
      var total = addedVal + totalVal     
     $("#total6").attr("value", total)
     var totalVal = parseInt($("#total6").attr("value"))
    });
    $( "#sub6" ).click(function() {       
     var subVal =  parseInt($("#val6").val())
     
      var totalVal = parseInt($("#total6").attr("value")) 
      var total = subVal - totalVal     
     $("#total6").attr("value", total)
     var totalVal = parseInt($("#total6").attr("value"))
    });
    
    
    $( "#add7" ).click(function() {       
     var addedVal =  parseInt($("#val7").val())
     
      var totalVal = parseInt($("#total7").attr("value")) 
      var total = addedVal + totalVal     
     $("#total7").attr("value", total)
     var totalVal = parseInt($("#total7").attr("value"))
    });
    $( "#sub7" ).click(function() {       
     var subVal =  parseInt($("#val7").val())
     
      var totalVal = parseInt($("#total7").attr("value")) 
      var total = subVal - totalVal     
     $("#total7").attr("value", total)
     var totalVal = parseInt($("#total7").attr("value"))
    });
    
    
    $( "#add8" ).click(function() {       
     var addedVal =  parseInt($("#val8").val())
     
      var totalVal = parseInt($("#total8").attr("value")) 
      var total = addedVal + totalVal     
     $("#total8").attr("value", total)
     var totalVal = parseInt($("#total8").attr("value"))
    });
    $( "#sub8" ).click(function() {       
     var subVal =  parseInt($("#val8").val())
     
      var totalVal = parseInt($("#total8").attr("value")) 
      var total = subVal - totalVal     
     $("#total8").attr("value", total)
     var totalVal = parseInt($("#total8").attr("value"))
    });
    
    function reset()
{
   $('input[type="text"]').each (function() { this.val = ""; });
}
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
            <h2 name="game_players" id="game_players" style="display:none;"><%= request.getParameter("num_players")%></h2>
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
                    <li class="button"><a href="#">Player Stats</a></li>
                    <li class="button"><a href="#">Games Played</a></li>
                    <li class="button"><a href="logout.jsp">Logout</a></li> 
                    <li class="search"><a href="#"></a><input type="text" placeHolder="Search"  /></li></ul>
                    
                    
                
                
            </div>
            
            <div name="2" id="2">
                <form method="post" action="newGame">
                    <center>
                <br/><br>Game Name: <input type="text" name="game_name" required /><br/><br>
                Date: <input type="date" name="date" required /><br/><br>
                    
                        
                Player Name:<input type="text" id="name" name="name" align="left"/>Add Value:<input value="0" type="text" name="val" id="val" align="center" min="1" max="3" size="2"/>
                <input type="button" name="add" id="add" value="Add To Total"/><input type="button" id="sub" name="sub" value="Subtract To Total"/> 
                Total: <input type="text" id="total" name="total" align="left" value="0" max="5" size="4"/>
                Winner:<input name="1" type="text" placeholder="Yes/no" max="5" size="4"/> <br><br>
                        
                Player Name:<input type="text" id="name2" name="name2" align="left"/>Add Value:<input value="0" type="text" name="val2" id="val2" align="center" min="1" max="3" size="2"/>
                <input type="button" name="add2" id="add2" value="Add To Total"/><input type="button" id="sub2" name="sub2" value="Subtract To Total"/> 
                Total: <input type="text" id="total2" name="total2" align="left" value="0" max="5" size="4"/>
                Winner:<input name="2" type="text" placeholder="Yes/no" max="5" size="4"/> <br><br>
                
                
                Player Name:<input type="text" id="name3" name="name3" align="left"/>Add Value:<input value="0" type="text" name="val3" id="val3" align="center" min="1" max="3" size="2"/>
                <input type="button" name="add3" id="add3" value="Add To Total"/><input type="button" id="sub3" name="sub3" value="Subtract To Total"/> 
                Total: <input type="text" id="total3" name="total3" align="left" value="0" max="5" size="4"/>
                Winner:<input name="3" type="text" placeholder="Yes/no" max="5" size="4"/> <br><br>
                
                
                Player Name:<input type="text" id="name4" name="name4" align="left"/>Add Value:<input value="0" type="text" name="val4" id="val4" align="center" min="1" max="3" size="2"/>
                <input type="button" name="add4" id="add4" value="Add To Total"/><input type="button" id="sub4" name="sub4" value="Subtract To Total"/> 
                Total: <input type="text" id="total4" name="total4" align="left" value="0" max="5" size="4"/>
                Winner:<input name="4" type="text" placeholder="Yes/no" max="5" size="4"/> <br><br>
                
                
                Player Name:<input type="text" id="name5" name="name5" align="left"/>Add Value:<input value="0" type="text" name="val5" id="val5" align="center" min="1" max="3" size="2"/>
                <input type="button" name="add5" id="add5" value="Add To Total"/><input type="button" id="sub5" name="sub5" value="Subtract To Total"/> 
                Total: <input type="text" id="total5" name="total5" align="left" value="0" max="5" size="4"/>
                Winner:<input name="5" type="text" placeholder="Yes/no" max="5" size="4"/> <br><br>
                
                
                Player Name:<input type="text" id="name6" name="name6" align="left"/>Add Value:<input value="0" type="text" name="val6" id="val6" align="center" min="1" max="3" size="2"/>
                <input type="button" name="add6" id="add6" value="Add To Total"/><input type="button" id="sub6" name="sub6" value="Subtract To Total"/> 
                Total: <input type="text" id="total6" name="total6" align="left" value="0" max="5" size="4"/>
                Winner:<input name="6" type="text" placeholder="Yes/no" max="5" size="4"/> <br><br>
                
                Player Name:<input type="text" id="name7" name="name7" align="left"/>Add Value:<input value="0" type="text" name="val7" id="val7" align="center" min="1" max="3" size="2"/>
                <input type="button" name="add7" id="add7" value="Add To Total"/><input type="button" id="sub7" name="sub7" value="Subtract To Total"/> 
                Total: <input type="text" id="total7" name="total7" align="left" value="0" max="5" size="4"/>
                Winner:<input name="7" type="text" placeholder="Yes/no" max="5" size="4"/> <br><br>
                
                
                Player Name:<input type="text" id="name8" name="name8" align="left"/>Add Value:<input value="0" type="text" name="val8" id="val8" align="center" min="1" max="3" size="2"/>
                <input type="button" name="add8" id="add8" value="Add To Total"/><input type="button" id="sub8" name="sub8" value="Subtract To Total"/> 
                Total: <input type="text" id="total8" name="total8" align="left" value="0" max="5" size="4"/>
                Winner:<input name="8" type="text" placeholder="Yes/no" max="5" size="4"/> <br><br>
                        </center>
                <center>
                <input type="submit" name="submit" value ="Submit Game"/>
                <input type="submit" name="submit" value ="Save Game"/>
                <input type="reset" name="reset" value ="Reset Game" action="reset"/>
                <input type="button" name="new_game" value="New game" action="Form.jsp">
                </center>
                </form>
            </div>
            
            
        </body>
</html>

