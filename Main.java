
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
        Department d1 = new Department();
        d1.setId(1);
        d1.setName("IT");

        Department d2 = new Department();
        d2.setId(2);
        d2.setName("HR");

        Department d3 = new Department();
        d3.setId(3);
        d3.setName("EDU");

        // === Position ===
        Position p1 = new Position();
        p1.setId(1);
        p1.setName(PositionEnum.DEV);

        Position p2 = new Position();
        p2.setId(2);
        p2.setName(PositionEnum.TEST);

        Position p3 = new Position();
        p3.setId(3);
        p3.setName(PositionEnum.SCRUM);

        // === Account ===
        Account a1 = new Account();
        a1.setId(1);
        a1.setUsername("nhat");
        a1.setEmail("nhat@mail.com");
        a1.setFullname("Nhat Nguyen");
        a1.setDepartment(d1);
        a1.setPosition(p1);
        a1.setCreatedDate(LocalDate.now());

        Account a2 = new Account();
        a2.setId(2);
        a2.setUsername("na");
        a2.setEmail("na@mail.com");
        a2.setFullname("Na Nguyen");
        a2.setDepartment(d2);
        a2.setPosition(p2);
        a2.setCreatedDate(LocalDate.now());

        Account a3 = new Account();
        a3.setId(3);
        a3.setUsername("quyen");
        a3.setEmail("quyen@mail.com");
        a3.setFullname("Quyen Nguyen");
        a3.setDepartment(d3);
        a3.setPosition(p3);
        a3.setCreatedDate(LocalDate.now());

        // === CategoryQuestion ===
        CategoryQuestion cq1 = new CategoryQuestion();
        cq1.setId(1);
        cq1.setName("Java");

        CategoryQuestion cq2 = new CategoryQuestion();
        cq2.setId(2);
        cq2.setName("SQL");

        CategoryQuestion cq3 = new CategoryQuestion();
        cq3.setId(3);
        cq3.setName("DevOps");

        // === TypeQuestion ===
        TypeQuestion tq1 = new TypeQuestion();
        tq1.setId(1);
        tq1.setName(QuestionType.ESSAY);

        TypeQuestion tq2 = new TypeQuestion();
        tq2.setId(2);
        tq2.setName(QuestionType.MULTIPLE_CHOICE);

        TypeQuestion tq3 = new TypeQuestion();
        tq3.setId(3);
        tq3.setName(QuestionType.MULTIPLE_CHOICE);

        // === Question ===
        Question q1 = new Question();
        q1.setId(1);
        q1.setContent("OOP la gi?");
        q1.setCreatedAt(LocalDate.now());
        q1.setCategory(cq1);
        q1.setType(tq1);
        q1.setCreator(a1);

        Question q2 = new Question();
        q2.setId(2);
        q2.setContent("Sub query la gi?");
        q2.setCreatedAt(LocalDate.now());
        q2.setCategory(cq2);
        q2.setType(tq2);
        q2.setCreator(a2);

        Question q3 = new Question();
        q3.setId(3);
        q3.setContent("Gioi thieu ve CI/CD.");
        q3.setCreatedAt(LocalDate.now());
        q3.setCategory(cq3);
        q3.setType(tq1);
        q3.setCreator(a3);

        // === Answer ===
        Answer ans1 = new Answer();
        ans1.setId(1);
        ans1.setContent("Object-Oriented Programming");
        ans1.setCorrect(true);
        ans1.setQuestion(q1);

        Answer ans2 = new Answer();
        ans2.setId(2);
        ans2.setContent("La cau truy van con cua mot cau truy van");
        ans2.setCorrect(true);
        ans2.setQuestion(q2);

        Answer ans3 = new Answer();
        ans3.setId(3);
        ans3.setContent("Continuous Integration vs Continuous Deployment");
        ans3.setCorrect(true);
        ans3.setQuestion(q3);

        // === Exam ===
        Exam e1 = new Exam();
        e1.setId(1);
        e1.setCode("EX001");
        e1.setTitle("Java Basics");
        e1.setDuration(60);
        e1.setCreatedAt(LocalDate.now());
        e1.setCategory(cq1);
        e1.setCreator(a1);

        Exam e2 = new Exam();
        e2.setId(2);
        e2.setCode("EX002");
        e2.setTitle("SQL Advanced");
        e2.setDuration(90);
        e2.setCreatedAt(LocalDate.now());
        e2.setCategory(cq2);
        e2.setCreator(a2);

        Exam e3 = new Exam();
        e3.setId(3);
        e3.setCode("EX003");
        e3.setTitle("DevOps Practice");
        e3.setDuration(120);
        e3.setCreatedAt(LocalDate.now());
        e3.setCategory(cq3);
        e3.setCreator(a3);

        // === Group ===
        Group g1 = new Group();
        g1.setId(1);
        g1.setName("Backend Team");
        g1.setCreator(a1);
        g1.setCreatedAt(LocalDate.now());
        g1.setMembers(new Account[] { a1, a2 });

        Group g2 = new Group();
        g2.setId(2);
        g2.setName("Frontend Team");
        g2.setCreator(a2);
        g2.setCreatedAt(LocalDate.now());
        g2.setMembers(new Account[] { a2, a3 });

        Group g3 = new Group();
        g3.setId(3);
        g3.setName("DevOps Team");
        g3.setCreator(a3);
        g3.setCreatedAt(LocalDate.now());
        g3.setMembers(new Account[] { a1, a3 });

        // === GroupAccount ===
        GroupAccount ga1 = new GroupAccount();
        ga1.setGroup(g1);
        ga1.setAccount(a1);
        ga1.setJoinDate(LocalDate.now());

        GroupAccount ga2 = new GroupAccount();
        ga2.setGroup(g2);
        ga2.setAccount(a2);
        ga2.setJoinDate(LocalDate.now());

        GroupAccount ga3 = new GroupAccount();
        ga3.setGroup(g3);
        ga3.setAccount(a3);
        ga3.setJoinDate(LocalDate.now());

        // Print
        System.out.println("=======================================");
        System.out.println(a1.getFullname() + " - " + a1.getDepartment().getName());
        System.out.println(a2.getFullname() + " - " + a2.getDepartment().getName());
        System.out.println(a3.getFullname() + " - " + a3.getDepartment().getName());
    }
}