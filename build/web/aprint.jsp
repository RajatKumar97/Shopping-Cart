<%-- 
    Document   : aprint
    Created on : 18 Jul, 2014, 10:40:08 AM
    Author     : WORLD
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
        <title>Shopping Cart</title>
	<meta http-equiv="Content-type" content="text/html; charset=utf-8" />
	<link rel="shortcut icon" href="css/images/favicon.ico" />
	<link rel="stylesheet" href="css/style.css" type="text/css" media="all" />
        <link rel="stylesheet" href="css/styless.css" type="text/css" media="all" />
         <link rel="stylesheet" href="css/tables.css" type="text/css" media="all" />


        <!--[if IE 6]>
	<link rel="stylesheet" href="css/ie6.css" type="text/css" media="all" />	
	<![endif]-->
        <script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
	<link rel="stylesheet" href="css/jquery.jscrollpane.css" type="text/css" media="all" />
	<script src="js/jquery-1.7.min.js" type="text/javascript"></script>
	<script src="js/DD_belatedPNG-min.js" type="text/javascript"></script>
	<script src="js/jquery.jscrollpane.min.js" type="text/javascript"></script>
	<script src="js/jquery.jcarousel.js" type="text/javascript"></script>
	<script src="js/functions.js" type="text/javascript"></script>
        <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css" />
<link type="text/css" rel="stylesheet" href="css/styles.css" />
<script type="text/javascript" src="js/jquery.leanModal.min.js"></script>

    </head>
    <body>
         <div id="wrapper">
		<div id="wrapper-bottom">
                    <div class="shell" style="height: 1050px">
				<!-- Header -->
				<div id="header">
					<!-- Logo -->
					<h1 id="logo"><a title="Home" href="#">Electronics store</a></h1>
                                        <% if(session.getAttribute("emaill")!=null)
                                                                                       {
                                            %>
                                            <form>  <p class="shopping-cart"><a class="cart" href="bill.jsp" title="Your Shopping Cart">Your Shopping Cart</a> <span class="price">Welcome :</span>ADMINISTRATOR&nbsp;
                                                <input class="button red" type ="submit" name="logout" value="Logout"/></form>
                                                <% 
                                                if(request.getParameter("logout")!=null)
                                                                                                       {
                                                    session.removeAttribute("emaill");
                                                    response.sendRedirect("index.jsp");
                                                }
                                        }
                        else
                      {
             %>
                                            <p class="shopping-cart"><a class="cart" href="#" title="Your Shopping Cart">Your Shopping Cart</a><span></span>&nbsp;
                                                <% }
                                        %>
                                        
                                        <span></span></p>
                                        
                                        
                                        
                                        
                                        <!-- Search -->
					<div class="search-expand"></div>
					<div id="search">
						<div class="retract-button">
							<p>retract</p>
						</div>
						<form action="" method="post">
							 <input type="text" class="field" value="Search" name="search" />
                                                         <input type="submit" value="" class="submit-button" name="search"/>
						</form>	
                                            <% 
                                                if(request.getParameter("search")!=null)
                                                                                                       {
                                                    session.setAttribute("search",request.getParameter("search"));
                                                    response.sendRedirect("waste.jsp");
                                                }
                                                
%>					
					</div>
					<!-- END Search -->
					<div class="cl"></div>
					<!-- Navigation -->
					<div id="navigation">
						<ul>
							<li><a title="Home" href="index.jsp">Home</a></li>
							<li><a title="About Us" href="#">About Us</a></li>							
						</ul>						
					</div>	
					<div class="cl"></div>				
					<!-- END Navigation -->
					<!-- Dropdown Navigation -->
					<div id="sort-nav">						
						<span class="label-left"></span>
							<div class="label-bg">						
							<ul>
								<li>
									<a title="Collections" href="#">Collections</a>							
									<div class="dd">
										<ul>
											<li><a title="Laptops" href="laptops.jsp">Laptops</a></li>
											<li><a title="Product" href="pendrives.jsp">Pendrives</a></li>
											<li><a title="Product" href="mobiles.jsp">Mobiles</a></li></ul></div></li>							
								<li>
									<a title="Brand" href="#">Brands</a>
									<div class="dd">
										<ul>
											<li><a title="Product" href="hp.jsp">Hp</a></li>
											<li><a title="Product" href="samsung.jsp">Samsung</a></li>
											<li><a title="Product" href="dell.jsp">Dell</a></li>
											<li><a title="Product" href="sony.jsp">Sony</a></li>												
										</ul>
									</div>
								</li>
								<li class="last">
									<a title="By Price" class="By Price" href="#">By Price</a>
									<div class="dd">
										<ul>
											<li><a title="Product" href="lowhigh.jsp">Low to high</a></li>
											<li><a title="Product" href="highlow.jsp">High to Low</a></li>												
										</ul>									
									</div>
								</li>
							</ul>
						</div>
						<span class="label-right"></span>									
					</div>					
					<!-- END Dropdown Navigation -->
					<div class="cl"></div>
                                        <div id="content" style="background:whitesmoke;height:300px">
                                            <h1 style="margin-left: 360px;margin-top: 10px"> Pending Orders </h1>
                                            <br>
                                            <hr>
                                            
                                            <div class="CSSTableGenerator" style="margin-top: 35px">
                                            <table  style="">
            <tr>
                <td>Order No.</td>
                <td>Customer ID </td>
                <td> Product Name </td>
                <td> Price  </td>
                <td>Order Date </td>
                <td>Customer address </td>
                <td>What to do</td>
                <td>Delete Order</td>
            </tr>
            
        <% 
Connection con;
Statement smt;
ResultSet rs;
try
{
     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    con=DriverManager.getConnection("jdbc:odbc:project");
    smt=con.createStatement();
   rs=smt.executeQuery("select * from ordr");
   while(rs.next())
             {
       %>
       
            <tr>
                <td><%=rs.getString(1)%> </td>
                <td> <%=rs.getString(2)%></td>
                <td><%=rs.getString(8)%></td>
                
                <td><%=rs.getString(9)%></td>
                
                <td><%=rs.getString(4)%></td>
                <td><%=rs.getString(6)%></td>
                
                 
                
           
                <td>
        <form>
            <input type="hidden" value="<%=rs.getString(1)%>" name="hi"/>
            <input type="hidden" value="<%=rs.getString(2)%>" name="hii"/>
            <input type="hidden" value="<%=rs.getString(5)%>" name="h"/>
            <input type="hidden" value="<%=rs.getString(6)%>" name="i"/>
            <input type="hidden" value="<%=rs.getString(7)%>" name="j"/>
            <input type="hidden" value="<%=rs.getString(8)%>" name="k"/>
             <input type="hidden" value="<%=rs.getString(9)%>" name="l"/>
              <input type="hidden" value="<%=rs.getString(10)%>" name="m"/>
            
        
              
             <input type="submit" class="button green"name="ap" value="Approve"/>           <input type="submit" class="button red"name="ca" value="Cancel the request"/> </form></td>
       
       <td>
           <a title="Details" href="wasteeww.jsp?q=<%=rs.getString(1)%>"> <img src="uploaded/del.png"/> </a>
                                                                             </td>
                     </tr>
                     
        
            
        <%
               
String sta="";   
//String date= rs.getString(4);    
        if(request.getParameter("ap")!=null)
                       {
            
           sta="approved";
           
           smt.executeUpdate("insert into sta values("+request.getParameter("hi") +",'"+sta+"','"+request.getParameter("hii") +"','"+rs.getString(3) +"','"+rs.getString(4) +"','"+request.getParameter("h")+"','"+request.getParameter("i")+"','"+request.getParameter("j")+"','"+request.getParameter("k")+"','"+request.getParameter("l")+"','"+request.getParameter("m")+"')");
           response.sendRedirect("admin.jsp");
       }
if(request.getParameter("ca")!=null)
                       {
           sta="rejected";
           smt.executeUpdate("insert into sta values("+request.getParameter("hi") +",'"+sta+"','"+request.getParameter("hii") +"','"+rs.getString(3) +"','"+rs.getString(4) +"','"+request.getParameter("h")+"','"+request.getParameter("i")+"','"+request.getParameter("j")+"','"+request.getParameter("k")+"','"+request.getParameter("l")+"','"+request.getParameter("m")+"')");
 //response.sendRedirect("admin.jsp");      
           }

}
    }
           
catch(Exception ex)
               {
//out.println(ex.getMessage());
}

%>
                                            
        	                     
                                      
    
        
    </table>
                                            </div>
                                            
		                     
                       
    </body>
</html>
