package Clase_13;
public class Activ01_MainGamePersonaje {
    public static void main (String[] args) {
        mainJuegoDeRol();
    }
    private static void mainJuegoDeRol() {
        Guerrero guerrero = new Guerrero("'Caballero Cruzado'", 8, 20);
        Mago mago = new Mago("'Mago Merlin'", 7);
        Arquero arquero = new Arquero("'Arquero Ismael'", 6);

        System.out.println("Comienza la batalla!!");

        guerrero.atacar(mago);
        mago.realizarAtaqueEspecial(guerrero);

        arquero.lanzarFlecha(mago);
        mago.lanzarHechizo(arquero);

        guerrero.curarse(7);
        mago.curarse(5);
        arquero.curarse(4);
    }

}
