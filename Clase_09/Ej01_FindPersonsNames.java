package Clase_09;
/*
------------------------------------------------------------------------
Ej01-Personas
“Crea un programa que tenga un arreglo con nombres completos de personas.
Además, debe permitir realizar una búsqueda por el nombre de la persona”.
------------------------------------------------------------------------
 */
import java.util.Scanner;
public class Ej01_FindPersonsNames {
    public static void main (String[] args) {
        System.out.println("Ingrese su busqueda: ");

        Scanner teclado = new Scanner(System.in);
        String busqueda= teclado.nextLine();  // lee la palabra de busqueda

        String personas[]= {"Lucas Moy", "Aldo Angeline", "Julia Gomez", "Manuel Santillan", "Juan Torres"};

        for (String nombrePersona:personas) {
            if (nombrePersona.toLowerCase().contains(busqueda.toLowerCase())) {
                System.out.println("La persona es: " + nombrePersona);
                break;
            }
        }

        //  OTRAas dos FORMAs MAS avanzadas...
        //  Arrays.stream(personas).filter(nombre->nombre.contains(busqueda));
        //      Arrays.stream(personas).parallel().filter(nombre->nombre.contains(busqueda));
        //      .parallel() hace que se construyan varos hilos, para que la busqueda se haga mas rapida
        //      usando todo el poder de la computadora

    }
}
