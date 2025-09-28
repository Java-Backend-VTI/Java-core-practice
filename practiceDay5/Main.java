package practiceDay5;

public class Main {

    public static boolean removeStudentWithIndex(Student[] students, int index) {
        if (index < 0 || index > students.length) {
            System.out.println("Index ko hợp lệ");
            return false;
        }

        if (index == students.length - 1) {
            students[students.length - 1] = null;
            return false;
        }

        for (int i = index; i < students.length - 1; i++) {
            students[i] = students[i + 1];
        }

        students[students.length - 1] = null;

        return true;
    }

    public static boolean removeStudentWithName(Student[] students, String name) {
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getName().equals(name)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("ko tim thay ten tuong ung");
            return false;
        }

        return removeStudentWithIndex(students, index);
    }

    public static void main(String[] args) {
        Student[] students = new Student[15];

        students[0] = new GoodStudent(1, "Nguyễn Văn A1", 1);
        students[1] = new GoodStudent(2, "Nguyễn Văn A2", 1);
        students[2] = new GoodStudent(3, "Nguyễn Văn A3", 2);
        students[3] = new GoodStudent(4, "Nguyễn Văn A4", 2);
        students[4] = new GoodStudent(5, "Nguyễn Văn A5", 3);

        students[5] = new BadStudent(6, "Nguyễn Văn B1", 1);
        students[6] = new BadStudent(7, "Nguyễn Văn B2", 1);
        students[7] = new BadStudent(8, "Nguyễn Văn B3", 2);
        students[8] = new BadStudent(9, "Nguyễn Văn B4", 2);
        students[9] = new BadStudent(10, "Nguyễn Văn B5", 3);

        students[10] = new Student(11, "Nguyễn Văn C1", 1);
        students[11] = new Student(12, "Nguyễn Văn C2", 1);
        students[12] = new Student(13, "Nguyễn Văn C3", 2);
        students[13] = new Student(14, "Nguyễn Văn C4", 2);
        students[14] = new Student(15, "Nguyễn Văn C5", 3);

        System.out.println("Điểm danh cả lớp:");
        for (Student student : students) {
            student.diemDanh();
        }

        System.out.println("In ra số phần thưởng của good student:");
        for (Student student : students) {
            if (student instanceof GoodStudent) {
                ((GoodStudent) student).getNumberOfAward();
            }
        }

        System.out.println("Thêm 5 học sinh vao mảng:");
        Student[] newStudents = new Student[20];
        for (int i = 0; i < students.length; i++) {
            newStudents[i] = students[i];
        }
        newStudents[15] = new GoodStudent(16, "Nguyễn Văn D16", 1);
        newStudents[16] = new GoodStudent(17, "Nguyễn Văn D17", 2);
        newStudents[17] = new BadStudent(18, "Nguyễn Văn D18", 1);
        newStudents[18] = new BadStudent(19, "Nguyễn Văn D19", 2);
        newStudents[19] = new BadStudent(20, "Nguyễn Văn D20", 3);

        System.out.println("\nSau khi xóa học sinh ở vị trí 5:");
        if (removeStudentWithIndex(newStudents, 5)) {
            for (Student student : newStudents) {
                if (student != null)
                    student.diemDanh();
            }
        }

        System.out.println("\nSau khi xóa học sinh với tên Nguyễn Văn B2:");
        if (removeStudentWithName(newStudents, "Nguyễn Văn B2")) {
            for (Student student : newStudents) {
                if (student != null)
                    student.diemDanh();
            }
        }

        System.out.println("In ra hiệu suất của good student:");
        for (Student student : newStudents) {
            if (student instanceof GoodStudent) {
                ((GoodStudent) student).calculatePerformanceScore();
            }
        }
    }

}
