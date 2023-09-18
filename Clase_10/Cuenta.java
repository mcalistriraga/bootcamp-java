package Clase_10;

import java.time.LocalDate;

public class Cuenta extends Persona { // clase padre o superclase: Cuenta, clase hija o subclase: Persona
    // ... decaración de Propiedades ....
    //private Persona titular; // (que es una persona)
    private Float cantidad; //(puede tener decimales)

    // métodos de la clase Cuenta:

    // - constructor sin datos.
    public Cuenta() {
    }

    // - constructor con datos
    public Cuenta(int parameterID, String parameterNombre, int parameterEdad,LocalDate parameterFechaNacimiento, String parameterDNI, Float parameterCantidad) {
        super (parameterID, parameterNombre, parameterEdad, parameterFechaNacimiento, parameterDNI);
        setCantidad(parameterCantidad);
    }

    //	ingresar(cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida
    //	es negativa, no se hará nada.
    public boolean ingresar(Float monto) {
        boolean operacion= false;
        if (monto >= 0) { // procede a abonar
            this.setCantidad(this.getCantidad()+monto);
            operacion = true;
        }
        return operacion;
    }

    // retirar(cantidad): se retira una cantidad a la cuenta.
    // La cuenta puede estar en números rojos.
    public boolean retirar(Float monto) {
        boolean operacion= false;
        if ((this.getCantidad()-monto) >= 0) { // es posible retirar
            this.setCantidad(this.getCantidad()-monto);
            operacion = true;
        }
        return operacion;
    }


    public void mostrar() {
        System.out.println("A continuación se muestran los datos del titular de la Cuenta...");

        System.out.println("id: " + this.getId());
        System.out.println("nombre: " + this.getNombre());
        System.out.println("edad: " + this.getEdad());
        System.out.println("Fecha de Nacimiento: " + this.getFechaNacimiento());
        System.out.println("dni: " + this.getDni());

        System.out.println("Cantidad: " + getCantidad());
    }

    private void  setCantidad(Float value) {
        cantidad = value;
    }

    public Float  getCantidad() {
        return(cantidad);
    }


}