
package edu.claudio.ejemplos.ejercicios.cibertec;

import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {
        
        //INICIO
        //1.- Declaration of varibles
        double capacidad;
        //2.- Data entry
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la capacidad del disco duro en gigabytes: ");
        capacidad=entrada.nextDouble();
        //3.- Calculation process
        
        //4.- Result output
        System.out.println("La capacidad en megabytes es: " + megabytes(capacidad));
        System.out.println("La capacidad en kilobytes es: "+ kilobytes(capacidad));
        System.out.println("La capacidad en bytes es: "+ bytes(capacidad));

        //FINALL
    }
    public static double megabytes(double capacidad){
        return capacidad*1024;
    }
    public static double kilobytes(double capacidad){
        return capacidad*1024*1024;
    }
    public static double bytes(double capacidad){
        return capacidad*1024*1024*1024;
    }
  
}
