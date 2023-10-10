import java.util.Scanner;

public class Circulo extends Figura {
    // encapsulamiento...
    // ----propiedades, atributes o campos (fields) ---

    private double radio;

// Setters and getters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }


    // --- builders---
    public Circulo(double radio) {
        this.radio= radio;
    }

    public Circulo() {;
    }

    // Methods
    public double calcularArea() {
        return  Math.PI * Math.pow(radio, 2) ;
    }
    public double calcularPerimetro() {
        return  2 * Math.PI * radio;
    }

    public void cargarDatos() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el Radio en cm: ");
        radio = teclado.nextDouble();
    }
}

