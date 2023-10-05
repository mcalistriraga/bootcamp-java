package Clase_13;

public class Circulo extends Figura {
    // ----atributes ---
    private double radio;

    // --- builders---
    public double getRadio() {
        return radio;
    }
    public Circulo(double radio) {
        this.radio= radio;
    }

    public double calcularArea() {
        return  Math.PI * Math.pow(getRadio(), 2) ;
    }
    public double calcularPerimetro() {
        return  2 * Math.PI * getRadio();
    }
}
