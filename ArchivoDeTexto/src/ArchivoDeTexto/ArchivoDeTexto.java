
package ArchivoDeTexto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ArchivoDeTexto {
    File archivo;
    
    private void crearArchivo(){
        archivo = new File("C:\\Users\\CLAUDIO\\Documents\\NetBeansProjects\\ArchivoDeTexto\\textoprueba.txt");
        
        try {
            if(archivo.createNewFile()){
                System.out.println("El archivo se ah creado correctamente");
            }
        } catch (IOException ex) {
            System.err.println("No se pudo crear el archivo"+ex);
        }
    }
    
    private void escribirTexto(){
        try {
            FileWriter escribir = new FileWriter(archivo);
            escribir.write("Hola que tal");
            escribir.write("\r\n¿Como estas?");
            escribir.write("\r\n¿Cual es tu nombre?");
            escribir.close();
        } catch (IOException ex) {
            System.err.println("Error no se pudo escribir sobre el archivo");
        }
    }
    
    private void crearDirectorio(){
        archivo =new File("carpetaprueba");
        
        if(archivo.mkdir()){
            System.out.println("Se ah creado el directorio correctamente");
        }
        else {
            System.err.println("No se ah podido crear el directorio");
        }
    }
    
    private void añadirTexto(){
       try {
            FileWriter escribir = new FileWriter(archivo, true);
            escribir.write("\r\nDonde vives");
            escribir.write("\r\nmucho gusto");
            escribir.write("\r\nGood bye.");
            escribir.close();
        } catch (IOException ex) {
            System.err.println("Error no se pudo escribir sobre el archivo");
        }
    }
    private void leerTexto(){
        
        String cadena;
        try {
            FileReader lector = new FileReader(archivo);
            
         BufferedReader lectura = new BufferedReader(lector);
          
         cadena=lectura.readLine();
         
         while(cadena!=null){
          System.out.println(cadena);   
          cadena=lectura.readLine();
         }
         
        } catch (FileNotFoundException ex) {
            System.err.println("Error, "+ex);
        }
         catch (IOException ex) {
             
         }
               
    }
    
    
    
    public static void main(String[] args) {
        ArchivoDeTexto archivo = new ArchivoDeTexto();
        archivo.crearArchivo();
        //archivo.escribirTexto();
        //archivo.añadirTexto();
        //archivo.crearDirectorio();
        archivo.leerTexto();
        
    }
    
}
