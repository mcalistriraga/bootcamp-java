package main.java.musica.models;

public class Pianista implements Musico {
    @Override
    public void tocarInstrumento() {
        System.out.println("El pianista está tocando el piano.");
    }
}

