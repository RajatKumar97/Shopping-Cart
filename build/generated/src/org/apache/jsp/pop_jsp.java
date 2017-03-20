package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pop_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <script src=\"js/jquery-1.3.2.js\" type=\"text/javascript\"></script> \n");
      out.write("        <title>Javascript/Jquery Sliding Popup- AnyForum</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        /* Style for overlay and box */\n");
      out.write("        .overlay{\n");
      out.write("            background:transparent url(images/overlay.png) repeat top left;\n");
      out.write("            position:fixed;\n");
      out.write("            top:0px;\n");
      out.write("            bottom:0px;\n");
      out.write("            left:0px;\n");
      out.write("            right:0px;\n");
      out.write("            z-index:100;\n");
      out.write("        }\n");
      out.write("        .box{\n");
      out.write("            position:fixed;\n");
      out.write("            top:-200px;\n");
      out.write("            left:30%;\n");
      out.write("            right:30%;\n");
      out.write("            background-color:#fff;\n");
      out.write("            color:#7F7F7F;\n");
      out.write("            padding:20px;\n");
      out.write("            border:2px solid #ccc;\n");
      out.write("            -moz-border-radius: 20px;\n");
      out.write("            -webkit-border-radius:20px;\n");
      out.write("            -khtml-border-radius:20px;\n");
      out.write("            -moz-box-shadow: 0 1px 5px #333;\n");
      out.write("            -webkit-box-shadow: 0 1px 5px #333;\n");
      out.write("            z-index:101;\n");
      out.write("        }\n");
      out.write("        .box h1{\n");
      out.write("            border-bottom: 1px dashed #7F7F7F;\n");
      out.write("            margin:-20px -20px 0px -20px;\n");
      out.write("            padding:10px;\n");
      out.write("            background-color:#ff5500;\n");
      out.write("            color:#fff;\n");
      out.write("            -moz-border-radius:20px 20px 0px 0px;\n");
      out.write("            -webkit-border-top-left-radius: 20px;\n");
      out.write("            -webkit-border-top-right-radius: 20px;\n");
      out.write("            -khtml-border-top-left-radius: 20px;\n");
      out.write("            -khtml-border-top-right-radius: 20px;\n");
      out.write("\t\ttext-align:center;\n");
      out.write("        }\n");
      out.write("        a.boxclose{\n");
      out.write("            float:right;\n");
      out.write("            width:26px;\n");
      out.write("            height:26px;\n");
      out.write("            background:transparent url(images/cancel.png) repeat top left;\n");
      out.write("            margin-top:-30px;\n");
      out.write("            margin-right:-30px;\n");
      out.write("            cursor:pointer;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"content\">\n");
      out.write("            <!-- The activator -->\n");
      out.write("            <a class=\"activator\" style=\"cursor:pointer;\" id=\"activator\">Click me to popup</a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <!-- The overlay and the box -->\n");
      out.write("        <div class=\"overlay\" id=\"overlay\" style=\"display:none;\"></div>\n");
      out.write("        <div class=\"box\" id=\"box\">\n");
      out.write("            <a class=\"boxclose\" id=\"boxclose\"></a>\n");
      out.write("            <h1>Important message- anyforum.in</h1>\n");
      out.write("            <p>\n");
      out.write("                Type your meassage Here.\n");
      out.write("                Rajat SHarma\n");
      out.write("                To close this click on cross button.\n");
      out.write("            </p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- The JavaScript -->\n");
      out.write("        <script type=\"text/javascript\" src=\"jquery-1.3.2.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(function() {\n");
      out.write("                $('#activator').click(function(){\n");
      out.write("                    $('#overlay').fadeIn('fast',function(){\n");
      out.write("                        $('#box').animate({'top':'160px'},500);\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("                $('#boxclose').click(function(){\n");
      out.write("                    $('#box').animate({'top':'-200px'},500,function(){\n");
      out.write("                        $('#overlay').fadeOut('fast');\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("\n");
      out.write("            });\n");
      out.write("        </script>\n");
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
