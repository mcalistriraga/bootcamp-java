package com.bootcamp.bootcamptrivia;

import com.bootcamp.bootcamptrivia.entities.Categoria;
import com.bootcamp.bootcamptrivia.entities.Pregunta;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class TriviaController {

    Map<String, Pregunta> diccionarioPreguntas = new HashMap<>(); // diccionario de categoria:preguntas

    // Builders: TriviaController
    public TriviaController() {
    }

    private Map<String, Pregunta> makePreguntas() {

        Map<String, Pregunta> diccionario = new HashMap<>(); // diccionario de categoria:preguntas

        // Cultura
        List<String> opciones1 = Arrays.asList("Argentina", "Brasil", "España", "Uruguay");
        Pregunta quest1 = new Pregunta("Cultura", "¿En qué país se originó el tango?", opciones1, 0, "El tango es un género musical y baile que se originó en Argentina, especialmente en la región de Río de la Plata.");
        diccionario.put("Cultura",quest1);

        //Deportes
        List<String> opciones2 = Arrays.asList("Tenis", "Bádminton", "Squash", "Ping Pong");
        Pregunta quest2 = new Pregunta("Deportes", "¿En qué deporte se utiliza una raqueta para golpear un volante?", opciones2, 1, "En el bádminton, los jugadores utilizan raquetas para golpear un volante por encima de la red hacia el lado contrario.");
        diccionario.put("Deportes", quest2);

        //Arte
        List<String> opciones3 = Arrays.asList("Vincent van Gogh", "Leonardo da Vinci", "Pablo Picasso", "Michelangelo");
        Pregunta quest3 = new Pregunta("Arte", "¿Quién pintó la Mona Lisa?", opciones3, 1, "La Mona Lisa fue pintada por Leonardo da Vinci, uno de los artistas más influyentes del Renacimiento.");
        diccionario.put("Arte", quest3);

        //Cine
        List<String> opciones4 = Arrays.asList("Vengadores: Endgame", "Avatar", "Titanic", "Star Wars: El despertar de la fuerza");
        Pregunta quest4 = new Pregunta("Cine", "¿Cuál es la película con mayores ingresos de taquilla de todos los tiempos (hasta la fecha de corte en 2021)?", opciones4, 0, "Hasta 2021, la película con mayores ingresos de taquilla es 'Vengadores: Endgame', producida por Marvel Studios.");
        diccionario.put("Cine", quest4);

        //Historia
        List<String> opciones5 = Arrays.asList("1700", "1800", "1900", "2000");
        Pregunta quest5 = new Pregunta("Historia", "¿En qué año tuvo lugar la Revolución Industrial?", opciones5, 1, "La Revolución Industrial comenzó en el siglo XIX, aproximadamente en el siglo XVIII, y trajo consigo cambios significativos en la producción y la sociedad.");
        diccionario.put("Historia", quest5);

        //Ciencia
        List<String> opciones6 = Arrays.asList("Átomo", "Molécula", "Célula", "Organismo");
        Pregunta quest6 = new Pregunta("Ciencia", "¿Cuál es la unidad básica de la vida?", opciones6, 2, "La célula es la unidad básica de la vida, siendo la estructura más pequeña capaz de realizar todas las funciones necesarias para la vida.");
        diccionario.put("Ciencia", quest6);

        return diccionario;
    }


    public List<Categoria> makeCategories() {

        Categoria category1 = new Categoria("Cultura", "Preguntas relacionadas con arte, literatura, música y otras expresiones culturales.");
        Categoria category2 = new Categoria("Deportes", "Preguntas sobre deportes, atletas destacados y eventos deportivos.");
        Categoria category3 = new Categoria("Arte", "Preguntas sobre obras literarias, artistas famosos y movimientos artísticos.");
        Categoria category4 = new Categoria("Cine", "Preguntas sobre películas, series de televisión y la industria del entretenimiento.");
        Categoria category5 = new Categoria("Historia", "Preguntas relacionadas con eventos históricos y figuras importantes.");
        Categoria category6 = new Categoria("Ciencia", "Preguntas sobre varios campos de la ciencia, como biología, química y física.");

        List<Categoria> categoriesListTrivia = Arrays.asList(category1, category2, category3, category4, category5, category6);

        return categoriesListTrivia;
    }

    public List<Categoria> getCategiries() {
        List<Categoria> categoriesListTrivia = new ArrayList<Categoria>();
        categoriesListTrivia = makeCategories();

        return categoriesListTrivia;
    }
    @GetMapping("/categories")
    public List<Categoria> urlGetCategories() {

        List<Categoria> categoriesListTrivia = new ArrayList<Categoria>();

        categoriesListTrivia = getCategiries();

        return categoriesListTrivia;
    }

    public Pregunta getQuestion(String Category) {

        Pregunta quest = new Pregunta();
        diccionarioPreguntas = makePreguntas();
        quest = diccionarioPreguntas.get(Category);
        return quest;

    }


    @GetMapping("/question/{Category}")
    public Pregunta urlGetQuestion(@PathVariable String Category) {
        Pregunta quest = new Pregunta();
        quest = getQuestion(Category);
        return quest;
    }

    public List<Pregunta>  getAllQuestion() {
        List<Pregunta>questionsListTrivia = new ArrayList<Pregunta>();
        Pregunta quest = new Pregunta();
        diccionarioPreguntas = makePreguntas(); // inicializa el diccionario
        for (String clave:diccionarioPreguntas.keySet()) {
            quest = diccionarioPreguntas.get(clave);
            questionsListTrivia.add(quest);
        }
        return questionsListTrivia;
    }
    @GetMapping("/question")
    public List<Pregunta> urlGetQuestion() {
        //Map<String, Pregunta> diccionarioPreguntas = new HashMap<>(); // diccionario de categoria:preguntas

        List<Pregunta> questionsListTrivia = new ArrayList<Pregunta>();

        questionsListTrivia = getAllQuestion();

        return questionsListTrivia;
    }

}
