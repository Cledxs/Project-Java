package edu.claudio.ejemplos.app01.caluladora;


public class CalculadoraSimple {
    
    public static void main(String[] args) {
        //INICIO
        //1.- Declaración de variables
        
        int num1;
        int num2;
        int resultadoSuma;
        int resultadoResta;
        int resultadoMultiplicacion;
        int resultadoDivision;
        
        //2.- Entrada de datos
        num1=8;
        num2=2;
        //3.- Proceso de cálculos
        resultadoSuma=num1+num2; 
        resultadoResta=num1-num2;
        resultadoMultiplicacion=num1*num2;
        resultadoDivision=num1/num2;
        //4.- Salida de resultados
        System.out.println("El resultado de la suma es: "+resultadoSuma);
        System.out.println("El resultado de la resta es: "+resultadoResta);
        System.out.println("El resultado de la multiplicacion es: "+resultadoMultiplicacion);
        System.out.println("El resultado de la division es: "+resultadoDivision);
        //FIN
    }

}
