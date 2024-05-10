package academy.atl.newsletters.controllers;

import academy.atl.newsletters.models.Lead;
import academy.atl.newsletters.repository.EmailRepository;
import academy.atl.newsletters.validators.EmailValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class NewslettersController {

    @Autowired   // con esta anotacion carga autom el valor del respositorio
    private EmailRepository repositorioDeEmails;

    @PostMapping("/api/newsletter")
    public String registrar(@RequestBody Lead lead) {

        String email = lead.getEmail();

        EmailValidator emailValidator = new EmailValidator();
        if (emailValidator.esValido(email) == false) {
            return "El email no es valido";
        }

        String str = repositorioDeEmails.guardarEmail(email);

        return "Email guardado: " + email + " SQL-> " + str;
    }

    @PostMapping("/api/newsletter/unsuscribe")
    public String eliminar(@RequestBody Lead lead) {
        String email = lead.getEmail();
        repositorioDeEmails.eliminarEmail(email);

        return "Email borrado: " + email;
    }

    @GetMapping("/api/newsletter")
    public List <Lead> listar() {
        List<Lead> listaEmail;

        listaEmail= repositorioDeEmails.listarEmails();

        return listaEmail;
        //return "Lista de Emails: " + listaEmail;
    }


}
