import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi-mom!\nHow do u feel today");

        // === Department ===
        Department d1 = new Department();
        d1.id = 1;
        d1.name = "IT";

        Department d2 = new Department();
        d2.id = 2;
        d2.name = "HR";

        Department d3 = new Department();
        d3.id = 3;
        d3.name = "EDU";

        // === Position ===
        Position p1 = new Position();
        p1.id = 1;
        p1.name = PositionEnum.DEV;

        Position p2 = new Position();
        p2.id = 2;
        p2.name = PositionEnum.TEST;

        Position p3 = new Position();
        p3.id = 3;
        p3.name = PositionEnum.SCRUM;

        // === Account ===
        Account a1 = new Account();
        a1.id = 1;
        a1.username = "nhat";
        a1.email = "nhat@mail.com";
        a1.fullname = "Nhat Nguyen";
        a1.department = d1;
        a1.position = p1;
        a1.createdDate = LocalDate.now();

        Account a2 = new Account();
        a2.id = 2;
        a2.username = "na";
        a2.email = "na@mail.com";
        a2.fullname = "Na Nguyen";
        a2.department = d2;
        a2.position = p2;
        a2.createdDate = LocalDate.now();

        Account a3 = new Account();
        a3.id = 3;
        a3.username = "quyen";
        a3.email = "quyen@mail.com";
        a3.fullname = "Quyen Nguyen";
        a3.department = d3;
        a3.position = p3;
        a3.createdDate = LocalDate.now();

        // === CategoryQuestion ===
        CategoryQuestion cq1 = new CategoryQuestion();
        cq1.id = 1;
        cq1.name = "Java";

        CategoryQuestion cq2 = new CategoryQuestion();
        cq2.id = 2;
        cq2.name = "SQL";

        CategoryQuestion cq3 = new CategoryQuestion();
        cq3.id = 3;
        cq3.name = "DevOps";

        // === TypeQuestion ===
        TypeQuestion tq1 = new TypeQuestion();
        tq1.id = 1;
        tq1.name = QuestionType.ESSAY;

        TypeQuestion tq2 = new TypeQuestion();
        tq2.id = 2;
        tq2.name = QuestionType.MULTIPLE_CHOICE;

        TypeQuestion tq3 = new TypeQuestion();
        tq3.id = 3;
        tq3.name = QuestionType.MULTIPLE_CHOICE;

        // === Question ===
        Question q1 = new Question();
        q1.id = 1L;
        q1.content = "OOP la gi?";
        q1.createdAt = LocalDate.now();
        q1.category = cq1;
        q1.type = tq1;
        q1.creator = a1;

        Question q2 = new Question();
        q2.id = 2L;
        q2.content = "Sub query la gi?";
        q2.createdAt = LocalDate.now();
        q2.category = cq2;
        q2.type = tq2;
        q2.creator = a2;

        Question q3 = new Question();
        q3.id = 3L;
        q3.content = "Gioi thieu ve CI/CD.";
        q3.createdAt = LocalDate.now();
        q3.category = cq3;
        q3.type = tq1;
        q3.creator = a3;

        // === Answer ===
        Answer ans1 = new Answer();
        ans1.id = 1;
        ans1.content = "Object-Oriented Programming";
        ans1.isCorrect = true;
        ans1.question = q1;

        Answer ans2 = new Answer();
        ans2.id = 2;
        ans2.content = "La cau truy van con cua mot cau truy van";
        ans2.isCorrect = true;
        ans2.question = q2;

        Answer ans3 = new Answer();
        ans3.id = 3;
        ans3.content = "Continuous Integration vs Continuous Deployment";
        ans3.isCorrect = true;
        ans3.question = q3;

        // === Exam ===
        Exam e1 = new Exam();
        e1.id = 1;
        e1.code = "EX001";
        e1.title = "Java Basics";
        e1.duration = 60;
        e1.createdAt = LocalDate.now();
        e1.category = cq1;
        e1.creator = a1;

        Exam e2 = new Exam();
        e2.id = 2;
        e2.code = "EX002";
        e2.title = "SQL Advanced";
        e2.duration = 90;
        e2.createdAt = LocalDate.now();
        e2.category = cq2;
        e2.creator = a2;

        Exam e3 = new Exam();
        e3.id = 3;
        e3.code = "EX003";
        e3.title = "DevOps Practice";
        e3.duration = 120;
        e3.createdAt = LocalDate.now();
        e3.category = cq3;
        e3.creator = a3;

        // === Group ===
        Group g1 = new Group();
        g1.id = 1;
        g1.name = "Backend Team";
        g1.creator = a1;
        g1.createdAt = LocalDate.now();
        g1.members = new Account[] { a1, a2 };

        Group g2 = new Group();
        g2.id = 2;
        g2.name = "Frontend Team";
        g2.creator = a2;
        g2.createdAt = LocalDate.now();
        g2.members = new Account[] { a2, a3 };

        Group g3 = new Group();
        g3.id = 3;
        g3.name = "DevOps Team";
        g3.creator = a3;
        g3.createdAt = LocalDate.now();
        g3.members = new Account[] { a1, a3 };

        // === GroupAccount ===
        GroupAccount ga1 = new GroupAccount();
        ga1.group = g1;
        ga1.account = a1;
        ga1.joinDate = LocalDate.now();

        GroupAccount ga2 = new GroupAccount();
        ga2.group = g2;
        ga2.account = a2;
        ga2.joinDate = LocalDate.now();

        GroupAccount ga3 = new GroupAccount();
        ga3.group = g3;
        ga3.account = a3;
        ga3.joinDate = LocalDate.now();

        // Print
        System.out.println("=======================================");
        System.out.println(a1.fullname + " - " + a1.department.name);
        System.out.println(a2.fullname + " - " + a2.department.name);
        System.out.println(a3.fullname + " - " + a3.department.name);
    }
}