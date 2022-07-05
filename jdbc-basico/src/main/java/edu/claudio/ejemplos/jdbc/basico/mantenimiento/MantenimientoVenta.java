
package edu.claudio.ejemplos.jdbc.basico.mantenimiento;

import edu.claudio.ejemplos.jdbc.basico.modelos.Venta;
import edu.claudio.ejemplos.jdbc.basico.utilidades.ConexionBD;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MantenimientoVenta {
    /**
     * Este metodo registra una venta y devuelve el codigo gnerado
     * @param venta Un objeto con datos de la venta nueva
     * @return El codigo entorno que se ah generado
     */
    public int registrar (Venta venta){
        int codigoGenerado = -1;
        try {
        Connection conexion = ConexionBD.obtenerConexion();
        String sql = "insert into venta(cliente,fecha) values(?,?)";
        PreparedStatement ps;
        
            ps = conexion.prepareStatement(sql);
            ps.setString(1, venta.getCliente());
            ps.setDate(2, Date.valueOf(venta.getFecha()));
            ps.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(MantenimientoVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return codigoGenerado;
    }
}
