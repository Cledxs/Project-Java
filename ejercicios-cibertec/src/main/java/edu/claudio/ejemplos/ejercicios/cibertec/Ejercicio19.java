
package edu.claudio.ejemplos.ejercicios.cibertec;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        int numeroInicial,c,u;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero de cuatro cifras: ");
        numeroInicial=entrada.nextInt();
        
       c= (numeroInicial/1000)*10;
       u=(((numeroInicial%1000)%100)%10);
       
        System.out.println("El nuevo numero formado es: "+ (c+u));
    }
}
