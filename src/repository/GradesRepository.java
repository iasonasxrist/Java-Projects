package repository;
import model.courses.Courses;
import model.grades.GradePerCourse;
import model.people.Person;
import semester.Semester;

import java.util.*;
import java.util.HashMap;
public class GradesRepository {
    HashMap <Integer, List<GradePerCourse>> gradersPerStudent = new HashMap <>();
    public void GradesRepository(){

    }

    public void add(Integer AM, Courses course, Person student, float grade ){

        if (gradersPerStudent.containsKey(AM)){
            List<GradePerCourse> listOfGrades = gradersPerStudent.get(AM);
            for (GradePerCourse course_entry : listOfGrades) {
                if (course_entry.getCourse().getCourseId() == course.getCourseId()) {
                    course_entry.setGrade(grade);
                    return;
                }
            }
        }
        gradersPerStudent.put( AM , new ArrayList<> ());
        gradersPerStudent.get(AM).add( new GradePerCourse(course, grade, student));
    }

    public void print (){
        for (Map.Entry<Integer, List<GradePerCourse>> gradPerStudent : gradersPerStudent.entrySet()){
            System.out.println(gradPerStudent.getKey() + " " + gradPerStudent.getValue());
        }
    }

    public void checkStudentStatus (Integer AM, SubscriptionsRepositoryImpl subscriptionsRepository, float threshold){
        List<Courses> subscribedCourses = subscriptionsRepository.getAllSubscribedCoursesByAM(AM);
        List<GradePerCourse> coursesWithGrade = gradersPerStudent.get(AM);

        for (Courses course :subscribedCourses){
            boolean found = false;
            for (GradePerCourse gradePerCourse : coursesWithGrade){
                if (gradePerCourse.getCourse().getCourseId() == course.getCourseId() && gradePerCourse.getGrade() < threshold){
                    System.out.println("Course " + course.getCourseName() + " has grade lower than " + threshold);
                    return;
                }else if (gradePerCourse.getCourse().getCourseId() == course.getCourseId()){
                    found = true;
                    break;
                }
            }
            if (!found){
                System.out.println("Course " + course.getCourseName() + " has no declared grade");
                return;
            }
        }
        System.out.println("Student with AM: " + AM + " has passed all the subscribed courses");
    }
}
