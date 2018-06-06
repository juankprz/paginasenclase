<%-- 
    Document   : consulta
    Created on : 6/06/2018, 05:34:43 PM
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
        <form action="consulta.jsp" method="POST">
            <label> Ingrese nombre de departamento</label>
            <br/>
            <input type="text" name="nombreDepartamento">
            <br/>
            <input type="submit" value="Consultar">
        </form>
    </body>
</html>
