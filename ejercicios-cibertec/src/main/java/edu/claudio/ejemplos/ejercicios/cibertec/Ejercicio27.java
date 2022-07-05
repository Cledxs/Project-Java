/*
Dada una cantidad de dinero en soles, diseñe un programa que descomponga dicha
cantidad en billetes de S/. 100, S/. 50, S/.10 y monedas de S/. 5, S/. 2 y S/.1. 
Así, por ejemplo, S/. 3778 puede descomponerse en 37 billetes de S/. 100, 
mas 1 billete de S/.50, mas 2 billetes de S/. 10, mas 1 moneda de S/. 5, 
mas 1 moneda de S/.2 y más 1 moneda de S/. 1. 
*/
package edu.claudio.ejemplos.ejercicios.cibertec;

import java.util.Scanner;


public class Ejercicio27 {
    
    public static void main(String[] args) {
        int dinero, b100,b50,b10,m5,m2,m1;
        
        Scanner entrada =new Scanner(System.in);
        System.out.println("Ingrese la cantidad de dinero en soles: ");
        dinero=entrada.nextInt();
        entrada.close();
        
        b100=dinero/100;
        b50=(dinero%100)/50;
        b10=(dinero%100%50)/10;
        m5=(dinero%100%50%10)/5;
        m2=(dinero%100%50%10%5)/2;
        m1=(dinero%100%50%10%5%2)/1;
        
        System.out.println("La cantidad de "+dinero+" equivale a: ");
        System.out.println(b100+" billetes de S/ 100");
        System.out.println(b50+" billetes de S/ 50");
        System.out.println(b10+" billetes de S/ 10");
        System.out.println(m5+" monedas de S/ 5");
        System.out.println(m2+" monedas de S/ 2");
        System.out.println(m1+" monedas de S/ 1");
    }
    
}
