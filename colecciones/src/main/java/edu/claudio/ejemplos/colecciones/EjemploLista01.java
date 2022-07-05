
package edu.claudio.ejemplos.colecciones;

import java.util.ArrayList;
import java.util.List;

public class EjemploLista01 {
    
    public static void main(String[] args) {
        List<Integer> numeros=new ArrayList<>();
        numeros.add(30);
        numeros.add(35);
        numeros.add(45);
        
        System.out.println("Tamaño de la lista: "+numeros.size());
        
        for(int i=0;i<numeros.size();i++){
            System.out.println("Elemento: "+numeros.get(i));
            
        }
        System.out.println("\n=======Nueva lista==========");
        
        numeros.remove(1);
        System.out.println("tamaño de nueva lista: "+numeros.size());
        for(Integer num: numeros){
            System.out.println(num);
        }
    }
}
