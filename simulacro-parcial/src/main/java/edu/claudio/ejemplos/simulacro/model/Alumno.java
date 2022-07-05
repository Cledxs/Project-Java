
package edu.claudio.ejemplos.simulacro.model;

import java.time.Instant;

import java.util.List;
//import java.util.stream.Collectors;

public class Alumno extends Persona {
    private String carrera;
    private List <Curso> cursos ;
    
    public Alumno() {
    }

    public Alumno(String carrera, List<Curso> cursos, String dni, String nombre, String apPaterno, String apMaterno, Instant fecNacimiento) {
        super(dni, nombre, apPaterno, apMaterno, fecNacimiento);
        this.carrera = carrera;
        this.cursos = cursos;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
    
    public int obtenerNumeroCursos(){
          return cursos.size();
    }
    
    public double obtenerPromedioCurso(int codigo){
       double promedioCurso=0;
        for(Curso c : this.cursos){
            if (c.getCodigo()== codigo){
                promedioCurso=c.calcularPromedio();
                break;
            }
        }
        
        //cursos.stream().filter(c->c.getCodigo()==codigo).collect(Collectors.toList() ).get(0).calcularPromedio();
       
      return promedioCurso;  
    }
    
    public double obtenerPromedioPonderado(){
        double sumaPromedio=0;
        for (Curso c:cursos){
            sumaPromedio +=c.calcularPromedio();
        }
        return sumaPromedio/cursos.size();
    }

    @Override
    public String toString() {
        StringBuilder datosAlumno = new  StringBuilder();
        datosAlumno.append("Carrera: ").append(this.carrera).append("\n")
                .append("N° de cursos:").append(obtenerNumeroCursos()).append("\n")
                .append("Cursos: ").append(this.cursos).append("\n")
                .append("Promedio ponderado: ").append(obtenerPromedioPonderado()).append("\n");
        
        
        return "DATOS DEL ALUMNO\n"+super.toString()+datosAlumno.toString();
        
    }
    
    
    
}
