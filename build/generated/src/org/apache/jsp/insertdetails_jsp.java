package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class insertdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write("      \n");
      out.write("\t<!-- Wrapper -->\n");
      out.write("\t<div id=\"wrapper\">\n");
      out.write("\t\t<div id=\"wrapper-bottom\">\n");
      out.write("                    <div class=\"shell\" style=\"height: 1700px\">\n");
      out.write("\t\t\t\t<!-- Header -->\n");
      out.write("\t\t\t\t<div id=\"header\">\n");
      out.write("\t\t\t\t\t<!-- Logo -->\n");
      out.write("\t\t\t\t\t<h1 id=\"logo\"><a title=\"Home\" href=\"#\">Electronics store</a></h1>\n");
      out.write("\t\t\t\t\t<p class=\"shopping-cart\"><a class=\"cart\" href=\"#\" title=\"Your Shopping Cart\">Your Shopping Cart</a><span>Articles:</span>&nbsp;11<span>Cost:</span>59.99</p>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<!-- Search -->\n");
      out.write("\t\t\t\t\t<div class=\"search-expand\"></div>\n");
      out.write("\t\t\t\t\t<div id=\"search\">\n");
      out.write("\t\t\t\t\t\t<div class=\"retract-button\">\n");
      out.write("\t\t\t\t\t\t\t<p>retract</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<form action=\"\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"field\" value=\"Search\" title=\"Search\" />\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" value=\"\" class=\"submit-button\" />\n");
      out.write("\t\t\t\t\t\t</form>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- END Search -->\n");
      out.write("\t\t\t\t\t<div class=\"cl\"></div>\n");
      out.write("\t\t\t\t\t<!-- Navigation -->\n");
      out.write("\t\t\t\t\t<div id=\"navigation\">\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a title=\"Home\" href=\"index.jsp\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a title=\"Sales\" href=\"#\">Sales</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a title=\"Catalog\" href=\"#\">Catalog</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a title=\"Blog\" href=\"#\">Blog</a></li>\n");
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
      out.write("\t\t\t\t<!-- Main -->\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t<!-- Slider -->\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<!-- Content -->\n");
      out.write("                                        <div id=\"content\" style=\"background:whitesmoke;height:600px\">    \n");
      out.write("\t\t\t\t\t\t<!-- Featured Products -->\n");
      out.write("                                                <div style=\"height:700px;width:900px;background-color:grey\">\n");
      out.write("                                                    <br></br><h1>\n");
      out.write("                                                        <center>Product Details</center>\n");
      out.write("                                                    </h1>\n");
      out.write("                                                    <br>\n");
      out.write("                                                    <hr><br><br>\n");
      out.write("                                                                <form>\n");
      out.write("                                                         &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                         &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                            &nbsp;&nbsp;&nbsp;&nbsp &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;                         \n");
      out.write("                                                 &nbsp;&nbsp;&nbsp;&nbsp;   Name\n");
      out.write("                                                           \n");
      out.write("                                                            &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp\n");
      out.write("                                                            \n");
      out.write("                                                            &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                            <input type=\"text\" name=\"i1\" value=\"\" style=\"height: 22px; width: 250px\"/><br></br>\n");
      out.write("                                                            &nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                             &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                             &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                              &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                            \n");
      out.write("\n");
      out.write("                                                            Category\n");
      out.write("                                                            &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                            &nbsp;\n");
      out.write("                                                            <select style=\"height: 22px; width: 250px\" name=\"i24\">\n");
      out.write("                                                                <option value=\"A\">Laptops</option>\n");
      out.write("                                                                <option value=\"A\">Pen Drives</option>\n");
      out.write("                                                                <option value=\"A\">Mobiles</option>\n");
      out.write("                                                                \n");
      out.write("                                                            </select><br></br>\n");
      out.write("                                                            \n");
      out.write("                                                             \n");
      out.write("                                                            &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                         &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Brand\n");
      out.write("                                                            \n");
      out.write("                                &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;\n");
      out.write("                                                            &nbsp; &nbsp;  &nbsp; &nbsp;  &nbsp; &nbsp;  &nbsp; &nbsp; \n");
      out.write("                                                            \n");
      out.write("                                                            \n");
      out.write("                                                            <input type=\"text\" name=\"i3\" value=\"\" style=\"height: 22px; width: 250px\"/><br></br>\n");
      out.write("                                                            &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                         &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                            &nbsp;&nbsp;&nbsp;&nbsp &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;                         \n");
      out.write("                                                 &nbsp;&nbsp;&nbsp;&nbsp;   Price of product\n");
      out.write("                                                           \n");
      out.write("                                                            \n");
      out.write("                                                            \n");
      out.write("                                                            &nbsp;&nbsp; &nbsp;&nbsp;\n");
      out.write("                                                            <input type=\"text\" name=\"i4\" value=\"\" style=\"height: 22px; width: 250px\"/><br></br>\n");
      out.write("                                                            \n");
      out.write("                                                             \n");
      out.write("                                                              \n");
      out.write("                                                         &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                         &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                            &nbsp;&nbsp;&nbsp;&nbsp &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;                         \n");
      out.write("                                                 &nbsp;&nbsp;&nbsp;&nbsp;   Model name\n");
      out.write("                                                           \n");
      out.write("                                                            &nbsp;&nbsp;&nbsp\n");
      out.write("                                                            \n");
      out.write("                                                            &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;\n");
      out.write("                                                            <input type=\"text\" name=\"i11\" value=\"\" style=\"height: 22px; width: 250px\"/><br></br>\n");
      out.write("                                                            &nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                             &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                             &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                              &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                            \n");
      out.write("\n");
      out.write("                                                            Detail 1\n");
      out.write("                                                            &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp\n");
      out.write("                                                            \n");
      out.write("                                                            &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                            <input type=\"text\" name=\"i12\" value=\"\" style=\"height: 22px; width: 250px\"/><br></br>\n");
      out.write("                                                            &nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                             &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                             &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                              &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                            \n");
      out.write("\n");
      out.write("                                                             Modal id\n");
      out.write("                                                            &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp\n");
      out.write("                                                            \n");
      out.write("                                                            &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                            <input type=\"text\" name=\"i24\" value=\"\" style=\"height: 22px; width: 250px\"/><br></br>\n");
      out.write("                                                            &nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                             &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                             &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                              &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                            \n");
      out.write("\n");
      out.write("                                                            Color\n");
      out.write("                                                            &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp\n");
      out.write("                                                            \n");
      out.write("                                                            &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                            <input type=\"text\" name=\"i25\" value=\"\" style=\"height: 22px; width: 250px\"/><br></br>\n");
      out.write("                                                            \n");
      out.write("                                                              &nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                             &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                             &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                              &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                            \n");
      out.write("\n");
      out.write("                                                            Detail 2\n");
      out.write("                                                            &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp\n");
      out.write("                                                            \n");
      out.write("                                                            &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                            <input type=\"text\" name=\"i13\" value=\"\" style=\"height: 22px; width: 250px\"/><br></br>\n");
      out.write("                                                            \n");
      out.write("                                                            &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                         &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                          &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Detail 3\n");
      out.write("                                                             \n");
      out.write("                            \n");
      out.write("                                                            \n");
      out.write("                                                            \n");
      out.write("                                                         \n");
      out.write("                                                            \n");
      out.write("                            \n");
      out.write("                               \n");
      out.write("                                                            \n");
      out.write("                                                            &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;\n");
      out.write("                                                            &nbsp; &nbsp;  &nbsp; &nbsp;  &nbsp; &nbsp;  &nbsp; &nbsp; \n");
      out.write("                                                            \n");
      out.write("                                                            \n");
      out.write("                                                            <input type=\"text\" name=\"i14\" value=\"\" style=\"height: 22px; width: 250px\"/><br></br>\n");
      out.write("                                                            &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                         &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                            &nbsp;&nbsp;&nbsp;&nbsp &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;                         \n");
      out.write("                                                 &nbsp;&nbsp;&nbsp;&nbsp;   Color\n");
      out.write("                                                           \n");
      out.write("                                                            \n");
      out.write("                                                            \n");
      out.write("                                                            &nbsp;&nbsp; &nbsp;&nbsp;\n");
      out.write("                                                            <input type=\"text\" name=\"i15\" value=\"\" style=\"height: 22px; width: 250px\"/><br></br>\n");
      out.write("                                                            \n");
      out.write("                                                            &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                         &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                            &nbsp;&nbsp;&nbsp;&nbsp &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;                         \n");
      out.write("                                                 &nbsp;&nbsp;&nbsp;&nbsp;   Inside the Box\n");
      out.write("                                                           \n");
      out.write("                                                            \n");
      out.write("                                                            \n");
      out.write("                                                            &nbsp;&nbsp; &nbsp;&nbsp;\n");
      out.write("                                                            <input type=\"text\" name=\"i16\" value=\"\" style=\"height: 22px; width: 250px\"/><br></br>\n");
      out.write("                                                            \n");
      out.write("                                                             &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                         &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                            &nbsp;&nbsp;&nbsp;&nbsp &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;                         \n");
      out.write("                                                 &nbsp;&nbsp;&nbsp;&nbsp;   Warranty 1\n");
      out.write("                                                           \n");
      out.write("                                                            &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp\n");
      out.write("                                                            \n");
      out.write("                                                            &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                            <input type=\"text\" name=\"i22\" value=\"\" style=\"height: 22px; width: 250px\"/><br></br>\n");
      out.write("                                                            &nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                             &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                             &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                              &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                            \n");
      out.write("\n");
      out.write("                                                            Warranty 2\n");
      out.write("                                                            &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                            &nbsp;\n");
      out.write("                                                            \n");
      out.write("                                                            <input type=\"text\" name=\"i23\" value=\"\" style=\"height: 22px; width: 250px\"/>\n");
      out.write("                                                            \n");
      out.write("                                                            <input type=\"submit\" name=\"sub\" value=\"Submit Details\"/>\n");
      out.write("                                                            \n");
      out.write("                                                            \n");
      out.write("                                                                </form>             \n");
      out.write("                                                </div>\n");
      out.write("                                               \n");
      out.write("                                                    ");
 
                                                    if(request.getParameter("sub")!=null)
                                                                                                               {
                                                        /*
                                                    }
                                                        session.setAttribute("name",request.getParameter("i1"));
                                                       session.setAttribute("category",request.getParameter("i24"));
                                                       session.setAttribute("brand",request.getParameter("i3"));
                                                          session.setAttribute("price",request.getParameter("i4"));
                                                   session.setAttribute("model",request.getParameter("i11"));
                                                    session.setAttribute("detail",request.getParameter("i12"));
                                                     session.setAttribute("mid",request.getParameter("i24"));
                                                    session.setAttribute("color1",request.getParameter("i25"));
                                                    session.setAttribute("d2",request.getParameter("i13"));
                                                    session.setAttribute("d3",request.getParameter("i14"));
                                                    session.setAttribute("d4",request.getParameter("i15"));
                                                    session.setAttribute("inbox",request.getParameter("i16"));
                                                    session.setAttribute("warranty1",request.getParameter("i22"));
                                                    session.setAttribute("warranty2",request.getParameter("i23"));  */
                                                         Connection conn;
            Statement smt;
            ResultSet rst;
        
            try
                    {
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
conn=DriverManager.getConnection("jdbc:odbc:project");
smt=conn.createStatement();

//smt.executeUpdate("insert into upload(id,name,uploaded)values ("+session.getAttribute("id")+",'"+session.getAttribute("name")+"','"+saveFile+"')");


            smt.executeUpdate("INSERT INTO image values (100,'"+request.getParameter("i1")+"','null','"+request.getParameter("i24")+"','"+request.getParameter("i3")+"','"+request.getParameter("i11")+"','"+request.getParameter("i4")+"','null','null','null','null','"+request.getParameter("i12")+"','"+request.getParameter("i13")+"','"+request.getParameter("i14")+"','"+request.getParameter("i15")+"','"+request.getParameter("i25")+"','null','null','null','null','"+request.getParameter("i25")+"','"+request.getParameter("i22")+"','"+request.getParameter("i23")+"','"+request.getParameter("i16")+"')");
   out.println("insertion done");
                                    }
catch(Exception ex)
{
out.println(ex.getMessage());
}                                            
                                                              }
                                                    

      out.write("\n");
      out.write("                                                \n");
      out.write("\t\t\t\t\t\t<!-- Featured Products -->\n");
      out.write("                                                <div style=\"height:600px;width:900px;background-color:pink\">\n");
      out.write("                                                    <br></br><h1>\n");
      out.write("                                                        <center>Small Pictures</center>\n");
      out.write("                                                    </h1>\n");
      out.write("                                                    <br>\n");
      out.write("                                                    <hr><br><br>\n");
      out.write("                                                                <form method=\"POST\" enctype=\"multipart/form-data\" action=\"upload12.jsp.jsp\">\n");
      out.write("                                                                     &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                         &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                            &nbsp;&nbsp;&nbsp;&nbsp &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;                         \n");
      out.write("                                                 &nbsp;&nbsp;&nbsp;&nbsp;  First image\n");
      out.write("                                                           \n");
      out.write("                                                            &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;\n");
      out.write("                                                            &nbsp; &nbsp; \n");
      out.write("                                                            \n");
      out.write("                                                            \n");
      out.write("                                                            <input type=\"file\" name=\"file\" value=\"Upload file\"/> <input type=\"submit\" name=\"up1\" value=\"upload 1\"/><br></br>\n");
      out.write("                                                        \n");
      out.write("                                                                </form>\n");
      out.write("                                                                <form method=\"POST\" enctype=\"multipart/form-data\">&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                         &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                            &nbsp;&nbsp;&nbsp;&nbsp &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;                         \n");
      out.write("                                                 &nbsp;&nbsp;&nbsp;&nbsp;   Pic 1\n");
      out.write("                                                           \n");
      out.write("                                                            &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp\n");
      out.write("                                                            \n");
      out.write("                                                            &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;\n");
      out.write("                                                            <input type=\"file\" name=\"i6\" value=\"upload pic\" style=\"height: 22px; width: 250px\"/><input type=\"submit\" name=\"up2\" value=\"upload 2\"/><br></br>\n");
      out.write("                                                                </form>\n");
      out.write("                                                           <form method=\"POST\" enctype=\"multipart/form-data\"> &nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                             &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                             &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                              &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                            \n");
      out.write("\n");
      out.write("                                                            Pic 2\n");
      out.write("                                                            &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                            <input type=\"file\" name=\"i7\" value=\"upload pic\" style=\"height: 22px; width: 250px\"/><br></br>\n");
      out.write("                                                           </form>\n");
      out.write("                                                                <form method=\"POST\" enctype=\"multipart/form-data\">\n");
      out.write("                                                              &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                         &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                            &nbsp;&nbsp;&nbsp;&nbsp &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;                         \n");
      out.write("                                                 &nbsp;&nbsp;&nbsp;&nbsp;  Pic 3\n");
      out.write("                                                           \n");
      out.write("                                                            \n");
      out.write("                                                 \n");
      out.write("                                                 &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;\n");
      out.write("                                                            &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \n");
      out.write("                                                            <input type=\"file\" name=\"i8\" value=\"Upload file\"/><br></br>\n");
      out.write("                                                                </form>\n");
      out.write("                                                                <form method=\"POST\" enctype=\"multipart/form-data\">&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                         &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Pic 4\n");
      out.write("                                                  &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                            <input type=\"file\" name=\"i9\" value=\"\" style=\"height: 22px; width: 250px\"/><br></br>\n");
      out.write("                                                          \n");
      out.write("                                                                </form>\n");
      out.write("                                                                <form method=\"POST\" enctype=\"multipart/form-data\">&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                         &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                            &nbsp;&nbsp;&nbsp;&nbsp &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;                         \n");
      out.write("                                                 &nbsp;&nbsp;&nbsp;&nbsp;  \n");
      out.write("                                                            \n");
      out.write("                                                            \n");
      out.write("                                                            \n");
      out.write("                                                             &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                         &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                            &nbsp;&nbsp;&nbsp;&nbsp &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;                         \n");
      out.write("                                                 &nbsp;&nbsp;&nbsp;&nbsp;   Pic 1\n");
      out.write("                                                           \n");
      out.write("                                                            &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp\n");
      out.write("                                                            \n");
      out.write("                                                            &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;\n");
      out.write("                                                            <input type=\"file\" name=\"i17\" value=\"upload pic\" style=\"height: 22px; width: 250px\"/><br></br>\n");
      out.write("                                                                </form>\n");
      out.write("                                                                <form method=\"POST\" enctype=\"multipart/form-data\">\n");
      out.write("                                                            &nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                             &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                             &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                              &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                            \n");
      out.write("\n");
      out.write("                                                            Pic 2\n");
      out.write("                                                            &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                            <input type=\"file\" name=\"i18\" value=\"upload pic\" style=\"height: 22px; width: 250px\"/><br></br>\n");
      out.write("                                                                </form>\n");
      out.write("                                                                <form method=\"POST\" enctype=\"multipart/form-data\">\n");
      out.write("                                                              &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                         &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                            &nbsp;&nbsp;&nbsp;&nbsp &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;                         \n");
      out.write("                                                 &nbsp;&nbsp;&nbsp;&nbsp;  Pic 3\n");
      out.write("                                                           \n");
      out.write("                                                            \n");
      out.write("                                                 \n");
      out.write("                                                 &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;\n");
      out.write("                                                            &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \n");
      out.write("                                                            <input type=\"file\" name=\"i19\" value=\"Upload file\"/><br></br>\n");
      out.write("                                                                </form>\n");
      out.write("                                                                <form method=\"POST\" enctype=\"multipart/form-data\">\n");
      out.write("                                                            &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                         &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Pic 4\n");
      out.write("                                                             \n");
      out.write("                            \n");
      out.write("                                                            \n");
      out.write("                                                            \n");
      out.write("                                                         \n");
      out.write("                                                            \n");
      out.write("                            \n");
      out.write("                               \n");
      out.write("                                                            \n");
      out.write("                                                            &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;\n");
      out.write("                                                            &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                            \n");
      out.write("                                                            \n");
      out.write("                                                            <input type=\"file\" name=\"i20\" value=\"\" style=\"height: 22px; width: 250px\"/><br></br>\n");
      out.write("                                                                </form>   &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                         &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                            &nbsp;&nbsp;&nbsp;&nbsp &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;                         \n");
      out.write("                                                 &nbsp;&nbsp;&nbsp;&nbsp;   \n");
      out.write("                                                            \n");
      out.write("                                                            \n");
      out.write("                                                 <input type=\"submit\" name=\"up\" value=\"UPLOad\"/>\n");
      out.write("                                                            \n");
      out.write("                                \n");
      out.write("                                                              \n");
      out.write("                                                                  </div>      \n");
      out.write("                         \n");
      out.write("                                                                ");

                                                                                                    
                                                    
                                                                                                     
      out.write("\n");
      out.write("                                                                                                   \n");
      out.write("                                              \n");
      out.write("        \n");
      out.write("        \n");
      out.write("                                               \n");
      out.write("                                                \n");
      out.write("\n");
      out.write("                                               \n");
      out.write("                                               \n");
      out.write("                                               \n");
      out.write("                                               <!-- these are imp div tag -->\n");
      out.write("                                               \n");
      out.write("                                              \t\t\n");
      out.write("      \n");
      out.write("                     \n");
      out.write("\t\t\t\t\t\t<!-- Featured Products -->\n");
      out.write("                                               \n");
      out.write("                                               \n");
      out.write("                                                \n");
      out.write("\t\t\t\t\t\t<!-- Featured Products -->\n");
      out.write("                                              \n");
      out.write("                                                   \n");
      out.write("                                                             \n");
      out.write("                       \n");
      out.write("       \n");
      out.write("                                                </div>\n");
      out.write("                                                <br>\n");
      out.write("                                                \n");
      out.write("\t\t\t\t\t\t<!-- Featured Products -->\n");
      out.write("                                \n");
      out.write("                                                         ");

       
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
    rs=stmt.executeQuery("select max(id) from image");
    if(rs.next())
               {
        id=rs.getString(1);
    }
    idd=Integer.parseInt(id);
    
   stmt.executeUpdate("insert into image values("+(idd+1)+",'"+request.getParameter("i1")+"',,'"+request.getParameter("i24")+"','"+request.getParameter("i2")+"','"+request.getParameter("i3")+"','"+request.getParameter("i4")+"','"+request.getParameter("i5")+"','"+request.getParameter("i6")+"','"+request.getParameter("i7")+"','"+request.getParameter("i8")+"','"+request.getParameter("i9")+"','"+request.getParameter("i10")+"','"+request.getParameter("i11")+"','"+request.getParameter("i12")+"','"+request.getParameter("i24")+"','"+request.getParameter("i25")+"','"+request.getParameter("i13")+"','"+request.getParameter("i14")+"','"+request.getParameter("i15")+"','"+request.getParameter("i16")+"','"+request.getParameter("i17")+"','"+request.getParameter("i18")+"','"+request.getParameter("i19")+"','"+request.getParameter("i20")+"','"+request.getParameter("i21")+"','"+request.getParameter("i22")+"','"+request.getParameter("i23")+"')");
           out.print("insertion done");
  // response.sendRedirect("index.jsp");
    
}
        catch(Exception ex)
        {
         out.println(ex.getMessage());   
        }                   
                               
        }         
        
      out.write("  \n");
      out.write("\t\n");
      out.write("                                                              \n");
      out.write("\t\t\t\t\t\t\t\t<!-- END Scroll Pane -->\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("                                          \n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<!-- END Bottom Strip -->\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
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
