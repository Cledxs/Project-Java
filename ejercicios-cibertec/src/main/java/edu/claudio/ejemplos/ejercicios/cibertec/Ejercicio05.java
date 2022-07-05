
package edu.claudio.ejemplos.ejercicios.cibertec;

import java.util.Scanner;



public class Ejercicio05 {

    public static void main(String[] args) {
        
        //INICIO
        //1.- Declaration of varible
        double soles, euros, marcos, dolares;
        //2.- Data entry
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el dinero en soles: ");
        soles=entrada.nextFloat();
        entrada.close();
         //3.- Calculation process
        euros=(soles*1.09)/3.51;
        marcos=(soles*2.12)/3.51;
        dolares=(soles)/3.51;
        //4.- Result output
        System.out.println("El dinero en euros es: "+euros);
        System.out.println("El dinero en marcos es: "+marcos);
        System.out.println("El dinero en dolares es: "+dolares);

        //FINALL
    }

  
}
