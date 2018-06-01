<%-- 
    Document   : procesar2
    Created on : 1/06/2018, 10:28:49 AM
    Author     : 1103220136
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
            int dato = Integer.parseInt(request.getParameter("dato"));
            if (dato % 2 == 0) {
                response.sendRedirect("../par.html");
            } else {
                response.sendRedirect("../impar.html");
            }

        %>
    </body>
</html>
