
package edu.claudio.ejemplos.ejercicios.cibertec;

import java.util.Scanner;

public class Ejercicio22 {
    
    public static void main(String[] args) {
        int numInicio, newUnidad,newDecena,newCentena;
        
        Scanner entrada =new Scanner (System.in);
        System.out.print("Ingrese el numero de tres cifras: ");
        numInicio=entrada.nextInt(); //321
       
        newUnidad= numInicio/100;   //321/100=3
        newDecena=((numInicio%100)/10)*10; //21/10=2---->2*10=20
        newCentena=((numInicio%100)%10)*100; //21%10=1----->1*100=100
        
        System.out.println("El numero invertido es: "+ (newCentena+newDecena+newUnidad));
    }
}
