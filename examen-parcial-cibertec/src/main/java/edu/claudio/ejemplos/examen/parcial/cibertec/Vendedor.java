
package edu.claudio.ejemplos.examen.parcial.cibertec;

public class Vendedor extends Persona {
    private int afilidados;
    private int desafiliados;
    private double montoRecaudado;
    private final int salarioBase=650;

    public Vendedor() {
    }

    public Vendedor(int afilidados, int desafiliados, double montoRecaudado, String dni, String nombre, String apellido, int mesPago, TipoEmpleado tipoEmpleado) {
        super(dni, nombre, apellido, mesPago, tipoEmpleado);
        this.afilidados = afilidados;
        this.desafiliados = desafiliados;
        this.montoRecaudado = montoRecaudado;
    }

    public int getAfilidados() {
        return afilidados;
    }

    public void setAfilidados(int afilidados) {
        this.afilidados = afilidados;
    }

    public int getDesafiliados() {
        return desafiliados;
    }

    public void setDesafiliados(int desafiliados) {
        this.desafiliados = desafiliados;
    }

    public double getMontoRecaudado() {
        return montoRecaudado;
    }

    public void setMontoRecaudado(double montoRecaudado) {
        this.montoRecaudado = montoRecaudado;
    }
    
 //Salario base =650
    
    
}
