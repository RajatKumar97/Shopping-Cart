<%-- 
    Document   : waste
    Created on : 30 Jun, 2014, 5:24:35 PM
    Author     : WORLD
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
        <title>Shopping Cart</title>
	<meta http-equiv="Content-type" content="text/html; charset=utf-8" />
	<link rel="shortcut icon" href="css/images/favicon.ico" />
	<link rel="stylesheet" href="css/style.css" type="text/css" media="all" />
      
 <link rel="stylesheet" href="css/tables.css" type="text/css" media="all" />

        <!--[if IE 6]>
	<link rel="stylesheet" href="css/ie6.css" type="text/css" media="all" />	
	<![endif]-->
        <script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
	
	<script src="js/jquery-1.7.min.js" type="text/javascript"></script>
	<script src="js/DD_belatedPNG-min.js" type="text/javascript"></script>
	<script src="js/jquery.jscrollpane.min.js" type="text/javascript"></script>
	<script src="js/jquery.jcarousel.js" type="text/javascript"></script>
	<script src="js/functions.js" type="text/javascript"></script>
       

<script type="text/javascript" src="js/jquery.leanModal.min.js"></script>
</head>
<body>
     <div id="wrapper">
		<div id="wrapper-bottom">
                    <div class="shell" style="height: 850px">
				<!-- Header -->
				<div id="header">
					<!-- Logo -->
					<h1 id="logo"><a title="Home" href="#">Electronics store</a></h1>
                                         <% if(session.getAttribute("email")!=null)
                                                                                       {
                                            %>
                                            <form>	<p class="shopping-cart"><a class="cart" href="billcheck.jsp" title="Your Shopping Cart">Your Shopping Cart</a><span>Name : </span><%=session.getAttribute("name")%>&nbsp;					
				<input class="button red" type ="submit" name="logout" value="Logout"/></form>
                                                <% 
                                                if(request.getParameter("logout")!=null)
                                                                                                       {
                                                    session.removeAttribute("email");
                                                    response.sendRedirect("index.jsp");
                                                }
                                        }
else
{
 %>                                             <% }
                                        %>
                                        
                                        <span></span></p>
                                        
                                        
                                        
                                        
                                        
                                        
                                        <!-- Search -->
					<div class="search-expand"></div>
					<div id="search">
						<div class="retract-button">
							<p>retract</p>
						</div>
						<form action="" method="post">
							<input type="text" class="field" value="Search" title="Search" />
							<input type="submit" value="" class="submit-button" />
						</form>						
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
                                            <h1 style="margin-left: 350px"> Your Search Results are :</h1><br>
                                            <hr>
                                            <br>
                                            <div style="margin-top: 23px" class="CSSTableGenerator">
                                            <table  style="">
                                                
        <tr> <td>Product ID </td>
            <td> Product Name</td>
            <td> Product Category</td>
            <td>Product Brand</td>
            <td>  Product price</td>
             <td>  Product Model</td>
             <td> Show here</td>
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
   rs= smt.executeQuery("select * from image where category='"+session.getAttribute("search")+"' || brand='"+session.getAttribute("search") +"' || model='"+session.getAttribute("search") +"' || name='"+session.getAttribute("search") +"' ");
while(rs.next())
       {
    %>
    <tr>
   
  <td>  <%=rs.getString(1)%> </td>
    <td>  <%=rs.getString(2)%> </td>
     <td>  <%=rs.getString(4)%> </td>
      <td>  <%=rs.getString(5)%> </td> 
      <td>  <%=rs.getString(7)%> </td> 
      <td>  <%=rs.getString(6)%> </td>
      <td><a href="info.jsp?q=<%=rs.getString(1)%>"><img src="uploaded/search.png"/></a> </td>
      
  
      
      

    
   
            <%
                       
}  
}        
catch(Exception ex)
               {
out.println(ex.getMessage());
}

%>
</tr>

    </table>
                                            </div>
                                                </div>

	<!-- END Wrapper -->
	<!-- Footer -->
	

                                                </div>

                                        </div>

                                </div>

 <div id="footer">
		<div class="shell">
			<a class="footer-logo" href="http://css-free-templates.com/" title="Home"><img src="css/images/logo-footer.png" alt="Logo" /></a>
			<p id="bottom-nav"><a title="Home" href="#">Home</a><a title="About Us" href="#">About Us</a></p>
			<div class="cl"></div>
		</div>
	</div>
	<!-- END Footer -->
</body>
</html>