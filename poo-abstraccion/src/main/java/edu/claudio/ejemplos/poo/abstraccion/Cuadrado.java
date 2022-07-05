
package edu.claudio.ejemplos.poo.abstraccion;

public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado, String nombre, String Color) {
        super(nombre, Color);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }
    
    
}
