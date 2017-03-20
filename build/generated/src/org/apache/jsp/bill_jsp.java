package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class bill_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html lang=\"en-US\" xmlns=\"http://www.w3.org/1999/xhtml\" dir=\"ltr\">\n");
      out.write("<head>\n");
      out.write("\t<title>Shopping Cart</title>\n");
      out.write("\t<meta http-equiv=\"Content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("\t<link rel=\"shortcut icon\" href=\"css/images/favicon.ico\" />\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/table.css\" type=\"text/css\" media=\"all\" />\n");
      out.write("\t<!--[if IE 6]>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/ie6.css\" type=\"text/css\" media=\"all\" />\t\n");
      out.write("\t<![endif]-->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-1.11.0.min.js\"></script>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/jquery.jscrollpane.css\" type=\"text/css\" media=\"all\" />\n");
      out.write("\t<script src=\"js/jquery-1.7.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\t<script src=\"js/DD_belatedPNG-min.js\" type=\"text/javascript\"></script>\n");
      out.write("\t<script src=\"js/jquery.jscrollpane.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\t<script src=\"js/jquery.jcarousel.js\" type=\"text/javascript\"></script>\n");
      out.write("\t<script src=\"js/functions.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css\" />\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css/styles.css\" />\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.leanModal.min.js\"></script>\n");
      out.write("\n");
      out.write("     \n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("    ");
 
            Connection con2;
            Statement smt;
            ResultSet rs2;
            try
                                       {
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                con2=DriverManager.getConnection("jdbc:odbc:project");
                smt=con2.createStatement();
                
      out.write("\n");
      out.write("      \n");
      out.write("\t<!-- Wrapper -->\n");
      out.write("\t<div id=\"wrapper\">\n");
      out.write("\t\t<div id=\"wrapper-bottom\">\n");
      out.write("\t\t\t<div class=\"shell\">\n");
      out.write("\t\t\t\t<!-- Header -->\n");
      out.write("\t\t\t\t<div id=\"header\">\n");
      out.write("\t\t\t\t\t<!-- Logo -->\n");
      out.write("\t\t\t\t\t<h1 id=\"logo\"><a title=\"Home\" href=\"#\">Electronics store</a></h1>\n");
      out.write("\t\t\t\t\t");
 if(session.getAttribute("email")!=null)
                                                                                       {
                                            
      out.write("\n");
      out.write("                                             <form>    <p class=\"shopping-cart\"><a class=\"cart\" href=\"#\" title=\"Your Shopping Cart\">Your Shopping Cart</a><span>Name :");
      out.print(session.getAttribute("email"));
      out.write(" </span>&nbsp;\n");
      out.write("                                              <input class=\"button red\" type =\"submit\" name=\"logout\" value=\"Logout\"/></form>\n");
      out.write("                                                ");
 
                                                if(request.getParameter("logout")!=null)
                                                                                                       {
                                                    session.removeAttribute("email");
                                                    response.sendRedirect("index.jsp");
                                                }
                                        }
else
{
 
      out.write("\n");
      out.write("                                            <p class=\"shopping-cart\"><a class=\"cart\" href=\"#\" title=\"Your Shopping Cart\">Your Shopping Cart</a><span>Name : </span>&nbsp;\n");
      out.write("                                                ");
 }
                                        
      out.write("\n");
      out.write("                                        \n");
      out.write("                                        <span></span></p>\n");
      out.write("\t\t\t\t\t<div class=\"search-expand\"></div>\n");
      out.write("\t\t\t\t\t<div id=\"search\">\n");
      out.write("\t\t\t\t\t\t<div class=\"retract-button\">\n");
      out.write("\t\t\t\t\t\t\t<p>retract</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<form action=\"\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t\t <input type=\"text\" class=\"field\" value=\"Search\" name=\"search\" />\n");
      out.write("\t\t\t\t\t\t</form>\t\n");
      out.write("                                            ");
 
                                                if(request.getParameter("search")!=null)
                                                                                                       {
                                                    session.setAttribute("search",request.getParameter("search"));
                                                    response.sendRedirect("waste.jsp");
                                                }
                                                

      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- END Search -->\n");
      out.write("\t\t\t\t\t<div class=\"cl\"></div>\n");
      out.write("\t\t\t\t\t<!-- Navigation -->\n");
      out.write("\t\t\t\t\t<div id=\"navigation\">\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a title=\"Home\" href=\"index.jsp\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a title=\"About Us\" href=\"#\">About Us</a></li>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</ul>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t\t<div class=\"cl\"></div>\t\t\t\t\n");
      out.write("\t\t\t\t\t<!-- END Navigation -->\n");
      out.write("\t\t\t\t\t<!-- Dropdown Navigation -->\n");
      out.write("\t\t\t\t\t<div id=\"sort-nav\">\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<span class=\"label-left\"></span>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"label-bg\">\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a title=\"Collections\" href=\"#\">Collections</a>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"dd\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a title=\"Laptops\" href=\"laptops.jsp?qv=laptop\">Laptops</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a title=\"Product\" href=\"laptops.jsp?qv=pendrive\">Pendrives</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a title=\"Product\" href=\"laptops.jsp?qv=mobile\">Mobiles</a></li></ul></div></li>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a title=\"Brand\" href=\"#\">Brands</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"dd\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a title=\"Product\" href=\"hp.jsp?qc=hp\">Hp</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a title=\"Product\" href=\"hp.jsp?qc=samsung\">Samsung</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a title=\"Product\" href=\"hp.jsp?qc=dell\">Dell</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a title=\"Product\" href=\"hp.jsp?qc=sony\">Sony</a></li>\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"last\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a title=\"By Price\" class=\"By Price\" href=\"#\">By Price</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"dd\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a title=\"Product\" href=\"lowhigh.jsp\">Low to high</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a title=\"Product\" href=\"highlow.jsp\">High to Low</a></li>\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<span class=\"label-right\"></span>\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<!-- END Dropdown Navigation -->\n");
      out.write("\t\t\t\t\t<div class=\"cl\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- END Header -->\n");
      out.write("\t\t\t\t<!-- Main -->\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t<!-- Slider -->\n");
      out.write("\t\t\t\t\t");

       
        
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
                   
      out.write("\n");
      out.write("\t\t\t\t\t<!-- Content -->\n");
      out.write("                                        <div id=\"content\" style=\"background:white;height:600px\">    \n");
      out.write("\t\t\t\t\t\t<!-- Featured Products -->\n");
      out.write("                                                <div style=\"height:250px;width:900px;background-color:whitesmoke;\">\n");
      out.write("                                                    <br></br>   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  Name   :");
      out.print(rs.getString(2));
      out.write("<br></br>\n");
      out.write("                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   Email  :");
      out.print(session.getAttribute("email"));
      out.write("  <br></br>\n");
      out.write("                                                   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   Address : ");
      out.print(rs.getString(4));
      out.write("<br></br>\n");
      out.write("                                                \n");
      out.write("                                                   \n");
      out.write("                                                     \n");
      out.write("                                                   \n");
      out.write("                                                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    Mobile  : &nbsp;&nbsp; ");
      out.print(rs.getString(3));
      out.write(" <br></br>\n");
      out.write("                                                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    Ordered On :");
      out.print(new java.util.Date());
      out.write("<br></br>\n");
      out.write("                                               \n");
      out.write("                                               \n");
      out.write("                                             \n");
      out.write("                                                      \n");
      out.write("                                                 \n");
      out.write("                                                  </div> <br>\n");
      out.write("                                                 \n");
      out.write("                                                  <div style=\"height: 250px; width: 900px; background-color: whitesmoke\">\n");
      out.write("                                                    \n");
      out.write("                                                    <br></br> <h2>\n");
      out.write("                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                        Order Summary\n");
      out.write("                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                    \n");
      out.write("                                                    \n");
      out.write("                                                      \n");
      out.write("                                                    </h2>\n");
      out.write("                                                    <br>\n");
      out.write("                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                    Item \n");
      out.write("                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                     Price(Rs.)\n");
      out.write("                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                    Quantity\n");
      out.write("                                                         <br></br>\n");
      out.write("                                                         <table style=\"margin-left: 240px\">\n");
      out.write("                                                   ");

                rs2=smt.executeQuery("select * from cart");
            while(rs2.next())
                               {
            
            
      out.write("\n");
      out.write("                                                  ");
 
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


      out.write("\n");
      out.write("                                                \n");
      out.write("                                     \n");
      out.write("                                              \n");
      out.write("            <tr>\n");
      out.write("                                                  \n");
      out.write("            <td> \n");
      out.write("                                                                       ");
      out.print(rs2.getString(2));
      out.write("\n");
      out.write("                                                                       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                                       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                                       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                                       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                                       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                         </td>\n");
      out.write("                                                                       <td>       <h3> ");
      out.print(rs2.getString(3));
      out.write(" &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                                               &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                                               &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                                               &nbsp;&nbsp;&nbsp;&nbsp\n");
      out.write("                                                                    \n");
      out.write("                                                         </td>\n");
      out.write("                                                                      <td>       <h3> ");
      out.print(rs2.getString(4));
      out.write("  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                                   \n");
      out.write("                                                                   \n");
      out.write("                                                         </td>\n");
      out.write("                                                                     \n");
      out.write("                                                     </tr>\n");
      out.write("                                                                      \n");
      out.write("                                                                          \n");
      out.write("                                                                            \n");
      out.write("                                                                      \n");
 
   }  }
                                              }
catch(Exception ex)
{

out.println(ex.getMessage());
}   
                                                            

      out.write("    \n");
      out.write(" </table>            \n");
      out.write("                                                                 \n");
      out.write("                                                          \n");
      out.write("                                                   <br></br>\n");
      out.write("                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <hr style=\"height: 2px; width: 900px\">\n");
      out.write("                                                        <h3 style=\"margin-left: 300px\"> Total Value -  Rs. ");
      out.print(session.getAttribute("total"));
      out.write("</h3>\n");
      out.write("                                               <!-- these are imp div tag -->\n");
      out.write("                                               <form><input style=\"float: right\"type=\"submit\" class=\"button red\" name=\"but2\" value=\"DONE\"/> </form>\n");
      out.write("                                        </div>  \n");
      out.write("                                        </div>          \n");
      out.write("                                        </div>\n");
      out.write("      \n");
      out.write("                \n");
      out.write("                                                          \n");
      out.write("\t\n");
      out.write("                                                              \n");
      out.write("\t\t\t\t\t\t\t\t<!-- END Scroll Pane -->\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("                                          \n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cl\"></div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<!-- END Bottom Strip -->\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                                    <div id=\"footer\">\n");
      out.write("\t\t<div class=\"shell\">\n");
      out.write("\t\t\t<a class=\"footer-logo\" href=\"http://css-free-templates.com/\" title=\"Home\"><img src=\"css/images/logo-footer.png\" alt=\"Logo\" /></a>\n");
      out.write("\t\t\t<p id=\"bottom-nav\"><a title=\"Home\" href=\"#\">Home</a><a title=\"About Us\" href=\"#\">About Us</a></p>\n");
      out.write("\t\t\t<div class=\"cl\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("                                                  <table>\n");
      out.write("                                                       ");

                                                             if(request.getParameter("but2")!=null)
                                                                                                                       {
                                                             String s="100000";
                                                            
                                                //      smt.executeUpdate("insert into order values(1,'"+session.getAttribute("email")+"','"+s+"','"+new java.util.Date()+"' ");
                                                           smt.executeUpdate(" delete from cart");
                                      
                                        
      out.write("\n");
      out.write("                                             <script>\n");
      out.write("                                              alert('your request to buy the Product is successfully Submitted and your order is Under process');\n");
      out.write("                                          </script>         \n");
      out.write("                                        ");

                                            response.sendRedirect("index.jsp");			
        
        }  
              }
        catch(Exception ex)
        {
         out.println(ex.getMessage());   
        }                   
                
        

      out.write("      \n");
      out.write("\n");
      out.write("                                           \n");
      out.write("                                       \n");
      out.write("                                        \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
