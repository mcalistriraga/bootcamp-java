package Clase_10;

import java.time.LocalDate;

public class Activ02_MainCuenta {
    public static void main (String[] args) {

        Cuenta cuenta1 = new Cuenta();

        LocalDate fechaNacimiento= LocalDate.of(2000, 05, 15);
        Cuenta cuenta2 = new Cuenta(1, "Juan Carlos", 30, fechaNacimiento, "00523821F", 2500.56F);
        cuenta2.mostrar();

        // --PRUEBA DE INGRESO MONTO +
        System.out.println("-----Proxima operacion: INGRESO ----------------------------------------");
        Float monto= 10F;
        if (cuenta2.ingresar(monto)) {
            System.out.println("+++++Se ha ingresado a la cuenta el siguiente monto: " + monto.toString());
        }
        else {
            System.out.println("No se pudo ingresar, el monto (" + monto.toString() + "), es negativo!!");
        }
        cuenta2.mostrar();

        // --PRUEBA DE INGRESO MONTO -
        System.out.println("-----Proxima operacion: INGRESO ----------------------------------------");
        monto= -5F;
        if (cuenta2.ingresar(monto)) {
            System.out.println("+++++Se ha ingresado a la cuenta el siguiente monto: " + monto.toString());
        }
        else {
            System.out.println("No se pudo ingresar, el monto (" + monto.toString() + "), es negativo!!");
        }
        cuenta2.mostrar();

        // --PRUEBA DE RETIRO: saldo mayor al monto a retirar
        System.out.println("-----Proxima operacion: RETIRO ----------------------------------------");
        monto= 5F;
        if (cuenta2.retirar(monto)) {
            System.out.println("+++++Se ha retirado  de la cuenta el siguiente monto: " + monto.toString());
        }
        else {
            System.out.println("No se pudo retirar, el monto: (" + monto.toString() + "), SALDO INSUFICIENTE!!");
        }
        cuenta2.mostrar();

        // --PRUEBA DE RETIRO: saldo menor al monto a retirar
        System.out.println("-----Proxima operacion: RETIRO ----------------------------------------");
        monto= 27545.6F;
        if (cuenta2.retirar(monto)) {
            System.out.println("+++++Se ha retirado  de la cuenta el siguiente monto: " + monto.toString());
        }
        else {
            System.out.println("No se pudo retirar, el monto: (" + monto.toString() + "), SALDO INSUFICIENTE!!");
        }
        cuenta2.mostrar();
    }
}
