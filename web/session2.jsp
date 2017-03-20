<%-- 
    Document   : session2
    Created on : 25 Nov, 2015, 8:27:49 PM
    Author     : WORLD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        
String name=(String)session.getAttribute("s2");
String name1=(String)session.getAttribute("s1");
out.print(name);
out.print(name1);

%>
        <h1>Hello World!</h1>
    </body>
</html>
