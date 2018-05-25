
<%@page import="EDU.CECAR.LOGICADELNEGOCIO.EstructuraPagina"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<%! EstructuraPagina est = new EstructuraPagina();%>
<html>
    <head>
        <title>Ejemplo JSP</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
        <link href="CSS/estilos.css" rel="stylesheet" type="text/css"/>
    </head>
    <body> 
        <%= est.dibujarEncabezado()%> 
        <%= est.DibujarCuerpo()%>  
        <%= est.DibujarPie()%> 
    </body>
</html>
