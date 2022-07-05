
package edu.claudio.ejemplos.model;

import java.time.LocalDate;

public class Persona {
    private int id;
    private String nombre;
    private LocalDate birthdate;

    public Persona() {
    }

    public Persona(int id, String nombre, LocalDate birthdate) {
        this.id = id;
        this.nombre = nombre;
        this.birthdate = birthdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        StringBuilder infoPersona= new StringBuilder();
        infoPersona.append("ID: ").append(id).append("\n")
                .append("Nombre: ").append(nombre).append("\n")
                .append("Fecha nacimiento: ").append(birthdate).append("\n");
        
        return infoPersona.toString();
    }
    
    
}
