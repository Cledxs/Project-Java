
package edu.claudio.ejemplos.basededatos.jdbc;

import edu.claudio.ejemplos.basededatos.jdbc.mantenimiento.MantenimientoProducto;

public class AppEliminarProducto {
    public static void main(String[] args) {
        MantenimientoProducto mp = new MantenimientoProducto();
        int filasAfectadas= mp.eliminar(1);
        
        if(filasAfectadas>=1){
            System.out.println("Se elimino el producto");
        }else{
            System.out.println("No se pudo eliminar el producto");
        }
    }
    
}
