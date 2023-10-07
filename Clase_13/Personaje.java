package Clase_13;

import java.util.Random;

public class Personaje {

    // ---- Atributes ----
    protected String nombre;
    protected int nivel;
    protected int puntosDeVida;

    // --- Builders ---
    public Personaje(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosDeVida = 100; // Inicialmente todos los personajes tienen 100 puntos de vida
    }

    // --- Actions on Personaje ---

    public int generarDanio() {
        Random rand = new Random();
        return rand.nextInt(10) + 1; // número entre 1 y 10
    }


    protected void recibirDaño(int danio) {
        puntosDeVida= Math.max(0, puntosDeVida-danio);
        System.out.println(getNombre() + " recibió " + danio + " puntos de daño, le quedan " + puntosDeVida + " puntos de vida!!");
    }
    public void atacar(Personaje obj) {
        int danio= obj.generarDanio(); // rand genera un max de 10% de deño de los puntos otorgados al inicio
        System.out.println("el personaje " + getNombre() + " ataca a " + obj.getNombre() + " y le causa " + danio + " puntos de daño!!");
        obj.recibirDaño(danio);
    }

    public void curarse(int puntosDeCura) {
        this.puntosDeVida+= puntosDeCura;
        System.out.println(getNombre() + " recibió " + puntosDeCura + " puntos de cura. Puntos de vida actuales: " + getPuntosDeVida());
    }

    public void realizarAtaqueEspecial(Personaje obj) {
        int danio= obj.generarDanio()+7; // rand genera un max de 10% de deño de los puntos otorgados al inicio
        System.out.println("personaje " + getNombre() + " realiza ataque especial a " + obj.getNombre() + " y le produce " + danio + " puntos de daño!!");
        obj.recibirDaño(danio);
    }

    // --- Setters and Getters ---
    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public int getPuntosDeVida() {
        return puntosDeVida;
    }
    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

}
