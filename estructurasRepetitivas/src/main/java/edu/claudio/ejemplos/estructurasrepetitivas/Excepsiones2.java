package edu.claudio.ejemplos.estructurasrepetitivas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepsiones2 {

    public static void main(String[] args) {
        try {
            int num1, num2, resultado;

            Scanner entrada = new Scanner(System.in);
            System.out.println("ingrese el numerador: ");
            num1 = entrada.nextInt();
            System.out.println("Ingrese el denominador: ");
            num2 = entrada.nextInt();

            entrada.close();

            resultado = num1 / num2;

            System.out.println("El resultado de la division es:" + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Debe ingresar solo numeros.");

        } catch (ArithmeticException e){
            System.out.println("El denominador debe ser diferente de cero (0).");
        } finally {
            System.out.println("*********Esto siempre se ejecuta*************");
        }

    }

}
