
package edu.claudio.ejemplos.basededatos.jdbc.mantenimiento;

import edu.claudio.ejemplos.basededatos.jdbc.modelos.Venta;
import edu.claudio.ejemplos.basededatos.jdbc.utilidades.ConexionBD;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MantenimientoVenta {
    /**
     * Este metodo registra una venta y devuelve un codigo generado.
     * @param ventaNueva Un objeto con los datos de la ventaNueva
     * @return el codigo entero que se ah generado
     */
    
    public int registrar(Venta ventaNueva){
        int codigo = -1;
        try{
            Connection conexion = ConexionBD.obtenerConexion();
            String sql = "insert into venta(cliente,fecha) values(?,?)";
            PreparedStatement ps=conexion.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, ventaNueva.getCliente());
            //Haces un cambio en el formato de tipo de fecha (java-> sql)
            Date fecha = Date.valueOf(ventaNueva.getFecha());
            ps.setDate(2, fecha);
            
            //ejecutamos el update
            ps.executeUpdate(); // Siempre nos va traer el numero de filas afectadas
            
            // para obtener el codigo generado necesitamos de un proceso adicional
              //1.Utilizar un resulSet que obtenga el codigo generado
              
              ResultSet rs=ps.getGeneratedKeys(); // nos regresa una tabla resultset, nos regresa la fila donde se encuentra el codigo
              
              //2. Extraemos el codigo generado del resultSet
              if(rs.next()){        // NOTA SIEMPRE QUE SE TRABAJE CON RESULTSET, SE DEBE INICIALIZAR EL CURSOR rs.next().
                codigo=rs.getInt(1);  
              }
              //Crerramos las conexiones
              
              rs.close();
              ps.close();
              conexion.close();
   
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        return codigo;
    }
    
}
