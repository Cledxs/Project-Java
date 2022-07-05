package edu.claudio.ejemplos.practicacalificada1;

import java.util.Scanner;

public class Practica01 {

    public static void main(String[] args) {
        //Declaracion de variables
        String tipoTrabajador; //(E/M/A)
        int horasTrabajadas;
        double tarifaHora;
        int mesPlanilla;
        double salarioBase;
        double descuento=0;
        double bono=0;
        double salarioNeto=0;
        //Entrada y validacion de datos
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el tipo de trabajador. \nE: Enfermero\nM: Medico \nA: Administrativo");
        System.out.println(" ");
        tipoTrabajador = entrada.next().toUpperCase();

        while (!tipoTrabajador.equals("E") && !tipoTrabajador.equals("M") && !tipoTrabajador.equals("A")) {
            System.out.println("El tipo de trabajador es incorrecto, ingrese nuevamente.");
            tipoTrabajador = entrada.next().toUpperCase();
        }

        System.out.println("Ingrese las horas trabajadas:");
        horasTrabajadas = entrada.nextInt();
        while (horasTrabajadas <= 0) {
            System.out.println("Numero invalido, el valor debe ser un numero positivo, ingrese nuevamente.");
            horasTrabajadas = entrada.nextInt();
        }

        System.out.println("Ingrese la Tarifa por hora:");
        tarifaHora = entrada.nextDouble();
        while (tarifaHora <= 0) {
            System.out.println("Numero invalido, el valor debe ser un numero positivo, ingrese nuevamente.");
            tarifaHora = entrada.nextDouble();
        }

        System.out.println("Ingrese el numero del mes (1-12)");
        mesPlanilla = entrada.nextInt();

        while (mesPlanilla < 1 || mesPlanilla > 12) {

            System.out.println("Mes invalido ingrese nuevamente");
            mesPlanilla = entrada.nextInt();
        }
        entrada.close();
        //Calculo del mes en texto
        mesTexto(mesPlanilla);

        //Calculo del salario base
        salarioBase = horasTrabajadas * tarifaHora;

        //Calculo del salario neto, aplicando bonos y descuento
        if (tipoTrabajador.equals("E")) {
            tipoTrabajador = "Enfermero";
            bono = 0.15 * tarifaHora;
            descuento = 0.02 * salarioBase + 0.05 * salarioBase;
            salarioNeto = salarioBase + bono - descuento;
            
            if (mesPlanilla == 7 || mesPlanilla == 12){
            salarioNeto = 2 * salarioBase + bono - descuento;    
             }
            

        } 

        if (tipoTrabajador.equals("M")) {
            tipoTrabajador = "Medico";
            bono = 0.2 * salarioBase;
            descuento = 0.02 * salarioBase + 0.05 * salarioBase;
            salarioNeto = salarioBase + bono - descuento;
             
            if (mesPlanilla == 7 || mesPlanilla == 12){
            salarioNeto = 2 * salarioBase + bono - descuento;    
             }
           
        }

        if (tipoTrabajador.equals("A")) {
            tipoTrabajador = "Administrativo";
            bono = 0.10 * tarifaHora;
            descuento = 0.02 * salarioBase + 0.05 * salarioBase;
            salarioNeto = salarioBase + bono - descuento;
            
            if (mesPlanilla == 7 || mesPlanilla == 12){
            salarioNeto = 2 * salarioBase + bono - descuento;    
             }
            
        } 
        
        
        //Mostrando la boleta
        System.out.println("===BOLETA PARA EL MES DE "+mesTexto(mesPlanilla)+"===");
        System.out.println("Cargo: "+tipoTrabajador);

        System.out.println("Sueldo base: "+salarioBase);
        System.out.println("Total de descuentos: "+ descuento);
        System.out.println("Total de bonos: "+ bono);
        System.out.println("Suledo neto: "+ salarioNeto);

    }

    public static String mesTexto(int mesPlanilla) {
        String mes = "";
        switch (mesPlanilla) {
            case 1:
                mes = "ENERO"; break;
            case 2:
                mes = "FEBRERO";break;
            case 3:
                mes = "MARZO";break;
            case 4:
                mes = "ABRIL";break;
            case 5:
                mes = "MAYO";break;
            case 6:
                mes = "JUNIO";break;
            case 7:
                mes = "JULIO";break;
            case 8:
                mes = "AGOSTO";break;
            case 9:
                mes = "SETIEMBRE";break;
            case 10:
                mes = "OCTUBRE";break;
            case 11:
                mes = "NOVIEMBRE";break;
            case 12:
                mes = "DICIEMBRE";break;

        }
        return mes;
    }
}
