
package edu.claudio.ejemplos.ejercicios.cibertec;

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
       //INICIO
       //1.-Declaracion de variables 
       double gradosCelsius;
       
       //2.- Entrada de datos
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese la tempratura en centigrados(°C) que desee convertir");
        gradosCelsius=entrada.nextDouble();
        entrada.close();
       
       //3.- Proceso de calculos
       //4.-Salida de resultados
        System.out.println("La temperatura en grados Farenheit es: "+gradosFarenheit(gradosCelsius));
        System.out.println("La temperatura en grados Kelvin es: "+gradosKelvin(gradosCelsius));
        System.out.println("La temperatura en grados Rankine es: "+gradosRankine(gradosCelsius));
       //FIN
        
        
    }
    
    public static double gradosFarenheit(double C){
        return C*((double)9/5)+32;
        
    }

    public static double gradosKelvin(double C){
        return C+273;
    }

    public static double gradosRankine(double C){
        return C*((double)9/5)+491.67;
    } 
}
