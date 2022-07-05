
package edu.claudio.ejemplos.poo.alcamce;

public class AppEmpleado {
    
    public static void main(String[] args) {
      
        Empleado e01 = new Empleado ();
        
        e01.cargo="Desarrollador";
        e01.nombre="Claudio";
        e01.horaTrabajada=400;
        e01.tarifaHora=18.5;
        
      
        
        System.out.println("El sueldo de "+e01.nombre+" es " + e01.calcularSueldo());
                
    }
    
    
    
    
}
