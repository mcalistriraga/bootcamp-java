package Clase_13;

public class Arquero extends Personaje {

    public Arquero(String nombre, int  nivel) {
        super(nombre, nivel);

    }
    // --- metodos ---
    public void lanzarFlecha( Personaje obj) {
        int danio = generarDanio() + 5;  // arquero hace un poco mas de daño
        System.out.println("El " + getNombre() + " lanza una flecha al personaje " + obj.getNombre() + " y le causa " + danio + " puntos de daño!!");
        obj.recibirDaño(danio);
    }
}

