
package edu.claudio.ejemplos.simulacro.model;

import java.time.Instant;

public class Docente extends Persona{
    private int horas;
    private double tarifa;
    private boolean cordinador;

    public Docente(int horas, double tarifa, boolean cordinador, String dni, String nombre, String apPaterno, String apMaterno, Instant fecNacimiento) {
        super(dni, nombre, apPaterno, apMaterno, fecNacimiento);
        this.horas = horas;
        this.tarifa = tarifa;
        this.cordinador = cordinador;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public boolean isCordinador() {
        return cordinador;
    }

    public void setCordinador(boolean cordinador) {
        this.cordinador = cordinador;
    }
    
    public double calcularSueldoBruto(){
        return this.horas*this.tarifa;
    }
    
    public double calculcarBonificacion(){ 
        return this.cordinador? 0.07*calcularSueldoBruto(): 0.0;
    }
    
    public double calcularDescuento(){
        return 0.10*calcularSueldoBruto()+0.12*calcularSueldoBruto();
    }
    
    public double descuentoPorHoraDictada(){
        return this.horas<8? 0.04*calcularSueldoBruto():0.02*calcularSueldoBruto();
    }
    
    public double calcularSueldoNeto(){
        return calcularSueldoBruto()+calculcarBonificacion()-calcularDescuento()-descuentoPorHoraDictada();
    }
    
    public double bonoRecauadacion (double recaudado){
        double bono=0;
        int n =1;
        while(1000*n<=recaudado){
            bono+=150;
            n++;
        }
        return bono;
    }

    @Override
    public String toString() {
        
        StringBuilder datosDocente = new StringBuilder();
        datosDocente.append("Horas trabajadas: ").append(this.horas).append("\n")
                .append("Tarifa por hora: ").append(this.tarifa).append("\n")
                .append("Coordinador: ").append(this.cordinador? "Si":"No").append("\n")
                .append("Sueldo Bruto: ").append(String.format("%.2f", calcularSueldoBruto())).append("\n")
                .append("Descuentos Fijos: ").append(String.format("%.2f",calcularDescuento() )).append("\n")
                .append("Descuentos Variables: ").append(String.format("%.2f", descuentoPorHoraDictada())).append("\n")
                .append("Bonificacion: ").append(String.format("%.2f", calculcarBonificacion())).append("\n")
                .append("Sueldo Neto: ").append(String.format("%.2f", calcularSueldoNeto())).append("\n");
        
        return "DATOS DEL DOCENTE\n"+super.toString()+datosDocente.toString();
        
    }
    
    

    
}
