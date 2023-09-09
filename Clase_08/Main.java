package Clase_08;

import java.util.Arrays;
        import java.util.Scanner;
public class Main {
/*
    public static void main (String[] args) {

        //String codigo= primeraPrueba();

        String  textoAlfabeto= morseATexto("      .- .-     -...  -.-.  -..");
        System.out.println(textoAlfabeto);

        int[] numbers = new int[5];
        cargarNumeros(numbers);
        mostrarNumeros(numbers);
        calcularMinimo(numbers);
        calcularMaximo(numbers);
        calcularPromedio(numbers);
    }
*/

    private static String morseATexto(String strMorse) {

        String textoAlfabeto="";
        String subStrMorse= strMorse.trim().replaceAll("\\s+", " "); // Filtro blancos
        int posEnd= subStrMorse.indexOf(" ");

        while (posEnd >0) {
            String codigo = subStrMorse.substring(0, posEnd);
            subStrMorse= subStrMorse.substring(codigo.length()+1);
            textoAlfabeto = getTextoAlfabeto(codigo, textoAlfabeto);
            posEnd = subStrMorse.indexOf(" ");

            if (posEnd <= 0 && subStrMorse.length() > 0) {
                codigo = subStrMorse;
                textoAlfabeto = getTextoAlfabeto(codigo, textoAlfabeto);

            }
        }
        return textoAlfabeto;
    }

    private static String getTextoAlfabeto(String codigo, String textoAlfabeto) {
        String[] tablaABC = {
                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
                "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"
        };

        String[] tablaCodigoMorse = {
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
                "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----."
        };
        for (int i = 0; i < tablaCodigoMorse.length; i++) {
            if (tablaCodigoMorse[i].equals(codigo)) {
                textoAlfabeto += tablaABC[i];
                break;
            }
        }
        return textoAlfabeto;
    }


    private static String  primeraPrueba() {
        String texto = "ABACABB";

        String[] tablaABC = {"A", "B", "C"};
        String[] tablaCodigoMorse = {".-", "-...", "-.-."};
        String codigoTransformado="";

        for (int i=0; i<texto.length(); i++ ) {

            char letraDeTexto= texto.charAt(i);
            for (int j=0; j < tablaABC.length; j++) {

                String letraTablaABC= tablaABC[j];
                if (String.valueOf(letraDeTexto).equals(letraTablaABC)) {
                    String caracterEnCodigoMorse = tablaCodigoMorse[j];
                    codigoTransformado += caracterEnCodigoMorse;
                    break;
                }
            }

        }
        return codigoTransformado;

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
}
