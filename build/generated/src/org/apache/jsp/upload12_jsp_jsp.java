package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;
import java.io.*;

public final class upload12_jsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"login.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\n");
      out.write("        <script type=\"text/javascript\" src=\"ckeditor/ckeditor.js\"></script>\n");
      out.write("<script src=\"ckeditor/samples/sample.js\" type=\"text/javascript\"></script>\n");
      out.write("<link href=\"ckeditor/samples/sample.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("         \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    \n");
      out.write("        <div class=\"main\">\n");
      out.write("            <div id=\"logo\">\n");
      out.write("                <a href=\"main.jsp\" style=\"float: left;\"><img alt=\"\"  src=\"img/1_1.jpg\" style=\"float: left;\"/><strong style=\"color:dodgerblue;\">Admin Panel</strong></a>\n");
      out.write("                <form action=\"logout.jsp\" style=\"float: right;\">\n");
      out.write("                    <input type=\"submit\" name=\"submit\" value=\"logout\" class=\"button\"/>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"header\">\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/header1.jsp", out, true);
      out.write("\n");
      out.write("            </div>\n");
      out.write("             <div class=\"content\">\n");
      out.write("                <center>\n");
      out.write("                    <h3>Videos Upload</h3>\n");
      out.write("                    ");
out.print("You have successfully upload");
      out.write("\n");
      out.write("                </center>\n");
      out.write("             </div>\n");
      out.write("        \n");
      out.write("        ");

String fn="";
               String saveFile = "";
               String ad="";
      String contentType = request.getContentType();
      if ((contentType != null) && (contentType.indexOf("multipart/form-data") >= 0)) {
            DataInputStream in = new DataInputStream(request.getInputStream());
            int formDataLength = request.getContentLength();
            byte dataBytes[] = new byte[formDataLength];
            int byteRead = 0;
            int totalBytesRead = 0;
            while (totalBytesRead < formDataLength) {
                  byteRead = in.read(dataBytes, totalBytesRead, formDataLength);
                  totalBytesRead += byteRead;
            }
            String file = new String(dataBytes);
            saveFile = file.substring(file.indexOf("filename=\"") + 10);
            saveFile = saveFile.substring(0, saveFile.indexOf("\n"));
            saveFile = saveFile.substring(saveFile.lastIndexOf("\\") + 1, saveFile.indexOf("\""));
            int lastIndex = contentType.lastIndexOf("=");
            String boundary = contentType.substring(lastIndex + 1, contentType.length());
            int pos;
            pos = file.indexOf("filename=\"");
            pos = file.indexOf("\n", pos) + 1;
            pos = file.indexOf("\n", pos) + 1;
            pos = file.indexOf("\n", pos) + 1;
            int boundaryLocation = file.indexOf(boundary, pos) - 4;
            int startPos = ((file.substring(0, pos)).getBytes()).length;
            int endPos = ((file.substring(0, boundaryLocation)).getBytes()).length;
            fn = saveFile;
            saveFile = "C:\\Users\\WORLD\\Documents\\NetBeansProjects\\javatraining\\web\\uploaded\\"+ saveFile;
           
         saveFile= saveFile.replace("\\","//");
       //   out.println(saveFile);
            File ff = new File(saveFile);
            FileOutputStream fileOut = new FileOutputStream(ff);
            fileOut.write(dataBytes, startPos, (endPos - startPos));
            fileOut.flush();
            fileOut.close();

           saveFile="uploaded/"+fn;
             Connection conn;
            Statement smt;
            ResultSet rst;
            out.print(saveFile);
            try
                    {
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
conn=DriverManager.getConnection("jdbc:odbc:project");
smt=conn.createStatement();

//smt.executeUpdate("insert into upload(id,name,uploaded)values ("+session.getAttribute("id")+",'"+session.getAttribute("name")+"','"+saveFile+"')");


            smt.executeUpdate("INSERT INTO image values (1,'we','rrt','rtrt','rtr','fgfgf','rtrt','rtrrt','rtrt','sdfsd','sdfsdf','sdfdf','ddsfsd','ddfsd','dfdsf','dfsdf','dfdssf','dfdsfs','dssdfsd','dfdfds','dsfsdf','dfdfsd','dfsdfsd','"+session.getAttribute("pic1") +"')");
  //          PreparedStatement statement = con.prepareStatement(sql);
           
           // statement.setString(1, session.getAttribute("title").toString());
            //statement.setString(2, "videos//"+fn);

            //int row = statement.executeUpdate();
           // if (row > 0) {
             //   System.out.println("A contact was inserted with photo image.");
            //}
   

                                          }
            catch(Exception ex)
                    {
            out.println(ex.getMessage());
            }



}

     
      out.write(" \n");
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
