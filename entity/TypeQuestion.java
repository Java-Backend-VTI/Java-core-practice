package entity;

public class TypeQuestion {
    // Constructor with all fields
    public TypeQuestion(int id, QuestionType name) {
        this.id = id;
        this.name = name;
    }
    private int id;
    private QuestionType name;
    private Question[] questions;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public QuestionType getName() {
        return name;
    }

    public void setName(QuestionType name) {
        this.name = name;
    }

    public Question[] getQuestions() {
        return questions;
    }

    public void setQuestions(Question[] questions) {
        this.questions = questions;
    }

}
