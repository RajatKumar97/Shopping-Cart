<%@page import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html lang="en-US" xmlns="http://www.w3.org/1999/xhtml" dir="ltr">
<head>
	<title>Shopping Cart</title>
	<meta http-equiv="Content-type" content="text/html; charset=utf-8" />
	<link rel="shortcut icon" href="css/images/favicon.ico" />
	<link rel="stylesheet" href="css/style.css" type="text/css" media="all" />
        <link rel="stylesheet" href="css/table.css" type="text/css" media="all" />
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
       
   
      
	<!-- Wrapper -->
	<div id="wrapper">
		<div id="wrapper-bottom">
			<div class="shell">
				<!-- Header -->
				<div id="header">
					<!-- Logo -->
					<h1 id="logo"><a title="Home" href="#">Electronics store</a></h1>
					<% if(session.getAttribute("email")!=null)
                                                                                       {
                                            %>
                                             <form>    <p class="shopping-cart"><a class="cart" href="#" title="Your Shopping Cart">Your Shopping Cart</a><span>Name :<%=session.getAttribute("email")%> </span>&nbsp;
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
 %>
                                            <p class="shopping-cart"><a class="cart" href="#" title="Your Shopping Cart">Your Shopping Cart</a><span>Name : </span>&nbsp;
                                                <% }
                                        %>
                                        
                                        <span></span></p>
					<div class="search-expand"></div>
					<div id="search">
						<div class="retract-button">
							<p>retract</p>
						</div>
						<form action="" method="post">
							 <input type="text" class="field" value="Search" name="search" />
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
											<li><a title="Laptops" href="laptops.jsp?qv=laptop">Laptops</a></li>
											<li><a title="Product" href="laptops.jsp?qv=pendrive">Pendrives</a></li>
											<li><a title="Product" href="laptops.jsp?qv=mobile">Mobiles</a></li></ul></div></li>							
								<li>
									<a title="Brand" href="#">Brands</a>
									<div class="dd">
										<ul>
											<li><a title="Product" href="hp.jsp?qc=hp">Hp</a></li>
											<li><a title="Product" href="hp.jsp?qc=samsung">Samsung</a></li>
											<li><a title="Product" href="hp.jsp?qc=dell">Dell</a></li>
											<li><a title="Product" href="hp.jsp?qc=sony">Sony</a></li>												
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
				</div>
				<!-- END Header -->
				<!-- Main -->
				
					<!-- Slider -->
					<%
       
        
            Connection con;
        Statement stmt;
        ResultSet rs;
        String id="";
        int idd;
 try
                               {
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    con=DriverManager.getConnection("jdbc:odbc:project");
    stmt=con.createStatement();
    
  
    rs=stmt.executeQuery("select * from sta where  email='"+session.getAttribute("email") +"'");
      if(rs.next())
                   {
                   %>
					<!-- Content -->
                                        <div id="content" style="background:white;height:600px">    
						<!-- Featured Products -->
                                                <div style="height:220px;width:900px;background-color:whitesmoke;">
                                                    
                                                    <br></br>   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  Name   :<%=rs.getString(6)%><br></br>
                                                    <div style="float: right; margin-right: 100px;">
                                                        <h2 style="color:#3399ff">
                                                           Your Approved cart items will be Delivered <br></br> to your Address within 3 to 4 days <br></br>
                                                               
                                                               Thankyou For Shopping with Us.. 
                                                       </h2>
                                                      
                                                  </div>
                                               
                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   Email  :<%=rs.getString(3)%>  <br></br>
                                                   
                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   Address : <%=rs.getString(7)%><br></br>
                                                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    Mobile  : &nbsp;&nbsp; <%=rs.getString(8)%> <br></br>
                                                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    Ordered On :<%=rs.getString(5)%><br></br>
                                                  
                                                </div> <br>
                                                
                                                  <div style="height: 250px; width: 900px; background-color: whitesmoke">
                                                      
                                                    
                                                    <br></br> <h2 style="color:black">
                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                        Order Summary
                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                    
                                                    
                                                     
                                                    </h2>
                                                    <br>
                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                       Item 
                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                     Price(Rs.)
                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                    Quantity
                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                    Status  
                                                         <br></br>
                                                         
                                                        
                                                          
                                                              <% 
            Connection con2;
            Statement smt;
            ResultSet rs2;
            try
                                       {
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                con2=DriverManager.getConnection("jdbc:odbc:project");
                smt=con2.createStatement();
                %>
                                                   <%
                rs2=smt.executeQuery("select * from sta where email='"+session.getAttribute("email") +"'");
            while(rs2.next())
                               {
            
            %>
                                                
                                         <table style="margin-left: 170px">          
                                 
                                              
            <tr>
                                                  
            <td> 
                <h3><%=rs2.getString(9)%> </h3>
                                                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                         </td>
                                                                       <td>  <h3> <%=rs2.getString(10)%> </h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                               &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                               &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                               &nbsp;&nbsp;&nbsp;&nbsp
                                                                    
                                                         </td>
                                                                 <td>  <h3> <%=rs2.getString(11)%> </h3> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                   
                                                                   
                                                         </td>  
                                                                 <td> <h2 style="color: red"> <%=rs2.getString(2)%> </h2></td>
                                                                     
                                                     </tr>
                                                                               
                                                                   <%
                                          //   response.sendRedirect("index.jsp");			
                                               
        }  
              }
        catch(Exception ex)
        {
         out.println(ex.getMessage());   
        }                   
                
        
%>                                        
                                     </table><br></br>
                                                    
                                                                   
                                                    <% 
   }  
                                              }
catch(Exception ex)
{

out.println(ex.getMessage());
}   
                                                            
%>               
                                                  </div>                    
                                                                   
  
                                                   <br></br>
                                                    
                                        </div>  
                                                     
                                        </div>
      
                
                                   
	
                                                              
								<!-- END Scroll Pane -->
								
                                          
						
							
							<div class="cl"></div>
						</div>
						<!-- END Bottom Strip -->
					</div>
                                                    <div id="footer">
		<div class="shell">
			<a class="footer-logo" href="http://css-free-templates.com/" title="Home"><img src="css/images/logo-footer.png" alt="Logo" /></a>
			<p id="bottom-nav"><a title="Home" href="#">Home</a><a title="About Us" href="#">About Us</a></p>
			<div class="cl"></div>
		</div>
	</div>
                                           
                                                      
                                            
                                     
                                       
                                        

    </body>
</html>