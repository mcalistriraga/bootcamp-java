package Clase_10;

import java.time.*; // Este paquete contiene LocalDate, LocalTime y LocalDateTime.
import java.time.chrono.ChronoLocalDate;

public class Persona {
    // properties declaration
    int id;
    String nombre;
    int edad;
    LocalDate fechaNacimiento;
    String dni;

    // Bilding  delaration

    public Persona() {
        id= 0;
        nombre="";
        edad=0;
        fechaNacimiento= null;
        dni="";
    }

    public Persona(int parameterID, String parameterNombre, int parameterEdad, LocalDate parameterFechaNacimiento, String parameterDNI) {
        id=  parameterID;
        nombre = parameterNombre;
        edad = parameterEdad;
        fechaNacimiento= parameterFechaNacimiento;
        dni = parameterDNI;
    }

    // method: mostrar()
    public void mostrar() {
        System.out.println("La persona tiene los siguientes datos:");
        System.out.println("Id: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de Naciemiento: " + fechaNacimiento);
        System.out.println("Edad: " + edad);
        System.out.println("DNI: " + dni);
    }

    public boolean esMayorDeEdad() {
        if (edad >= 18) { return true; }
        else { return false; }
    }


    //  Setter and Getter declaration
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

}
