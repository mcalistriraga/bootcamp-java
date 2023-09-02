package Clase_07;
/*
*================================================================================
*
*    1)	Hacer un programa que permita al usuario ingresar 5 números y mostrarlos.
*
*     2)	Después de realizar el ejercicio anterior, agregar que muestre el
*           número mayor y el número menor.
*
*     3)	Ahora, hay que mostrar el promedio. Para hacer esto se suman todos
*           los números y se divide por 5, ya que el usuario agregó 5 números.
*
* *==============================================================================
*/
/*
import java.util.Arrays; // clase Arrays
import java.util.Scanner;
class  LoadNumersInArray {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i=0; i < numbers.length; i++)  // escribir en array
        {
            System.out.println("Introduce el número: " + (i+1) + " de 5 en total");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Los números ingresados son:");

        //Arrays.stream(numbers).forEach(elem -> System.out.println(elem)); // new
        for (int elem: numbers)  // leer array
        {
            System.out.println(elem);
        }

        System.out.println("el minimo es: " + Arrays.stream(numbers)
                                                    .min()
                                                    .getAsInt());
        System.out.println("el máximo es: " + Arrays.stream(numbers).max().getAsInt());

        if  (Arrays.stream(numbers).average().isPresent()) { // verifica su existencia antes de lectura
            System.out.println("el promedio es: " + Arrays.stream(numbers)
                    .average()
                    .getAsDouble());
        }
    }
}
*/