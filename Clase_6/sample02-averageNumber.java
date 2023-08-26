package Clase_6;
/*
===============================================================================================
* EJERCICIO #2
* “Armar un programa que permita cargar 3 números y mostrar cual es el número promedio”
*
===============================================================================================
*/
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner cargaDeDatos = new Scanner(System.in);

        System.out.println("Introduce el primer número?");
        Integer num1 = cargaDeDatos.nextInt();

        System.out.println("Introduce el segundo número?");
        Integer num2 = cargaDeDatos.nextInt();

        System.out.println("Introduce el último número?");
        Integer num3 = cargaDeDatos.nextInt();

        Float media = (num1 +num2 +num3)/3;

        System.out.println("El promedio de los siguientes numeros: (" + num1 + ", " + num2 + " y " + num3 + ") es: " + media);
    }
}
