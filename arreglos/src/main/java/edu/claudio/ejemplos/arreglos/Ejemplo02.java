
package edu.claudio.ejemplos.arreglos;

public class Ejemplo02 {
    public static void main(String[] args) {
         
       String [] nombres = new String[6];
       
       nombres[0]= "Claudio";
       nombres[1]="Rosa";
       nombres[2]="Ines";
       nombres[3]="Yanet";
       nombres[4]="Soledad";
       nombres[5]="Clariza";
         
           
       for(int i=(nombres.length-1); i>=0;i--){
           System.out.println("elementto de indice "+i+": " +nombres[i]);
       }
       
       int j=0;
       for (String name:nombres){
           System.out.println("Elemento con for each de indice "+j+": "+ name);
           j++;
       }
       
       
    }
 
}
