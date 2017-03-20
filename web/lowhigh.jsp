
<%@page import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html lang="en-US" xmlns="http://www.w3.org/1999/xhtml" dir="ltr">
<head>
	<title>Shopping Cart</title>
	<meta http-equiv="Content-type" content="text/html; charset=utf-8" />
	<link rel="shortcut icon" href="css/images/favicon.ico" />
	<link rel="stylesheet" href="css/style.css" type="text/css" media="all" />
	<!--[if IE 6]>
	<link rel="stylesheet" href="css/ie6.css" type="text/css" media="all" />	
	<![endif]-->
	<link rel="stylesheet" href="css/jquery.jscrollpane.css" type="text/css" media="all" />
	<script src="js/jquery-1.7.min.js" type="text/javascript"></script>
	<script src="js/DD_belatedPNG-min.js" type="text/javascript"></script>
	<script src="js/jquery.jscrollpane.min.js" type="text/javascript"></script>
	<script src="js/jquery.jcarousel.js" type="text/javascript"></script>
	<script src="js/functions.js" type="text/javascript"></script>
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
                                            <form>  <p class="shopping-cart"><a class="cart" href="bill.jsp" title="Your Shopping Cart">Your Shopping Cart</a><span>Name :<%=session.getAttribute("name")%> </span>&nbsp;
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
				</div>
				<!-- END Header -->
				<!-- Main -->
				<div id="main">
					<!-- Slider -->
					<div class="slider-holder">
						<div class="promo">
                                                  <img src="css/images/promo.jpg"alt="Big Sale This Week -30% OFF!" />
						</div>						
						<div id="slider">
							<ul>
								<li>
                                                                   <img src="css/images/slide2.jpg" alt="colour pencils" title="" style="height: 310 ; width: 800"/>
									<div class="caption">
										<h2></h2>
										<div class="text"><p>L</p></div>
										<div class="buy-now">
											<p></p>
											<p class="price"><span></span></p>
										</div>
										<div class="cl"></div>
										<p><strike></strike></p>
									</div>
								</li>
								<li>
                                                                    <img src="css/images/gal.jpg" alt="pencils"  title="" style="height: 310 ; width: 800"/>
									<div class="caption">
										<h2></h2>
										<div class="text">
											<p></p></div>
										<div class="buy-now">
											<p></p>
											<p class="price"><span></span></p>
										</div>
										<div class="cl"></ssdiv>
										<p><strike></strike></p>
									</div>
								</li>
								<li>
									<img src="css/images/apple2.jpg" alt="pencils" style="height: 368px"/>
									<div class="caption">
										<h2></h2>
										<div class="text">
											<p></p>
										</div>
										<div class="buy-now">
											<p></p>
											<p class="price"><span></span></p>
										</div>
										<div class="cl"></div>
										<p><strike></strike></p>
									</div>
								</li>
								<li>
									<img src="css/images/lap.jpg" alt="pencils" style="height: 368px" />
									<div class="caption">
										<h2></h2>
										<div class="text">
											<p></p>
										</div>
										<div class="buy-now">
											<p></p>
											<p class="price"><span></span></p>
										</div>
										<div class="cl"></div>
										<p><strike></strike></p>
									</div>
								</li>
								<li>
									<img src="css/images/mob.jpeg" alt="pencils" style="height:340px" />
									<div class="caption">
										<h2></h2>
										<div class="text">
											
										</div>
										<div class="buy-now">
											<p></p>
											<p class="price"><span></span></p>
										</div>
										<div class="cl"></div>
										<p><strike></strike></p>
									</div>
								</li>
							</ul>																		
						</div>						
						<div class="cl"></div>
						<div class="jcarousel-control">
							<a title="Slide 1" href="#">1</a>
							<a title="Slide 2" href="#">2</a>
							<a title="Slide 3" href="#">3</a>
							<a title="Slide 4" href="#">4</a>
							<a title="Slide 5" href="#">5</a>																													 
						</div>						
					</div>	
					<!-- END Slider -->
					<!-- Content -->
					<div id="content">
						<!-- Featured Products -->
						<div class="products-holder">
							<div class="top"></div>
							<div class="middle">													
								<div class="label">
									<h3>Feature Products</h3>									
								</div>
								<div class="cl"></div>	 <%
     
           Connection con;
        Statement stmt;
       ResultSet rs;
 try
                               {
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    con=DriverManager.getConnection("jdbc:odbc:project");
    stmt=con.createStatement();
   rs=stmt.executeQuery("select * from image ORDER BY prize");
   
   while(rs.next())
                   {
        %>
								<div class="product">																										
                                                                    <a title="Details" href="info.jsp?q=<%=rs.getString(1)%>"><img src="<%=rs.getString(3)%>" alt="paperclip"   /></a>
									<div class="desc">
										<p class="name"> <%=rs.getString(4)%></p>
										<p>Model: <span>XR-34</span></p>
										<p>Peaces in Box: <span>12</span></p>
										<p>Product code: <span>1215</span></p>
									</div>	
									<div class="price-box">
										<p><span class="price"> 01<sup>.69</sup></span></p>
										<p class="per-peace">In Stock</p>
									</div>
									<div class="cl"></div>																														
								</div>
        
                
                                                           <%
                                                                           }
    
                                                                      }

                                                             catch(Exception ex)
                                                                        {
                                                                             out.println(ex.getMessage());   
                                                                                 }                   
               
        
                                                                                          %>
								</div>
                                                              
								<!-- END Scroll Pane -->
								<div class="right-border"></div>
								<div class="cl"></div>
                                                                <a href="" >More</a>
                                            
							</div>
							<div class="bottom"></div>							
						</div>							
						<!-- END Best Sellers -->
						<!-- Bottom Strip -->
                                                <a href="" >More</a>
						<div class="bottom-strip">
							<div class="box-holder left">
								<div class="box">
									<div class="top"></div>										
									<div class="label">
										<h3>About Us</h3>																			
									</div>
									<div class="middle">
										<div class="text-widget">
											<p><strong>Mauris euismod lorem </strong>at mauris gravida tincidunt. Maecenas purus arcu, luctus at suscipit tempor, pharetra et urna. Quisque molestie purus sit amet ligula varius a adipiscing ligula molestie. Morbi fermentum lobortis turpis mattis bibendum. In hac habitasse platea </p>
										</div>	
										<a class="read-more" title="Read More" href="#">Read More</a>
									</div>	
									<div class="bottom"></div>									
								</div>
							</div>
							<div class="box-holder middle">
								<div class="box">
									<div class="top"></div>									
									<div class="label">									
										<h3>Newsletter</h3>																		
									</div>
									<div class="middle" id="newsletter">
										<div class="post">
											<p><span>Subscribe to our newsletter</span></p>
											<p>Praesent et ultrices turpis. Donec at est vel neque dictum aliquet.</p>
										</div>
										<div class="cl"></div>
										<form action="" method="post">
											<div class="field-holder"><input type="text" class="field" value="Your Email" title="Your Email" /></div>
											<div class="field-holder"><input type="text" class="field" value="Your Name" title="Your Name" /></div>
											<div class="submit-button"><input type="submit" value="Subscribe" /></div>
										</form>
										<div class="cl">&nbsp;</div>											
									</div>
									<div class="bottom"></div>
								</div>
							</div>
							<div class="box-holder right">
								<div class="box">
									<div class="top"></div>										
									<div class="label">										
										<h3>Latest Posts</h3>																				
									</div>
									<div class="middle post-short">
										<div class="post">
											<p><span>Aenean placerat</span></p>
											<p>Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae tellus t turpisporttitor pulvinar ...</p>
											<a class="comments" href="#" title="comments">comments</a>
										</div>
										<div class="date-box">
											<p class="date">05.26</p>
											<p>2011</p>
										</div>
										<div class="cl"></div>
									</div>	
									<div class="bottom"></div>									
								</div>
							</div>
							<div class="cl"></div>
						</div>
						<!-- END Bottom Strip -->
					</div>
					<!-- END Content -->
				</div>
				<!-- END Main -->
			</div>
		</div>
		<div id="footer-push"></div>
	</div>
	<!-- END Wrapper -->
	<!-- Footer -->
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