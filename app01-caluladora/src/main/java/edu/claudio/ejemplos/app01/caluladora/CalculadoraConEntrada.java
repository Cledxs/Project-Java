package edu.claudio.ejemplos.app01.caluladora;

import java.util.Scanner;


public class CalculadoraConEntrada {
    
     
    public static void main(String[] args) {
        //INICIO
        //1.- Declaración de variables
        
        int num1,num2;
   
        //2.- Entrada de datos
        //Voy a utilizar un componente especializado para la lectura por consola
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese dos números: ");
        num1=entrada.nextInt();
        num2=entrada.nextInt();
        System.out.println(" ");
        
        //Cierro el enlace de Scanner
        entrada.close();
        
        //3.- Proceso de cálculos
        //4.- Salida de resultados
        imprimirConsola("El resultado de la suma es: "+sumar(num1,num2));
        imprimirConsola("El resultado de la resta es: "+restar(num1, num2));
        imprimirConsola("El resultado de la multiplicacion es: "+multiplicar(num1, num2));
        imprimirConsola("El resultado de la division es: "+dividir(num1, num2));
        //FIN
    }
    
    public static int sumar(int num1,int num2){
        int suma;
        suma=num1+num2;
        return suma;  
    } 
    
    public static int restar(int n1,int n2){
        return n1-n2;
    }
    
    public static int multiplicar(int n1, int n2){
        return n1*n2;
    }
    
    public static int dividir(int n1, int n2){
        return n1/n2;
    }
    
    public static void imprimirConsola(String texto){
        System.out.println(texto);
    }

}
