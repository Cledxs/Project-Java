
package edu.claudio.ejemplos.model;

public class Automovil {
    private String marca;
    private String modelo;
    private int motor;

    public Automovil() {
    }

    public Automovil(String marca, String modelo, int motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return marca+",  "+modelo+", "+motor;
    }
    
    
    
}
