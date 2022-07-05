
package edu.claudio.ejemplos.ejercicios.ciberteccadenas;

public class Ejemplo02 {
    public static void main(String[] args) {
         String nombre = "Claudio";
         String apellido= "Paitan";
         String dni = "47613163"; //Para telefonos, tarjetas de credito, DNI : Usamos String.
         
         //Vamos a construir el nombre de usuario:
         //primera letra del nombre + apellido + dos ultimos digitos del DNI
         //Todo debe estar en minusculas: Ej: cpaitan63
         
         int longitudNombre=nombre.length(); //Devuelve la longitud de un texto
         char pLetra = nombre.charAt(0); //Devuelve un Caracter
         String dosUltimosDigitos = dni.substring(dni.length()-2);
         System.out.println("La longitud del nombre es: "+longitudNombre);
         System.out.println("La primera letra del nombre es: "+pLetra);
         System.out.println("Dos ultimos digitos del DNI: "+ dosUltimosDigitos);
         
         String nombreUsuario=pLetra+apellido+dosUltimosDigitos;
         nombreUsuario=nombreUsuario.toLowerCase();
         System.out.println("el numbre de ususario es: "+nombreUsuario);
         System.out.println(" ");
         //Corte de cadenas por bloques
         String name="Carlos";
         String bloque = name.substring(0, 5);
         System.out.println("el bloque es: "+bloque);
       
    }
}
