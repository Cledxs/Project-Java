
package edu.claudio.ejemplos.archivos;

import edu.claudio.ejemplos.models.Producto;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EjemploSerializacion {
    
    public static void main(String[] args) {
        Producto p01 = new Producto(1, "Lapatop", 5, 3500);
        System.out.println("Producto01: "+p01);
        
        //Vamos a serializar el producto en un archivo
        
        try(ObjectOutputStream escritorObjeto= new ObjectOutputStream(new FileOutputStream("C:\\claudio\\EjemplosJava\\cledxs2.txt"))){
            escritorObjeto.writeObject(p01);
            System.out.println("El objeto ah sido serializado");
        }catch (IOException ex){
            ex.printStackTrace();
        }
        
    }
    
}
