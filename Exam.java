import java.time.LocalDate;

public class Exam {
    int id;
    String code;
    String title;
    int duration;
    LocalDate createdAt;
    CategoryQuestion category;
    Account creator;
    Question[] questions;

}
