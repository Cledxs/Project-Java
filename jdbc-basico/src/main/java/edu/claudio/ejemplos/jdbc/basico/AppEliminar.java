
package edu.claudio.ejemplos.jdbc.basico;

import edu.claudio.ejemplos.jdbc.basico.mantenimiento.MantenimientoProducto;

public class AppEliminar {
    public static void main(String[] args) {
        MantenimientoProducto ep=new MantenimientoProducto();
        int filasAfectadas=ep.eliminar(2);
        
        if (filasAfectadas>0) {
            System.out.println("Se elimino el producto");
        } else {
            System.out.println("No se puede eliminar, o el producto no existe");
        }
    }
    
}
