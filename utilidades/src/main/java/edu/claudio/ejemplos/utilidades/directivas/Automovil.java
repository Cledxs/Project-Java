
package edu.claudio.ejemplos.utilidades.directivas;

public class Automovil {
    private String marca;
    private String modelo;
    private String color;
    
    private static int contador=0;

    public Automovil() {
        contador++;
    }

    public Automovil(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        contador++;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static int getContador() {
        return contador;
    }
    
    

    @Override
    public String toString() {
        return marca + ", "+modelo+ ", "+color;
    }
    
    public static String mostrarConcesionario(){
        return "AUTOLAND";
    }
    
    
}
