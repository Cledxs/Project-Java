
package edu.claudio.ejemplos.basededatos.jdbc.utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
//Definimos una clase funcional, es decir solo tiene metodos. Esta clase tiene la funcion de hacer una conexion con una base de datos
public class ConexionBD { 

    private ConexionBD() { //Creamos el constructor por defecto, en modo privado para evitar que se creen objetos
    }
    //Creamos un metodo con retorno de tipo Connection, la cual sirve para obtener una conexion a una base de datos determinada
    public static Connection obtenerConexion(){ 
        Connection conexion = null;
        
        //Para establecer una conexion a una base de datos se necesitan 3 cosas:
        //1. Cadena de conexion             //IP  :puerto de mysql(3306)/nombre de la base detatos?
        String cadenaConexion = "jdbc:mysql://localhost:3306/cibertec22?serverTimezone=UTC";
        //2. Ususario, generalmente es root, es decir tenemos permiso para toda la informacion
        String usuraio = "root";
        //3. pasword con la que se ingresa a la base de datos
        String pasword = "cledxs1234";
        
        try {
            //Cargar el driver de mysql a nuestro programa, la cual nos permite ya hacer la conexion
            Class.forName("com.mysql.cj.jdbc.Driver"); //Este comando permite cargar driver (Class.forName)
            //Ya con el driver cargado, creamos la conexion
            conexion = DriverManager.getConnection(cadenaConexion, usuraio, pasword);
        } catch (Exception e) {
           e.printStackTrace();
        } 
        
        return conexion;
    }

}
