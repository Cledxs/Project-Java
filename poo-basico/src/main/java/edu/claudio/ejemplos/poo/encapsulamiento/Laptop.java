
package edu.claudio.ejemplos.poo.encapsulamiento;

public class Laptop {
private String serie; 
private String marca;
private String modelo;
private double precio;

    public Laptop() {
    }

    public Laptop(String serie, String marca, String modelo, double precio) {
        this.serie = serie;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if(precio>0){
          this.precio = precio;  
        } else{
            throw new UnsupportedOperationException("El precio debe ser mayor a cero");
        }
        
    }


}
