
<%@page import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html lang="en-US" xmlns="http://www.w3.org/1999/xhtml" dir="ltr">
<head>
    
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<meta name="language" content="english"> 
<meta http-equiv="Content-Style-Type" content="text/css">
<meta http-equiv="Content-Script-Type" content="text/javascript">
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

<script type="text/javascript" src="js/jquery.leanModal.min.js"></script>
<script type="text/javascript" src="js/magnifier.js"></script>



     
</head>
    <body>
       
    
	<!-- Wrapper -->
	<div id="wrapper">
            <% 
            
            if(request.getParameter("q")!=null)
                               {
                session.setAttribute("qr", request.getParameter("q"));
            }
              Connection con;
        Statement stmt;
      
 try
                               {
   Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
     stmt=con.createStatement();%>
		 <div id="wrapper-bottom">
			<div class="shell">
				<!-- Header -->
				<div id="header">
					<!-- Logo -->
					<h1 id="logo"><a title="Home" href="#">Electronics store</a></h1>
					<% if(session.getAttribute("email")!=null)
                                                                                       {
                                            %>
                                            <form>  <p class="shopping-cart"><a class="cart" href="billcheck.jsp" title="Your Shopping Cart">Your Shopping Cart</a><span>Name : </span><%=session.getAttribute("email")%>&nbsp;
                                                    <input type ="submit" class="button red" name="logout" value="Logout"/></form>
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
					<div class="search-expand"></div>
					<div id="search">
						<div class="retract-button">
							<p>retract</p>
						</div>
						<form action="" method="post">
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
					<
					<!-- Content -->
                                        <div id="content" style="background:white">    
						<!-- Featured Products -->
                                                <div style="height:400px;width:900px;background-color:greenyellow">
                                                <div style="height:400px;width: 430px;background-color:slateblue;float:left">
                                               
                                                                                  <%
                                                                                   String id="",name1="",prize="";   
                                                                                   ResultSet rs=null;
                                                                                  String qry="";
                                                                                 
                                                                    
                                                                //     out.println("klklkl"+session.getAttribute("qr"));
                                                                                                                                                                                
                                                                                     
   rs=stmt.executeQuery("select * from image where id="+session.getAttribute("qr")+"");
   //out.print("ksjdksjd"+session.getAttribute("qr"));
   if(rs.next())
                   {
       name1= rs.getString(2);
       prize=rs.getString(7);
        %>
        
        <div style="float: left;height:400px; width:430px;background-color:white"> <img name="p1" src="<%=rs.getString(3)%>"/><br></br><br></br>
                    <div style="height:100px;width: 430px;float:left;background-color: white">
                        <a onmouseover='stu("<%=rs.getString(17)%>")'> <div style="height:80px;width:100px;background-color:white;float: left;border-color:grey;border-style: solid;border-width: 1px"><img src="<%=rs.getString(8)%>"/></div></a>
                             <a onmouseover='stu("<%=rs.getString(18)%>")'>    <div style="height:80px;width:122px;background-color:white;float:right;border-color:grey;border-style: solid;border-width: 1px"><img src="<%=rs.getString(9)%>"/></div></a>
                        <a onmouseover='stu("<%=rs.getString(19)%>")'> <div style="height:80px;width:100px;background-color:white;float:right;border-color:grey;border-style: solid;border-width: 1px"><img src="<%=rs.getString(10)%>"/></div></a>
                       <a onmouseover='stu("<%=rs.getString(20)%>")'> <div style="height:80px;width:100px;background-color:white;float: right;border-color:grey;border-style: solid;border-width: 1px"><img src="<%=rs.getString(11)%>"/></div></a>
          
                    </div>                                    
                     </div></div>
                    
                        <div style="height:500px;width:470px;float:right;background-color:whitesmoke">
                                
                            
                            <div style="color:black; height: 40px"> <font style="font-size:20px"><%=rs.getString(12)%></font></div>
                            <div style="height:50px"> <%=rs.getString(21)%></div>
                            <div style="height:50px"> <h1 style="color: black"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Specification</h1></div>
                            <div style="height:130px"><ul>
                                    <li>
                                        &nbsp;&nbsp;&nbsp;&nbsp;  <%=rs.getString(13)%>
                                    </li>
                                    <li>
                                        &nbsp;&nbsp;&nbsp;&nbsp; <%=rs.getString(14)%>
                                    </li>
                                    
                                    
                                    <li>
                                        &nbsp;&nbsp;&nbsp;&nbsp; <%=rs.getString(15)%>
                                    </li>
                                    <li>
                                        &nbsp;&nbsp;&nbsp;&nbsp; <%=rs.getString(16)%>
                                    </li>
                                    
                                </ul>
                                    <div style="height: 150px;">    <ul style="float:right">
                                        <li>
                                            <%=rs.getString(22)%>
                                        </li>
                                        
                                        <li>
                                         <%=rs.getString(23)%>
                                        </li>
                                    </ul>
                                        </div>
                                    
                 
                </div>		
                                        
                                    
                                                   <div style="height:80px">
                                        <h1 style="color: black"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Rs. <%=rs.getString(7)%></h1><br>
         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;                   (Inclusive of all taxes)<br>
                                            
                                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp; (Free home delivery)
                                    </div>
                                               &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                               <div style="float: left">       
                                             <div class="content">      
                                                 <div>       <form>   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    <input type="submit" class="button green"  name="but1" value="BUY NOW"/> </form>   </div>  
                                              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<div style="float: right"> 2-3 days standard delivery <br<br></br>                                                   
                                         Check Your delivery option <br></br>
                                                                                                      
                                                   </div>
                                               </div>
                                
                                               
                                                   
                                               </br>
                                               <br></br>
                                               <div style="float: left">
                                                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;     Inside the box --    <%=rs.getString(24)%>
                                               </div>
                                               
                                               
                                               
                                               <!-- these are imp div tag -->
                                               
                                                </div>		</div>
      
                
                                                       
								 <script>
    function stu(t)
    {
      // alert('yess');
  p1.src=t;
    
    }
</script> 
                                                 
                                                             <% 
   
                        int id5=1;
       
       
   
                                                          
                           }
    
                                                                                     
                if (request.getParameter("but1")!=null)
                
                               
                                  {
        
                    stmt.execute("insert into cart values("+session.getAttribute("qr") +",'"+name1+"','"+prize+"',1)");
                   // stmt.execute("insert into order values("+session.getAttribute("qr") +",'"+name1+"','"+prize+"',1)");
       response.sendRedirect("addtocart.jsp");
                          }
        
                        }

                                                             catch(Exception ex)
                                                                        {
                                                                             out.println("errrrrrot"+ex.getMessage());   
                                                                                 }                                                                      %>
								<!-- END Scroll Pane -->
								
                                          
							</div>
							
							<div class="cl"></div>
						</div>
						<!-- END Bottom Strip -->
					</div>
					<!-- END Content -->
		
				<!-- END Main -->
			
	
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
      <div id="modal" class="popupContainer" style="display:none;">
		<header class="popupHeader">
			<span class="header_title">Login</span>
			<span class="modal_close"><i class="fa fa-times"></i></span>
		</header>
		
		<section class="popupBody">
			<!-- Social Login -->
			<div class="social_login">
				<div class="">
					<a href="#" class="social_box fb">
						<span class="icon"><i class="fa fa-facebook"></i> </span>
						<span class="icon_title">Connect with Facebook</span>
						
					</a>

					<a href="#" class="social_box google">
						<span class="icon"><i class="fa fa-google-plus"></i></span>
						<span class="icon_title">Connect with Google</span>
					</a>
				</div>

				<div class="centeredText">
					<span>Or use your Email address</span>
				</div>

				<div class="action_btns">
					<div class="one_half"><a href="#" id="login_form" class="btn">Login</a></div>
					<div class="one_half last"><a href="#" id="register_form" class="btn">Sign up</a></div>
				</div>
			</div>

			<!-- Username & Password Login form -->
			<div class="user_login">
				<form>
					<label>Email / Username</label>
					<input type="text" />
					<br />

					<label>Password</label>
					<input type="password" />
					<br />

					<div class="checkbox">
						<input id="remember" type="checkbox" />
						<label for="remember">Remember me on this computer</label>
					</div>

					<div class="action_btns">
						<div class="one_half"><a href="#" class="btn back_btn"><i class="fa fa-angle-double-left"></i> Back</a></div>
						<div class="one_half last"><a href="#" class="btn btn_red">Login</a></div>
					</div>
				</form>

				<a href="#" class="forgot_password">Forgot password?</a>
			</div>

			<!-- Register Form -->
			<div class="user_register">
				<form>
					<label>Full Name</label>
					<input type="text" />
					<br />

					<label>Email Address</label>
					<input type="email" />
					<br />

					<label>Password</label>
					<input type="password" />
					<br />

					<div class="checkbox">
						<input id="send_updates" type="checkbox" />
						<label for="send_updates">Send me occasional email updates</label>
					</div>

					<div class="action_btns">
						<div class="one_half"><a href="#" class="btn back_btn"><i class="fa fa-angle-double-left"></i> Back</a></div>
						<div class="one_half last"><a href="#" class="btn btn_red">Register</a></div>
					</div>
				</form>
			</div>
		</section>
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


</html>
</body>
</html>