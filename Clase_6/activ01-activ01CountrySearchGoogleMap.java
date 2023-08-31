package Clase_6;
/*
===============================================================================================
* ACTIVIDAD_INDIVIDUAL #1
* 1)	Arma un buscador de países con Google Maps.
*       Primero, pídele al usuario que ingrese un país (Ej: Colombia).
*       Después muestra en consola la concatenación de:
*       “https://www.google.com/maps/search/” + pais
*       Entonces, cuando hagas click en el link que aparece en consola, te abrirá esa ubicación.
*
===============================================================================================
*/
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {

        Scanner cargaDeDatos = new Scanner(System.in);

        System.out.println("Introduce el NOMBRE DEL PAÍS a buscar en google map?");
        String pais = cargaDeDatos.next();
        String cmd= "https://www.google.com/maps/search/"+pais;
        System.out.println (cmd);
    }
}
