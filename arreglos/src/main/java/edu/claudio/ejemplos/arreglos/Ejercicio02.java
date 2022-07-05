/*
Leer los datos correspondientes a dos tablas de 12 elementos numeros
cada uno , y mezclarlos en una tercera de la forma: 
3 de la tala A, 3 de la tabla B, 3 de la tabla A, asi sucesivamente
*/
package edu.claudio.ejemplos.arreglos;

public class Ejercicio02 {
    public static void main(String[] args) {
       int a[]={1,3,5,7,9,11,13,15,17,19,21,23,25,27,29};
       int b[]={2,4,6,8,10,12,14,16,18,20,22,24,26,28,30};
       int c[]=new int[a.length+b.length];
       
       int i =0;
       int j=0;
       while(i<15){
           for (int k=0;k<3;k++){
               c[j]= a[i+k];
               j++;               
           }
           
           for (int k =0; k<3;k++){
               c[j]=b[i+k];
               j++;    
           }
           i+=3;
       }
       
        for (i=0;i<c.length;i++){
            System.out.println(c[i]);
        }
    }
    
}
