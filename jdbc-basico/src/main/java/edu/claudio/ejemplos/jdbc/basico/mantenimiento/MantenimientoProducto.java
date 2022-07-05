package edu.claudio.ejemplos.jdbc.basico.mantenimiento;

import edu.claudio.ejemplos.jdbc.basico.modelos.Producto;
import edu.claudio.ejemplos.jdbc.basico.utilidades.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MantenimientoProducto {

    public List<Producto> listar() {
        List<Producto> listaProductos = new ArrayList<>();
        try {

            //Vamos a colocar la logica para interactuar con la base de datos;
            //1.-Primer paso obtener la conexion que permite interactuar con la base de datos:
            Connection conexion = ConexionBD.obtenerConexion();
            //2.-Indicarle que queremos hacer
            String sql = "select * from producto";
            //3.- Usar un componente que permite lanzar esta instruccion.
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(); //Devuelve un set de resultados en formato Mysql
            while (rs.next()) {
                int codigo = rs.getInt("codigo");
                String nombre = rs.getString("nombre");
                int stock = rs.getInt("stock");
                double precio = rs.getDouble("precio");

                Producto p = new Producto(codigo, nombre, stock, precio);
                listaProductos.add(p);
            }

            //Finalmente cerramos todas las conexiones:
            conexion.close();
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(MantenimientoProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaProductos;
    }

    public Producto consultar(int codigo) {

        Producto producto = null;
        try {
            Connection conexion = ConexionBD.obtenerConexion();

            String sql = "select * from producto where codigo =?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int codigoobtenido = rs.getInt("codigo");
                String nombre = rs.getString("nombre");
                int stock = rs.getInt("stock");
                double precio = rs.getDouble("precio");

                producto = new Producto(codigoobtenido, nombre, stock, precio);
            }

            conexion.close();
            ps.close();
            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(MantenimientoProducto.class.getName()).log(Level.SEVERE, null, ex);
        }

        return producto;
    }

    public int registrar(Producto p) {
        int filasAfectadas = 0;
        try {
            Connection conexion = ConexionBD.obtenerConexion();
            String sql = "insert into producto(codigo,nombre,stock,precio) values(?,?,?,?)";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, p.getCodigo());
            ps.setString(2, p.getNombre());
            ps.setInt(3, p.getStock());
            ps.setDouble(4, p.getPrecio());

            filasAfectadas = ps.executeUpdate();

            conexion.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(MantenimientoProducto.class.getName()).log(Level.SEVERE, null, ex);
        }

        return filasAfectadas;
    }

    public int acutalizar(Producto productoNuevo) {
        int filasAfectadas = 0;
        try {
            Connection conexion = ConexionBD.obtenerConexion();
            String sql = "update producto set nombre=?, stock=?, precio=? where codigo=?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, productoNuevo.getNombre());
            ps.setInt(2, productoNuevo.getStock());
            ps.setDouble(3, productoNuevo.getPrecio());
            ps.setInt(4, productoNuevo.getCodigo());

            filasAfectadas = ps.executeUpdate();

            conexion.close();
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(MantenimientoProducto.class.getName()).log(Level.SEVERE, null, ex);
        }

        return filasAfectadas;
    }

    public int eliminar(int codigo) {
        int filasAfectadas = 0;
        try {
            Connection conexion = ConexionBD.obtenerConexion();
            String sql = "delete from producto where codigo=?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, codigo);
            filasAfectadas=ps.executeUpdate();           
            conexion.close();ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(MantenimientoProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return filasAfectadas;
    }
}
