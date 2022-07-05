

package edu.claudio.ejemplos.estructurasrepetitivas;

import java.util.Scanner;



public class Ejemplo01 {

    public static void main(String[] args) {
    //Programar una rutina que cuente hasta 10.
     int numero;
     Scanner entrada=new Scanner (System.in);
    // System.out.println("Ingrese un numero: ");
    // numero=entrada.nextInt();
    
    /*while(numero<0){
        System.out.println("Numero invalido, ingrese de nuevo");  
        numero=entrada.nextInt();
    }
        System.out.println("Numero valido puede continuar");
   
     */
    
    
    
    
    do{
        System.out.print("Ingrese un numero positivo: ");
        numero=entrada.nextInt();
        
    }while(numero<0);
    
    for(int i=1;i<=numero; i++){
        if(i==5){
            continue;
        }        
        System.out.println(i);

        
    }
    }
}
