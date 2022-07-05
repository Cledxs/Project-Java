
package edu.claudio.ejemplos.model;

public class Producto {
    private int codigo;
    private String nombe;
    private double precio;

    public Producto() {
    }

    public Producto(int codigo, String nombe, double precio) {
        this.codigo = codigo;
        this.nombe = nombe;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombe() {
        return nombe;
    }

    public void setNombe(String nombe) {
        this.nombe = nombe;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        StringBuilder infoProducto= new StringBuilder();
        infoProducto.append("Codigo: ").append(codigo).append("\n")
                .append("Nombre: ").append(nombe).append("\n")
                .append("FPrecio: ").append(precio).append("\n");
        
        return infoProducto.toString();
    }

    
    
}
