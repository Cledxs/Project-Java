
package edu.claudio.ejemplos.agregacion;

public class Empleado {
    private String nombre;
    private String dni;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int edad;
    private Contacto datosContacto;

    public Empleado() {
    }

    public Empleado(String nombre, String dni, String apellidoPaterno, String apellidoMaterno, int edad, Contacto datosContacto) {
        this.nombre = nombre;
        this.dni = dni;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.edad = edad;
        this.datosContacto = datosContacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Contacto getDatosContacto() {
        return datosContacto;
    }

    public void setDatosContacto(Contacto datosContacto) {
        this.datosContacto = datosContacto;
    }

 
    
}
