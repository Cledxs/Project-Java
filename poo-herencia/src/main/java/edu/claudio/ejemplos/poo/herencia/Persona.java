
package edu.claudio.ejemplos.poo.herencia;

public class Persona {
    protected String dni;
    protected String nombre;
    protected String apellido;

    public Persona(String Dni, String nombre, String apellido) {
        this.dni = Dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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
    
    public void mostrarResultados(){
        System.out.println("DNI: "+dni);
        System.out.println("Nombre: "+ nombre);
        System.out.println("Apellido: "+ apellido);
    }
  
}
