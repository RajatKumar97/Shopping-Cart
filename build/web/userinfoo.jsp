

<%@page import="java.sql.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html lang="en-US" xmlns="http://www.w3.org/1999/xhtml" dir="ltr">
<head>
	<title>Shopping Cart</title>
	<meta http-equiv="Content-type" content="text/html; charset=utf-8" />
	<link rel="shortcut icon" href="css/images/favicon.ico" />
	<link rel="stylesheet" href="css/style.css" type="text/css" media="all" />
        <link rel="stylesheet" href="css/styless.css" type="text/css" media="all" />
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
 %>          <% }
                                        %>
                                        
                                        <span></span></p>
					<div class="search-expand"></div>
					<div id="search">
						<div class="retract-button">
							<p>retract</p>
						</div>
						<form action="" method="post">
							 <input type="text" class="field"  name="search" />
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
				</div>
				<!-- END Header -->
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
    
  
    rs=stmt.executeQuery("select * from userinfo where email='"+session.getAttribute("email") +"'");
      while(rs.next())
                   {
        
      
      %>
				<!-- Main -->
				
					<!-- Slider -->
					
					<!-- Content -->
                                        <div id="content" style="background:white;height:400px">    
						<!-- Featured Products -->
                                                <div style="height:360px;width:900px;background-color:whitesmoke">
                                                    <div style="float: left">
                                                        <h2>
                                                            <br></br> &nbsp;&nbsp;   Buy Items  <br></br>
                                                         </h2>
                                                        <form>
                                                            
                                                            &nbsp;&nbsp;&nbsp;&nbsp;   Name 
                                                            &nbsp;&nbsp;&nbsp;&nbsp;
                                                            &nbsp;&nbsp;&nbsp;&nbsp;
                                                            &nbsp;&nbsp;
                                                            <input type="text" name="q1" value="<%=rs.getString(2)%>" style="height: 17px"/><br></br>
                                                            &nbsp;&nbsp;&nbsp;&nbsp; 

                                                            Mobile No.
                                                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                            <input type="text" name="q2" value="<%=rs.getString(4)%>" style="height: 17px"/><br></br>
                                                            &nbsp;&nbsp;&nbsp;&nbsp;
                                                            Address  :
                                                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                            
                                                            <input type="text" style="height: 40px;width: 200px"name="q3" value="<%=rs.getString(5)%>"><br><br>
                                                           &nbsp;&nbsp;&nbsp;&nbsp;
                                                            City  :
                                                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                            <input type="text" name="q4" value="<%=rs.getString(6)%>" style="height: 17px"/><br></br>
                                                            &nbsp;&nbsp;&nbsp;&nbsp;
                                                            &nbsp;&nbsp;&nbsp;&nbsp;
                                                            We Do Not Accept Orders Outside Ludhiana<br></br>
                                                        
					
                                                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                            <input type="submit" class="button green" name="but1" value="Add Details"/>
                                                        </form>
                                                        
                                                        
                                                    </div>
                                                    <a style ="text-decoration: none"><div style="float: right">
                                                    
    

                                                        <h1>
                                                            <br></br> This is my shipping address
                                                            
                                                        </h1><br></br>
                                                        Name  :  <%=rs.getString(2)%>  <br></br>
                                                        Mobile   : <%=rs.getString(4)%> <br></br>
                                                        Address   :<%= rs.getString(5)%> <br></br>
                                                          City  :<%= rs.getString(6)%> <br></br>
                                                     </div> </a>
                                               <!-- these are imp div tag -->
                                               
                                                	</div>
      
                
                                                          
	
                                                              
								<!-- END Scroll Pane -->
								
                                          
							</div>
							
							<div class="cl"></div>
						</div>
                </div>
                                                     <div id="footer">
		<div class="shell">
			<a class="footer-logo" href="http://css-free-templates.com/" title="Home"><img src="css/images/logo-footer.png" alt="Logo" /></a>
			<p id="bottom-nav"><a title="Home" href="#">Home</a><a title="About Us" href="#">About Us</a></p>
			<div class="cl"></div>
		</div>
	</div>
						<!-- END Bottom Strip -->
	<%				
        
      }
    
       }
 
        catch(Exception ex)
        {
         out.println(ex.getMessage());   
        }                   
                
        
%>
<%
       
        if (request.getParameter("but1")!=null)
                
                               {
            Connection con1;
        Statement stmt1;
        ResultSet rs1;
        String id1="";
        int idd1;
 try
                               {
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    con1=DriverManager.getConnection("jdbc:odbc:project");
    stmt1=con1.createStatement();
    rs1=stmt1.executeQuery("select max(id) from newdetail");
    if(rs1.next())
        
               {
        id1=rs1.getString(1);
    }
    idd1=Integer.parseInt(id1);
    
   stmt1.executeUpdate("insert into newdetail values("+(idd1+1)+",'"+request.getParameter("q1")+"','"+request.getParameter("q2")+"','"+request.getParameter("q3")+"','"+request.getParameter("q4")+"')");
//stmt1.executeUpdate("insert into order values("+(idd1+1)+",'"+session.getAttribute("email")+"','"+session.getAttribute("total")+"','Dec')");          
   out.print("insertion done");
            session.setAttribute("name", request.getParameter("q1"));
   response.sendRedirect("bill.jsp");
    
}
        catch(Exception ex)
        {
         out.println(ex.getMessage());   
        }                   
                               
        }         
        %>
    </body>
    
</html>
    