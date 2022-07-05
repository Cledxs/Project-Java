/*
Leer los datos correspondientes a dos tablas y combinarlas
en una tercerna en orden alternado
*/

package edu.claudio.ejemplos.arreglos;


public class Ejercicio01 {
    
    public static void main(String[] args) {
       int a[]={1,3,5,7,9,11,13,15,17,19,21,23,25,27,29};
       int b[]={2,4,6,8,10,12,14,16,18,20,22,24,26,28,30};
       int c[]=new int[a.length+b.length];
       int j=0;
       for(int i=0;i<15;i++){
        c[j]= a[i];
        j++;
        c[j]= b[i];
        j++;
       }
       
       for(int numeros:c){
           System.out.println(numeros);
       }
       
       
       
       
       
    }
    
}
