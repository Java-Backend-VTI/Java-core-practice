package entity;

import java.time.LocalDate;

public class Exam {
    // Constructor with all fields
    public Exam(int id, String code, String title, CategoryQuestion category, int duration, Account creator, LocalDate createdAt) {
        this.id = id;
        this.code = code;
        this.title = title;
        this.category = category;
        this.duration = duration;
        this.creator = creator;
        this.createdAt = createdAt;
    }
    private int id;
    private String code;
    private String title;
    private int duration;
    private LocalDate createdAt;
    private CategoryQuestion category;
    private Account creator;
    private Question[] questions;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
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

    public Account getCreator() {
        return creator;
    }

    public void setCreator(Account creator) {
        this.creator = creator;
    }

    public Question[] getQuestions() {
        return questions;
    }

    public void setQuestions(Question[] questions) {
        this.questions = questions;
    }

}
