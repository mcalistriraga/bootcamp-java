package Clase_6;
/*
===============================================================================================
* ACTIVIDAD_INDIVIDUAL #3
*    3)	Arma un programa que permita llamar a una persona por Whatsapp. Es similar al anterior.
*       Pídele al usuario que ingrese un número de telefono sin espacios, por ejemplo: 5493541539405
*       Después muestra en consola la concatenación de:
*       “https://api.whatsapp.com/send?phone=” + telefono
*===============================================================================================
*/
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {

        Scanner cargaDeDatos = new Scanner(System.in);

        System.out.println("Introduce el telefono para  llamar por WhatsApp (sin el +) ?");
        String phone = cargaDeDatos.next();
        String cmd= "https://api.whatsapp.com/send?phone=" + phone;
        System.out.println (cmd);
    }
}
