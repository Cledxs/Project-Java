
package edu.claudio.ejemplos.models;

import java.io.Serializable;

public class Producto implements Serializable { //Interfaz funcional, Interfaz marcadora(Interface Serializable) (no tiene metodos, sirve para decirle a java que los objetos que se crean del tipo producto que van a ser serializables)
    private int codigo;
    private String nombre;
    private int stock;
    private double precio;

    public Producto() {
    }

    public Producto(int codigo, String nombre, int sotck, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.stock = sotck;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return codigo+", "+nombre+", "+stock+", "+precio;
    }
     
    
}
