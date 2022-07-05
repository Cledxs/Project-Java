
package edu.claudio.ejemplos.simulacro.model;


public class Curso {
    private int codigo;
    private String nombre;
    private int creditos;
    private double [] notas;

    public Curso() {
    }

    public Curso(int codigo, String nombre, int creditos, double[] notas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.notas = notas;
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

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    public double calcularPromedio(){
        double sumaNotas=0;
        for(double nota : this.notas){
            sumaNotas+=nota;
        }
        return (sumaNotas)/(this.notas.length);
    }
    
    public double calcularPago(){
        return 145*this.creditos;
    }
    
    public String mostrarNotas(){
        String notasTexto = "[";
        for(double n:notas ){
            notasTexto+=n+", ";
        } 
        notasTexto =notasTexto.substring(0, notasTexto.length()-2)+"]";
        
        return notasTexto;
        
    }

    @Override
    public String toString() {
        StringBuilder datosCurso = new StringBuilder("------------------------------\n");
        datosCurso.append("Codigo de curso: ").append(this.codigo).append("\n")
                .append("Nombre del curso: ").append(this.nombre).append("\n")
                .append("Creditos del curso: ").append(this.creditos).append("\n")
                .append("Notas del Curso: ").append(mostrarNotas()).append("\n")
                .append("Promedio de notas: ").append(calcularPromedio()).append("\n")
                .append("Pago por el curso: ").append(calcularPago()).append("\n");
        
        return datosCurso.toString();
    }
    
    
    
}
