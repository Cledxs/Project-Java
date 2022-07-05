
package edu.claudio.ejemplos.arreglos;

import java.util.Random;





public class Ejemplo01 {
    public static void main(String[] args) {
        
       int [] numeros = new int [5];
       
        Random aleatorio = new Random();
        
        for(int i=0;i<numeros.length;i++){
         numeros[i]=(aleatorio.nextInt(20-10+1)+10);     
        }
        
        for (int i=0;i<numeros.length;i++){
            System.out.println("Elmento: "+ numeros[i]);
        }
        
        
     

    }
}
