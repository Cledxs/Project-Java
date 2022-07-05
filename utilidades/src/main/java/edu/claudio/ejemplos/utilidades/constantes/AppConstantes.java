
package edu.claudio.ejemplos.utilidades.constantes;

public class AppConstantes {
    public static void main(String[] args) {
        System.out.println("Una persona es mayor de edad a los: "+Constantes.MAYOR_EDAD);
        System.out.println("El valor de pi es: "+Constantes.PI);
        System.out.println("Ah ocurrido: "+Constantes.MENSAJE_ERROR);
        
        
        EstadoCivil estado = EstadoCivil.CASADO;
        switch(estado){
            case CASADO:System.out.println("Casado");break;
            case DIVORCIADO: System.out.println("Divorciado");break;
            case SOLTERO: System.out.println("Soltero");
            case VIUDO: System.out.println("Viudo");
        }
        
        EquipoFutbol equipo=EquipoFutbol.BARCELONA;
        
        System.out.println("Codigo de equipo: "+equipo.getCodigo());
        System.out.println("Nombre comun del equipo: "+equipo.getNombre());
        System.out.println("El ingreso anual del equipo es de: "+equipo.getIngresoAnual());
        
    }
}
