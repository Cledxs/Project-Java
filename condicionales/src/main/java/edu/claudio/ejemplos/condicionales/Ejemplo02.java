
package edu.claudio.ejemplos.condicionales;

import java.util.Scanner;

public class Ejemplo02 {

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
    
    if(edad>=18){
        System.out.println("Es mayor de edad");
    }else{
        System.out.println("Es menor de edad");
    }
    //4. Salida
        System.out.println("Su edad es: "+edad);
    //FINAL
    
    
    }
}
