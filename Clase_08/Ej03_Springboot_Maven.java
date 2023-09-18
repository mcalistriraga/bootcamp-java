/*----------------------------------------------------------------------------------
                              src: MainController.java
  Usando Springboot a partir de spring initializr, se creó un:
  proyecto:Maven    lenguaje: java
  Spring Boot: 3.1.0
  Proyect Metadata:
      Group:academy.atl
      Artefact:  bootcamp
      Name:      bootcamp
      Description:   Demo proyect for Spring Boot
      Package name:  academy.atl.bootcamp
    Packaging:   War
    Java:        17
    ------------------------------------------------------------------------------
  Ejercicios:
  - hola mundo
  - genera un password
  - Conviette con texto-a-morse
  - Convierte morse-a-texto
  ----------------------------------------------------------------------------------
*/
package academy.atl.bootcamp;

/*
// Main Controllers, van a ser como los puntos de entrada, donde se van a llarar estas URLs
// es donde vamos a configurar todo esto..

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

// en la siguiente linea le colocaremos la NOTACION (tema avanzado)..
// cuando coloque el "@RestController", se completó la cadena "import..." automaticamente importó.
@RestController
public class MainController {

    @GetMapping("/morse-a-texto/{textoMorse}")
    //public String  morseATexto(@PathVariable String textoMorse) {
    public static String morseATexto(@PathVariable String textoMorse) {

        String textoAlfabeto="";
        String subStrMorse= textoMorse.trim().replaceAll("\\s+", " "); // Filtro blancos
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

    private static String convertirCodigoMorseALetra(String letraDeTexto, String codigoMorse) {
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


        for (int j = 0; j < codigoMorse.length(); j++) {
            String letraEnCodigoMorse= tablaCodigoMorse[j];
            if (letraEnCodigoMorse.equals(letraDeTexto)) {
                String caracterEnCodigoMorse = tablaCodigoMorse[j];
                codigoMorse += "|" + caracterEnCodigoMorse;
                break;
            }
        }
        return letraDeTexto;
    }


    @GetMapping("/texto-a-morse/{texto}")
    public String  primeraPrueba(@PathVariable String texto) {

        String codigoTransformado="";

        for (int i=0; i<texto.length(); i++ ) {
            String letraDeTexto= "" + texto.charAt(i);
            codigoTransformado = convertirLetraACodigoMorse(letraDeTexto, codigoTransformado);
        }
        return codigoTransformado;
    }


    private static String convertirLetraACodigoMorse(String letraDeTexto, String codigoTransformado) {
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

        for (int j = 0; j < tablaABC.length; j++) {
            String letraTablaABC= tablaABC[j];
            //if (String.valueOf(letraDeTexto).equals(letraTablaABC)) {
            if (letraTablaABC.equalsIgnoreCase(letraDeTexto)) {
                String caracterEnCodigoMorse = tablaCodigoMorse[j];
                codigoTransformado += "|" + caracterEnCodigoMorse;
                break;
            }
        }
        return codigoTransformado;
    }

    @GetMapping("/hacer-algo")
    public String  primeraPruebaHolaMundo() {
        // como hacer para que al entrar en:
        //  midominio.com/hacer-algo   --> me devuelva el texto "Hola mundo"
        return "Hola mundo!";

    }

    @GetMapping("/generar-password")
    public String generarPassword() {
        double aleatorio = Math.random()*1000000;
        long numeroAleatorio = Math.round(aleatorio);

        String password = "MsCR" + numeroAleatorio;
        return password;
    }

}
*/