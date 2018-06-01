/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EDU.CECAR.LOGICADELNEGOCIO;

/**
 *
 * @author 1103220136
 */
public class fraccionario {
   
    private int numerador;
     private int denominador;

    public fraccionario(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public fraccionario() {
        this.numerador=0;
        this.denominador=1;
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    public fraccionario sumarfraccionario(fraccionario f1){
        fraccionario r=null;
       return r;
       
    }
     
}
