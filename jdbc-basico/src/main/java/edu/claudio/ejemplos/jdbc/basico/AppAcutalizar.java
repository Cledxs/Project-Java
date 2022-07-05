
package edu.claudio.ejemplos.jdbc.basico;

import edu.claudio.ejemplos.jdbc.basico.mantenimiento.MantenimientoProducto;
import edu.claudio.ejemplos.jdbc.basico.modelos.Producto;

public class AppAcutalizar {
    public static void main(String[] args) {
        MantenimientoProducto ap = new MantenimientoProducto();
        Producto productoNuevo= new Producto(9, "Pelota", 5, 80);
        int filasAfectadas=ap.acutalizar(productoNuevo);
        
        if (filasAfectadas>0){
            System.out.println("Se actulizo el producto con dogio : "+productoNuevo.getCodigo());
        }else{
            System.out.println("No se puede acutlizar el producto");
        }
    }
}
