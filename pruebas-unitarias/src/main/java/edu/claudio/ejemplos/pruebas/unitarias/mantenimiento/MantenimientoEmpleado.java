
package edu.claudio.ejemplos.pruebas.unitarias.mantenimiento;

import edu.claudio.ejemplos.pruebas.unitarias.moldelos.Empleado;

public class MantenimientoEmpleado {
    
    public Empleado iniciarSesion(String usuario, String password){
        //Hacemos la consulta a una base de datos:
        //Connection conexion = ConexionBD.otebenerConexion();
        //String sql = "select  * from empleado where usuario=? and password =?";
        //PreparedStatement ps = conexion.preparedStatement();
        //......
        //......
        return new Empleado(123, "Claudio", "Programador", 2500, "Cledxs", "123456");
    }
    
}
