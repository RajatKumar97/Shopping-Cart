<%--
    Document   : upload
    Created on : Nov 18, 2013, 4:53:32 PM
    Author     : sharan
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="login.css" rel="stylesheet" type="text/css" media="screen" />
        <script type="text/javascript" src="ckeditor/ckeditor.js"></script>
<script src="ckeditor/samples/sample.js" type="text/javascript"></script>
<link href="ckeditor/samples/sample.css" rel="stylesheet" type="text/css" />
         <%@ page import="java.io.*"%>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    
        <%
String fn="";
               String saveFile = "";
               String ad="";
               out.println("helloo00");
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


            smt.executeUpdate("update image set image1='"+saveFile+"' where id=100");
            response.sendRedirect("insertdetails.jsp");
           
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

     %> 
    </body>
</html>
