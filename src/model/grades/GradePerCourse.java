package model.grades;

import model.courses.Courses;
import model.people.Person;

public class GradePerCourse {

    private Courses course;

    private float grade;

    private Person student;

    public GradePerCourse(Courses course, float grade, Person student) {
        this.course = course;
        this.grade = grade;
        this.student = student;
    }

    public Courses getCourse() {
        return course;
    }

    public void setCourse(Courses course) {
        this.course = course;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "GradePerCourse{" +
                "course=" + course +
                ", grade=" + grade +
                ", student=" + student +
                '}';
    }
}
