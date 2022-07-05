
package edu.claudio.ejemplos.simulacro.model;

import java.time.Instant;

public class Persona {
    protected String dni;
    protected String nombre;
    protected String apPaterno;
    protected String apMaterno;
    protected Instant fecNacimiento;
    protected String correo;

    public Persona() {
    }

    public Persona(String dni, String nombre, String apPaterno, String apMaterno, Instant fecNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.fecNacimiento = fecNacimiento;
        this.correo = obtenerCorreo();
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

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public Instant getFecNacimiento() {
        return fecNacimiento;
    }

    public void setFecNacimiento(Instant fecNacimiento) {
        this.fecNacimiento = fecNacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public final String obtenerCorreo(){
         String gmail = this.nombre.charAt(0)
                +this.apPaterno.substring(0, 3)
                +this.apMaterno.substring(0, 3)
                +this.dni.charAt(0) + this.dni.charAt(this.dni.length()-1)
                +"@cibertec.edu.pe";
        return gmail.toLowerCase();
    }

    @Override
    public String toString() {
        StringBuilder datosPersona=new StringBuilder();
                datosPersona.append("DNI: ").append(this.dni).append("\n")
                        .append("Nombre: ").append(this.nombre).append("\n")
                        .append("Apellidos: ").append(this.apPaterno).append(" ").append(this.apMaterno).append("\n")
                        .append("Fecha Nacimiento: ").append(this.fecNacimiento).append("\n")
                        .append("Correo electronico: ").append(this.correo).append("\n");
                      
        return  datosPersona.toString();
    }
    
    
}
