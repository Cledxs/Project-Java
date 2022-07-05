
package edu.claudio.ejemplos.colecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EjemploHashSet {
    
    public static void main(String[] args) {
        /*List<Integer> numeros = new ArrayList<>();
        numeros.add(25);
        numeros.add(30);
        numeros.add(40);
        numeros.add(25);
        numeros.add(55);
        
        System.out.println("Tamaño de la lista: "+ numeros.size());
        
        for(Integer num:numeros){
            System.out.println(num);
        }
        
        System.out.println("==============");
        
        numeros.stream().forEach(System.out::println);
        
        System.out.println("============");
        System.out.println(numeros);
        */
        System.out.println("\nUsando otraColeccion");
        
        Set<String> lenguajesSet=new HashSet<>();
        
        lenguajesSet.add("Java");
        lenguajesSet.add("PHP");
        lenguajesSet.add("Ruby");
        lenguajesSet.add("Java");
        
        lenguajesSet.stream().forEach(System.out::println);
        
      
        
        
                
       
    }
}
