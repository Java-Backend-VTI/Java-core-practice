package entity;

public class Answer {
    // Constructor with all fields
    public Answer(int id, String content, Question question, boolean isCorrect) {
        this.id = id;
        this.content = content;
        this.question = question;
        this.isCorrect = isCorrect;
    }

    // Constructor with id and content
    public Answer(int id, String content) {
        this.id = id;
        this.content = content;
    }
    private int id;
    private String content;
    private boolean isCorrect;
    private Question question;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean isCorrect) {
        this.isCorrect = isCorrect;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

}
