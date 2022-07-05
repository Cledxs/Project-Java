

package edu.claudio.ejemplos.ejercicios.ciberteccadenas;


public class Ejemplo01 {

    public static void main(String[] args) {
            //Definir una varibale de tipo String (cadena)
        String nombre="Claudio";
        String mensaje="Curso de Java 11 Fundamentals";
        
       
        System.out.println("El nombre en mayusculas: "+nombre.toUpperCase());
        System.out.println("El nombre en minusculas: "+nombre.toLowerCase());
        System.out.println("Bienvenido: "+mensaje);
        
        String edadWeb="21";
        int edad=Integer.parseInt(edadWeb);
        
        System.out.println(edadWeb+10); //Al 10 lo toma como cadena =2110
        System.out.println(edad+10); // Ambos son numeros =31
    }
}
