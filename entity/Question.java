package entity;

import java.time.LocalDate;

public class Question {
    // Constructor with all fields
    public Question(int id, String content, CategoryQuestion category, TypeQuestion type, Account creator, LocalDate createdAt) {
        this.id = id;
        this.content = content;
        this.category = category;
        this.type = type;
        this.creator = creator;
        this.createdAt = createdAt;
    }
    private int id;
    private String content;
    private LocalDate createdAt;
    private CategoryQuestion category;
    private TypeQuestion type;
    private Account creator;
    private Answer[] answers;
    private Exam[] exams;

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

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public CategoryQuestion getCategory() {
        return category;
    }

    public void setCategory(CategoryQuestion category) {
        this.category = category;
    }

    public TypeQuestion getType() {
        return type;
    }

    public void setType(TypeQuestion type) {
        this.type = type;
    }

    public Account getCreator() {
        return creator;
    }

    public void setCreator(Account creator) {
        this.creator = creator;
    }

    public Answer[] getAnswers() {
        return answers;
    }

    public void setAnswers(Answer[] answers) {
        this.answers = answers;
    }

    public Exam[] getExams() {
        return exams;
    }

    public void setExams(Exam[] exams) {
        this.exams = exams;
    }

}