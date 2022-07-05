
package edu.claudio.ejemplos.simulacro.parcial;

import edu.claudio.ejemplos.simulacro.model.Alumno;
import edu.claudio.ejemplos.simulacro.model.Curso;
import edu.claudio.ejemplos.simulacro.model.Docente;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;





public class AppCibertec {
    public static void main(String[] args) {
        
        System.out.println("===============DOCENTES=============\n");
        List<Docente>docentes=new ArrayList<>();
        docentes.add(new Docente(240, 25, true, "12345678", "Carlos", "Tataje", "Salinas", Instant.now()));
        docentes.add(new Docente(185, 18, false, "46531585", "Susana", "Mendoza", "Huari", Instant.now()));
        docentes.add(new Docente(600, 40, false, "72345784", "Jose", "Malca", "Torres", Instant.now()));
        
        docentes.stream().forEach(System.out::println);
        
        System.out.println("==============ALUMNOS================\n");
          
        List<Curso> cursos01 =new ArrayList<>();
        cursos01.add(new Curso(1, "Matematica", 5, new double []{15,11,18,16.5})  );
        cursos01.add(new Curso(2, "Dibujo para ingenieria", 4, new double[]{13,11,18}) );
        
        List<Curso> cursos02 = new ArrayList<>();
        cursos02.add(new Curso(3, "Biologia", 5, new double[]{15,17}));
        cursos02.add(new Curso(4, "Quimica", 6, new double[]{12,18,14.5}));
        
        List<Curso> cursos03 = new ArrayList<>();
        cursos03.add(new Curso(5, "Economia", 4, new double[]{15,11,8.5,13}));
        cursos03.add(new Curso(6, "Etica", 3, new double[]{17,13}));
        
        
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Ing. Sistemas", cursos01, "47613163", "Claudio", "Paitan", "Chuco", Instant.now()));
        alumnos.add(new Alumno("Medicina", cursos02, "4563214", "Lucia", "Gonzalo", "Paitan", Instant.now()));
        alumnos.add(new Alumno("Administracion", cursos03, "40265415", "Pamela", "Gonzalo", "Paitan", Instant.now()));
        
        alumnos.stream().forEach(System.out::println);
  
        Docente docenteMayorSueldo=docentes.stream().max(Comparator.comparing(d->d.calcularSueldoNeto())).get();
        System.out.println("\nEl docente con mayor sueldo es: "+docenteMayorSueldo.getNombre());
        
        Alumno alumnoConMayorPonderado=alumnos.stream().max(Comparator.comparing(a->a.obtenerPromedioPonderado())).get();
        System.out.println("\nEl alumno con mayor promedio ponderado es: "+alumnoConMayorPonderado.getNombre());
    
    }
}
