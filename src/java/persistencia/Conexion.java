/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 1103220136
 */
public class Conexion {
     private static Connection cnx = null;
   public static Connection obtener() throws SQLException, ClassNotFoundException {
      if (cnx == null) {
         try {
			//Class.forName("com.mysql.jdbc.Driver"); 
            Class.forName("org.apache.derby.jdbc.ClientDriver");
			//cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/torneo", "root", "");
            cnx = DriverManager.getConnection("jdbc:derby://localhost:1527/dane", "root", "");
         } catch (SQLException ex) {
            throw new SQLException(ex);
         } catch (ClassNotFoundException ex) {
            throw new ClassCastException(ex.getMessage());
         }
      }
      return cnx;
   }
   
   
   public static void cerrar() throws SQLException {
      if (cnx != null) {
         cnx.close();
      }
   }
    
}
