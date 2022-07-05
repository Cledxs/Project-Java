
package edu.claudio.ejemplos.hilos;

public class Carrera {
    public static void main(String[] args) {
    
       Tortuga tortuga = new Tortuga();
       tortuga.start();
       
       Thread liebre = new Thread(new Liebre());
       liebre.start();
         
   
     
   
    }
}
