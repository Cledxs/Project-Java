
package edu.claudio.ejemplos.model;


public class Cursos {
    private String nombre;
    private double[]notas;

    public Cursos() {
    }

    public Cursos(String nombre, double[] notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    
    
}
