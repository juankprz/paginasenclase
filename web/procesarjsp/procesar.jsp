<%-- 
    Document   : procesar
    Created on : 25/05/2018, 10:31:59 AM
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
     out.println("mi nombre es :"+request.getParameter("nombre"));
    
    %>
</html>
