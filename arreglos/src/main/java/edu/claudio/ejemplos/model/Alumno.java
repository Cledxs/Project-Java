
package edu.claudio.ejemplos.model;

public class Alumno {
    private String nombre;
    private String apellido;
    private Cursos [] curso;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, Cursos[] curso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Cursos[] getCurso() {
        return curso;
    }

    public void setCurso(Cursos[] curso) {
        this.curso = curso;
    }

   

    
    
}
