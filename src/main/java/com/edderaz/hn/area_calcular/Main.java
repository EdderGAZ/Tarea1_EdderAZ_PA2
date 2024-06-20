package com.edderaz.hn.area_calcular;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Seleccione una operación:");
            System.out.println("1. Calcular el área de un círculo");
            System.out.println("2. Calcular el área de un cuadrado");
            System.out.println("3. Calcular el área de un rectángulo");
            System.out.println("4. Calcular el área de un triángulo");
            System.out.println("5. Salir");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Ingrese el radio del círculo: ");
                    double radio = scanner.nextDouble();
                    System.out.println("Área del círculo: " + calculator.calcularAreaCirculo(radio));
                    break;
                case 2:
                    System.out.print("Ingrese el lado del cuadrado: ");
                    double lado = scanner.nextDouble();
                    System.out.println("Área del cuadrado: " + calculator.calcularAreaCuadrado(lado));
                    break;
                case 3:
                    System.out.print("Ingrese el largo del rectángulo: ");
                    double largo = scanner.nextDouble();
                    System.out.print("Ingrese el ancho del rectángulo: ");
                    double ancho = scanner.nextDouble();
                    System.out.println("Área del rectángulo: " + calculator.calcularAreaRectangulo(largo, ancho));
                    break;
                case 4:
                    System.out.print("Ingrese la base del triángulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese la altura del triángulo: ");
                    double altura = scanner.nextDouble();
                    System.out.println("Área del triángulo: " + calculator.calcularAreaTriangulo(base, altura));
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (option != 5);

        scanner.close();
    }
}