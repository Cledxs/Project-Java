
package Binarios;

import java.io.Serializable;

public class Personas implements Serializable{
    private String nombre;
    private int edad;

    public Personas(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+edad);
    }
    
    
    
}
