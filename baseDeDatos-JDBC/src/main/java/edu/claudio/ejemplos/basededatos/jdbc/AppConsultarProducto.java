
package edu.claudio.ejemplos.basededatos.jdbc;

import edu.claudio.ejemplos.basededatos.jdbc.mantenimiento.MantenimientoProducto;
import edu.claudio.ejemplos.basededatos.jdbc.modelos.Producto;

public class AppConsultarProducto {
    
    public static void main(String[] args) {
        MantenimientoProducto p = new MantenimientoProducto();
        Producto prod = p.consultar(6);

        if(prod == null){
            System.out.println("No existe el producto con dicho codigo");
        }else{
            System.out.println(prod);
        }
        
        
    }
            
    
}
