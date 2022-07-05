
package edu.claudio.ejemplos.colecciones;

import java.util.List;

import java.util.ArrayList;
import java.util.Collections;



public class EjemploLista02 {
    public static void main(String[] args) {
        List<String> lenguajes= new ArrayList<>();
        lenguajes.add("Java");
        lenguajes.add("Phyton");
        lenguajes.add("C++");
        lenguajes.add("Go");
        lenguajes.add("JavaScript");
        lenguajes.add("Rubi");
        lenguajes.add("C#");
        lenguajes.add("GoLang");
        
        System.out.println("Numero de elementos: "+ lenguajes.size());
        
        System.out.println("El elemento del indice 4 es : "+lenguajes.get(5));
        System.out.println("La pasicion del elemento Go es : "+lenguajes.indexOf("Go") );
        
        
        
        for(int i=0;i<lenguajes.size();i++){
            System.out.println("lenguaje: "+lenguajes.get(i));
        }
        System.out.println("========================");
        lenguajes.remove(0);
        lenguajes.remove("GoLang");
        

        
        for(int i=0;i<lenguajes.size();i++){
            System.out.println("lenguaje: "+lenguajes.get(i));
        }
        
        System.out.println("===Otra forma========");
        lenguajes.stream().forEach(System.out::println);
       
        System.out.println(lenguajes);
        
        System.out.println("\nLista Invertida");
        Collections.reverse(lenguajes);
        
        lenguajes.stream().forEach(System.out::println);
        
        System.out.println("\nLista ordenada en orden Alfabetico");
        Collections.sort(lenguajes);
        lenguajes.stream().forEach(System.out::println);
        
       
        
        
    }
}
