package main.java.musica.models;

public class Guitarrista implements Musico {
    @Override
    public void tocarInstrumento() {
        System.out.println("El guitarrista está tocando la guitarra.");
    }
}
