package Clase_13;

public class Mago extends Personaje {
    // --- Atributes ---
    public Mago(String nombre, int nivel) {

        super(nombre, nivel);
    }


    // -- metodos: acciones del personaje Mago
    public void lanzarHechizo(Personaje obj) {
        int danio= generarDanio()*2; // el mago genera un daño doble
        System.out.println( "El " + getNombre() + " lanza un hechizo al personaje " + obj.getNombre() + " y le causa " + danio + " puntos de daño!!");
        obj.recibirDaño(danio);
    }
}
