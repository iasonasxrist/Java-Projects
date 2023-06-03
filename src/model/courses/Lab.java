package model.courses;

import model.people.Teacher;
import semester.Semester;

public class Lab extends  Courses{

    public Lab(String courseId, String courseName, String description, Semester semester, Teacher assignedToTeacher) {
        super(courseId, courseName, description, semester, assignedToTeacher);
    }

    @Override
    public String toString() {
        return "Lab{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", description='" + description + '\'' +
                ", semester=" + semester +
                ", assignedToTeacher=" + assignedToTeacher +
                '}';
    }
}
