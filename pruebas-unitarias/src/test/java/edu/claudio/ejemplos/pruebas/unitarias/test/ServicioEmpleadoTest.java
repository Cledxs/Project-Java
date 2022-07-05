
package edu.claudio.ejemplos.pruebas.unitarias.test;

import edu.claudio.ejemplos.pruebas.unitarias.mantenimiento.MantenimientoEmpleado;
import edu.claudio.ejemplos.pruebas.unitarias.moldelos.Empleado;
import edu.claudio.ejemplos.pruebas.unitarias.servicios.ServicioEmpleado;
import junit.framework.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class ServicioEmpleadoTest {
    private ServicioEmpleado servicio;
    
    @Test
    public void autenticar_usuario_correcto(){
        //Se crea el mock que va simular la conexion a la base de datos, perteneciente a la clase correspondiente;
        MantenimientoEmpleado m = Mockito.mock(MantenimientoEmpleado.class);
        //Tenemos que definir el comportamiento del mock
        String usuario = "test";
        String password = "test";
        Mockito.when(m.iniciarSesion(usuario, password)).thenReturn(new Empleado());
        
        //Asignamos el mock a nuestro servicio
        servicio = new ServicioEmpleado();
        servicio.setMe(m);
        
        //Hacemos la llamada al metodo de servicio
        Empleado empleadoCandidato = new Empleado();
        empleadoCandidato.setUsuario("test");
        empleadoCandidato.setPassword("test");
        Empleado empleadoYaAutenticado = servicio.autenticarUsuario(empleadoCandidato);
        Assert.assertNotNull(empleadoYaAutenticado);
    }
    
}
