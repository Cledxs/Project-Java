
package edu.claudio.ejemplos.pruebas.unitarias.test;

import edu.claudio.ejemplos.pruebas.unitarias.Calculadora;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
    //Todos los casos de prueba son "void"(no devuelven nada) y no reciben parametros
    
    @Test
    public void probar_suma_correcta(){
        Calculadora calculadora = new Calculadora();
        int resultadoSuma = calculadora.sumar(5, 3);
        //Verificar que la suma devuelva 8 como resultado
        Assert.assertTrue(resultadoSuma==8);
    }
    
    @Test
    public void probar_resta_correcta(){
        Calculadora calculadora = new Calculadora();
        int resultadoResta=calculadora.restar(10, 20);
        Assert.assertTrue(resultadoResta==-10);
    }
    
    @Test
    public void probar_division_correcta(){
        Calculadora calculadora = new Calculadora();
        int resultadoDivision=calculadora.dividir(10, 2);
        Assert.assertTrue(resultadoDivision==5);
    }
    
    @Before
    public void setUp(){
        System.out.println("Configurar prueba"); //Anotacion: Se ejecuta primero, nos ayuda a inicializar algo o alguna conexion antes de cada pruba
    }
    
    @After //Para cerrar conexiones, limpiar, se ejecuta al final de todas las pruebas
    public void finalTest(){
        System.out.println("Limpiar...");
    }
}
