package entity;

public class ExamQuestion {
    // Constructor with all fields
    public ExamQuestion(Exam exam, Question question) {
        this.exam = exam;
        this.question = question;
    }
    private Exam exam;
    private Question question;

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

}
