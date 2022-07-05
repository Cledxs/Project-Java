
package edu.claudio.ejemplos.archivos;

import edu.claudio.ejemplos.models.Producto;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;



public class EjemploDeserializacion {
    public static void main(String[] args) {
        String ruta = "C:\\claudio\\EjemplosJava\\cledxs2.txt";

        try {
            ObjectInputStream lectorArchivo = new ObjectInputStream(new FileInputStream(ruta));
            Producto p01 =(Producto) lectorArchivo.readObject();
            
            System.out.println("El objecto recuperado es: "+p01);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EjemploDeserializacion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EjemploDeserializacion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EjemploDeserializacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
}
