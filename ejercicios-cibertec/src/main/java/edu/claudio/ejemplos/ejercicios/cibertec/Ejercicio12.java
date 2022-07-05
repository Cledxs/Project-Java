
package edu.claudio.ejemplos.ejercicios.cibertec;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        int cantArticulos;
        double precioUnit,comp,desc1,desc2, pago;
        
        Scanner entrada=new Scanner(System.in);
        System.out.print("Ingrese la cantidad de articulos: ");
        cantArticulos=entrada.nextInt();
        System.out.print("Ingrese el precio unitario del articulo: ");
        precioUnit= entrada.nextDouble();
        
        comp=cantArticulos*precioUnit;
        desc1=0.15*comp;
        desc2=0.15*(comp-desc1);
        pago=comp -(desc1+desc2);
        
        System.out.println("El importe de la compra es: "+comp);
        System.out.println("El importe del descuento es: "+(desc1+desc2));
        System.out.println("El importe a pagar es: "+pago);
        
    }
}
