/*
=================================================================================
    Ejercicio 1: Interfaces
    Crea una interfaz FiguraGeometrica con el método calcularArea().
    Implementa esta interfaz en las clases Circulo y Rectangulo, calculando
    el área de cada figura en sus respectivas implementaciones
=================================================================================
*/
 package main.java;

import main.java.figuras.Circulo;
import main.java.figuras.Rectangulo;

// Clase principal para probar las implementaciones
public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(4, 6);

        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
    }
}
