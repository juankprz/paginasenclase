
package EDU.CECAR.LOGICADELNEGOCIO;

public class EstructuraPagina {

    public String dibujarEncabezado() {
        String respuesta = "";
        respuesta = "<h1>Mi negocio </h1>";
        respuesta = respuesta.concat("<hr/>");
        respuesta = respuesta.concat("<br/>");

        return respuesta;

    }

    public String DibujarCuerpo() {
        String respuesta = "";
        respuesta = "<h3>Contenido </h3>";
        respuesta = respuesta.concat("<p>Mi primer parrafo </p>");
        respuesta = respuesta.concat("<p>Mi segundo parrafo </p>");
        respuesta = respuesta.concat("<p>Mi tercer parrafo </p>");

        return respuesta;

    }

    public String DibujarPie() {
        String respuesta = "";
        respuesta = "<p> Mi nombre juan</p>";
        respuesta = respuesta.concat("<p>e-mail:juan.perezg@cecar.edu.co </p>");

        return respuesta;

    }
}
