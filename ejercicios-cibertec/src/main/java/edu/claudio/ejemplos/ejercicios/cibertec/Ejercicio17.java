
package edu.claudio.ejemplos.ejercicios.cibertec;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        double sueldoBruto,descuentoEssalud, descuentoAFP, sueldoNeto, tarifaHoraria;
        int horasTrabajadas;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese las horas trabajadas del empleado: ");
        horasTrabajadas=entrada.nextInt();
        System.out.println("Ingrese la Tarifa horaria");
        tarifaHoraria=entrada.nextDouble();
        entrada.close();
        
        sueldoBruto=horasTrabajadas*tarifaHoraria;
        descuentoEssalud=(sueldoBruto*9)/100;
        descuentoAFP=(sueldoBruto*12.5)/100;
        sueldoNeto=sueldoBruto-(descuentoEssalud+descuentoAFP);
        
        
        System.out.println("El sueldo Bruto es: "+ sueldoBruto);
        System.out.println("El descuento por ESSALUD es: "+ descuentoEssalud);
        System.out.println("El descuento por AFP es: "+descuentoAFP);
        System.out.println("El sueldo neto es: "+sueldoNeto);
        
    }
}
