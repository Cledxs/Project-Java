
package singlegotn;


public class EjemploB {
    public static void main(String[] args) {
        EjemploA obj2 = new EjemploA();
        EjemploA obj = new EjemploA();
       
        for(Perro p1 : obj.getLista()){
            System.out.println(p1);
        }
        System.out.println("=================");
        for(Perro p :obj.getLista()){
            System.out.println(p);
        }
        System.out.println("=================");
         for(Perro p :obj2.getLista()){
            System.out.println(p);
        }
        
        System.out.println("Final");
 
    }
}
