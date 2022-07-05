
package edu.claudio.ejemplos.utilidades.constantes;

public enum EquipoFutbol {
    BARCELONA(1,"Barza",20000),
    REAL_MADRID(2,"Madridista",30000),
    MACHESTER_UNITED(3, "Rojos",40000),
    CHELSEA(4,"Azules",50000);
  
    private int codigo;
    private String nombre;
    private double ingresoAnual;

    private EquipoFutbol(int codigo, String nombre,double ingresoAnual) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ingresoAnual=ingresoAnual;
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

    public double getIngresoAnual() {
        return ingresoAnual;
    }

    public void setIngresoAnual(double ingresoAnual) {
        this.ingresoAnual = ingresoAnual;
    }
    
}
