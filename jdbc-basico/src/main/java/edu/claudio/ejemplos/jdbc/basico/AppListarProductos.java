
package edu.claudio.ejemplos.jdbc.basico;

import edu.claudio.ejemplos.jdbc.basico.mantenimiento.MantenimientoProducto;
import edu.claudio.ejemplos.jdbc.basico.modelos.Producto;
import java.util.List;

public class AppListarProductos {
    public static void main(String[] args) {
        MantenimientoProducto mp = new MantenimientoProducto();
        List<Producto> productos=mp.listar();
        productos.stream().forEach(System.out::println);
        
    }
    
}
