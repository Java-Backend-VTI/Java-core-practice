import entity.Department;

public class PracticeDay3Exercise5 {

    public static void main(String[] args) {
        Department d1 = new Department(1, "IT");

        Department d2 = new Department(2, "HR");

        System.out.println(d1.toString());
        System.out.println(d1.equals(d2));
    }
}