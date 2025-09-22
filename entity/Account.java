package entity;

import java.time.LocalDate;

public class Account {
    // Constructor with all fields
    public Account(int id, String email, String username, String fullname, LocalDate createdDate, Department department, Position position) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.fullname = fullname;
        this.createdDate = createdDate;
        this.department = department;
        this.position = position;
    }

    // Constructor with id, email, username
    public Account(int id, String email, String username) {
        this.id = id;
        this.email = email;
        this.username = username;
    }
    private int id;
    private String email;
    private String username;
    private String fullname;
    private LocalDate createdDate;
    private Department department;
    private Position position;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

}
