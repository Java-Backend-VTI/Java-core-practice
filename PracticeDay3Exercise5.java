import entity.Department;

public class PracticeDay3Exercise5 {

    public static void main(String[] args) {
        Department d1 = new Department();
        d1.id = 1;
        d1.setName("IT");

        Department d2 = new Department();
        d2.id = 2;
        d2.setName("HR");

        System.out.println(d1.toString());
        System.out.println(d1.equals(d2));
    }
}