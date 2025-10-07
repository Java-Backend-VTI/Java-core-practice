import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Question 1
        Student.setCollege("Đại Học Bách Khoa");
        Student st1 = new Student(1, "Nguyễn Văn A");
        Student st2 = new Student(2, "Nguyễn Văn B");
        Student st3 = new Student(3, "Nguyễn Văn C");
        Student.setCollege("Đại Học Công Nghệ");

        Student[] sts = { st1, st2, st3 };
        for (Student student : sts) {
            System.out.println(student.getName() + Student.getCollege());
        }

        // Question 2
        System.out.println("B1: Cả nhóm nộp quỹ, mỗi người 100k");
        for (Student student : sts) {
            student.contributeMoney(100);
        }

        System.out.println("B2:");
        st1.spendMoney(50, "mua bim bim, kẹo liên hoan");
        System.out.println("B3:");
        st2.spendMoney(20, "mua bánh mì");
        System.out.println("B4:");
        st3.spendMoney(150, "mua đồ dùng học tập");

        System.out.println("B5: Cả nhóm đóng thêm mỗi người 50k");
        st1.contributeMoney(50);
        st2.contributeMoney(50);
        st3.contributeMoney(50);

        System.out.println("Số tiền còn lại: " + Student.getMoneyGroup() + "k");

        // Question 3
        int a = 10, b = 20;

        System.out.println(MyMath.sum(a, b));
        System.out.println(MyMath.min(a, b));

        // Files and folder
        File folder = new File("/home/nhat/Documents/Coding/learning-java/java-hi-mom/practiceDay8/FolderTest");
        folder.mkdir();

        File file = new File(
                "/home/nhat/Documents/Coding/learning-java/java-hi-mom/practiceDay8/FolderTest/ExampleFile.java");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file.getName());

        File[] list = folder.listFiles();
        for (File f : list) {
            System.out.println(f.getName());
        }
    }
}
