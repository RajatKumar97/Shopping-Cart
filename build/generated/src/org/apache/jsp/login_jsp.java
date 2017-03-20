package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<title>Popup Login and Register</title>\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.11.0.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.leanModal.min.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css\" />\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css/styles.css\" />\n");
      out.write("\n");
      out.write("<body>\n");

        if(request.getParameter("t3")!=null)
                       {
             Connection con1;
         Statement stmt1;
        ResultSet rs1;
 try
                               {
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    con1=DriverManager.getConnection("jdbc:odbc:project");
      stmt1=con1.createStatement();
   rs1=stmt1.executeQuery("select * from register where emaill ='"+request.getParameter("c1")+"' and passwordd='"+request.getParameter("c2")+"' ");
      if(rs1.next())
                   {
        out.print("selection done");
       //    session.setAttribute("email",request.getParameter("c11"));
      response.sendRedirect("index.jsp");
      }
    
}
        catch(Exception ex)
        {
         out.println(ex.getMessage());   
        }                   
                }
        

      out.write("\n");
      out.write("\t<a id=\"modal_trigger\" href=\"#modal\" >Click here to Login or register</a>\n");
      out.write("\n");
      out.write("\t     <div id=\"modal\" class=\"popupContainer\" style=\"display:none;\">\n");
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
      out.write("\t\t\t\t\t\t<span class=\"icon\"><i class=\"fa fa-facebook\"></i></span>\n");
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
      out.write("\t\t\t\t\t<input type=\"text\" name=\"c1\"/>\n");
      out.write("\t\t\t\t\t<br />\n");
      out.write("\n");
      out.write("\t\t\t\t\t<label>Password</label>\n");
      out.write("\t\t\t\t\t<input type=\"password\"  name=\"c2\"/>\n");
      out.write("\t\t\t\t\t<br />\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"checkbox\">\n");
      out.write("\t\t\t\t\t\t<input id=\"remember\" type=\"checkbox\" />\n");
      out.write("\t\t\t\t\t\t<label for=\"remember\">Remember me on this computer</label>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"action_btns\">\n");
      out.write("\t\t\t\t\t\t<div class=\"one_half\"><a href=\"#\" class=\"btn back_btn\"><i class=\"fa fa-angle-double-left\"></i> Back</a></div>\n");
      out.write("                                               <div> <form>\t<input style=\"width: 150px; height: 35px\"type=\"submit\" class=\"button red\" name=\"t3\" value=\"Login\"/> </form>   </div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\n");
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
