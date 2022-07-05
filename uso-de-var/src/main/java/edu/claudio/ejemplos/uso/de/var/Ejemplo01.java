
package edu.claudio.ejemplos.uso.de.var;

public class Ejemplo01 {
    public static void main(String[] args) {
        var edad="t-re-in,ta"; // Los datos de tipo "var" tinen que inicializarse ni bien se declaren;
   
        String[] palabras=edad.split("-");
        
        System.out.println(palabras[2]);
                
                
        
    }
    
}
