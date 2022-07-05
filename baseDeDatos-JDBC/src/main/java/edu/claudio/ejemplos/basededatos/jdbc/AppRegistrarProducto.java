
package edu.claudio.ejemplos.basededatos.jdbc;

import edu.claudio.ejemplos.basededatos.jdbc.mantenimiento.MantenimientoProducto;
import edu.claudio.ejemplos.basededatos.jdbc.modelos.Producto;

public class AppRegistrarProducto {
    public static void main(String[] args) {
        MantenimientoProducto producto = new  MantenimientoProducto();
        Producto productoNuevo = new Producto(2, "lentes", 50, 350);
        int filasAgregadas = producto.registrar(productoNuevo);
        
        if(filasAgregadas>=1){
            System.out.println("Se añadio el producto");
        }else{
            System.out.println("No se puede registrar el producto");
        }
    }
    
}
