

package edu.claudio.ejemplos.archivos;

import java.io.File;

public class Ejemplo01 {

    public static void main(String[] args) {
        
        String rutaCarpetaBase = "C:/Ejemplos/";
        
        String rutaCarpetaNueva = rutaCarpetaBase+"CarpetaPrueba";
        
        File carpetaNueva = new File(rutaCarpetaNueva); //Crea un vinculo entre la aplicacion y el sistema de archivos
       
        
        if(carpetaNueva.exists()){
            System.out.println("El archivo si existe"); 
        }else{
        System.out.println("El archivo no existe");
        } 
        
        
    }
}
