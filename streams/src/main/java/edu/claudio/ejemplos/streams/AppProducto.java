
package edu.claudio.ejemplos.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class AppProducto {
    public static void main(String[] args) {

        List<Producto> producto = new ArrayList<>();
        producto.add(new Producto(100, "Gaseosa", 50, 2.5));
        producto.add(new Producto(101, "Cigarros", 100, 1.5));
        producto.add(new Producto(103, "Cerveza", 20, 4));
        producto.add(new Producto(105, "Vinos", 5, 20));
        producto.add(new Producto(106, "Paneton", 12, 17.5));
        
        System.out.println("Tamaño de la coleccion: "+producto.size());
        producto.stream().forEach(System.out::println);
        
        boolean hayStock=false;
        int conteoStock=0;
       for(Producto p:producto){
           if (p.getStock()==0){
                 hayStock=true;
                 conteoStock++;
                
           } 
        }   
           if(hayStock==true){
            System.out.println("Hay produtos sin stock"); 
               System.out.println("Hay "+conteoStock+ " Sin stock");
           }else{
               System.out.println("Todos los productos tienen Sotck");
           }
         System.out.println("=============================");  
         //Usando Streams
         
         boolean hayStockStream=producto.stream().anyMatch(p->p.getStock()==0);
         
         if(hayStockStream==true){
             System.out.println("Hay productos sin stock");
         }else{
             System.out.println("Todos los prductos tienen stock");
         }
         
       //Vamos a encontrar el producto mas caro;
       
        Producto productoMasCaro=producto.get(0);
        Producto productoMasBarato=producto.get(0);
        
        for(Producto p : producto){
            if(p.getPrecio()>productoMasCaro.getPrecio()){
                productoMasCaro=p;
            }
            
            if (p.getPrecio()<productoMasBarato.getPrecio()){
                productoMasBarato=p;
            }
        }
        
        System.out.println("El producto mas caro es: "+productoMasCaro);
        System.out.println("El producto mas barato es: "+productoMasBarato);
        
        
        // Ahora necontraremos el producto mas caro y mas barato con Streams
        System.out.println("================Streams=====================");
        Producto productoMasCaroStream=producto.stream().max(Comparator.comparing(p -> p.getPrecio())).get();
        Producto productoMasBaratoStream=producto.stream().min(Comparator.comparing(Producto ::getPrecio)).get();
        
        System.out.println("El producto mas barato es: \n"+productoMasBaratoStream);
        System.out.println("El producto mas caro es: \n"+productoMasCaroStream);
           
       //ORdenar en forma ascendende
        System.out.println("ORDENADO EN FORMA ASCENDENTE RESPECTO AL STOCK:");
        producto.stream().sorted(Comparator.comparing(Producto :: getStock)).forEach(System.out::println);
       
        System.out.println("ORDENADO EN FORMA DESCENDENTE RESPECTO AL STOCK:");
        producto.stream().sorted(Comparator.comparing(Producto::getStock).reversed()).forEach(System.out::println);
        
                 
    }
}
