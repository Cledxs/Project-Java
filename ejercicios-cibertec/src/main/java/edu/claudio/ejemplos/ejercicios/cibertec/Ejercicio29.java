/*
Dada una cantidad entera de segundos,exprese la salida en el formato:
HH:MM:SS. Ejemplo Ingresan 14600 y debe imprimir 4 Horas, 3 Minutos 
y 20 Segundos.
*/
package edu.claudio.ejemplos.ejercicios.cibertec;

import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        int timeSeg,h,m,s;
        
        Scanner entrada=new Scanner (System.in);
        System.out.println("Ingres la cantidad de segundos totales: ");
        timeSeg=entrada.nextInt();
        entrada.close();
        
        h=timeSeg/3600;
        m=(timeSeg%3600)/60;
        s= timeSeg%3600%60;
        
        System.out.println("La hora es: "+h+":"+m+":"+s);
    }
}
