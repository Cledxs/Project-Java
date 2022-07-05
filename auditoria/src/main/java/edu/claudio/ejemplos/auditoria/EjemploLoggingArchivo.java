
package edu.claudio.ejemplos.auditoria;

import java.io.File;
import java.io.FileInputStream;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;


public class EjemploLoggingArchivo {
    private static final Logger logger=Logger.getLogger(EjemploLoggingArchivo.class.getName());
    public static void main(String[] args) {
        
        //Vamos a cargar las propiedades de auditoria en la aplicacion;
        
        try{
            //1.Referenciar al archivo de propiedades
            File archivoProps= new File("src/main/resources/log.properties");
            
            //2. Agregar el archivo al manejador de logs general de la app
            LogManager.getLogManager().readConfiguration(new FileInputStream(archivoProps));
            //3. Indicar donde voy a guardar los archivos de auditoria
            FileHandler gestorAuditoria = new FileHandler("C:\\claudio\\EjemplosJava\\auditoria.txt", true);
            logger.addHandler(gestorAuditoria);
        }catch(Exception e){
            logger.log(Level.SEVERE, "Exception: {0}",e);
        }
        
        //--FIN:
        //Añadimos los mensajes
        logger.info("Mensaje informativo");
        logger.warning("Alerta!");
        logger.severe("Peligro!");
        
        
    }
    
}
