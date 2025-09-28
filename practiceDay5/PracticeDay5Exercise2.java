package practiceDay5;

public class PracticeDay5Exercise2 {

    interface IStudent {
        void diemDanh();

        void hocBai();

        void diDonVeSinh();
    }

    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = new Student(1, "Nguyễn Văn A", 1);
        students[1] = new Student(2, "Nguyễn Văn B", 1);
        students[2] = new Student(3, "Nguyễn Văn C", 1);
        students[3] = new Student(4, "Nguyễn Văn D", 2);
        students[4] = new Student(5, "Nguyễn Văn E", 2);
        students[5] = new Student(6, "Nguyễn Văn F", 2);
        students[6] = new Student(7, "Nguyễn Văn G", 3);
        students[7] = new Student(8, "Nguyễn Văn H", 3);
        students[8] = new Student(9, "Nguyễn Văn I", 3);
        students[9] = new Student(10, "Nguyễn Văn K", 3);

        System.out.println("Điểm danh cả lớp:");
        for (Student student : students) {
            student.diemDanh();
        }

        System.out.println("\nNhóm 1 đi học bài:");
        for (Student student : students) {
            if (student.getGroup() == 1) {
                student.hocBai();
            }
        }

        System.out.println("\nNhóm 2 đi dọn vệ sinh:");
        for (Student student : students) {
            if (student.getGroup() == 2) {
                student.diDonVeSinh();
            }
        }
    }
}