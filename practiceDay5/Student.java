package practiceDay5;

import java.util.ArrayList;
import java.util.List;

import practiceDay5.PracticeDay5Exercise2.IStudent;

public class Student implements IStudent, Enrollable {
    private int id;
    private String name;
    private int group;
    private List<String> enrollCourse;
    private float gpa;

    public List<String> getEnrollCourse() {
        return enrollCourse;
    }

    public void setEnrollCourse(List<String> enrollCourse) {
        this.enrollCourse = enrollCourse;
    }

    public Student(int id, String name, int group) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.enrollCourse = new ArrayList<>();
    }

    public int getGroup() {
        return group;
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

    public void setGroup(int group) {
        this.group = group;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public void hocBai() {
        System.out.println(name + " đang học bài");
    }

    @Override
    public void diDonVeSinh() {
        System.out.println(name + " đi dọn vệ sinh");
    }

    @Override
    public void diemDanh() {
        System.out.println(name + " điểm danh");
    }

    @Override
    public void enrolCourse(String courseName) {
        if (courseName == null || courseName == "") {
            System.out.println("Ten khoa hoc khong hop le.");
        }
        enrollCourse.add(courseName);
        System.out.println(name + " đã đăng ký khóa học: " + courseName);
    }

    @Override
    public List<String> getEnrollCourses() {
        return this.getEnrollCourse();
    }

}
