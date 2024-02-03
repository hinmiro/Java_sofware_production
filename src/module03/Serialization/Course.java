package module03.Serialization;

import java.io.Serializable;

public class Course implements Serializable {
    private String courseCode, courseName, instructor;

    public Course(String courseCode, String courseName, String instructor) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public String getCourseName() {
        return this.courseName;
    }
    public String getInstructor() {
        return this.instructor;
    }
    public String getCourseCode() {
        return this.courseCode;
    }
}
