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
    
  
    rs=stmt.executeQuery("select * from newdetail where name='"+session.getAttribute("name") +"'");
      if(rs.next())
                   {
                   %>
					<!-- Content -->
                                        <div id="content" style="background:white;height:600px">    
						<!-- Featured Products -->
                                                <div style="height:250px;width:900px;background-color:whitesmoke;">
                                                    <br></br>   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  Name   :<%=rs.getString(2)%><br></br>
                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   Email  :<%=session.getAttribute("email")%>  <br></br>
                                                   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   Address : <%=rs.getString(4)%><br></br>
                                                
                                                   
                                                     
                                                   
                                                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    Mobile  : &nbsp;&nbsp; <%=rs.getString(3)%> <br></br>
                                                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    Ordered On :<%=new java.util.Date()%><br></br>
                                               
                                               
                                             
                                                      
                                                 
                                                  </div> <br>
                                                 
                                                  <div style="height: 250px; width: 900px; background-color: whitesmoke">
                                                    
                                                    <br></br> <h2>
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
                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                    Item 
                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                     Price(Rs.)
                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                    Quantity
                                                         <br></br>
                                                         <table style="margin-left: 240px">
                                                   <%
                rs2=smt.executeQuery("select * from cart");
            while(rs2.next())
                               {
            
            %>
                                                  <% 
Connection con1;
Statement smt1;
ResultSet rs1;
String id1="";
int idd2;
try
{
     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    con1=DriverManager.getConnection("jdbc:odbc:project");
    smt1=con1.createStatement();
      rs1=smt1.executeQuery("select max(OrderNO) from ordr");
       while(request.getParameter("but2")!=null)
                    {
    if(rs1.next())
        
               {
        id1=rs1.getString(1);
    }
      String d=String.valueOf(new java.util.Date());
    idd2=Integer.parseInt(id1);
   
    smt1.executeUpdate("insert into ordr values("+(idd2+1)+",'"+session.getAttribute("email")+"','"+session.getAttribute("total")+"','"+d+"','"+rs.getString(2) +"','"+rs.getString(4) +"','"+rs.getString(3) +"','"+rs2.getString(2) +"','"+rs2.getString(3) +"','"+rs2.getString(4) +"')");   
 //smt1.executeUpdate("insert into ordr values("+(idd2+1)+",'"+session.getAttribute("email")+"','"+session.getAttribute("total")+"','"+d+"','"+rs.getString(2) +"','"+rs.getString(4) +"','"+rs.getString(3) +"','"+rs2.getString(2) +"')");           
    // rs=stmt.executeQuery("insert into ordr (name) select name from cart");
   // out.println("insertion done");
       }   
 }                                                                       
catch(Exception ex)
               {
    out.println(ex.getMessage());
}

%>
                                                
                                     
                                              
            <tr>
                                                  
            <td> 
                                                                       <%=rs2.getString(2)%>
                                                                       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                         </td>
                                                                       <td>       <h3> <%=rs2.getString(3)%> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                               &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                               &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                               &nbsp;&nbsp;&nbsp;&nbsp
                                                                    
                                                         </td>
                                                                      <td>       <h3> <%=rs2.getString(4)%>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                   
                                                                   
                                                         </td>
                                                                     
                                                     </tr>
                                                                      
                                                                          
                                                                            
                                                                      
<% 
   }  }
                                              }
catch(Exception ex)
{

out.println(ex.getMessage());
}   
                                                            
%>    
 </table>            
                                                                 
                                                          
                                                   <br></br>
                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <hr style="height: 2px; width: 900px">
                                                        <h3 style="margin-left: 300px"> Total Value -  Rs. <%=session.getAttribute("total")%></h3>
                                               <!-- these are imp div tag -->
                                               <form><input style="float: right"type="submit" class="button red" name="but2" value="DONE"/> </form>
                                        </div>  
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
                                                  <table>
                                                       <%
                                                             if(request.getParameter("but2")!=null)
                                                                                                                       {
                                                             String s="100000";
                                                            
                                                //      smt.executeUpdate("insert into order values(1,'"+session.getAttribute("email")+"','"+s+"','"+new java.util.Date()+"' ");
                                                           smt.executeUpdate(" delete from cart");
                                      
                                        %>
                                             <script>
                                              alert('your request to buy the Product is successfully Submitted and your order is Under process');
                                          </script>         
                                        <%
                                            response.sendRedirect("index.jsp");			
        
        }  
              }
        catch(Exception ex)
        {
         out.println(ex.getMessage());   
        }                   
                
        
%>      

                                           
                                       
                                        

    </body>
</html>