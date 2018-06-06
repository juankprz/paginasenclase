/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicadelnegocio;

/**
 *
 * @author 1103220136
 */
public class departamento {
    private String nombredeldepartamento;
    private String nombrecapital;
    private int numeromunicipios;

    public departamento(String nombredeldepartamento, String nombrecapital, int numeromunicipios) {
        this.nombredeldepartamento = nombredeldepartamento;
        this.nombrecapital = nombrecapital;
        this.numeromunicipios = numeromunicipios;
    }

    public departamento() {
        this.nombredeldepartamento="";
        this.nombrecapital="";
        this.numeromunicipios=0;
    }

    public String getNombredeldepartamento() {
        return nombredeldepartamento;
    }

    public String getNombrecapital() {
        return nombrecapital;
    }

    public int getNumeromunicipios() {
        return numeromunicipios;
    }

    public void setNombredeldepartamento(String nombredeldepartamento) {
        this.nombredeldepartamento = nombredeldepartamento;
    }

    public void setNombrecapital(String nombrecapital) {
        this.nombrecapital = nombrecapital;
    }

    public void setNumeromunicipios(int numeromunicipios) {
        this.numeromunicipios = numeromunicipios;
    }
    
    
}
