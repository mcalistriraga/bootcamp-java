package Clase_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Activ05_MainGameQuests2 {
/*
    ====================================================================================+
    +    Clase_12--ACTIVIDAD_5                                                          +
    +                                                                                   +
    +    “Crear un juego de adivinar una palabra:                                       +
    +     Este juego consiste en mostrar una pista o descripción y permitir al jugador  +
    +     adivinar la palabra.                                                          +
    +                                                                                   +
    +     Por ejemplo, el programa podría:                                              +
    +         (1) Mostrar el mensaje:                                                   +
    +                   “Es un animal muy grande, con trompa. ¿Qué es?”                 +
    +         (2)  El jugador debe ingresar su respuesta                                +
    +         (3)  y el programa debe verificar si es correcta o no.                    +
    +                                                                                   +
    ====================================================================================+
*/

    public static void main (String[] args) {
        mainGameQuest();
    }

    public static List<QuestGame> loadlistQuestGame() { // carga las preguntas y sus respuestas
        List<QuestGame> listQuests = new ArrayList<>();

        QuestGame quest= new QuestGame();
        quest.setQuestion("de que color es el caballo blanco de Simon Bolivar?");

        List<String> possibleAnswersUsers = Arrays.asList("Blanco", "White");
        quest.setPossibleAnswers(possibleAnswersUsers);
        listQuests.add(quest);

        quest= new QuestGame();
        quest.setQuestion("¿Qué animal se parece a un gato pero es más grande y tiene rayas en su pelaje?");   // ELIMINAR...provisional..
        possibleAnswersUsers = Arrays.asList("felino", "puma");
        quest.setPossibleAnswers(possibleAnswersUsers);
        listQuests.add(quest);

        quest= new QuestGame();
        quest.setQuestion("¿Cuál es el nombre de la fruta pequeña y roja que a menudo se usa para hacer mermelada?");   // ELIMINAR...provisional..
        possibleAnswersUsers = Arrays.asList("frutilla", "fresa");
        quest.setPossibleAnswers(possibleAnswersUsers);
        listQuests.add(quest);

        quest= new QuestGame();
        quest.setQuestion("¿Qué objeto se usa para medir el tiempo y tiene manecillas que giran alrededor de un dial?");   // ELIMINAR...provisional..
        possibleAnswersUsers = Arrays.asList("reloj", "relojería");
        quest.setPossibleAnswers(possibleAnswersUsers);
        listQuests.add(quest);

        quest= new QuestGame();
        quest.setQuestion("¿Cuál es la bebida caliente que se hace con hojas de té y agua hirviendo?");   // ELIMINAR...provisional..
        possibleAnswersUsers = Arrays.asList("infusión", "té", "te");
        quest.setPossibleAnswers(possibleAnswersUsers);
        listQuests.add(quest);

        quest= new QuestGame();
        quest.setQuestion("¿Qué animal vuela por la noche y puede girar la cabeza 180 grados?");   // ELIMINAR...provisional..
        possibleAnswersUsers = Arrays.asList("lechuza", "búho");
        quest.setPossibleAnswers(possibleAnswersUsers);
        listQuests.add(quest);

        quest= new QuestGame();
        quest.setQuestion("¿Cuál es el nombre de la prenda de vestir que se usa en la parte inferior del cuerpo y cubre las piernas?");
        possibleAnswersUsers = Arrays.asList("pantalón", "calzón");
        quest.setPossibleAnswers(possibleAnswersUsers);
        listQuests.add(quest);

        quest= new QuestGame();
        quest.setQuestion("¿Qué instrumento musical de viento se toca soplando a través de una boquilla y tiene teclas para cambiar la nota?");
        possibleAnswersUsers = Arrays.asList("clarinete", "saxofón");
        quest.setPossibleAnswers(possibleAnswersUsers);
        listQuests.add(quest);

        quest= new QuestGame();
        quest.setQuestion("¿Cuál es el nombre de la bebida gaseosa que a menudo se asocia con refrescos de cola?");
        possibleAnswersUsers = Arrays.asList("gaseosa", "soda");
        quest.setPossibleAnswers(possibleAnswersUsers);
        listQuests.add(quest);

        quest= new QuestGame();
        quest.setQuestion("¿Qué animal tiene una caparazón y se esconde dentro cuando se siente amenazado?");
        possibleAnswersUsers = Arrays.asList("tortuga", "quelonio");
        quest.setPossibleAnswers(possibleAnswersUsers);
        listQuests.add(quest);

        quest= new QuestGame();
        quest.setQuestion("¿Cuál es el objeto que se usa para escribir o dibujar y generalmente contiene tinta?");
        possibleAnswersUsers = Arrays.asList("bolígrafo", "pluma");
        quest.setPossibleAnswers(possibleAnswersUsers);
        listQuests.add(quest);

        return listQuests;
    }

    private static Integer getAleatoryIndexQuest(Integer maxIndex) {
        double aleatoryDouble= Math.random()*(maxIndex-1);
        long aleatoryIndex= Math.round(aleatoryDouble);

        return (int) aleatoryIndex;
    }

    public static QuestGame getNextQuestionRandom(List<QuestGame> listQuestGame) {
        QuestGame quest= new QuestGame();
        if (!listQuestGame.isEmpty()) {  // si no esta vacia solicita preg aleatoria de la lista
            int aleatoryIndex = getAleatoryIndexQuest((int)listQuestGame.size());
            quest = listQuestGame.get(aleatoryIndex);
        }
        return quest;
    }

    public  static String QuestionAtUser(QuestGame quest) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Responde la siguiente pregunta...");
        System.out.println(quest.getQuestion());
        return teclado.nextLine(); //answereUser
    }

    public  static boolean checkAnswereUser(QuestGame questGame, String answereUser) {
        boolean resultCheck= false;
        for (String answere: questGame.getPossibleAnswers()) {
            if (answereUser.equalsIgnoreCase(answere)) {
                resultCheck = true;
                break;
            }
        }
        return resultCheck;
    }
    public static void mainGameQuest() {
        Scanner teclado = new Scanner(System.in);
        List<QuestGame> listQuestGame = loadlistQuestGame();

        boolean gaming= true;
        while (gaming) {
            QuestGame questGame = getNextQuestionRandom(listQuestGame);
            String answereUser= QuestionAtUser(questGame);
            if (checkAnswereUser(questGame, answereUser)) { //true
                System.out.println("<<<<Felicitaciones,...Ganaste!!!>>>");
            }
            else
            {
                System.out.println("Ohooo Perdiste!!, pero tienes otra oportunidad!!");
                System.out.println("respuesta correcta(s): ");
                for (String answer: questGame.possibleAnswers) {
                    System.out.println(answer);
                }
            }
            System.out.println("Deseas continuar jugando (s/n)?:");
            if (!teclado.nextLine().equalsIgnoreCase("S")) { gaming = false;}
        }
        System.out.println("Fin del Juego!!!,...I will came back to game with you!!");
    }
}

