package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;

public final class aprint_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("       \n");
      out.write("        <title>Shopping Cart</title>\n");
      out.write("\t<meta http-equiv=\"Content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("\t<link rel=\"shortcut icon\" href=\"css/images/favicon.ico\" />\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/styless.css\" type=\"text/css\" media=\"all\" />\n");
      out.write("         <link rel=\"stylesheet\" href=\"css/tables.css\" type=\"text/css\" media=\"all\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--[if IE 6]>\n");
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <div id=\"wrapper\">\n");
      out.write("\t\t<div id=\"wrapper-bottom\">\n");
      out.write("                    <div class=\"shell\" style=\"height: 1050px\">\n");
      out.write("\t\t\t\t<!-- Header -->\n");
      out.write("\t\t\t\t<div id=\"header\">\n");
      out.write("\t\t\t\t\t<!-- Logo -->\n");
      out.write("\t\t\t\t\t<h1 id=\"logo\"><a title=\"Home\" href=\"#\">Electronics store</a></h1>\n");
      out.write("                                        ");
 if(session.getAttribute("emaill")!=null)
                                                                                       {
                                            
      out.write("\n");
      out.write("                                            <form>  <p class=\"shopping-cart\"><a class=\"cart\" href=\"bill.jsp\" title=\"Your Shopping Cart\">Your Shopping Cart</a> <span class=\"price\">Welcome :</span>ADMINISTRATOR&nbsp;\n");
      out.write("                                                <input class=\"button red\" type =\"submit\" name=\"logout\" value=\"Logout\"/></form>\n");
      out.write("                                                ");
 
                                                if(request.getParameter("logout")!=null)
                                                                                                       {
                                                    session.removeAttribute("emaill");
                                                    response.sendRedirect("index.jsp");
                                                }
                                        }
                        else
                      {
             
      out.write("\n");
      out.write("                                            <p class=\"shopping-cart\"><a class=\"cart\" href=\"#\" title=\"Your Shopping Cart\">Your Shopping Cart</a><span></span>&nbsp;\n");
      out.write("                                                ");
 }
                                        
      out.write("\n");
      out.write("                                        \n");
      out.write("                                        <span></span></p>\n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                        <!-- Search -->\n");
      out.write("\t\t\t\t\t<div class=\"search-expand\"></div>\n");
      out.write("\t\t\t\t\t<div id=\"search\">\n");
      out.write("\t\t\t\t\t\t<div class=\"retract-button\">\n");
      out.write("\t\t\t\t\t\t\t<p>retract</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<form action=\"\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t\t <input type=\"text\" class=\"field\" value=\"Search\" name=\"search\" />\n");
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
      out.write("                                        <div id=\"content\" style=\"background:whitesmoke;height:300px\">\n");
      out.write("                                            <h1 style=\"margin-left: 360px;margin-top: 10px\"> Pending Orders </h1>\n");
      out.write("                                            <br>\n");
      out.write("                                            <hr>\n");
      out.write("                                            \n");
      out.write("                                            <div class=\"CSSTableGenerator\" style=\"margin-top: 35px\">\n");
      out.write("                                            <table  style=\"\">\n");
      out.write("            <tr>\n");
      out.write("                <td>Order No.</td>\n");
      out.write("                <td>Customer ID </td>\n");
      out.write("                <td> Product Name </td>\n");
      out.write("                <td> Price  </td>\n");
      out.write("                <td>Order Date </td>\n");
      out.write("                <td>Customer address </td>\n");
      out.write("                <td>What to do</td>\n");
      out.write("                <td>Delete Order</td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("        ");
 
Connection con;
Statement smt;
ResultSet rs;
try
{
     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    con=DriverManager.getConnection("jdbc:odbc:project");
    smt=con.createStatement();
   rs=smt.executeQuery("select * from ordr");
   while(rs.next())
             {
       
      out.write("\n");
      out.write("       \n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(rs.getString(1));
      out.write(" </td>\n");
      out.write("                <td> ");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString(8));
      out.write("</td>\n");
      out.write("                \n");
      out.write("                <td>");
      out.print(rs.getString(9));
      out.write("</td>\n");
      out.write("                \n");
      out.write("                <td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString(6));
      out.write("</td>\n");
      out.write("                \n");
      out.write("                 \n");
      out.write("                \n");
      out.write("           \n");
      out.write("                <td>\n");
      out.write("        <form>\n");
      out.write("            <input type=\"hidden\" value=\"");
      out.print(rs.getString(1));
      out.write("\" name=\"hi\"/>\n");
      out.write("            <input type=\"hidden\" value=\"");
      out.print(rs.getString(2));
      out.write("\" name=\"hii\"/>\n");
      out.write("            <input type=\"hidden\" value=\"");
      out.print(rs.getString(5));
      out.write("\" name=\"h\"/>\n");
      out.write("            <input type=\"hidden\" value=\"");
      out.print(rs.getString(6));
      out.write("\" name=\"i\"/>\n");
      out.write("            <input type=\"hidden\" value=\"");
      out.print(rs.getString(7));
      out.write("\" name=\"j\"/>\n");
      out.write("            <input type=\"hidden\" value=\"");
      out.print(rs.getString(8));
      out.write("\" name=\"k\"/>\n");
      out.write("             <input type=\"hidden\" value=\"");
      out.print(rs.getString(9));
      out.write("\" name=\"l\"/>\n");
      out.write("              <input type=\"hidden\" value=\"");
      out.print(rs.getString(10));
      out.write("\" name=\"m\"/>\n");
      out.write("            \n");
      out.write("        \n");
      out.write("              \n");
      out.write("             <input type=\"submit\" class=\"button green\"name=\"ap\" value=\"Approve\"/>           <input type=\"submit\" class=\"button red\"name=\"ca\" value=\"Cancel the request\"/> </form></td>\n");
      out.write("       \n");
      out.write("       <td>\n");
      out.write("           <a title=\"Details\" href=\"wasteeww.jsp?q=");
      out.print(rs.getString(1));
      out.write("\"> <img src=\"uploaded/del.png\"/> </a>\n");
      out.write("                                                                             </td>\n");
      out.write("                     </tr>\n");
      out.write("                     \n");
      out.write("        \n");
      out.write("            \n");
      out.write("        ");

               
String sta="";   
//String date= rs.getString(4);    
        if(request.getParameter("ap")!=null)
                       {
            
           sta="approved";
           
           smt.executeUpdate("insert into sta values("+request.getParameter("hi") +",'"+sta+"','"+request.getParameter("hii") +"','"+rs.getString(3) +"','"+rs.getString(4) +"','"+request.getParameter("h")+"','"+request.getParameter("i")+"','"+request.getParameter("j")+"','"+request.getParameter("k")+"','"+request.getParameter("l")+"','"+request.getParameter("m")+"')");
           response.sendRedirect("admin.jsp");
       }
if(request.getParameter("ca")!=null)
                       {
           sta="rejected";
           smt.executeUpdate("insert into sta values("+request.getParameter("hi") +",'"+sta+"','"+request.getParameter("hii") +"','"+rs.getString(3) +"','"+rs.getString(4) +"','"+request.getParameter("h")+"','"+request.getParameter("i")+"','"+request.getParameter("j")+"','"+request.getParameter("k")+"','"+request.getParameter("l")+"','"+request.getParameter("m")+"')");
 //response.sendRedirect("admin.jsp");      
           }

}
    }
           
catch(Exception ex)
               {
//out.println(ex.getMessage());
}


      out.write("\n");
      out.write("                                            \n");
      out.write("        \t                     \n");
      out.write("                                      \n");
      out.write("    \n");
      out.write("        \n");
      out.write("    </table>\n");
      out.write("                                            </div>\n");
      out.write("                                            \n");
      out.write("\t\t                     \n");
      out.write("                       \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
