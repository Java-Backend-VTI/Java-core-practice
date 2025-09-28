package practiceDay5;

import java.util.List;

public interface Enrollable {
    void enrolCourse(String courseName);

    List<String> getEnrollCourses();
}
