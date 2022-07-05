
package edu.claudio.ejemplos.poo.abstraccion;

public abstract class Figura {
     protected String nombre;
     protected String Color;

    public Figura(String nombre, String Color) {
        this.nombre = nombre;
        this.Color = Color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }
     
     public abstract double calcularArea();
     
     public void mostrarRasultados(){
         System.out.println("Figura: " + nombre);
         System.out.println("Color: "+ Color);
     }
}
