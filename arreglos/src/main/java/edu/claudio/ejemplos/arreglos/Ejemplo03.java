
package edu.claudio.ejemplos.arreglos;

import java.util.Scanner;

public class Ejemplo03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nElementos;
      
        System.out.println("Ingrese la cantidad de elementos del arreglo: ");
        nElementos = entrada.nextInt();
          int numeros[]=new int[nElementos];
          
          for (int i=0; i<numeros.length;i++){
              numeros[i]=(int)(Math.random()*100)+1;
          }
          
          for (int i=0; i<numeros.length;i++){
              System.out.println("Elemento: "+numeros[i]);
          }
         
        
    }
}
