import java.util.Scanner;

public abstract class PoligonoRegular extends Figura {
    // ENCAPSULAMIENTO: protected, private
    protected double base;
    protected double altura;
    public PoligonoRegular(double base, double altura, String colorFondo) {
        super(colorFondo);
        this.base = base;
        this.altura = altura;
    }

    public PoligonoRegular() {
        super();
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double redondear (double value){
        return Math.round(value);
    }

    public void cargarDatos() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa la Altura en cm: ");
        altura = teclado.nextDouble();
        System.out.println("Ingresa la Base en cm: ");
        base = teclado.nextDouble();
    }

}
