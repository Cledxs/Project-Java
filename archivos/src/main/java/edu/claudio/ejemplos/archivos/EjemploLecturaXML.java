
package edu.claudio.ejemplos.archivos;


import edu.claudio.ejemplos.models.Empleado;
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class EjemploLecturaXML {
    public static void main(String[] args) {
        
        try {
            JAXBContext contexto = JAXBContext.newInstance(Empleado.class);
            Unmarshaller lectorXml = contexto.createUnmarshaller();
            
            Empleado empleadoLeido = (Empleado) lectorXml.unmarshal(new File("C:\\claudio\\EjemplosJava\\nuevoArchivo.xml"));
            
            System.out.println("El objeto recuperado de XML es: "+empleadoLeido);
        } catch (JAXBException ex) {
            System.out.println("No se puede leer el archivo");
        }
    }
    
}
