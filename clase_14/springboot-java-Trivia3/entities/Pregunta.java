package entities;//import java.util.ArrayList;

public class Pregunta {
    // propiedades
    private String category;
    private String question;
    private String[] options;  // antes: "private List<String> options;"
    private Integer answer;
    private String explanation;

    public Pregunta() {

    }
    //public Pregunta(String category, String question, List<String>  options, Integer answer, String explanation) {
    public Pregunta(String category, String question, String[] options, Integer answer, String explanation) {
        this.category= category;
        this.question= question;
        this.options= new String[3];
        System.arraycopy(options, 0, this.options, 0, options.length);
        this.answer=answer;
        this.explanation=explanation;
    }

    //metodos: getters and setters
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    //public List<String> getOptions() {
    //    return options;
    //}
    //public void setOptions(List<String> options) {
    //    this.options = options;
    //}

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public Integer getAnswer() {
        return answer;
    }

    public void setAnswer(Integer answer) {
        this.answer = answer;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }
}



