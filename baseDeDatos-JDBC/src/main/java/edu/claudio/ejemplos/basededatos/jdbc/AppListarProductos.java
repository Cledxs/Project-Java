
package edu.claudio.ejemplos.basededatos.jdbc;

import edu.claudio.ejemplos.basededatos.jdbc.mantenimiento.MantenimientoProducto;
import edu.claudio.ejemplos.basededatos.jdbc.modelos.Producto;
import java.util.List;

public class AppListarProductos {
    public static void main(String[] args) {
        MantenimientoProducto mp = new MantenimientoProducto();
       List<Producto>productos =mp.listear();
       productos.stream().forEach(System.out::println);
        
    }
    
}
