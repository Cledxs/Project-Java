
package edu.claudio.ejemplos.ejercicios.cibertec;

import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      double S;
      
        System.out.println("Ingrese el angulo que desea convertir");
        S=entrada.nextInt();
        entrada.close();
      
        System.out.println("El angulo en centesimales es: "+centesimales(S));
        System.out.println("El angulo en radianes es: "+ radianes(S));
      
    }
    
    public static double centesimales(double S){
        return S*((double)200/(double)180);
    }
    
    public static double radianes (double S){
        return (3.1416/180)*S;
    }
}
