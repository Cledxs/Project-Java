
package edu.claudio.ejemplos.auditoria;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EjemploLogging {
    //1. Definir un objeto de tipo Logger para hacer la auditioria (estatica y privada); final porque es valor unico.
    private static final Logger logger = Logger.getLogger(EjemploLogging.class.getName());

    public static void main(String[] args) {
        
        logger.log(Level.INFO, "Este es un mensaje informativo");
        logger.log(Level.WARNING, "Este es un mensaje de advertencia");
        
        //Tambien se puede hacer:
        logger.info("Mensaje informativo");
        logger.warning("Mensaje de advertencia");
        
        //Auditar una variable
        String nombreUsuario = "cpaitan";
        logger.log(Level.WARNING,"El usuario {0} ya esta en uso", nombreUsuario);
        
        //Para auditar mas de una variable:
        int edad =28;
        double salario=2000;
        //Creamos un arreglo de tipo Object, que almacene las variables (Es un arreglo especial para este caso)
        Object[] datos = new Object[]{nombreUsuario,edad,salario};  //Object es la clase padre de todo lo que existe en java. Todo lo que esta en java es un Object.
        
        logger.log(Level.SEVERE, "El nombre de usuario {0} no corresponde con la edad {1} y salario {2}", datos);
        
    
        
    }
    
}
