package edu.claudio.ejemplos.poo.basico;

public class Celular {
//Atributos=Propiedades =variables

    String marca;
    String modelo;
    String color;
    double precio;
    int anio;

//Metodos=Operacdiones = Funciones
    //meotodo especial (Constructor)
    public Celular() {

    }
//metodos normales
    
    public void enviarMensaje(String mensaje){
        System.out.println(mensaje);
    }

}
