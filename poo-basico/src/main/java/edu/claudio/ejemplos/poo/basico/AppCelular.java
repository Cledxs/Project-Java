package edu.claudio.ejemplos.poo.basico;

import edu.claudio.ejemplos.poo.alcamce.Empleado;

public class AppCelular extends Empleado {

    public static void main(String[] args) {

        Celular c01 =new Celular();
        
        c01.color="negro";
        
        c01.marca = "Apple";
        
        c01.enviarMensaje("Holas");
        System.out.println("Mi celular es de color: "+c01.color);
        
        
     
         
    }

}
