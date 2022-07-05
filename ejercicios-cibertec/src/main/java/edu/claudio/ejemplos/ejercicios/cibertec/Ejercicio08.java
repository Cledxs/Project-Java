/*
En países de habla inglesa, es común dar la estatura de una persona como la suma
de una cantidad entera de pies más una cantidad entera de pulgadas. 
Así, la estatura de una persona podría ser 3' 2''. Diseñe un programa que 
determine la estatura de una persona en metros conociendo su estatura en el
formato inglés. Considere que: 
• 1 pie = 12 pulgadas  
• 1 pulgada = 2.54 centímetros  
• 1 metro = 100 centímetros
Algoritmo:
        //INICIO
        //1.- Declaration of varible
        //2.- Data entry
        //3.- Calculation process
        //4.- Result output
        //FINALL
*/


package edu.claudio.ejemplos.ejercicios.cibertec;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        
        //INICIO
        //1.- Declaration of varible
        int estPulgadas,estPies;
        //2.- Data entry
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese la estatura de una persona en el formato ingles: ");
        System.out.print("Estatura en pies: ");
        estPies=entrada.nextInt();      
        System.out.print("Estatura en pulgadas: ");
        estPulgadas=entrada.nextInt();
        entrada.close();  
        System.out.println("La estatura total es:"+estPies+"'"+estPulgadas+"''");
        
        //3.- Calculation process
        piesMetros(estPies);
        pulgadasMetros(estPulgadas);
        //4.- Result output
        System.out.println("La estatura total en metros es: "+(piesMetros(estPies)+pulgadasMetros(estPulgadas)));
 
        //FINALL
    }
    
    public static double piesMetros(int estPies){
        return (estPies*12*2.54)/100;
    }
    public static double pulgadasMetros(int estPulgadas){
        return (estPulgadas*2.54)/100;
    }
    
}
