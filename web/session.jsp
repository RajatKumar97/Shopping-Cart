<%-- 
    Document   : session
    Created on : 25 Nov, 2015, 8:25:41 PM
    Author     : WORLD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
   <% 
   int i;
   for(i=0;i<2;i++)
    {
       %>
    <form>
        
    <select name="t1">
  <option value="volvo1">Volvo</option>
  <option value="saab">Saab</option>
  <option value="mercedes">Mercedes</option>
  <option value="audi">Audi</option>
</select>
    
        
    
    <%
    if(request.getParameter("b1")!=null)
               {
        String name=request.getParameter("t1");
        String name1=request.getParameter("t1");
      //  String name11=request.getParameter("t11");
        session.setAttribute("s1", name);
        session.setAttribute("s2", name1);
        response.sendRedirect("session2.jsp");
            
    }
       } 
    
    
    %>
    <input type="text" name="t11" >
        <input type ="submit" name ="b1" value="click"> 
    </form>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
