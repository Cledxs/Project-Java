
package edu.claudio.ejemplos.interfaces;

public class Cuadrado implements Figura{
    private double lado;

    public Cuadrado(double lado) {
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
     return lado*lado;
    }

    @Override
    public double caclularPerimetro() {
        return 4*lado;
    }

    @Override
    public String mostrarDatos() {
        return "El area del cuadrado es: "+calcularArea();
    }
    

    
}
