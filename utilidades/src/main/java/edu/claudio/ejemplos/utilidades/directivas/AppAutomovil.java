
package edu.claudio.ejemplos.utilidades.directivas;

public class AppAutomovil {
   
    public static void main(String[] args) {
        Automovil a01=new Automovil("kia", "Cerato", "Blanco");
        System.out.println(a01);
        
        Automovil a02=new Automovil("Hyundai", "i7", "Azul");
        System.out.println(a02);
        
        System.out.println("Se han creado: "+Automovil.getContador()+" autos");
        
        System.out.println("El concesionario es: "+Automovil.mostrarConcesionario());
        
    }
   
  
}
