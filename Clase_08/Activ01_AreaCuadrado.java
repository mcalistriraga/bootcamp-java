package Clase_08;

import java.util.Scanner;
/* ----------------------------------------------------------------------
*
* *   1)	Hacer una función que calcule el área de un cuadrado.
*        Al llamarla debe devolver el área del cuadrado.
*
* ----------------------------------------------------------------------
*/
public class Activ01_AreaCuadrado {
    public static void main (String[] args) {
        float lado= getUserData("Introduzca la longitud de uno los lados del cuadrado:");

        float area= getSquareArea(lado);

        System.out.println("El area del cuadrado es: " + area);

    }

    private static float getSquareArea(float lado) {
        return lado*lado;
    }

    private static float  getUserData(String msje) {
        System.out.println(msje);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextFloat();
    }
}


