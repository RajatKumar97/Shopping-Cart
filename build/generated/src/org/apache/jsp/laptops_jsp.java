package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class laptops_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<link rel=\"stylesheet\" href=\"css/jquery.jscrollpane.css\" type=\"text/css\" media=\"all\" />\n");
      out.write("\t<script src=\"js/jquery-1.7.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\t<script src=\"js/DD_belatedPNG-min.js\" type=\"text/javascript\"></script>\n");
      out.write("\t<script src=\"js/jquery.jscrollpane.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\t<script src=\"js/jquery.jcarousel.js\" type=\"text/javascript\"></script>\n");
      out.write("\t<script src=\"js/functions.js\" type=\"text/javascript\"></script>\n");
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
      out.write("                                        ");
 if(session.getAttribute("email")!=null)
                                                                                       {
                                            
      out.write("\n");
      out.write("                                            <form>\t<p class=\"shopping-cart\"><a class=\"cart\" href=\"#\" title=\"Your Shopping Cart\">Your Shopping Cart</a><span>Name :");
      out.print(session.getAttribute("name"));
      out.write(" </span>&nbsp;\t\t\t\t\n");
      out.write("\t\t\t\t\t  <input type =\"submit\" name=\"logout\" value=\"Logout\"/></form>\n");
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
      out.write("                                            <p class=\"shopping-cart\"><a class=\"cart\" href=\"#\" title=\"Your Shopping Cart\">Your Shopping Cart</a><span> </span>&nbsp;\n");
      out.write("                                                ");
 }
                                        
      out.write("\n");
      out.write("                                        \n");
      out.write("                                        <span></span></p>\n");
      out.write("                                        \n");
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
      out.write("                                                  <img src=\"css/images/promo.jpg\"  alt=\"Big Sale This Week -30% OFF!\" />\n");
      out.write("\t\t\t\t\t\t</div>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div id=\"slider\">\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("                                                                   <img src=\"css/images/slide2.jpg\" alt=\"colour pencils\" title=\"\" style=\"height: 310 ; width: 800\"  />\n");
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
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"cl\"></div>\n");
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
      out.write("\t\t\t\t\t\t\t</ul>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
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
 try
                               {
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    con=DriverManager.getConnection("jdbc:odbc:project");
    stmt=con.createStatement();
   rs=stmt.executeQuery("select * from image where category='"+request.getParameter("qv")+"' ");
   
   while(rs.next())
                   {
        
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"product\">\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
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
      out.write("        \n");
      out.write("                                                           ");

                                                                           }
    
                                                                      }

                                                             catch(Exception ex)
                                                                        {
                                                                             out.println(ex.getMessage());   
                                                                                 }                   
               
        
                                                                                          
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<!-- END Scroll Pane -->\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"right-border\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"cl\"></div>\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bottom\"></div>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<!-- END Best Sellers -->\n");
      out.write("\t\t\t\t\t\t<!-- Bottom Strip -->\n");
      out.write("\t\t\t\t\t\t<div class=\"bottom-strip\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"box-holder left\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"box\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"top\"></div>\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"label\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h3>About Us</h3>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"middle\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"text-widget\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p><strong>Mauris euismod lorem </strong>at mauris gravida tincidunt. Maecenas purus arcu, luctus at suscipit tempor, pharetra et urna. Quisque molestie purus sit amet ligula varius a adipiscing ligula molestie. Morbi fermentum lobortis turpis mattis bibendum. In hac habitasse platea </p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a class=\"read-more\" title=\"Read More\" href=\"#\">Read More</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"bottom\"></div>\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"box-holder middle\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"box\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"top\"></div>\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"label\">\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h3>Newsletter</h3>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"middle\" id=\"newsletter\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"post\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p><span>Subscribe to our newsletter</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p>Praesent et ultrices turpis. Donec at est vel neque dictum aliquet.</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"cl\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<form action=\"\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"field-holder\"><input type=\"text\" class=\"field\" value=\"Your Email\" title=\"Your Email\" /></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"field-holder\"><input type=\"text\" class=\"field\" value=\"Your Name\" title=\"Your Name\" /></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"submit-button\"><input type=\"submit\" value=\"Subscribe\" /></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</form>\n");
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
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p><span>Aenean placerat</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p>Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae tellus t turpisporttitor pulvinar ...</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a class=\"comments\" href=\"#\" title=\"comments\">comments</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"date-box\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p class=\"date\">05.26</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p>2011</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
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
      out.write("\t\t</div>\n");
      out.write("\t\t<div id=\"footer-push\"></div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- END Wrapper -->\n");
      out.write("\t<!-- Footer -->\n");
      out.write("\t<div id=\"footer\">\n");
      out.write("\t\t<div class=\"shell\">\n");
      out.write("\t\t\t<a class=\"footer-logo\" href=\"http://css-free-templates.com/\" title=\"Home\"><img src=\"css/images/logo-footer.png\" alt=\"Logo\" /></a>\n");
      out.write("\t\t\t<p id=\"bottom-nav\"><a title=\"Home\" href=\"#\">Home</a><a title=\"About Us\" href=\"#\">About Us</a></p>\n");
      out.write("\t\t\t<div class=\"cl\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- END Footer -->\n");
      out.write("     \n");
      out.write("</body>\n");
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
