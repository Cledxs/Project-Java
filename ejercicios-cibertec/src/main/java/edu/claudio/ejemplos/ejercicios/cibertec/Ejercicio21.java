/*
Dado un número natural de cinco cifras, diseñe un algoritmo que 
elimine la cifra central. Por ejemplo, si se ingresa el número 12345, 
el algoritmo deberá eliminar la cifra 3, con lo que el nuevo número es 1245. 
*/
package edu.claudio.ejemplos.ejercicios.cibertec;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
                //INICIO
        //1.- Declaration of varible
        int numInicio,u,d,c,uM;
        //2.- Data entry
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese el número de cinco cifras: ");
        numInicio=entrada.nextInt();
        //3.- Calculation process
        uM= (numInicio/10000)*1000; //52312/10000=5-->5*1000=5000
        d=((numInicio%10000)/1000)*100;    //52312%10000=2312/1000=2--->2*100=200
        c = ((numInicio%10000%1000%100)/10)*10;  //52312%10000=2312%1000=312%100=12/10=1---->1*10=10
        u= numInicio%10000%1000%100%10;
        
        //4.- Result output
        System.out.println("El nuevo numero es: "+(uM+d+c+u));
        //FINALL    
    }

}
