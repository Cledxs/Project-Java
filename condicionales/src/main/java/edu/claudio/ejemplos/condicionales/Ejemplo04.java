
package edu.claudio.ejemplos.condicionales;

import java.util.Scanner;

public class Ejemplo04 {
    public static void main(String[] args) {
        //INICIO
        //1.- Declaration of varible
        int numero;
        //2.- Data entry
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 7");
        numero=entrada.nextInt();
        entrada.close();
        //3.- Calculation process
        //4.- Result output
        switch(numero){
            case 1: System.out.println("Lunes");
                    System.out.println("Inicio de semana");break;
            case 2: System.out.println("Martes");break;                
            case 3: System.out.println("Miercoles");break;
            case 4: System.out.println("Jueves");break;                
            case 5: System.out.println("Vierns");break;                
            case 6: System.out.println("Sabado");break;
            case 7: System.out.println("Domingo");break;
            default:System.out.println("El numero ingresado no es valido");break;
              
        }
        
        //FINALL        
    }
    
}
