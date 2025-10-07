public class Student {
    private int id;
    private String name;
    private static String college;
    private static float moneyGroup;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Question 4
    public static String getCollege() {
        return college;
    }

    public static void setCollege(String college) {
        Student.college = college;
    }

    public static float getMoneyGroup() {
        return moneyGroup;
    }

    public static void setMoneyGroup(float moneyGroup) {
        Student.moneyGroup = moneyGroup;
    }

    public void contributeMoney(float amount) {
        moneyGroup += amount;
        System.out.println("Quỹ hiện tại: " + moneyGroup + "k\n");
    }

    public void spendMoney(float amount, String reason) {
        moneyGroup -= amount;
        System.out.println(name + " rút " + amount + "k để " + reason);
        System.out.println("Quỹ hiện tại: " + moneyGroup + "k\n");
    }
}
