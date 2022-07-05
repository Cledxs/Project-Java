
package edu.claudio.ejemplos.ejercicios.cibertec;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        double km, pies, millas,distMetros,distYardas;
        
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese los tramos recorrridos: ");
        System.out.println("Ingrese el primer tramo en km: ");
        km=entrada.nextDouble();
        System.out.println("Ingrese el segundo tramo en pies: ");
        pies=entrada.nextDouble();
        System.out.println("Ingere el tercer tramo en millas: ");
        millas=entrada.nextDouble();
        entrada.close();
        System.out.println("");
        
        distMetros = km*1000+(pies/3.2808)+millas*1609;
        distYardas = (distMetros*3.2808)/3;
        
        System.out.println("La distancia total en metros es: "+distMetros);
        System.out.println("La distancia total en yardas es: "+distYardas);
    }
    
}
