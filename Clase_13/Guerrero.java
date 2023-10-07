package Clase_13;

public class Guerrero extends Personaje {

    int fuerzaDeAtaque;

    public Guerrero(String nombre, int nivel, int fuerzaDeAtaque) {
        super(nombre, nivel);
        this.fuerzaDeAtaque = fuerzaDeAtaque;
    }

    public void realizarAtaqueEspecial() {
        int danio= fuerzaDeAtaque*2;
        System.out.println("El " + getNombre() + " realiza ataque especial produciendo " + danio + " puntos de daño!!" );
    }

}

