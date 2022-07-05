
package edu.claudio.ejemplos.hilos;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Tortuga extends Thread{
    private double distanciaTotal=   300;
    private double distanciaRecorrida=0;
    private double velocidad=15; 
    private long tiempoDescanso=1500; //1.5 seg

    @Override
    public void run() {
        System.out.println("\"La Tortuga ah iniciado la carrera\"");
        
        while (distanciaRecorrida<distanciaTotal){
            distanciaRecorrida+=velocidad;
             System.out.println("La Tortuga ah avanzado: "+distanciaRecorrida);
             
            try {
                Thread.sleep(tiempoDescanso);
            } catch (InterruptedException ex) {
                Logger.getLogger(Tortuga.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        System.out.println("La Tortuga finalizo la carrera");
    }
    
    
    
}
