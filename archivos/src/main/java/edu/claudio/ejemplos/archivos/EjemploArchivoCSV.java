package edu.claudio.ejemplos.archivos;

import edu.claudio.ejemplos.models.Producto;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class EjemploArchivoCSV {

    public static void main(String[] args) throws IOException {
        Path rutaArchivo = Paths.get("C:\\claudio\\EjemplosJava\\documento.csv");

        List<String> lineas = Files.readAllLines(rutaArchivo, Charset.defaultCharset());

        lineas.stream().forEach(System.out::println);

        System.out.println("============================================");

        String[] datos = lineas.get(0).split(",");

        for (String dato : datos) {
            System.out.println(dato);
        }
         
        for (int i = 0; i < lineas.size(); i++) {
            String[] datosProducto = lineas.get(i).split(",");
            int codigo = Integer.parseInt(datosProducto[0]);
            String nombre = datosProducto[1];
            int stock = Integer.parseInt(datosProducto[2]);
            double precio = Double.parseDouble(datosProducto[3]);
            
            Producto p = new Producto(codigo, nombre, stock, precio);
            System.out.println(p);
  
        }

    }

}
