 
<%@page import="java.sql.ResultSet"%>
<%@page import="java.beans.Statement"%>
<%@page import="java.sql.Connection"%>
<%
       
        if (request.getParameter("but")!=null)
                
                               
                                  {
                                  
            Connection con12;
        Statement stmt12;
        ResultSet rss;
        String id11="";
        int idd12;
        int r=0;
        
        String name1 = rs.getString(2);
        String prize = rs.getString(7);
 try
                               {
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    con=DriverManager.getConnection("jdbc:odbc:project");
    stmt12=con.createStatement();
    rss=stmt12.executeQuery("select max(id) from cart");
    if(rss.next())
               {
        id11=rss.getString(1);
    }
    idd12=Integer.parseInt(id11);
    
 stmt12.executeUpdate("insert into cart values("+(idd12+1)+",'"+name1+"','"+prize+"',2)");
           out.print("insertion done");
           
           response.sendRedirect("index.jsp");
   
   %>