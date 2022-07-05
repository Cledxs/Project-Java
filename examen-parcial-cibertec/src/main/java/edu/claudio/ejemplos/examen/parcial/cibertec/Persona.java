
package edu.claudio.ejemplos.examen.parcial.cibertec;

public class Persona {
    protected String dni;
    protected String nombre;
    protected String apellido;
    protected int mesPago;
    protected String ususario;
    protected TipoEmpleado tipoEmpleado;

    public Persona() {
    }

    public Persona(String dni, String nombre, String apellido, int mesPago, TipoEmpleado tipoEmpleado) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mesPago = mesPago;
        this.tipoEmpleado = tipoEmpleado;
        this.ususario=generarUsuario();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getMesPago() {
        return mesPago;
    }

    public void setMesPago(int mesPago) {
        this.mesPago = mesPago;
    }

    public String getUsusario() {
        return ususario;
    }

    public void setUsusario(String ususario) {
        this.ususario = ususario;
    }

    public TipoEmpleado getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(TipoEmpleado tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }
    
    public final String generarUsuario(){
        StringBuilder newApellido=new StringBuilder(apellido);
        
        return  (nombre.charAt(0)
                +newApellido.reverse().toString()
                +dni.charAt(1)+dni.charAt(dni.length()-2)).toLowerCase();
    }

    @Override
    public String toString() {
        StringBuilder datosPersona= new StringBuilder("\n");
        datosPersona.append("Nombre: ").append(this.nombre).append("\n")
                    .append("Apellido:").append(this.apellido).append("\n")
                    .append("DNI:").append(this.dni).append("\n")
                    .append("Mes de pago: ").append(this.mesPago).append("\n")
                    .append("Tipo de empleado: ").append(this.tipoEmpleado.getTipoempleado()).append("\n")
                    .append("Usuario: ").append(this.ususario).append("\n");
        return super.toString(); 
    }
    
    
}
