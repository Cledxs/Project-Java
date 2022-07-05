
package edu.claudio.ejemplos.ejercicios.cibertec;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
         //INICIO
        //1.- Declaration of varible
        int minutos,segundos,centesimasSegundo; 
        double tiempoTotal, distancia,velocidad;
        //2.- Data entry
        Scanner entrada =new Scanner(System.in);
        System.out.println("Ingrese el tiempo y el espacio recorrido de un atleta");
        System.out.println(" ");
        System.out.println("Ingrese el tiempo en minutos: ");
        minutos=entrada.nextInt();
        System.out.println("Ingrese el tiempo en segundos: ");
        segundos=entrada.nextInt();
        System.out.println("Ingrese el tiempo en centesimas de segundo: ");
        centesimasSegundo=entrada.nextInt();
        System.out.println("Ingrese el espacio recorrido en metros: ");
        distancia=entrada.nextFloat();
        entrada.close();

        //3.- Calculation process
        tiempoTotal=minHora(minutos)+segHora(segundos)+centHora(centesimasSegundo);
        distancia=distKilom(distancia);
        velocidad= distancia/tiempoTotal;
        //4.- Result output
        System.out.println(" ");
        System.out.println("El tiempo total en horas es: "+ tiempoTotal+"Hr");
        System.out.println("La distancia en kilometros es: "+ distancia+"km" );
        System.out.println("La velocidad del atleta en mencion es: "+velocidad+"km/Hr");
        //FINALL   
        
    }
    public static double minHora(int minutos){
        return (double)minutos/60;
    }
    
    public static double segHora(int segundos){
        return (double)segundos/3600;
    }
    public static double centHora(int centesimasSegundo){
        return (double)centesimasSegundo/360000;
    }
    public static double distKilom(double distancia){
        return distancia/1000;
    }

}
