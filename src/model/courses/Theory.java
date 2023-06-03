package model.courses;

import model.people.Teacher;
import semester.Semester;

public class Theory extends Courses{
    public Theory(String courseId, String courseName, String description, Semester semester, Teacher assignedToTeacher) {
        super(courseId, courseName, description, semester, assignedToTeacher);
    }

    @Override
    public String toString() {
        return "Theory{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", description='" + description + '\'' +
                ", semester=" + semester +
                ", assignedToTeacher=" + assignedToTeacher +
                '}';
    }
}
