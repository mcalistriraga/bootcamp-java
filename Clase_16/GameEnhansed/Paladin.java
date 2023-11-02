public class Paladin extends Personaje{
    public int getMaxHP() { // max cantidad de puntos de vida que puede tener, dependiendo del nivel del personaje
        // return level * 10 * 2;   // aqui sobreescribimos la funcion getMaxHP(), energia al doble de lo normal, O TAMBIEN..
        return super.getMaxHP()*2;  // estoy invocando a la funcion getMaxHP() de Personaje
                                    // y qui en Paladin q es la extendida la multiplico por 2
    }
}
