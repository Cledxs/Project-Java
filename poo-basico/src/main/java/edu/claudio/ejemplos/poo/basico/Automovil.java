package edu.claudio.ejemplos.poo.basico;

public class Automovil {

    String marca;
    String modelo;
    int motor;

    public Automovil(String marca, String modelo, int motor) {
        this.marca=marca;
        this.modelo=modelo;
        this.motor=motor;

    }
    
    public Automovil (){
        
    }

    public void acelerar() {
        System.out.println("El automovil esta acelerando");
    }

}
