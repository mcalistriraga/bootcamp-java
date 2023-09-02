package Clase_6;
/*
===============================================================================================
* ACTIVIDAD_INDIVIDUAL #8
*    8)	Escribe un programa que permita al usuario jugar el juego clásico
*       de "piedra, papel, tijeras" contra la computadora. El programa debe solicitar
*       al usuario que ingrese su elección (piedra, papel o tijeras) y luego generar
*       una elección aleatoria para la computadora. Después de eso, el programa debe
*       determinar el ganador según las reglas del juego y mostrar el resultado.
*
*       ¿Quién gana a quién?
*           - La tijera gana al papel porque le puede cortar.
*           - La piedra gana a las tijeras porque las rompe.
*           - El papel gana a la piedra porque la envuelve.
*===============================================================================================
*/

import java.util.Scanner;
class Main {
    public static void main (String[] args) {
        int piedra  = 1;
        int papel   = 2;
        int tijera  = 3;

        Scanner cargaDeDatos = new Scanner(System.in);

        while(true) {
            System.out.println("**** JUEGO DE PIEDRA, PAPEL o TIJERA *****");
            System.out.println("Introduce tu opción 1:Piedra, 2:Papel, 3:Tijera, -1:Fin ?");

            int opUser = cargaDeDatos.nextInt();
            if (opUser < 0) break;

            int opPc = (int) (Math.random() * 3 + 1);

            if (opUser == opPc) {
                System.out.println("Empate!!, ambos indicaron la opción--> " + opUser);
            } else if (opUser == piedra && opPc == papel) {
                System.out.println("Tu-->piedra");
                System.out.println("maquina-->papel");
                System.out.println("Gane yo (Pc)!!");
            } else if (opUser == piedra && opPc == tijera) {
                System.out.println("Tu-->piedra");
                System.out.println("maquina-->tijera");
                System.out.println("Ganaste!!");
            } else if (opUser == papel && opPc == piedra) {
                System.out.println("Tu-->papel");
                System.out.println("maquina-->piedra");
                System.out.println("Ganaste!!");
            } else if (opUser == papel && opPc == tijera) {
                System.out.println("Tu-->papel");
                System.out.println("maquina-->tijera");
                System.out.println("Gane yo (Pc)!!");
            } else if (opUser == tijera && opPc == piedra) {
                System.out.println("Tu-->tijera");
                System.out.println("maquina-->piedra");
                System.out.println("Gane yo (Pc)!!");
            } else if (opUser == tijera && opPc == papel) {
                System.out.println("Tu-->tijera");
                System.out.println("maquina-->papel");
                System.out.println("Ganaste!!");
            }
            System.out.println("Pulsa una tecla c para continuar....!!");
            String c= cargaDeDatos.next();
        }
        System.out.println("*************  Fin del juego!!**************");
    }
}