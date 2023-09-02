package Clase_08;
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
/*import java.util.Arrays;
import java.util.Scanner;
public class Ej02_NewLoadNumbersArray {

    public static void main (String[] args) {
        int[] numbers = new int[5];
        cargarNumeros(numbers);
        mostrarNumeros(numbers);
        calcularMinimo(numbers);
        calcularMaximo(numbers);
        calcularPromedio(numbers);
    }

    private static void calcularPromedio(int[] numbers) {
        if  (Arrays.stream(numbers).average().isPresent()) { // verifica su existencia antes de lectura
            System.out.println("el promedio es: " + Arrays.stream(numbers)
                    .average()
                    .getAsDouble());
        }
    }

    private static void calcularMaximo(int[] numbers) {
        if  (Arrays.stream(numbers).max().isPresent()) {
            System.out.println("el máximo es: " + Arrays.stream(numbers).max().getAsInt());
        }
        else System.out.println("no se puedo calcular el máximo!!");
    }

    private static void calcularMinimo(int[] numbers) {
        if  (Arrays.stream(numbers).min().isPresent()) {
            System.out.println("el minimo es: " + Arrays.stream(numbers)
                    .min()
                    .getAsInt());
        }
        else System.out.println("no se puedo calcular el mínimo!!");
    }

    private static void cargarNumeros(int[] numbers) {
        for (int i = 0; i < numbers.length; i++)  // escribir en array
        {
            numbers[i] = pedirNumeroAlUsuario();
        }
    }

    private static int  pedirNumeroAlUsuario() {
        System.out.println("Introduce el número: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void mostrarNumeros(int[] numbers) {
        System.out.println("Los números ingresados son:");
        //Arrays.stream(numbers).forEach(elem -> System.out.println(elem)); // new
        for (int elem: numbers)  // leer array
        {
            System.out.print(elem);
        }
        System.out.println("\n");
    }
}*/