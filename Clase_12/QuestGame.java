package Clase_12;

import java.util.List;

public class QuestGame {
    // atributes
    public  String question;
    public List<String> possibleAnswers;

    // builders
    public QuestGame2() {

    }

    // metods
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getPossibleAnswers() {
        return possibleAnswers;
    }

    public void setPossibleAnswers(List<String> possibleAnswers)
    {
        this.possibleAnswers = possibleAnswers;
    }
}

