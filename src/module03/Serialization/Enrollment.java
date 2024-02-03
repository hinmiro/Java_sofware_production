package module03.Serialization;

import java.io.Serializable;
import java.util.ArrayList;

public class Enrollment implements Serializable {
    private Student student;
    private Course course;
    private String enrollmentDate;

    public Enrollment(String enrollmentDate, Student student, Course course) {
        this.enrollmentDate = enrollmentDate;
        this.student = student;
        this.course = course;
    }

    public String getDate() {
        return this.enrollmentDate;
    }
}
