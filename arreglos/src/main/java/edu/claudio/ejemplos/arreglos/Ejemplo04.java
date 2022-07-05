
package edu.claudio.ejemplos.arreglos;

import edu.claudio.ejemplos.model.Automovil;

public class Ejemplo04 {
 
    public static void main(String[] args) {
        Automovil[] autos = new Automovil[4];
        
        autos[0]= new Automovil("Hyundai", "i10", 1600);
        autos[1]= new Automovil("kia", "Cerato", 1800);
        autos[2]= new Automovil("Nissan", "Versa", 1200);
        autos[3]= new Automovil("Audio", "A7", 2000);
        
        for (int i=0;i<autos.length;i++){
             System.out.println(autos[i].getMarca()+", "+autos[i].getModelo()+", "+autos[i].getMotor());
        }
        System.out.println("===========================================");
        for(Automovil auto: autos){
            System.out.println(auto);
        }
        
        
    }
            
}
