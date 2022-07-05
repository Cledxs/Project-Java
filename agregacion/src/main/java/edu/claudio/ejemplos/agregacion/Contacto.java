
package edu.claudio.ejemplos.agregacion;

public class Contacto {
    private String direccion;
    private String ciudad;
    private String distrito;
    private String correo;
    private String celular;

    public Contacto() {
    }

    public Contacto(String direccion, String ciudad, String distrito, String correo, String celular) {
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.distrito = distrito;
        this.correo = correo;
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    
}
