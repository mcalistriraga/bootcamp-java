package com.bootcamp.bootcamp;
/*
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
public class BusquedaController {
    // ..dominio_de_la_pag_web../buscar/...cadena..del..usuario..
    // localhost:8080/buscar/java bootcamp 2023
    @GetMapping("/busqueda-usuario/{busqueda}")
    public String[] obtenerPalabrasAutocompletar(@PathVariable String busqueda) {

        // lógica de busqueda
        String frasesTipicadDeBusqueda[]= {"bootcamp de java", "bootcamp de python", "curso de nodejs",
                "curso de C", "botcamp avanzado de java"}; // estas son..algunas fraces para autocompletar...

        String[] resultadoDeBusqueda= new String[10];

        int j=0;
        for (String frase:frasesTipicadDeBusqueda)
        {
            if (frase.contains(busqueda)) {
                resultadoDeBusqueda[j++]= frase;
            }
        }
        return resultadoDeBusqueda;
    }
}
*/