/*
Desarrolle un programa que permita ingresar el precio unitario y numero de unidades 
de un producto, asi como el medio de pago que puede ser "cash" o "tarjeta".
-Si el numero de unidades es mayor a 10, pero menor a 20, se aplica un descuento de 5%.

-Si el numero de unidades es mayor o igual que 20 y es menor que 35, aplicar un descuento de 10%.

-Si el numero de unidades es mayor o igual que 35 y menor que 50, aplicar un 12%.

-Si el numero de unidades es mayor o igual que 50, aplicar un descuento del 15%.

Adicionalmente, si se paga con tarjeta, debe agregar un recargo de 2%.
Muestre el monto final a pagar.
*/
package edu.claudio.ejemplos.condicionales;

import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        int cantUnidades,opcion;
        double precioUnit, pagoInicial,pagoFinal=0;
       
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el precio unitario del producto: ");
        precioUnit=entrada.nextDouble();
        System.out.println("Ingrese la cantidad de unidades del producto: ");
        cantUnidades=entrada.nextInt();
        
        pagoInicial=(cantUnidades*precioUnit);
        
        if(cantUnidades>0 && cantUnidades<=10){
            pagoFinal=pagoInicial;
        }else if(cantUnidades>10 && cantUnidades<20){
            pagoFinal=0.95*pagoInicial;
        }else if(cantUnidades>=20 && cantUnidades<35){
            pagoFinal=0.90*pagoInicial;
        }else if(cantUnidades>=35 && cantUnidades<50){
            pagoFinal=0.88*pagoInicial;
        }else if(cantUnidades>=50){
            pagoFinal=0.85*pagoInicial;
        }
        
        System.out.println("Ingrese el medio de pago: \n1.-Cash"
                + "\n2.-Tarjeta");
        
        System.out.println("Eliga la opcion: ");
         opcion=entrada.nextInt();
         
         switch(opcion){
             case 1: System.out.println("El monto a pagar es: "+pagoInicial);
                 break;
             case 2: System.out.println("El monto a pagar es: "+1.02*pagoFinal);
                 break;
             default: System.out.println("Opcion invalida");
         }
        
    }
    
}
