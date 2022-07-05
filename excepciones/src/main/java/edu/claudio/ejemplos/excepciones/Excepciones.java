
package edu.claudio.ejemplos.excepciones;

import java.util.Scanner;


public class Excepciones {
    
    private int numero;
    private Scanner entrada;
    
    public void introducirNumero() throws Excepcion0{
        entrada=new Scanner (System.in);
        do{
            System.out.println("Ingrese un numero:");
            numero=entrada.nextInt();
            
            if(numero==0){
                throw new Excepcion0();
            }
        }while(numero!=0);
    }
    
    

    public static void main(String[] args) throws Excepcion0 {
        
        Excepciones ex = new Excepciones();
        try{
            ex.introducirNumero();
        } catch (Excepcion0 e){
            System.out.println("Numero ingresado cero, no esta permitido");
            
        }
        
        System.out.println("Prgrama finalizado");
        

    }
}
