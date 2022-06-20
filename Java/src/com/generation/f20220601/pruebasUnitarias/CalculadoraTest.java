package com.generation.f20220601.pruebasUnitarias;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {

    @org.junit.Test
    public void suma() {
        Calculadora calc = new Calculadora();
        int resultado = calc.suma(12,42);

        assertEquals(54,resultado);
    }

    @org.junit.Test
    public void resta() {
        Calculadora calc = new Calculadora();
        int resultado = calc.resta(42,12);

        assertEquals(30,resultado);
    }

    @org.junit.Test
    public void multiplicacion() {
        Calculadora calc = new Calculadora();
        int resultado = calc.multiplicacion(3,5);

        assertEquals(15,resultado);
    }

    @org.junit.Test
    public void division() {
        Calculadora calc = new Calculadora();
        String resultado = calc.division(12,0);

        assertNotNull(resultado);
    }

    @Test
    public void pares() {
        Calculadora calc = new Calculadora();
        String resultado = calc.Pares(6);

        assertEquals("Tu numero es par",resultado);
    }

    @Test
    public void impares() {
        Calculadora calc = new Calculadora();
        String resultado = calc.Impares(5);

        assertEquals("Tu numero es impar",resultado);
    }
}