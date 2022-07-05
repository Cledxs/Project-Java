
package edu.claudio.ejemplos.condicionales;

import java.util.Scanner;


public class Problem02 {
    public static void main(String[] args) {
//Declarar
		int unidades;
		double precioUnitario, descuento, recargo, montoTotal;
		String medioDePago;
		
		 //Lectura de datos
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese las unidades del producto: ");
		unidades=entrada.nextInt();
		System.out.println("Ingrese el precio unitario: ");
		precioUnitario=entrada.nextDouble();
		System.out.println("Ingrese el medio de pago: ");
		medioDePago=entrada.next();
		entrada.close();
		
		//Proceso
		//Validemos las entradas
		/*
		 		if (unidades<=0 ) {
			System.out.println("Las unidades deben ser mayores a \"cero\"");	
		}
		
		if (precioUnitario<=0) {
			System.out.println("El precio unitario debe ser mayor a \"cero\"");
		}
		 */
        
		
		//Otra forma
		
		if(unidades<=0 || precioUnitario<=0) {
			System.out.println("Las unidades o el precio unitario son invalidos ");
			System.exit(0);
		}
		
		if(!medioDePago.equalsIgnoreCase("tarjeta") && !medioDePago.equalsIgnoreCase("cash")) {
			System.out.println("Medio de pago invalido");
			System.exit(0);
		}
		
	   //Procedemos con el proceso de calculo
		
		if (unidades>0 && unidades<=10) {
			descuento=0;
		}else if (unidades>10 && unidades<20) {
			descuento=0.05;
		}else if (unidades>=20 && unidades<35) {
			descuento=0.10;
		}else if (unidades>=35 && unidades<50) {
			descuento=0.12;
		}else {
			descuento =0.15;
		}
		
		if (medioDePago.equals("tarjeta")) {
			recargo = 0.02;
		}else {
			recargo=0;
		}
		
		montoTotal=unidades*precioUnitario;
		montoTotal=montoTotal-(montoTotal*descuento);
		montoTotal=montoTotal+(montoTotal*recargo);
		
		System.out.println("El monto a pagar es de : "+ montoTotal);        
        
        
        
    }
}
