import java.time.LocalDate;

public class Question {
    Long id;
    String content;
    LocalDate createdAt;
    CategoryQuestion category;
    TypeQuestion type;
    Account creator;
    Answer[] answers;
    Exam[] exams;
}