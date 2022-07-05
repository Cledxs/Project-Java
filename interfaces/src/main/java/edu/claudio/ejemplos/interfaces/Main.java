
package edu.claudio.ejemplos.interfaces;

public class Main {
    
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(17);
        System.out.println("El area del cuadrado es: "+cuadrado.calcularArea());
        System.out.println("El perimetro del cuadrado es: "+ cuadrado.caclularPerimetro());
        
        Figura figura01=new Cuadrado(12);
        System.out.println(figura01.mostrarDatos());
        
    }
    
}
