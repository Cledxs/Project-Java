
package edu.claudio.ejemplos.jdbc.basico.utilidades;
//Va a ser una clase funcional, solo nos servira para conectarnos a una base de datos
//Una clase funcional, se orienta solo a sus metodos.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionBD {
    
    //Defino un constructor privado, para que no se creen instancias
    private ConexionBD(){  // nos inabilita el uso de "new" para la creacion de objetos  
    }
  
    public static Connection obtenerConexion(){
        Connection conexion = null;
        
        //Para conectarnos a una base de datos se necesitan 3 cosas: 
        //1.-Cadena de Conexion  
        String cadenaConexion= "jdbc:mysql://localhost:3306/cledxs28?serverTimezone=UTC";
        //2.-Ususario
        String usuario="root";
        //3.-Password
        String password="cledxs1234";
        
        try {
            //Vamos a crear una conexion:

            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion=DriverManager.getConnection(cadenaConexion, usuario, password);
        } catch (ClassNotFoundException | SQLException e) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return conexion;
    }
}
