
package edu.claudio.ejemplos.jdbc.basico;

import edu.claudio.ejemplos.jdbc.basico.mantenimiento.MantenimientoProducto;
import edu.claudio.ejemplos.jdbc.basico.modelos.Producto;

public class AppRegistrar {
    public static void main(String[] args) {
        MantenimientoProducto rp=new MantenimientoProducto();
        Producto p = new Producto(2, "Microondas", 25, 350);
        int filasAfectadas=rp.registrar(p);
        
        if(filasAfectadas>0){
            System.out.println("Se ah registrado el producto con codigo: "+p.getCodigo());
        }else{
            System.out.println("No se puede registar el producto");
        }
    }
}
