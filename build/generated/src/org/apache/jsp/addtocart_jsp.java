package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.sun.org.apache.bcel.internal.generic.Select;
import java.sql.*;

public final class addtocart_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(" \n");
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
      out.write("    <head>\n");
      out.write("    <style>\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("     \n");
      out.write("                                                   \n");
      out.write("        \n");
      out.write("\t<!-- Wrapper -->\n");
      out.write("\t<div id=\"wrapper\">\n");
      out.write("            \n");
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
             
      out.write("                                 ");
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
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"field\" value=\"Search\" title=\"Search\" name=\"search\"/>\n");
      out.write("                                                    <input type=\"submit\" value=\"\" class=\"submit-button\" name=\"search\"/>\n");
      out.write("\t\n");
      out.write("                                                   \n");
      out.write("\t\t\t\t\t\t</form>\t\n");
      out.write("                                                ");
 
                                                if(request.getParameter("search")!=null)
                                                                                                       {
                                                    session.setAttribute("search",request.getParameter("search"));
                                                    response.sendRedirect("waste.jsp");
                                                }
                                               

      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t </div>\n");
      out.write("\t\t\t\t\t <!-- END Search -->\n");
      out.write("\t\t\t\t \t<div class=\"cl\"></div>\n");
      out.write("\t\t\t\t\t<!-- Navigation -->\n");
      out.write("\t\t\t\t\t<div id=\"navigation\">\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a title=\"Home\" href=\"index.jsp\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a title=\"About Us\" href=\"#\">About Us</a></li>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</ul>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t \t<div class=\"cl\"></div>\t\t\t\t\n");
      out.write("\t\t\t\t\t<!-- END Navigation -->\n");
      out.write("\t\t\t\t\t<!-- Dropdown Navigation -->\n");
      out.write("\t\t\t\t\t<div id=\"sort-nav\">\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t <span class=\"label-left\"></span>\n");
      out.write("\t\t\t\t\t\t \t<div class=\"label-bg\">\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a title=\"Collections\" href=\"#\">Collections</a>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t \t\t\t<div class=\"dd\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a title=\"Laptops\" href=\"laptops.jsp?qv=laptop\">Laptops</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a title=\"Product\" href=\"laptops.jsp?qv=pendrive\">Pendrives</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a title=\"Product\" href=\"laptops.jsp?qv=mobile\">Mobiles</a></li></ul></div></li>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a title=\"Brand\" href=\"#\">Brands</a>\n");
      out.write("\t\t\t\t\t\t\t \t\t<div class=\"dd\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a title=\"Product\" href=\"hp.jsp?qc=hp\">Hp</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a title=\"Product\" href=\"hp.jsp?qc=samsung\">Samsung</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a title=\"Product\" href=\"hp.jsp?qc=dell\">Dell</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a title=\"Product\" href=\"hp.jsp?qc=sony\">Sony</a></li>\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t  \t\t<li class=\"last\">\n");
      out.write("\t\t\t\t\t\t \t\t\t<a title=\"By Price\" class=\"By Price\" href=\"#\">By Price</a>\n");
      out.write("\t\t\t\t\t\t \t\t\t<div class=\"dd\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a title=\"Product\" href=\"lowhigh.jsp\">Low to high</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a title=\"Product\" href=\"highlow.jsp\">High to Low</a></li>\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t \t<span class=\"label-right\"></span>\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<!-- END Dropdown Navigation -->\n");
      out.write("\t\t\t\t \t<div class=\"cl\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- END Header -->\n");
      out.write("\t\t\t\t<!-- Main -->\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t<!-- Slider -->\n");
      out.write("\t\t\t\t\t    \n");
      out.write("\t\t\t\t\t<!-- Content -->\n");
      out.write("                                         <div id=\"content\" style=\"background:white;height:600px\">    \n");
      out.write("\t\t\t\t\t\t<!-- Featured Products -->\n");
      out.write("                                                <div style=\"height:500px;width:900px;background-color:whitesmoke\">\n");
      out.write("                                                    <center><br></br>\n");
      out.write("                                                        <h1 style=\"color: black\">Products in Your Cart</h1><br>\n");
      out.write("                                                                </center>\n");
      out.write("                                                     <center> <h3 style=\"color:  black\">Your cart contains following</h3> </center><br>\n");
      out.write("                                                      <h4 style=\"color: black\">\n");
      out.write("                                                          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   \n");
      out.write("                                                        \n");
      out.write("                                                          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                          \n");
      out.write("                                                          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                         \n");
      out.write("                                              </h4>\n");
      out.write("                                                \n");
      out.write("                                                  <div class=\"CSSTableGenerator\" style=\"margin-left: 200px\">\n");
      out.write("                                                      \n");
      out.write("                                                     <table border=\"\" >\n");
      out.write("                                                             <tr>\n");
      out.write("                                                         <td>\n");
      out.write("                                                             Product\n");
      out.write("                                                                       </td>                                                                <td>\n");
      out.write("                                                         \n");
      out.write("                                                                  \n");
      out.write("                                                                  Product id </center><br>\n");
      out.write("                                                         </td>\n");
      out.write("                                                                  <td>\n");
      out.write("                                                           \n");
      out.write("                                                                  \n");
      out.write("                                                                  Price </h2> </center><br>\n");
      out.write("                                                         </td>\n");
      out.write("                                                                 \n");
      out.write("                                                                  <td>\n");
      out.write("                                                          \n");
      out.write("                                                                  \n");
      out.write("                                                                  Quantity </h2> </center><br>\n");
      out.write("                                                         </td>\n");
      out.write("                                                                       <td>\n");
      out.write("                                                          \n");
      out.write("                                                                  \n");
      out.write("                                                                  Delete </h2> </center><br>\n");
      out.write("                                                         </td>\n");
      out.write("                                                             </tr>\n");
      out.write("                                        ");
 
                                         
                      int sum1 =0;
                       int sum2 =0;                                             
            Connection con;
            Statement smt;
            ResultSet rs;
            //ResultSet rs1;
             try
                                       {
              
                 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                 con=DriverManager.getConnection("jdbc:odbc:project");
                 smt=con.createStatement();
                
                 rs=smt.executeQuery("select * from cart");
             //  rs1=smt.executeQuery("Select sum(prize) from cart"); 
               
               
                               
             while(rs.next())
                               {
                 
             String pro =rs.getString(2);
                   sum1=sum1+Integer.parseInt(rs.getString(3));
                   sum2=sum2+Integer.parseInt(rs.getString(4));
                   session.setAttribute("product",pro);
                   
             
       // smt.executeUpdate("insert into login values('59','33','"+session.getAttribute("product")+"')");            
       
            
      out.write("\n");
      out.write("         \n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                     ");
      out.print(rs.getString(2));
      out.write(" \n");
      out.write("                </td>                                  \n");
      out.write("            <td> \n");
      out.write("                                                                        ");
      out.print(rs.getString(1));
      out.write("\n");
      out.write("                                                         </td>\n");
      out.write("                                                                        <td>     <center> RS. ");
      out.print(rs.getString(3));
      out.write(" </center> \n");
      out.write("                                                                       \n");
      out.write("                                                                   \n");
      out.write("                                                         </td>\n");
      out.write("                                                                       <td>       <h3> ");
      out.print(rs.getString(4));
      out.write("  \n");
      out.write("                                                                    \n");
      out.write("                                                                             \n");
      out.write("                                                                      \n");
      out.write("                                                                   \n");
      out.write("                                                         </td>\n");
      out.write("                                                                             <td>\n");
      out.write("                                                                                  <a title=\"Details\" href=\"wasteew.jsp?q=");
      out.print(rs.getString(1));
      out.write("\"> <img src=\"uploaded/del.jpg\"/> </a>\n");
      out.write("                                                                             </td>\n");
      out.write("                                                     </tr>\n");
      out.write("                                                                            \n");
      out.write("                                                                             \n");
      out.write("                                                                             \n");
      out.write("                                                                              \n");
      out.write("                                                             \n");
      out.write("                                                                      \n");
 
//sum=sum+Integer.parseInt(s);
}   
          //     out.print("TOTAL BILL ="+sum);
                               }
                               
 catch(Exception ex)
{

 out.println(ex.getMessage());
}                                                                

      out.write("    \n");
      out.write("                                                       </table>  \n");
      out.write("                                                 </div>\n");
      out.write("                               ");

          Connection con11;
        Statement stmt11;
        ResultSet rs11;
        String id1="";
         int idd1;
         try
                               {
     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
     con11=DriverManager.getConnection("jdbc:odbc:project");
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
            session.setAttribute("total",sum1);
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
        session.setAttribute("total",sum1);
         response.sendRedirect("userinfoo.jsp");
       
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
      out.write("                                                   \n");
      out.write("         \n");
      out.write("       \n");
      out.write("                                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                                    \n");
      out.write("                                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                                     </h3><br></br>\n");
      out.write("                                                                      <h3 style=\"color: black\">\n");
      out.write("                                                                \n");
      out.write("                                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                                    \n");
      out.write("                                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                                    \n");
      out.write("                                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                                     \n");
      out.write("                                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                                     \n");
      out.write("                                                                      Total prize of the Cart is Rs.   \n");
      out.write("                                                                      ");
      out.print(sum1);
      out.write("\n");
      out.write("                                                                \n");
      out.write("                                                                \n");
      out.write("                                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                                    \n");
      out.write("                                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                                    \n");
      out.write("                                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                                     \n");
      out.write("                                                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                                     \n");
      out.write("                                                                      Total Quantities in the Cart is   \n");
      out.write("                                                                      ");
      out.print(sum2);
      out.write("\n");
      out.write("                                                                  </h3>\n");
      out.write("                                                                       \n");
      out.write("                                                                  <br></br>\n");
      out.write("                                                            \n");
      out.write("                                                                  \n");
      out.write("                                                        \n");
      out.write("                                                      \n");
      out.write("                                                         \n");
      out.write("                                                                          \n");
      out.write("                                                                           \n");
      out.write("                                                                          \n");
      out.write("                                                                           ");
 if(session.getAttribute("email")!=null)
                                                                                                                                                            {
                                                                          
         
      out.write("\n");
      out.write("         <form>\n");
      out.write("                                                                               &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    \n");
      out.write("                                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                                          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                                         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                                         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                                         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                                         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                                          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                                          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href=\"index.jsp\"><input type=\"button\" class=\"button green\" name=\"but1\" value=\"Continue Shopping\"/></a>\n");
      out.write("                                                                          <form>     <a href=\"userinfoo.jsp\"><input type=\"button\" name =\"button\"class=\"button green\" value=\"Buy\"/></a></form>\n");
      out.write("           \n");
      out.write("         ");

        // if(request.getParameter("but1")!=null)
          //               {
            // response.sendRedirect("index.jsp");
        //}
                 
 //if(request.getParameter("button")!=null)
//{
  //  session.setAttribute("total",sum1);
 //response.sendRedirect("userinfoo.jsp");
//}                        
          
          }
         
          else
         {
             
      out.write("\n");
      out.write("             <form action=\"index.jsp\"> \n");
      out.write("                                                                               &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    \n");
      out.write("                                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                                          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                                         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                                         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                                         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                                         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                                          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                                          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"submit\" class=\"button green\" name=\"but5\" value=\"Continue Shopping\"/>\n");
      out.write("             \n");
      out.write("                                                                  <a title=\"Catalog\" id=\"modal_trigger\" href=\"#modal\" >    <input type=\"submit\" class=\"button green\" name=\"but2\" value=\"Buy these Items\"/></a></form>\n");
      out.write("                                                                           \n");
      out.write("                                                                  ");
 }

      out.write("                                                                             \n");
      out.write("                                               <!-- these are imp div tag -->\n");
      out.write("                                               \n");
      out.write("                                                </div>\t<br>                                       \n");
      out.write("                                                    <!--            <div id=\"content\" style=\"background:white;height:400px\">    \n");
      out.write("\t\t\t\t\n");
      out.write("                                                <div style=\"height:140px;width:900px;background-color:whitesmoke\">\n");
      out.write("                                                    <center>\n");
      out.write("                                                        <h1>Products in Your Cart</h1><br><br></br>\n");
      out.write("                                                        <form>\n");
      out.write("                                                           \n");
      out.write("                                                        <a title=\"Catalog\" id=\"modal_trigger\" href=\"#modal\" >    <input type=\"submit\" name=\"btn2\" value=\"Please login before buying\"/></a>\n");
      out.write("                                                        </form>\n");
      out.write("                                                    </center>\n");
      out.write("                                -->                    \n");
      out.write("                                              \n");
      out.write("                                               \n");
      out.write("                         \n");
      out.write("        \n");
      out.write("        \n");
      out.write("                                               \n");
      out.write("                                               \n");
      out.write("                                               \n");
      out.write("                                               \n");
      out.write("                                               \n");
      out.write("                                               <!-- these are imp div tag -->\n");
      out.write("                                               \n");
      out.write("                                                </div>\n");
      out.write("                                        </div>\n");
      out.write("      \n");

//if(request.getParameter("button")!=null)
//{
  //  session.setAttribute("total",sum1);
 //response.sendRedirect("userinfoo.jsp");
//}        

      out.write("\n");
      out.write("\t\n");
      out.write("                                                              \n");
      out.write("\t\t\t\t\t\t\t\t<!-- END Scroll Pane -->\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("                                          \n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("                                 <div id=\"modal\" class=\"popupContainer\" style=\"display:none;\">\n");
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
      out.write("\t\t\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("<div id=\"footer\">\n");
      out.write("\t\t<div class=\"shell\">\n");
      out.write("\t\t\t<a class=\"footer-logo\" href=\"http://css-free-templates.com/\" title=\"Home\"><img src=\"css/images/logo-footer.png\" alt=\"Logo\" /></a>\n");
      out.write("\t\t\t<p id=\"bottom-nav\"><a title=\"Home\" href=\"#\">Home</a><a title=\"About Us\" href=\"#\">About Us</a></p>\n");
      out.write("\t\t\t<div class=\"cl\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
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
      out.write("       \n");
      out.write("       \n");
      out.write("                           \n");
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
