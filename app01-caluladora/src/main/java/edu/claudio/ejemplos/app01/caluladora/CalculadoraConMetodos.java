package edu.claudio.ejemplos.app01.caluladora;


public class CalculadoraConMetodos {
    
     
    public static void main(String[] args) {
        //INICIO
        //1.- Declaración de variables
        
        int num1,num2,resultadoSuma,resultadoResta,resultadoMultiplicacion,resultadoDivision;
   
        //2.- Entrada de datos
        num1=8;
        num2=2;
        //3.- Proceso de cálculos
        resultadoSuma=sumar(num1,num2);
        resultadoResta=restar(num1, num2);
        resultadoMultiplicacion=multiplicar(num1, num2);
        resultadoDivision=dividir(num1, num2);
        //4.- Salida de resultados
        imprimirConsola("El resultado de la suma es: "+resultadoSuma);
        imprimirConsola("El resultado de la resta es: "+resultadoResta);
        imprimirConsola("El resultado de la multiplicacion es: "+resultadoMultiplicacion);
        imprimirConsola("El resultado de la division es: "+resultadoDivision);
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
