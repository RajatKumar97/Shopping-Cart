package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PANELJQUERY_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("<title>Simple Slide Panel</title>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"jquery.js\"></script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("$(document).ready(function(){\n");
      out.write("\n");
      out.write("\t$(\".btn-slide\").click(function(){\n");
      out.write("\t\t$(\"#panel\").slideToggle(\"slow\");\n");
      out.write("\t\t$(this).toggleClass(\"active\"); return false;\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t \n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("body {\n");
      out.write("\tmargin: 0 auto;\n");
      out.write("\tpadding: 0;\n");
      out.write("\twidth: 570px;\n");
      out.write("\tfont: 75%/120% Arial, Helvetica, sans-serif;\n");
      out.write("}\n");
      out.write("a:focus {\n");
      out.write("\toutline: none;\n");
      out.write("}\n");
      out.write("#panel {\n");
      out.write("\tbackground: #754c24;\n");
      out.write("\theight: 200px;\n");
      out.write("\tdisplay: none;\n");
      out.write("}\n");
      out.write(".slide {\n");
      out.write("\tmargin: 0;\n");
      out.write("\tpadding: 0;\n");
      out.write("\tborder-top: solid 4px #422410;\n");
      out.write("\tbackground: url(images/btn-slide.gif) no-repeat center top;\n");
      out.write("}\n");
      out.write(".btn-slide {\n");
      out.write("\tbackground: url(images/white-arrow.gif) no-repeat right -50px;\n");
      out.write("\ttext-align: center;\n");
      out.write("\twidth: 144px;\n");
      out.write("\theight: 31px;\n");
      out.write("\tpadding: 10px 10px 0 0;\n");
      out.write("\tmargin: 0 auto;\n");
      out.write("\tdisplay: block;\n");
      out.write("\tfont: bold 120%/100% Arial, Helvetica, sans-serif;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("}\n");
      out.write(".active {\n");
      out.write("\tbackground-position: right 12px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div id=\"panel\">\n");
      out.write("\t<!-- you can put content here -->\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<p class=\"slide\"><a href=\"#\" class=\"btn-slide\">Slide Panel</a></p>\n");
      out.write("\n");
      out.write("</body>\n");
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
