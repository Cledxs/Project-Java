
package edu.claudio.ejemplos.poo.abstraccion;

public class Main {
    
    public static void main(String[] args) {
        
        Cuadrado cuadrado=new Cuadrado(12, "Cuadrado", "Rojo");
        cuadrado.mostrarRasultados();
        System.out.println("El area del cuadrado es: "+cuadrado.calcularArea());
        System.out.println(" ");
        
        Circulo circulo = new Circulo(11, "circulo", "Azul");
        circulo.mostrarRasultados();
        System.out.println("El area del circulo es: "+ circulo.calcularArea());
        
    }
    
}
