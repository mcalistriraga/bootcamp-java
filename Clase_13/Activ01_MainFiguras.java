package Clase_13;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Activ01_MainFiguras {
    public static void main (String[] args) {
        mainFiguras();
    }

    private static String redondear(double value) {
        DecimalFormat df = new DecimalFormat("0.00");  df.setRoundingMode(RoundingMode.HALF_UP);
        return df.format(value);
    }
    private static void mainFiguras() {
// ---- Crar Instancias de cada figura  ---
        Triangulo triangulo= new Triangulo(1,1);
        Rectangulo rectangulo= new Rectangulo(1,1);
        Circulo circulo= new Circulo(1);

//---- mostrar area y perimetro de la figura: triangulo  ---
        System.out.println("--------calculos del Triangulo:-----------------");
        System.out.println("Area Triangulo= " + redondear(triangulo.calcularArea()) );
        System.out.println("Perimetro  Triangulo= " + redondear(triangulo.calcularPerimetro()) );

// ---- mostrar area y perimetro de la figura: rectangulo  ---
        System.out.println("--------calculos del Rectangulo:-----------------");
        System.out.println("Area Reactangulo= " + redondear(rectangulo.calcularArea()) );
        System.out.println("Perimetro  Reactangulo= " + redondear(rectangulo.calcularPerimetro()) );

// ---- mostrar area y perimetro de la figura: circulo  ---
        System.out.println("--------calculos del Circulo:-----------------");
        System.out.println("Area Circulo= " + redondear(circulo.calcularArea()) );
        System.out.println("Perimetro  Circulo= " + redondear(circulo.calcularPerimetro()) );
    }
}
