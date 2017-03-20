 <%@page import="com.sun.org.apache.bcel.internal.generic.Select"%>
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
    <head>
    <style>

</style>
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
                                            <form>  <p class="shopping-cart"><a class="cart" href="billcheck.jsp" title="Your Shopping Cart">Your Shopping Cart</a><span>Name : </span><%=session.getAttribute("email")%>&nbsp;
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
             %>                                 <% }
                                        %>
                                        
                                        <span></span></p>
					<div class="search-expand"></div>
					<div id="search">
						<div class="retract-button">
							<p>retract</p>
						</div>
						<form action="" method="post">
							<input type="text" class="field" value="Search" title="Search" name="search"/>
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
					    
					<!-- Content -->
                                         <div id="content" style="background:white;height:600px">    
						<!-- Featured Products -->
                                                <div style="height:500px;width:900px;background-color:whitesmoke">
                                                    <center><br></br>
                                                        <h1 style="color: black">Products in Your Cart</h1><br>
                                                                </center>
                                                     <center> <h3 style="color:  black">Your cart contains following</h3> </center><br>
                                                      <h4 style="color: black">
                                                          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   
                                                        
                                                          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                          
                                                          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                         
                                              </h4>
                                                
                                                  <div class="CSSTableGenerator" style="margin-left: 200px">
                                                      
                                                     <table border="" >
                                                             <tr>
                                                         <td>
                                                             Product
                                                                       </td>                                                                <td>
                                                         
                                                                  
                                                                  Product id </center><br>
                                                         </td>
                                                                  <td>
                                                           
                                                                  
                                                                  Price </h2> </center><br>
                                                         </td>
                                                                 
                                                                  <td>
                                                          
                                                                  
                                                                  Quantity </h2> </center><br>
                                                         </td>
                                                                       <td>
                                                          
                                                                  
                                                                  Delete </h2> </center><br>
                                                         </td>
                                                             </tr>
                                        <% 
                                         
                      int sum1 =0;
                       int sum2 =0;                                             
            Connection con;
            Statement smt;
            ResultSet rs;
            //ResultSet rs1;
             try
                                       {
              
                 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                 con=DriverManager.getConnection("jdbc:odbc:project");
                 smt=con.createStatement();
                
                 rs=smt.executeQuery("select * from cart");
             //  rs1=smt.executeQuery("Select sum(prize) from cart"); 
               
               
                               
             while(rs.next())
                               {
                 
             String pro =rs.getString(2);
                   sum1=sum1+Integer.parseInt(rs.getString(3));
                   sum2=sum2+Integer.parseInt(rs.getString(4));
                   session.setAttribute("product",pro);
                   
             
       // smt.executeUpdate("insert into login values('59','33','"+session.getAttribute("product")+"')");            
       
            %>
         
            <tr>
                <td>
                     <%=rs.getString(2)%> 
                </td>                                  
            <td> 
                                                                        <%=rs.getString(1)%>
                                                         </td>
                                                                        <td>     <center> RS. <%=rs.getString(3)%> </center> 
                                                                       
                                                                   
                                                         </td>
                                                                       <td>       <h3> <%=rs.getString(4)%>  
                                                                    
                                                                             
                                                                      
                                                                   
                                                         </td>
                                                                             <td>
                                                                                  <a title="Details" href="wasteew.jsp?q=<%=rs.getString(1)%>"> <img src="uploaded/del.jpg"/> </a>
                                                                             </td>
                                                     </tr>
                                                                            
                                                                             
                                                                             
                                                                              
                                                             
                                                                      
<% 
//sum=sum+Integer.parseInt(s);
}   
          //     out.print("TOTAL BILL ="+sum);
                               }
                               
 catch(Exception ex)
{

 out.println(ex.getMessage());
}                                                                
%>    
                                                       </table>  
                                                 </div>
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
            session.setAttribute("total",sum1);
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
        session.setAttribute("total",sum1);
         response.sendRedirect("userinfoo.jsp");
       
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
                                                   
         
       
                                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                    
                                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                     </h3><br></br>
                                                                      <h3 style="color: black">
                                                                
                                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                    
                                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                    
                                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                     
                                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                     
                                                                      Total prize of the Cart is Rs.   
                                                                      <%=sum1%>
                                                                
                                                                
                                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                    
                                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                    
                                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                     
                                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                     
                                                                      Total Quantities in the Cart is   
                                                                      <%=sum2%>
                                                                  </h3>
                                                                       
                                                                  <br></br>
                                                            
                                                                  
                                                        
                                                      
                                                         
                                                                          
                                                                           
                                                                          
                                                                           <% if(session.getAttribute("email")!=null)
                                                                                                                                                            {
                                                                          
         %>
         <form>
                                                                               &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    
                                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href="index.jsp"><input type="button" class="button green" name="but1" value="Continue Shopping"/></a>
                                                                          <form>     <a href="userinfoo.jsp"><input type="button" name ="button"class="button green" value="Buy"/></a></form>
           
         <%
        // if(request.getParameter("but1")!=null)
          //               {
            // response.sendRedirect("index.jsp");
        //}
                 
 //if(request.getParameter("button")!=null)
//{
  //  session.setAttribute("total",sum1);
 //response.sendRedirect("userinfoo.jsp");
//}                        
          
          }
         
          else
         {
             %>
             <form action="index.jsp"> 
                                                                               &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    
                                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" class="button green" name="but5" value="Continue Shopping"/>
             
                                                                  <a title="Catalog" id="modal_trigger" href="#modal" >    <input type="submit" class="button green" name="but2" value="Buy these Items"/></a></form>
                                                                           
                                                                  <% }
%>                                                                             
                                               <!-- these are imp div tag -->
                                               
                                                </div>	<br>                                       
                                                    <!--            <div id="content" style="background:white;height:400px">    
				
                                                <div style="height:140px;width:900px;background-color:whitesmoke">
                                                    <center>
                                                        <h1>Products in Your Cart</h1><br><br></br>
                                                        <form>
                                                           
                                                        <a title="Catalog" id="modal_trigger" href="#modal" >    <input type="submit" name="btn2" value="Please login before buying"/></a>
                                                        </form>
                                                    </center>
                                -->                    
                                              
                                               
                         
        
        
                                               
                                               
                                               
                                               
                                               
                                               <!-- these are imp div tag -->
                                               
                                                </div>
                                        </div>
      
<%
//if(request.getParameter("button")!=null)
//{
  //  session.setAttribute("total",sum1);
 //response.sendRedirect("userinfoo.jsp");
//}        
%>
	
                                                              
								<!-- END Scroll Pane -->
								
                                          
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
		
	</div>


 

<div id="footer">
		<div class="shell">
			<a class="footer-logo" href="http://css-free-templates.com/" title="Home"><img src="css/images/logo-footer.png" alt="Logo" /></a>
			<p id="bottom-nav"><a title="Home" href="#">Home</a><a title="About Us" href="#">About Us</a></p>
			<div class="cl"></div>
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