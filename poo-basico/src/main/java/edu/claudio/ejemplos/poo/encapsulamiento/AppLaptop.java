
package edu.claudio.ejemplos.poo.encapsulamiento;

public class AppLaptop {
    
    public static void main(String[] args) {
        Laptop laptop01 = new Laptop ("XXXX0123", "HP", "Corei5", 5000);
        
        System.out.println("Laptop: "+laptop01.getMarca()+" "+laptop01.getModelo());
        System.out.println("El precio de la laptop es: "+ laptop01.getPrecio());
        
        laptop01.setPrecio(0);
        System.out.println("El nuevo precio es: "+laptop01.getPrecio());
      
    }
    
}
