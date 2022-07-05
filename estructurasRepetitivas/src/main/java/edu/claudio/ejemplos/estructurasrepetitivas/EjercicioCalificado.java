/*
Elabora un programa que permita generar boletas de venta para una tienda virtual
deberan ingresar el precio unitario de un producto, la cantidad de unidades, 
el dia de la semana valor entre 1-7, adicionalmente deberan ingresar la categoria 
del cliente S(estandar), V (vip), P (primium).
-Si el cliente es standar el cliente acumulara 5 puntos de millas.
-Si el cliente es vip el cliente acumulara 10 puntos de millas.
-Si el cliente es primium el cliente acumulara 14 puntos de millas.

-Si el cliente lleva entre 1 y 10 unidades aplica un descuento de 5%.
-Si el cliente lleva entre 11 y 20 unidades aplica un descuento de 10%.
-Si el cliente lleva mas de 20 unidades aplica un descuento de 15%.

- Si el dia de la samana es de lunes a jueves, se acumula 2 puntos de millas adicionales.
-Si el dia de la semana es de viernes a domingo, se acumulan 4 puntos de millas adicionales.
El programa debe imprimir el monto total a pagar con el descuento correspondiente.
Asi como el numero de millas acumuladas por la compra y el dia de la semana expresada en texto.(1-lunes)

Para las unidades y el precio, el ususario debe ingresar numeros positivos, el programa 
debe volver a pedir los datos de entrada en caso el usuario se equivoque.



 */
package edu.claudio.ejemplos.estructurasrepetitivas;

import java.util.Scanner;

public class EjercicioCalificado {

    public static void main(String[] args) {
        int cantidad, dia, puntos=0;
        double precioUnit, montoTotal,montoPagar;
        String categoria;
        String diaTexto="";

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de unidades del producto:");
        cantidad = entrada.nextInt();
        while (cantidad <= 0) {
            System.out.println("Ingrese solo numeros positivos.");
            System.out.println("Ingrese la cantidad de unidades del producto:");
            cantidad = entrada.nextInt();
        }
        System.out.println("Ingrese el precio unitario del producto:");
        precioUnit = entrada.nextDouble();
        while (precioUnit <= 0) {
            System.out.println("Ingrese solo numeros positivos.");
            System.out.println("Ingrese lel precio unitario del producto:");
            precioUnit = entrada.nextInt();
        }

        System.out.println("Ingrese su categoria de cliente: S,V o P");
        categoria = entrada.next().toUpperCase();
        while (!categoria.equalsIgnoreCase("S") && !categoria.equalsIgnoreCase("V") && !categoria.equalsIgnoreCase("P")) {
            System.out.println("Categoria incorrecta ingrese nuevamente: ");
            categoria = entrada.next().toUpperCase();
        }

        System.out.println("Ingrese el dia de la semana (1-7)");
        dia = entrada.nextInt();
        while (dia != 1 && dia != 2 && dia != 3 && dia != 4 && dia != 5 && dia != 6 && dia != 7) {
            System.out.println("Dia incorrecto, eliga un numero entre 1 a 7");
            dia = entrada.nextInt();
        }
        
        switch (categoria){
            case "S": puntos=5; break;
            case "V": puntos=10; break;    
            case "P": puntos=14; break;
        }
        montoTotal=cantidad*precioUnit;
        if (cantidad>=1 && cantidad<=10){
            montoPagar=0.95*montoTotal;
        }else if(cantidad>=11 && cantidad <=20){
            montoPagar=0.90*montoTotal;
        }else {
            montoPagar=0.85*montoTotal;
        }
        
        
        switch(dia){
            case 1: diaTexto="Lunes";
                    puntos +=2; break;
            case 2: diaTexto="Martes";
                    puntos +=2; break;
            case 3: diaTexto="Miercoles";
                    puntos +=2; break;   
            case 4: diaTexto="Jueves"; 
                    puntos +=2; break;   
            case 5: diaTexto="Viernes";
                    puntos +=4; break;   
            case 6: diaTexto="Sabado";
                    puntos +=4; break;   
            case 7: diaTexto="Domingo";
                    puntos+=4; break;   
        }
        System.out.println("\n*******Boleta de venta*******");
        System.out.println("-El dia de la semana es: "+diaTexto);
        System.out.println("-El monto a pagar es: "+montoPagar);    
        System.out.println("-Los puntos acumulados son: "+puntos);
    }
}
