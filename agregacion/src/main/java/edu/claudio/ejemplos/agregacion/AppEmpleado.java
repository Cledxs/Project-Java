
package edu.claudio.ejemplos.agregacion;

public class AppEmpleado {
    
    public static void main(String[] args) {
        
        Contacto datosContacto=new Contacto("Jr. Maria Parado de Bellido", "Lima", "Carabyllo", "Cpch@gmail.com", "945374685");
        Empleado empleado01 = new Empleado("Claudio", "47613163", "Paitan", "Chuco", 28, datosContacto);
         
        System.out.println("La direecion del empleado es: "+empleado01.getDatosContacto().getDireccion());
        System.out.println("La edad del empleado es: "+empleado01.getEdad());
        System.out.println("El correo del empleado es: "+datosContacto.getCorreo());
    }
    
}
