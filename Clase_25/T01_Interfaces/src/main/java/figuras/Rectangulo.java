package main.java.figuras;

// Clase Rectangulo que implementa la interfaz FiguraGeometrica
public class Rectangulo implements FiguraGeometrica{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}
