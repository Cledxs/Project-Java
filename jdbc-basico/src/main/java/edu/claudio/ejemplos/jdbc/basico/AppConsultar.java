
package edu.claudio.ejemplos.jdbc.basico;

import edu.claudio.ejemplos.jdbc.basico.mantenimiento.MantenimientoProducto;
import edu.claudio.ejemplos.jdbc.basico.modelos.Producto;

public class AppConsultar {
    public static void main(String[] args) {
        MantenimientoProducto cp= new MantenimientoProducto();
        Producto productoObtenido=cp.consultar(4);
        
        if (productoObtenido==null){
            System.out.println("No se encontro el registro");
        }else{
            System.out.println(productoObtenido);
        }
    }
    
}
