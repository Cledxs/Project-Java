
package edu.claudio.ejemplos.poo.alcamce;

public class Empleado {
    protected String nombre;
    String cargo;
    int horaTrabajada;
    double tarifaHora;
   
    
    
    
    double calcularSueldo(){
       return horaTrabajada*tarifaHora;
        
    }
            
}
