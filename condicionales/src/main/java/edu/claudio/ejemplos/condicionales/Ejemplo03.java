
package edu.claudio.ejemplos.condicionales;

import java.util.Scanner;

public class Ejemplo03 {

    public static void main(String[] args) {
    //creamos un programa que lea e imprima la edad
    //Indicar si es mayor(18) o menor de edad.
    
    //INICIO
    //1. Declaracion
    int edad;
    //2. Entrada de datos
    Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        edad=entrada.nextInt();
        entrada.close();
    //3. Operaciones
    //Condicional ternario:
        System.out.println(edad>=18? "Es mayor de edad" : "Es menor de edad");
    //4. Salida
        System.out.println("Su edad es: "+edad);
    //FINAL
    
    
    }
}
