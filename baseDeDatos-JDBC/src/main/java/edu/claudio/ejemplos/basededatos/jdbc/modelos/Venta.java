
package edu.claudio.ejemplos.basededatos.jdbc.modelos;

import java.time.LocalDate;

public class Venta {
    private int codigo;
    private String cliente;
    private LocalDate fecha; //tipo de fechas que maneja Java

    public Venta() {
    }

    public Venta(int codigo, String cliente, LocalDate fecha) {
        this.codigo = codigo;
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
