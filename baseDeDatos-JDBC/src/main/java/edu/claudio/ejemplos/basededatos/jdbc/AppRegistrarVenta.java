
package edu.claudio.ejemplos.basededatos.jdbc;

import edu.claudio.ejemplos.basededatos.jdbc.mantenimiento.MantenimientoVenta;
import edu.claudio.ejemplos.basededatos.jdbc.modelos.Venta;
import java.time.LocalDate;

public class AppRegistrarVenta {
    public static void main(String[] args) {
        MantenimientoVenta mv = new MantenimientoVenta();
        Venta ventaNueva = new Venta(0, "Max", LocalDate.now());
        int codigo = mv.registrar(ventaNueva);
        if(codigo>0){
            System.out.println("Se ah ingresado una venta nueva");
        }else{
            System.out.println("No se pudo registrar la venta");
        }
    }
    
}
