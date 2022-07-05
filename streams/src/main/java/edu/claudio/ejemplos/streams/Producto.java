
package edu.claudio.ejemplos.streams;

public class Producto {
    private int codigo;
    private String nombre;
    private int stock;
    private double precio;

    public Producto() {
    }

    public Producto(int codigo, String nombre, int stock, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.stock = stock;
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
        String precioFormateado = String.format("%.2f", precio);
        StringBuilder datosProducto = new StringBuilder();
        datosProducto.append("Codigo: ").append(codigo).append("\n")
                .append("Nombre: ").append(nombre).append("\n")
                .append("Stock: ").append(stock).append("\n")
                .append("Precio: ").append(precioFormateado).append("\n");
        
        return datosProducto.toString();
    }
    
    
}
