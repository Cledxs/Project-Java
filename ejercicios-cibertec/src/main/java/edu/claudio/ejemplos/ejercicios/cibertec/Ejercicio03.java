
package edu.claudio.ejemplos.ejercicios.cibertec;

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        
        //INICIO
        //1.- Declaration of varibles
        double pulgadas;
        //2.- Data entry
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad en pulgadas a convertir: ");
        pulgadas = entrada.nextFloat();
        entrada.close();
      
        //3.- Calculation process
        //4.- Result output
        System.out.println("La cantidad en pies es: "+ pies(pulgadas));
        System.out.println("La cantidad en yardas es: "+ yardas(pulgadas));
        System.out.println("La cantidad en centimetros es: "+ centimetros(pulgadas));
        System.out.println("La cantidad en metros es: "+ metros(pulgadas));
        
        //FINALL
     
    }
    
    public static double pies(double pulgadas){
        return pulgadas*((double)1/12);
    }
    public static double yardas(double pulgadas){
        return pulgadas*((double)1/12)*((double)1/3);
    }
    public static double centimetros(double pulgadas){
        return pulgadas*(2.54);
    }
    public static double metros(double pulgadas){
        return pulgadas*((double)2.54/100);
    }
}
