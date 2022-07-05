
package edu.claudio.ejemplos.poo.herencia;

public class Empleado extends Persona{
    private int sueldo;
    private int tipoContrato;

    public Empleado(int sueldo, int tipoContrato, String Dni, String nombre, String apellido) {
        super(Dni, nombre, apellido);
        this.sueldo = sueldo;
        this.tipoContrato = tipoContrato;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(int tipoContrato) {
        this.tipoContrato = tipoContrato;
    }
    
    //Si 1 (planilla) y 2 (recibo)
     public String obtenerTipoContrato(){
         return tipoContrato==1? "Planilla":"Boleta";
     }

    @Override
    public void mostrarResultados() {
        System.out.println("\nEstos son los datos del Empleado: ");
        super.mostrarResultados(); 
        System.out.println("Sueldo: "+sueldo);
        System.out.println("Tipo de contrato: "+ obtenerTipoContrato());
        
        
    }
     
     

}
