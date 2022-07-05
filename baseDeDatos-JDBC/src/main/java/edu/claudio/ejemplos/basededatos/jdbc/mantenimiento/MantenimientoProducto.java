package edu.claudio.ejemplos.basededatos.jdbc.mantenimiento;

import edu.claudio.ejemplos.basededatos.jdbc.modelos.Producto;
import edu.claudio.ejemplos.basededatos.jdbc.utilidades.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MantenimientoProducto {

    public List<Producto> listear() {
        List<Producto> productos = new ArrayList<>(); //Creamos una lista donde se va obtener todos los prductos

        try {

            //1. Obtener la conexion que nos permite interactuar con la BD
            Connection conexion = ConexionBD.obtenerConexion();

            //2. Definimos el comando SQl que queremos realizar
            String sql = "select * from producto";

            //3. Usar el componente que permite lanzar el comando que se quiere hacer hacia mysql (interprete)
            PreparedStatement ps = conexion.prepareStatement(sql);

            //4.usar el componente y decirle que operacion va a hacer.
            ResultSet rs = ps.executeQuery();//Devuelve un set de resultados en formato Mysql

            //5. Conveertimos lo obtenido a formato que nos permita crear objetos en java
            while (rs.next()) {
                int codigo = rs.getInt("codigo");
                String nombre = rs.getString("nombre");
                int stock = rs.getInt("stock");
                double precio = rs.getDouble("precio");

                Producto p = new Producto(codigo, nombre, stock, precio);
                productos.add(p);
            }

            //Finalmente cerramos los componentes
            ps.close();
            rs.close();
            conexion.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return productos;
    }

    public Producto consultar(int codigo) {
        Producto productoObtenido = null;
        try {
            Connection conexion = ConexionBD.obtenerConexion();
            String sql = "select * from producto where codigo = ?";

            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, codigo);

            ResultSet rs = ps.executeQuery();
            // cundo hay un solo registro, se cambia el while por el if
            if (rs.next()) {
                int codigoObtenido = rs.getInt("codigo");
                String nombre = rs.getString("nombre");
                int stock = rs.getInt("stock");
                double precio = rs.getDouble("precio");
                
                productoObtenido= new Producto(codigoObtenido, nombre, stock, precio);
            }
            
            ps.close();
            rs.close();
            conexion.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return productoObtenido;
    }
    
    public int registrar(Producto productoNuevo){
        int filasAfectadas=-1;
        
        try{
            Connection conexion = ConexionBD.obtenerConexion();
            String sql = "insert into producto(codigo,nombre,stock,precio) values(?,?,?,?) ";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, productoNuevo.getCodigo());
            ps.setString(2, productoNuevo.getNombre());
            ps.setInt(3, productoNuevo.getStock());
            ps.setDouble(4, productoNuevo.getPrecio());
            
            filasAfectadas=ps.executeUpdate();
            
            ps.close();
            conexion.close();
            
        }catch (Exception e){
            e.printStackTrace();
        }
        
        return filasAfectadas;
    }
    
    public int actualizar(Producto productoCandidato){
        int filasAfectadas = -1;
        try{
            Connection conexion = ConexionBD.obtenerConexion();
            String sql ="update producto set nombre=?, stock=?, precio=? where codigo=? ";
            PreparedStatement ps=conexion.prepareStatement(sql);
            ps.setString(1, productoCandidato.getNombre());
            ps.setInt(2, productoCandidato.getStock());
            ps.setDouble(3, productoCandidato.getPrecio());
            ps.setInt(4, productoCandidato.getCodigo());
            
            filasAfectadas= ps.executeUpdate();
            
            ps.close();
            conexion.close();
            
        }catch (Exception e){
            e.printStackTrace();
        }
        
        return filasAfectadas;
    }
    
    public int eliminar(int codigo){
        int filasAfectadas = -1;
        
        try{
            Connection conexion = ConexionBD.obtenerConexion();
            String sql = "delete from producto where codigo=?";
            PreparedStatement ps=conexion.prepareStatement(sql);
            ps.setInt(1, codigo);
             filasAfectadas = ps.executeUpdate();
            
             ps.close();
             conexion.close();
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        return filasAfectadas;
    }
}
