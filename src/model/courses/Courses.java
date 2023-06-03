package model.courses;

import model.people.Teacher;
import semester.Semester;

abstract public class Courses {

    protected String courseId;
    protected String courseName;
    protected String description;

    protected Semester semester;

    protected Teacher assignedToTeacher;

    public Courses(String courseId, String courseName, String description, Semester semester, Teacher assignedToTeacher) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.description = description;
        this.semester = semester;
        this.assignedToTeacher = assignedToTeacher;
    }


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCourseId() {
        return courseId;
    }

    public Semester getSemester() {
        return semester;
    }

    public Teacher getAssignedToTeacher() {
        return assignedToTeacher;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", description='" + description + '\'' +
                ", semester=" + semester +
                ", assignedToTeacher=" + assignedToTeacher +
                '}';
    }
}
