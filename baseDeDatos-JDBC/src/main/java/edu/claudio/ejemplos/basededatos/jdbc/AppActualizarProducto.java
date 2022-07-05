
package edu.claudio.ejemplos.basededatos.jdbc;

import edu.claudio.ejemplos.basededatos.jdbc.mantenimiento.MantenimientoProducto;
import edu.claudio.ejemplos.basededatos.jdbc.modelos.Producto;

public class AppActualizarProducto {
    public static void main(String[] args) {
        MantenimientoProducto mp = new MantenimientoProducto();
        Producto productoCandidato = new Producto(1, "Equipo de Sonido", 10, 2300);
        int filasAfectadas=mp.actualizar(productoCandidato);
        if(filasAfectadas>=1){
            System.out.println("Se ah actualizado el producto");
        }else {
            System.out.println("No se pudo actualizar el producto");
        }
        
    }
}
