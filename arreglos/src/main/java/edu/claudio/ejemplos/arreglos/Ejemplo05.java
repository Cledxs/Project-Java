
package edu.claudio.ejemplos.arreglos;

import edu.claudio.ejemplos.model.Alumno;
import edu.claudio.ejemplos.model.Cursos;
import java.util.Arrays;


public class Ejemplo05 {
    
    public static void main(String[] args) {
      Cursos[] curso= new Cursos[2];
      curso[0]=new Cursos("Claudio", new double[]{13,14,16});
      
      Alumno alumno01=new Alumno("Claudio", "Paitan", curso);
        System.out.println(Arrays.toString(alumno01.getCurso()));

    }
}
