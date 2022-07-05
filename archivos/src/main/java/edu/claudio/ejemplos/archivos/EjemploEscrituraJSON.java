
package edu.claudio.ejemplos.archivos;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.claudio.ejemplos.models.Empleado;
import java.io.File;
import java.io.IOException;

public class EjemploEscrituraJSON {
    
    public static void main(String[] args) throws IOException {
        Empleado empleado = new Empleado(2, "Juan",2000);
        
        ObjectMapper gestorJson= new ObjectMapper();
        
        gestorJson.writeValue(new File("C:\\claudio\\EjemplosJava\\nuevoArchivo.json"),empleado);
        System.out.println("Se ah generado el archivo JSON");
    }
    
}
