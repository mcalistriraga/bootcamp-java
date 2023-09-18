package Clase_10;

public class Cliente {
    // ............ Declaración de Propiedades ..................
    private  String nombre;
    private String apellido;
    private Integer edad;


//                          Nota: ..... Patron de diseño: build ......
//
//     se utiliza mucho el patrón de diseño builder que la idea es tratar de que cuando se crea un objeto,
//       cuando se crea por ejemplo el objeto cliente tenga todos los datos que necesite
//       y que no sé modifiquen nunca más hasta que desaparezca o sea se carga el cliente
//       y que esto del set en el medio del programa No te lo deja hacer en ningún momento
 //

    // Decaración de constructores: Building
    public Cliente() {
        System.out.println("****PASE POR ACA....");
    }

    public Cliente(String parametroNombre, String parametroApellido, int parametroEdad) {
        nombre = parametroNombre;
        apellido = parametroApellido;
        edad= parametroEdad;
    }


    // ............ Declaración de Métodos ..................
    public void mostrarDatos() {
        System.out.println("Nombre completo: " + nombre + ", " + apellido);
        System.out.println(edad);
    }
    // ... lo que propone la programación con getters Y setters ....
    // mutabilidad: SI NO HAYYY setters obj que no se puede modificar luego de creado, "obj inmutable".
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String value) {
        nombre = value;
    }

    public String getApellido() {
        return nombre;
    }

    public void setApellido(String value) {
        nombre = value;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int value) {
        edad = value;
    }

}
