package entity;

public class Position {
    // Constructor with all fields
    public Position(int id, PositionEnum name) {
        this.id = id;
        this.name = name;
    }
    public int id;
    private PositionEnum name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PositionEnum getName() {
        return name;
    }

    public void setName(PositionEnum name) {
        this.name = name;
    }

}
