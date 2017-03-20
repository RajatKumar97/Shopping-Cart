package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html lang=\"en-US\" xmlns=\"http://www.w3.org/1999/xhtml\" dir=\"ltr\">\n");
      out.write("<head>\n");
      out.write("\t<title>Shopping Cart</title>\n");
      out.write("\t<meta http-equiv=\"Content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("\t<link rel=\"shortcut icon\" href=\"css/images/favicon.ico\" />\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"all\" />\n");
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
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css/table.css\" />\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.leanModal.min.js\"></script>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css\" />\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.leanModal.min.js\"></script>\n");
      out.write("\n");
      out.write("     \n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("         \n");
      out.write("       ");

          Connection con11;
        Statement stmt11;
        ResultSet rs11;
        String id1="";
         int idd1;
         try
                               {
     Class.forName("com.mysql.jdbc.Driver");
     con11=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
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

      out.write("\n");
      out.write("<script>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    alert(\"password and confirm password didnt match please register again\");\n");
      out.write("</script>\n");

}                        
               }      
       
  
                                            
        
      out.write("                                                                 \n");
      out.write("        \n");
      out.write("       ");

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

      out.write("\n");
      out.write("<script>\n");
      out.write("    \n");
      out.write(" alert(\"You entered wrong email and password\");\n");
      out.write("</script>\n");

}            
    
      out.write("\n");
      out.write("    ");

}
   
               }
        
         catch(Exception ex)
        {
           String s=  ex.getMessage();
            
            
      out.write("\n");
      out.write("            <script>\n");
      out.write("                \n");
      out.write("                alert(\"email exists\");\n");
      out.write("            </script>\n");
      out.write("            ");

          
         //out.println(ex.getMessage());   
        }                               
                
           
     
       
      out.write("\n");
      out.write("      \n");
      out.write("      \n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("\t\t<div id=\"wrapper-bottom\">\n");
      out.write("\t\t\t<div class=\"shell\">\n");
      out.write("\t\t\t\t<!-- Header -->\n");
      out.write("\t\t\t\t<div id=\"header\">\n");
      out.write("\t\t\t\t\t<!-- Logo -->\n");
      out.write("\t\t\t\t\t<h1 id=\"logo\"><a title=\"Home\" href=\"#\">Electronics store</a></h1>\n");
      out.write("                                        ");
 if(session.getAttribute("email")!=null)
                                                                                       {
                                            
      out.write("\n");
      out.write("                                            <form>  <p class=\"shopping-cart\"><a class=\"cart\" href=\"billcheck.jsp\" title=\"Your Shopping Cart\">Your Shopping Cart</a> <span class=\"price\">Name :</span>");
      out.print(session.getAttribute("email"));
      out.write("&nbsp;\n");
      out.write("                                                <input class=\"button red\" type =\"submit\" name=\"logout\" value=\"Logout\"/></form>\n");
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
      out.write("                                            \n");
      out.write("                                                ");
 }
                                        
      out.write("\n");
      out.write("                                        \n");
      out.write("                                        <span></span></p>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<!-- Search -->\n");
      out.write("                                        <div class=\"search-expand\"></div>\n");
      out.write("\t\t\t\t\t<div id=\"search\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"retract-button\">\n");
      out.write("\t\t\t\t\t\t\t<p>retract</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<form method=\"post\">\n");
      out.write("                                                    <input type=\"text\" class=\"field\" value=\"Search\" name=\"search\" title=\"Search\" />\n");
      out.write("                                                    <input type=\"submit\" value=\"\" class=\"submit-button\" name=\"search\"/>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("                                                   \n");
      out.write("\t\t\t\t\t\t</form>\t\n");
      out.write("                                                ");
 
                                                if(request.getParameter("search")!=null)
                                                                                                       {
                                                    session.setAttribute("search",request.getParameter("search"));
                                                    response.sendRedirect("waste.jsp");
                                                }
                                                

      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("\t<!-- Wrapper -->\n");
      out.write("\t\n");
      out.write("\t\t\t\t\t<!-- END Search -->\n");
      out.write("\t\t\t\t\t<div class=\"cl\"></div>\n");
      out.write("\t\t\t\t\t<!-- Navigation -->\n");
      out.write("\t\t\t\t\t<div id=\"navigation\">\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("                                                    <li><a title=\"Home\" href=\"index.jsp\">Home</a></li>\n");
      out.write("                                                    ");
 if(session.getAttribute("email")!=null)
                                                                                       {
                                            
      out.write("\n");
      out.write("                                            \n");
      out.write("                                                         ");
 
                                                
                                        }
                        else
                      {
             
      out.write("\n");
      out.write("                                                        <li><a id=\"modal_trigger\" href=\"#modal\" >Login</a></li>\n");
      out.write("                                                        ");
 }
                                        
      out.write("\n");
      out.write("                                                     \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
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
      out.write("\t\t\t\t<div id=\"main\">\n");
      out.write("\t\t\t\t\t<!-- Slider -->\n");
      out.write("\t\t\t\t\t<div class=\"slider-holder\">\n");
      out.write("\t\t\t\t\t\t<div class=\"promo\">\n");
      out.write("                                                  <img src=\"css/images/promo.jpg\"alt=\"Big Sale This Week -30% OFF!\" />\n");
      out.write("\t\t\t\t\t\t</div>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div id=\"slider\">\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("                                                                   <img src=\"css/images/slide2.jpg\" alt=\"colour pencils\" title=\"\" style=\"height: 310 ; width: 800\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"caption\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h2></h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"text\"><p>L</p></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"buy-now\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p class=\"price\"><span></span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"cl\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p><strike></strike></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("                                                                    <img src=\"css/images/gal.jpg\" alt=\"pencils\"  title=\"\" style=\"height: 310 ; width: 800\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"caption\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h2></h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"text\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p></p></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"buy-now\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p class=\"price\"><span></span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"cl\"></ssdiv>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p><strike></strike></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"css/images/apple2.jpg\" alt=\"pencils\" style=\"height: 368px\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"caption\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h2></h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"text\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"buy-now\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p class=\"price\"><span></span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"cl\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p><strike></strike></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"css/images/lap.jpg\" alt=\"pencils\" style=\"height: 368px\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"caption\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h2></h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"text\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"buy-now\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p class=\"price\"><span></span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"cl\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p><strike></strike></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"css/images/mob.jpeg\" alt=\"pencils\" style=\"height:340px\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"caption\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h2></h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"text\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"buy-now\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p class=\"price\"><span></span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"cl\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p><strike></strike></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\t\n");
      out.write("                                                 \n");
      out.write("\t\t\t\t\t\t</div>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"cl\"></div>\n");
      out.write("\t\t\t\t\t\t<div class=\"jcarousel-control\">\n");
      out.write("\t\t\t\t\t\t\t<a title=\"Slide 1\" href=\"#\">1</a>\n");
      out.write("\t\t\t\t\t\t\t<a title=\"Slide 2\" href=\"#\">2</a>\n");
      out.write("\t\t\t\t\t\t\t<a title=\"Slide 3\" href=\"#\">3</a>\n");
      out.write("\t\t\t\t\t\t\t<a title=\"Slide 4\" href=\"#\">4</a>\n");
      out.write("\t\t\t\t\t\t\t<a title=\"Slide 5\" href=\"#\">5</a>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t \n");
      out.write("\t\t\t\t\t\t</div>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\t\n");
      out.write("                                             ");

       
        if (request.getParameter("subscribe")!=null)
                
                               {
            Connection conr;
        Statement stmtr;
        ResultSet rsr;
        String idr="";
        int iddr;
 try
                               {
    Class.forName("com.mysql.jdbc.Driver");
    conr=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
    stmtr=conr.createStatement();
    rsr=stmtr.executeQuery("select max(id) from contactus");
    if(rsr.next())
               {
        idr=rsr.getString(1);
    }
    iddr=Integer.parseInt(idr);
    
   stmtr.executeUpdate("insert into contactus values("+(iddr+1)+",'"+request.getParameter("r1")+"','"+request.getParameter("r2")+"')");
         
    

 
      out.write("\n");
      out.write(" <script>\n");
      out.write("     alert('we will contact you soon.\\n Thank You');\n");
      out.write("     </script>\n");
      out.write(" ");

 }
        catch(Exception ex)
        {
         out.println(ex.getMessage());   
        }                   
                               
        }         
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- END Slider -->\n");
      out.write("\t\t\t\t\t<!-- Content -->\n");
      out.write("\t\t\t\t\t<div id=\"content\">\n");
      out.write("\t\t\t\t\t\t<!-- Featured Products -->\n");
      out.write("\t\t\t\t\t\t<div class=\"products-holder\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"top\"></div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"middle\">\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"label\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h3>Feature Products</h3>\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"cl\"></div>\t ");

     
           Connection con;
        Statement stmt;
       ResultSet rs;
  try{
    Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
    stmt=con.createStatement();
   rs=stmt.executeQuery("select * from image where id<9 ");
   
   while(rs.next())
                   {
       //session.setAttribute("qr", rs.getString(1));
        
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("       \n");
      out.write("        <div class=\"product\">\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("            <a title=\"Details\" href=\"info.jsp?q=");
 out.println(rs.getString(1));
      out.write("\"><img src=\"");
      out.print(rs.getString(3));
      out.write("\" alt=\"paperclip\"   /></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"desc\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"name\"> ");
      out.print(rs.getString(4));
      out.write("</p>\n");
      out.write("                                                                                <p>Model: <span>");
      out.print(rs.getString(2));
      out.write("</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>Free Home Delivery<span></span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>COD Available<span></span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"price-box\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p><span class=\"price\"> <sup>Rs</sup>");
      out.print(rs.getString(7));
      out.write("</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"per-peace\">In Stock</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"cl\"></div>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                                \n");
      out.write("                                                                          \n");
      out.write("        \n");
      out.write("                \n");
      out.write("                                                           ");

                                                                           }
    
                                                                      }

                                                             catch(Exception ex)
                                                                        {
                                                                             out.println(ex.getMessage());   
                                                                                 }                   
               
        
                                                                                          
      out.write("\n");
      out.write("                                                                                          \n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                              \n");
      out.write("\t\t\t\t\t\t\t\t<!-- END Scroll Pane -->\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"right-border\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"cl\"></div>\n");
      out.write("                                                                \n");
      out.write("                                                                ");
 
                                                                if(request.getParameter("t1")!=null)
                                                                                                                                       {
                                                                
    Connection con1;
        Statement stmt1;
       ResultSet rs1;
  try
                               {
    Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
    stmt=con.createStatement();
   rs=stmt.executeQuery("select * from image where id between 9 and 17 ");
   
   while(rs.next())
                   { 
        
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("       \n");
      out.write("        <div class=\"product\">\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("            <a title=\"Details\" href=\"info.jsp?q=");
      out.print(rs.getString(1));
      out.write("\"><img src=\"");
      out.print(rs.getString(3));
      out.write("\" alt=\"paperclip\"   /></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"desc\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"name\"> ");
      out.print(rs.getString(4));
      out.write("</p>\n");
      out.write("                                                                                <p>Model: <span>");
      out.print(rs.getString(2));
      out.write("</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>Free Home Delivery<span></span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>COD Available<span></span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"price-box\">\n");
      out.write("                                                                            <p><span class=\"price\">");
      out.print(rs.getString(7));
      out.write(" </span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"per-peace\">In Stock</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"cl\"></div>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                                \n");
      out.write("                                       \n");

                                                                           }
   
      out.write("\n");
      out.write("    \n");
      out.write("   ");

    
                                                                      }

                                                             catch(Exception ex)
                                                                        {
                                                                             out.println(ex.getMessage());   
                                                                                 }    

      out.write("\n");
      out.write("<div class=\"right-border\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"cl\"></div>\n");
      out.write(" <form>\n");
      out.write("                                                                    <input style=\"float: right\"type=\"submit\" name=\"t2\" value=\"More\"/>\n");
      out.write("                                                                </form>     \n");
      out.write("        \n");
      out.write("   ");

                  }
      
                                                                                          
      out.write("\n");
      out.write("                             \n");
      out.write("                                                                                          \n");
      out.write("           ");
 
                                                                if(request.getParameter("t2")!=null)
                                                                                                                                       {
                                                                
    Connection con111;
        Statement stmt111;
       ResultSet rs111;
  try
                               {
    Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
    stmt=con.createStatement();
   rs=stmt.executeQuery("select * from image where id between 17 and 24 ");
   
   while(rs.next())
                   {
        
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("       \n");
      out.write("        <div class=\"product\">\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("            <a title=\"Details\" href=\"info.jsp?q=");
      out.print(rs.getString(1));
      out.write("\"><img src=\"");
      out.print(rs.getString(3));
      out.write("\" alt=\"paperclip\"   /></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"desc\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"name\"> ");
      out.print(rs.getString(4));
      out.write("</p>\n");
      out.write("                                                                                <p>Model: <span>");
      out.print(rs.getString(2));
      out.write("</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>Free Home Delivery<span></span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>COD Available<span></span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"price-box\">\n");
      out.write("                                                                            <p><span class=\"price\">");
      out.print(rs.getString(7));
      out.write(" </span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"per-peace\">In Stock</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"cl\"></div>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                \n");
      out.write("                                                                                \n");
      out.write("                                       \n");

                                                                           }
   
      out.write("\n");
      out.write("  \n");
      out.write(" <form>\n");
      out.write("                                                                    <input style=\"float: right\"type=\"submit\" name=\"t2\" value=\"More\"/>\n");
      out.write("                                                                </form>   \n");
      out.write("   ");

    
                                                                      }

                                                             catch(Exception ex)
                                                                        {
                                                                             out.println(ex.getMessage());   
                                                                                 }                   
                     }
              
                                                                                          
      out.write("\n");
      out.write("                                                                                     \n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"cl\"></div>\n");
      out.write(" <form>\n");
      out.write("                                                                    <input style=\"float: right\"type=\"submit\" name=\"t2\" value=\"More\"/>\n");
      out.write("                                                                </form>   \n");
      out.write("                                                                                           ");
 
                                                                if(request.getParameter("t2")!=null)
                                                                                                                                       {
                                                                
    Connection con111;
        Statement stmt111;
       ResultSet rs111;
  try
                               {
    Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
    stmt=con.createStatement();
   rs=stmt.executeQuery("select * from image where id between 25 and 33 ");
   
   while(rs.next())
                   {
        
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("       \n");
      out.write("        <div class=\"product\">\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("            <a title=\"Details\" href=\"info.jsp?q=");
      out.print(rs.getString(1));
      out.write("\"><img src=\"");
      out.print(rs.getString(3));
      out.write("\" alt=\"paperclip\"   /></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"desc\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"name\"> ");
      out.print(rs.getString(4));
      out.write("</p>\n");
      out.write("                                                                                <p>Model: <span>");
      out.print(rs.getString(2));
      out.write("</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>Free Home Delivery<span></span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>COD Available<span></span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"price-box\">\n");
      out.write("                                                                            <p><span class=\"price\">");
      out.print(rs.getString(7));
      out.write(" </span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"per-peace\">In Stock</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"cl\"></div>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                \n");
      out.write("                                                                                \n");
      out.write("                                       \n");

                                                                           }
   
      out.write("\n");
      out.write("    <form>\n");
      out.write("                                                                    <input type=\"submit\" name=\"t3\" value=\"More\"/>\n");
      out.write("                                                                </form>\n");
      out.write("   ");

    
                                                                      }

                                                             catch(Exception ex)
                                                                        {
                                                                             out.println(ex.getMessage());   
                                                                                 }                   
                     }
        
                                                                                          
      out.write("\n");
      out.write("                                                                                             \n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("                                                                                          \n");
      out.write("            \n");
      out.write("        \n");
      out.write("      \n");
      out.write("\t\t\t\t\n");
      out.write("                                            ");

        if(request.getParameter("but7")!=null)
                       {
               response.sendRedirect("bill.jsp");
                }
        

      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("         \n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("         \n");
      out.write("\t\t\t\t\t\t\t<div class=\"bottom\"></div>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<!-- END Best Sellers -->\n");
      out.write("\t\t\t\t\t\t<!-- Bottom Strip -->\n");
      out.write("                                                <a href=\"\" >More</a>\n");
      out.write("\t\t\t\t\t\t<div class=\"bottom-strip\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"box-holder left\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"box\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"top\"></div>\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"label\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h3>About Us</h3>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"middle\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"text-widget\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p><strong>The online Megastore</strong> It.s nice of you that you take the time to know us better. here are some things about us that you might to know.\n");
      out.write("                                                                                            Services like cash on delivery 30 day replacement policy and ofcourse the great prizes that we offer and our partners that work to deliver you the product within time. So its no surprise that we are a favourite onlie shopping store.</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"bottom\"></div>\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"box-holder middle\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"box\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"top\"></div>\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"label\">\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h3>Contact us</h3>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"middle\" id=\"newsletter\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"post\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p><span>Subscribe to our newsletter</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p>Customer Care . Need assistance regarding existing orders,or any other assisstance</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"cl\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<form action=\"\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"field-holder\"><input type=\"email\" class=\"field\" name=\"r1\" value=\"Your Email\" title=\"Your Email\" /></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"field-holder\"><input type=\"text\" class=\"field\" name=\"r2\"value=\"Your Name\" title=\"Your Name\" /></div>\n");
      out.write("                                                                                        <div class=\"submit-button\"><input type=\"submit\" value=\"Subscribe\" name=\"subscribe\" /></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</form>\n");
      out.write("                                                                                \n");
      out.write("                                                                                 \n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"cl\">&nbsp;</div>\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"bottom\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"box-holder right\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"box\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"top\"></div>\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"label\">\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h3>Latest Posts</h3>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"middle post-short\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"post\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p><span>New Arrivals and Offers</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p>New Hp envy J110tx has arrived with excitind specification and at a amazing prize explore it now....</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a class=\"comments\" href=\"#\" title=\"comments\">comments</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"date-box\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p class=\"date\">05.07</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p>2014</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("         \n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"cl\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"bottom\"></div>\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cl\"></div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<!-- END Bottom Strip -->\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- END Content -->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- END Main -->\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\n");
      out.write("\t\t\n");
      out.write("                \n");
      out.write("\t<!-- END Wrapper -->\n");
      out.write("\t<!-- Footer -->\n");
      out.write("\t \n");
      out.write("\t<!-- END Footer -->\n");
      out.write("    \n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("<div id=\"footer\">\n");
      out.write("\t\t<div class=\"shell\">\n");
      out.write("\t\t\t<a class=\"footer-logo\" href=\"http://css-free-templates.com/\" title=\"Home\"><img src=\"css/images/logo-footer.png\" alt=\"Logo\" /></a>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"cl\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("       \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  <div id=\"modal\" class=\"popupContainer\" style=\"display:none;\">\n");
      out.write("\t\t<header class=\"popupHeader\">\n");
      out.write("\t\t\t<span class=\"header_title\">Login/Sign up</span>\n");
      out.write("\t\t\t<span class=\"modal_close\"><i class=\"fa fa-times\"></i></span>\n");
      out.write("\t\t</header>\n");
      out.write("\t\t\n");
      out.write("\t\t<section class=\"popupBody\">\n");
      out.write("\t\t\t<!-- Social Login -->\n");
      out.write("\t\t\t<div class=\"social_login\">\n");
      out.write("\t\t\t\t<div class=\"action_btns\">\n");
      out.write("\t\t\t\t\t<div class=\"one_half\" ><a href=\"#\" id=\"login_form\" class=\"btn\">Login</a></div>\n");
      out.write("\t\t\t\t\t<div class=\"one_half last\"><a href=\"#\" id=\"register_form\" class=\"btn\">Sign up</a></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<!-- Username & Password Login form -->\n");
      out.write("\t\t\t<div class=\"user_login\">\n");
      out.write("\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t<label>Email / Username</label>\n");
      out.write("                                        <input type=\"text\" name=\"c1\" value=\"\"  />\n");
      out.write("\t\t\t\t\t<br />\n");
      out.write("\n");
      out.write("\t\t\t\t\t<label>Password</label>\n");
      out.write("                                        <input type=\"password\" name=\"c2\" value=\"\" />\n");
      out.write("\t\t\t\t\t<br />\n");
      out.write("\n");
      out.write("\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"action_btns\">\n");
      out.write("\t\t\t\t\t\t<div class=\"one_half\"><a href=\"#\" class=\"btn back_btn\"><i class=\"fa fa-angle-double-left\"></i> Back</a></div>\n");
      out.write("                                              <!--  <form><div class=\"one_half last\"><a href=\"#\" class=\"btn btn_red\" name=\"\"><input type=\"submit\" name=\"t3\" class=\"btn btn_red\"Login</a></div><form>-->\n");
      out.write("                                              <div> <form>\t<input style=\"width: 150px; height: 35px\"type=\"submit\" class=\"button red\" name=\"t3\" value=\"Login\"/> </form>   </div> \n");
      out.write("                                        </div>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\n");
      out.write("                            <a href=\"forget.jsp\" class=\"forgot_password\">Forgot password?</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<!-- Register Form -->\n");
      out.write("\t\t\t<div class=\"user_register\">\n");
      out.write("\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t<label>Email Address</label>\n");
      out.write("\t\t\t\t\t<input type=\"email\" name=\"c3\" value=\"\" />\n");
      out.write("\t\t\t\t\t<br />\n");
      out.write("\n");
      out.write("\t\t\t\t\t<label>Password</label>\n");
      out.write("\t\t\t\t\t<input type=\"password\" name=\"c4\" value=\"\" />\n");
      out.write("\t\t\t\t\t<br />\n");
      out.write("\n");
      out.write("\t\t\t\t\t<label>Confirm Password</label>\n");
      out.write("\t\t\t\t\t<input type=\"password\" name=\"c5\" value=\"\" />\n");
      out.write("\t\t\t\t\t<br />\n");
      out.write("                            \n");
      out.write("                                        <div>\n");
      out.write("                                        \n");
      out.write("                     Security Question<br>\n");
      out.write("                                  <select  style=\"height: 30px; width: 320px\" name=\"Security Question\">\n");
      out.write("            <option value=\"What is your nick name?\">What is your nick name?</option>\n");
      out.write("\n");
      out.write("            <option value=\"What is your favorite food?\">What is your favorite food?</option>\n");
      out.write("            <option   value=\"Who is your favorite singer?\">Who is your favorite singer?</option>\n");
      out.write("            <option  value=\"Who is your best friend?\">Who is your best friend?</option>\n");
      out.write("            \n");
      out.write("             \n");
      out.write("        </select>\n");
      out.write("                         \n");
      out.write("                                        \n");
      out.write("                                        </div>            \n");
      out.write("                                        <label>Your answer</label><br>\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"c7\" value=\"\" />\n");
      out.write("\t\t\t\t\t<br>\n");
      out.write("                                            \n");
      out.write("                                            <div class=\"action_btns\">\n");
      out.write("\t\t\t\t\t<div class=\"one_half\"><a href=\"#\" class=\"btn back_btn\"><i class=\"fa fa-angle-double-left\"></i> Back</a></div>\n");
      out.write("\t\t\t\t\t<div> <form>\t<input style=\"width: 150px; height: 35px\" type=\"submit\" class=\"button red\" name=\"t4\" value=\"Register\"/> </form>   </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                                            </form>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                        \n");
      out.write("                                        \n");
      out.write("\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$(\"#modal_trigger\").leanModal({top : 200, overlay : 0.6, closeButton: \".modal_close\" });\n");
      out.write("\n");
      out.write("\t$(function(){\n");
      out.write("\t\t// Calling Login Form\n");
      out.write("\t\t$(\"#login_form\").click(function(){\n");
      out.write("\t\t\t$(\".social_login\").hide();\n");
      out.write("\t\t\t$(\".user_login\").show();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\t// Calling Register Form\n");
      out.write("\t\t$(\"#register_form\").click(function(){\n");
      out.write("\t\t\t$(\".social_login\").hide();\n");
      out.write("\t\t\t$(\".user_register\").show();\n");
      out.write("\t\t\t$(\".header_title\").text('Register');\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\t// Going back to Social Forms\n");
      out.write("\t\t$(\".back_btn\").click(function(){\n");
      out.write("\t\t\t$(\".user_login\").hide();\n");
      out.write("\t\t\t$(\".user_register\").hide();\n");
      out.write("\t\t\t$(\".social_login\").show();\n");
      out.write("\t\t\t$(\".header_title\").text('Login');\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t})\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("                                                                               \n");
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
