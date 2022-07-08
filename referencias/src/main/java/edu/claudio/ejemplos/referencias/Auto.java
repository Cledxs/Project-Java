
package edu.claudio.ejemplos.referencias;

public class Auto {
   private String color;
   private String modelo;
   private  int precio;

    public Auto(String color, String modelo, int precio) {
        this.color = color;
        this.modelo = modelo;
        this.precio = precio;
    }

    public Auto() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
   
   
}
