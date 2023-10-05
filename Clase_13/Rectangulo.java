package Clase_13;

public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base= base;
        this.altura= altura;
    }
    public double calcularArea() {
        return (this.base * this.altura);
    }

    public double calcularPerimetro() {
        return this.base * 2 + this.altura * 2 ;
    }
}

