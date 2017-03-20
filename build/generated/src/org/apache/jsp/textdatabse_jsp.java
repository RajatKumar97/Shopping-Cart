package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class textdatabse_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <body>\n");
      out.write("        <form>\n");
      out.write("            <input type=\"text\" name=\"t1\" value=\"\"/>\n");
      out.write("                        <br>\n");
      out.write("            \n");
      out.write("            <input type=\"password\" name=\"t2\" value=\"\"/><br>\n");
      out.write("           \n");
      out.write("           <input type=\"Submit\" name=\"t3\" value=\"GoTo\"/>\n");
      out.write("            <a href=\"#\" class=\"btn btn_red\" name=\"t3\">Login</a></div>\n");
      out.write("            \n");
      out.write("            <input type=\"submit\" name=\"t6\" value=\"check\"/>\n");
      out.write("        </form>\n");
      out.write("        ");

       
        if (request.getParameter("t3")!=null)
                
                               {
            Connection con;
        Statement stmt;
        ResultSet rs;
          ResultSet rs2;
        String id="";
        int idd;
 try
                               {
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    con=DriverManager.getConnection("jdbc:odbc:project");
    stmt=con.createStatement();
  // rs=stmt.executeQuery("select name into try from cart ");
      stmt.executeUpdate("insert into try (name) select name from cart  ");
    // stmt.executeUpdate("insert into try (prizee) values ('123')");
   // stmt.executeUpdate("insert into try (name) select name from cart  ");
   //  stmt.executeUpdate("insert into try (prize) values ('123')   ");
     
    //rs=stmt.executeQuery("select * from cart");
             //  rs1=smt.executeQuery("Select sum(prize) from cart"); 
                  
               out.print("insertion done");
                               
            // while(rs.next())
              //                 {

  // stmt.executeUpdate("insert into login values('3213','"+request.getParameter("t1")+"','"+rs.getString(2) +"')");
          // out.print("insertion done");
           //out.print(rs.getString(2));
   //response.sendRedirect("index.jsp");+
    
//}
             
       
    
      out.write("\n");
      out.write("   \n");
      out.write("    \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    ");

      // }
      }
        catch(Exception ex)
        {
         out.println(ex.getMessage());   
        }                   
                                      
                 }      
        
      out.write("\n");
      out.write("        ");

        if(request.getParameter("t6")!=null)
                       {
            Connection con;
        Statement stmt;
        ResultSet rs;
 try
                               {
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    con=DriverManager.getConnection("jdbc:odbc:project");
    stmt=con.createStatement();
   rs=stmt.executeQuery("select * from image where id=1");
      if(rs.next())
                   {
        
      out.write("<img src=\"");
      out.print(rs.getString(3));
      out.write("\"/>\n");
      out.write("      ");

      }
    
}
        catch(Exception ex)
        {
         out.println(ex.getMessage());   
        }                   
                }
        

      out.write("\n");
      out.write("\n");
      out.write("        ");

                                                                                   ResultSet rs=null;
                                                                                  String in="";
                                                                                  if(request.getParameter("q")!=null)
                                                                                                                                                      {
                                                                                in=request.getParameter("q");
                                                                                  
                                                                                  }                                                                                                       
     
                                                                                  
           Connection con;
        Statement stmt;
      
 try
                               {
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    con=DriverManager.getConnection("jdbc:odbc:project");
    stmt=con.createStatement();
   rs=stmt.executeQuery("select * from login ");
   
   if(rs.next())
                   {
        
      out.write("\n");
      out.write("        ");

                                                                           }
    
                                                                      }

                                                             catch(Exception ex)
                                                                        {
                                                                             out.println(ex.getMessage());   
                                                                                 }                   
               
        
                                                                                          
      out.write("\n");
      out.write("                                                                                          \n");
      out.write("                                                                                          ");
      out.print(rs.getString(2));
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("       ");
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
