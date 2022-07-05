package edu.claudio.ejemplos.examen.parcial.cibertec;

public class Contratista extends Persona {

    private int horasTrabajadas;
    private double tarifaPOrHora;
    private boolean seguroSalud;

    public Contratista() {
    }

    public Contratista(int horasTrabajadas, double tarifaPOrHora, boolean seguroSalud, String dni, String nombre, String apellido, int mesPago, TipoEmpleado tipoEmpleado) {
        super(dni, nombre, apellido, mesPago, tipoEmpleado);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPOrHora = tarifaPOrHora;
        this.seguroSalud = seguroSalud;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaPOrHora() {
        return tarifaPOrHora;
    }

    public void setTarifaPOrHora(double tarifaPOrHora) {
        this.tarifaPOrHora = tarifaPOrHora;
    }

    public boolean isSeguroSalud() {
        return seguroSalud;
    }

    public void setSeguroSalud(boolean seguroSalud) {
        this.seguroSalud = seguroSalud;
    }

    public double calcularSueldoBase() {
        if(this.mesPago==6){
            this.tarifaPOrHora=1.135*this.tarifaPOrHora;
        }
        return this.horasTrabajadas * this.tarifaPOrHora;
    }

    public double descuentoImpuestoRenta() {
        return 0.08 * calcularSueldoBase();
    }

    public double decuentoPorSeguro() {
        return 0.05 * calcularSueldoBase();
    }

    public double calcularSueldoNeto() {
        return calcularSueldoBase()-descuentoImpuestoRenta()-decuentoPorSeguro();
    }

}
