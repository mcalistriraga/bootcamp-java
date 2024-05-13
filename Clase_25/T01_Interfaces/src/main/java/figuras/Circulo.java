package main.java.figuras;


// Clase Circulo que implementa la interfaz FiguraGeometrica
public class Circulo implements FiguraGeometrica {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
