package Clase_13;

public class Triangulo extends Figura {
    // ----atributes ---
    private double base;
    private double altura;

    // --- builders---
    public double getBase() {
        return base;
    }
    public double getAltura() {
        return altura;
    }

    public Triangulo(double base, double altura) {
        this.base= base;
        this.altura= altura;
    }
    public double calcularArea() {
        return (getBase() * getAltura())/2;
    }

    public double calcularPerimetro() {
        double hipotenusa= Math.sqrt(Math.pow(getBase(), 2) + Math.pow(getAltura(), 2));
        return getBase() + getAltura() + hipotenusa;
    }
}

