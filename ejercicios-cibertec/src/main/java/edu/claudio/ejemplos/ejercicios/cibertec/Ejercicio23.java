
package edu.claudio.ejemplos.ejercicios.cibertec;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
                //INICIO
        //1.- Declaration of varible
        int h,m,s,totalSeg,timeFaltante,hF,mF,sF;
        //2.- Data entry
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese la hora actual: ");
        System.out.print("Ingrese el numero de horas: ");
        h=entrada.nextInt();
        System.out.print("Ingrese el numero de minutos: ");
        m=entrada.nextInt();
        System.out.print("Ingrese el numero de segundos: ");
        s=entrada.nextInt();
        entrada.close();
        //3.- Calculation process
        totalSeg=segundoTotales(h, m, s);
        timeFaltante=24*3600-totalSeg;
        
        hF=timeFaltante/3600;       //4000/3600=1
        mF=timeFaltante%3600/60;     //400/60=6
        sF=timeFaltante%3600%60;    //400%60=40
        
        //4.- Result output
        System.out.println("la hora acutal es: "+h+":"+m+":"+s);
        System.out.println("Falta para tenirmar el dia: "+hF+":"+mF+":"+sF);
        //FINALL
        
        
    }
    
    public static int segundoTotales(int h,int m,int s){
        return h*3600+m*60+s;
    }
    
}
