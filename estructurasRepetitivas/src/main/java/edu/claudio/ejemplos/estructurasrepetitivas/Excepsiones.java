package edu.claudio.ejemplos.estructurasrepetitivas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepsiones {

    public static void main(String[] args) {
        try {
            double num1, num2, resultado;

            Scanner entrada = new Scanner(System.in);
            System.out.println("ingrese el numerador: ");
            num1 = entrada.nextDouble();
            System.out.println("Ingrese el denominador: ");
            num2 = entrada.nextDouble();

            entrada.close();

            resultado = num1 / num2;

            System.out.println("El resultado de la division es:" + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Debe ingresar solo numeros.");

        }

    }

}
