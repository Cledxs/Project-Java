
package edu.claudio.ejemplos.examen.parcial.cibertec;

public class EmpleadoFijo extends Persona {
    private CargoEmpleadoFijo cargo;   //T(tecnico), A(administrativo), M(medico),O(operario).
    private double salarioBruto;
    private int horasExtras;

    public EmpleadoFijo() {
    }

    public EmpleadoFijo(CargoEmpleadoFijo cargo, double salarioBruto, int horasExtras, String dni, String nombre, String apellido, int mesPago, TipoEmpleado tipoEmpleado) {
        super(dni, nombre, apellido, mesPago, tipoEmpleado);
        this.cargo = cargo;
        this.salarioBruto = salarioBruto;
        this.horasExtras = horasExtras;
    }

    public CargoEmpleadoFijo getCargo() {
        return cargo;
    }

    public void setCargo(CargoEmpleadoFijo cargo) {
        this.cargo = cargo;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double descuentoAFP(){
        return 0.12*salarioBruto;
    }
    public double descuentoImpuestoRenta(){
        return 0.10*salarioBruto;
    }
    public double bonificacionMesPago(){
        double bonificacion=0;
        if(this.mesPago==7 || this.mesPago==12){
            bonificacion=0.5*this.salarioBruto;
        }
        return bonificacion;
    }
    
    public double bonificacionHorasExtras(){
        return this.horasExtras*this.cargo.getBonoPorHoraExtra();
    }
    
    public double calcularSueldoNeto(){
        return this.salarioBruto-descuentoAFP()-descuentoImpuestoRenta()+bonificacionMesPago()+bonificacionHorasExtras();
    }


    

}
