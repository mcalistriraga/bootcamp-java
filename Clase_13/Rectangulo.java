
public class Rectangulo extends PoligonoRegular {
    public Rectangulo(double base, double altura, String colorFondo) {
        super(base, altura, colorFondo);
    }

    public Rectangulo() {
        super();
    }

    public double calcularArea() {
        return (base * altura);
    }

    public double calcularPerimetro() {
        return base * 2 + altura * 2 ;
    }
}
