package entity;

public class CategoryQuestion {
    // Constructor with all fields
    public CategoryQuestion(int id, String name) {
        this.id = id;
        this.name = name;
    }
    private int id;
    private String name;
    private Question[] questions;
    private Exam[] exams;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Question[] getQuestions() {
        return questions;
    }

    public void setQuestions(Question[] questions) {
        this.questions = questions;
    }

    public Exam[] getExams() {
        return exams;
    }

    public void setExams(Exam[] exams) {
        this.exams = exams;
    }

}
