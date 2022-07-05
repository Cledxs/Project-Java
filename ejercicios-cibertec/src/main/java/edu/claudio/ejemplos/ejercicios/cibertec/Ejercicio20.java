
package edu.claudio.ejemplos.ejercicios.cibertec;

import java.util.Scanner;

public class Ejercicio20 {
    
    public static void main(String[] args) {
        int numInicio,dM,u,numCentral;
    
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el numero de cinco cifras: ");
        numInicio=entrada.nextInt();
        
        u=numInicio/10000;
        dM=((((numInicio%10000)%1000)%100)%10)*10000;
        numCentral= (numInicio-(((numInicio/10000)*10000)+(((numInicio%10000)%1000)%100)%10));
        
        System.out.println("El nuevo numero es: "+(dM+numCentral+u));
    }


}
