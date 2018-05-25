<%-- 
    Document   : procesar1
    Created on : 25/05/2018, 11:04:55 AM
    Author     : 1103220136
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
       String titulo[]=request.getParameterValues("titulacion");
    
       for(int i=0;i<titulo.length;i++){
           out.println("<li>"+titulo[i]+"</li>");
       }
    %>    
</html>
