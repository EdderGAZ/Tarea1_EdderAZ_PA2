package com.edderaz.hn.area_calcular;

public class AreaCalculator {

    public double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularAreaCuadrado(double lado) {
        return Math.pow(lado, 2);
    }

    public double calcularAreaRectangulo(double largo, double ancho) {
        return largo * ancho;
    }

    public double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
}