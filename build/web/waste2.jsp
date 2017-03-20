 <%
          Connection con111;
        Statement stmt111;
        ResultSet rs111;
        String id14="";
         int idd15;
        try
                               {
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    con111=DriverManager.getConnection("jdbc:odbc:project");
    stmt111=con111.createStatement();
        if (request.getParameter("del1")!=null)
                
                               {
String id = rs.getString(1);
stmt111.executeUpdate("delete * from cart where id = '"+id+"' ");
     }
                               }
catch(Exception ex)
{

out.println(ex.getMessage());
}       
%>       