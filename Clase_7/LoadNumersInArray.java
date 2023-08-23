package Clase_7;
/*
*================================================================================
*
*    1)	Hacer un programa que permita al usuario ingresar 5 números y mostrarlos.
*
* *==============================================================================
*/
import java.util.Scanner;
public class LoadNumersInArray {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        //int[] NumbersArray = new int[5];
        int[] numbers = new int[5];

        for (int i; i < numbers.length; i++)  // escribir en array
        {
            System.out.println("Introduce el número: " + (i+1) + " de 5 en total");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Los números ingresados son:");
        //for (int i=0; i < numbers.length; i++)  // leer array
        for (int i: numbers)  // leer array
        {
            System.out.println("NumbersArray[" + i  + "] es: " + numbers[i]);
        }

    }
}
