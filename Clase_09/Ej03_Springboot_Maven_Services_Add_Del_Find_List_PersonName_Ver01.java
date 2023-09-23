package com.bootcamp.bootcampnamingserv;
/*
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class NamingServController {

    private ArrayList <String> listaPersonas= new ArrayList<>(); // estas son..algunas personas posibles...

    public NamingServController () { // constructor inicializa la lista
        this.listaPersonas.add("Manuel Domingo Calistri");
        this.listaPersonas.add("Luz Maina Briceño");
        this.listaPersonas.add("Jesus Manuel Calistri");
        this.listaPersonas.add("Melanie Carolina Calistri");
        this.listaPersonas.add("Juan Carlos Calistri");
    }

    @GetMapping("/find-person/{busqueda}")
    public String findNamePerson(@PathVariable String busqueda) {
        // lógica de busqueda
        String resultadoDeBusqueda= "No encontrada!!";
        for (String nombrePersona:listaPersonas)
        {
            if (nombrePersona.toLowerCase().contains(busqueda.toLowerCase())) {
                resultadoDeBusqueda= nombrePersona;
                break;
            }
        }
        return resultadoDeBusqueda;
    }

    @GetMapping("/add-person/{newNamePerson}")
    public String addNamePerson(@PathVariable String newNamePerson) {

        // lógica de busqueda
        boolean personExist= false;
        for (String nombrePersona:listaPersonas)
        {
            if (nombrePersona.equalsIgnoreCase(newNamePerson)) {
                personExist= true;
                listaPersonas.add(newNamePerson);
                break;
            }
        }
        if (!personExist)
            { return "added: " + newNamePerson; }
        else
            { return "it already exists!!"; }
    }

    @GetMapping("/del-person/{delNamePerson}")
    public String delNamePerson(@PathVariable String delNamePerson) {

        // lógica de busqueda
        boolean personExist= false;
        for (String nombrePersona:listaPersonas)
        {
            if (nombrePersona.equalsIgnoreCase(delNamePerson)) {
                personExist= true;
                listaPersonas.remove(delNamePerson);
                break;
            }
        }
        if (personExist)
            {return "deleted: " + delNamePerson;  }
        else
            {return "Not deleted!!, it no exists..";}
    }

    @GetMapping("/list-person")
    public ArrayList <String> addNamePerson() {

        // lógica de busqueda
        return listaPersonas;
    }

}
*/