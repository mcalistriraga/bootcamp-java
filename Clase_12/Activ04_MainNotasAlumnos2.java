package Clase_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
====================================================================================+
+    Clase_12--ACTIVIDAD_4                                                          +
+    “Crear un programa para ingresar las notas de los alumnos utilizando           +
+     programación orientada a objetos:                                             +
+     el programa debe permitir al usuario cargar las notas de varios alumnos.      +
+     Cada alumno debe tener atributos como nombre, apellido y una lista de notas.” +
====================================================================================+
*/

public class Activ04_MainNotasAlumnos2 {
    public static void main (String[] args) {
        mainGestionarAlumnos();
    }

    private static List<Float>  loadNotasDelAlumno() {

            Scanner teclado_f = new Scanner(System.in);
            Scanner teclado_s = new Scanner(System.in);
            List<Float> notas = new ArrayList<>();
            boolean cont= true;
            while (cont) {
                System.out.println("Introduzca la nota del alumno: ");
                Float  notaAlumno= teclado_f.nextFloat();
                notas.add(notaAlumno);
                System.out.println("mas notas (s/n)? ");
                if (!teclado_s.nextLine().equalsIgnoreCase("S")) { cont = false;}
            }
            return notas;
    }
    private static String loadNombreDelAlumno() {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduzca el nombre del alumno: ");
            return teclado.nextLine();
    }
    private static String loadApellidoDelAlumno() {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduzca el apellido del alumno: ");
            return teclado.nextLine();
    }
    private static List<Alumno> loadDatosAlumnos() {
        List<Alumno> alumnos = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        System.out.println("A continuación Introduzca los datos de los alumnos: ");
        boolean cont= true;
        while (cont) {
            Alumno alumno = new Alumno(loadNombreDelAlumno(), loadApellidoDelAlumno(), loadNotasDelAlumno());
            alumnos.add(alumno);
            System.out.println("mas alumnos (s/n)? ");
            if (!teclado.nextLine().equalsIgnoreCase("S")) { cont = false;}
        }
        return alumnos;
    }
    private static void mainGestionarAlumnos() {
        List<Alumno> alumnos;
        alumnos = loadDatosAlumnos();

        System.out.println("A continuacion los datos de los alumnos almacenados:");
        for (Alumno alumno : alumnos) {
            System.out.print(alumno.getNombre() + ", " + alumno.getApellido() + ", Notas:");
            for (Float nota : alumno.getNotas()) {
                System.out.print(nota + ", ");
            }
            System.out.println("\n");
        }
        System.out.println("\n");
    }
}

