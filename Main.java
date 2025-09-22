
import java.time.LocalDate;

import entity.Account;
import entity.Answer;
import entity.CategoryQuestion;
import entity.Department;
import entity.Exam;
import entity.Group;
import entity.GroupAccount;
import entity.Position;
import entity.PositionEnum;
import entity.Question;
import entity.QuestionType;
import entity.TypeQuestion;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi-mom!\nHow do u feel today");

        // === Department ===
        Department d1 = new Department(1, "IT");

        Department d2 = new Department(2, "HR");

        Department d3 = new Department(3, "EDU");

        // === Position ===
        Position p1 = new Position(1, PositionEnum.DEV);

        Position p2 = new Position(2, PositionEnum.TEST);

        Position p3 = new Position(3, PositionEnum.SCRUM);

        // === Account ===
        Account a1 = new Account(1, "nhat@mail.com", "nhat", "Nhat Nguyen", LocalDate.now(), d1, p1);

        Account a2 = new Account(2, "na@mail.com", "na", "Na Nguyen", LocalDate.now(), d2, p2);

        Account a3 = new Account(3, "quyen@mail.com", "quyen", "Quyen Nguyen", LocalDate.now(), d3, p3);

        // === CategoryQuestion ===
        CategoryQuestion cq1 = new CategoryQuestion(1, "Java");

        CategoryQuestion cq2 = new CategoryQuestion(2, "SQL");

        CategoryQuestion cq3 = new CategoryQuestion(3, "DevOps");

        // === TypeQuestion ===
        TypeQuestion tq1 = new TypeQuestion(1, QuestionType.ESSAY);

        TypeQuestion tq2 = new TypeQuestion(2, QuestionType.MULTIPLE_CHOICE);

        TypeQuestion tq3 = new TypeQuestion(3, QuestionType.MULTIPLE_CHOICE);

        // === Question ===
        Question q1 = new Question(1, "OOP la gi?", cq1, tq1, a1, LocalDate.now());

        Question q2 = new Question(2, "Sub query la gi?", cq2, tq2, a2, LocalDate.now());

        Question q3 = new Question(3, "Gioi thieu ve CI/CD.", cq3, tq1, a3, LocalDate.now());

        // === Answer ===
        Answer ans1 = new Answer(1, "Object-Oriented Programming", q1, true);

        Answer ans2 = new Answer(2, "La cau truy van con cua mot cau truy van", q2, true);

        Answer ans3 = new Answer(3, "Continuous Integration vs Continuous Deployment", q3, true);

        // === Exam ===
        Exam e1 = new Exam(1, "EX001", "Java Basics", cq1, 60, a1, LocalDate.now());

        Exam e2 = new Exam(2, "EX002", "SQL Advanced", cq2, 90, a2, LocalDate.now());

        Exam e3 = new Exam(3, "EX003", "DevOps Practice", cq3, 120, a3, LocalDate.now());

        // === Group ===
        Group g1 = new Group(1, "Backend Team", a1, LocalDate.now(), new Account[] { a1, a2 });

        Group g2 = new Group(2, "Frontend Team", a2, LocalDate.now(), new Account[] { a2, a3 });

        Group g3 = new Group(3, "DevOps Team", a3, LocalDate.now(), new Account[] { a1, a3 });

        // === GroupAccount ===
        GroupAccount ga1 = new GroupAccount(g1, a1, LocalDate.now());

        GroupAccount ga2 = new GroupAccount(g2, a2, LocalDate.now());

        GroupAccount ga3 = new GroupAccount(g3, a3, LocalDate.now());

        // Print
        System.out.println("=======================================");
        System.out.println(a1.getFullname() + " - " + a1.getDepartment().getName());
        System.out.println(a2.getFullname() + " - " + a2.getDepartment().getName());
        System.out.println(a3.getFullname() + " - " + a3.getDepartment().getName());
    }
}