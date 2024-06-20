package com.edderaz.hn.area_calcular;

import org.junit.Test;
import static org.junit.Assert.*;

public class AreaCalculatorTest {

    private final AreaCalculator calculator = new AreaCalculator();

    @Test
    public void testCalcularAreaCirculo() {
        assertEquals(28.27, calculator.calcularAreaCirculo(3), 0.01);
        assertEquals(78.54, calculator.calcularAreaCirculo(5), 0.01);
        assertEquals(0, calculator.calcularAreaCirculo(0), 0.01);
    }

    @Test
    public void testCalcularAreaCuadrado() {
        assertEquals(16, calculator.calcularAreaCuadrado(4), 0.01);
        assertEquals(25, calculator.calcularAreaCuadrado(5), 0.01);
        assertEquals(0, calculator.calcularAreaCuadrado(0), 0.01);
    }

    @Test
    public void testCalcularAreaRectangulo() {
        assertEquals(20, calculator.calcularAreaRectangulo(4, 5), 0.01);
        assertEquals(50, calculator.calcularAreaRectangulo(5, 10), 0.01);
        assertEquals(0, calculator.calcularAreaRectangulo(0, 10), 0.01);
    }

    @Test
    public void testCalcularAreaTriangulo() {
        assertEquals(10, calculator.calcularAreaTriangulo(4, 5), 0.01);
        assertEquals(25, calculator.calcularAreaTriangulo(5, 10), 0.01);
        assertEquals(0, calculator.calcularAreaTriangulo(0, 10), 0.01);
    }
}