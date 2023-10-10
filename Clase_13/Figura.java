
import java.math.RoundingMode;
import java.text.DecimalFormat;

// clase base Figura
public abstract class Figura {
    private String colorFondo;
    public Figura(String colorFondo) {
        this.colorFondo = colorFondo;
    }

    public Figura() {
    }

    public abstract double calcularArea ();
    //public double calcularArea (){
    //    return 0.0;
    //} // funcion compartida de todas lad Figuras

    //public double calcularPerimetro (){
    //    return 0.0;
    //} // funcion compartida de todas lad Figuras

    public abstract double calcularPerimetro ();
}
