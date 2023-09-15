package com.bootcamp.bootcamptrivia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TriviaController {

    //private ArrayList <String> answersList= new ArrayList<>(); // estas son..algunas personas posibles...

    public static ArrayList<Question> questionListTrivia = new ArrayList<Question>();

    public TriviaController () { // constructor
        Question q;

        String[] optionsCultura= {"resp1", "resp2", "resp3"};
        q = new Question("Cultura", "pregunta cultura",optionsCultura , 0, "explicacion resp Cultura");
        questionListTrivia.add(q);

        String[] respDeportes= {"resp1", "resp2", "resp3"};
        q = new Question("Deportes", "pregunta Deportes", respDeportes, 0, "explicacion resp Deportes");
        questionListTrivia.add(q);

        String[] respArte= {"resp1", "resp2", "resp3"};
        q = new Question("Arte", "pregunta Arte", respArte, 0, "explicacion resp Atre");
        questionListTrivia.add(q);

        String[] respCine= {"resp1", "resp2", "resp3"};
        q = new Question("Cine", "pregunta Cine", respCine, 0, "explicacion resp Cine");
        questionListTrivia.add(q);

        String[] respHistoria= {"resp1", "resp2", "resp3"};
        q = new Question("Historia", "pregunta Historia", respHistoria, 0, "explicacion resp Historia");
        questionListTrivia.add(q);

        String[] respCiencia= {"resp1", "resp2", "resp3"};
        q = new Question("Ciencia", "pregunta Ciencia", respCiencia, 0, "explicacion resp Ciencia");
        questionListTrivia.add(q);
    }

    @GetMapping("/trivia/{findCategory}")
    public Question findQuestion(@PathVariable String findCategory) {
        // lógica de busqueda
        Question triviaQuestion= new Question(); //OJOO REVISAR ESTO
        for (Question question:questionListTrivia)
        {   String nameCategory= question.getCategory();
            if (nameCategory.equalsIgnoreCase(findCategory.toLowerCase())) {
                triviaQuestion= question;  //OJOO REVISAR ESTO
                break;
            }
        }
        return triviaQuestion;
    }
}
