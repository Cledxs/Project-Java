
package edu.claudio.ejemplos.examen.parcial.cibertec;

public enum TipoEmpleado {
    FIJO("Fijo"),
    CONTRATISTA("Contratista"),
    CONSULTOR("Consultor");
    
    private String Tipoempleado;

    private TipoEmpleado(String Tipoempleado) {
        this.Tipoempleado = Tipoempleado;
    }

    public String getTipoempleado() {
        return Tipoempleado;
    }

    public void setTipoempleado(String Tipoempleado) {
        this.Tipoempleado = Tipoempleado;
    }
    
    
    
}
