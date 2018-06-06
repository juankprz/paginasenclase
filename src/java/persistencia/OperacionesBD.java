/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import logicadelnegocio.departamento;

/**
 *
 * @author 1103220136
 */
public class OperacionesBD {

    public boolean registrar(Connection conexion, departamento departamento) throws SQLException {

        boolean respuesta = false;
        PreparedStatement consulta;
        consulta = conexion.prepareStatement("INSERT INTO departamento(nombreDepartamento,nombreCapital,numeroMunicipios) VALUES(?, ?, ?)");
        consulta.setString(1, departamento.getNombredeldepartamento());
        consulta.setString(2, departamento.getNombrecapital());
        consulta.setInt(3, departamento.getNumeromunicipios());

        int resultado = consulta.executeUpdate();
        if (resultado > 0) {
            respuesta = true;
        }
        return respuesta;

    }

    public departamento consultar(Connection conexion, String nombre) {
        Statement s = null;
        ResultSet rs = null;
        departamento departamento = new departamento();
        try {
            s = conexion.createStatement();
            rs = s.executeQuery("SELECT * FROM departamento WHERE nombre = " + "'" + nombre + "'");
            while (rs.next()) {
                departamento.setNombredeldepartamento(rs.getString("nombreDapartamento"));
                departamento.setNombrecapital(rs.getString("nombreCapital"));
                departamento.setNumeromunicipios(rs.getInt("numeroMunicios"));
            }

        } catch (SQLException ex) {

        }

        return departamento;
    }
    /**
     * public boolean actualizar(Connection conexion, Acudiente acudiente) {
     * boolean respuesta = false; int id = acudiente.getIdentificacion(); try {
     * String sentencia = "UPDATE acudiente SET nombres=?, telefono=?,
     * direccion=?, telefonoAlternativo=? WHERE id=?"; PreparedStatement pst =
     * conexion.prepareStatement(sentencia);// con esta sentencia se insertan
     * los datos en la base de datos pst.setString(1, acudiente.getNombres());
     * pst.setString(2, acudiente.getTelefono()); pst.setString(3,
     * acudiente.getDireccion()); pst.setString(4,
     * acudiente.getTelefonoAlternativo()); pst.setInt(5,
     * acudiente.getIdentificacion()); int n = pst.executeUpdate();
     *
     * if(n > 0) { respuesta = true; } } catch (SQLException ex) {
     *
     * }
     * return respuesta; }
     *
     *
     * public boolean eliminar(Connection conexion, String id) { boolean
     * respuesta = false; try {
     *
     * String sentencia = "DELETE FROM acudiente WHERE id=?"; PreparedStatement
     * pst = conexion.prepareStatement(sentencia); pst.setString(1, id); int n =
     * pst.executeUpdate();
     *
     * if(n > 0) { respuesta = true; } } catch (SQLException ex) {
     *
     * }
     * return respuesta; }
    *
     */
}
