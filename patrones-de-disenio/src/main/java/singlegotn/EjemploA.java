
package singlegotn;

import java.util.ArrayList;
import java.util.List;

public class EjemploA {
    private static EjemploA instancia;
    public static EjemploA getInstancia(){
        if(instancia==null){
            instancia = new EjemploA();
        }
        return instancia;
    }

    private List<Perro> perros;
    
    public List<Perro> getLista(){
        
        if(perros == null){
        perros=new ArrayList<>();    
        Perro p1 = new Perro("Skard");
        Perro p2 = new Perro ("Bimbo");
        Perro p3 = new Perro("Lulu");
        Perro p4 = new Perro("Niata");
        Perro p5 = new Perro("Chiquita");
        perros.add(p1);
        perros.add(p2);
        perros.add(p3);
        perros.add(p4);
        perros.add(p5);
        }
        return perros; 
    }

    public List<Perro> getPerros() {
        return perros;
    }
    
    
}
