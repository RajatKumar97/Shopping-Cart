
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
        <script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
	<link rel="stylesheet" href="css/jquery.jscrollpane.css" type="text/css" media="all" />
	<script src="js/jquery-1.7.min.js" type="text/javascript"></script>
	<script src="js/DD_belatedPNG-min.js" type="text/javascript"></script>
	<script src="js/jquery.jscrollpane.min.js" type="text/javascript"></script>
	<script src="js/jquery.jcarousel.js" type="text/javascript"></script>
	<script src="js/functions.js" type="text/javascript"></script>
        <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css" />
<link type="text/css" rel="stylesheet" href="css/styles.css" />
<link type="text/css" rel="stylesheet" href="css/table.css" />
<script type="text/javascript" src="js/jquery.leanModal.min.js"></script>

        <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css" />

<script type="text/javascript" src="js/jquery.leanModal.min.js"></script>

     
</head>
    <body>
         
       <%
          Connection con11;
        Statement stmt11;
        ResultSet rs11;
        String id1="";
         int idd1;
         try
                               {
     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
     con11=DriverManager.getConnection("jdbc:odbc:project");
     stmt11=con11.createStatement();
         if (request.getParameter("t4")!=null)
                
                               {
             if(request.getParameter("c4").equals(request.getParameter("c5")))
                               {
           rs11=stmt11.executeQuery("select max(id) from register");
           if(rs11.next())
               {
         id1=rs11.getString(1);
    }
    idd1=Integer.parseInt(id1);
    
    stmt11.executeUpdate("insert into register values("+(idd1+1)+",'"+request.getParameter("c3")+"','"+request.getParameter("c4")+"','"+request.getParameter("c5")+"','"+request.getParameter("Security Question")+"','"+request.getParameter("c7")+"')");                                                      
            out.print("insertion done");
            session.setAttribute("email", request.getParameter("c3"));
    response.sendRedirect("userinfo.jsp");
    
}
                       
       
                        
        else
{
%>
<script>
    
    
    alert("password and confirm password didnt match please register again");
</script>
<%
}                        
               }      
       
  
                                            
        %>                                                                 
        
       <%
         if(request.getParameter("t3")!=null)
                       {
           
       rs11=stmt11.executeQuery("select * from register where emaill ='"+request.getParameter("c1")+"' and passwordd='"+request.getParameter("c2")+"' ");
       if(rs11.next())
                    {
           out.print("selection done");
           session.setAttribute("email",request.getParameter("c1"));
           session.setAttribute("id7", request.getParameter("c1"));
       session.setAttribute("item",session.getAttribute("item"));
       // session.setAttribute("total",sum1);
         response.sendRedirect("index.jsp");
       
      }
     
                   
          
      
  else
{
%>
<script>
    
 alert("You entered wrong email and password");
</script>
<%
}            
    %>
    <%
}
   
               }
        
         catch(Exception ex)
        {
           String s=  ex.getMessage();
            
            %>
            <script>
                
                alert("email exists");
            </script>
            <%
          
         //out.println(ex.getMessage());   
        }                               
                
           
     
       %>
      
      
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
                                            <form>  <p class="shopping-cart"><a class="cart" href="billcheck.jsp" title="Your Shopping Cart">Your Shopping Cart</a> <span class="price">Name :</span><%=session.getAttribute("email")%>&nbsp;
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
                                            
                                                <% }
                                        %>
                                        
                                        <span></span></p>					
					<!-- Search -->
                                        <div class="search-expand"></div>
					<div id="search">
					
						<div class="retract-button">
							<p>retract</p>
						</div>
						<form method="post">
                                                    <input type="text" class="field" value="Search" name="search" title="Search" />
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
      
      
	<!-- Wrapper -->
	
					<!-- END Search -->
					<div class="cl"></div>
					<!-- Navigation -->
					<div id="navigation">
						<ul>
                                                    <li><a title="Home" href="index.jsp">Home</a></li>
                                                    <% if(session.getAttribute("email")!=null)
                                                                                       {
                                            %>
                                            
                                                         <% 
                                                
                                        }
                        else
                      {
             %>
                                                        <li><a id="modal_trigger" href="#modal" >Login</a></li>
                                                        <% }
                                        %>
                                                     
												
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
                                             <%
       
        if (request.getParameter("subscribe")!=null)
                
                               {
            Connection conr;
        Statement stmtr;
        ResultSet rsr;
        String idr="";
        int iddr;
 try
                               {
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    conr=DriverManager.getConnection("jdbc:odbc:project");
    stmtr=conr.createStatement();
    rsr=stmtr.executeQuery("select max(id) from contactus");
    if(rsr.next())
               {
        idr=rsr.getString(1);
    }
    iddr=Integer.parseInt(idr);
    
   stmtr.executeUpdate("insert into contactus values("+(iddr+1)+",'"+request.getParameter("r1")+"','"+request.getParameter("r2")+"')");
         
    

 %>
 <script>
     alert('we will contact you soon.\n Thank You');
     </script>
 <%
 }
        catch(Exception ex)
        {
         out.println(ex.getMessage());   
        }                   
                               
        }         
        %>


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
   rs=stmt.executeQuery("select * from image where id<9 ");
   
   while(rs.next())
                   {
       //session.setAttribute("qr", rs.getString(1));
        %>
								
       
        <div class="product">																										
            <a title="Details" href="info.jsp?q=<% out.println(rs.getString(1));%>"><img src="<%=rs.getString(3)%>" alt="paperclip"   /></a>
									<div class="desc">
										<p class="name"> <%=rs.getString(4)%></p>
                                                                                <p>Model: <span><%=rs.getString(2)%></span></p>
										<p>Free Home Delivery<span></span></p>
										<p>COD Available<span></span></p>
									</div>	
									<div class="price-box">
										<p><span class="price"> <sup>Rs</sup><%=rs.getString(7)%></span></p>
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
                                                                
                                                                <% 
                                                                if(request.getParameter("t1")!=null)
                                                                                                                                       {
                                                                
    Connection con1;
        Statement stmt1;
       ResultSet rs1;
  try
                               {
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    con=DriverManager.getConnection("jdbc:odbc:project");
    stmt=con.createStatement();
   rs=stmt.executeQuery("select * from image where id between 9 and 17 ");
   
   while(rs.next())
                   { 
        %>
								
       
        <div class="product">																										
            <a title="Details" href="info.jsp?q=<%=rs.getString(1)%>"><img src="<%=rs.getString(3)%>" alt="paperclip"   /></a>
									<div class="desc">
										<p class="name"> <%=rs.getString(4)%></p>
                                                                                <p>Model: <span><%=rs.getString(2)%></span></p>
										<p>Free Home Delivery<span></span></p>
										<p>COD Available<span></span></p>
									</div>	
									<div class="price-box">
                                                                            <p><span class="price"><%=rs.getString(7)%> </span></p>
										<p class="per-peace">In Stock</p>
									</div>
									<div class="cl"></div>																														
								</div>
                                                                                
                                       
<%
                                                                           }
   %>
    
   <%
    
                                                                      }

                                                             catch(Exception ex)
                                                                        {
                                                                             out.println(ex.getMessage());   
                                                                                 }    
%>
<div class="right-border"></div>
								<div class="cl"></div>
 <form>
                                                                    <input style="float: right"type="submit" name="t2" value="More"/>
                                                                </form>     
        
   <%
                  }
      
                                                                                          %>
                             
                                                                                          
           <% 
                                                                if(request.getParameter("t2")!=null)
                                                                                                                                       {
                                                                
    Connection con111;
        Statement stmt111;
       ResultSet rs111;
  try
                               {
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    con=DriverManager.getConnection("jdbc:odbc:project");
    stmt=con.createStatement();
   rs=stmt.executeQuery("select * from image where id between 17 and 24 ");
   
   while(rs.next())
                   {
        %>
								
       
        <div class="product">																										
            <a title="Details" href="info.jsp?q=<%=rs.getString(1)%>"><img src="<%=rs.getString(3)%>" alt="paperclip"   /></a>
									<div class="desc">
										<p class="name"> <%=rs.getString(4)%></p>
                                                                                <p>Model: <span><%=rs.getString(2)%></span></p>
										<p>Free Home Delivery<span></span></p>
										<p>COD Available<span></span></p>
									</div>	
									<div class="price-box">
                                                                            <p><span class="price"><%=rs.getString(7)%> </span></p>
										<p class="per-peace">In Stock</p>
									</div>
									<div class="cl"></div>																														
								</div>
                                                
                                                                                
                                       
<%
                                                                           }
   %>
  
 <form>
                                                                    <input style="float: right"type="submit" name="t2" value="More"/>
                                                                </form>   
   <%
    
                                                                      }

                                                             catch(Exception ex)
                                                                        {
                                                                             out.println(ex.getMessage());   
                                                                                 }                   
                     }
              
                                                                                          %>
                                                                                     
								<div class="cl"></div>
 <form>
                                                                    <input style="float: right"type="submit" name="t2" value="More"/>
                                                                </form>   
                                                                                           <% 
                                                                if(request.getParameter("t2")!=null)
                                                                                                                                       {
                                                                
    Connection con111;
        Statement stmt111;
       ResultSet rs111;
  try
                               {
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    con=DriverManager.getConnection("jdbc:odbc:project");
    stmt=con.createStatement();
   rs=stmt.executeQuery("select * from image where id between 25 and 33 ");
   
   while(rs.next())
                   {
        %>
								
       
        <div class="product">																										
            <a title="Details" href="info.jsp?q=<%=rs.getString(1)%>"><img src="<%=rs.getString(3)%>" alt="paperclip"   /></a>
									<div class="desc">
										<p class="name"> <%=rs.getString(4)%></p>
                                                                                <p>Model: <span><%=rs.getString(2)%></span></p>
										<p>Free Home Delivery<span></span></p>
										<p>COD Available<span></span></p>
									</div>	
									<div class="price-box">
                                                                            <p><span class="price"><%=rs.getString(7)%> </span></p>
										<p class="per-peace">In Stock</p>
									</div>
									<div class="cl"></div>																														
								</div>
                                                
                                                                                
                                       
<%
                                                                           }
   %>
    <form>
                                                                    <input type="submit" name="t3" value="More"/>
                                                                </form>
   <%
    
                                                                      }

                                                             catch(Exception ex)
                                                                        {
                                                                             out.println(ex.getMessage());   
                                                                                 }                   
                     }
        
                                                                                          %>
                                                                                             
		
		

				
                                                                                          
            
        
      
				
                                            <%
        if(request.getParameter("but7")!=null)
                       {
               response.sendRedirect("bill.jsp");
                }
        
%>
			</div>
         
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
											<p><strong>The online Megastore</strong> It.s nice of you that you take the time to know us better. here are some things about us that you might to know.
                                                                                            Services like cash on delivery 30 day replacement policy and ofcourse the great prizes that we offer and our partners that work to deliver you the product within time. So its no surprise that we are a favourite onlie shopping store.</p>
										</div>	
										
									</div>	
									<div class="bottom"></div>									
								</div>
							</div>
							<div class="box-holder middle">
								<div class="box">
									<div class="top"></div>									
									<div class="label">									
										<h3>Contact us</h3>																		
									</div>
									<div class="middle" id="newsletter">
										<div class="post">
											<p><span>Subscribe to our newsletter</span></p>
											<p>Customer Care . Need assistance regarding existing orders,or any other assisstance</p>
										</div>
										<div class="cl"></div>
										<form action="" method="post">
											<div class="field-holder"><input type="email" class="field" name="r1" value="Your Email" title="Your Email" /></div>
											<div class="field-holder"><input type="text" class="field" name="r2"value="Your Name" title="Your Name" /></div>
                                                                                        <div class="submit-button"><input type="submit" value="Subscribe" name="subscribe" /></div>
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
											<p><span>New Arrivals and Offers</span></p>
											<p>New Hp envy J110tx has arrived with excitind specification and at a amazing prize explore it now....</p>
											<a class="comments" href="#" title="comments">comments</a>
										</div>
										<div class="date-box">
											<p class="date">05.07</p>
											<p>2014</p>
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
	
		
                
	<!-- END Wrapper -->
	<!-- Footer -->
	 
	<!-- END Footer -->
    
		

<div id="footer">
		<div class="shell">
			<a class="footer-logo" href="http://css-free-templates.com/" title="Home"><img src="css/images/logo-footer.png" alt="Logo" /></a>
			
			<div class="cl"></div>
		</div>
	</div>

 


  
       



  <div id="modal" class="popupContainer" style="display:none;">
		<header class="popupHeader">
			<span class="header_title">Login/Sign up</span>
			<span class="modal_close"><i class="fa fa-times"></i></span>
		</header>
		
		<section class="popupBody">
			<!-- Social Login -->
			<div class="social_login">
				<div class="action_btns">
					<div class="one_half" ><a href="#" id="login_form" class="btn">Login</a></div>
					<div class="one_half last"><a href="#" id="register_form" class="btn">Sign up</a></div>
				</div>
			</div>

			<!-- Username & Password Login form -->
			<div class="user_login">
				<form>
					<label>Email / Username</label>
                                        <input type="text" name="c1" value=""  />
					<br />

					<label>Password</label>
                                        <input type="password" name="c2" value="" />
					<br />

					

					<div class="action_btns">
						<div class="one_half"><a href="#" class="btn back_btn"><i class="fa fa-angle-double-left"></i> Back</a></div>
                                              <!--  <form><div class="one_half last"><a href="#" class="btn btn_red" name=""><input type="submit" name="t3" class="btn btn_red"Login</a></div><form>-->
                                              <div> <form>	<input style="width: 150px; height: 35px"type="submit" class="button red" name="t3" value="Login"/> </form>   </div> 
                                        </div>
				</form>

                            <a href="forget.jsp" class="forgot_password">Forgot password?</a>
			</div>

			<!-- Register Form -->
			<div class="user_register">
				<form>
					<label>Email Address</label>
					<input type="email" name="c3" value="" />
					<br />

					<label>Password</label>
					<input type="password" name="c4" value="" />
					<br />

					<label>Confirm Password</label>
					<input type="password" name="c5" value="" />
					<br />
                            
                                        <div>
                                        
                     Security Question<br>
                                  <select  style="height: 30px; width: 320px" name="Security Question">
            <option value="What is your nick name?">What is your nick name?</option>

            <option value="What is your favorite food?">What is your favorite food?</option>
            <option   value="Who is your favorite singer?">Who is your favorite singer?</option>
            <option  value="Who is your best friend?">Who is your best friend?</option>
            
             
        </select>
                         
                                        
                                        </div>            
                                        <label>Your answer</label><br>
					<input type="text" name="c7" value="" />
					<br>
                                            
                                            <div class="action_btns">
					<div class="one_half"><a href="#" class="btn back_btn"><i class="fa fa-angle-double-left"></i> Back</a></div>
					<div> <form>	<input style="width: 150px; height: 35px" type="submit" class="button red" name="t4" value="Register"/> </form>   </div>
				</div>
                                            </form>
                                        </div>

                        
                                        

					
				
			</div>

 



<script type="text/javascript">
	$("#modal_trigger").leanModal({top : 200, overlay : 0.6, closeButton: ".modal_close" });

	$(function(){
		// Calling Login Form
		$("#login_form").click(function(){
			$(".social_login").hide();
			$(".user_login").show();
			return false;
		});

		// Calling Register Form
		$("#register_form").click(function(){
			$(".social_login").hide();
			$(".user_register").show();
			$(".header_title").text('Register');
			return false;
		});

		// Going back to Social Forms
		$(".back_btn").click(function(){
			$(".user_login").hide();
			$(".user_register").hide();
			$(".social_login").show();
			$(".header_title").text('Login');
			return false;
		});

	})
</script>


				
    </body>

                                                                               
</html>