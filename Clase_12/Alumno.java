package Clase_12;

import java.util.List;

public class Alumno {
    // propiedades
    private String nombre;
    private String apellido;
    private List<Float> notas;

    // builders

    public Alumno(String nombre, String apellido, List<Float> notas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.notas = notas;
    }

    public Float promedioNotas() {
        Float promedio=0F;
        if (!this.notas.isEmpty()) {
            for (Float nota : notas) {
                promedio+= nota;
            }
            promedio /= notas.size();
        }
        return promedio;
    }


    // Setters and Getters
    public String getNombre() {
        return nombre;
    }

    // public void setNombre(String nombre) {
    //  this.nombre = nombre;
    // }

    public String getApellido() {
        return apellido;
    }

    // public void setApellido(String apellido) {
    //     this.apellido = apellido;
    // }

    public List<Float> getNotas() {
        return notas;
    }

    // public void setNotas(List<Float> notas) {
    //     this.notas = notas;
    // }
}


