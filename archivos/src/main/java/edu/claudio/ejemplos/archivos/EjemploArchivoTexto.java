
package edu.claudio.ejemplos.archivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EjemploArchivoTexto {
    public static void main(String[] args) {
        try {
            BufferedWriter escritorTexto = new BufferedWriter(new FileWriter("C:\\Users\\CLAUDIO\\Documents\\NetBeansProjects\\archivos\\cledxs.txt",true));
            
            escritorTexto.append("\nHola como estas?");
            escritorTexto.append("\nBien y tu?");
            escritorTexto.close();
             
           
        } catch (IOException ex) {
            Logger.getLogger(EjemploArchivoTexto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
