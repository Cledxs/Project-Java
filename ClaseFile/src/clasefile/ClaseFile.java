
package clasefile;

import java.io.File;

public class ClaseFile {

    public static void main(String[] args) {
     File directorio = new File("carpetaprueba");
    
     if(directorio.exists()){
         System.out.println("El directorio abosulta del archivo: "+directorio.getAbsolutePath());
         System.out.println("¿Es un directorio? ---> "+ directorio.isDirectory());
         System.out.println("¿Se puede leer?----> "+ directorio.canRead());
         System.out.println("");
     }
     else{
         System.out.println("El archivo no existe");
     }
    
    }
    
}
