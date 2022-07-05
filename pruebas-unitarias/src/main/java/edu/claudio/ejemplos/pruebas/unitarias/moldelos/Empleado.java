
package edu.claudio.ejemplos.pruebas.unitarias.moldelos;

public class Empleado {
   private int codigo;
   private String nombre;
   private String cargo;
   private double sueldoBruto;
   private String usuario;
   private String password;

    public Empleado() {
    }

    public Empleado(int codigo, String nombre, String cargo, double sueldoBruto, String usuario, String password) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cargo = cargo;
        this.sueldoBruto = sueldoBruto;
        this.usuario = usuario;
        this.password = password;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   
   
}
