
package edu.claudio.ejemplos.examen.parcial.cibertec;

public enum CargoEmpleadoFijo {
    TECNICO("Tecnico",14.50),
    ADMINISTRATIVO("Administrativo",11.20),
    MEDICO("Medico",12.80),
    OPERARIO("Operario",18);
    
    private String cargoEmpleado;
    private double bonoPorHoraExtra;

    private CargoEmpleadoFijo(String cargoEmpleado, double bonoPorHoraExtra) {
        this.cargoEmpleado = cargoEmpleado;
        this.bonoPorHoraExtra = bonoPorHoraExtra;
    }

    public String getCargoEmpleado() {
        return cargoEmpleado;
    }

    public void setCargoEmpleado(String cargoEmpleado) {
        this.cargoEmpleado = cargoEmpleado;
    }

    public double getBonoPorHoraExtra() {
        return bonoPorHoraExtra;
    }

    public void setBonoPorHoraExtra(double bonoPorHoraExtra) {
        this.bonoPorHoraExtra = bonoPorHoraExtra;
    }
    
    
}
