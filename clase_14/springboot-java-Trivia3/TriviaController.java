import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TriviaController {

    // Builders: TriviaController
    public TriviaController() {
    }

    // http://localhost:8080/categories
    @GetMapping("/categories")
    public String  GetCategories() {

        String categories = "[\n" +
                "  {\n" +
                "    \"category\": \"Cultura\",\n" +
                "    \"description\": \"Preguntas relacionadas con arte, literatura, música y otras expresiones culturales.\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"category\": \"Deportes\",\n" +
                "    \"description\": \"Preguntas relacionadas con diversos deportes y eventos deportivos.\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"category\": \"Arte\",\n" +
                "    \"description\": \"Preguntas relacionadas con pintura, escultura, arquitectura y otras formas de expresión artística.\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"category\": \"Cine\",\n" +
                "    \"description\": \"Preguntas relacionadas con películas, directores, actores y otros aspectos del cine.\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"category\": \"Historia\",\n" +
                "    \"description\": \"Preguntas relacionadas con eventos históricos, personajes y períodos importantes.\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"category\": \"Ciencia\",\n" +
                "    \"description\": \"Preguntas relacionadas con diferentes ramas de la ciencia, descubrimientos y avances científicos.\"\n" +
                "  }\n" +
                "]";
        return categories;
    }


    // http://localhost:8080/question/Ciencia
    @GetMapping("/question/{Category}") // END POINT: ue nos devuelve una pregunta
    public Pregunta urlGetQuestion(@PathVariable String Category) {

        ChatGptClient chatGpt = new ChatGptClient();

        JSONObject jsonContentMainObject= chatGpt.enviarPregunta(makeQuestionClient(Category));

        Pregunta pregunta= getPreguntaOfContentObject(jsonContentMainObject);

        return pregunta;
    }

    private static Pregunta getPreguntaOfContentObject(JSONObject contentObject) {
        // Acceder a los elementos del  array "options"
        JSONArray optionsArray = contentObject.getJSONArray("options");

        // Cargar arreglo options
        String options[] = new String[3];
        for (int i=0; i < optionsArray.length();i++)
        { options[i]= optionsArray.getString(i); }

        // retornar objeto Pregunta para la Trivia
        return new Pregunta(contentObject.getString("category"), contentObject.getString("question"), options, contentObject.getInt("answer"), contentObject.getString("explanation"));
    }

    private static String makeQuestionClient(String categoria) {
        String pregunta;
        pregunta = "Para una trivia, dame una pregunta diferente de la categoria " + categoria + ", tres opciones a elegir,  " +
                "indica con un numero cual de ellas es la correcta, la primera seria 0. " +
                "Tu respuesta en JSON y sin explicaciones adicionales, el JSON con la siguiente estructura: " +
                "{\\n" +
                "  \\\"category\\\": \\\"aqui va el nombre de la categoria\\\",\\n" +
                "  \\\"question\\\": \\\"aqui va la pregunta\\\",\\n" +
                "  \\\"options\\\": [\\n" +
                "    \\\"aqui va la opcion 1\\\",\\n" +
                "    \\\"aqui va la opcion 2\\\",\\n" +
                "    \\\"aqui va la opcion 3\\\"\\n" +
                "  ],\\n" +
                "  \\\"answer\\\": aqui va la respuesta correcta, en caso de ser la primera es el numero 0,\\n" +
                "  \\\"explanation\\\": \\\"aca va la explicacion diciendo porque es la respuesta correcta. \\\"\\n" +
                "}";
        return pregunta;
    }

}

