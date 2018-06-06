<%-- 
    Document   : consulta
    Created on : 6/06/2018, 05:34:43 PM
    Author     : 1103220136
--%>

<%@page import="logicadelnegocio.departamento"%>
<%@page import="persistencia.Conexion"%>
<%@page import="persistencia.OperacionesBD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            OperacionesBD op = new OperacionesBD();
            departamento dpto= op.consultar(Conexion.obtener(), request.getParameter("nombreDepartamento"));
            out.println(dpto.getNombredeldepartamento());
            out.println(dpto.getNombrecapital());
            out.println(dpto.getNumeromunicipios());
            %>
    </body>
</html>
