
package edu.claudio.ejemplos.lambdas;

import edu.claudio.ejemplos.model.Persona;
import edu.claudio.ejemplos.model.Producto;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Aplicacion {
    public static void main(String[] args) {
        Producto pr1 =new Producto(10, "elevision", 2600);
        Producto pr2 =new Producto(11, "PlayStation", 5200);
        Producto pr3 =new Producto(12, "Celular", 3500);
        Producto pr4 =new Producto(13, "Radio", 1800);
 
        List<Producto>producto=new ArrayList<>();
        producto.add(pr1);
        producto.add(pr2);
        producto.add(pr3);
        producto.add(pr4);
        
        List<Persona>persona=new ArrayList<>();
        
        persona.add(new Persona(100, "Claudio", LocalDate.of(1992, 10, 4)));
        persona.add(new Persona(101, "Rosa", LocalDate.of(1989, 10, 23)));
        persona.add(new Persona(102, "Ines", LocalDate.of(1987, 4,21 )));
        persona.add(new Persona(103, "Yanet", LocalDate.of(1985, 10, 6)));
        persona.add(new Persona(104, "Soledad", LocalDate.of(1982, 10, 10)));
        
                
        for(Persona person:persona){
            System.out.println(person);
        }
        
        //vamos a hacer lo mismo con Expresiones Lambda:
        System.out.println("==================");
        persona.forEach(p -> System.out.println(p));
        System.out.println("");
        System.out.println("LISTA FILTRADA");
        List <Persona> newPersona=persona.stream()
                                         .filter(p -> Aplicacion.obtenerEdad(p.getBirthdate())>=35)
                                         .collect(Collectors.toList());
        
        List <String> newListaEdad= persona.stream()
                                            //.map(p -> p.getBirthdate().getYear())
                                            .map(p -> "Codigo: "+p.getId())
                                            .collect(Collectors.toList());
        
        Aplicacion.imprimirLista(newListaEdad);
    }
    
    public static int obtenerEdad(LocalDate birthDate){
          return Period.between(birthDate, LocalDate.now()).getYears();
    }
    
    public static void imprimirLista (List<?> nuevaLista){
        nuevaLista.forEach(System.out::println);
    }
 
}
