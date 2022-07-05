
package edu.claudio.ejemplos.poo.herencia;

public class Cliente extends Persona {
    char categoria;
    String codigo;

    public Cliente(char categoria, String codigo, String Dni, String nombre, String apellido) {
        super(Dni, nombre, apellido);
        this.categoria = categoria;
        this.codigo = codigo;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String mostrarCategoria(){
        if(categoria=='s'){
            return "Standard";
        } else if (categoria=='v'){
            return "Vip";
        }else{
            return "Premium";
        }
    }

    @Override
    public void mostrarResultados() {
        System.out.println("Estos son los datos del Cliente: ");
        super.mostrarResultados();
        System.out.println("Categoria: "+ mostrarCategoria());
        System.out.println("Codigo: "+ codigo);
    }
    
    
}
