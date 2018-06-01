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
public class Municipios {
     private String nombre;
       private int cantidadHabitantes;
       private float extension;

    public Municipios(String nombre, int cantidadHabitantes, float extension) {
        this.nombre = nombre;
        this.cantidadHabitantes = cantidadHabitantes;
        this.extension = extension;
    }

       
    public Municipios() {
        this.nombre="";
        this.cantidadHabitantes=0;
        this.extension=0.0F;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadHabitantes() {
        return cantidadHabitantes;
    }

    public float getExtension() {
        return extension;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidadHabitantes(int cantidadHabitantes) {
        this.cantidadHabitantes = cantidadHabitantes;
    }

    public void setExtension(float extension) {
        this.extension = extension;
    }
    
       
}
