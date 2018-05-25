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
        if(request.getParameter("nombre")==null || request.getParameter("nombre").isEmpty()){
             response.sendRedirect("../formulario.html");
        }else{
            out.println("mi nombre es :"+request.getParameter("nombre"));
        }
     
    
    %>
</html>
