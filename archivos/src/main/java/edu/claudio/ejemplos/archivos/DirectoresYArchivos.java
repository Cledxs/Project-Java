   
package edu.claudio.ejemplos.archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DirectoresYArchivos {
    private File archivo;
    
    public void crearCarpeta(){
        archivo = new File("C:/claudio/EjemplosJava/cledxs");
        if(archivo.exists()){
            System.out.println("Ya existe una carpeta con el mismo nombre");
        }else if(archivo.mkdir()){
            System.out.println("Se ah creado la carpeta");
        }else{
            System.out.println("No se puede crear el archivo, verifique la ruta");
        }
       
    }
    
    public void crearArchivo(){
        
        archivo = new File("C:/claudio/EjemplosJava/cledxs.mp3");
        
        try {
            if(archivo.createNewFile()){
                System.out.println("Se ah creado el archivo");
            }
            
        } catch (IOException ex) {
            System.err.println("No se pudo crear el archivo: "+ex);
        }

    }
    
    public void escribirTexto(){ 
        try {
            FileWriter escritor = new FileWriter("C:\\Users\\CLAUDIO\\Documents\\NetBeansProjects\\archivos\\claudio.txt");
            escritor.write("Holas");
            escritor.write("\nMe llamo claudio");
            
            escritor.close();
            
        } catch (IOException ex) {
            System.err.println("Error, no se pudo escribir sobre el archivo");
        }
    }
    
    public void addTexto(){
      try (FileWriter escritor = new FileWriter("C:\\Users\\CLAUDIO\\Documents\\NetBeansProjects\\archivos\\claudio.txt",true)){ //Try con recursos, no necesita cerrar el lector o escritor
            
            escritor.write("Estoy en la escuela");
            escritor.write("\nEstoy estudiando");
 
            
        } catch (IOException ex) {
            System.err.println("Error, no se pudo escribir sobre el archivo");
        }      
    }
    
    public void lecturaTexto(){
        try {                                           //Try sin recursos si necesita ser cerrado el lector o escritor
            FileReader lector = new FileReader("C:\\claudio\\EjemplosJava\\Cpch.txt");
            BufferedReader lectura = new BufferedReader(lector);
            String text = lectura.readLine();
            while(text!=null){
                System.out.println(text);
                text = lectura.readLine();
            }
            lectura.close();
        } catch (FileNotFoundException ex) {
            System.err.println("No se puede leer el archivo "+ex);
        }catch (IOException ex) {
            System.err.println("Error "+ex);
        }
    }
    
    public void lectorConNIO(){
        Path ruta = Paths.get("C:\\Users\\CLAUDIO\\Documents\\NetBeansProjects\\archivos\\claudio.txt");
        
        try {
            List<String> linea = Files.readAllLines(ruta);
            
            linea.stream().forEach(System.out::println);
        } catch (IOException ex) {
            Logger.getLogger(DirectoresYArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
    }
    
    
    
    public static void main(String[] args) {
        DirectoresYArchivos cledxs = new DirectoresYArchivos();
        
        //cledxs.crearCarpeta();
       // cledxs.crearArchivo();
        //cledxs.escribirTexto();
        //cledxs.addTexto();
        cledxs.lecturaTexto();
        //cledxs.lectorConNIO();
        
        
        
    }
    
 
    
}
