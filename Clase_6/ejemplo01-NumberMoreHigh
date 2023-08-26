package Clase_6;
/*
===============================================================================================
* EJERCICIO #1
* “Armar un programa que permita cargar 3 números y mostrar cual es el mayor y cual es el menor”
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

        Integer mayor= num1;
        if (num2 > mayor) {
                mayor= num2;
        }
        if (num3 > mayor) {
            mayor= num3;
        }

        Integer menor= num1;
        if (num2 < menor) {
            menor= num2;
        }
        if (num3 < menor) {
            menor= num3;
        }

        System.out.println("El menor número entre: " + num1 + ", " + num2 + " y " + num3 + " es: " + menor);
        System.out.println("El mayor número entre: " + num1 + ", " + num2 + " y " + num3 + " es: " + mayor);
    }
}
