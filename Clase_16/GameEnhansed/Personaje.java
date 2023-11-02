import java.util.ArrayList;
import java.util.List;

public class Personaje {
    protected int experiencia;
    protected int level;
    protected int hp;  //puntos de energía hasta que se muera
    protected int mana; // esto es para los magos
    // int stamina; // esto es por si va a correr
    // int defenza;  int inteligencia; int daño; int base; // sugerencia alumnos
    // el daño puede ser calculable, mas adlante lo explica
    protected int x, y; // posicion espacial (x,y) del personaje en mapa (map)
                        // para saber si un personaje puede atacar a otro
                        // se hace una logica para saber que tan cerca esta un personaje de otro
    protected String map; // en cual mapa se encuentra

    protected List<Item> items;   // representa todo lo que puede tener el personaje
                                // COMPOSICION: UNA LISTA DE OBJETOS  (dentro de una clase)
    public Personaje() {
        hp = 100; // %
        mana = 100;
        items = new ArrayList<Item>();
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public boolean estaVivo () {
        if (hp <= 0) return false; else return true;
    }
    public void recibirDano (int puntosDeDano) {
        hp= Math.max(0, hp- puntosDeDano);
    }

    // puedes ganar experiencia y subir de level
    public void agregarExperiencia(int puntosDeExperiencia) {
        experiencia += puntosDeExperiencia;
        // lueo podemos verificar si aumenetó de level
    }

    public int getDefensaTotal() {
        int defensaTotal= 0;
        for (Item item: items) {
            defensaTotal+= item.getDefensa();
        }
        return defensaTotal;
    }

    public int getMaxHP() { // max cantidad de puntos de vida que puede tener, dependiendo del nivel del personaje
        return level * 10;
    }
    public int getAtaqueTotal() {
        int ataqueTotal= 0;
        for (Item item: items) {
            if (item instanceof Arma) {// si una variable (item) es de una clase (Arma)
                ataqueTotal+= item.getAtaque();
            }
        }
        return ataqueTotal;
    }
}
