          <%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
          Connection con1111;
        Statement stmt1111;
        //ResultSet rs1111;
        String id11="";
         int idd11;
        try
                               {
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    con1111=DriverManager.getConnection("jdbc:odbc:project");
    stmt1111=con1111.createStatement();
        
//String id = rs.getString(1);
stmt1111.executeUpdate("delete  from ordr  where OrderNo ='"+request.getParameter("q")+"' ");
  out.print("deletion donee cart");
  response.sendRedirect("aprint.jsp");
      
  
     }
                               
catch(Exception ex)
{

out.println(ex.getMessage());
}       
%> 
