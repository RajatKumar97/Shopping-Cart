package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class info_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\">\n");
      out.write("<meta name=\"language\" content=\"english\"> \n");
      out.write("<meta http-equiv=\"Content-Style-Type\" content=\"text/css\">\n");
      out.write("<meta http-equiv=\"Content-Script-Type\" content=\"text/javascript\">\n");
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
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.leanModal.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/magnifier.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("     \n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("    \n");
      out.write("\t<!-- Wrapper -->\n");
      out.write("\t<div id=\"wrapper\">\n");
      out.write("            ");
 
            
            if(request.getParameter("q")!=null)
                               {
                session.setAttribute("qr", request.getParameter("q"));
            }
              Connection con;
        Statement stmt;
      
 try
                               {
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    con=DriverManager.getConnection("jdbc:odbc:project");
    stmt=con.createStatement();
      out.write("\n");
      out.write("\t\t <div id=\"wrapper-bottom\">\n");
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
      out.write("                                                    <input type =\"submit\" class=\"button red\" name=\"logout\" value=\"Logout\"/></form>\n");
      out.write("                                                ");
 
                                                if(request.getParameter("logout")!=null)
                                                                                                       {
                                                    session.removeAttribute("email");
                                                    response.sendRedirect("index.jsp");
                                                }
                                        }
else
{
 
      out.write("                                             ");
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
      out.write("                                                    <input type=\"text\" class=\"field\" value=\"Search\" name=\"search\" title=\"Search\" />\n");
      out.write("                                                    <input type=\"submit\" value=\"\" class=\"submit-button\" name=\"search\"/>\n");
      out.write("\t\t\t\t\t\t</form>\t\n");
      out.write("                                            ");
 
                                                if(request.getParameter("search")!=null)
                                                                                                       {
                                                    session.setAttribute("search",request.getParameter("search"));
                                                    response.sendRedirect("waste.jsp");
                                                }
                                                

      out.write("\n");
      out.write("                                            \n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- END Search -->\n");
      out.write("\t\t\t\t\t<div class=\"cl\"></div>\n");
      out.write("\t\t\t\t\t<!-- Navigation -->\n");
      out.write("\t\t\t\t\t<div id=\"navigation\">\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a title=\"Home\" href=\"index.jsp\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a title=\"About Us\" href=\"#\">About Us</a></li>\t\t\t\t\t\t\t\n");
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
      out.write("\t\t\t\t\t<\n");
      out.write("\t\t\t\t\t<!-- Content -->\n");
      out.write("                                        <div id=\"content\" style=\"background:white\">    \n");
      out.write("\t\t\t\t\t\t<!-- Featured Products -->\n");
      out.write("                                                <div style=\"height:400px;width:900px;background-color:greenyellow\">\n");
      out.write("                                                <div style=\"height:400px;width: 430px;background-color:slateblue;float:left\">\n");
      out.write("                                               \n");
      out.write("                                                                                  ");

                                                                                   String id="",name1="",prize="";   
                                                                                   ResultSet rs=null;
                                                                                  String qry="";
                                                                                 
                                                                    
                                                                //     out.println("klklkl"+session.getAttribute("qr"));
                                                                                                                                                                                
                                                                                     
   rs=stmt.executeQuery("select * from image where id="+session.getAttribute("qr")+"");
   //out.print("ksjdksjd"+session.getAttribute("qr"));
   if(rs.next())
                   {
       name1= rs.getString(2);
       prize=rs.getString(7);
        
      out.write("\n");
      out.write("        \n");
      out.write("        <div style=\"float: left;height:400px; width:430px;background-color:white\"> <img name=\"p1\" src=\"");
      out.print(rs.getString(3));
      out.write("\"/><br></br><br></br>\n");
      out.write("                    <div style=\"height:100px;width: 430px;float:left;background-color: white\">\n");
      out.write("                        <a onmouseover='stu(\"");
      out.print(rs.getString(17));
      out.write("\")'> <div style=\"height:80px;width:100px;background-color:white;float: left;border-color:grey;border-style: solid;border-width: 1px\"><img src=\"");
      out.print(rs.getString(8));
      out.write("\"/></div></a>\n");
      out.write("                             <a onmouseover='stu(\"");
      out.print(rs.getString(18));
      out.write("\")'>    <div style=\"height:80px;width:122px;background-color:white;float:right;border-color:grey;border-style: solid;border-width: 1px\"><img src=\"");
      out.print(rs.getString(9));
      out.write("\"/></div></a>\n");
      out.write("                        <a onmouseover='stu(\"");
      out.print(rs.getString(19));
      out.write("\")'> <div style=\"height:80px;width:100px;background-color:white;float:right;border-color:grey;border-style: solid;border-width: 1px\"><img src=\"");
      out.print(rs.getString(10));
      out.write("\"/></div></a>\n");
      out.write("                       <a onmouseover='stu(\"");
      out.print(rs.getString(20));
      out.write("\")'> <div style=\"height:80px;width:100px;background-color:white;float: right;border-color:grey;border-style: solid;border-width: 1px\"><img src=\"");
      out.print(rs.getString(11));
      out.write("\"/></div></a>\n");
      out.write("          \n");
      out.write("                    </div>                                    \n");
      out.write("                     </div></div>\n");
      out.write("                    \n");
      out.write("                        <div style=\"height:500px;width:470px;float:right;background-color:whitesmoke\">\n");
      out.write("                                \n");
      out.write("                            \n");
      out.write("                            <div style=\"color:black; height: 40px\"> <font style=\"font-size:20px\">");
      out.print(rs.getString(12));
      out.write("</font></div>\n");
      out.write("                            <div style=\"height:50px\"> ");
      out.print(rs.getString(21));
      out.write("</div>\n");
      out.write("                            <div style=\"height:50px\"> <h1 style=\"color: black\"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Specification</h1></div>\n");
      out.write("                            <div style=\"height:130px\"><ul>\n");
      out.write("                                    <li>\n");
      out.write("                                        &nbsp;&nbsp;&nbsp;&nbsp;  ");
      out.print(rs.getString(13));
      out.write("\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        &nbsp;&nbsp;&nbsp;&nbsp; ");
      out.print(rs.getString(14));
      out.write("\n");
      out.write("                                    </li>\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                    <li>\n");
      out.write("                                        &nbsp;&nbsp;&nbsp;&nbsp; ");
      out.print(rs.getString(15));
      out.write("\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        &nbsp;&nbsp;&nbsp;&nbsp; ");
      out.print(rs.getString(16));
      out.write("\n");
      out.write("                                    </li>\n");
      out.write("                                    \n");
      out.write("                                </ul>\n");
      out.write("                                    <div style=\"height: 150px;\">    <ul style=\"float:right\">\n");
      out.write("                                        <li>\n");
      out.write("                                            ");
      out.print(rs.getString(22));
      out.write("\n");
      out.write("                                        </li>\n");
      out.write("                                        \n");
      out.write("                                        <li>\n");
      out.write("                                         ");
      out.print(rs.getString(23));
      out.write("\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                        </div>\n");
      out.write("                                    \n");
      out.write("                 \n");
      out.write("                </div>\t\t\n");
      out.write("                                        \n");
      out.write("                                    \n");
      out.write("                                                   <div style=\"height:80px\">\n");
      out.write("                                        <h1 style=\"color: black\"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Rs. ");
      out.print(rs.getString(7));
      out.write("</h1><br>\n");
      out.write("         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;                   (Inclusive of all taxes)<br>\n");
      out.write("                                            \n");
      out.write("                                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp; (Free home delivery)\n");
      out.write("                                    </div>\n");
      out.write("                                               &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                               <div style=\"float: left\">       \n");
      out.write("                                             <div class=\"content\">      \n");
      out.write("                                                 <div>       <form>   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    <input type=\"submit\" class=\"button green\"  name=\"but1\" value=\"BUY NOW\"/> </form>   </div>  \n");
      out.write("                                              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<div style=\"float: right\"> 2-3 days standard delivery <br<br></br>                                                   \n");
      out.write("                                         Check Your delivery option <br></br>\n");
      out.write("                                                                                                      \n");
      out.write("                                                   </div>\n");
      out.write("                                               </div>\n");
      out.write("                                \n");
      out.write("                                               \n");
      out.write("                                                   \n");
      out.write("                                               </br>\n");
      out.write("                                               <br></br>\n");
      out.write("                                               <div style=\"float: left\">\n");
      out.write("                                                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;     Inside the box --    ");
      out.print(rs.getString(24));
      out.write("\n");
      out.write("                                               </div>\n");
      out.write("                                               \n");
      out.write("                                               \n");
      out.write("                                               \n");
      out.write("                                               <!-- these are imp div tag -->\n");
      out.write("                                               \n");
      out.write("                                                </div>\t\t</div>\n");
      out.write("      \n");
      out.write("                \n");
      out.write("                                                       \n");
      out.write("\t\t\t\t\t\t\t\t <script>\n");
      out.write("    function stu(t)\n");
      out.write("    {\n");
      out.write("      // alert('yess');\n");
      out.write("  p1.src=t;\n");
      out.write("    \n");
      out.write("    }\n");
      out.write("</script> \n");
      out.write("                                                 \n");
      out.write("                                                             ");
 
   
                        int id5=1;
       
       
   
                                                          
                           }
    
                                                                                     
                if (request.getParameter("but1")!=null)
                
                               
                                  {
        
                    stmt.execute("insert into cart values("+session.getAttribute("qr") +",'"+name1+"','"+prize+"',1)");
                   // stmt.execute("insert into order values("+session.getAttribute("qr") +",'"+name1+"','"+prize+"',1)");
       response.sendRedirect("addtocart.jsp");
                          }
        
                        }

                                                             catch(Exception ex)
                                                                        {
                                                                             out.println("errrrrrot"+ex.getMessage());   
                                                                                 }                                                                      
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<!-- END Scroll Pane -->\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("                                          \n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cl\"></div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<!-- END Bottom Strip -->\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- END Content -->\n");
      out.write("\t\t\n");
      out.write("\t\t\t\t<!-- END Main -->\n");
      out.write("\t\t\t\n");
      out.write("\t\n");
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
      out.write("      <div id=\"modal\" class=\"popupContainer\" style=\"display:none;\">\n");
      out.write("\t\t<header class=\"popupHeader\">\n");
      out.write("\t\t\t<span class=\"header_title\">Login</span>\n");
      out.write("\t\t\t<span class=\"modal_close\"><i class=\"fa fa-times\"></i></span>\n");
      out.write("\t\t</header>\n");
      out.write("\t\t\n");
      out.write("\t\t<section class=\"popupBody\">\n");
      out.write("\t\t\t<!-- Social Login -->\n");
      out.write("\t\t\t<div class=\"social_login\">\n");
      out.write("\t\t\t\t<div class=\"\">\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"social_box fb\">\n");
      out.write("\t\t\t\t\t\t<span class=\"icon\"><i class=\"fa fa-facebook\"></i> </span>\n");
      out.write("\t\t\t\t\t\t<span class=\"icon_title\">Connect with Facebook</span>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"social_box google\">\n");
      out.write("\t\t\t\t\t\t<span class=\"icon\"><i class=\"fa fa-google-plus\"></i></span>\n");
      out.write("\t\t\t\t\t\t<span class=\"icon_title\">Connect with Google</span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"centeredText\">\n");
      out.write("\t\t\t\t\t<span>Or use your Email address</span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"action_btns\">\n");
      out.write("\t\t\t\t\t<div class=\"one_half\"><a href=\"#\" id=\"login_form\" class=\"btn\">Login</a></div>\n");
      out.write("\t\t\t\t\t<div class=\"one_half last\"><a href=\"#\" id=\"register_form\" class=\"btn\">Sign up</a></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<!-- Username & Password Login form -->\n");
      out.write("\t\t\t<div class=\"user_login\">\n");
      out.write("\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t<label>Email / Username</label>\n");
      out.write("\t\t\t\t\t<input type=\"text\" />\n");
      out.write("\t\t\t\t\t<br />\n");
      out.write("\n");
      out.write("\t\t\t\t\t<label>Password</label>\n");
      out.write("\t\t\t\t\t<input type=\"password\" />\n");
      out.write("\t\t\t\t\t<br />\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"checkbox\">\n");
      out.write("\t\t\t\t\t\t<input id=\"remember\" type=\"checkbox\" />\n");
      out.write("\t\t\t\t\t\t<label for=\"remember\">Remember me on this computer</label>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"action_btns\">\n");
      out.write("\t\t\t\t\t\t<div class=\"one_half\"><a href=\"#\" class=\"btn back_btn\"><i class=\"fa fa-angle-double-left\"></i> Back</a></div>\n");
      out.write("\t\t\t\t\t\t<div class=\"one_half last\"><a href=\"#\" class=\"btn btn_red\">Login</a></div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"forgot_password\">Forgot password?</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<!-- Register Form -->\n");
      out.write("\t\t\t<div class=\"user_register\">\n");
      out.write("\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t<label>Full Name</label>\n");
      out.write("\t\t\t\t\t<input type=\"text\" />\n");
      out.write("\t\t\t\t\t<br />\n");
      out.write("\n");
      out.write("\t\t\t\t\t<label>Email Address</label>\n");
      out.write("\t\t\t\t\t<input type=\"email\" />\n");
      out.write("\t\t\t\t\t<br />\n");
      out.write("\n");
      out.write("\t\t\t\t\t<label>Password</label>\n");
      out.write("\t\t\t\t\t<input type=\"password\" />\n");
      out.write("\t\t\t\t\t<br />\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"checkbox\">\n");
      out.write("\t\t\t\t\t\t<input id=\"send_updates\" type=\"checkbox\" />\n");
      out.write("\t\t\t\t\t\t<label for=\"send_updates\">Send me occasional email updates</label>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"action_btns\">\n");
      out.write("\t\t\t\t\t\t<div class=\"one_half\"><a href=\"#\" class=\"btn back_btn\"><i class=\"fa fa-angle-double-left\"></i> Back</a></div>\n");
      out.write("\t\t\t\t\t\t<div class=\"one_half last\"><a href=\"#\" class=\"btn btn_red\">Register</a></div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</section>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
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
      out.write("</html>\n");
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
