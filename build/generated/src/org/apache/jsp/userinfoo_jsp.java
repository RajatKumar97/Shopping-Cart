package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class userinfoo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html lang=\"en-US\" xmlns=\"http://www.w3.org/1999/xhtml\" dir=\"ltr\">\n");
      out.write("<head>\n");
      out.write("\t<title>Shopping Cart</title>\n");
      out.write("\t<meta http-equiv=\"Content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("\t<link rel=\"shortcut icon\" href=\"css/images/favicon.ico\" />\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/styless.css\" type=\"text/css\" media=\"all\" />\n");
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
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.leanModal.min.js\"></script>\n");
      out.write("\n");
      out.write("     \n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("    \n");
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
      out.write("                                            <form>  <p class=\"shopping-cart\"><a class=\"cart\" href=\"billcheck.jsp\" title=\"Your Shopping Cart\">Your Shopping Cart</a><span>Name : </span>");
      out.print(session.getAttribute("email"));
      out.write("&nbsp;\n");
      out.write("                                                    <input class=\"button red\" type =\"submit\" name=\"logout\" value=\"Logout\"/></form>\n");
      out.write("                                                ");
 
                                                if(request.getParameter("logout")!=null)
                                                                                                       {
                                                    session.removeAttribute("email");
                                                    response.sendRedirect("index.jsp");
                                                }
                                        }
else
{
 
      out.write("          ");
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
      out.write("\t\t\t\t\t\t\t <input type=\"text\" class=\"field\"  name=\"search\" />\n");
      out.write("                                                         <input type=\"submit\" value=\"\" class=\"submit-button\" name=\"search\"/>\n");
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
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a title=\"Laptops\" href=\"laptops.jsp\">Laptops</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a title=\"Product\" href=\"pendrives.jsp\">Pendrives</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a title=\"Product\" href=\"mobiles.jsp\">Mobiles</a></li></ul></div></li>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a title=\"Brand\" href=\"#\">Brands</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"dd\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a title=\"Product\" href=\"hp.jsp\">Hp</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a title=\"Product\" href=\"samsung.jsp\">Samsung</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a title=\"Product\" href=\"dell.jsp\">Dell</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a title=\"Product\" href=\"sony.jsp\">Sony</a></li>\t\t\t\t\t\t\t\t\t\t\t\t\n");
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
      out.write("                                    ");

       
        
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
        
      
      
      out.write("\n");
      out.write("\t\t\t\t<!-- Main -->\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t<!-- Slider -->\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<!-- Content -->\n");
      out.write("                                        <div id=\"content\" style=\"background:white;height:400px\">    \n");
      out.write("\t\t\t\t\t\t<!-- Featured Products -->\n");
      out.write("                                                <div style=\"height:360px;width:900px;background-color:whitesmoke\">\n");
      out.write("                                                    <div style=\"float: left\">\n");
      out.write("                                                        <h2>\n");
      out.write("                                                            <br></br> &nbsp;&nbsp;   Buy Items  <br></br>\n");
      out.write("                                                         </h2>\n");
      out.write("                                                        <form>\n");
      out.write("                                                            \n");
      out.write("                                                            &nbsp;&nbsp;&nbsp;&nbsp;   Name \n");
      out.write("                                                            &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                            &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                            &nbsp;&nbsp;\n");
      out.write("                                                            <input type=\"text\" name=\"q1\" value=\"");
      out.print(rs.getString(2));
      out.write("\" style=\"height: 17px\"/><br></br>\n");
      out.write("                                                            &nbsp;&nbsp;&nbsp;&nbsp; \n");
      out.write("\n");
      out.write("                                                            Mobile No.\n");
      out.write("                                                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                            <input type=\"text\" name=\"q2\" value=\"");
      out.print(rs.getString(4));
      out.write("\" style=\"height: 17px\"/><br></br>\n");
      out.write("                                                            &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                            Address  :\n");
      out.write("                                                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                            \n");
      out.write("                                                            <input type=\"text\" style=\"height: 40px;width: 200px\"name=\"q3\" value=\"");
      out.print(rs.getString(5));
      out.write("\"><br><br>\n");
      out.write("                                                           &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                            City  :\n");
      out.write("                                                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                            <input type=\"text\" name=\"q4\" value=\"");
      out.print(rs.getString(6));
      out.write("\" style=\"height: 17px\"/><br></br>\n");
      out.write("                                                            &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                            &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                            We Do Not Accept Orders Outside Ludhiana<br></br>\n");
      out.write("                                                        \n");
      out.write("\t\t\t\t\t\n");
      out.write("                                                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                            <input type=\"submit\" class=\"button green\" name=\"but1\" value=\"Add Details\"/>\n");
      out.write("                                                        </form>\n");
      out.write("                                                        \n");
      out.write("                                                        \n");
      out.write("                                                    </div>\n");
      out.write("                                                    <a style =\"text-decoration: none\"><div style=\"float: right\">\n");
      out.write("                                                    \n");
      out.write("    \n");
      out.write("\n");
      out.write("                                                        <h1>\n");
      out.write("                                                            <br></br> This is my shipping address\n");
      out.write("                                                            \n");
      out.write("                                                        </h1><br></br>\n");
      out.write("                                                        Name  :  ");
      out.print(rs.getString(2));
      out.write("  <br></br>\n");
      out.write("                                                        Mobile   : ");
      out.print(rs.getString(4));
      out.write(" <br></br>\n");
      out.write("                                                        Address   :");
      out.print( rs.getString(5));
      out.write(" <br></br>\n");
      out.write("                                                          City  :");
      out.print( rs.getString(6));
      out.write(" <br></br>\n");
      out.write("                                                     </div> </a>\n");
      out.write("                                               <!-- these are imp div tag -->\n");
      out.write("                                               \n");
      out.write("                                                \t</div>\n");
      out.write("      \n");
      out.write("                \n");
      out.write("                                                          \n");
      out.write("\t\n");
      out.write("                                                              \n");
      out.write("\t\t\t\t\t\t\t\t<!-- END Scroll Pane -->\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("                                          \n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cl\"></div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                </div>\n");
      out.write("                                                     <div id=\"footer\">\n");
      out.write("\t\t<div class=\"shell\">\n");
      out.write("\t\t\t<a class=\"footer-logo\" href=\"http://css-free-templates.com/\" title=\"Home\"><img src=\"css/images/logo-footer.png\" alt=\"Logo\" /></a>\n");
      out.write("\t\t\t<p id=\"bottom-nav\"><a title=\"Home\" href=\"#\">Home</a><a title=\"About Us\" href=\"#\">About Us</a></p>\n");
      out.write("\t\t\t<div class=\"cl\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t\t\t\t\t\t<!-- END Bottom Strip -->\n");
      out.write("\t");
				
        
      }
    
       }
 
        catch(Exception ex)
        {
         out.println(ex.getMessage());   
        }                   
                
        

      out.write('\n');

       
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
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("</html>\n");
      out.write("    ");
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
