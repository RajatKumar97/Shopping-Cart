<% 
                                                if(request.getParameter("logout")!=null)
                                                                                                       {
                                                    session.removeAttribute("email");
                                                    response.sendRedirect("index.jsp");
                                                }
                                        }
										%>
										
										
										// autoincrement of a number 
										
										if(request.getParameter("c4").equals(request.getParameter("c5")))
                               {
           rs11=stmt11.executeQuery("select max(id) from register");
           if(rs11.next())
               {
         id1=rs11.getString(1);
    }
    idd1=Integer.parseInt(id1);
    
    stmt11.executeUpdate("insert into register values("+(idd1+1)+",'"+request.getParameter("c3")+"','"+request.getParameter("c4")+"','"+request.getParameter("c5")+"','"+request.getParameter("Security Question")+"','"+request.getParameter("c7")+"')");                                                      
            out.print("insertion done");
			
			/********************/
			
			