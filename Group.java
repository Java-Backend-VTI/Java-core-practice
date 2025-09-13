import java.time.LocalDate;

public class Group {
    int id;
    String name;
    Account creator;
    LocalDate createdAt;
    Account[] members;
}