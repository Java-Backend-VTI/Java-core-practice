package entity;

import java.time.LocalDate;

public class Group {
    // Constructor with all fields
    public Group(int id, String name, Account creator, LocalDate createdAt, Account[] members) {
        this.id = id;
        this.name = name;
        this.creator = creator;
        this.createdAt = createdAt;
        this.members = members;
    }
    private int id;
    private String name;
    private Account creator;
    private LocalDate createdAt;
    private Account[] members;

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

    public Account getCreator() {
        return creator;
    }

    public void setCreator(Account creator) {
        this.creator = creator;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public Account[] getMembers() {
        return members;
    }

    public void setMembers(Account[] members) {
        this.members = members;
    }

}