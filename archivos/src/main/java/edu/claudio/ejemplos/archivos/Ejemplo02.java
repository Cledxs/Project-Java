
package edu.claudio.ejemplos.archivos;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
public class Ejemplo02 {
    
    public static void main(String[] args) {
    
        try {
            Path rutaArchivo = Paths.get("C:\\claudio\\EjemplosJava\\Cpch.txt");
            
            List<String> lineas = Files.readAllLines(rutaArchivo);
            lineas.stream().forEach(System.out::println);
        } catch (IOException ex) {
            System.err.println("No se puede leer el archivo: "+ex);
        }
        
    }
    
}
