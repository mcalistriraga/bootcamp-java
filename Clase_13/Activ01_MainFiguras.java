
package Clase_13;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Activ01_MainFiguras {

    static List<Figura> figureList = new ArrayList<>(); // este arreglo puede almacenar tambien varios dirculos, rectangulos, triangulos
    public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            boolean mostrarMenu = true;

            while (mostrarMenu) {
                System.out.println("******** MENU ********");
                System.out.println("1.) Crear una figura");
                System.out.println("2.) Mostrar sumatoria de areas de las figuras");
                System.out.println("3.) Salir");

                int respuestaUsuario = teclado.nextInt();
                switch (respuestaUsuario) {
                    case 1: // Crear una figura
                    {
                        CrearFiguras();
                        break;
                    }

                    case 2: // Mostrar sumatoria de areas de las figuras
                    {
                        mostrarSumatoriasDeFiguras();
                        break;
                    }

                    case 3: // Salir
                    {
                        mostrarMenu = false;
                        break;
                    }
                }

            }
        }

        static void mostrarSumatoriasDeFiguras() {
            double sumAreas= 0;
            for (Figura eachFigure: figureList) {
                sumAreas += eachFigure.calcularArea(); // POLIMORFISMO: calcularArea() RESPONDE IGUAL por HERENCIA para todas las figuras
            }
            System.out.println( "El area Total de todas las figuras es: " + redondear(sumAreas) + " cm");
        }

        private static String redondear ( double value){
            DecimalFormat df = new DecimalFormat("0.00");
            df.setRoundingMode(RoundingMode.HALF_UP);
            return df.format(value);
        }

        private static void CrearFiguras () {
                Scanner teclado = new Scanner(System.in);

                System.out.println("Que figura desea Crear?");

                System.out.println("1.) Circulo");
                System.out.println("2.) Rectangulo");
                System.out.println("3.) Triangulo");
                System.out.println("4.) Salir");

                int respuestaUsuario = teclado.nextInt();
                switch (respuestaUsuario) {
                    case 1: // Circulo
                    {
                        Circulo circulo = new Circulo();
                        circulo.cargarDatos();
                        System.out.println("El area del Circulo es:" + redondear(circulo.calcularArea()));
                        System.out.println("El perimetro del Circulo es:" + redondear(circulo.calcularPerimetro()));
                        figureList.add(circulo);
                        break;
                    }

                    case 2: // Reactangulo
                    {
                        Rectangulo rectangulo = new Rectangulo();
                        rectangulo.cargarDatos();
                        System.out.println("El area del Rectangulo es:" + rectangulo.calcularArea());
                        System.out.println("El perimetro del Rectangulo es:" + rectangulo.calcularPerimetro());
                        figureList.add(rectangulo);
                        break;
                    }

                    case 3: // Triangulo
                    {
                        Triangulo triangulo = new Triangulo();
                        triangulo.cargarDatos();
                        System.out.println("El area del Triangulo es:" + triangulo.calcularArea());
                        System.out.println("El perimetro del Triangulo es:" + redondear(triangulo.calcularPerimetro()));
                        figureList.add(triangulo);
                        break;
                    }

                }

        }


}
