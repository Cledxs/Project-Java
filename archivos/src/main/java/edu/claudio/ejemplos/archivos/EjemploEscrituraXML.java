
package edu.claudio.ejemplos.archivos;

import edu.claudio.ejemplos.models.Empleado;
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class EjemploEscrituraXML {
    public static void main(String[] args) throws JAXBException {
        //1. Definir un componente que permite gestionar archivos de tipo XML
        JAXBContext contexto = JAXBContext.newInstance(Empleado.class);
       
        //2. Definir el componente que permite guardar archivos XML
        Marshaller escritorXml = contexto.createMarshaller();

        //3. Crear o utilizar el objeto que queremos guardar
        Empleado empleado1 = new Empleado(100, "Claudio", 5000);
        //4. Definir la ruta donde vamos a guardar el objeto en formato XML
        String rutaArchivo ="C:\\claudio\\EjemplosJava\\nuevoArchivo.xml";
        
        //5. Guardar el objeto en formato XML utilizando el componente instanciado con MArsheller
        escritorXml.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE); //Para que salga formateado y no en una sola linea
        escritorXml.marshal(empleado1, new File(rutaArchivo));
        
        System.out.println("El archivo xml fue serializado correctamente");
    }
    
}
