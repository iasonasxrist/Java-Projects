package repository;

import model.courses.Courses;

import java.util.*;
import java.util.ArrayList;

public class CoursesRepositoryImpl implements CoursesRepositoryInterface{

    List<Courses> coursesList = new ArrayList<>();
    @Override
    public void add(Courses course) {
        coursesList.add(course);
    }

    @Override
    public void deleteById(String courseId) {
        for (int i = 0; i < coursesList.size(); i++){
            if (coursesList.get(i).getCourseId() == courseId){
                coursesList.remove(i);
                break;
            }
        }
    }

    @Override
    public void delete(Courses courses) {
        coursesList.remove(courses);
    }

    @Override
    public void print() {
        coursesList.stream().forEach((course)->{
            System.out.println(course);
        });
    }
}
