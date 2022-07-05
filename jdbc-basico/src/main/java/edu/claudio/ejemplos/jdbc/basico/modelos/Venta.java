
package edu.claudio.ejemplos.jdbc.basico.modelos;

import java.time.LocalDate;

public class Venta {
    private int codigo;
    private String cliente;
    private LocalDate fecha;                //se puede usar solo para informacion-> localDate (java.time) o Date(deprecate), para operaciones con la fecha ->Instant

    public Venta() {
    }

    public Venta(String cliente, LocalDate fecha) {
        this.cliente = cliente;
        this.fecha = fecha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return codigo+", "+cliente+", "+fecha;
    }
    
    
}
