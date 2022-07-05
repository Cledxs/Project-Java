
package edu.claudio.ejemplos.ejercicios.ciberteccadenas;

public class Ejemplo03 {
    public static void main(String[] args) {
      //Para volumenes de texto mas amplio se utiliza StrinBuilder (oStringBuffer)
       //Para utilizar StrinBuilder, primero se instancia(crea) un objeto.(Similar el Scanner)
       
       StringBuilder textoExtenso=new StringBuilder();//Se crea un Objeto que va almacenar texto
       textoExtenso.append("Hola, que tal. Esto es un StrinBuilder\n");
       textoExtenso.append("Que permite manejar texto de forma mas ordenada.");
       textoExtenso.append("\n\tTambien se puede agregar tabulaciones ");
       
        System.out.println(textoExtenso);
        
        
        //Otra forma:
        StringBuilder otroTexto=new StringBuilder();
        otroTexto.append("\nHola, que tal. Esto es un StrinBuilder\n")
                    .append("Que permite manejar texto de forma mas ordenada.")
                    .append("\n\tTambien se puede agregar tabulaciones ");
        
        System.out.println(otroTexto);
        
        //metodos:
        StringBuilder frase=new StringBuilder("Claudio");
        System.out.println(frase);//se imprime la frase original
        System.out.println("Laprimera letra inicial es: "+frase.charAt(0));//Se imprime la primera letra de la frase original
        System.out.println("\nLa frase invertida sera: "+ frase.reverse());//Este metodo cambia la frase, todo lo que venga despues y quiere usar la frase sera en su forma invertida.
        System.out.println("la primera letra es: "+frase.charAt(0));// Imprime la primera letra, pero la frase ya invertida.
        
        
    }
    
}
