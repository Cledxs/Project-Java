
package edu.claudio.ejemplos.utilidades.reflexion;


public class AppReflexion {
    public static void main(String[] args) {
        Empleado empleado01=new Empleado(123, "Claudio", 24000);
        Class<?> definicionEmpleado=empleado01.getClass();
        System.out.println("El nombre de la clase es: "+definicionEmpleado.getSimpleName());
        System.out.println("El nombre del paquete es: "+definicionEmpleado.getPackageName());
       
        System.out.println(empleado01);
    }
}
