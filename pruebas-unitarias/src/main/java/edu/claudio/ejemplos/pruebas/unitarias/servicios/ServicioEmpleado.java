
package edu.claudio.ejemplos.pruebas.unitarias.servicios;

import edu.claudio.ejemplos.pruebas.unitarias.mantenimiento.MantenimientoEmpleado;
import edu.claudio.ejemplos.pruebas.unitarias.moldelos.Empleado;

public class ServicioEmpleado {
    private MantenimientoEmpleado me;
    
    public Empleado autenticarUsuario(Empleado empleado){
        Empleado empleadoAutenticado=null;
        // se pueden validar los datos
        if(empleado.getUsuario().isBlank()|| empleado.getPassword().isBlank()){
            System.out.println("El ususario y la contraseña no son validos");
        }else{
            empleadoAutenticado=me.iniciarSesion(empleado.getUsuario(), empleado.getPassword());
        }
        
        return empleadoAutenticado;
    }

    public MantenimientoEmpleado getMe() {
        return me;
    }

    public void setMe(MantenimientoEmpleado me) {
        this.me = me;
    }
                                                                                                                                                                                    
    
}
