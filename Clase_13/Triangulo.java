
public class Triangulo extends PoligonoRegular {
    public Triangulo(double base, double altura, String colorFondo) {
        super(base, altura, colorFondo);
    }

    public Triangulo() {
        super();
    }

    public double calcularArea() {
        return (base * altura)/2;
    }

    public double calcularPerimetro() {
        double hipotenusa= Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        return base + altura + hipotenusa;
    }
}

