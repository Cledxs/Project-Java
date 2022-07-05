
package edu.claudio.ejemplos.archivos;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.claudio.ejemplos.models.Empleado;
import java.io.File;
import java.io.IOException;

public class EjemploLecturaJSON {
    
    public static void main(String[] args) throws IOException {
        
        ObjectMapper gestorJson = new ObjectMapper();
        
        Empleado empleadoLeido = gestorJson.readValue(new File("C:\\claudio\\EjemplosJava\\nuevoArchivo.json"), Empleado.class);
        
        System.out.println("El objeto recuperado de JSON es: "+empleadoLeido );
    }
    
}
