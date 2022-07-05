
package Binarios;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ArchivosBinarios {
   
    
    private void escribirBinario(){
        try {
            FileOutputStream archivo =new FileOutputStream("personas.bin");
            ObjectOutputStream escritura = new ObjectOutputStream(archivo);
            
            Personas persona1=new Personas("Claudio", 28);
            Personas persona2=new Personas("Daniel", 26);
            
            
            escritura.writeObject(persona1);
            escritura.writeObject(persona2);
           
            
            escritura.close();
            
        } catch (FileNotFoundException ex) {
            System.err.println("Error: "+ ex);
        } catch (IOException ex) {
            System.err.println("Error: "+ ex);
        }
    }
    
    private void leerBinarios(){
        Personas ObjetoPersona;
        try {
            FileInputStream archivo = new FileInputStream("personas.bin");
            ObjectInputStream lectura = new ObjectInputStream(archivo);
            
           while (true){
               ObjetoPersona = (Personas)lectura.readObject();
               ObjetoPersona.mostrarDatos();
               
        }
        
        } catch (EOFException ex){
            return;
        } catch (FileNotFoundException ex) {
            System.err.println("Error: "+ex);
        } catch (IOException ex) {
            System.err.println("Error: "+ex);
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: "+ex);
        }
    }
    
        private void añadirbirBinario(){
        try {
            FileOutputStream archivo =new FileOutputStream("personas.bin",true);
            AñadirContenido escritura = new AñadirContenido(archivo);
            
            Personas persona1=new Personas("Sole", 28);
            Personas persona2=new Personas("Yanet", 26);
            Personas persona3=new Personas("Ines", 30); 
            
            escritura.writeObject(persona1);
            escritura.writeObject(persona2);
            escritura.writeObject(persona3);
            
            escritura.close();
            
        } catch (FileNotFoundException ex) {
            System.err.println("Error: "+ ex);
        } catch (IOException ex) {
            System.err.println("Error: "+ ex);
        }
    }
    
    public static void main(String[] args) {
        
        ArchivosBinarios archivo = new ArchivosBinarios();
        archivo.escribirBinario();
        archivo.añadirbirBinario();
        archivo.leerBinarios();
    }
}
