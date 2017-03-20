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
<link type="text/css" rel="stylesheet" href="css/styles.css" />
<script type="text/javascript" src="js/jquery.leanModal.min.js"></script>

     
</head>
    <body>
       
    
      
	<!-- Wrapper -->
	<div id="wrapper">
		<div id="wrapper-bottom">
                    <div class="shell" style="height: 800px">
				<!-- Header -->
				<div id="header">
					<!-- Logo -->
					<h1 id="logo"><a title="Home" href="#">Electronics store</a></h1>
					<p class="shopping-cart"></p>					
					<!-- Search -->
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
				
					<!-- Slider -->
					<
					<!-- Content -->
                                        <div id="content" style="background:whitesmoke;height:400px">    
						<!-- Featured Products -->
                                                <div style="height:250px;width:900px;background-color:white">
                                                    <br></br><h1>
                                                        <center>Administrator Login</center>
                                                    </h1>
                                                    <br>
                                                    <hr><br><br>
                                                                <form>
                                                         &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;
                                                         &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;
                            &nbsp;&nbsp;&nbsp;&nbsp &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;                         
                                                 &nbsp;&nbsp;&nbsp;&nbsp;   Email
                                                           
                                                            &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp
                                                            
                                                            &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;
                                                            <input type="text" name="q1" value="" style="height: 14px; width: 250px"/><br></br>
                                                            &nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;
                                                             &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;
                                                             &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;
                                                              &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;
                                                            

                                                            Password
                                                            &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                            <input type="password" name="q2" value="" style="height: 14px;width: 250px"/><br></br>
                                                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                            <input type="submit" class="button red" name="but1" value="Login" style="width: 130px"/>   
                                                                </form>             
                                                </div>
                                               
                         
        
        
                                                
                                                

                                               
                                               
                                               
                                               <!-- these are imp div tag -->
                                               
                                              		</div>
      
                
                                                          
	
                                                              
								<!-- END Scroll Pane -->
								
                                          
							</div>
                    <%
       
        if (request.getParameter("but1")!=null)
                
                               {
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
    rs=stmt.executeQuery("select * from admin where email = '"+request.getParameter("q1")+"' and password='"+request.getParameter("q2")+"' ");
      if(rs.next())
                   {
       out.print("login successsfull");
      response.sendRedirect("aprint.jsp");
      session.setAttribute("emaill", request.getParameter("q1"));
      
      }
   
}
        catch(Exception ex)
        {
         out.println(ex.getMessage());   
        }                   
                }
        
%>
							
							<div class="cl"></div>
						</div>
						<!-- END Bottom Strip -->
					</div>