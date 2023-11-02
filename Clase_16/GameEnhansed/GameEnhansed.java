import java.util.ArrayList;
import java.util.List;

public class GameEnhansed {
    public static void main(String[] args) {

        List<Personaje> personajes = new ArrayList<>();

        Personaje p1 = new Personaje(); // creamos un personaje

        p1.recibirDano(50); // definimos el daño que puede recibir

        // definicion de los Items que puede tener un Personaje en el Game
        Item casco = new Item();
        casco.setDefensa(5); // 5 de defensa al casco

        Item escudo = new Item();
        escudo.setDefensa(30); // 30 de defensa al escudo

        Item botas = new Item();
        botas.setDefensa(2); // 2 de defensa a las botas

        Item espada = new Item();
        espada.setAtaque(60); // 30 de ataque para la espada

        p1.getItems().add(casco);
        p1.getItems().add(escudo);
        p1.getItems().add(botas);
        p1.getItems().add(espada);


        // creamos un SEGUNDO personaje
        Personaje p2= new Personaje();

        p2.getDefensaTotal();
        Item escudoDeMadera = new Item();
        escudoDeMadera.setDefensa(15); // 15 de defensa al escudoDeMadera

        int ataque= p1.getAtaqueTotal();
        int puntosDeDano= p2.getDefensaTotal()-ataque;
        p2.recibirDano(puntosDeDano);
    }
}
